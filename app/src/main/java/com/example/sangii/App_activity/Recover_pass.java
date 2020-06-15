package com.example.sangii.App_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Recover_pass extends AppCompatActivity {
    private Button btn;
    private EditText newpass;
    private EditText cpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover_pass);

       btn = (Button) findViewById(R.id.b3);
        newpass = (EditText) findViewById(R.id.newpass);
        cpass = (EditText) findViewById(R.id.cpass);

        /*btn.setEnabled(false);
        if(newpass==cpass)
            btn.setEnabled(true);*/
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Password changed successfully..!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Recover_pass.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
