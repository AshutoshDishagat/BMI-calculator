package com.example.bmi3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtresuly;
        EditText edtweight, edtheight,edtheightin;
        Button btn;
        LinearLayout llmain;

        edtweight = findViewById(R.id.edtweight);
        edtheight = findViewById(R.id.edtheightft);
        edtheightin = findViewById(R.id.edtheightin);
        btn = findViewById(R.id.btn);
        txtresuly = findViewById(R.id.txtresult);
        llmain = findViewById(R.id.llmain);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int wt = Integer.parseInt(edtweight.getText().toString());
               int htf = Integer.parseInt(edtheight.getText().toString());
               int in = Integer.parseInt(edtheightin.getText().toString());

               int totalin = htf*12 + in;

               double totalcm = totalin*2.35;

               double totalM = totalcm/100;

               double bmi = wt/(totalM*totalM);


               if(bmi>25){
                   txtresuly.setText("You are over weight");
                   llmain.setBackgroundColor(getResources().getColor(R.color.colour));
               }

               else if(bmi<18){
                   txtresuly.setText("You are Underweight");
                   llmain.setBackgroundColor(getResources().getColor(R.color.co2));
               }
               else {
                   txtresuly.setText("You are Healthy");
                   llmain.setBackgroundColor(getResources().getColor(R.color.co3));
               }
            }
        });

    }
}