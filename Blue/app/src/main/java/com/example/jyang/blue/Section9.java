package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Section9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section9);

        TextView section9summary = (TextView) findViewById(R.id.section9summary);
        section9summary.setText("You have selected no CPR or defibrillation, but OK for intubation. " +
                "This is often chosen in individuals with lung conditions where a short period of intubation " +
                "(i.e. days) may be tolerated, but the individual does not want aggressive resuscitation (no CPR). " +
                "Please confirm this is your choice.");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, physicianConfirmation.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button4);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("You have selected no CPR or defibrillation, but OK for intubation. This is often chosen in individuals with lung conditions where a short period of intubation (i.e. days) may be tolerated, but the individual does not want aggressive resuscitation (no CPR). Please confirm this is your choice.", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question1.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button5);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("You have selected no CPR or defibrillation, but OK for intubation. This is often chosen in individuals with lung conditions where a short period of intubation (i.e. days) may be tolerated, but the individual does not want aggressive resuscitation (no CPR). Please confirm this is your choice.", text);
    }
}
