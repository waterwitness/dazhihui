package com.tencent.open.utils;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public class HttpUtils$MyX509TrustManager
  implements X509TrustManager
{
  X509TrustManager a;
  
  /* Error */
  HttpUtils$MyX509TrustManager()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial 14	java/lang/Object:<init>	()V
    //   4: ldc 16
    //   6: invokestatic 22	java/security/KeyStore:getInstance	(Ljava/lang/String;)Ljava/security/KeyStore;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +104 -> 115
    //   14: new 24	java/io/FileInputStream
    //   17: dup
    //   18: ldc 26
    //   20: invokespecial 29	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   23: astore_3
    //   24: aload_1
    //   25: aload_3
    //   26: ldc 31
    //   28: invokevirtual 37	java/lang/String:toCharArray	()[C
    //   31: invokevirtual 41	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   34: ldc 43
    //   36: ldc 45
    //   38: invokestatic 50	javax/net/ssl/TrustManagerFactory:getInstance	(Ljava/lang/String;Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   41: astore_2
    //   42: aload_2
    //   43: aload_1
    //   44: invokevirtual 54	javax/net/ssl/TrustManagerFactory:init	(Ljava/security/KeyStore;)V
    //   47: aload_2
    //   48: invokevirtual 58	javax/net/ssl/TrustManagerFactory:getTrustManagers	()[Ljavax/net/ssl/TrustManager;
    //   51: astore_1
    //   52: aload_1
    //   53: astore_2
    //   54: aload_3
    //   55: ifnull +9 -> 64
    //   58: aload_3
    //   59: invokevirtual 61	java/io/FileInputStream:close	()V
    //   62: aload_1
    //   63: astore_2
    //   64: iconst_0
    //   65: istore 4
    //   67: iload 4
    //   69: aload_2
    //   70: arraylength
    //   71: if_icmpge +76 -> 147
    //   74: aload_2
    //   75: iload 4
    //   77: aaload
    //   78: instanceof 6
    //   81: ifeq +57 -> 138
    //   84: aload_0
    //   85: aload_2
    //   86: iload 4
    //   88: aaload
    //   89: checkcast 6	javax/net/ssl/X509TrustManager
    //   92: putfield 63	com/tencent/open/utils/HttpUtils$MyX509TrustManager:a	Ljavax/net/ssl/X509TrustManager;
    //   95: return
    //   96: astore_1
    //   97: aconst_null
    //   98: astore_1
    //   99: goto -89 -> 10
    //   102: astore_1
    //   103: aconst_null
    //   104: astore_2
    //   105: aload_2
    //   106: ifnull +7 -> 113
    //   109: aload_2
    //   110: invokevirtual 61	java/io/FileInputStream:close	()V
    //   113: aload_1
    //   114: athrow
    //   115: invokestatic 67	javax/net/ssl/TrustManagerFactory:getDefaultAlgorithm	()Ljava/lang/String;
    //   118: invokestatic 70	javax/net/ssl/TrustManagerFactory:getInstance	(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   121: astore_1
    //   122: aload_1
    //   123: aconst_null
    //   124: checkcast 18	java/security/KeyStore
    //   127: invokevirtual 54	javax/net/ssl/TrustManagerFactory:init	(Ljava/security/KeyStore;)V
    //   130: aload_1
    //   131: invokevirtual 58	javax/net/ssl/TrustManagerFactory:getTrustManagers	()[Ljavax/net/ssl/TrustManager;
    //   134: astore_2
    //   135: goto -71 -> 64
    //   138: iload 4
    //   140: iconst_1
    //   141: iadd
    //   142: istore 4
    //   144: goto -77 -> 67
    //   147: new 12	java/lang/Exception
    //   150: dup
    //   151: ldc 72
    //   153: invokespecial 73	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   156: athrow
    //   157: astore_1
    //   158: aload_3
    //   159: astore_2
    //   160: goto -55 -> 105
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	163	0	this	MyX509TrustManager
    //   9	54	1	localObject1	Object
    //   96	1	1	localException	Exception
    //   98	1	1	localObject2	Object
    //   102	12	1	localObject3	Object
    //   121	10	1	localTrustManagerFactory	javax.net.ssl.TrustManagerFactory
    //   157	1	1	localObject4	Object
    //   41	119	2	localObject5	Object
    //   23	136	3	localFileInputStream	java.io.FileInputStream
    //   65	78	4	i	int
    // Exception table:
    //   from	to	target	type
    //   4	10	96	java/lang/Exception
    //   14	24	102	finally
    //   24	52	157	finally
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    this.a.checkClientTrusted(paramArrayOfX509Certificate, paramString);
  }
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
  {
    this.a.checkServerTrusted(paramArrayOfX509Certificate, paramString);
  }
  
  public X509Certificate[] getAcceptedIssuers()
  {
    return this.a.getAcceptedIssuers();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\HttpUtils$MyX509TrustManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */