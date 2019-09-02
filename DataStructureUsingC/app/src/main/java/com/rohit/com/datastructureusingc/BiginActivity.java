package com.rohit.com.datastructureusingc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import rb.rohit.com.datastructureusingclanguage.R;

public class BiginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigin);


        Button introduction = (Button)findViewById(R.id.button_introduction);
        Button search= (Button)findViewById(R.id.button_searchingandsorting);
        Button stack= (Button)findViewById(R.id.button_stack);
        Button queue= (Button)findViewById(R.id.button_queue);
        Button link= (Button)findViewById(R.id.button_linklist);
        Button trees= (Button)findViewById(R.id.button_trees);
        Button graph= (Button)findViewById(R.id.button_graph);


              //GRAPH ACTIVITY

        graph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiginActivity.this, GraphActivity.class);
                startActivity(i);


            }
        });

        //TREES ACTIVITY
        trees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiginActivity.this, TreesActivity.class);
                startActivity(i);


            }
        });


        //LINKEDLIST ACTIVITY
        link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiginActivity.this, LinkedlistActivity.class);
                startActivity(i);


            }
        });


        //QUEUE ACTIVITY
        queue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiginActivity.this, QueueActivity.class);
                startActivity(i);


            }
        });

        //STACK ACTIVITY
        stack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiginActivity.this, StackActivity.class);
                startActivity(i);


            }
        });


        //SEARCHING AND SORTING
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiginActivity.this, SearchingandSortingActivity.class);
                startActivity(i);


            }
        });




        introduction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BiginActivity.this, IntroductionActivity.class);
                startActivity(i);

            }
        });


    }
}