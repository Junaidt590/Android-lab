package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    EditText t2;

    TextView tv_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    public void sum(View v)
    {
        EditText t1=(EditText)findViewById(R.id.editTextNumber2);
        EditText t2=(EditText)findViewById(R.id.editTextNumber3);


        float x=Float.parseFloat(t1.getText().toString());
        float y=Float.parseFloat(t2.getText().toString());
        float z=x+y;

        TextView tv_data=(TextView)findViewById(R.id.result);
        tv_data.setText("Answer is "+z);

    }

    public void sub(View view) {
        EditText t1=(EditText)findViewById(R.id.editTextNumber2);
        EditText t2=(EditText)findViewById(R.id.editTextNumber3);


        float x=Float.parseFloat(t1.getText().toString());
        float y=Float.parseFloat(t2.getText().toString());
        float z=x-y;

        TextView tv_data=(TextView)findViewById(R.id.result);
        tv_data.setText("Answer is "+z);

    }

    public void mul(View view) {
        EditText t1=(EditText)findViewById(R.id.editTextNumber2);
        EditText t2=(EditText)findViewById(R.id.editTextNumber3);

        float x=Float.parseFloat(t1.getText().toString());
        float y=Float.parseFloat(t2.getText().toString());
       float z=x*y;

        TextView tv_data=(TextView)findViewById(R.id.result);
        tv_data.setText("Answer is "+z);

    }

    public void div(View view) {
        EditText t1=(EditText)findViewById(R.id.editTextNumber2);
        EditText t2=(EditText)findViewById(R.id.editTextNumber3);

        float x=Float.parseFloat(t1.getText().toString());
        float y=Float.parseFloat(t2.getText().toString());
        float z=x/y;

        TextView tv_data=(TextView)findViewById(R.id.result);
        tv_data.setText("Answer is "+z);
    }
}