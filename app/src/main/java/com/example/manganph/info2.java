package com.example.manganph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class info2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);

        ImageView imageView = findViewById(R.id.imageget);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            int res_image = bundle.getInt("theme2");
            imageView.setImageResource(res_image);
        }
    }
}