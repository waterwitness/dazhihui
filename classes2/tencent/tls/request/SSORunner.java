package tencent.tls.request;

public class SSORunner
  implements Runnable
{
  private final Object __sync = new Object();
  private byte[] reqData;
  private byte[] resData = null;
  private int ret;
  private String serviceCmd;
  private int timeout;
  
  public SSORunner(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    this.serviceCmd = str;
    paramString = paramArrayOfByte;
    if (paramArrayOfByte == null) {
      paramString = new byte[0];
    }
    this.reqData = paramString;
    if (paramInt > 0) {}
    for (;;)
    {
      this.timeout = paramInt;
      return;
      paramInt = 10000;
    }
  }
  
  public byte[] getResData()
  {
    return this.resData;
  }
  
  public int getRet()
  {
    return this.ret;
  }
  
  /* Error */
  public void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_0
    //   2: putfield 44	tencent/tls/request/SSORunner:ret	I
    //   5: ldc 49
    //   7: invokestatic 55	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   10: astore_2
    //   11: aload_2
    //   12: ldc 57
    //   14: iconst_0
    //   15: anewarray 51	java/lang/Class
    //   18: invokevirtual 61	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   21: aconst_null
    //   22: iconst_0
    //   23: anewarray 4	java/lang/Object
    //   26: invokevirtual 67	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   29: astore_1
    //   30: ldc 69
    //   32: invokestatic 55	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   35: astore_3
    //   36: aload_3
    //   37: invokevirtual 73	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   40: astore 4
    //   42: new 75	tencent/tls/request/SSORunner$ProxyListener
    //   45: dup
    //   46: aload_0
    //   47: invokespecial 78	tencent/tls/request/SSORunner$ProxyListener:<init>	(Ltencent/tls/request/SSORunner;)V
    //   50: astore 5
    //   52: aload 4
    //   54: iconst_1
    //   55: anewarray 51	java/lang/Class
    //   58: dup
    //   59: iconst_0
    //   60: aload_3
    //   61: aastore
    //   62: aload 5
    //   64: invokestatic 84	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   67: astore 4
    //   69: aload_2
    //   70: ldc 86
    //   72: iconst_5
    //   73: anewarray 51	java/lang/Class
    //   76: dup
    //   77: iconst_0
    //   78: ldc 88
    //   80: aastore
    //   81: dup
    //   82: iconst_1
    //   83: ldc 88
    //   85: aastore
    //   86: dup
    //   87: iconst_2
    //   88: ldc 89
    //   90: aastore
    //   91: dup
    //   92: iconst_3
    //   93: getstatic 95	java/lang/Long:TYPE	Ljava/lang/Class;
    //   96: aastore
    //   97: dup
    //   98: iconst_4
    //   99: aload_3
    //   100: aastore
    //   101: invokevirtual 61	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   104: astore_2
    //   105: new 97	java/lang/StringBuilder
    //   108: dup
    //   109: invokespecial 98	java/lang/StringBuilder:<init>	()V
    //   112: ldc 100
    //   114: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   117: aload_0
    //   118: getfield 29	tencent/tls/request/SSORunner:serviceCmd	Ljava/lang/String;
    //   121: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: ldc 106
    //   126: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   129: aload_0
    //   130: getfield 31	tencent/tls/request/SSORunner:reqData	[B
    //   133: arraylength
    //   134: invokevirtual 109	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   137: ldc 111
    //   139: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: aload_0
    //   143: getfield 33	tencent/tls/request/SSORunner:timeout	I
    //   146: invokevirtual 109	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   149: invokevirtual 115	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   152: invokestatic 121	tencent/tls/report/QLog:i	(Ljava/lang/String;)V
    //   155: aload_2
    //   156: aload_1
    //   157: iconst_5
    //   158: anewarray 4	java/lang/Object
    //   161: dup
    //   162: iconst_0
    //   163: ldc 123
    //   165: aastore
    //   166: dup
    //   167: iconst_1
    //   168: aload_0
    //   169: getfield 29	tencent/tls/request/SSORunner:serviceCmd	Ljava/lang/String;
    //   172: aastore
    //   173: dup
    //   174: iconst_2
    //   175: aload_0
    //   176: getfield 31	tencent/tls/request/SSORunner:reqData	[B
    //   179: aastore
    //   180: dup
    //   181: iconst_3
    //   182: aload_0
    //   183: getfield 33	tencent/tls/request/SSORunner:timeout	I
    //   186: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   189: aastore
    //   190: dup
    //   191: iconst_4
    //   192: aload 4
    //   194: aastore
    //   195: invokevirtual 67	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   198: pop
    //   199: aload_0
    //   200: getfield 25	tencent/tls/request/SSORunner:__sync	Ljava/lang/Object;
    //   203: astore_1
    //   204: aload_1
    //   205: monitorenter
    //   206: aload_0
    //   207: getfield 25	tencent/tls/request/SSORunner:__sync	Ljava/lang/Object;
    //   210: aload_0
    //   211: getfield 33	tencent/tls/request/SSORunner:timeout	I
    //   214: i2l
    //   215: invokevirtual 133	java/lang/Object:wait	(J)V
    //   218: aload_1
    //   219: monitorexit
    //   220: return
    //   221: astore_2
    //   222: aload_1
    //   223: monitorexit
    //   224: aload_2
    //   225: athrow
    //   226: astore_1
    //   227: ldc -121
    //   229: invokestatic 55	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   232: astore_1
    //   233: aload_1
    //   234: ldc 57
    //   236: iconst_0
    //   237: anewarray 51	java/lang/Class
    //   240: invokevirtual 61	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   243: aconst_null
    //   244: iconst_0
    //   245: anewarray 4	java/lang/Object
    //   248: invokevirtual 67	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   251: astore_2
    //   252: ldc -119
    //   254: invokestatic 55	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   257: astore_3
    //   258: aload_3
    //   259: invokevirtual 73	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   262: astore 4
    //   264: new 75	tencent/tls/request/SSORunner$ProxyListener
    //   267: dup
    //   268: aload_0
    //   269: invokespecial 78	tencent/tls/request/SSORunner$ProxyListener:<init>	(Ltencent/tls/request/SSORunner;)V
    //   272: astore 5
    //   274: aload 4
    //   276: iconst_1
    //   277: anewarray 51	java/lang/Class
    //   280: dup
    //   281: iconst_0
    //   282: aload_3
    //   283: aastore
    //   284: aload 5
    //   286: invokestatic 84	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   289: astore 4
    //   291: aload_1
    //   292: ldc -117
    //   294: iconst_4
    //   295: anewarray 51	java/lang/Class
    //   298: dup
    //   299: iconst_0
    //   300: ldc 88
    //   302: aastore
    //   303: dup
    //   304: iconst_1
    //   305: ldc 89
    //   307: aastore
    //   308: dup
    //   309: iconst_2
    //   310: aload_3
    //   311: aastore
    //   312: dup
    //   313: iconst_3
    //   314: getstatic 95	java/lang/Long:TYPE	Ljava/lang/Class;
    //   317: aastore
    //   318: invokevirtual 61	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   321: aload_2
    //   322: iconst_4
    //   323: anewarray 4	java/lang/Object
    //   326: dup
    //   327: iconst_0
    //   328: aload_0
    //   329: getfield 29	tencent/tls/request/SSORunner:serviceCmd	Ljava/lang/String;
    //   332: aastore
    //   333: dup
    //   334: iconst_1
    //   335: aload_0
    //   336: getfield 31	tencent/tls/request/SSORunner:reqData	[B
    //   339: aastore
    //   340: dup
    //   341: iconst_2
    //   342: aload 4
    //   344: aastore
    //   345: dup
    //   346: iconst_3
    //   347: aload_0
    //   348: getfield 33	tencent/tls/request/SSORunner:timeout	I
    //   351: invokestatic 129	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   354: aastore
    //   355: invokevirtual 67	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   358: pop
    //   359: aload_0
    //   360: getfield 25	tencent/tls/request/SSORunner:__sync	Ljava/lang/Object;
    //   363: astore_1
    //   364: aload_1
    //   365: monitorenter
    //   366: aload_0
    //   367: getfield 25	tencent/tls/request/SSORunner:__sync	Ljava/lang/Object;
    //   370: aload_0
    //   371: getfield 33	tencent/tls/request/SSORunner:timeout	I
    //   374: i2l
    //   375: invokevirtual 133	java/lang/Object:wait	(J)V
    //   378: aload_1
    //   379: monitorexit
    //   380: return
    //   381: astore_2
    //   382: aload_1
    //   383: monitorexit
    //   384: aload_2
    //   385: athrow
    //   386: astore_1
    //   387: aload_1
    //   388: invokestatic 143	tencent/tls/report/QLog:e	(Ljava/lang/Throwable;)V
    //   391: aload_0
    //   392: sipush 64536
    //   395: putfield 44	tencent/tls/request/SSORunner:ret	I
    //   398: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	399	0	this	SSORunner
    //   226	1	1	localException1	Exception
    //   386	2	1	localException2	Exception
    //   10	146	2	localObject3	Object
    //   221	4	2	localObject4	Object
    //   251	71	2	localObject5	Object
    //   381	4	2	localObject6	Object
    //   35	276	3	localClass	Class
    //   40	303	4	localObject7	Object
    //   50	235	5	localProxyListener	SSORunner.ProxyListener
    // Exception table:
    //   from	to	target	type
    //   206	220	221	finally
    //   222	224	221	finally
    //   5	206	226	java/lang/Exception
    //   224	226	226	java/lang/Exception
    //   366	380	381	finally
    //   382	384	381	finally
    //   227	366	386	java/lang/Exception
    //   384	386	386	java/lang/Exception
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\SSORunner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */