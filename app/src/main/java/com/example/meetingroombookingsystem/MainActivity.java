package com.example.meetingroombookingsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, pass;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText user = findViewById(R.id.user);
        final EditText pass = findViewById(R.id.pass);
        Button login = (Button) findViewById(R.id.loginBtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                final String name = user.getText().toString();
                final String passW = pass.getText().toString();

                if (name == "ADMIN" && passW == "TEST"){
                        Toast.makeText(MainActivity.this, "Login Successful", Toast.LENGTH_LONG).show();

                        Intent i = new Intent(getApplicationContext(),AdminDashboard.class);
                        startActivity(i);

                    }
//                else if(name.length()==0 && passW.length()==0){
//                        user.setError("Enter username");
//                        pass.setError("Enter password");
//                    }
            }

        });


    }
}