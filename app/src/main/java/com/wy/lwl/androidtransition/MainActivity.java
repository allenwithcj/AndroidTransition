package com.wy.lwl.androidtransition;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout mExplode,mSlide,mFade;
    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIntent = new Intent();
        Slide slide = new Slide();
        slide.setDuration(1000);
        getWindow().setExitTransition(slide);

        mExplode = (LinearLayout)findViewById(R.id.explode);
        mSlide = (LinearLayout)findViewById(R.id.slide);
        mFade = (LinearLayout)findViewById(R.id.fade);

        mExplode.setOnClickListener(this);
        mSlide.setOnClickListener(this);
        mFade.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.explode:
                mIntent.setClass(this, TransitionActivity.class);
                mIntent.putExtra("transition", "explode");
                startActivity(mIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.slide:
                mIntent.setClass(this, TransitionActivity.class);
                mIntent.putExtra("transition", "slide");
                startActivity(mIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
            case R.id.fade:
                mIntent.setClass(this, TransitionActivity.class);
                mIntent.putExtra("transition", "fade");
                startActivity(mIntent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
                break;
        }
    }
}
