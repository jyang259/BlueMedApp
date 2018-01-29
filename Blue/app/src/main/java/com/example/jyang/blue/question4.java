package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class question4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);

        TextView fourthQuestion = (TextView) findViewById(R.id.question4);
        fourthQuestion.setText("If you were to suddenly stop breathing, would you want to be connected to a ventilator?");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, Section2.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button4);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("If you were to suddenly stop breathing, would you want to be connected to a ventilator?", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, Section2.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button5);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("If you were to suddenly stop breathing, would you want to be connected to a ventilator?", text);
    }
}
