package com.example.manganph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation topanim, botanim;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topanim = AnimationUtils.loadAnimation(this, R.anim.top_anim);
        botanim = AnimationUtils.loadAnimation(this, R.anim.bot_anim);


        textView = findViewById(R.id.textView);

        textView.setAnimation(topanim);

        Button mybutton = findViewById(R.id.btnlog);
        mybutton.setAnimation(botanim);
        mybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });
    }
}