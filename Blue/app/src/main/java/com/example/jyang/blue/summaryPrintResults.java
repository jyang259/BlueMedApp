package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Iterator;
import java.util.Map;

public class summaryPrintResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary_print_results);

        if(summaryResults.phys.equals("Yes")){
            TextView physInfoText = (TextView) findViewById(R.id.physicianInfo);
            summaryResults.summaryTextPhys = "Physician Information:" + "\n" +
                    "Name: " + summaryResults.physName + "\n" +
                    "Address:" + summaryResults.physAddress + "\n" +
                    "Contact:" + summaryResults.physContact + "\n" +
                    "CPSID*:" + summaryResults.physCPSID + "\n";
            physInfoText.setText(summaryResults.summaryTextPhys);
        }
        else{
            TextView physInfoText = (TextView) findViewById(R.id.physicianInfo);
            summaryResults.summaryTextPhys = "Physician Information:" + "\n" + "Please provide physician information once available.";
            physInfoText.setText(summaryResults.summaryTextPhys);
        }

        TextView text = (TextView)findViewById(R.id.results);
        Iterator it = summaryResults.source.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry)it.next();
            summaryResults.summaryText = summaryResults.summaryText + pair.getKey() + " : " + pair.getValue() + "\n\n";
        }
        text.setText(summaryResults.summaryText);
    }

    @Override
    public void onBackPressed() {
        TextView text = (TextView)findViewById(R.id.results);
        text.setText("");
        summaryResults.summaryText = "";
        super.onBackPressed();
    }

    public void signnow(View view) {
        Intent intent = new Intent(this, ending.class);
        startActivity(intent);
    }

}
