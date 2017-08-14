package com.example.sun.hello;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/**
 * Created by sun on 2017/7/28.
 */

public class SecondActivity extends BaseActivtiy  {
    MyThread myThread;
    SurfaceView SurfaceView;
    int i=0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
//        setContentView(R.layout.activity_main);
//        FrameLayout con= (FrameLayout) findViewById(R.id.layout);
//        SurfaceView=new SurfaceView(this);
//        con.addView(SurfaceView);
//
//
//        SurfaceView.getHolder().addCallback(new SurfaceHolder.Callback() {
//            @Override
//            public void surfaceCreated(SurfaceHolder surfaceHolder) {
//                new MyThread(surfaceHolder).start();
//
//            }
//
//            @Override
//            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
//
//            }
//        });
//        Button Button= (android.widget.Button) findViewById(R.id.play);
//        Button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                new Thread(new Runnable() {
//                    @Override
//                    public void run() {
//                        int counter = i;
//                        Canvas canvas = null;
//                        while(true) {
//                            // 具体绘制工作
//                            try {
//                                // 获取Canvas对象，并锁定之
//                                canvas= SurfaceView.getHolder().lockCanvas();
//
//                                // 设定Canvas对象的背景颜色
//                                canvas.drawColor(Color.WHITE);
//
//                                // 创建画笔
//                                Paint p = new Paint();
//                                // 设置画笔颜色
//                                p.setColor(Color.BLACK);
//                                // 设置文字大小
//                                p.setTextSize(30);
//                                Log.e("Mythread",counter+"");
//                                // 创建一个Rect对象rect
//                                Rect rect = new Rect(200, 250, 380, 330);
//                                // 在canvas上绘制rect
//                                canvas.drawRect(rect,p);
//                                Bitmap bt=BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
//                                canvas.drawBitmap(bt,200,200,p);
//                                // 在canvas上显示时间
//                                canvas.drawText("Interval = " + (counter++) + " seconds.", 100, 410, p);
//                                Thread.sleep(1000);
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            } finally {
//                                if (canvas != null) {
//                                    // 解除锁定，并提交修改内容
//                                    SurfaceView.getHolder().unlockCanvasAndPost(canvas);
//                                }
//                            }
//                        }
//                    }
//                }).start();
//            }
//        });
//
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//    }
//
////    @Override
////    public void surfaceCreated(SurfaceHolder surfaceHolder) {
////        Log.e("second","");
////        myThread=new MyThread(SurfaceView.getHolder());
////        myThread.setRun(true);
////        myThread.start();
////    }
////
////    @Override
////    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {
////
////    }
////
////    @Override
////    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
////
////    }


}
