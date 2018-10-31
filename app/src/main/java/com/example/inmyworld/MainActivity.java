package com.example.inmyworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt=findViewById(R.id.button);
        bt.setOnClickListener((View.OnClickListener) this);
        TextView image = (TextView)findViewById(R.id.textView);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.animator.fade);
        image.startAnimation(animation1);

        TextView image2 = (TextView)findViewById(R.id.textView2);
        Animation animation2 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.animator.fade);
        image2.startAnimation(animation2);

    }

    @Override
    public void onClick(View view){

        Intent intent = new Intent(MainActivity.this,secondActivity.class);
        startActivity(intent);
    }

}
