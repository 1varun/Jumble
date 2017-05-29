package com.example.varun.jumble;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class do_unjumble extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_unjumble);
    }

    static String o="";

    public void unjumbled(View view){
        InputMethodManager m=(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        m.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);
        EditText word = (EditText)findViewById(R.id.inputword);
        String inputword= word.getText().toString().trim();
        TextView solution = (TextView)findViewById(R.id.solution);
        TextView line = (TextView)findViewById(R.id.line);
        if(inputword.equals("")) {
            line.setText("Please enter JUMBLED word!!!");
            solution.setText("");
        }
        else if(inputword.length()<=7){
            permute(inputword);
            line.setText("Possible Solutions are :");
            solution.setText(o);
        }
        else{
            line.setText("Right now we solve only uptill 7 letters max.");
            solution.setText("But you can take the expert quiz instead for long words.");
        }
        o="";
    }
    private void permute(String str){
        printpermute(str,"");
    }

    private void printpermute(String str1, String perm){
        if(str1.length()==0){
            if(perm.length()<=4){
                try {
                    DataInputStream textFileStream = new DataInputStream(getAssets().open("wl4minus.txt"));
                    Scanner sc = new Scanner(textFileStream);
                    while (sc.hasNextLine()) {
                        String aLine = sc.nextLine().trim();
                        if(perm.equalsIgnoreCase(aLine))
                            o=o+perm+", ";

                    }
                    sc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            }
            else if(perm.length()==5){
                if((perm.charAt(0))=='a') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5a.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o+perm+", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='b') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5b.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='c') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5c.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='d') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5d.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='e') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5e.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='f') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5f.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='g') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5g.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='h') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5h.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='i') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5i.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='j') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5j.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='k') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5k.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='l') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5l.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='m') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5m.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='n') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5n.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='o') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5o.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='p') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5p.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='q') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5q.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='r') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5r.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='s') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5s.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='t') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5t.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='u') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5u.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='v') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5v.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='w') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5w.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='x') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5x.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='y') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5y.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='z') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w5z.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return;
            }
            else if(perm.length()==6){
                if(perm.charAt(0)=='a') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6a.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='b') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6b.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='c') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6c.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='d') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6d.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='e') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6e.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='f') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6f.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='g') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6g.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='h') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6h.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='i') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6i.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='j') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6j.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='k') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6k.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='l') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6l.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='m') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6m.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='n') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6n.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='o') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6o.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='p') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6p.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='q') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6q.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='r') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6r.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='s') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6s.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='t') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6t.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='u') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6u.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='v') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6v.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='w') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6w.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='x') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6x.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='y') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6y.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                else if(perm.charAt(0)=='z') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w6z.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o = o + perm + ", ";

                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return;
            }
            else if(perm.length()==7){
                if(perm.charAt(0)=='a') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7a.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='b') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7b.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='c') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7c.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='d') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7d.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='e') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7e.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='f') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7f.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='g') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7g.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='h') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7h.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='i') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7i.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='j') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7j.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='k') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7k.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='l') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7l.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='m') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7m.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='n') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7n.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='o') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7o.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='p') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7p.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='q') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7q.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='r') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7r.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='s') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7s.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='t') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7t.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='u') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7u.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='v') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7v.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='w') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7w.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='x') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7x.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='y') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7y.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
                else if(perm.charAt(0)=='z') {
                    try {
                        DataInputStream textFileStream = new DataInputStream(getAssets().open("w7z.txt"));
                        Scanner sc = new Scanner(textFileStream);
                        while (sc.hasNextLine()) {
                            String aLine = sc.nextLine().trim();
                            if (perm.equalsIgnoreCase(aLine))
                                o=perm;
                        }
                        sc.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return;
                }
            }
        }

        for(int i=0; i<str1.length(); i++){
            char c=str1.charAt(i);
            String str2= str1.substring(0, i) + str1.substring(i+1);

            printpermute(str2, perm+c);
        }

    }

    public void backbutton(View view){
        finish();
    }

    public void quizbutton(View view){
        Intent i = new Intent(this, level_select.class);
        startActivity(i);
    }
}