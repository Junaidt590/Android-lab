package com.example.formvalidation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2;
    RadioButton rdb1,rdb2;
    EditText pswd;
    Switch sh;
    CheckBox ch;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText) findViewById(R.id.edit1);
        edt2 = findViewById(R.id.edit2);
        rdb1 = findViewById(R.id.radio1);
        rdb2 = findViewById(R.id.radio2);
        pswd = findViewById(R.id.editpassword);
        sh = findViewById(R.id.switch1);
        ch = findViewById(R.id.checkBox);

    }

    public void submit(View view) {
        if (validate()) {
            Toast.makeText(this, "All data is valid", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Some data is invalid", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean validate() {
        Boolean isValid = false;
        String fname,lname;
        fname=edt1.getText().toString();
        lname=edt2.getText().toString();

        if(fname.equals("")){
            Toast.makeText(this, "First name is empty", Toast.LENGTH_SHORT).show();
        }else if (lname.equals("")){
            Toast.makeText(this, "Last name is empty", Toast.LENGTH_SHORT).show();
        }else if (!rdb1.isChecked()&&!rdb2.isChecked()){
            Toast.makeText(this, "Please choose Gender", Toast.LENGTH_SHORT).show();
        }else if (pswd.length()<5){
            Toast.makeText(this, "Password must have atleast 5 letters", Toast.LENGTH_SHORT).show();
        }else if (!sh.isChecked()){
            Toast.makeText(this, "New member", Toast.LENGTH_SHORT).show();
        }else if (!ch.isChecked()){
            Toast.makeText(this, "Please agree to the terms and conditions", Toast.LENGTH_SHORT).show();
        }else{
            isValid=true;
        }
        return isValid;
    }
}