package com.example.lab2_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button btn_second;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_second = (Button) findViewById(R.id.btn_second);
        btn_second.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent i0 = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(i0);
            }
        });
    }
}