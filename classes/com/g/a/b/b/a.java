package com.g.a.b.b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Matrix;
import android.media.ExifInterface;
import com.g.a.b.a.f;
import com.g.a.b.a.i;
import java.io.IOException;
import java.io.InputStream;

public class a
  implements d
{
  protected final boolean a;
  
  public a(boolean paramBoolean)
  {
    this.a = paramBoolean;
  }
  
  private boolean a(String paramString1, String paramString2)
  {
    return ("image/jpeg".equalsIgnoreCase(paramString2)) && (com.g.a.b.d.d.a(paramString1) == com.g.a.b.d.d.c);
  }
  
  protected Bitmap a(Bitmap paramBitmap, e parame, int paramInt, boolean paramBoolean)
  {
    Matrix localMatrix = new Matrix();
    com.g.a.b.a.e locale = parame.d();
    f localf1;
    f localf2;
    i locali;
    if ((locale == com.g.a.b.a.e.e) || (locale == com.g.a.b.a.e.f))
    {
      localf1 = new f(paramBitmap.getWidth(), paramBitmap.getHeight(), paramInt);
      localf2 = parame.c();
      locali = parame.e();
      if (locale != com.g.a.b.a.e.f) {
        break label257;
      }
    }
    label257:
    for (boolean bool = true;; bool = false)
    {
      float f = com.g.a.c.a.b(localf1, localf2, locali, bool);
      if (Float.compare(f, 1.0F) != 0)
      {
        localMatrix.setScale(f, f);
        if (this.a) {
          com.g.a.c.e.a("Scale subsampled image (%1$s) to %2$s (scale = %3$.5f) [%4$s]", new Object[] { localf1, localf1.a(f), Float.valueOf(f), parame.a() });
        }
      }
      if (paramBoolean)
      {
        localMatrix.postScale(-1.0F, 1.0F);
        if (this.a) {
          com.g.a.c.e.a("Flip image horizontally [%s]", new Object[] { parame.a() });
        }
      }
      if (paramInt != 0)
      {
        localMatrix.postRotate(paramInt);
        if (this.a) {
          com.g.a.c.e.a("Rotate image on %1$d° [%2$s]", new Object[] { Integer.valueOf(paramInt), parame.a() });
        }
      }
      parame = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), localMatrix, true);
      if (parame != paramBitmap) {
        paramBitmap.recycle();
      }
      return parame;
    }
  }
  
  public Bitmap a(e parame)
  {
    InputStream localInputStream2 = b(parame);
    if (localInputStream2 == null)
    {
      com.g.a.c.e.d("No stream for image [%s]", new Object[] { parame.a() });
      return null;
    }
    InputStream localInputStream1 = localInputStream2;
    c localc;
    Bitmap localBitmap;
    try
    {
      localc = a(localInputStream2, parame);
      localInputStream1 = localInputStream2;
      localInputStream2 = b(localInputStream2, parame);
      localInputStream1 = localInputStream2;
      localBitmap = BitmapFactory.decodeStream(localInputStream2, null, a(localc.a, parame));
      com.g.a.c.c.a(localInputStream2);
      if (localBitmap == null)
      {
        com.g.a.c.e.d("Image can't be decoded [%s]", new Object[] { parame.a() });
        return localBitmap;
      }
    }
    finally
    {
      com.g.a.c.c.a(localInputStream1);
    }
    return a(localBitmap, parame, localc.b.a, localc.b.b);
  }
  
  protected BitmapFactory.Options a(f paramf, e parame)
  {
    com.g.a.b.a.e locale = parame.d();
    if (locale == com.g.a.b.a.e.a) {}
    for (int i = 1;; i = com.g.a.c.a.a(paramf))
    {
      if ((i > 1) && (this.a)) {
        com.g.a.c.e.a("Subsample original image (%1$s) to %2$s (scale = %3$d) [%4$s]", new Object[] { paramf, paramf.a(i), Integer.valueOf(i), parame.a() });
      }
      paramf = parame.i();
      paramf.inSampleSize = i;
      return paramf;
      if (locale != com.g.a.b.a.e.b) {
        break;
      }
    }
    f localf = parame.c();
    if (locale == com.g.a.b.a.e.c) {}
    for (boolean bool = true;; bool = false)
    {
      i = com.g.a.c.a.a(paramf, localf, parame.e(), bool);
      break;
    }
  }
  
  protected b a(String paramString)
  {
    int j = 0;
    boolean bool2 = true;
    boolean bool3 = true;
    boolean bool4 = true;
    boolean bool1 = true;
    try
    {
      int k = new ExifInterface(com.g.a.b.d.d.c.c(paramString)).getAttributeInt("Orientation", 1);
      i = j;
      switch (k)
      {
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        int i;
        com.g.a.c.e.c("Can't read EXIF tags from file [%s]", new Object[] { paramString });
      }
    }
    bool1 = false;
    i = j;
    for (;;)
    {
      return new b(i, bool1);
      bool2 = false;
      i = 90;
      bool1 = bool2;
      continue;
      bool3 = false;
      i = 180;
      bool1 = bool3;
      continue;
      bool4 = false;
      i = 270;
      bool1 = bool4;
    }
  }
  
  protected c a(InputStream paramInputStream, e parame)
  {
    BitmapFactory.Options localOptions = new BitmapFactory.Options();
    localOptions.inJustDecodeBounds = true;
    BitmapFactory.decodeStream(paramInputStream, null, localOptions);
    paramInputStream = parame.b();
    if ((parame.h()) && (a(paramInputStream, localOptions.outMimeType))) {}
    for (paramInputStream = a(paramInputStream);; paramInputStream = new b()) {
      return new c(new f(localOptions.outWidth, localOptions.outHeight, paramInputStream.a), paramInputStream);
    }
  }
  
  protected InputStream b(e parame)
  {
    return parame.f().a(parame.b(), parame.g());
  }
  
  protected InputStream b(InputStream paramInputStream, e parame)
  {
    if (paramInputStream.markSupported()) {
      try
      {
        paramInputStream.reset();
        return paramInputStream;
      }
      catch (IOException localIOException) {}
    }
    com.g.a.c.c.a(paramInputStream);
    return b(parame);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */