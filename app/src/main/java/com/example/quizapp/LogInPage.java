package com.example.quizapp;

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

public class LogInPage extends AppCompatActivity {
    //initialize variables
    EditText usernameInput,passwordInput;
    Button login;
    ArrayList<String> usernames=new ArrayList<>();
    ArrayList<String> passwords=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in_page);

        //bind variables
        usernameInput=findViewById(R.id.old_user_username);
        passwordInput=findViewById(R.id.old_user_password);
        login=findViewById(R.id.login_btn);

        //Created Accounts:
        //Shyamal:
        usernames.add("shyamal@gmail.com");
        passwords.add("0000");
        //Abishek:
        usernames.add("bachcha@gmail.com");
        passwords.add("1111");
        //pinto
        usernames.add("pinta@gmail.com");
        passwords.add("2222");

        //get array content
        Intent i =getIntent();
        ArrayList<String> newUsernames=i.getStringArrayListExtra("usernames");
        ArrayList<String> newPasswords=i.getStringArrayListExtra("passwords");
        if (newUsernames!=null && newPasswords!=null){
            usernames.addAll(newUsernames);
            passwords.addAll(newPasswords);
        }

        //set click listener
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=usernameInput.getText().toString();
                String password=passwordInput.getText().toString();
                //get position of the email
                int pos=usernames.indexOf(username);
                // if userInput password == password at position of email: Success!!!
                if (password.equals(passwords.get(pos))){
                    Toast.makeText(getApplicationContext(),"LogIn Successful",Toast.LENGTH_SHORT).show();
                    //navigate to home
                    Intent i1 = new Intent(getApplicationContext(),Home.class);
                    startActivity(i1);
                }
                //Failed login
                else {
                    Toast.makeText(getApplicationContext(),"Invalid",Toast.LENGTH_SHORT).show();
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