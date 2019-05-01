package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1;
    private EditText editText2;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.ma_et1);
        editText2 = findViewById(R.id.ma_et2);
        button = findViewById(R.id.ma_b);

        button.setOnClickListener(this);

        Button dialogButton = findViewById(R.id.button);
        dialogButton.setOnClickListener((view) -> {
            AlertDialog.Builder  builder= new AlertDialog.Builder(MainActivity.this);
            builder
                    .setTitle("Заголовок окна")
                    .setMessage("Сообщение в окне")
                    .setIcon(android.R.drawable.ic_dialog_info)
                    .setPositiveButton("Да", (dialog, which) -> System.out.println("Вы нажали Да " + which))
                    .setNegativeButton("Нет", (dialog, which) -> System.out.println("Вы нажали Нет " + which));
            builder.create().show();
        });
    }

    @Override
    public void onClick(View v) {
        String first = editText1.getText().toString();
        String second = editText2.getText().toString();

        long firstNumber = Long.parseLong(first);
        long secondNumber = Long.parseLong(second);

        Intent i = new Intent(this, BackActivity.class);
        i.putExtra("result", Long.toString(firstNumber + secondNumber));
        startActivity(i);
    }

}
