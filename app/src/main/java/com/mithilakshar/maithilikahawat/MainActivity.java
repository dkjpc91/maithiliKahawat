package com.mithilakshar.maithilikahawat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView splashImage;
    TextView splashText;
    Animation splashAnimation1,splashAnimation2,splashAnimation3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if( getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }


        //Link Id
        splashImage=findViewById(R.id.splashImage);
        splashText=findViewById(R.id.splashText);

        //start animation
        splashAnimation1= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomout);
        splashAnimation1.setDuration(2000);
        splashImage.startAnimation(splashAnimation1);

        splashAnimation3= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadein);
        splashAnimation3.setDuration(2000);
        splashText.startAnimation(splashAnimation3);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                splashAnimation2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoomin);
                splashAnimation2.setDuration(3000);
                splashImage.startAnimation(splashAnimation2);

                splashAnimation3= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fadeout);
                splashAnimation3.setDuration(1500);
                splashAnimation3.setFillAfter(true);
                splashText.startAnimation(splashAnimation3);
            }
        },2000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(getApplicationContext(),home.class);
                startActivity(intent);
                finish();

            }
        },3500);
    }
}