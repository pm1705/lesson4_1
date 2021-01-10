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
    ImageView[] iv=new ImageView[1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button)findViewById(R.id.btn);
        iv[0] =(ImageView) findViewById(R.id.iv);


    }

    public void clicked(View view) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(3);
        btn.setText(""+rand_int1);
        if (rand_int1==0){
            iv[0].setImageResource(R.drawable.glacier);
            btn.setText("glacier");
        }
        if (rand_int1==1){
            iv[0].setImageResource(R.drawable.snow);
            btn.setText("snow");
        }
        if (rand_int1==2){
            iv[0].setImageResource(R.drawable.bubble);
            btn.setText("bubbles");
        }



    }
}