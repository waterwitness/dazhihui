package com.g.a.a.a.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.g.a.c.c;
import com.g.a.c.d;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

public abstract class a
  implements com.g.a.a.a.a
{
  public static final Bitmap.CompressFormat a = Bitmap.CompressFormat.PNG;
  protected final File b;
  protected final File c;
  protected final com.g.a.a.a.b.a d;
  protected int e = 32768;
  protected Bitmap.CompressFormat f = a;
  protected int g = 100;
  
  public a(File paramFile1, File paramFile2, com.g.a.a.a.b.a parama)
  {
    if (paramFile1 == null) {
      throw new IllegalArgumentException("cacheDir argument must be not null");
    }
    if (parama == null) {
      throw new IllegalArgumentException("fileNameGenerator argument must be not null");
    }
    this.b = paramFile1;
    this.c = paramFile2;
    this.d = parama;
  }
  
  public File a(String paramString)
  {
    return b(paramString);
  }
  
  public void a()
  {
    File[] arrayOfFile = this.b.listFiles();
    if (arrayOfFile != null)
    {
      int j = arrayOfFile.length;
      int i = 0;
      while (i < j)
      {
        arrayOfFile[i].delete();
        i += 1;
      }
    }
  }
  
  public boolean a(String paramString, Bitmap paramBitmap)
  {
    File localFile = b(paramString);
    paramString = new File(localFile.getAbsolutePath() + ".tmp");
    BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(new FileOutputStream(paramString), this.e);
    try
    {
      boolean bool1 = paramBitmap.compress(this.f, this.g, localBufferedOutputStream);
      c.a(localBufferedOutputStream);
      boolean bool2 = bool1;
      if (bool1)
      {
        bool2 = bool1;
        if (!paramString.renameTo(localFile)) {
          bool2 = false;
        }
      }
      if (!bool2) {
        paramString.delete();
      }
      paramBitmap.recycle();
      return bool2;
    }
    finally
    {
      c.a(localBufferedOutputStream);
      paramString.delete();
    }
  }
  
  public boolean a(String paramString, InputStream paramInputStream, d paramd)
  {
    File localFile1 = b(paramString);
    File localFile2 = new File(localFile1.getAbsolutePath() + ".tmp");
    boolean bool1;
    boolean bool2;
    try
    {
      paramString = new BufferedOutputStream(new FileOutputStream(localFile2), this.e);
      try
      {
        bool1 = c.a(paramInputStream, paramString, paramd, this.e);
        paramString = finally;
      }
      finally
      {
        try
        {
          c.a(paramString);
          bool2 = bool1;
          if (bool1)
          {
            bool2 = bool1;
            if (!localFile2.renameTo(localFile1)) {
              bool2 = false;
            }
          }
          if (!bool2) {
            localFile2.delete();
          }
          return bool2;
        }
        finally {}
        paramInputStream = finally;
        c.a(paramString);
      }
      bool2 = bool1;
    }
    finally
    {
      bool1 = false;
    }
    if (bool1)
    {
      bool2 = bool1;
      if (!localFile2.renameTo(localFile1)) {
        bool2 = false;
      }
    }
    if (!bool2) {
      localFile2.delete();
    }
    throw paramString;
  }
  
  protected File b(String paramString)
  {
    String str = this.d.a(paramString);
    File localFile = this.b;
    paramString = localFile;
    if (!this.b.exists())
    {
      paramString = localFile;
      if (!this.b.mkdirs())
      {
        paramString = localFile;
        if (this.c != null) {
          if (!this.c.exists())
          {
            paramString = localFile;
            if (!this.c.mkdirs()) {}
          }
          else
          {
            paramString = this.c;
          }
        }
      }
    }
    return new File(paramString, str);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */