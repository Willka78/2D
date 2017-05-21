package de.hbrs.willi_pustowalow.a2d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 18.05.2017.
 */

public class Drawer extends View {
    public Drawer(Context cont){
        super(cont);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint p = new Paint();

        p.setColor(255);
        canvas.drawPaint(p);
        canvas.drawLine(0, 0, 100, 100, p);
    }
}
