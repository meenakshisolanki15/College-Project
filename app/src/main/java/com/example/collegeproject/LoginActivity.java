package com.example.collegeproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.CameraExtensionSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.collegeproject.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    ActivityLoginBinding binding;
    DatabaseHelper databaseHelper;
    Button login;
    //email: meena007555@gmail.com
    //password: meenakshi
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        databaseHelper = new DatabaseHelper(this);
        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = binding.loginEmail.getText().toString();
                String password = binding.loginPassword.getText().toString();

                if(email.equals("")|| password.equals(""))
                    Toast.makeText(LoginActivity.this, "All fields are mandatory", Toast.LENGTH_SHORT).show();
                else
                {
                    Boolean checkCredentials = databaseHelper.checkEmailPassword(email,password);
                    if(checkCredentials == true){
                        Toast.makeText(LoginActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), com.example.collegeproject.MainActivity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(LoginActivity.this, "Inavalid Credentials", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        }) ;
        binding.signupRedirectText.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intent = new Intent(LoginActivity.this, com.example.collegeproject.MainActivity.class);
                startActivity(intent);
            }
        });

       login = findViewById(R.id.login_button);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,HomepageActivity.class);
                startActivity(intent);
            }
        });
    }
}