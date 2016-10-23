package com.example.santossingh.materialdesign;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Animation extends AppCompatActivity {
    @BindView(R.id.button_animation)
    Button button_animation;
    @BindView(R.id.imageView)
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);

        button_animation.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                // Minimum required Lolipop version 21 for slide class
                Slide slide = new Slide();
                slide.setSlideEdge(Gravity.TOP);
                ViewGroup root = (ViewGroup) findViewById(R.id.activity_animation);
                TransitionManager.beginDelayedTransition(root, slide);
                imageView.setVisibility(View.INVISIBLE);
            }
        });
    }
}
