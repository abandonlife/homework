package com.example.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button2){
            Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent();
            intent.setClass(MainActivity1.this,MainActivity.class);
            startActivity(intent);
        }
        if (view.getId()==R.id.button3){
            Toast.makeText(getApplicationContext(),"thanks",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent();
            intent.setClass(MainActivity1.this,MainActivity2.class);
            startActivity(intent);
        }
    }
}