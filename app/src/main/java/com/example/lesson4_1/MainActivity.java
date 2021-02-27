package com.example.lesson4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn);
        iv =(ImageView) findViewById(R.id.iv);


    }

    public void clicked(View view) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(3)+1;
        btn.setText(""+rand_int1);
        if (rand_int1==1){
            iv.setImageResource(R.drawable.glacier);
            btn.setText("1");
        }
        else if (rand_int1==2){
            iv.setImageResource(R.drawable.snow);
            btn.setText("2");
        }
        else{
            iv.setImageResource(R.drawable.bubble);
            btn.setText("3");
        }



    }
}