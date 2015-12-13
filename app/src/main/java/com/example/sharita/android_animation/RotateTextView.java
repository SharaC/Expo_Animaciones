package com.example.sharita.android_animation;

/**
 * Created by Sharita on 06/12/2015.
 */

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.wifi.p2p.WifiP2pManager;
import android.view.View;

import java.util.Timer;

/**
 * Created by Peter Leow on 28/9/2014.
 */
public class RotateTextView extends View {

    private String message = "    móviles UdeA";

    public RotateTextView(Context context) {
        super(context);
        this.setBackgroundColor(Color.CYAN);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int viewWidth = getWidth();
        int viewHeight = getHeight();
        canvas.translate(viewWidth/2, viewHeight/2);
        int color= 16777216;

        Paint paint = new Paint();
        paint.setColor(Color.rgb(Color.RED,Color.GREEN,Color.CYAN));
        paint.setAntiAlias(true);
        paint.setTextSize(45f);
        paint.setStrokeWidth(2.0f);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setShadowLayer(5.0f, 10.0f, 10.0f, Color.GREEN);
        paint.setDither(true);



        for(int i = 0; i < 10; i++) {

            canvas.drawText(message, 100, 100, paint);

            canvas.rotate(36);
        }
    }
}