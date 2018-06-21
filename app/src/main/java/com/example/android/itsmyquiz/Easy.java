package com.example.android.itsmyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Easy extends AppCompatActivity {
    String ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
    String que3 ="3.TextView txt = (TextView) findViewById(R.id.txt_id)";
    static int attempted = 0;
    static int correct = 0;
    static int wrong = 0;
    static float marks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);
        TextView question3  = (TextView) findViewById(R.id.eq_3);
        question3.setText(que3);
        if(savedInstanceState != null){
            ans1 = savedInstanceState.getString(rg1);
            ans2 = savedInstanceState.getString(rg2);
            ans3 = savedInstanceState.getString(rg3);
            ans4 = savedInstanceState.getString(rg4);
            ans5 = savedInstanceState.getString(rg5);
            ans6 = savedInstanceState.getString(rg6);
            ans7 = savedInstanceState.getString(rg7);
            ans8 = savedInstanceState.getString(rg8);
            ans9 = savedInstanceState.getString(rg9);
            ans10 = savedInstanceState.getString(rg10);
        }

    }
    public static String rg1 = "ans1";
    public static String rg2 = "ans2";
    public static String rg3 = "ans3";
    public static String rg4 = "ans4";
    public static String rg5 = "ans5";
    public static String rg6 = "ans6";
    public static String rg7 = "ans7";
    public static String rg8 = "ans8";
    public static String rg9 = "ans9";
    public static String rg10 = "ans10";
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putString(rg1,ans1);
        savedInstanceState.putString(rg2,ans2);
        savedInstanceState.putString(rg3,ans3);
        savedInstanceState.putString(rg4,ans4);
        savedInstanceState.putString(rg5,ans5);
        savedInstanceState.putString(rg6,ans6);
        savedInstanceState.putString(rg7,ans7);
        savedInstanceState.putString(rg8,ans8);
        savedInstanceState.putString(rg9,ans9);
        savedInstanceState.putString(rg10,ans10);
        super.onSaveInstanceState(savedInstanceState);
    }
    public void Submitting(View view){
        final RadioGroup r1 = (RadioGroup) findViewById(R.id.rgeq_1);
        int selected1 = r1.getCheckedRadioButtonId();
        final RadioGroup r2 = (RadioGroup) findViewById(R.id.rgeq_2);
        int selected2 = r2.getCheckedRadioButtonId();
        final RadioGroup r3 = (RadioGroup) findViewById(R.id.rgeq_3);
        int selected3 = r3.getCheckedRadioButtonId();
        final RadioGroup r4 = (RadioGroup) findViewById(R.id.rgeq_4);
        int selected4 = r4.getCheckedRadioButtonId();
        final RadioGroup r5 = (RadioGroup) findViewById(R.id.rgeq_5);
        int selected5 = r5.getCheckedRadioButtonId();
        final RadioGroup r6 = (RadioGroup) findViewById(R.id.rgeq_6);
        int selected6 = r6.getCheckedRadioButtonId();
        final RadioGroup r7 = (RadioGroup) findViewById(R.id.rgeq_7);
        int selected7 = r7.getCheckedRadioButtonId();
        final RadioGroup r8 = (RadioGroup) findViewById(R.id.rgeq_8);
        int selected8 = r8.getCheckedRadioButtonId();
        final RadioGroup r9 = (RadioGroup) findViewById(R.id.rgeq_9);
        int selected9 = r9.getCheckedRadioButtonId();
        final RadioGroup r10 = (RadioGroup) findViewById(R.id.rgeq_10);
        int selected10 = r10.getCheckedRadioButtonId();
        if(selected1 != -1) {
            RadioButton rb1 = (RadioButton) findViewById(selected1);
            ans1 = rb1.getText().toString();
            attempted += 1;
            switch (ans1) {
               default:wrong += 1;
                     marks -= 0.5;
                    break;
                case "Resources":
                    correct += 1;
                    marks += 2;
                    break;
            }
        }
        else{}
        if(selected2 != -1){
            RadioButton rb2 = (RadioButton) findViewById(selected2);
            ans2 = rb2.getText().toString();
            attempted += 1;
            switch(ans2){
                default: wrong += 1;
                marks -= 0.5;
                break;
                case "xml code": correct += 1;
                marks += 2;
                break;
            }
        }
        else{}
        if(selected3 != -1){
            RadioButton rb3 = (RadioButton) findViewById(selected3);
            ans3 = rb3.getText().toString();
            attempted += 1;
            switch(ans3){
                default: wrong += 1;
                    marks -= 0.5;
                    break;
                case "there casting from View type to TextView is happening.": correct += 1;
                    marks += 2;
                    break;

            }
        }
        else{}
        if(selected4 != -1){
            RadioButton rb4 = (RadioButton) findViewById(selected4);
            ans4 = rb4.getText().toString();
            attempted += 1;
            switch(ans4){
                case "Editable": correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
                    break;
            }
        }
        else{}
        if(selected5 != -1){
            RadioButton rb5 = (RadioButton) findViewById(selected5);
            ans5 = rb5.getText().toString();
            attempted += 1;
            switch(ans5){
               default: wrong += 1;
                    marks -= 0.5;
                    break;
                case "HTML": correct += 1;
                    marks += 2;
                    break;
            }
        }
        else{}
        if(selected6 != -1){
            RadioButton rb6 = (RadioButton) findViewById(selected6);
            ans6 = rb6.getText().toString();
            attempted += 1;
            switch(ans6){
                default: wrong += 1;
                    marks -= 0.5;
                    break;
                case "Localization":correct += 1;
                    marks += 2;
                    break;
            }
        }
        else{}
        if(selected7 != -1){
            RadioButton rb7 = (RadioButton) findViewById(selected7);
            ans7 = rb7.getText().toString();
            attempted += 1;
            switch(ans7){
                case "styles.xml": correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
                    break;
            }
        }
        else{}
        if(selected8 != -1){
            RadioButton rb8 = (RadioButton) findViewById(selected8);
            ans8 = rb8.getText().toString();
            attempted += 1;
            switch(ans8){
                case "Toast":correct+= 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
                    break;
            }
        }
        else{}
        if(selected9 != -1){
            RadioButton rb9 = (RadioButton) findViewById(selected9);
            ans9 = rb9.getText().toString();
            attempted += 1;
            switch(ans9){
                default: wrong += 1;
                    marks -= 0.5;
                    break;
                case "Design":correct += 1;
                    marks += 2;
                    break;
            }
        }
        else{}
        if(selected10 != -1){
            RadioButton rb10 = (RadioButton) findViewById(selected10);
            ans10 = rb10.getText().toString();
            attempted += 1;
            switch(ans10){
                default: wrong += 1;
                    marks -= 0.5;
                    break;
                case "TextView Textview = (TextView) findViewById(R.id.txt_id)":correct += 1;
                    marks += 2;
                    break;
            }
        }
        else{}
        goToFinal();
    }
    public void goToFinal(){
        Toast.makeText(this, "Your answers have been submitted", Toast.LENGTH_SHORT).show();
        Intent sub = new Intent(this,FinalAnswer.class);
        startActivity(sub);
        finish();
    }
}
