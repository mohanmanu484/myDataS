package com.example.mohan.unittesting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.View;

import static android.R.attr.path;
import static android.R.attr.x;
import static android.R.attr.y;

/**
 * Created by mohan on 06/05/17.
 */

public class TestView extends View {



    RectF rectF=new RectF();



    public TestView(Context context) {
        super(context);
    }

    public TestView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        //rectF.set(0,0,100,100);
      //  setMeasuredDimension(widthMeasureSpec,heightMeasureSpec);
        int widthSize = View.resolveSize(getDesiredWidth(), widthMeasureSpec);

        //Get the height measurement
        int heightSize = View.resolveSize(getDesiredHeight(), heightMeasureSpec);

        rectF.set(0,0,widthSize,heightSize);

        //MUST call this to store the measurements

        setMeasuredDimension(widthSize, heightSize);
    }
    private int getDesiredHeight() {

        int min=10;
        int rightPadding=0;
        //int rectSize= (int) (rectF.height());

        int rectSize= (int) Math.max(min,rectF.height());

        return rectSize;
    }


    private int getDesiredWidth() {

        int leftPadding=0;
        int rightPadding=0;

        int min=10;


        int rectSize= (int) Math.max(min,rectF.width());

        return rectSize;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint mPiePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPiePaint.setStyle(Paint.Style.STROKE);
        mPiePaint.setStrokeWidth(6);

        //canvas.drawRect(rectF,mPiePaint);


        int x1= (int) ((rectF.left+rectF.right)/2);
        int y1=(int) ((rectF.top)+10);
        int x2=(int) ((rectF.left+rectF.right)/2);
        int y2=(int) ((rectF.bottom)-10);
    /*    int curveRadius=30;


        Paint paint  = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
       // paint.setStrokeWidth(lineWidth);
      //  paint.setColor(ContextCompat.getColor(context, color));

        final Path path = new Path();
        int midX            = x1 + ((x2 - x1) / 2);
        int midY            = y1 + ((y2 - y1) / 2);
        float xDiff         = midX - x1;
        float yDiff         = midY - y1;
        double angle        = (Math.atan2(yDiff, xDiff) * (180 / Math.PI)) - 90;
        double angleRadians = Math.toRadians(angle);
        float pointX        = (float) (midX + curveRadius * Math.cos(angleRadians));
        float pointY        = (float) (midY + curveRadius * Math.sin(angleRadians));*/

    Path path=new Path();

        path.moveTo(x1, y1);
        path.cubicTo(x1,y1,rectF.left, rectF.centerY()-10, x2, y2);
        canvas.drawPath(path, mPiePaint);
        canvas.drawLine(x2,y2,x2-20,y2-10,mPiePaint);
        canvas.drawLine(x2,y2,x2+10,y2-20,mPiePaint);


        //canvas.clipRect(rectF);

    }
}
