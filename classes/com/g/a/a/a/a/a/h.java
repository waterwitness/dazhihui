package com.g.a.a.a.a.a;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.g.a.c.c;
import com.g.a.c.e;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class h
  implements com.g.a.a.a.a
{
  public static final Bitmap.CompressFormat a = Bitmap.CompressFormat.PNG;
  protected a b;
  protected final com.g.a.a.a.b.a c;
  protected int d = 32768;
  protected Bitmap.CompressFormat e = a;
  protected int f = 100;
  private File g;
  
  public h(File paramFile1, File paramFile2, com.g.a.a.a.b.a parama, long paramLong, int paramInt)
  {
    if (paramFile1 == null) {
      throw new IllegalArgumentException("cacheDir argument must be not null");
    }
    if (paramLong < 0L) {
      throw new IllegalArgumentException("cacheMaxSize argument must be positive number");
    }
    if (paramInt < 0) {
      throw new IllegalArgumentException("cacheMaxFileCount argument must be positive number");
    }
    if (parama == null) {
      throw new IllegalArgumentException("fileNameGenerator argument must be not null");
    }
    if (paramLong == 0L) {
      paramLong = Long.MAX_VALUE;
    }
    for (;;)
    {
      if (paramInt == 0) {
        paramInt = Integer.MAX_VALUE;
      }
      for (;;)
      {
        this.g = paramFile2;
        this.c = parama;
        a(paramFile1, paramFile2, paramLong, paramInt);
        return;
      }
    }
  }
  
  private void a(File paramFile1, File paramFile2, long paramLong, int paramInt)
  {
    try
    {
      this.b = a.a(paramFile1, 1, 1, paramLong, paramInt);
      return;
    }
    catch (IOException paramFile1)
    {
      do
      {
        e.a(paramFile1);
        if (paramFile2 != null) {
          a(paramFile2, null, paramLong, paramInt);
        }
      } while (this.b != null);
      throw paramFile1;
    }
  }
  
  private String b(String paramString)
  {
    return this.c.a(paramString);
  }
  
  /* Error */
  public File a(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aconst_null
    //   4: astore_2
    //   5: aload_0
    //   6: getfield 71	com/g/a/a/a/a/a/h:b	Lcom/g/a/a/a/a/a/a;
    //   9: aload_0
    //   10: aload_1
    //   11: invokespecial 84	com/g/a/a/a/a/a/h:b	(Ljava/lang/String;)Ljava/lang/String;
    //   14: invokevirtual 87	com/g/a/a/a/a/a/a:a	(Ljava/lang/String;)Lcom/g/a/a/a/a/a/g;
    //   17: astore_1
    //   18: aload_1
    //   19: ifnonnull +17 -> 36
    //   22: aload_2
    //   23: astore_3
    //   24: aload_1
    //   25: ifnull +9 -> 34
    //   28: aload_1
    //   29: invokevirtual 92	com/g/a/a/a/a/a/g:close	()V
    //   32: aload_2
    //   33: astore_3
    //   34: aload_3
    //   35: areturn
    //   36: aload_1
    //   37: astore_2
    //   38: aload_1
    //   39: iconst_0
    //   40: invokevirtual 95	com/g/a/a/a/a/a/g:a	(I)Ljava/io/File;
    //   43: astore_3
    //   44: aload_3
    //   45: astore_2
    //   46: goto -24 -> 22
    //   49: astore_3
    //   50: aconst_null
    //   51: astore_1
    //   52: aload_1
    //   53: astore_2
    //   54: aload_3
    //   55: invokestatic 76	com/g/a/c/e:a	(Ljava/lang/Throwable;)V
    //   58: aload 4
    //   60: astore_3
    //   61: aload_1
    //   62: ifnull -28 -> 34
    //   65: aload_1
    //   66: invokevirtual 92	com/g/a/a/a/a/a/g:close	()V
    //   69: aconst_null
    //   70: areturn
    //   71: astore_1
    //   72: aconst_null
    //   73: astore_2
    //   74: aload_2
    //   75: ifnull +7 -> 82
    //   78: aload_2
    //   79: invokevirtual 92	com/g/a/a/a/a/a/g:close	()V
    //   82: aload_1
    //   83: athrow
    //   84: astore_1
    //   85: goto -11 -> 74
    //   88: astore_3
    //   89: goto -37 -> 52
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	92	0	this	h
    //   0	92	1	paramString	String
    //   4	75	2	localObject1	Object
    //   23	22	3	localObject2	Object
    //   49	6	3	localIOException1	IOException
    //   60	1	3	localObject3	Object
    //   88	1	3	localIOException2	IOException
    //   1	58	4	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   5	18	49	java/io/IOException
    //   5	18	71	finally
    //   38	44	84	finally
    //   54	58	84	finally
    //   38	44	88	java/io/IOException
  }
  
  public void a()
  {
    try
    {
      this.b.d();
    }
    catch (IOException localIOException1)
    {
      for (;;)
      {
        try
        {
          a(this.b.a(), this.g, this.b.b(), this.b.c());
          return;
        }
        catch (IOException localIOException2)
        {
          e.a(localIOException2);
        }
        localIOException1 = localIOException1;
        e.a(localIOException1);
      }
    }
  }
  
  public boolean a(String paramString, Bitmap paramBitmap)
  {
    d locald = this.b.b(b(paramString));
    if (locald == null) {
      return false;
    }
    paramString = new BufferedOutputStream(locald.a(0), this.d);
    boolean bool;
    try
    {
      bool = paramBitmap.compress(this.e, this.f, paramString);
      c.a(paramString);
      if (bool)
      {
        locald.a();
        return bool;
      }
    }
    finally
    {
      c.a(paramString);
    }
    locald.b();
    return bool;
  }
  
  public boolean a(String paramString, InputStream paramInputStream, com.g.a.c.d paramd)
  {
    paramString = this.b.b(b(paramString));
    if (paramString == null) {
      return false;
    }
    BufferedOutputStream localBufferedOutputStream = new BufferedOutputStream(paramString.a(0), this.d);
    try
    {
      boolean bool = c.a(paramInputStream, localBufferedOutputStream, paramd, this.d);
      c.a(localBufferedOutputStream);
      if (bool)
      {
        paramString.a();
        return bool;
      }
      paramString.b();
      return bool;
    }
    finally
    {
      c.a(localBufferedOutputStream);
      paramString.b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\a\a\a\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */