package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BackActivity extends AppCompatActivity  {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        textView = findViewById(R.id.ba_tv);
        Intent i = getIntent();

        String result = i.getStringExtra("result");
        textView.setText(result);
    }


    public void onCl(View v){
        finish();
    }
}
