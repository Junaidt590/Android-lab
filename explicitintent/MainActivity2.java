package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Button btn1;
    TextView tv1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btn1=findViewById(R.id.button2);
        tv1=findViewById(R.id.textView);
    }

    public void button(View view) {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}