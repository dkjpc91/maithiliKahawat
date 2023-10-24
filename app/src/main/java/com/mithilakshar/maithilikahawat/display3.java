package com.mithilakshar.maithilikahawat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class display3 extends AppCompatActivity {

    TextSwitcher textSwitcher3;
    ImageView backPress,forwardPress;
    String[] shayari;
    int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display3);
        shayari=getResources().getStringArray(R.array.display1);

        if( getSupportActionBar()!=null){
            getSupportActionBar().hide();
        }

        textSwitcher3=findViewById(R.id.textSwitcher3);
        backPress=findViewById(R.id.backPress);
        forwardPress=findViewById(R.id.forwardPress);

        textSwitcher3.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {

                TextView textView=new TextView(getApplicationContext());
                textView.setTextSize(50);
                textView.setGravity(Gravity.CENTER);
                textView.setTextColor(getColor(R.color.black));
                return textView;
            }
        });

        textSwitcher3.setText(shayari[index]);

        backPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index==0){
                    index=shayari.length-1;
                    textSwitcher3.setText(shayari[index]);
                }
                else {
                    index=index-1;
                    textSwitcher3.setText(shayari[index]);
                }
            }
        });

        forwardPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index=(index+1)%shayari.length;
                textSwitcher3.setText(shayari[index]);
            }
        });


    }
}

