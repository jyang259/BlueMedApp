package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Section6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section6);

        TextView section6summary = (TextView) findViewById(R.id.section6summary);
        section6summary.setText("You have selected CPR with no intubation. " +
                "It can be very difficult to perform CPR without intubation (placing tube down the throat) " +
                "because these two treatments are often performed together. Please confirm this is your choice.");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, physicianConfirmation.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button4);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("You have selected CPR with no intubation. It can be very difficult to perform CPR without intubation (placing tube down the throat) because these two treatments are often performed together. Please confirm this is your choice.", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question1.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button5);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("You have selected CPR with no intubation. It can be very difficult to perform CPR without intubation (placing tube down the throat) because these two treatments are often performed together. Please confirm this is your choice.", text);
    }
}
