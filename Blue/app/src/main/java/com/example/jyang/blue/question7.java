package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class question7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question7);

        TextView seventhQuestion = (TextView) findViewById(R.id.question7);
        seventhQuestion.setText("If you needed strong medications to maintain your blood pressure or heart, would you want to get this treatment?");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, Section4.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button4);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("If you needed strong medications to maintain your blood pressure or heart, would you want to get this treatment?", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, Section5.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button5);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("If you needed strong medications to maintain your blood pressure or heart, would you want to get this treatment?", text);
    }
}
