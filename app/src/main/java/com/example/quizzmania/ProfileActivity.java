package com.example.quizzmania;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileActivity extends AppCompatActivity {

     private FirebaseUser user;
     private DatabaseReference reference;
     private String  userID;
    // private ImageView start;
     private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        mAuth= FirebaseAuth.getInstance();

       // ImageView logout=findViewById(R.id.signoutBTN);

        ImageView  start = findViewById(R.id.start);

      start.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              startActivity(new Intent(ProfileActivity.this,QuizActivity.class));
          }
      });


       /* logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirebaseAuth.getInstance().signOut();
                startActivity(new Intent(ProfileActivity.this,Login.class));
            }
        });*/

        user=FirebaseAuth.getInstance().getCurrentUser();
        reference= FirebaseDatabase.getInstance().getReference("Users");

        userID=user.getUid();

        final TextView greetingTextView=findViewById(R.id.greeting);

        // final TextView fullNameTextView=findViewById(R.id.fullName);
        //final TextView emailTextView=findViewById(R.id.emailAddress);
        // final TextView mobileNoTextView=findViewById(R.id.mobileNo);


        reference.child(userID).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                User userProfile=snapshot.getValue(User.class);
                if(userProfile!=null){
                    String fullName=userProfile.FullName;
                    //  String email=userProfile.email;
                    //  String mobileNo=userProfile.mobileNo;

                    greetingTextView.setText("Welcome,"+ fullName+ "!");

                    // fullNameTextView.setText(fullName);
                    //  emailTextView.setText(email);
                    //  mobileNoTextView.setText(mobileNo);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

                Toast.makeText(ProfileActivity.this, "Something Wrong Happened!", Toast.LENGTH_SHORT).show();
            }
        });


    }
}