package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        String question = "If you were to die unexpectedly, would you want us to try to bring you back?";
        TextView firstQuestion = (TextView) findViewById(R.id.question1);
        firstQuestion.setText(question);
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, question2.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button4);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("If you were to die unexpectedly, would you want us to try to bring you back?", text);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, question5.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        Button button = (Button) findViewById(R.id.button5);
        String text = (String)button.getText();
        startActivity(intent);
        summaryResults.source.put("If you were to die unexpectedly, would you want us to try to bring you back?", text);
    }

}
