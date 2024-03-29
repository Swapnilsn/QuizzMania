package com.example.quizzmania;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewBtn=findViewById(R.id.startNewQuizBtn);

        final TextView correctAnswers=findViewById(R.id.correctAnswers);

       // final TextView incorrectAnswers=findViewById(R.id.incorrectAnswers);

        final int getCorrectAnswers=getIntent().getIntExtra("correct",0);
       // final int getIncorrectAnswers=getIntent().getIntExtra("incorrect",0);

        correctAnswers.setText((getCorrectAnswers+"/"+"10"));
     //  incorrectAnswers.setText(String.valueOf(getIncorrectAnswers));

        startNewBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this,QuizActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
      //  super.onBackPressed();
        startActivity(new Intent(QuizResults.this,QuizActivity.class));
        finish();
    }


}