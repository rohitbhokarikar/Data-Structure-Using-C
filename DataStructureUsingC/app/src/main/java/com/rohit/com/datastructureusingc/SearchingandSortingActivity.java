package com.rohit.com.datastructureusingc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import rb.rohit.com.datastructureusingclanguage.R;

public class SearchingandSortingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchingand_sorting);

        Button selection = (Button) findViewById(R.id.button_selectionsort);
        Button insertion = (Button) findViewById(R.id.button_insertionsort);
        Button quick = (Button) findViewById(R.id.button_quicksort);
        Button merge = (Button) findViewById(R.id.button_mergesort);

        Button linear = (Button) findViewById(R.id.button_linearsearch);
        Button binary = (Button) findViewById(R.id.button_binarysearch);
        Button bubble = (Button) findViewById(R.id.button_bubblesort);
        Button heap = (Button) findViewById(R.id.button_heapsort);


        //GRAPH ACTIVITY

        heap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchingandSortingActivity.this, HeapersortActivity.class);
                startActivity(i);


            }
        });



        bubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchingandSortingActivity.this, BubblesortActivity.class);
                startActivity(i);


            }
        });

        binary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchingandSortingActivity.this, BinarysrachActivity.class);
                startActivity(i);


            }
        });

        selection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchingandSortingActivity.this, SelectonsortActivity.class);
                startActivity(i);


            }
        });

        //TREES ACTIVITY
        insertion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchingandSortingActivity.this, InsertionsortActivity.class);
                startActivity(i);


            }
        });


        //LINKEDLIST ACTIVITY
        quick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchingandSortingActivity.this, QuicksortActivity.class);
                startActivity(i);


            }
        });


        //QUEUE ACTIVITY
        merge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchingandSortingActivity.this, MergesortActivity.class);
                startActivity(i);


            }
        });

        //STACK ACTIVITY


        //SEARCHING AND SORTING
        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SearchingandSortingActivity.this, LinearsearchActivity.class);
                startActivity(i);


            }
        });
    }


}



