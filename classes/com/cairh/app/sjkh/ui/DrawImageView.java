package com.cairh.app.sjkh.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.ImageView;

public class DrawImageView
  extends ImageView
{
  private static int mHeight;
  private static int mWidth;
  Paint paint = new Paint();
  
  public DrawImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.paint.setAntiAlias(true);
    this.paint.setColor(-65536);
    this.paint.setStyle(Paint.Style.STROKE);
    this.paint.setStrokeWidth(2.5F);
    this.paint.setAlpha(100);
  }
  
  public static void setScreenWH(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    if (paramInt1 <= 0) {
      i = 1280;
    }
    paramInt1 = paramInt2;
    if (paramInt2 <= 0) {
      paramInt1 = 720;
    }
    mWidth = i;
    mHeight = paramInt1;
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.drawRect(new Rect(100, 50, mWidth - 100, mHeight - 100), this.paint);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\DrawImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */