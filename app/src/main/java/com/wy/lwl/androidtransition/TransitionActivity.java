package com.wy.lwl.androidtransition;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;

public class TransitionActivity extends AppCompatActivity {
    private String transition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        transition = getIntent().getStringExtra("transition");
        switch (transition) {
            case "explode":
                Explode explode = new Explode();
                explode.setDuration(1000L);
                getWindow().setEnterTransition(explode);
                break;
            case "slide":
                Slide slide = new Slide(Gravity.BOTTOM);
                slide.setDuration(1000L);
                getWindow().setEnterTransition(slide);
                break;
            case "fade":
                Fade fade = new Fade();
                fade.setDuration(1000L);
                getWindow().setEnterTransition(fade);
                break;
        }

    }

}
