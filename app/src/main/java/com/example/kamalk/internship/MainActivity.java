package com.example.kamalk.internship;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread k = new Thread(){
           public void run(){
             try{
                sleep(5000);
             } catch(InterruptedException e){
                e.printStackTrace();
               }
               finally{
                 Intent i = new Intent("com.example.kamalk.internship.LOGINACTIVITY");
                 startActivity(i);
             }
            }
        };
        k.start();
    }
}
