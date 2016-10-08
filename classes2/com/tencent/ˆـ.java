package com.tencent;

import java.net.HttpURLConnection;

final class ˆـ
  implements Runnable
{
  ˆـ(TIMImage paramTIMImage, HttpURLConnection paramHttpURLConnection, String paramString, TIMCallBack paramTIMCallBack) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: new 29	java/io/BufferedInputStream
    //   3: dup
    //   4: aload_0
    //   5: getfield 16	com/tencent/ˆـ:b	Ljava/net/HttpURLConnection;
    //   8: invokevirtual 35	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   11: invokespecial 38	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   14: astore_1
    //   15: new 40	java/io/FileOutputStream
    //   18: dup
    //   19: aload_0
    //   20: getfield 18	com/tencent/ˆـ:c	Ljava/lang/String;
    //   23: invokespecial 43	java/io/FileOutputStream:<init>	(Ljava/lang/String;)V
    //   26: astore_2
    //   27: sipush 10240
    //   30: newarray <illegal type>
    //   32: astore_3
    //   33: aload_1
    //   34: aload_3
    //   35: invokevirtual 49	java/io/InputStream:read	([B)I
    //   38: istore 4
    //   40: iload 4
    //   42: iflt +48 -> 90
    //   45: aload_2
    //   46: aload_3
    //   47: iconst_0
    //   48: iload 4
    //   50: invokevirtual 53	java/io/FileOutputStream:write	([BII)V
    //   53: goto -20 -> 33
    //   56: astore_1
    //   57: aload_1
    //   58: invokevirtual 56	java/lang/Exception:printStackTrace	()V
    //   61: aload_1
    //   62: invokevirtual 60	java/lang/Exception:toString	()Ljava/lang/String;
    //   65: astore_1
    //   66: invokestatic 66	com/tencent/TIMImage:access$000	()Landroid/os/Handler;
    //   69: new 68	com/tencent/ˆᐧ
    //   72: dup
    //   73: aload_0
    //   74: aload_1
    //   75: invokespecial 71	com/tencent/ˆᐧ:<init>	(Lcom/tencent/ˆـ;Ljava/lang/String;)V
    //   78: invokevirtual 77	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   81: pop
    //   82: aload_0
    //   83: getfield 16	com/tencent/ˆـ:b	Ljava/net/HttpURLConnection;
    //   86: invokevirtual 80	java/net/HttpURLConnection:disconnect	()V
    //   89: return
    //   90: aload_2
    //   91: invokevirtual 83	java/io/FileOutputStream:close	()V
    //   94: invokestatic 66	com/tencent/TIMImage:access$000	()Landroid/os/Handler;
    //   97: new 85	com/tencent/ˆٴ
    //   100: dup
    //   101: aload_0
    //   102: invokespecial 88	com/tencent/ˆٴ:<init>	(Lcom/tencent/ˆـ;)V
    //   105: invokevirtual 77	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   108: pop
    //   109: aload_0
    //   110: getfield 16	com/tencent/ˆـ:b	Ljava/net/HttpURLConnection;
    //   113: invokevirtual 80	java/net/HttpURLConnection:disconnect	()V
    //   116: return
    //   117: astore_1
    //   118: aload_0
    //   119: getfield 16	com/tencent/ˆـ:b	Ljava/net/HttpURLConnection;
    //   122: invokevirtual 80	java/net/HttpURLConnection:disconnect	()V
    //   125: aload_1
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	ˆـ
    //   14	20	1	localBufferedInputStream	java.io.BufferedInputStream
    //   56	6	1	localException	Exception
    //   65	10	1	str	String
    //   117	9	1	localObject	Object
    //   26	65	2	localFileOutputStream	java.io.FileOutputStream
    //   32	15	3	arrayOfByte	byte[]
    //   38	11	4	i	int
    // Exception table:
    //   from	to	target	type
    //   0	33	56	java/lang/Exception
    //   33	40	56	java/lang/Exception
    //   45	53	56	java/lang/Exception
    //   90	109	56	java/lang/Exception
    //   0	33	117	finally
    //   33	40	117	finally
    //   45	53	117	finally
    //   57	82	117	finally
    //   90	109	117	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˆـ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */