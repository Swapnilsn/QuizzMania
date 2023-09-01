package com.example.quizzmania;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
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
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity implements View.OnClickListener{
    private EditText FullNameET,emailET,mobileET,passwordET;
    private ProgressBar progressBar;
    private FirebaseAuth mAuth;
    private TextView signinET;
    private Button registerUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        FullNameET=findViewById(R.id.FullNameET);
        emailET=findViewById(R.id.emailET);
        mobileET=findViewById(R.id.mobileET);
        passwordET=findViewById(R.id.passwordET);
        registerUser=findViewById(R.id.registerUser);

        mAuth= FirebaseAuth.getInstance();

        registerUser.setOnClickListener(this);
        signinET=findViewById(R.id.SigninET);

        signinET.setOnClickListener(this);


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onClick(View view) {
    switch (view.getId()){
        case R.id.registerUser:
            registerUser();

        case R.id.SigninET:
          //  startActivity(new Intent(this,Login.class));
            break;


    }

    }



    private void registerUser() {
        String email = emailET.getText().toString().trim();
        String FullName = FullNameET.getText().toString().trim();
        String mobileNo = mobileET.getText().toString().trim();
        String password = passwordET.getText().toString().trim();

        /*if(FullName.isEmpty()){
            FullNameET.setError("Full Name is Required");
            FullNameET.requestFocus();
            return;
        }*/

        if((FullName.isEmpty()) && (FullName.matches("[0-9]+"))){
            FullNameET.setError("add only alpahbets");
            FullNameET.requestFocus();
            return;
        }

        if(email.isEmpty()){
            emailET.setError("Email is Required");
            emailET.requestFocus();
            return;
        }
        if(mobileNo.isEmpty() && mobileNo.length()<10 &&  mobileNo.length()>10) {
            mobileET.setError("Mobile Number is Required and length should be only 10");
            mobileET.requestFocus();
            return;
        }
        if(password.isEmpty()){
            passwordET.setError("password is Required");
            passwordET.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            emailET.setError("Please Provide Valid Email");
            emailET.requestFocus();
            return;
        }

        if(password.length()<6){
            passwordET.setError("Min Password Length should be 6 characters..");
            passwordET.requestFocus();
            return;
        }

       // progressBar.setVisibility(View.VISIBLE);

        Task<AuthResult> users;
        users = mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            User user = new User(FullName,email,mobileNo);
                            FirebaseDatabase.getInstance().getReference("Users")
                                    .child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                                    .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                                        @Override
                                        public void onComplete(@NonNull Task<Void> task) {
                                        if(task.isSuccessful()){

                                           FirebaseUser user = mAuth.getCurrentUser();
                                          // updateUI(user);
                                          Toast.makeText(SignUp.this, "User Registered Succefully...", Toast.LENGTH_LONG).show();
                                               finish();
                                          //startActivity(new Intent(SignUp.this,Login.class));
                                            // progressBar.setVisibility(View.VISIBLE);
                                        }
                                        else{
                                            Toast.makeText(SignUp.this, "User Registered Failed...", Toast.LENGTH_LONG).show();
                                           // progressBar.setVisibility(View.GONE);
                                            finish();
                                        }
                                        }
                                    });
                        }
                       /* else{
                            Toast.makeText(SignUp.this, "User Registered Failed...", Toast.LENGTH_SHORT).show();
                            //progressBar.setVisibility(View.GONE);
                        }*/
                    }
                });

       /* mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        FirebaseUser user = mAuth.getCurrentUser();
                        Toast.makeText(SignUp.this, "Success", Toast.LENGTH_SHORT).show();
                        //finish();
                    } else {
                        Toast.makeText(SignUp.this, task.getException().getMessage().toString(), Toast.LENGTH_SHORT).show();
                    }
                });*/
    }
}