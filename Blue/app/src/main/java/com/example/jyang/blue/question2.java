package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        TextView secondQuestion = (TextView) findViewById(R.id.question2);
        secondQuestion.setText("If your heart were to suddenly stop beating, would you want CPR?");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, question4.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button4);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("If your heart were to suddenly stop beating, would you want CPR?", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question3.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button5);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("If your heart were to suddenly stop beating, would you want CPR?", text);
    }
}
