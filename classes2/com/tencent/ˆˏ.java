package com.tencent;

import java.net.HttpURLConnection;

final class ˆˏ
  implements Runnable
{
  ˆˏ(TIMImage paramTIMImage, HttpURLConnection paramHttpURLConnection, TIMValueCallBack paramTIMValueCallBack) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: new 25	java/io/BufferedInputStream
    //   3: dup
    //   4: aload_0
    //   5: getfield 14	com/tencent/ˆˏ:b	Ljava/net/HttpURLConnection;
    //   8: invokevirtual 31	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   11: invokespecial 34	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   14: astore_1
    //   15: new 36	java/io/ByteArrayOutputStream
    //   18: dup
    //   19: sipush 10240
    //   22: invokespecial 39	java/io/ByteArrayOutputStream:<init>	(I)V
    //   25: astore_2
    //   26: sipush 10240
    //   29: newarray <illegal type>
    //   31: astore_3
    //   32: aload_1
    //   33: aload_3
    //   34: invokevirtual 45	java/io/InputStream:read	([B)I
    //   37: istore 4
    //   39: iload 4
    //   41: iflt +48 -> 89
    //   44: aload_2
    //   45: aload_3
    //   46: iconst_0
    //   47: iload 4
    //   49: invokevirtual 49	java/io/ByteArrayOutputStream:write	([BII)V
    //   52: goto -20 -> 32
    //   55: astore_1
    //   56: aload_1
    //   57: invokevirtual 52	java/lang/Exception:printStackTrace	()V
    //   60: aload_1
    //   61: invokevirtual 56	java/lang/Exception:toString	()Ljava/lang/String;
    //   64: astore_1
    //   65: invokestatic 62	com/tencent/TIMImage:access$000	()Landroid/os/Handler;
    //   68: new 64	com/tencent/ˆי
    //   71: dup
    //   72: aload_0
    //   73: aload_1
    //   74: invokespecial 67	com/tencent/ˆי:<init>	(Lcom/tencent/ˆˏ;Ljava/lang/String;)V
    //   77: invokevirtual 73	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   80: pop
    //   81: aload_0
    //   82: getfield 14	com/tencent/ˆˏ:b	Ljava/net/HttpURLConnection;
    //   85: invokevirtual 76	java/net/HttpURLConnection:disconnect	()V
    //   88: return
    //   89: aload_2
    //   90: invokevirtual 80	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   93: astore_1
    //   94: invokestatic 62	com/tencent/TIMImage:access$000	()Landroid/os/Handler;
    //   97: new 82	com/tencent/ˆˑ
    //   100: dup
    //   101: aload_0
    //   102: aload_1
    //   103: invokespecial 85	com/tencent/ˆˑ:<init>	(Lcom/tencent/ˆˏ;[B)V
    //   106: invokevirtual 73	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   109: pop
    //   110: aload_0
    //   111: getfield 14	com/tencent/ˆˏ:b	Ljava/net/HttpURLConnection;
    //   114: invokevirtual 76	java/net/HttpURLConnection:disconnect	()V
    //   117: return
    //   118: astore_1
    //   119: aload_0
    //   120: getfield 14	com/tencent/ˆˏ:b	Ljava/net/HttpURLConnection;
    //   123: invokevirtual 76	java/net/HttpURLConnection:disconnect	()V
    //   126: aload_1
    //   127: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	128	0	this	ˆˏ
    //   14	19	1	localBufferedInputStream	java.io.BufferedInputStream
    //   55	6	1	localException	Exception
    //   64	39	1	localObject1	Object
    //   118	9	1	localObject2	Object
    //   25	65	2	localByteArrayOutputStream	java.io.ByteArrayOutputStream
    //   31	15	3	arrayOfByte	byte[]
    //   37	11	4	i	int
    // Exception table:
    //   from	to	target	type
    //   0	32	55	java/lang/Exception
    //   32	39	55	java/lang/Exception
    //   44	52	55	java/lang/Exception
    //   89	110	55	java/lang/Exception
    //   0	32	118	finally
    //   32	39	118	finally
    //   44	52	118	finally
    //   56	81	118	finally
    //   89	110	118	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ˆˏ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */