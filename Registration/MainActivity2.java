package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView t1;
    TextView  t2;
    TextView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.textView4);
        t2=findViewById(R.id.textView5);
         t3=findViewById(R.id.textView6);
    }

    public void fetch(View view) {
        SharedPreferences sharedPreferences=getSharedPreferences("MY_pref",MODE_PRIVATE);
        t1.setText("First Name="+sharedPreferences.getString("fname",""));
        t2.setText("Last Name="+sharedPreferences.getString("lname",""));
        t3.setText("Gender="+sharedPreferences.getString("Gender",""));
    }
}