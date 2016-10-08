package com.android.volley.toolbox;

import java.security.cert.X509Certificate;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class HTTPSTrustManager
  implements X509TrustManager
{
  private static final X509Certificate[] _AcceptedIssuers = new X509Certificate[0];
  private static TrustManager[] trustManagers;
  
  /* Error */
  public static void allowAllowSSL()
  {
    // Byte code:
    //   0: new 27	com/android/volley/toolbox/HTTPSTrustManager$1
    //   3: dup
    //   4: invokespecial 28	com/android/volley/toolbox/HTTPSTrustManager$1:<init>	()V
    //   7: invokestatic 34	javax/net/ssl/HttpsURLConnection:setDefaultHostnameVerifier	(Ljavax/net/ssl/HostnameVerifier;)V
    //   10: getstatic 36	com/android/volley/toolbox/HTTPSTrustManager:trustManagers	[Ljavax/net/ssl/TrustManager;
    //   13: ifnonnull +20 -> 33
    //   16: iconst_1
    //   17: anewarray 38	javax/net/ssl/TrustManager
    //   20: dup
    //   21: iconst_0
    //   22: new 2	com/android/volley/toolbox/HTTPSTrustManager
    //   25: dup
    //   26: invokespecial 39	com/android/volley/toolbox/HTTPSTrustManager:<init>	()V
    //   29: aastore
    //   30: putstatic 36	com/android/volley/toolbox/HTTPSTrustManager:trustManagers	[Ljavax/net/ssl/TrustManager;
    //   33: ldc 41
    //   35: invokestatic 47	javax/net/ssl/SSLContext:getInstance	(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
    //   38: astore_0
    //   39: aload_0
    //   40: aconst_null
    //   41: getstatic 36	com/android/volley/toolbox/HTTPSTrustManager:trustManagers	[Ljavax/net/ssl/TrustManager;
    //   44: new 49	java/security/SecureRandom
    //   47: dup
    //   48: invokespecial 50	java/security/SecureRandom:<init>	()V
    //   51: invokevirtual 54	javax/net/ssl/SSLContext:init	([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
    //   54: aload_0
    //   55: invokevirtual 58	javax/net/ssl/SSLContext:getSocketFactory	()Ljavax/net/ssl/SSLSocketFactory;
    //   58: invokestatic 62	javax/net/ssl/HttpsURLConnection:setDefaultSSLSocketFactory	(Ljavax/net/ssl/SSLSocketFactory;)V
    //   61: return
    //   62: astore_1
    //   63: aconst_null
    //   64: astore_0
    //   65: aload_1
    //   66: invokevirtual 65	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   69: goto -15 -> 54
    //   72: astore_1
    //   73: aconst_null
    //   74: astore_0
    //   75: aload_1
    //   76: invokevirtual 66	java/security/KeyManagementException:printStackTrace	()V
    //   79: goto -25 -> 54
    //   82: astore_1
    //   83: goto -8 -> 75
    //   86: astore_1
    //   87: goto -22 -> 65
    // Local variable table:
    //   start	length	slot	name	signature
    //   38	37	0	localSSLContext	javax.net.ssl.SSLContext
    //   62	4	1	localNoSuchAlgorithmException1	java.security.NoSuchAlgorithmException
    //   72	4	1	localKeyManagementException1	java.security.KeyManagementException
    //   82	1	1	localKeyManagementException2	java.security.KeyManagementException
    //   86	1	1	localNoSuchAlgorithmException2	java.security.NoSuchAlgorithmException
    // Exception table:
    //   from	to	target	type
    //   33	39	62	java/security/NoSuchAlgorithmException
    //   33	39	72	java/security/KeyManagementException
    //   39	54	82	java/security/KeyManagementException
    //   39	54	86	java/security/NoSuchAlgorithmException
  }
  
  public void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
  
  public void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString) {}
  
  public X509Certificate[] getAcceptedIssuers()
  {
    return _AcceptedIssuers;
  }
  
  public boolean isClientTrusted(X509Certificate[] paramArrayOfX509Certificate)
  {
    return true;
  }
  
  public boolean isServerTrusted(X509Certificate[] paramArrayOfX509Certificate)
  {
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\HTTPSTrustManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */