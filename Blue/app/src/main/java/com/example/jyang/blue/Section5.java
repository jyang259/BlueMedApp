package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Section5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section5);

        TextView section5name = (TextView) findViewById(R.id.section5name);
        section5name.setText("Hi " + summaryResults.name + ",");

        TextView section5summary1 = (TextView) findViewById(R.id.section5summary1);
        section5summary1.setText("Your code status is:");

        TextView section5summary2 = (TextView) findViewById(R.id.section5summary2);
        section5summary2.setText("DNR: with full medical treatment");

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