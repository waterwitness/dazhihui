package com.baidu.location.b;

import java.io.File;
import java.io.RandomAccessFile;

public class p
{
  static p c;
  String a = "firll.dat";
  int b = 3164;
  int d = 0;
  int e = 20;
  int f = 40;
  int g = 60;
  
  /* Error */
  private long a(int paramInt)
  {
    // Byte code:
    //   0: invokestatic 43	com/baidu/location/b/l:g	()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_2
    //   5: ifnonnull +7 -> 12
    //   8: ldc2_w 44
    //   11: lreturn
    //   12: new 47	java/lang/StringBuilder
    //   15: dup
    //   16: invokespecial 48	java/lang/StringBuilder:<init>	()V
    //   19: aload_2
    //   20: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: getstatic 57	java/io/File:separator	Ljava/lang/String;
    //   26: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   29: aload_0
    //   30: getfield 22	com/baidu/location/b/p:a	Ljava/lang/String;
    //   33: invokevirtual 52	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   36: invokevirtual 60	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   39: astore_2
    //   40: aconst_null
    //   41: astore_3
    //   42: new 62	java/io/RandomAccessFile
    //   45: dup
    //   46: aload_2
    //   47: ldc 64
    //   49: invokespecial 67	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   52: astore_2
    //   53: iload_1
    //   54: i2l
    //   55: lstore 5
    //   57: aload_2
    //   58: lload 5
    //   60: invokevirtual 71	java/io/RandomAccessFile:seek	(J)V
    //   63: aload_2
    //   64: invokevirtual 75	java/io/RandomAccessFile:readInt	()I
    //   67: istore_1
    //   68: aload_2
    //   69: invokevirtual 79	java/io/RandomAccessFile:readLong	()J
    //   72: lstore 5
    //   74: aload_2
    //   75: invokevirtual 75	java/io/RandomAccessFile:readInt	()I
    //   78: istore 4
    //   80: iload_1
    //   81: iload 4
    //   83: if_icmpne +14 -> 97
    //   86: aload_2
    //   87: ifnull +7 -> 94
    //   90: aload_2
    //   91: invokevirtual 82	java/io/RandomAccessFile:close	()V
    //   94: lload 5
    //   96: lreturn
    //   97: aload_2
    //   98: ifnull -90 -> 8
    //   101: aload_2
    //   102: invokevirtual 82	java/io/RandomAccessFile:close	()V
    //   105: ldc2_w 44
    //   108: lreturn
    //   109: astore_2
    //   110: ldc2_w 44
    //   113: lreturn
    //   114: astore_2
    //   115: aload_3
    //   116: astore_2
    //   117: aload_2
    //   118: ifnull -110 -> 8
    //   121: aload_2
    //   122: invokevirtual 82	java/io/RandomAccessFile:close	()V
    //   125: ldc2_w 44
    //   128: lreturn
    //   129: astore_2
    //   130: ldc2_w 44
    //   133: lreturn
    //   134: astore_3
    //   135: aconst_null
    //   136: astore_2
    //   137: aload_2
    //   138: ifnull +7 -> 145
    //   141: aload_2
    //   142: invokevirtual 82	java/io/RandomAccessFile:close	()V
    //   145: aload_3
    //   146: athrow
    //   147: astore_2
    //   148: goto -54 -> 94
    //   151: astore_2
    //   152: goto -7 -> 145
    //   155: astore_3
    //   156: goto -19 -> 137
    //   159: astore_3
    //   160: goto -43 -> 117
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	this	p
    //   0	163	1	paramInt	int
    //   3	99	2	localObject1	Object
    //   109	1	2	localIOException1	java.io.IOException
    //   114	1	2	localException1	Exception
    //   116	6	2	localObject2	Object
    //   129	1	2	localIOException2	java.io.IOException
    //   136	6	2	localObject3	Object
    //   147	1	2	localIOException3	java.io.IOException
    //   151	1	2	localIOException4	java.io.IOException
    //   41	75	3	localObject4	Object
    //   134	12	3	localObject5	Object
    //   155	1	3	localObject6	Object
    //   159	1	3	localException2	Exception
    //   78	6	4	i	int
    //   55	40	5	l	long
    // Exception table:
    //   from	to	target	type
    //   101	105	109	java/io/IOException
    //   42	53	114	java/lang/Exception
    //   121	125	129	java/io/IOException
    //   42	53	134	finally
    //   90	94	147	java/io/IOException
    //   141	145	151	java/io/IOException
    //   57	80	155	finally
    //   57	80	159	java/lang/Exception
  }
  
  public static p a()
  {
    if (c == null) {
      c = new p();
    }
    return c;
  }
  
  private void a(int paramInt, long paramLong)
  {
    Object localObject = l.g();
    if (localObject == null) {
      return;
    }
    localObject = (String)localObject + File.separator + this.a;
    try
    {
      localObject = new RandomAccessFile((String)localObject, "rw");
      ((RandomAccessFile)localObject).seek(paramInt);
      ((RandomAccessFile)localObject).writeInt(this.b);
      ((RandomAccessFile)localObject).writeLong(paramLong);
      ((RandomAccessFile)localObject).writeInt(this.b);
      ((RandomAccessFile)localObject).close();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void a(long paramLong)
  {
    a(this.d, paramLong);
  }
  
  public long b()
  {
    return a(this.d);
  }
  
  public void b(long paramLong)
  {
    a(this.g, paramLong);
  }
  
  public long c()
  {
    return a(this.g);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */