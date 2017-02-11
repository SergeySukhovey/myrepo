package com.example.user.labw10graphik;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;


public class MainActivity extends Activity implements View.OnTouchListener {

    Paint p;
    int mywidth = 0, myheight = 0, x, y, xDown = 0, yDown = 0, xMove, yMove, xUp, yUp, n = 0, h2, w2;
    String s;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mm = new misha(this);
        setContentView(mm);
        mm.setOnTouchListener(this);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        x = (int) event.getX();   // текущая координата X пальца
        y = (int) event.getY();   // текущая координата Y пальца

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: // нажатие
                // здесь делаем что-то, чтобы обработать событие нажатия
                n++;
                xDown = x;
                yDown = y;
                mm.invalidate();
                break;
            case MotionEvent.ACTION_MOVE: // движение
                // здесь обработываем событие перемещения пальца
                xMove = x;
                yMove = y;
                break;
            case MotionEvent.ACTION_UP: // отпускание
                // здесь делаем что-то, чтобы обработать событие отпускания
                xUp = x;
                yUp = y;
                break;
            case MotionEvent.ACTION_CANCEL:
                // событие отмены
                xUp = 0;
                yUp = 0;
                xMove = 0;
                yMove = 0;
                xDown = 0;
                yDown = 0;
                break;
        }
        // здесь можем вывести нужные надписи
        s = xDown + " " + yDown + " число нажатий: " + n;
        return true;
    }

    class misha extends View {

        public misha(Context context) {
            super(context);
            p = new Paint();
        }

        @Override
        protected void onSizeChanged(int w, int h, int oldw, int oldh) {
            mywidth = w;
            myheight = h;
            super.onSizeChanged(w, h, oldw, oldh);
        }

        @Override
        protected void onDraw(Canvas canvas)
        {
            canvas.drawARGB(80, 102, 204, 255);
            p.setTextSize(25);
            p.setTextAlign(Paint.Align.CENTER);
            h2 = canvas.getHeight();
            w2 = canvas.getWidth();
            w2 = 980;
            h2 = 964;
            if ((w2 == 980) && (h2 == 964))
            {
                p.setColor(Color.WHITE);
                for (int i = 0; i < 4; i++)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        canvas.drawRect(200 + 50 * 2 * i, 0 + 50 * 2 * j, 250 + 50 * 2 * i, 50 + 50 * 2 * j, p);
                    }
                }
                for (int i = 0; i < 4; i++)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        canvas.drawRect(250 + 50 * 2 * i, 0 + 50 * (2 * j + 1), 300 + 50 * 2 * i, 50 + 50 * (2 * j + 1), p);
                    }
                }
                p.setColor(Color.BLACK);
                for (int i = 0; i < 4; i++)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        canvas.drawRect(250 + 50 * 2 * i, 0 + 50 * 2 * j, 300 + 50 * 2 * i, 50 + 50 * 2 * j, p);
                    }
                }
                for (int i = 0; i < 4; i++)
                {
                    for (int j = 0; j < 4; j++)
                    {
                        canvas.drawRect(200 + 50 * 2 * i, 0 + 50 * (2 * j + 1), 250 + 50 * 2 * i, 50 + 50 * (2 * j + 1), p);
                    }
                }
                if ((xDown == 0) && (yDown == 0))
                {
                    canvas.drawText("Screen sizes: " + w2 + " " + h2, 450, 450, p);
                }
                else
                {
                    canvas.drawText("\n"+s, 450, 450, p);
                }
            }
        }
    }
    misha mm;
}
