package com.iflytek.cloud;

import android.content.Context;
import android.graphics.Bitmap;
import com.iflytek.thirdparty.ad;

public class FaceDetector
{
  private static FaceDetector a;
  private ad b;
  
  private FaceDetector(Context paramContext)
  {
    this.b = new ad(paramContext, null);
  }
  
  public static FaceDetector createDetector(Context paramContext, String paramString)
  {
    try
    {
      if (a == null) {
        a = new FaceDetector(paramContext);
      }
      paramContext = a;
      return paramContext;
    }
    finally {}
  }
  
  public static FaceDetector getDetector()
  {
    try
    {
      FaceDetector localFaceDetector = a;
      return localFaceDetector;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void destroy()
  {
    try
    {
      a = null;
      this.b.a();
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public String detectARGB(Bitmap paramBitmap)
  {
    try
    {
      paramBitmap = this.b.a(paramBitmap);
      return paramBitmap;
    }
    finally
    {
      paramBitmap = finally;
      throw paramBitmap;
    }
  }
  
  public String detectGray(Bitmap paramBitmap)
  {
    try
    {
      paramBitmap = this.b.b(paramBitmap);
      return paramBitmap;
    }
    finally
    {
      paramBitmap = finally;
      throw paramBitmap;
    }
  }
  
  public String trackNV21(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      paramArrayOfByte = this.b.a(paramArrayOfByte, paramInt1, paramInt2, paramInt3, paramInt4);
      return paramArrayOfByte;
    }
    finally
    {
      paramArrayOfByte = finally;
      throw paramArrayOfByte;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\FaceDetector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */