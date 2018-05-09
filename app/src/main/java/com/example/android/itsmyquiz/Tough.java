package com.example.android.itsmyquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Tough extends AppCompatActivity {
    String ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
    static int attempted = 0;
    static int correct = 0;
    static int wrong = 0;
    static float marks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tough);
    }
    public void submittingTough(View view) {

        final RadioGroup r1 = (RadioGroup) findViewById(R.id.rgtq_1);
        int selected1 = r1.getCheckedRadioButtonId();
        if(selected1 != -1)
        {
            RadioButton rg1 = (RadioButton) findViewById(selected1);
            ans1 = rg1.getText().toString();
            attempted += 1;
            switch(ans1){
                case "Alt+Ctrl+l":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r2 = (RadioGroup) findViewById(R.id.rgtq_2);
        int selected2 = r2.getCheckedRadioButtonId();
        if(selected2 != -1)
        {
            RadioButton rg2 = (RadioButton) findViewById(selected2);
            ans2 = rg2.getText().toString();
            attempted += 1;
            switch(ans2){
                case "logcat":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r3 = (RadioGroup) findViewById(R.id.rgtq_3);
        int selected3 = r3.getCheckedRadioButtonId();
        if(selected3 != -1)
        {
            RadioButton rg3 = (RadioButton) findViewById(selected3);
            ans3 = rg3.getText().toString();
            attempted += 1;
            switch(ans3){
                case "onRetriveInstanceState(), onSaveInstanceState()":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r4 = (RadioGroup) findViewById(R.id.rgtq_4);
        int selected4 = r4.getCheckedRadioButtonId();
        if(selected4 != -1)
        {
            RadioButton rg4 = (RadioButton) findViewById(selected4);
            ans4 = rg4.getText().toString();
            attempted += 1;
            switch(ans4){
                case "android:Orientation=\"Vertical\"":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r5 = (RadioGroup) findViewById(R.id.rgtq_5);
        int selected5 = r5.getCheckedRadioButtonId();
        if(selected5 != -1)
        {
            RadioButton rg5 = (RadioButton) findViewById(selected5);
            ans5 = rg5.getText().toString();
            attempted += 1;
            switch(ans5){
                case "because if we want to change the text which is used in multiple places then it will be tough with hardcode strings":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r6 = (RadioGroup) findViewById(R.id.rgtq_6);
        int selected6 = r6.getCheckedRadioButtonId();
        if(selected6 != -1)
        {
            RadioButton rg6 = (RadioButton) findViewById(selected6);
            ans6 = rg6.getText().toString();
            attempted += 1;
            switch(ans6){
                case "New->activity->select type of activity->give name to the activity->click ok":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r7 = (RadioGroup) findViewById(R.id.rgtq_7);
        int selected7 = r7.getCheckedRadioButtonId();
        if(selected7 != -1)
        {
            RadioButton rg7 = (RadioButton) findViewById(selected7);
            ans7 = rg7.getText().toString();
            attempted += 1;
            switch(ans7){
                case "way of displaying image on screen":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r8 = (RadioGroup) findViewById(R.id.rgtq_8);
        int selected8 = r8.getCheckedRadioButtonId();
        if(selected8 != -1)
        {
            RadioButton rg8 = (RadioButton) findViewById(selected8);
            ans8 = rg8.getText().toString();
            attempted += 1;
            switch(ans8){
                case "In the way of positining the child views":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r9 = (RadioGroup) findViewById(R.id.rgtq_9);
        int selected9 = r9.getCheckedRadioButtonId();
        if(selected9 != -1)
        {
            RadioButton rg9 = (RadioButton) findViewById(selected9);
            ans9 = rg9.getText().toString();
            attempted += 1;
            switch(ans9){
                case "only assertion is true":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r10 = (RadioGroup) findViewById(R.id.rgtq_10);
        int selected10 = r10.getCheckedRadioButtonId();
        if(selected10 != -1)
        {
            RadioButton rg10 = (RadioButton) findViewById(selected10);
            ans10 = rg10.getText().toString();
            attempted += 1;
            switch(ans10){
                case "16-textviews,1-image,3-buttons,2-radiobuttons,1-checkbox,3-popup lists":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}

       goToTough();
    }
    public void goToTough(){
        Intent in = new Intent(this,FinalT.class);
        startActivity(in);
        finish();
    }
}
