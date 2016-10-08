package com.android.dazhihui.ui.widget.a;

import android.content.Context;
import android.os.StatFs;
import android.support.v4.c.g;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class x
{
  private l a;
  private g<String, byte[]> b;
  private z c;
  private final Object d = new Object();
  private boolean e = true;
  
  public x(Context paramContext, String paramString)
  {
    a(new z(paramContext, paramString));
  }
  
  public static long a(File paramFile)
  {
    if (r.c()) {
      return paramFile.getUsableSpace();
    }
    paramFile = new StatFs(paramFile.getPath());
    long l = paramFile.getBlockSize();
    return paramFile.getAvailableBlocks() * l;
  }
  
  private static String a(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      if (str.length() == 1) {
        localStringBuilder.append('0');
      }
      localStringBuilder.append(str);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  private void a(z paramz)
  {
    this.c = paramz;
    if (this.c.f) {
      this.b = new y(this, this.c.a);
    }
    if (paramz.i) {
      a();
    }
  }
  
  public static String c(String paramString)
  {
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      localObject = a(((MessageDigest)localObject).digest());
      return (String)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException) {}
    return String.valueOf(paramString.hashCode());
  }
  
  public void a()
  {
    synchronized (this.d)
    {
      File localFile;
      if ((this.a == null) || (this.a.a()))
      {
        localFile = this.c.c;
        if ((this.c.g) && (localFile != null))
        {
          if (!localFile.exists()) {
            localFile.mkdirs();
          }
          long l = a(localFile);
          int i = this.c.b;
          if (l <= i) {}
        }
      }
      try
      {
        this.a = l.a(localFile, 1, 1, this.c.b);
        this.e = false;
        this.d.notifyAll();
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          this.c.c = null;
          Log.e("ImageCache", "initDiskCache - " + localIOException);
        }
      }
    }
  }
  
  /* Error */
  public void a(String paramString, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +7 -> 8
    //   4: aload_2
    //   5: ifnonnull +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: getfield 100	com/android/dazhihui/ui/widget/a/x:b	Landroid/support/v4/c/g;
    //   13: ifnull +24 -> 37
    //   16: aload_0
    //   17: getfield 100	com/android/dazhihui/ui/widget/a/x:b	Landroid/support/v4/c/g;
    //   20: aload_1
    //   21: invokevirtual 186	android/support/v4/c/g:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   24: ifnonnull +13 -> 37
    //   27: aload_0
    //   28: getfield 100	com/android/dazhihui/ui/widget/a/x:b	Landroid/support/v4/c/g;
    //   31: aload_1
    //   32: aload_2
    //   33: invokevirtual 190	android/support/v4/c/g:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   36: pop
    //   37: aload_0
    //   38: getfield 22	com/android/dazhihui/ui/widget/a/x:d	Ljava/lang/Object;
    //   41: astore 4
    //   43: aload 4
    //   45: monitorenter
    //   46: aload_0
    //   47: getfield 139	com/android/dazhihui/ui/widget/a/x:a	Lcom/android/dazhihui/ui/widget/a/l;
    //   50: ifnull +65 -> 115
    //   53: aload_1
    //   54: invokestatic 192	com/android/dazhihui/ui/widget/a/x:c	(Ljava/lang/String;)Ljava/lang/String;
    //   57: astore_3
    //   58: aconst_null
    //   59: astore_1
    //   60: aload_0
    //   61: getfield 139	com/android/dazhihui/ui/widget/a/x:a	Lcom/android/dazhihui/ui/widget/a/l;
    //   64: aload_3
    //   65: invokevirtual 195	com/android/dazhihui/ui/widget/a/l:a	(Ljava/lang/String;)Lcom/android/dazhihui/ui/widget/a/q;
    //   68: astore 5
    //   70: aload 5
    //   72: ifnonnull +53 -> 125
    //   75: aload_0
    //   76: getfield 139	com/android/dazhihui/ui/widget/a/x:a	Lcom/android/dazhihui/ui/widget/a/l;
    //   79: aload_3
    //   80: invokevirtual 198	com/android/dazhihui/ui/widget/a/l:b	(Ljava/lang/String;)Lcom/android/dazhihui/ui/widget/a/n;
    //   83: astore_3
    //   84: aload_3
    //   85: ifnull +22 -> 107
    //   88: aload_3
    //   89: iconst_0
    //   90: invokevirtual 203	com/android/dazhihui/ui/widget/a/n:a	(I)Ljava/io/OutputStream;
    //   93: astore_1
    //   94: aload_1
    //   95: aload_2
    //   96: invokevirtual 208	java/io/OutputStream:write	([B)V
    //   99: aload_3
    //   100: invokevirtual 209	com/android/dazhihui/ui/widget/a/n:a	()V
    //   103: aload_1
    //   104: invokevirtual 212	java/io/OutputStream:close	()V
    //   107: aload_1
    //   108: ifnull +7 -> 115
    //   111: aload_1
    //   112: invokevirtual 212	java/io/OutputStream:close	()V
    //   115: aload 4
    //   117: monitorexit
    //   118: return
    //   119: astore_1
    //   120: aload 4
    //   122: monitorexit
    //   123: aload_1
    //   124: athrow
    //   125: aload 5
    //   127: iconst_0
    //   128: invokevirtual 217	com/android/dazhihui/ui/widget/a/q:a	(I)Ljava/io/InputStream;
    //   131: invokevirtual 220	java/io/InputStream:close	()V
    //   134: goto -27 -> 107
    //   137: astore_3
    //   138: aconst_null
    //   139: astore_2
    //   140: aload_2
    //   141: astore_1
    //   142: ldc -89
    //   144: new 63	java/lang/StringBuilder
    //   147: dup
    //   148: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   151: ldc -34
    //   153: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload_3
    //   157: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   166: pop
    //   167: aload_2
    //   168: ifnull -53 -> 115
    //   171: aload_2
    //   172: invokevirtual 212	java/io/OutputStream:close	()V
    //   175: goto -60 -> 115
    //   178: astore_1
    //   179: goto -64 -> 115
    //   182: astore_3
    //   183: aconst_null
    //   184: astore_2
    //   185: aload_2
    //   186: astore_1
    //   187: ldc -89
    //   189: new 63	java/lang/StringBuilder
    //   192: dup
    //   193: invokespecial 64	java/lang/StringBuilder:<init>	()V
    //   196: ldc -34
    //   198: invokevirtual 82	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: aload_3
    //   202: invokevirtual 172	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   205: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   208: invokestatic 177	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   211: pop
    //   212: aload_2
    //   213: ifnull -98 -> 115
    //   216: aload_2
    //   217: invokevirtual 212	java/io/OutputStream:close	()V
    //   220: goto -105 -> 115
    //   223: astore_1
    //   224: goto -109 -> 115
    //   227: astore_2
    //   228: aconst_null
    //   229: astore_1
    //   230: aload_1
    //   231: ifnull +7 -> 238
    //   234: aload_1
    //   235: invokevirtual 212	java/io/OutputStream:close	()V
    //   238: aload_2
    //   239: athrow
    //   240: astore_1
    //   241: goto -126 -> 115
    //   244: astore_1
    //   245: goto -7 -> 238
    //   248: astore_2
    //   249: goto -19 -> 230
    //   252: astore_2
    //   253: goto -23 -> 230
    //   256: astore_3
    //   257: aload_1
    //   258: astore_2
    //   259: goto -74 -> 185
    //   262: astore_3
    //   263: aload_1
    //   264: astore_2
    //   265: goto -125 -> 140
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	268	0	this	x
    //   0	268	1	paramString	String
    //   0	268	2	paramArrayOfByte	byte[]
    //   57	43	3	localObject1	Object
    //   137	20	3	localIOException1	IOException
    //   182	20	3	localException1	Exception
    //   256	1	3	localException2	Exception
    //   262	1	3	localIOException2	IOException
    //   41	80	4	localObject2	Object
    //   68	58	5	localq	q
    // Exception table:
    //   from	to	target	type
    //   46	58	119	finally
    //   111	115	119	finally
    //   115	118	119	finally
    //   120	123	119	finally
    //   171	175	119	finally
    //   216	220	119	finally
    //   234	238	119	finally
    //   238	240	119	finally
    //   60	70	137	java/io/IOException
    //   75	84	137	java/io/IOException
    //   88	94	137	java/io/IOException
    //   125	134	137	java/io/IOException
    //   171	175	178	java/io/IOException
    //   60	70	182	java/lang/Exception
    //   75	84	182	java/lang/Exception
    //   88	94	182	java/lang/Exception
    //   125	134	182	java/lang/Exception
    //   216	220	223	java/io/IOException
    //   60	70	227	finally
    //   75	84	227	finally
    //   88	94	227	finally
    //   125	134	227	finally
    //   111	115	240	java/io/IOException
    //   234	238	244	java/io/IOException
    //   94	107	248	finally
    //   142	167	252	finally
    //   187	212	252	finally
    //   94	107	256	java/lang/Exception
    //   94	107	262	java/io/IOException
  }
  
  public byte[] a(String paramString)
  {
    if (this.b != null)
    {
      paramString = (byte[])this.b.get(paramString);
      if (paramString != null) {
        return paramString;
      }
    }
    return null;
  }
  
  public void b()
  {
    synchronized (this.d)
    {
      l locall = this.a;
      if (locall != null) {}
      try
      {
        if (!this.a.a())
        {
          this.a.close();
          this.a = null;
        }
        return;
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          Log.e("ImageCache", "close - " + localIOException);
        }
      }
    }
  }
  
  public byte[] b(String paramString)
  {
    paramString = c(paramString);
    synchronized (this.d)
    {
      for (;;)
      {
        boolean bool = this.e;
        if (!bool) {
          break;
        }
        try
        {
          this.d.wait();
        }
        catch (InterruptedException localInterruptedException) {}
      }
      l locall = this.a;
      if (locall != null) {
        try
        {
          paramString = this.a.a(paramString);
          if (paramString != null)
          {
            paramString = paramString.a(0);
            if (paramString != null)
            {
              paramString = r.a(paramString);
              return paramString;
            }
          }
        }
        catch (IOException paramString)
        {
          for (;;)
          {
            paramString.printStackTrace();
            paramString = null;
          }
        }
      }
      return null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */