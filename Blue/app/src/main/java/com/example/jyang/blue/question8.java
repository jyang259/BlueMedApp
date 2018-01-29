package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class question8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question8);

        TextView eighthQuestion = (TextView) findViewById(R.id.question8);
        eighthQuestion.setText("You have selected that you do not want medical treatment. You will still receive medications to help make you comfortable.");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, Section3.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button4);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("You have selected that you do not want medical treatment. You will still receive medications to help make you comfortable.", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question6.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button5);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("You have selected that you do not want medical treatment. You will still receive medications to help make you comfortable.", text);
    }

}
