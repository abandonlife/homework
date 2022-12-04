package com.example.android1;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        findViewById(R.id.button4).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()==R.id.button4){
            Toast.makeText(getApplicationContext(),"Toast",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent();
            intent.setClass(MainActivity2.this,MainActivity1.class);
            startActivity(intent);
        }
    }
}