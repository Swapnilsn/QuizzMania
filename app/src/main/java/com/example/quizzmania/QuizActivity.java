package com.example.quizzmania;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private String selectedTopicName="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        final LinearLayout java=findViewById(R.id.javaLayout);
        final LinearLayout php=findViewById(R.id.php_layout);
        final LinearLayout html=findViewById(R.id.htmlLayout);
        final LinearLayout android=findViewById(R.id.androidLayout);

        final Button startBtn=findViewById(R.id.startQuizBtn);

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="java";
                java.setBackgroundResource(R.drawable.round_back_white_stroke10);
                php.setBackgroundResource(R.drawable.round_black_white10);
                html.setBackgroundResource(R.drawable.round_black_white10);
                android.setBackgroundResource(R.drawable.round_black_white10);
            }
        });


        php.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="php";
                php.setBackgroundResource(R.drawable.round_back_white_stroke10);
                java.setBackgroundResource(R.drawable.round_black_white10);
                html.setBackgroundResource(R.drawable.round_black_white10);
                android.setBackgroundResource(R.drawable.round_black_white10);
            }
        });

        html.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="html";
                html.setBackgroundResource(R.drawable.round_back_white_stroke10);
                java.setBackgroundResource(R.drawable.round_black_white10);
                php.setBackgroundResource(R.drawable.round_black_white10);
                android.setBackgroundResource(R.drawable.round_black_white10);
            }
        });

        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectedTopicName="android";
                android.setBackgroundResource(R.drawable.round_back_white_stroke10);
                java.setBackgroundResource(R.drawable.round_black_white10);
                php.setBackgroundResource(R.drawable.round_black_white10);
                html.setBackgroundResource(R.drawable.round_black_white10);
            }
        });

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selectedTopicName.isEmpty())
                {
                    Toast.makeText(QuizActivity.this, "Please Select the Topic", Toast.LENGTH_SHORT).show();
                }

                else{
                    Intent  intent=new Intent(QuizActivity.this,QuizActivity1.class);
                    intent.putExtra("selectedTopic",selectedTopicName);
                    startActivity(intent);
                }
            }
        });
    }
}