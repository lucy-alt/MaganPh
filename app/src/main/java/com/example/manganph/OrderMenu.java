package com.example.manganph;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class OrderMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_menu);

        ImageView imageView = findViewById(R.id.imageget);

        Bundle bundle = getIntent().getExtras();
        if (bundle!=null)
        {
            int res_image = bundle.getInt("Sample1");
            imageView.setImageResource(res_image);
        }

    }
}