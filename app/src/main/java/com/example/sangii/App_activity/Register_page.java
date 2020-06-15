package com.example.sangii.App_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Register_page extends AppCompatActivity {
    private Button sign;
    private CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        sign = (Button) findViewById(R.id.b2);
        cb = (CheckBox) findViewById(R.id.cb1);

        /*sign.setEnabled(false);

        if(cb.isSelected()==false)
        {
            sign.setEnabled(false);
        }
        else
        {
            sign.setEnabled(true);
        }*/
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Register_page.this , sign_success.class);
                startActivity(intent);
            }
        });
    }
}
