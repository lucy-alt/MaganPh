package com.example.manganph;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    DBHelper db;
    EditText username, password, repassword;
    Button Register;
    TextView login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        db = new DBHelper(this);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        repassword = findViewById(R.id.password2);
        Register = findViewById(R.id.register);
        login = findViewById(R.id.loginview);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginview = new Intent(signup.this,Login.class);
                startActivity(loginview);

            }
        });

        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkCredentials();
            }
        });

        checkCredentials();
    }

    private void checkCredentials() {
        String user=username.getText().toString();
        String pass=password.getText().toString();
        String repass=repassword.getText().toString();

        if (user.isEmpty())
        {
            showError(username, "your username is not valid!");
        }
        else if (pass.isEmpty())
        {
            showError(password,"Password must be 7 characters");
        }
        else if (repass.isEmpty() || !repass.equals(pass))
        {
            showError(repassword, "Password not match!");
        }
        else
        {
            Toast.makeText(this, "Registered Succesfully",Toast.LENGTH_SHORT).show();
        }

    }

    private void showError(EditText input, String s) {
        input.setError(s);
        input.requestFocus();
    }
}