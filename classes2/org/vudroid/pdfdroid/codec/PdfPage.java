package org.vudroid.pdfdroid.codec;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import org.vudroid.a.a.c;

public class PdfPage
  implements c
{
  private long a;
  private long b;
  
  private PdfPage(long paramLong1, long paramLong2)
  {
    this.a = paramLong1;
    this.b = paramLong2;
  }
  
  static PdfPage a(long paramLong, int paramInt)
  {
    try
    {
      PdfPage localPdfPage = new PdfPage(open(paramLong, paramInt), paramLong);
      return localPdfPage;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  private RectF d()
  {
    float[] arrayOfFloat = new float[4];
    getMediaBox(this.a, arrayOfFloat);
    return new RectF(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
  }
  
  private static native void free(long paramLong);
  
  private static native void getMediaBox(long paramLong, float[] paramArrayOfFloat);
  
  private native void nativeCreateView(long paramLong1, long paramLong2, int[] paramArrayOfInt1, float[] paramArrayOfFloat, int[] paramArrayOfInt2);
  
  private static native long open(long paramLong, int paramInt);
  
  public int a()
  {
    return (int)d().width();
  }
  
  public Bitmap a(int paramInt1, int paramInt2, RectF paramRectF)
  {
    Matrix localMatrix = new Matrix();
    localMatrix.postScale(paramInt1 / d().width(), -paramInt2 / d().height());
    localMatrix.postTranslate(0.0F, paramInt2);
    localMatrix.postTranslate(-paramRectF.left * paramInt1, -paramRectF.top * paramInt2);
    localMatrix.postScale(1.0F / paramRectF.width(), 1.0F / paramRectF.height());
    return a(new Rect(0, 0, paramInt1, paramInt2), localMatrix);
  }
  
  public Bitmap a(Rect paramRect, Matrix paramMatrix)
  {
    int i = paramRect.left;
    int j = paramRect.top;
    int k = paramRect.right;
    int m = paramRect.bottom;
    float[] arrayOfFloat = new float[9];
    paramMatrix.getValues(arrayOfFloat);
    float f1 = arrayOfFloat[0];
    float f2 = arrayOfFloat[3];
    float f3 = arrayOfFloat[1];
    float f4 = arrayOfFloat[4];
    float f5 = arrayOfFloat[2];
    float f6 = arrayOfFloat[5];
    int n = paramRect.width();
    int i1 = paramRect.height();
    paramRect = new int[n * i1];
    nativeCreateView(this.b, this.a, new int[] { i, j, k, m }, new float[] { f1, f2, f3, f4, f5, f6 }, paramRect);
    return Bitmap.createBitmap(paramRect, n, i1, Bitmap.Config.RGB_565);
  }
  
  public int b()
  {
    return (int)d().height();
  }
  
  public void c()
  {
    try
    {
      if (this.a != 0L)
      {
        free(this.a);
        this.a = 0L;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void finalize()
  {
    c();
    super.finalize();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\vudroid\pdfdroid\codec\PdfPage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */