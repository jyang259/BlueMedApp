package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Section2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section2);

        if((summaryResults.source.get("If you were to die unexpectedly, would you want us to try to bring you back?").equals("Yes, I want this.")) &&
                (summaryResults.source.get("If you were to suddenly stop breathing, would you want to be connected to a ventilator?").equals("Yes, I want this."))){

            TextView section2name = (TextView) findViewById(R.id.section2name);
            section2name.setText("Hi " + summaryResults.name + ",");

            TextView section2summary1 = (TextView) findViewById(R.id.section2summary1);
            section2summary1.setText("Your code status is:");

            TextView section2summary2 = (TextView) findViewById(R.id.section2summary2);
            section2summary2.setText("Full Code: CPR including intubation");

            Button button = (Button)findViewById(R.id.continueButton);

            button.setOnClickListener(
                    new View.OnClickListener(){
                        public void onClick(View view){
                            physician_confirmation(view);
                        }
                    }
            );
        }

        if(summaryResults.source.get("If you were to die unexpectedly, would you want us to try to bring you back?").equals("Yes, I want this.") &&
                summaryResults.source.get("If you were to suddenly stop breathing, would you want to be connected to a ventilator?").equals("No, I don't want this.")){

            TextView section2name = (TextView) findViewById(R.id.section2name);
            section2name.setText("Hi " + summaryResults.name + ",");

            TextView section2summary1 = (TextView) findViewById(R.id.section2summary1);
            section2summary1.setText("Your code status is:");

            TextView section2summary2 = (TextView) findViewById(R.id.section2summary2);
            section2summary2.setText("CPR with no intubation");

            Button button = (Button)findViewById(R.id.continueButton);

            button.setOnClickListener(
                    new View.OnClickListener(){
                        public void onClick(View view){
                            nextPage1(view);
                        }
                    }
            );
        }

        if(summaryResults.source.get("If you were to die unexpectedly, would you want us to try to bring you back?").equals("No, I don't want this." ) &&
                summaryResults.source.get("If you were to suddenly stop breathing, would you want to be connected to a ventilator?").equals("No, I don't want this.") &&
                summaryResults.source.get("If your heart suddenly went very fast, would you want a shock to the heart?").equals("No, I don't want this.")){

            Button button = (Button)findViewById(R.id.continueButton);

            button.setOnClickListener(
                    new View.OnClickListener(){
                        public void onClick(View view){
                            nextPage2(view);
                        }
                    }
            );
        }

        if(summaryResults.source.get("If you were to die unexpectedly, would you want us to try to bring you back?").equals("No, I don't want this.") &&
                summaryResults.source.get("If you were to suddenly stop breathing, would you want to be connected to a ventilator?").equals("Yes, I want this.") &&
                summaryResults.source.get("If your heart suddenly went very fast, would you want a shock to the heart?").equals("Yes, I want this.")){

            TextView section2name = (TextView) findViewById(R.id.section2name);
            section2name.setText("Hi " + summaryResults.name + ",");

            TextView section2summary1 = (TextView) findViewById(R.id.section2summary1);
            section2summary1.setText("Your code status is:");

            TextView section2summary2 = (TextView) findViewById(R.id.section2summary2);
            section2summary2.setText("No CPR, but okay for intubation and defibrillation.");

            Button button = (Button)findViewById(R.id.continueButton);

            button.setOnClickListener(
                    new View.OnClickListener(){
                        public void onClick(View view){
                            nextPage3(view);
                        }
                    }
            );
        }

        if(summaryResults.source.get("If you were to die unexpectedly, would you want us to try to bring you back?").equals("No, I don't want this.") &&
                summaryResults.source.get("If you were to suddenly stop breathing, would you want to be connected to a ventilator?").equals("No, I don't want this.") &&
                summaryResults.source.get("If your heart suddenly went very fast, would you want a shock to the heart?").equals("Yes, I want this.")){

            TextView section2name = (TextView) findViewById(R.id.section2name);
            section2name.setText("Hi " + summaryResults.name + ",");

            TextView section2summary1 = (TextView) findViewById(R.id.section2summary1);
            section2summary1.setText("Your code status is:");

            TextView section2summary2 = (TextView) findViewById(R.id.section2summary2);
            section2summary2.setText("DNR: No CPR or intubation, but okay for defibrillation.");

            Button button = (Button)findViewById(R.id.continueButton);

            button.setOnClickListener(
                    new View.OnClickListener(){
                        public void onClick(View view){
                            nextPage5(view);
                        }
                    }
            );
        }

        if(summaryResults.source.get("If you were to die unexpectedly, would you want us to try to bring you back?").equals("No, I don't want this.") &&
                summaryResults.source.get("If you were to suddenly stop breathing, would you want to be connected to a ventilator?").equals("Yes, I want this.") &&
                summaryResults.source.get("If your heart suddenly went very fast, would you want a shock to the heart?").equals("No, I don't want this.")){

            TextView section2name = (TextView) findViewById(R.id.section2name);
            section2name.setText("Hi " + summaryResults.name + ",");

            TextView section2summary1 = (TextView) findViewById(R.id.section2summary1);
            section2summary1.setText("Your code status is:");

            TextView section2summary2 = (TextView) findViewById(R.id.section2summary2);
            section2summary2.setText("DNR: No CPR or defibrillation, but okay for intubation.");

            Button button = (Button)findViewById(R.id.continueButton);

            button.setOnClickListener(
                    new View.OnClickListener(){
                        public void onClick(View view){
                            nextPage4(view);
                        }
                    }
            );
        }

    }

    public void nextPage1(View view){
        Intent intent = new Intent(this, Section6.class);
        startActivity(intent);
    }

    public void nextPage2(View view){
        Intent intent = new Intent(this, question5.class);
        startActivity(intent);
    }

    public void nextPage3(View view){
        Intent intent = new Intent(this, Section7.class);
        startActivity(intent);
    }

    public void nextPage4(View view){
        Intent intent = new Intent(this, Section8.class);
        startActivity(intent);
    }

    public void nextPage5(View view){
        Intent intent = new Intent(this, Section9.class);
        startActivity(intent);
    }

    public void physician_confirmation(View view){
        Intent intent = new Intent(this, physicianConfirmation.class);
        startActivity(intent);
    }
}
