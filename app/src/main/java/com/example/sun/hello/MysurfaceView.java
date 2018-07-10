package com.example.sun.hello;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by sun on 2017/7/27.
 */

public class MysurfaceView extends SurfaceView implements SurfaceHolder.Callback{
    private SurfaceHolder holder;
//    private MyThread myThread;

    public MysurfaceView(Context context) {
        super(context);
        int a=0;
        
        // 通过SurfaceView获得SurfaceHolder对象
        holder = getHolder();

        // 为holder添加回调结构SurfaceHolder.Callback
        holder.addCallback(this);

        // 创建一个绘制线程，将holder对象作为参数传入，这样在绘制线程中就可以获得holder
        // 对象，进而在绘制线程中可以通过holder对象获得Canvas对象，并在Canvas上进行绘制
//        myThread = new MyThread(holder);
    }

    @Override
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
//        myThread.setRun(true);
//        myThread.start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }


}
