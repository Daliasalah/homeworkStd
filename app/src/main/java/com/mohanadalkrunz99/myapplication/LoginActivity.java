package com.mohanadalkrunz99.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText emailEt ,passwordEt;
    Button signinBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEt = findViewById(R.id.emailEt);
        passwordEt = findViewById(R.id.passwordEt);
        signinBtn = findViewById(R.id.signinBtn);


        signinBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email =  emailEt.getText().toString();
                String password =  passwordEt.getText().toString();


                if (!email.equals("dalia@d.com")) {
                    emailEt.setError("wrong email");
                    return;
                }

                if (!password.equals("123456")) {
                    passwordEt.setError("wrong password");
                    return;
                }


                Intent intent = new Intent(LoginActivity.this , BookAdapter.class);
                intent.putExtra("email",email);
                startActivity(intent);

            }
        });

    }
}
