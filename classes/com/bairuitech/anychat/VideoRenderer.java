package com.bairuitech.anychat;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Process;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import java.nio.ByteBuffer;

class VideoRenderer
  implements SurfaceHolder.Callback
{
  private Bitmap bitmap = null;
  private float dstBottomScale = 1.0F;
  private Rect dstRect = new Rect();
  private float dstRightScale = 1.0F;
  private int mUserid = -1;
  private float max_cut_imgscale = 0.33333334F;
  private Rect srcRect = new Rect();
  private SurfaceHolder surfaceHolder;
  
  public VideoRenderer(SurfaceHolder paramSurfaceHolder)
  {
    if (paramSurfaceHolder == null) {
      return;
    }
    this.mUserid = 0;
    this.surfaceHolder = paramSurfaceHolder;
    paramSurfaceHolder.addCallback(this);
  }
  
  private void changeDestRect(int paramInt1, int paramInt2)
  {
    this.dstRect.right = ((int)(this.dstRect.left + this.dstRightScale * paramInt1));
    this.dstRect.bottom = ((int)(this.dstRect.top + this.dstBottomScale * paramInt2));
  }
  
  public Bitmap CreateBitmap(int paramInt1, int paramInt2)
  {
    if (this.bitmap == null) {}
    try
    {
      Process.setThreadPriority(-4);
      if ((this.bitmap != null) && ((this.srcRect.bottom != paramInt2) || (this.srcRect.right != paramInt1))) {
        this.bitmap = null;
      }
      if (this.bitmap == null)
      {
        this.bitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.RGB_565);
        this.srcRect.left = 0;
        this.srcRect.top = 0;
        this.srcRect.bottom = paramInt2;
        this.srcRect.right = paramInt1;
      }
      return this.bitmap;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public void DrawByteBuffer(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.bitmap == null) {
      return;
    }
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.rewind();
    this.bitmap.copyPixelsFromBuffer(paramArrayOfByte);
    paramArrayOfByte = this.surfaceHolder.lockCanvas();
    Paint localPaint;
    Matrix localMatrix;
    float f1;
    int k;
    int m;
    int i;
    int j;
    if (paramArrayOfByte != null)
    {
      localPaint = new Paint();
      localPaint.setAntiAlias(true);
      localMatrix = new Matrix();
      f1 = 0.0F;
      k = paramArrayOfByte.getWidth();
      m = paramArrayOfByte.getHeight();
      i = this.bitmap.getWidth();
      j = this.bitmap.getHeight();
      if (paramInt1 == 0) {
        break label489;
      }
      localMatrix.postRotate(paramInt1, this.bitmap.getWidth() / 2.0F, this.bitmap.getHeight() / 2.0F);
      if ((paramInt1 != 90) && (paramInt1 != 270)) {
        break label489;
      }
      localMatrix.postTranslate(0.5F * (j - i), 0.5F * (i - j));
      paramInt1 = i;
    }
    for (;;)
    {
      float f3;
      float f2;
      float f4;
      float f5;
      if (m * j > k * paramInt1)
      {
        f3 = j - k * paramInt1 / m;
        f2 = f3;
        if (f3 > j * this.max_cut_imgscale)
        {
          f2 = j * this.max_cut_imgscale;
          f1 = (m - paramInt1 * k / (j - f2)) / 2.0F;
        }
        f4 = -f2 * k / (2.0F * (j - f2));
        f3 = k / (j - f2);
        f5 = f3;
        f2 = f4;
        f4 = f3;
        f3 = f1;
        f1 = f2;
        if (paramInt2 != 0)
        {
          localMatrix.postScale(-f5, f4);
          localMatrix.postTranslate(j * f5, 0.0F);
          label324:
          localMatrix.postTranslate(f1, f3);
          paramArrayOfByte.drawColor(-16777216);
          paramArrayOfByte.drawBitmap(this.bitmap, localMatrix, localPaint);
          this.surfaceHolder.unlockCanvasAndPost(paramArrayOfByte);
        }
      }
      else
      {
        f2 = paramInt1 - m * j / k;
        if (f2 <= paramInt1 * this.max_cut_imgscale) {
          break label483;
        }
        f2 = paramInt1 * this.max_cut_imgscale;
      }
      label483:
      for (f1 = (k - j * m / (paramInt1 - f2)) / 2.0F;; f1 = 0.0F)
      {
        f3 = -f2 * m / (2.0F * (paramInt1 - f2));
        f4 = m / (paramInt1 - f2);
        f2 = f4;
        f5 = f2;
        break;
        localMatrix.postScale(f5, f4);
        break label324;
        Log.i("ANYCHAT", "Invalid canvas!");
        return;
      }
      label489:
      paramInt1 = j;
      j = i;
    }
  }
  
  public int GetUserId()
  {
    return this.mUserid;
  }
  
  public void SetCoordinates(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.dstRightScale = paramFloat3;
    this.dstBottomScale = paramFloat4;
  }
  
  public void SetUserId(int paramInt)
  {
    this.mUserid = paramInt;
  }
  
  public void setMaxCutScale(float paramFloat)
  {
    float f = paramFloat;
    if (paramFloat > 1.0D) {
      f = 1.0F;
    }
    this.max_cut_imgscale = f;
  }
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3)
  {
    changeDestRect(paramInt2, paramInt3);
  }
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder)
  {
    Canvas localCanvas = paramSurfaceHolder.lockCanvas();
    if (localCanvas != null)
    {
      Rect localRect = paramSurfaceHolder.getSurfaceFrame();
      if (localRect != null) {
        changeDestRect(localRect.right - localRect.left, localRect.bottom - localRect.top);
      }
      paramSurfaceHolder.unlockCanvasAndPost(localCanvas);
    }
  }
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    this.bitmap = null;
    this.surfaceHolder = null;
    this.mUserid = -1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\VideoRenderer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */