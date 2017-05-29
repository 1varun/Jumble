package com.example.varun.jumble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void get_unjumbled(View view){
        Intent i = new Intent(this, do_unjumble.class);
        startActivity(i);
    }

    public void get_jumbled(View view){
        Intent i = new Intent(this, level_select.class);
        startActivity(i);
    }

    public void credit(View view){
        Intent i = new Intent(this, credits.class);
        startActivity(i);
    }

    public void exit(View view){
        finish();
    }
}