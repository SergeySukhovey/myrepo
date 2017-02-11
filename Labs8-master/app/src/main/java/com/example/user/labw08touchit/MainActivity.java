package com.example.user.labw08touchit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnTouchListener {
    TextView parametrs;
    LinearLayout cordinats;
    float x, y, xDown, yDown, xMove, yMove, xUp, yUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        parametrs = (TextView) findViewById(R.id.parametrs);
        cordinats = (LinearLayout) findViewById(R.id.cordinats);

        cordinats.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        x = event.getX();
        y = event.getY();

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                xDown = x;
                yDown = y;
                parametrs.setX(x);
                parametrs.setY(y);
                break;
            case MotionEvent.ACTION_MOVE:
                xMove = x;
                yMove = y;
                parametrs.setX(x);
                parametrs.setY(y);
                break;
            case MotionEvent.ACTION_UP:
                xUp = x;
                yUp = y;
                parametrs.setX(x);
                parametrs.setY(y);
                break;
            case MotionEvent.ACTION_CANCEL:
                xUp = 0;
                yUp = 0;
                xMove = 0;
                yMove = 0;
                xDown = 0;
                yDown = 0;
                break;
        }
        parametrs.setText("Down: " + xDown + " " + yDown + "\nMove: " + xMove + " " + yMove + "\nUp: " + xUp + " " + yUp);
        return true;
    }
}
