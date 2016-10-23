package com.example.santossingh.materialdesign;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Scroll2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll2);
        ((CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout2)).setTitle("Screen Title");
        RecyclerView rv = (RecyclerView) findViewById(R.id.recyclerview2);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new RecyclerView.Adapter<ViewHolder>() {
            @Override
            public ViewHolder onCreateViewHolder(ViewGroup parent, int position) {
                return new ViewHolder(getLayoutInflater().inflate(R.layout.list_item, parent, false));
            }

            @Override
            public void onBindViewHolder(ViewHolder viewHolder, int position) {
                viewHolder.text1.setText("Bacon");
                viewHolder.text2.setText("Bacon ipsum dolor amet pork belly meatball kevin spare ribs. Frankfurter swine corned beef meatloaf, strip steak.");
            }

            @Override
            public int getItemCount() {
                return 30;
            }
        });
    }

    private static class ViewHolder extends RecyclerView.ViewHolder {
        TextView text1;
        TextView text2;

        public ViewHolder(View itemView) {
            super(itemView);
            text1 = (TextView) itemView.findViewById(R.id.text1);
            text2 = (TextView) itemView.findViewById(R.id.text2);
        }
    }
}