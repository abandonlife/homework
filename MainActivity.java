package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button1).setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button1){
            Toast.makeText(getApplicationContext(),"3G荣光",Toast.LENGTH_SHORT).show();
        }
    }
}