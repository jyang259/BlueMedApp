package com.example.jyang.blue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.beginButton);

        button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View view){
                        beginApp(view);
                    }
                }
        );
    }

    public void beginApp(View view){
        Intent intent = new Intent(this, collectInfo.class);
        startActivity(intent);
    }
}
