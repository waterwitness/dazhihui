package com.baidu.location.e;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import com.baidu.location.Jni;
import com.baidu.location.b.b;
import com.baidu.location.b.e;
import com.baidu.location.b.l;
import com.baidu.location.b.n;
import com.baidu.location.b.p;
import com.baidu.location.f;
import com.baidu.location.h.q;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

public class h
  extends n
{
  private static h p = null;
  String a = null;
  String k = null;
  String l = null;
  String m = null;
  int n = 1;
  Handler o = null;
  
  /* Error */
  public static void a(File paramFile1, File paramFile2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: new 44	java/io/BufferedInputStream
    //   5: dup
    //   6: new 46	java/io/FileInputStream
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 49	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   14: invokespecial 52	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   17: astore_2
    //   18: new 54	java/io/BufferedOutputStream
    //   21: dup
    //   22: new 56	java/io/FileOutputStream
    //   25: dup
    //   26: aload_1
    //   27: invokespecial 57	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   30: invokespecial 60	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   33: astore_1
    //   34: sipush 5120
    //   37: newarray <illegal type>
    //   39: astore_3
    //   40: aload_2
    //   41: aload_3
    //   42: invokevirtual 64	java/io/BufferedInputStream:read	([B)I
    //   45: istore 4
    //   47: iload 4
    //   49: iconst_m1
    //   50: if_icmpeq +33 -> 83
    //   53: aload_1
    //   54: aload_3
    //   55: iconst_0
    //   56: iload 4
    //   58: invokevirtual 68	java/io/BufferedOutputStream:write	([BII)V
    //   61: goto -21 -> 40
    //   64: astore_0
    //   65: aload_2
    //   66: ifnull +7 -> 73
    //   69: aload_2
    //   70: invokevirtual 71	java/io/BufferedInputStream:close	()V
    //   73: aload_1
    //   74: ifnull +7 -> 81
    //   77: aload_1
    //   78: invokevirtual 72	java/io/BufferedOutputStream:close	()V
    //   81: aload_0
    //   82: athrow
    //   83: aload_1
    //   84: invokevirtual 75	java/io/BufferedOutputStream:flush	()V
    //   87: aload_0
    //   88: invokevirtual 81	java/io/File:delete	()Z
    //   91: pop
    //   92: aload_2
    //   93: ifnull +7 -> 100
    //   96: aload_2
    //   97: invokevirtual 71	java/io/BufferedInputStream:close	()V
    //   100: aload_1
    //   101: ifnull +7 -> 108
    //   104: aload_1
    //   105: invokevirtual 72	java/io/BufferedOutputStream:close	()V
    //   108: return
    //   109: astore_0
    //   110: aconst_null
    //   111: astore_1
    //   112: aload_3
    //   113: astore_2
    //   114: goto -49 -> 65
    //   117: astore_0
    //   118: aconst_null
    //   119: astore_1
    //   120: goto -55 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	123	0	paramFile1	File
    //   0	123	1	paramFile2	File
    //   17	97	2	localObject	Object
    //   1	112	3	arrayOfByte	byte[]
    //   45	12	4	i	int
    // Exception table:
    //   from	to	target	type
    //   34	40	64	finally
    //   40	47	64	finally
    //   53	61	64	finally
    //   83	92	64	finally
    //   2	18	109	finally
    //   18	34	117	finally
  }
  
  private static boolean a(String paramString1, String paramString2)
  {
    File localFile = new File(l.g() + File.separator + "tmp");
    if (localFile.exists()) {
      localFile.delete();
    }
    FileOutputStream localFileOutputStream;
    try
    {
      localFileOutputStream = new FileOutputStream(localFile);
      byte[] arrayOfByte = new byte['က'];
      paramString1 = (HttpURLConnection)new URL(paramString1).openConnection();
      BufferedInputStream localBufferedInputStream = new BufferedInputStream(paramString1.getInputStream());
      for (;;)
      {
        int i = localBufferedInputStream.read(arrayOfByte);
        if (i <= 0) {
          break;
        }
        localFileOutputStream.write(arrayOfByte, 0, i);
      }
      paramString1.disconnect();
    }
    catch (Exception paramString1)
    {
      localFile.delete();
      return false;
    }
    localFileOutputStream.close();
    if (localFile.length() < 10240L)
    {
      localFile.delete();
      return false;
    }
    localFile.renameTo(new File(l.g() + File.separator + paramString2));
    return true;
  }
  
  public static h b()
  {
    if (p == null) {
      p = new h();
    }
    return p;
  }
  
  private Handler j()
  {
    return this.o;
  }
  
  private void k()
  {
    Object localObject1 = e.a + "/grtcf.dat";
    try
    {
      localObject1 = new File((String)localObject1);
      Object localObject2;
      if (!((File)localObject1).exists())
      {
        localObject2 = new File(e.a);
        if (!((File)localObject2).exists()) {
          ((File)localObject2).mkdirs();
        }
        if (((File)localObject1).createNewFile())
        {
          localObject2 = new RandomAccessFile((File)localObject1, "rw");
          ((RandomAccessFile)localObject2).seek(2L);
          ((RandomAccessFile)localObject2).writeInt(0);
          ((RandomAccessFile)localObject2).seek(8L);
          byte[] arrayOfByte = "1980_01_01:0".getBytes();
          ((RandomAccessFile)localObject2).writeInt(arrayOfByte.length);
          ((RandomAccessFile)localObject2).write(arrayOfByte);
          ((RandomAccessFile)localObject2).seek(200L);
          ((RandomAccessFile)localObject2).writeBoolean(false);
          ((RandomAccessFile)localObject2).seek(800L);
          ((RandomAccessFile)localObject2).writeBoolean(false);
          ((RandomAccessFile)localObject2).close();
        }
      }
      else
      {
        localObject1 = new RandomAccessFile((File)localObject1, "rw");
        ((RandomAccessFile)localObject1).seek(200L);
        ((RandomAccessFile)localObject1).writeBoolean(true);
        if (this.n == 1)
        {
          ((RandomAccessFile)localObject1).writeBoolean(true);
          if (this.m == null) {
            break label218;
          }
          localObject2 = this.m.getBytes();
          ((RandomAccessFile)localObject1).writeInt(localObject2.length);
          ((RandomAccessFile)localObject1).write((byte[])localObject2);
        }
        for (;;)
        {
          ((RandomAccessFile)localObject1).close();
          return;
          ((RandomAccessFile)localObject1).writeBoolean(false);
          break;
          label218:
          ((RandomAccessFile)localObject1).writeInt(0);
        }
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private void l()
  {
    if (this.a == null) {}
    while (!com.baidu.location.h.r.a().g()) {
      return;
    }
    new ah(this).start();
  }
  
  private boolean m()
  {
    if (this.l == null) {}
    while (new File(l.g() + File.separator + this.l).exists()) {
      return true;
    }
    return a("http://" + this.a + "/" + this.l, this.l);
  }
  
  private void n()
  {
    if (this.k == null) {}
    File localFile;
    do
    {
      do
      {
        return;
        localFile = new File(l.g() + File.separator + this.k);
      } while ((localFile.exists()) || (!a("http://" + this.a + "/" + this.k, this.k)));
      localObject = l.a(localFile);
    } while ((this.m == null) || (localObject == null) || (!this.m.equals(localObject)));
    Object localObject = new File(l.g() + File.separator + f.d);
    if (((File)localObject).exists()) {
      ((File)localObject).delete();
    }
    try
    {
      a(localFile, (File)localObject);
      return;
    }
    catch (Exception localException)
    {
      ((File)localObject).delete();
    }
  }
  
  public void a()
  {
    StringBuffer localStringBuffer = new StringBuffer(128);
    localStringBuffer.append("&sdk=");
    localStringBuffer.append(6.12F);
    localStringBuffer.append("&fw=");
    localStringBuffer.append(f.a());
    localStringBuffer.append("&suit=");
    localStringBuffer.append(2);
    if (b.a().b == null)
    {
      localStringBuffer.append("&im=");
      localStringBuffer.append(b.a().a);
    }
    for (;;)
    {
      localStringBuffer.append("&mb=");
      localStringBuffer.append(Build.MODEL);
      localStringBuffer.append("&sv=");
      String str2 = Build.VERSION.RELEASE;
      String str1 = str2;
      if (str2 != null)
      {
        str1 = str2;
        if (str2.length() > 10) {
          str1 = str2.substring(0, 10);
        }
      }
      localStringBuffer.append(str1);
      localStringBuffer.append("&pack=");
      localStringBuffer.append(b.c);
      this.c = (l.d() + "?&it=" + Jni.b(localStringBuffer.toString()));
      return;
      localStringBuffer.append("&cu=");
      localStringBuffer.append(b.a().b);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      JSONObject localJSONObject = new JSONObject(EntityUtils.toString(this.e, "utf-8"));
      if ("up".equals(localJSONObject.getString("res")))
      {
        this.a = localJSONObject.getString("upath");
        if (localJSONObject.has("u1")) {
          this.k = localJSONObject.getString("u1");
        }
        if (localJSONObject.has("u2")) {
          this.l = localJSONObject.getString("u2");
        }
        if (localJSONObject.has("u1_md5")) {
          this.m = localJSONObject.getString("u1_md5");
        }
        j().post(new ag(this));
      }
      if (localJSONObject.has("ison")) {
        this.n = localJSONObject.getInt("ison");
      }
      k();
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    p.a().a(System.currentTimeMillis());
  }
  
  public void c()
  {
    long l1 = p.a().b();
    if (System.currentTimeMillis() - l1 > 86400000L)
    {
      j().postDelayed(new k(this), 10000L);
      j().postDelayed(new r(this), 5000L);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */