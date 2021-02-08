package com.example.manganph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gallery1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery1);

        Button mybtn1 = findViewById(R.id.btn1);
        mybtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),option1.class);
                startActivity(intent);
            }
        });
        Button mybtn2 = findViewById(R.id.btn2);
        mybtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Pinktheme.class);
                startActivity(intent);
            }
        });
        Button mybtn3 = findViewById(R.id.btn3);
        mybtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),redroses.class);
                startActivity(intent);
            }
        });
    }
}