package com.rohit.com.datastructureusingc;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;

import rb.rohit.com.datastructureusingclanguage.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bigin = (Button) findViewById(R.id.button_bigin);
        Button about = (Button) findViewById(R.id.button_aboutus);
        Button button = (Button) findViewById(R.id.button_rateapp);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/rohit.bhokarikar")));


                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("https://www.facebook.com/rohit.bhokarikar")));
                }
            }
        });


        about.setOnClickListener(new View.OnClickListener()

                                 {
                                     @Override
                                     public void onClick(View v) {
                                         Intent i = new Intent(MainActivity.this, AboutUs.class);
                                         startActivity(i);


                                     }
                                 }

        );


        bigin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, BiginActivity.class);
                startActivity(i);


            }
        });

    }
         @Override
          public void onBackPressed(){

             final AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
             builder.setMessage("Are you sure want to Exit ?");
             builder.setCancelable(true);
             builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                     dialogInterface.cancel();
                 }
             });

             builder.setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialog, int which) {
                     finish();
                 }
             });

            AlertDialog alertDialog = builder.create();
             alertDialog.show();
         }

}


