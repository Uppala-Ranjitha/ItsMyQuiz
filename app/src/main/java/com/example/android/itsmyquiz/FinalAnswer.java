package com.example.android.itsmyquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FinalAnswer extends AppCompatActivity {
    int ecrt = Easy.correct;
    int ewrng = Easy.wrong;
    int eatmpt = Easy.attempted;
    float etotal = Easy.marks;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_answer);
        TextView eat = (TextView) findViewById(R.id.attempt_number);
        eat.setText("" + eatmpt);
        TextView ecr =(TextView) findViewById(R.id.correct_number);
        ecr.setText("" + ecrt);
        TextView ewr =(TextView) findViewById(R.id.wrong_number);
        ewr.setText("" + ewrng);
        etotal = (float) etotal;
        String tot = Float.toString(etotal);
        TextView et = (TextView) findViewById(R.id.total_marks_number);
        et.setText("" + tot);
        if(etotal <= 0){
            TextView grd =(TextView) findViewById(R.id.Grade_value);
            grd.setText(""+"F");
        }
        if((etotal > 0)&& (etotal <= 5)){
            TextView grd =(TextView) findViewById(R.id.Grade_value);
            grd.setText(""+"B");
        }
        if((etotal> 5) && (etotal <=  10)){
            TextView grd =(TextView) findViewById(R.id.Grade_value);
            grd.setText(""+"A");
        }
        if((etotal >10) && (etotal <= 15)){
            TextView grd =(TextView) findViewById(R.id.Grade_value);
            grd.setText(""+"G");
        }
        if((etotal > 15) && (etotal <= 20)){
            TextView grd =(TextView) findViewById(R.id.Grade_value);
            grd.setText(""+"E");
        }
    }

}
