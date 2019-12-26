package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView emailTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String email = getIntent().getExtras().getString("email");

        emailTv = findViewById(R.id.emailTv);
        emailTv.setText(email);
    }
}
