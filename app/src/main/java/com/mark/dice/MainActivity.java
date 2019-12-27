package com.mark.dice;

import androidx.appcompat.app.AppCompatActivity;

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

        Button rollButton = (Button) findViewById(R.id.rollButton);

        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumber = new Random();
                int rightNumber = randomNumber.nextInt(6);
                int leftNumber = randomNumber.nextInt(6);
                rightDice.setImageResource(diceArray[rightNumber]);
                leftDice.setImageResource(diceArray[leftNumber]);
            }
        });
    }
}
