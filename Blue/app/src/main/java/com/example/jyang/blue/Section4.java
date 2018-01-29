package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Section4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section4);

        TextView section4name = (TextView) findViewById(R.id.section4name);
        section4name.setText("Hi " + summaryResults.name + ",");

        TextView section4summary1 = (TextView) findViewById(R.id.section4summary1);
        section4summary1.setText("Your code status is:");

        TextView section4summary2 = (TextView) findViewById(R.id.section4summary2);
        section4summary2.setText("DNR: with comfort care");

        Button button = (Button)findViewById(R.id.continueButton);

        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        physician_confirmation(view);
                    }
                }
        );
    }

    public void physician_confirmation(View view){
        Intent intent = new Intent(this, physicianConfirmation.class);
        startActivity(intent);
    }
}