package com.tencent;

import com.tencent.imcore.EnvRequestClosure;
import com.tencent.imcore.HttpMethod;
import java.net.HttpURLConnection;

final class ʼ
  implements Runnable
{
  ʼ(ʻ paramʻ, HttpMethod paramHttpMethod, HttpURLConnection paramHttpURLConnection, byte[] paramArrayOfByte, EnvRequestClosure paramEnvRequestClosure) {}
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	com/tencent/ʼ:a	Lcom/tencent/imcore/HttpMethod;
    //   4: getstatic 36	com/tencent/imcore/HttpMethod:kPost	Lcom/tencent/imcore/HttpMethod;
    //   7: if_acmpne +51 -> 58
    //   10: aload_0
    //   11: getfield 20	com/tencent/ʼ:b	Ljava/net/HttpURLConnection;
    //   14: ldc 38
    //   16: invokevirtual 44	java/net/HttpURLConnection:setRequestMethod	(Ljava/lang/String;)V
    //   19: aload_0
    //   20: getfield 20	com/tencent/ʼ:b	Ljava/net/HttpURLConnection;
    //   23: iconst_1
    //   24: invokevirtual 48	java/net/HttpURLConnection:setDoOutput	(Z)V
    //   27: aload_0
    //   28: getfield 20	com/tencent/ʼ:b	Ljava/net/HttpURLConnection;
    //   31: ldc 50
    //   33: aload_0
    //   34: getfield 22	com/tencent/ʼ:c	[B
    //   37: arraylength
    //   38: invokestatic 56	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   41: invokevirtual 60	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   44: aload_0
    //   45: getfield 20	com/tencent/ʼ:b	Ljava/net/HttpURLConnection;
    //   48: invokevirtual 64	java/net/HttpURLConnection:getOutputStream	()Ljava/io/OutputStream;
    //   51: aload_0
    //   52: getfield 22	com/tencent/ʼ:c	[B
    //   55: invokevirtual 70	java/io/OutputStream:write	([B)V
    //   58: new 72	java/io/BufferedInputStream
    //   61: dup
    //   62: aload_0
    //   63: getfield 20	com/tencent/ʼ:b	Ljava/net/HttpURLConnection;
    //   66: invokevirtual 76	java/net/HttpURLConnection:getInputStream	()Ljava/io/InputStream;
    //   69: invokespecial 79	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   72: astore_1
    //   73: new 81	java/io/ByteArrayOutputStream
    //   76: dup
    //   77: sipush 10240
    //   80: invokespecial 84	java/io/ByteArrayOutputStream:<init>	(I)V
    //   83: astore_2
    //   84: sipush 10240
    //   87: newarray <illegal type>
    //   89: astore_3
    //   90: aload_1
    //   91: aload_3
    //   92: invokevirtual 90	java/io/InputStream:read	([B)I
    //   95: istore 4
    //   97: iload 4
    //   99: iflt +78 -> 177
    //   102: aload_2
    //   103: aload_3
    //   104: iconst_0
    //   105: iload 4
    //   107: invokevirtual 93	java/io/ByteArrayOutputStream:write	([BII)V
    //   110: goto -20 -> 90
    //   113: astore_1
    //   114: aload_1
    //   115: invokevirtual 96	java/lang/Throwable:printStackTrace	()V
    //   118: invokestatic 101	com/tencent/ʻ:b	()Ljava/lang/String;
    //   121: iconst_1
    //   122: new 103	java/lang/StringBuilder
    //   125: dup
    //   126: ldc 105
    //   128: invokespecial 107	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   131: aload_1
    //   132: invokestatic 113	com/tencent/IMFunc:getExceptionInfo	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   135: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: invokestatic 126	com/tencent/imsdk/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   144: aload_1
    //   145: invokevirtual 127	java/lang/Throwable:toString	()Ljava/lang/String;
    //   148: astore_1
    //   149: aload_0
    //   150: getfield 24	com/tencent/ʼ:d	Lcom/tencent/imcore/EnvRequestClosure;
    //   153: astore_2
    //   154: aload_2
    //   155: ifnull +14 -> 169
    //   158: aload_0
    //   159: getfield 24	com/tencent/ʼ:d	Lcom/tencent/imcore/EnvRequestClosure;
    //   162: sipush 6010
    //   165: aload_1
    //   166: invokevirtual 133	com/tencent/imcore/EnvRequestClosure:fail	(ILjava/lang/String;)V
    //   169: aload_0
    //   170: getfield 20	com/tencent/ʼ:b	Ljava/net/HttpURLConnection;
    //   173: invokevirtual 136	java/net/HttpURLConnection:disconnect	()V
    //   176: return
    //   177: aload_2
    //   178: invokevirtual 140	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   181: astore_1
    //   182: invokestatic 101	com/tencent/ʻ:b	()Ljava/lang/String;
    //   185: iconst_1
    //   186: new 103	java/lang/StringBuilder
    //   189: dup
    //   190: ldc -114
    //   192: invokespecial 107	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   195: new 52	java/lang/String
    //   198: dup
    //   199: aload_1
    //   200: invokespecial 144	java/lang/String:<init>	([B)V
    //   203: invokevirtual 117	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   206: invokevirtual 120	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   209: invokestatic 146	com/tencent/imsdk/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   212: aload_0
    //   213: getfield 24	com/tencent/ʼ:d	Lcom/tencent/imcore/EnvRequestClosure;
    //   216: ifnull +11 -> 227
    //   219: aload_0
    //   220: getfield 24	com/tencent/ʼ:d	Lcom/tencent/imcore/EnvRequestClosure;
    //   223: aload_1
    //   224: invokevirtual 149	com/tencent/imcore/EnvRequestClosure:done	([B)V
    //   227: aload_0
    //   228: getfield 20	com/tencent/ʼ:b	Ljava/net/HttpURLConnection;
    //   231: invokevirtual 136	java/net/HttpURLConnection:disconnect	()V
    //   234: return
    //   235: astore_1
    //   236: aload_1
    //   237: invokestatic 113	com/tencent/IMFunc:getExceptionInfo	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   240: astore_1
    //   241: invokestatic 101	com/tencent/ʻ:b	()Ljava/lang/String;
    //   244: iconst_1
    //   245: aload_1
    //   246: invokestatic 126	com/tencent/imsdk/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   249: invokestatic 155	com/tencent/TIMManager:getInstance	()Lcom/tencent/TIMManager;
    //   252: invokevirtual 159	com/tencent/TIMManager:getExceptionListener	()Lcom/tencent/TIMExceptionListener;
    //   255: astore_2
    //   256: aload_2
    //   257: ifnull -88 -> 169
    //   260: aload_2
    //   261: aload_1
    //   262: invokeinterface 164 2 0
    //   267: goto -98 -> 169
    //   270: astore_1
    //   271: aload_0
    //   272: getfield 20	com/tencent/ʼ:b	Ljava/net/HttpURLConnection;
    //   275: invokevirtual 136	java/net/HttpURLConnection:disconnect	()V
    //   278: aload_1
    //   279: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	280	0	this	ʼ
    //   72	19	1	localBufferedInputStream	java.io.BufferedInputStream
    //   113	32	1	localThrowable1	Throwable
    //   148	76	1	localObject1	Object
    //   235	2	1	localThrowable2	Throwable
    //   240	22	1	str	String
    //   270	9	1	localObject2	Object
    //   83	178	2	localObject3	Object
    //   89	15	3	arrayOfByte	byte[]
    //   95	11	4	i	int
    // Exception table:
    //   from	to	target	type
    //   0	58	113	java/lang/Throwable
    //   58	90	113	java/lang/Throwable
    //   90	97	113	java/lang/Throwable
    //   102	110	113	java/lang/Throwable
    //   177	227	113	java/lang/Throwable
    //   158	169	235	java/lang/Throwable
    //   0	58	270	finally
    //   58	90	270	finally
    //   90	97	270	finally
    //   102	110	270	finally
    //   114	154	270	finally
    //   158	169	270	finally
    //   177	227	270	finally
    //   236	256	270	finally
    //   260	267	270	finally
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\ʼ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */