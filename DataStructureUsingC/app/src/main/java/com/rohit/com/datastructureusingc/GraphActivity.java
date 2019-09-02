package com.rohit.com.datastructureusingc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import rb.rohit.com.datastructureusingclanguage.R;

public class GraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);


        Button programe = (Button) findViewById(R.id.button_graphprograme);

        programe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(GraphActivity.this, GraphprogrameActivity.class);
                startActivity(i);


            }
        });
        //GRAPH ACTIVITY

    }
}

