package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class question6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);

        TextView sixthQuestion = (TextView) findViewById(R.id.question6);
        sixthQuestion.setText("Do you want full medical treatment, including medications for infections (antibiotics) and other ailments?");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, question7.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button4);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("Do you want full medical treatment, including medications for infections (antibiotics) and other ailments?", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question8.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button5);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("Do you want full medical treatment, including medications for infections (antibiotics) and other ailments?", text);
    }

}
