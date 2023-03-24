package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonEqual, buttonClear;
    private TextView textView;
    private String operand1, operand2, operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonEqual = findViewById(R.id.buttonEquals);
        buttonClear =findViewById(R.id.buttonClear);
        textView = findViewById(R.id.textView);

        // Initializing operands and operator
        operand1 = "";
        operand2 = "";
        operator = "";

        // Setting onClickListener for buttons
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("2");
            }
        });
         button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.append("4");
                }
            });

        button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.append("5");
                }
            });

        button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.append("6");
                }
            });

        button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.append("7");
                }
            });

        button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.append("8");
                }
            });

        button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.append("9");
                }
            });

        button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.append("0");
                }
            });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (textView.getText().toString().equals("")) {
                        return;
                    }
                    operand1 = textView.getText().toString();
                    operator = "+";
                    textView.setText("");
                }
            });

        buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (textView.getText().toString().equals("")) {
                        return;
                    }
                    operand1 = textView.getText().toString();
                    operator = "-";
                    textView.setText("");
                }
            });

        buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (textView.getText().toString().equals("")) {
                        return;
                    }
                    operand1 = textView.getText().toString();
                    operator = "*";
                    textView.setText("");
                }
            });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (textView.getText().toString().equals("")) {
                        return;
                    }
                    operand1 = textView.getText().toString();
                    operator = "/";
                    textView.setText("");
                }
            });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (textView.getText().toString().equals("")) {
                        return;
                    }
                    operand2 = textView.getText().toString();
                    double op1 = Double.parseDouble(operand1);
                    double op2 = Double.parseDouble(operand2);
                    double result = 0.0;
                    if (operator.equals("+")) {
                        result = op1 + op2;
                    } else if (operator.equals("-")) {
                        result = op1 - op2;
                    } else if (operator.equals("*")) {
                        result = op1 * op2;
                    } else if (operator.equals("/")) {
                        result = op1 / op2;
                    }
                    textView.setText(String.valueOf(result));
                }
            });

        buttonClear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    operand1 = "";
                    operand2 = "";
                    operator = "";
                    textView.setText("");
                }
            });
        }
    }