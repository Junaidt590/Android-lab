package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText e1;
    EditText e2;
    RadioGroup radioGroup;
    RadioButton r1;
    RadioButton r2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         e1=findViewById(R.id.edit1);
         e2=findViewById(R.id.edit2);
         radioGroup=findViewById(R.id.radio);
         r1=findViewById(R.id.radio1);
         r2=findViewById(R.id.radio2);


    }

    public void sub(View view) {Registrationform();


    }

    private void Registrationform() {


        SharedPreferences sharedPreferences=getSharedPreferences("MY_pref",MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedPreferences.edit();
        editor.putString("fname",e1.getText().toString());
        editor.putString("lname",e2.getText().toString());

        String radiovalue="";
        switch (radioGroup.getCheckedRadioButtonId()){
            case R.id.radio1:radiovalue="Male";
            break;
            case R.id.radio2:radiovalue="Female";
            break;
        }
        editor.putString("Gender",radiovalue);
        editor.apply();
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}