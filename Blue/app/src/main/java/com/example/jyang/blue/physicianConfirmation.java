package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class physicianConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physician_confirmation);
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, PhysicianInfo.class);
        summaryResults.phys = "Yes";
        startActivity(intent);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, summaryPrintResults.class);
        summaryResults.phys = "No";
        startActivity(intent);
    }
}
