package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class collectInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collect_info);

        Button button = (Button)findViewById(R.id.button3);
        final EditText editText = (EditText)findViewById(R.id.editText4);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String text = editText.getText().toString();
                        summaryResults.name = text;
                        sendMessage(view);
                    }
                });
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, question1.class);
        startActivity(intent);
    }
}
