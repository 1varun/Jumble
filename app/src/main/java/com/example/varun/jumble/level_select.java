package com.example.varun.jumble;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class level_select extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_select);
    }

    public void easy(View view){
        Intent i = new Intent(this, do_jumble.class);
        i.putExtra("wordsize", 0);
        startActivity(i);
    }

    public void medium(View view){
        Intent i = new Intent(this, do_jumble.class);
        i.putExtra("wordsize", 1);
        startActivity(i);
    }

    public void hard(View view){
        Intent i = new Intent(this, do_jumble.class);
        i.putExtra("wordsize", 2);
        startActivity(i);
    }

    public void expert(View view){
        Intent i = new Intent(this, do_jumble.class);
        i.putExtra("wordsize", 3);
        startActivity(i);
    }

    public void backbutton(View view){
        finish();
    }
}
