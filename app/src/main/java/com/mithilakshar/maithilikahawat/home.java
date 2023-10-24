package com.mithilakshar.maithilikahawat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class home extends AppCompatActivity {

    CardView card1,card2,card3,card4;
    LinearLayout homeLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        card1=findViewById(R.id.card1);
        card2=findViewById(R.id.card2);
        card3=findViewById(R.id.card3);
        card4=findViewById(R.id.card4);
        homeLayout=findViewById(R.id.homeLayout);

        if( getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }

        switchBackground();

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),display1.class);
                startActivity(i);

            }
        });
        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),display2.class);
                startActivity(i);

            }
        });
        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),display3.class);
                startActivity(i);

            }
        });
        card4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i=new Intent(getApplicationContext(),display4.class);
                startActivity(i);

            }
        });


    }

    private void switchBackground() {

        switch (new Random().nextInt(13)){

            case 0:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c1));
                break;
            case 1:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c2));
                break;
            case 2:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c3));
                break;
            case 3:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c4));
                break;
            case 4:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c5));
                break;
            case 5:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c6));
                break;
            case 6:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c7));
                break;
            case 7:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c8));
                break;
            case 8:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c9));
                break;
            case 9:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c10));
                break;
            case 10:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c11));
                break;
            case 11:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c12));
                break;
            case 12:
                homeLayout.setBackgroundColor(getResources().getColor(R.color.c13));
                break;

        }

    }


}