package com.example.sangii.App_activity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import static android.graphics.Color.RED;

public class MainActivity extends AppCompatActivity {
    private EditText Name;
    private EditText Password;
    private Button Login;
    private TextView info;
    private TextView fpass;
    private TextView signup;
    private int count = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText) findViewById(R.id.Uname);
        Password = (EditText) findViewById(R.id.pass);
        Login = (Button) findViewById(R.id.btn_login);
        info = (TextView) findViewById(R.id.tv3);
        fpass = (TextView) findViewById(R.id.tv2);
        signup = (TextView) findViewById(R.id.tv4);
        info.setText("No. of attempts remaining : 3");

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

        fpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this ,Recover_pass.class );
                startActivity(i);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this , Register_page.class);
                startActivity(j);
            }
        });
    }

    private void validate(String username, String userPass) {
        if (username.equals("abcd") && userPass.equals("1234")) {
            Toast.makeText(getApplicationContext(), "Logging in...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity.this, Success_page.class);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Wrong username / password...", Toast.LENGTH_SHORT).show();
            info.setVisibility(View.VISIBLE);
            info.setTextColor(RED);
           // info.setBackgroundColor(Color.GRAY);
            count--;
            info.setText("No. of attempts remaining = " + Integer.toString(count));

            if (count == 0) {
                Login.setEnabled(false);
            }
        }
    }
}



