package com.android.dazhihui.ui.widget.adv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.dazhihui.ui.widget.a.r;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class GifView
  extends View
  implements u
{
  private ab animationType = ab.a;
  private Bitmap currentImage = null;
  private y drawThread = null;
  private t gifDecoder = null;
  public boolean isCarousel = true;
  boolean isDetachedFromWindowDestroy = true;
  public boolean isGifImg = false;
  private boolean isRun = true;
  private Bitmap loadingImg = null;
  private z mGifCallBack;
  Paint paint = new Paint(2);
  private boolean pause = false;
  private Rect rect = new Rect();
  private Handler redrawHandler = new w(this);
  
  public GifView(Context paramContext)
  {
    super(paramContext);
  }
  
  public GifView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public GifView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public GifView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    this.isDetachedFromWindowDestroy = paramBoolean;
  }
  
  private boolean isGif(InputStream paramInputStream)
  {
    String str = "";
    int i = 0;
    while (i < 6)
    {
      str = str + (char)paramInputStream.read();
      i += 1;
    }
    if (!str.startsWith("GIF"))
    {
      this.isGifImg = false;
      return false;
    }
    this.isGifImg = true;
    return true;
  }
  
  private void reDraw()
  {
    if (this.redrawHandler != null)
    {
      Message localMessage = this.redrawHandler.obtainMessage();
      this.redrawHandler.sendMessage(localMessage);
    }
  }
  
  private void setDrawImage(Bitmap paramBitmap)
  {
    int i = getWidth();
    int j = getHeight();
    int m = paramBitmap.getWidth();
    int n = paramBitmap.getHeight();
    int k = i * n / m;
    if (k < j)
    {
      k = m * j / n;
      i = (k - i) / 2;
      this.rect.top = 0;
      this.rect.left = (-i);
      this.rect.bottom = j;
      this.rect.right = (k - i);
      return;
    }
    j = (k - j) / 2;
    this.rect.top = (-j);
    this.rect.left = 0;
    this.rect.bottom = (k - j);
    this.rect.right = i;
  }
  
  private void setGifDecoderImage(InputStream paramInputStream)
  {
    try
    {
      boolean bool = isGif(paramInputStream);
      paramInputStream.reset();
      this.isRun = true;
      if (this.gifDecoder != null)
      {
        this.gifDecoder.a();
        this.gifDecoder = null;
      }
      this.currentImage = null;
      if (bool)
      {
        this.gifDecoder = new t(paramInputStream, this);
        this.gifDecoder.start();
        return;
      }
      this.currentImage = BitmapFactory.decodeStream(paramInputStream);
      reDraw();
      if (this.mGifCallBack != null)
      {
        this.mGifCallBack.callBack(false);
        return;
      }
    }
    catch (IOException paramInputStream)
    {
      paramInputStream.printStackTrace();
    }
  }
  
  public void destroy()
  {
    this.isRun = false;
    if (this.gifDecoder != null)
    {
      this.gifDecoder.a();
      this.gifDecoder = null;
    }
    if ((this.currentImage != null) && (!this.currentImage.isRecycled()))
    {
      this.currentImage.recycle();
      this.currentImage = null;
    }
    if ((this.loadingImg != null) && (!this.loadingImg.isRecycled()))
    {
      this.loadingImg.recycle();
      this.loadingImg = null;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.isDetachedFromWindowDestroy) {
      destroy();
    }
    System.gc();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.currentImage == null) && (this.gifDecoder != null)) {
      this.currentImage = this.gifDecoder.c();
    }
    if (this.currentImage == null)
    {
      if (this.loadingImg != null)
      {
        setDrawImage(this.loadingImg);
        paramCanvas.drawBitmap(this.loadingImg, null, this.rect, this.paint);
      }
      return;
    }
    int i = paramCanvas.getSaveCount();
    paramCanvas.save();
    paramCanvas.translate(getPaddingLeft(), getPaddingTop());
    setDrawImage(this.currentImage);
    paramCanvas.drawBitmap(this.currentImage, null, this.rect, this.paint);
    paramCanvas.restoreToCount(i);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    int k = 0;
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    int m = getPaddingTop();
    int n = getPaddingBottom();
    int j;
    if (this.gifDecoder == null) {
      if (this.currentImage != null)
      {
        j = this.currentImage.getWidth();
        i = this.currentImage.getHeight();
      }
    }
    for (;;)
    {
      j = Math.max(j + (i1 + i2), getSuggestedMinimumWidth());
      i = Math.max(i + (m + n), getSuggestedMinimumHeight());
      m = View.MeasureSpec.getMode(paramInt1);
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      n = View.MeasureSpec.getMode(paramInt2);
      paramInt2 = View.MeasureSpec.getSize(paramInt2);
      if (m == 1073741824)
      {
        if (n == 1073741824)
        {
          setMeasuredDimension(paramInt1, paramInt2);
          return;
          if (this.loadingImg == null) {
            break label420;
          }
          j = this.loadingImg.getWidth();
          i = this.loadingImg.getHeight();
          continue;
          j = this.gifDecoder.a;
          i = this.gifDecoder.b;
          continue;
        }
        if (n == Integer.MIN_VALUE) {
          if (j != 0)
          {
            i = paramInt1 * i / j;
            if (i <= paramInt2) {
              break label415;
            }
          }
        }
      }
      for (;;)
      {
        setMeasuredDimension(paramInt1, paramInt2);
        return;
        i = 0;
        break;
        if (j != 0) {}
        for (paramInt2 = paramInt1 * i / j;; paramInt2 = 0)
        {
          setMeasuredDimension(paramInt1, paramInt2);
          return;
        }
        if (m == Integer.MIN_VALUE)
        {
          if (n == 1073741824)
          {
            if (i != 0) {}
            for (i = j * paramInt2 / i;; i = 0)
            {
              j = i;
              if (i > paramInt1) {
                j = paramInt1;
              }
              setMeasuredDimension(j, paramInt2);
              return;
            }
          }
          if (n == Integer.MIN_VALUE) {
            if (i <= paramInt2) {
              break label410;
            }
          }
        }
        for (;;)
        {
          if (j > paramInt1) {}
          for (;;)
          {
            setMeasuredDimension(paramInt1, paramInt2);
            return;
            if (j > paramInt1) {}
            for (;;)
            {
              setMeasuredDimension(paramInt1, i);
              return;
              if (n == 1073741824)
              {
                paramInt1 = k;
                if (i != 0) {
                  paramInt1 = j * paramInt2 / i;
                }
                setMeasuredDimension(paramInt1, paramInt2);
                return;
              }
              if (n == Integer.MIN_VALUE) {
                if (i <= paramInt2) {
                  break label393;
                }
              }
              for (;;)
              {
                setMeasuredDimension(j, paramInt2);
                return;
                setMeasuredDimension(j, i);
                return;
                label393:
                paramInt2 = i;
              }
              paramInt1 = j;
            }
            paramInt1 = j;
          }
          label410:
          paramInt2 = i;
        }
        label415:
        paramInt2 = i;
      }
      label420:
      j = 1;
    }
  }
  
  public void parseOk(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean) {
      if (this.gifDecoder != null) {
        switch (x.a[this.animationType.ordinal()])
        {
        }
      }
    }
    while (this.mGifCallBack == null)
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  return;
                } while (paramInt != -1);
                reDraw();
              } while (this.gifDecoder.b() <= 1);
              new y(this, null).start();
              return;
              if (paramInt == 1)
              {
                this.currentImage = this.gifDecoder.c();
                reDraw();
                return;
              }
            } while (paramInt != -1);
            if (this.gifDecoder.b() <= 1) {
              break;
            }
          } while (this.drawThread != null);
          this.drawThread = new y(this, null);
          this.drawThread.start();
          return;
          reDraw();
          return;
          if (paramInt == 1)
          {
            this.currentImage = this.gifDecoder.c();
            reDraw();
            return;
          }
          if (paramInt == -1)
          {
            reDraw();
            return;
          }
        } while (this.drawThread != null);
        this.drawThread = new y(this, null);
        this.drawThread.start();
        return;
        Log.e("gif", "parse error");
      } while (this.mGifCallBack == null);
      this.mGifCallBack.callBack(true);
      return;
    }
    this.mGifCallBack.callBack(true);
  }
  
  public void setGifCallBack(z paramz)
  {
    this.mGifCallBack = paramz;
  }
  
  public void setGifImageType(ab paramab)
  {
    if (this.gifDecoder == null) {
      this.animationType = paramab;
    }
  }
  
  public void setImage(int paramInt)
  {
    setGifDecoderImage(getResources().openRawResource(paramInt));
  }
  
  public void setImage(InputStream paramInputStream)
  {
    setGifDecoderImage(paramInputStream);
  }
  
  public void setImage(String paramString)
  {
    setImage(paramString, 0);
  }
  
  public void setImage(String paramString, int paramInt)
  {
    if (paramInt != 0) {
      this.loadingImg = BitmapFactory.decodeStream(getResources().openRawResource(paramInt));
    }
    r.a(getContext()).a(paramString, new v(this));
  }
  
  public void setImage(String paramString, int paramInt1, int paramInt2)
  {
    this.loadingImg = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    setImage(paramString, 0);
  }
  
  public void setImage(byte[] paramArrayOfByte)
  {
    setGifDecoderImage(new ByteArrayInputStream(paramArrayOfByte));
  }
  
  public void setImageBitmap(Bitmap paramBitmap)
  {
    this.currentImage = paramBitmap;
    reDraw();
  }
  
  public void setRestart()
  {
    if (!this.isRun)
    {
      this.isRun = true;
      new y(this, null).start();
    }
  }
  
  public void setStop()
  {
    this.isRun = false;
  }
  
  public void showAnimation()
  {
    if (this.pause) {
      this.pause = false;
    }
  }
  
  public void showCover()
  {
    if (this.gifDecoder == null) {
      return;
    }
    this.pause = true;
    this.currentImage = this.gifDecoder.c();
    invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\GifView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */