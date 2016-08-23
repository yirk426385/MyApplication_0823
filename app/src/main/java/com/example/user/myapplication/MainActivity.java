package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView infotext;
    EditText nameEditText;
    RadioGroup optionsGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_main);

        infotext = (TextView)findViewById(R.id.infoText);
        nameEditText = (EditText)findViewById(R.id.nameEditText);
        optionsGroup = (RadioGroup)findViewById(R.id.optionsGroup);
        Button confirmBtn =(Button)findViewById(R.id.confirmButton);
        confirmBtn.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {

    }
}
