package com.example.hw_android_2_7_calculator;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Double firstVar, secondVar;
    private Boolean isOperationClick;
    private String operation;
    private Button next, equal1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        next = findViewById(R.id.btn_next);
        textView = findViewById(R.id.text_view);
        Log.d("homework", "onCreate MainActivity");
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String result  = textView.getText().toString();
                Intent intent = new Intent(MainActivity.this, MainActivit2.class);
                intent.putExtra("kay1", result);
               startActivity(intent);

            }
        });

    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("homework", "onStart MainActivity");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("homework", "onResume MainActivity");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("homework", "onPause MainActivity");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("homework", "onStop MainActivity");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("homework", "onRestart MainActivity");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("homework", "onDestroy MainActivity");
    }



    public void onClickNumber(View view) {
        switch (view.getId()) {
            case R.id.btn_one:
                setNumber("1");
                break;

            case R.id.btn_two:
                setNumber("2");
                break;

            case R.id.btn_three:
                setNumber("3");
                break;

            case R.id.btn_four:
                setNumber("4");
                break;

            case R.id.btn_five:
                setNumber("5");
                break;

            case R.id.btn_six:
                setNumber("6");
                break;

            case R.id.btn_seven:
                setNumber("7");
                break;

            case R.id.btn_eigth:
                setNumber("8");
                break;

            case R.id.btn_nine:
                setNumber("9");
                break;

            case R.id.btn_zero:
                setNumber("0");
                break;

            case R.id.btn_clear:
                textView.setText("0");
                isOperationClick = false;
                firstVar = 0.0;
                secondVar = 0.0;
                break;
        }
        next.setVisibility(View.GONE);

    }


    public void onClickOperation(View view) {
        switch (view.getId()) {
            case R.id.btn_plus:
                firstVar = Double.parseDouble(textView.getText().toString());
                isOperationClick = true;
                operation = "+";
                break;

            case R.id.btn_minus:
                firstVar = Double.parseDouble(textView.getText().toString());
                isOperationClick = true;
                operation = "-";
                break;

            case R.id.btn_division:
                firstVar = Double.parseDouble(textView.getText().toString());
                isOperationClick = true;
                operation = "/";
                break;

            case R.id.btn_multiplication:
                firstVar = Double.parseDouble(textView.getText().toString());
                isOperationClick = true;
                operation = "*";
                break;

            case R.id.btn_percent:
                firstVar = Double.parseDouble(textView.getText().toString());
                isOperationClick = true;
                operation = "%";
                break;


            case R.id.btn_equal:
                secondVar = Double.parseDouble(textView.getText().toString());
                Double result = 0.0;
                next.setVisibility(View.VISIBLE);


                switch (operation) {
                    case "+":
                        result = firstVar + secondVar;
                        textView.setText(result.toString());
                        break;

                    case "-":
                        result = firstVar - secondVar;
                        textView.setText(result.toString());
                        break;

                    case "/":
                        result = firstVar / secondVar;
                        textView.setText(result.toString());
                        break;

                    case "*":
                        result = firstVar * secondVar;
                        textView.setText(result.toString());
                        break;

                    case "%":
                        result = firstVar / 100.0f;
                        textView.setText(result.toString());
                        break;
                }

        }
    }
    private void setNumber(String number) {
        if (textView.getText().toString().equals("0")) {
            textView.setText(number);
        } else if (isOperationClick) {
            textView.setText(number);
        } else {
            textView.append(number);
        }
        isOperationClick = false;

    }
}

