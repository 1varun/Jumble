package com.example.varun.jumble;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);
    }

    public void back(View view){
        finish();
    }

}