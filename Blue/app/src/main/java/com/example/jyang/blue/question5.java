package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class question5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question5);

        TextView fifthQuestion = (TextView) findViewById(R.id.question5);
        fifthQuestion.setText("It sounds like you prefer a natural death and do not want aggressive and potentially painful treatment. You will still receive medical treatment, but not CPR, defibrillation, or intubation.");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, question6.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button4);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("It sounds like you prefer a natural death and do not want aggressive and potentially painful treatment. You will still receive medical treatment, but not CPR, defibrillation, or intubation.", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question1.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button5);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("It sounds like you prefer a natural death and do not want aggressive and potentially painful treatment. You will still receive medical treatment, but not CPR, defibrillation, or intubation.", text);
    }

}
