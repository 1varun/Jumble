package com.example.varun.jumble;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class do_jumble extends AppCompatActivity {

    String jword="";
    String actualword="";
    int wordsize=0;
    int ntry = 3;
    int cstreak=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_jumble);
        Intent intent = getIntent();
        wordsize=intent.getIntExtra("wordsize", 0);
        cstreak=intent.getIntExtra("streak", 0);
        actualword=wordgenerator(wordsize);
        jword=jumblegenerator(actualword);
        TextView jumbledword = (TextView)findViewById(R.id.jumbled_word);
        TextView streak = (TextView)findViewById(R.id.streak);
        jumbledword.setText(jword);
        String currentstreak="Current Streak: "+Integer.toString(cstreak);
        streak.setText(currentstreak);
    }

    public String wordgenerator(int size){
        int count=0;
        if(size==0){
            int random=(int)(Math.random()*984+1);
            try {
                DataInputStream textFileStream = new DataInputStream(getAssets().open("easy.txt"));
                Scanner sc = new Scanner(textFileStream);
                while (sc.hasNextLine()) {
                    count++;
                    sc.nextLine();
                    if(count==random) {
                        actualword = sc.nextLine().trim().toLowerCase();
                        sc.close();
                        count=0;
                        return actualword;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (size==1){
            int random=(int)(Math.random()*936+1);
            try {
                DataInputStream textFileStream = new DataInputStream(getAssets().open("medium.txt"));
                Scanner sc = new Scanner(textFileStream);
                while (sc.hasNextLine()) {
                    count++;
                    sc.nextLine();
                    if(count==random) {
                        actualword = sc.nextLine().trim().toLowerCase();
                        sc.close();
                        count=0;
                        return actualword;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(size==2){
            int random=(int)(Math.random()*534+1);
            try {
                DataInputStream textFileStream = new DataInputStream(getAssets().open("hard.txt"));
                Scanner sc = new Scanner(textFileStream);
                while (sc.hasNextLine()) {
                    count++;
                    sc.nextLine();
                    if(count==random) {
                        actualword = sc.nextLine().trim().toLowerCase();
                        sc.close();
                        count=0;
                        return actualword;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if(size==3){
            int random=(int)(Math.random()*334+1);
            try {
                DataInputStream textFileStream = new DataInputStream(getAssets().open("expert.txt"));
                Scanner sc = new Scanner(textFileStream);
                while (sc.hasNextLine()) {
                    count++;
                    sc.nextLine();
                    if(count==random) {
                        actualword = sc.nextLine().trim().toLowerCase();
                        sc.close();
                        count=0;
                        return actualword;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return("unlucky");
    }

    public String jumblegenerator(String str){
        char[] characters=str.toCharArray();
        for(int i=0; i<characters.length; i++){
            int randomIndex = (int)(Math.random()*characters.length);
            char temp=characters[i];
            characters[i]=characters[randomIndex];
            characters[randomIndex]=temp;
        }
        return new String(characters);
    }

    public void backbutton(View view){
        finish();
    }

    public void check(View view){
        InputMethodManager m=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        m.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        TextView result = (TextView)findViewById(R.id.result);
        TextView left_tries = (TextView)findViewById(R.id.no_of_tries);
        Button next=(Button)findViewById(R.id.next_button);
        if(ntry > 0) {
            EditText word = (EditText) findViewById(R.id.answer);
            String answer = word.getText().toString().trim();
            if (answer.equals("")){
                result.setText("Please enter your answer.");
                ntry = ntry-1;
                left_tries.setText("Tries Left: "+ntry);

            }
            else if (answer.equalsIgnoreCase(actualword)){
                result.setText("You answered right: "+actualword);
                left_tries.setText("You got the ans in "+(4-ntry)+" try. Well Done.");
                ntry = -1;
                cstreak=cstreak+1;
                TextView streak = (TextView)findViewById(R.id.streak);
                String currentstreak="Current Streak: "+Integer.toString(cstreak);
                streak.setText(currentstreak);
                next.setVisibility(View.VISIBLE);
            }
            else{
                result.setText("WRONG ANSWER");
                ntry = ntry-1;
                left_tries.setText("Tries Left: "+ntry);
            }
        }
        if(ntry==0){
            result.setText("RIGHT ANSWER: "+actualword);
            left_tries.setText("You almost had it.");
            next.setVisibility(View.VISIBLE);
            cstreak=0;
        }
    }

    public void nextbutton(View view){
        Intent i = new Intent(this, do_jumble.class);
        i.setFlags(i.FLAG_ACTIVITY_CLEAR_TOP);
        i.putExtra("wordsize", wordsize);
        i.putExtra("streak", cstreak);
        startActivity(i);
    }

}