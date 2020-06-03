package com.company.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;
        rollButton = (Button)findViewById(R.id.rollbutton);
       final ImageView leftDice = (ImageView)findViewById(R.id.imageView1);
        final ImageView rightDice = (ImageView)findViewById(R.id.imageView2);
       final int[] diceArray = {R.drawable.dice1,R.drawable.dice2,R.drawable.dice3,R.drawable.dice4,
                R.drawable.dice5,R.drawable.dice6};

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","The button has been pressed");
                Random randomNUmberGenerator = new Random();
                int number = randomNUmberGenerator.nextInt(6);
                Log.d("Dicee", "The random number is :" + number);
                leftDice.setImageResource(diceArray[number]);
                 number = randomNUmberGenerator.nextInt(6);
                rightDice.setImageResource(diceArray[number]);



            }
        });

    }
}
