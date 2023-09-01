package com.example.quizzmania;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity implements View.OnClickListener {

private TextView register,forgotpassword;
private EditText emailET,passwordET;
private Button signin_btn;
//private ProgressBar progressBar;

private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

      register=findViewById(R.id.register);
      register.setOnClickListener(this);

      signin_btn=findViewById(R.id. signin_btn);
      signin_btn.setOnClickListener(this);

      emailET=findViewById(R.id.emailET);
      passwordET=findViewById(R.id.passwordET);
      //   progressBar=findViewById(R.id.progressBar);

        mAuth= FirebaseAuth.getInstance();

        forgotpassword=findViewById(R.id.forgotPasswordBtn);
        forgotpassword.setOnClickListener(this);
    }

    @Override
    public void onBackPressed() {
      //  super.onBackPressed();
    }

    @Override
    public void onClick(View view) {
     switch (view.getId())
        {
            case R.id.register:
                startActivity(new Intent(this,SignUp.class));
                break;

            case R.id.signin_btn:
                userLogin();
                break;

            case R.id.forgotPasswordBtn:
                startActivity(new Intent(this,ForgotPassword.class));
                break;
        }
    }

    private void userLogin() {
        String email=emailET.getText().toString().trim();
        String password=passwordET.getText().toString().trim();

        if(email.isEmpty()){
            emailET.setError("Email is Required");
            emailET.requestFocus();
            return;
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailET.setError("Please Provide Valid Email");
            emailET.requestFocus();
            return;
        }

        if(password.isEmpty()){
            passwordET.setError("Password is Required..");
            passwordET.requestFocus();
            return;
        }

        if(password.length()<6){
            passwordET.setError("Min Password Length should be 6 characters..");
            passwordET.requestFocus();
            return;
        }

        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful())
                {
                    FirebaseUser user=FirebaseAuth.getInstance().getCurrentUser();

                    if(user.isEmailVerified())
                    {
                        startActivity(new Intent(Login.this,ProfileActivity.class));
                        Log.d(TAG, "signInWithEmail:success");
                    }
                    else{
                        user.sendEmailVerification();
                        Toast.makeText(Login.this,"Check Your Email to Verify Your Account!",Toast.LENGTH_SHORT).show();
                        finish();

                    }

                }
                else{
                    Toast.makeText(Login.this,"Failed to Login",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}