package com.cairh.app.sjkh.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.animation.Animation;

public class BorderView
  extends SurfaceView
  implements SurfaceHolder.Callback, Runnable
{
  private static boolean rifImg = false;
  private int ScreenH;
  private int ScreenW;
  private Canvas canvas;
  private Paint paint;
  private Paint paintLine;
  private SurfaceHolder sfh;
  private Thread th;
  
  public BorderView(Context paramContext)
  {
    super(paramContext);
  }
  
  public BorderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext);
    this.th = new Thread(this);
    this.sfh = getHolder();
    this.sfh.addCallback(this);
    this.sfh.setFormat(-2);
    setZOrderOnTop(true);
    this.paint = new Paint();
    this.paint.setAntiAlias(true);
    this.paint.setColor(-65536);
    this.paint.setStyle(Paint.Style.FILL_AND_STROKE);
    this.paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    this.paintLine = new Paint();
    this.paintLine.setColor(-16711936);
    this.paintLine.setStrokeWidth(3.0F);
    setKeepScreenOn(true);
  }
  
  private void draw()
  {
    for (;;)
    {
      try
      {
        this.canvas = this.sfh.lockCanvas();
        this.canvas.drawARGB(100, 0, 0, 0);
        this.ScreenW = (this.ScreenH * 4 / 3);
        if (rifImg)
        {
          j = this.ScreenH;
          i = this.ScreenH * 2 / 3;
          this.canvas.drawRect(new RectF(this.ScreenW / 2 - j / 2, this.ScreenH / 2 - i / 2, this.ScreenW / 2 + j / 2, this.ScreenH / 2 + i / 2), this.paint);
          this.canvas.drawLine(this.ScreenW / 2 - j / 2, this.ScreenH / 2 - i / 2, this.ScreenW / 2 - j / 2, this.ScreenH / 2 - i / 2 + 50, this.paintLine);
          this.canvas.drawLine(this.ScreenW / 2 - j / 2, this.ScreenH / 2 - i / 2, this.ScreenW / 2 - j / 2 + 50, this.ScreenH / 2 - i / 2, this.paintLine);
          this.canvas.drawLine(this.ScreenW / 2 + j / 2, this.ScreenH / 2 - i / 2, this.ScreenW / 2 + j / 2, this.ScreenH / 2 - i / 2 + 50, this.paintLine);
          this.canvas.drawLine(this.ScreenW / 2 + j / 2, this.ScreenH / 2 - i / 2, this.ScreenW / 2 + j / 2 - 50, this.ScreenH / 2 - i / 2, this.paintLine);
          this.canvas.drawLine(this.ScreenW / 2 - j / 2, this.ScreenH / 2 + i / 2, this.ScreenW / 2 - j / 2, this.ScreenH / 2 + i / 2 - 50, this.paintLine);
          this.canvas.drawLine(this.ScreenW / 2 - j / 2, this.ScreenH / 2 + i / 2, this.ScreenW / 2 - j / 2 + 50, this.ScreenH / 2 + i / 2, this.paintLine);
          this.canvas.drawLine(this.ScreenW / 2 + j / 2, this.ScreenH / 2 + i / 2, this.ScreenW / 2 + j / 2, this.ScreenH / 2 + i / 2 - 50, this.paintLine);
          this.canvas.drawLine(this.ScreenW / 2 + j / 2, this.ScreenH / 2 + i / 2, this.ScreenW / 2 + j / 2 - 50, this.ScreenH / 2 + i / 2, this.paintLine);
          return;
        }
      }
      catch (Exception localException)
      {
        int j;
        int i;
        return;
      }
      finally
      {
        if (this.canvas == null) {
          continue;
        }
        this.sfh.unlockCanvasAndPost(this.canvas);
      }
      j = this.ScreenH * 9 / 8;
      i = this.ScreenH * 3 / 4;
    }
  }
  
  public void run()
  {
    draw();
  }
  
  public void startAnimation(Animation paramAnimation)
  {
    super.startAnimation(paramAnimation);
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    this.ScreenW = getWidth();
    this.ScreenH = getHeight();
    this.th.start();
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\BorderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */