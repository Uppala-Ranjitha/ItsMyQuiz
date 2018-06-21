package com.example.android.itsmyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.content.Intent;
import android.widget.Toast;

public class Medium extends AppCompatActivity {
    String ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10;
    static int attempted = 0;
    static int correct = 0;
    static int wrong = 0;
    static float marks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);
    }
    public void Submitting1(View view) {
        final EditText r1 = (EditText) findViewById(R.id.emq_1);
        if(r1.getText().toString().isEmpty()) {}
        else{
            attempted += 1;
            if (r1.getText().toString().equals("isChecked()")) {
                correct += 1;
                marks += 2;
            } else {
                wrong += 1;
                marks -= 0.5;
            }
        }
        final RadioGroup r2 = (RadioGroup) findViewById(R.id.rgmq_2);
        int selected2 = r2.getCheckedRadioButtonId();
        if(selected2 != -1){
            RadioButton rg2 = (RadioButton) findViewById(selected2);
            ans2 = rg2.getText().toString();
            attempted += 1;
            switch(ans2){
                case "R.string.m2_op4":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r3 = (RadioGroup) findViewById(R.id.rgmq_3);
        int selected3 = r3.getCheckedRadioButtonId();
        if(selected3 != -1){
            RadioButton rg3 = (RadioButton) findViewById(selected3);
            ans3 = rg3.getText().toString();
            attempted += 1;
            switch(ans3){
                case "":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final EditText r4 = (EditText) findViewById(R.id.emq_4);
        if(r4.getText().toString().isEmpty()) {}
        else{
            attempted += 1;
            if (r4.getText().toString().toLowerCase().equals("extensible markup language")) {
                correct += 1;
                marks += 2;
            } else {
                wrong += 1;
                marks -= 0.5;
            }
        }
        final RadioGroup r5 = (RadioGroup) findViewById(R.id.rgmq_5);
        int selected5 = r5.getCheckedRadioButtonId();
        if(selected5 != -1){
            RadioButton rg5 = (RadioButton) findViewById(selected5);
            ans5 = rg5.getText().toString();
            attempted += 1;
            switch(ans5){
                case "Camel shape":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final EditText r6 = (EditText) findViewById(R.id.emq_6);
        if(r6.getText().toString().isEmpty()) {}
        else{
            attempted += 1;
            if (r6.getText().toString().toLowerCase().equals("resource strings")) {
                correct += 1;
                marks += 2;
            } else {
                wrong += 1;
                marks -= 0.5;
            }
        }
        final RadioGroup r7 = (RadioGroup) findViewById(R.id.rgmq_7);
        int selected7 = r7.getCheckedRadioButtonId();
        if(selected7 != -1){
            RadioButton rg7 = (RadioButton) findViewById(selected7);
            ans7 = rg7.getText().toString();
            attempted += 1;
            switch(ans7){
                case "b,c,d only":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r8 = (RadioGroup) findViewById(R.id.rgmq_8);
        int selected8 = r8.getCheckedRadioButtonId();
        if(selected8 != -1){
            RadioButton rg8 = (RadioButton) findViewById(selected8);
            ans8 = rg8.getText().toString();
            attempted += 1;
            switch(ans8){
                case "":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r9 = (RadioGroup) findViewById(R.id.rgmq_9);
        int selected9 = r9.getCheckedRadioButtonId();
        if(selected9 != -1){
            RadioButton rg9 = (RadioButton) findViewById(selected9);
            ans9 = rg9.getText().toString();
            attempted += 1;
            switch(ans9){
                case "Intent in = new Intent(this,Activityname.class);":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        final RadioGroup r10 = (RadioGroup) findViewById(R.id.rgmq_10);
        int selected10 = r10.getCheckedRadioButtonId();
        if(selected10 != -1){
            RadioButton rg10 = (RadioButton) findViewById(selected10);
            ans10 = rg10.getText().toString();
            attempted += 1;
            switch(ans10){
                case "RadioGroup and RadioButton":correct += 1;
                    marks += 2;
                    break;
                default:wrong += 1;
                    marks -= 0.5;
            }
        }
        else{}
        goToFinal1();
    }
    public void goToFinal1(){
        Toast.makeText(this, "You results have been submitted", Toast.LENGTH_SHORT).show();
        Intent sub1 = new Intent(this,FinalAnswer1.class);
        startActivity(sub1);
        finish();
    }
}
