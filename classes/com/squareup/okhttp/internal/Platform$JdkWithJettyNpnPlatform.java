package com.squareup.okhttp.internal;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

class Platform$JdkWithJettyNpnPlatform
  extends Platform
{
  private final Class<?> clientProviderClass;
  private final Method getMethod;
  private final Method putMethod;
  private final Class<?> serverProviderClass;
  
  public Platform$JdkWithJettyNpnPlatform(Method paramMethod1, Method paramMethod2, Class<?> paramClass1, Class<?> paramClass2)
  {
    this.putMethod = paramMethod1;
    this.getMethod = paramMethod2;
    this.clientProviderClass = paramClass1;
    this.serverProviderClass = paramClass2;
  }
  
  public byte[] getNpnSelectedProtocol(SSLSocket paramSSLSocket)
  {
    try
    {
      paramSSLSocket = (Platform.JettyNpnProvider)Proxy.getInvocationHandler(this.getMethod.invoke(null, new Object[] { paramSSLSocket }));
      if ((!Platform.JettyNpnProvider.access$0(paramSSLSocket)) && (Platform.JettyNpnProvider.access$1(paramSSLSocket) == null))
      {
        Logger.getLogger("com.squareup.okhttp.OkHttpClient").log(Level.INFO, "NPN callback dropped so SPDY is disabled. Is npn-boot on the boot class path?");
        return null;
      }
      if (Platform.JettyNpnProvider.access$0(paramSSLSocket)) {
        paramSSLSocket = null;
      } else {
        paramSSLSocket = Platform.JettyNpnProvider.access$1(paramSSLSocket).getBytes("US-ASCII");
      }
    }
    catch (UnsupportedEncodingException paramSSLSocket)
    {
      throw new AssertionError();
    }
    catch (InvocationTargetException paramSSLSocket)
    {
      throw new AssertionError();
    }
    catch (IllegalAccessException paramSSLSocket)
    {
      throw new AssertionError();
    }
    return paramSSLSocket;
  }
  
  /* Error */
  public void setNpnProtocols(SSLSocket paramSSLSocket, byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: new 94	java/util/ArrayList
    //   6: dup
    //   7: invokespecial 95	java/util/ArrayList:<init>	()V
    //   10: astore_3
    //   11: iload 6
    //   13: aload_2
    //   14: arraylength
    //   15: if_icmplt +72 -> 87
    //   18: ldc 4
    //   20: invokevirtual 101	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   23: astore_2
    //   24: aload_0
    //   25: getfield 22	com/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform:clientProviderClass	Ljava/lang/Class;
    //   28: astore 4
    //   30: aload_0
    //   31: getfield 24	com/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform:serverProviderClass	Ljava/lang/Class;
    //   34: astore 5
    //   36: new 51	com/squareup/okhttp/internal/Platform$JettyNpnProvider
    //   39: dup
    //   40: aload_3
    //   41: invokespecial 104	com/squareup/okhttp/internal/Platform$JettyNpnProvider:<init>	(Ljava/util/List;)V
    //   44: astore_3
    //   45: aload_2
    //   46: iconst_2
    //   47: anewarray 97	java/lang/Class
    //   50: dup
    //   51: iconst_0
    //   52: aload 4
    //   54: aastore
    //   55: dup
    //   56: iconst_1
    //   57: aload 5
    //   59: aastore
    //   60: aload_3
    //   61: invokestatic 108	java/lang/reflect/Proxy:newProxyInstance	(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;
    //   64: astore_2
    //   65: aload_0
    //   66: getfield 18	com/squareup/okhttp/internal/Platform$JdkWithJettyNpnPlatform:putMethod	Ljava/lang/reflect/Method;
    //   69: aconst_null
    //   70: iconst_2
    //   71: anewarray 37	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: aload_1
    //   77: aastore
    //   78: dup
    //   79: iconst_1
    //   80: aload_2
    //   81: aastore
    //   82: invokevirtual 43	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   85: pop
    //   86: return
    //   87: iload 6
    //   89: iconst_1
    //   90: iadd
    //   91: istore 7
    //   93: aload_2
    //   94: iload 6
    //   96: baload
    //   97: istore 6
    //   99: aload_3
    //   100: new 83	java/lang/String
    //   103: dup
    //   104: aload_2
    //   105: iload 7
    //   107: iload 6
    //   109: ldc 81
    //   111: invokespecial 111	java/lang/String:<init>	([BIILjava/lang/String;)V
    //   114: invokeinterface 117 2 0
    //   119: pop
    //   120: iload 6
    //   122: iload 7
    //   124: iadd
    //   125: istore 6
    //   127: goto -116 -> 11
    //   130: astore_1
    //   131: new 89	java/lang/AssertionError
    //   134: dup
    //   135: aload_1
    //   136: invokespecial 120	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   139: athrow
    //   140: astore_1
    //   141: new 89	java/lang/AssertionError
    //   144: dup
    //   145: aload_1
    //   146: invokespecial 120	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   149: athrow
    //   150: astore_1
    //   151: new 89	java/lang/AssertionError
    //   154: dup
    //   155: aload_1
    //   156: invokespecial 120	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   159: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	160	0	this	JdkWithJettyNpnPlatform
    //   0	160	1	paramSSLSocket	SSLSocket
    //   0	160	2	paramArrayOfByte	byte[]
    //   10	90	3	localObject	Object
    //   28	25	4	localClass1	Class
    //   34	24	5	localClass2	Class
    //   1	125	6	i	int
    //   91	34	7	j	int
    // Exception table:
    //   from	to	target	type
    //   3	11	130	java/io/UnsupportedEncodingException
    //   11	86	130	java/io/UnsupportedEncodingException
    //   99	120	130	java/io/UnsupportedEncodingException
    //   3	11	140	java/lang/reflect/InvocationTargetException
    //   11	86	140	java/lang/reflect/InvocationTargetException
    //   99	120	140	java/lang/reflect/InvocationTargetException
    //   3	11	150	java/lang/IllegalAccessException
    //   11	86	150	java/lang/IllegalAccessException
    //   99	120	150	java/lang/IllegalAccessException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\Platform$JdkWithJettyNpnPlatform.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */