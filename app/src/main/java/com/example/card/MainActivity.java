package com.example.card;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.card.MaterialCardView;

import static com.example.card.R.*;

public class MainActivity extends AppCompatActivity {
    MaterialCardView Card1,Card2,Card3,Card4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        Card1 = findViewById(id.card1);
        Card2 = findViewById(id.card2);
        Card3 = findViewById(id.card3);
        Card4 = findViewById(id.card4);
        Card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Card1.setStrokeWidth(5);
            Card1.setStrokeColor(getResources().getColor(color.bordercolor));
            Card1.setCardBackgroundColor(getResources().getColor(color.center));
            opt1();
            }
        });
        Card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Card2.setStrokeWidth(5);
                Card2.setStrokeColor(getResources().getColor(color.bordercolor));
                Card2.setCardBackgroundColor(getResources().getColor(color.center));
            opt2();
            }
        });
        Card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Card3.setStrokeWidth(5);
                Card3.setStrokeColor(getResources().getColor(color.bordercolor));
                Card3.setCardBackgroundColor(getResources().getColor(color.center));
            opt3();
            }
        });
        Card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Card4.setStrokeWidth(5);
                Card4.setStrokeColor(getResources().getColor(color.bordercolor));
                Card4.setCardBackgroundColor(getResources().getColor(color.center));
                opt4();
            }
        });

    }

    private void opt4() {
        Card1.setStrokeWidth(0);
        Card1.setCardBackgroundColor(getResources().getColor(color.white));
        Card2.setStrokeWidth(0);
        Card2.setCardBackgroundColor(getResources().getColor(color.white));
        Card3.setStrokeWidth(0);
        Card3.setCardBackgroundColor(getResources().getColor(color.white));
    }

    private void opt3() {
        Card1.setStrokeWidth(0);
        Card1.setCardBackgroundColor(getResources().getColor(color.white));
        Card2.setStrokeWidth(0);
        Card2.setCardBackgroundColor(getResources().getColor(color.white));
        Card4.setStrokeWidth(0);
        Card4.setCardBackgroundColor(getResources().getColor(color.white));
    }

    private void opt2() {
        Card1.setStrokeWidth(0);
        Card1.setCardBackgroundColor(getResources().getColor(color.white));
        Card3.setStrokeWidth(0);
        Card3.setCardBackgroundColor(getResources().getColor(color.white));
        Card4.setStrokeWidth(0);
        Card4.setCardBackgroundColor(getResources().getColor(color.white));
    }

    private void opt1() {
        Card2.setStrokeWidth(0);
        Card2.setCardBackgroundColor(getResources().getColor(color.white));
        Card3.setStrokeWidth(0);
        Card3.setCardBackgroundColor(getResources().getColor(color.white));
        Card4.setStrokeWidth(0);
        Card4.setCardBackgroundColor(getResources().getColor(color.white));
    }


}