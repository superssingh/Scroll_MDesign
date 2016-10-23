package com.example.santossingh.materialdesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button_scroll1)
    Button button_scroll1;
    @BindView(R.id.button_scroll2)
    Button button_scroll2;
    @BindView(R.id.button_scroll3)
    Button button_scroll3;
    @BindView(R.id.button_scroll4)
    Button button_scroll4;
    @BindView(R.id.button_scroll5)
    Button button_scroll5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        button_scroll1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Scroll1.class);
                startActivity(intent);
            }
        });

        button_scroll2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Scroll2.class);
                startActivity(intent);
            }
        });

        button_scroll3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Scroll3.class);
                startActivity(intent);
            }
        });

        button_scroll4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Animation.class);
                startActivity(intent);
            }
        });

        button_scroll5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, LayoutAnimation.class);
                startActivity(intent);
            }
        });
    }
}

