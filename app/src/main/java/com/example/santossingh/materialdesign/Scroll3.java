package com.example.santossingh.materialdesign;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;

public class Scroll3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll3);

        ((CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout3)).setTitle("Eclairs");

    }
}
