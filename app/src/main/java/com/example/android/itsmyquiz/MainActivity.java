package com.example.android.itsmyquiz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

import org.w3c.dom.Text;
public class MainActivity extends AppCompatActivity {
    String msg = "Instructions: \n 1.Read all instructions carefully. \n 2.You must select one of the modes of the question paper. \n 3.You will be alloted with 10 questions. \n 4.For evert correct answer you will be awarded with 2 marksi.e the exam is for 20 marks. \n 5.For every wrong answer you will loose 0.5 marks. \n 6.Once you start your quiz tehn you can't change your paper mode.\n 7.Once you submit your answer then can't modify your answers. ";
    static String mode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt = (TextView) findViewById(R.id.text_id);
        txt.setText(msg);
    }
    public void StartQuiz(View view){
        //creating a reference for radiogroup of gender to get the selected gender.
        final RadioGroup rg0 = (RadioGroup) findViewById(R.id.gender_radio_group);
        final RadioGroup rg1 = (RadioGroup) findViewById(R.id.modes);
        // getting the id of selected option in the radiogroup
        int genderSelected = rg0.getCheckedRadioButtonId();
        int modeSelected = rg1.getCheckedRadioButtonId();
        //if no option is selected then radiogroup returns -1
        if(genderSelected == -1){
            Context context = getApplicationContext();
            CharSequence text = "Sex is not selected, select the your gender";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
        if(modeSelected != -1){
            RadioButton rb = (RadioButton) findViewById(modeSelected);
            mode = rb.getText().toString();
           switch(mode){
               case "easy":Intent easyMode = new Intent(this,Easy.class);
                   startActivity(easyMode);
                   finish();
                   break;
               case "medium":Intent mediumMode = new Intent(this,Medium.class);
                   startActivity(mediumMode);
                   finish();
                   break;
               case "tough":Intent toughMode = new Intent(this,Tough.class);
                   startActivity(toughMode);
                   finish();
                   break;
           }
        }
        else{
            Context context = getApplicationContext();
            CharSequence text = "You have to select any mode of paper";
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }
    public static String modeGroup = "mode";
    public void onSaveInstanceState(Bundle savedInstanceState){
        savedInstanceState.putString(modeGroup,mode);
        super.onSaveInstanceState(savedInstanceState);
    }
}
