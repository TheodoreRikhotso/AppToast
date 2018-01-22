package com.example.admin.apptoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends AppCompatActivity {

    Button btnLogin0, btnSignUp0;
    TextView tvForgotP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        btnLogin0 = findViewById(R.id.btnLogin0);
        btnSignUp0 = findViewById(R.id.btnSignUp0);
        tvForgotP = findViewById(R.id.tvForgotP);

        tvForgotP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), ForgotPassword.class);
                startActivity(intent);
            }
        });

        btnLogin0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });

        btnSignUp0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), LandingScreen.class);
                startActivity(intent);
            }
        });
    }
}
