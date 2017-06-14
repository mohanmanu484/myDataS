package com.example.mohan.unittesting;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by mohan on 05/05/17.
 */

public class MyView extends View{


    public static final String TAG="tag";
    public MyView(Context context) {
        super(context);
    }

    RectF rectF=new RectF();

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
       // super.onMeasure((widthMeasureSpec), heightMeasureSpec);
        Log.d(TAG, "onMeasure: "+widthMeasureSpec+" "+heightMeasureSpec);
        setMeasuredDimension(widthMeasureSpec, heightMeasureSpec);
        rectF.set(0,0,getMeasuredWidth()/2,getMeasuredHeight());
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Paint mPiePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPiePaint.setStyle(Paint.Style.STROKE);
        mPiePaint.setStrokeWidth(4);
     //   mPiePaint.setPathEffect(new DashPathEffect(new float[]{10,10},10));
        //mPiePaint.setTextSize(mTextHeight);

       // canvas.drawCircle(60,60,15,mPiePaint);

      //  RectF rectF=new RectF(0,0,900,900);


     //   canvas.drawRect(small,mPiePaint);

        //canvas.drawCircle(rectF.centerX(),rectF.centerY(),20,mPiePaint);
        //canvas.rotate(10);
       // canvas.rotate(2);
        canvas.translate(10,10);
        canvas.drawArc(rectF,225,-90,false,mPiePaint);

      //  canvas.drawPoint(450,450,mPiePaint);

        Log.d(TAG, "onDraw: "+getMeasuredWidth()+" height="+getMeasuredHeight());

        float x= getMeasuredWidth()/4-(float) Math.sin(Math.toRadians(-225))*getMeasuredWidth()/4;
        float y= getMeasuredHeight()/2-(float)(Math.cos(Math.toRadians(-225))*getMeasuredHeight()/2);
        Log.d("tag", "onDraw: x"+x+" y"+y);

        /*float a= 450-(float) Math.sin(Math.toRadians(135))*450;
        float b= 450-(float)(Math.cos(Math.toRadians(135))*450);*/

       // x=150-(float) Math.sin(Math.toRadians(-225))*150/2;

       // canvas.r



        canvas.drawLine(x,y,x-20,y-10,mPiePaint);
        canvas.drawLine(x,y,x+10,y-20,mPiePaint);

      //  canvas.drawLine(a,b,a-20,b,mPiePaint);

        //canvas.drawLine(300,300,80,40,mPiePaint);





            /*for (int i = 30; i < 135; i++) {
                canvas.drawPoint(((float) Math.sin(Math.toRadians(i))*100)+200,((float) Math.cos(Math.toRadians(i))*100)+200,mPiePaint);



                // Log.d(TAG, "onDraw: "+(Math.sin(i)+100)*2);


            }
*/




        ;




       // canvas.drawLine(canvas.getHeight(),canvas.getHeight(),canvas.getHeight()-5,canvas.getHeight()-5,mPiePaint);
      //  canvas.drawLine(20,20,15,25,mPiePaint);


       // canvas.drawArc(rectF);


    }
}
