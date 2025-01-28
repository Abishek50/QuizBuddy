package com.example.quizapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class CreateAccountPage extends AppCompatActivity {
    //initialize variables
    EditText emailInput,passwordInput;
    Button create;
    ArrayList<String> usernames=new ArrayList<>();
    ArrayList<String> passwords=new ArrayList<>();

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_account_page);

        //bind variables
        emailInput=findViewById(R.id.new_user_email);
        passwordInput=findViewById(R.id.new_user_password);
        create=findViewById(R.id.createButton);

        //set click listener
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailInput.getText().toString();
                String password = passwordInput.getText().toString();

                //invalid inputs check
                if (email.isEmpty()||password.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Fill all fields",Toast.LENGTH_SHORT).show();
                }
                else {
                    //add email and password to ArrayList
                    usernames.add(email);
                    passwords.add(password);
                    Toast.makeText(getApplicationContext(),"Registration Successful :)",Toast.LENGTH_SHORT).show();
                    //Navigate to Login page: Send Extra data
                    Intent i1 = new Intent(getApplicationContext(), Home.class);
                    //i1.putStringArrayListExtra("usernames",usernames);
                    //i1.putStringArrayListExtra("passwords",passwords);
                    startActivity(i1);
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}