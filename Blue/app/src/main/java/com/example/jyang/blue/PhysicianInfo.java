package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhysicianInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physician_info);

        Button button = (Button)findViewById(R.id.button3);
        final EditText editTextName = (EditText)findViewById(R.id.editText4);
        final EditText editTextAddress = (EditText)findViewById(R.id.editText5);
        final EditText editTextContact = (EditText) findViewById(R.id.editText6);
        final EditText editTextCPSID = (EditText) findViewById(R.id.editText7);

        button.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String textName = editTextName.getText().toString();
                        summaryResults.physName = textName;

                        String textAddress = editTextAddress.getText().toString();
                        summaryResults.physAddress = textAddress;

                        String textContact = editTextContact.getText().toString();
                        summaryResults.physContact = textContact;

                        String textCPSID = editTextCPSID.getText().toString();
                        summaryResults.physCPSID = textCPSID;

                        sendMessage(view);
                    }
                });
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, summaryPrintResults.class);
        startActivity(intent);
    }

}
