package com.rohit.com.datastructureusingc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import rb.rohit.com.datastructureusingclanguage.R;

public class StackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);

        Button programe = (Button) findViewById(R.id.button_stackprograme);



        programe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StackActivity.this, StackprogrameActivity.class);
                startActivity(i);


            }
        });
    }
}



