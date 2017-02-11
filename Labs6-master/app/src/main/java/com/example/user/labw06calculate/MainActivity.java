package com.example.user.labw06calculate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button plus, minus, umnogit, deleniye, dvoichnuy, mod, xor, rezVx;
    EditText X, Y, rez;
    double x, y, REZ;
    int a, b, REZ3;
    String REZ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        umnogit = (Button) findViewById(R.id.umnogit);
        deleniye = (Button) findViewById(R.id.deleniye);
        dvoichnuy = (Button) findViewById(R.id.dvoichnuy);
        mod = (Button) findViewById(R.id.mod);
        xor = (Button) findViewById(R.id.xor);
        rezVx = (Button) findViewById(R.id.rezVx);


        X = (EditText) findViewById(R.id.X);
        Y = (EditText) findViewById(R.id.Y);
        rez = (EditText) findViewById(R.id.rez);

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    x = Double.parseDouble(X.getText().toString());
                    y = Double.parseDouble(Y.getText().toString());

                } catch (NumberFormatException e) {
                    x = 0;
                    y = 0;
                }

                REZ = x + y;
                rez.setText("" + REZ);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    x = Double.parseDouble(X.getText().toString());
                    y = Double.parseDouble(Y.getText().toString());

                } catch (NumberFormatException e) {
                    x = 0;
                    y = 0;
                }

                REZ = x - y;
                rez.setText("" + REZ);
            }
        });

        umnogit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    x = Double.parseDouble(X.getText().toString());
                    y = Double.parseDouble(Y.getText().toString());

                } catch (NumberFormatException e) {
                    x = 0;
                    y = 0;
                }

                REZ = x * y;
                rez.setText("" + REZ);
            }
        });

        deleniye.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    x = Double.parseDouble(X.getText().toString());
                    y = Double.parseDouble(Y.getText().toString());

                } catch (NumberFormatException e) {
                    x = 0;
                    y = 0;
                }

                REZ = x / y;
                rez.setText("" + REZ);
            }
        });

        dvoichnuy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    x = Double.parseDouble(X.getText().toString());

                } catch (NumberFormatException e) {
                    x = 0;
                }

                a = (int)x;
                REZ2 = Integer.toBinaryString(a);
                rez.setText("" + REZ2);
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    x = Double.parseDouble(X.getText().toString());
                    y = Double.parseDouble(Y.getText().toString());

                } catch (NumberFormatException e) {
                    x = 0;
                    y = 0;
                }

                REZ = x % y ;
                rez.setText("" + REZ);
            }
        });

        xor.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    x = Double.parseDouble(X.getText().toString());
                    y = Double.parseDouble(Y.getText().toString());

                } catch (NumberFormatException e) {
                    x = 0;
                    y = 0;
                }

                a = (int)x;
                b = (int)y;
                REZ3 = a ^ b;
                rez.setText("" + REZ3);
            }
        });

        rezVx.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    x = Double.parseDouble(rez.getText().toString());

                } catch (NumberFormatException e) {
                    x = 0;
                }

                X.setText("" + x);
                rez.setText("");
            }
        });
    }


}
