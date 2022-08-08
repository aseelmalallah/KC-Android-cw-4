package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);

        TextView x = findViewById(R.id.CALCULATOR);

        TextView Y = findViewById(R.id.TOTAL);

        EditText Z = findViewById(R.id.num1);

        EditText N = findViewById(R.id.second);

        Button G = findViewById(R.id.CALCULATE);

        G.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(Z.getText().toString());
                int num2 = Integer.parseInt(N.getText().toString());

                int result = num1 + num2;

                Y.setText(String.valueOf(result));
            }
        });



    }
}