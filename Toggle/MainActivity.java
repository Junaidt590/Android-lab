package com.example.toggle;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int images[] = {R.drawable.img1, R.drawable.img2};
    int currentindex = 0;
    Button btn;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        imageView = findViewById(R.id.imageView2);
    }
        public void click (View view){
            currentindex();
        }

        private void currentindex() {
            switch (currentindex) {
                case 0:imageView.setImageResource(images[1]);
                currentindex=1;
                break;
                case 1:imageView.setImageResource(images[0]);
                    currentindex=0;
                    break;

            }

        }
    }
