package com.example.android.itsmyquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FinalAnswer1 extends AppCompatActivity {
    int mcrt = Medium.correct;
    int mwrng = Medium.wrong;
    int matmpt = Medium.attempted;
    float mtotal = Medium.marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_answer1);
        TextView mat = (TextView) findViewById(R.id.attempt_number_m);
        mat.setText("" + matmpt);
        TextView mcr =(TextView) findViewById(R.id.correct_number_m);
        mcr.setText("" + mcrt);
        TextView mwr =(TextView) findViewById(R.id.wrong_number_m);
        mwr.setText("" + mwrng);
        mtotal = (float) mtotal;
        String tot = Float.toString(mtotal);
        TextView mt = (TextView) findViewById(R.id.total_marks_number_m);
        mt.setText("" + tot);
        if(mtotal <= 0){
            TextView grd =(TextView) findViewById(R.id.Grade_value_m);
            grd.setText(""+"F");
        }
        if((mtotal > 0)&& (mtotal <= 5)){
            TextView grd =(TextView) findViewById(R.id.Grade_value_m);
            grd.setText(""+"B");
        }
        if((mtotal> 5) && (mtotal <=  10)){
            TextView grd =(TextView) findViewById(R.id.Grade_value_m);
            grd.setText(""+"A");
        }
        if((mtotal >10) && (mtotal <= 15)){
            TextView grd =(TextView) findViewById(R.id.Grade_value_m);
            grd.setText(""+"G");
        }
        if((mtotal > 15) && (mtotal <= 20)){
            TextView grd =(TextView) findViewById(R.id.Grade_value_m);
            grd.setText(""+"E");
        }
    }

}
