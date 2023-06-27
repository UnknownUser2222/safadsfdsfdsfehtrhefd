package com.techstudios.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 Button btn;
 TextView txtQuestion;
 EditText ansGiven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QA_Class arr[] = new QA_Class[5];
        arr[0] = new QA_Class("What is the capital of Pakistan?","islamabad");
        arr[1] = new QA_Class("When did the Titanic sink?","1912");
        arr[2] = new QA_Class("When did Russia gain independence?","1991");
        arr[3] = new QA_Class("When did Roblox launch?","2006");
        arr[4] = new QA_Class("When did Queen Elizabeth II die?", "2022");
        Random rng = new Random();

        boolean First = true;
        btn = (Button) findViewById(R.id.button);
        txtQuestion = (TextView) findViewById(R.id.textView);
        ansGiven = (EditText) findViewById(R.id.editTextText);
        int initialValue = 1;
        txtQuestion.setText(arr[initialValue-1].ques);
        String ans = arr[initialValue-1].ans;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (First){
                    First = false;
                    if (ansGiven.getText().toString().toLowerCase().equals(ans)) {
                        Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Wrong.", Toast.LENGTH_SHORT).show();
                    }
                } else  {
                    int ChosenQA = rng.nextInt(5-1)+0;
                    //later
                }
            }
        });

    }
}