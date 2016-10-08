package com.b;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.util.Log;
import com.cairh.app.sjkh.common.WriteLogFile;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class b
{
  public static String a = "";
  public static PrivateKey b;
  
  public static String a(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      paramString2 = KeyPairGenerator.getInstance("RSA", "BC");
      Object localObject = new SecureRandom();
      ((SecureRandom)localObject).nextBytes(new byte[20]);
      paramString2.initialize(2048, (SecureRandom)localObject);
      paramString2 = paramString2.generateKeyPair();
      localObject = KeyFactory.getInstance("RSA", "BC");
      PublicKey localPublicKey = ((KeyFactory)localObject).generatePublic(new X509EncodedKeySpec(paramString2.getPublic().getEncoded()));
      b = ((KeyFactory)localObject).generatePrivate(new PKCS8EncodedKeySpec(paramString2.getPrivate().getEncoded()));
      paramString1 = new org.a.c.a("MD5withRSA", new org.a.c.b(paramString1), localPublicKey, null, b);
      Log.e("CertificateHandle.createRequestCert", "生成证书请求文件操作成功");
      a(paramContext, b, null, "123456");
      paramContext = new String(org.a.e.a.a.a(paramString1.a()));
      return paramContext;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
      WriteLogFile.witeLog("CertificateHandle.createRequestCert 生成证书请求文件异常..." + paramContext.hashCode() + ";;;;;" + paramContext.toString());
    }
    return "";
  }
  
  /* Error */
  public static PrivateKey a(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: new 128	java/lang/StringBuilder
    //   3: dup
    //   4: aload_0
    //   5: invokestatic 160	com/b/a:a	(Landroid/content/Context;)Ljava/lang/String;
    //   8: invokestatic 164	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   11: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   14: ldc -90
    //   16: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: ldc -88
    //   21: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   24: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   27: astore_2
    //   28: ldc -86
    //   30: ldc 22
    //   32: invokestatic 175	java/security/KeyStore:getInstance	(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyStore;
    //   35: astore_0
    //   36: new 177	java/io/FileInputStream
    //   39: dup
    //   40: aload_2
    //   41: invokespecial 178	java/io/FileInputStream:<init>	(Ljava/lang/String;)V
    //   44: astore_2
    //   45: aload_0
    //   46: aload_2
    //   47: aload_1
    //   48: invokevirtual 182	java/lang/String:toCharArray	()[C
    //   51: invokevirtual 186	java/security/KeyStore:load	(Ljava/io/InputStream;[C)V
    //   54: aload_0
    //   55: ldc -68
    //   57: aload_1
    //   58: invokevirtual 182	java/lang/String:toCharArray	()[C
    //   61: invokevirtual 192	java/security/KeyStore:getKey	(Ljava/lang/String;[C)Ljava/security/Key;
    //   64: checkcast 78	java/security/PrivateKey
    //   67: astore_0
    //   68: aload_2
    //   69: invokevirtual 197	java/io/InputStream:close	()V
    //   72: ldc -57
    //   74: invokestatic 154	com/cairh/app/sjkh/common/WriteLogFile:witeLog	(Ljava/lang/String;)V
    //   77: aload_0
    //   78: areturn
    //   79: astore_1
    //   80: aconst_null
    //   81: astore_0
    //   82: aload_1
    //   83: invokevirtual 126	java/lang/Exception:printStackTrace	()V
    //   86: new 128	java/lang/StringBuilder
    //   89: dup
    //   90: ldc -55
    //   92: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   95: aload_1
    //   96: invokevirtual 204	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   99: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: ldc -115
    //   104: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   107: aload_1
    //   108: invokevirtual 148	java/lang/Exception:toString	()Ljava/lang/String;
    //   111: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   114: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   117: invokestatic 154	com/cairh/app/sjkh/common/WriteLogFile:witeLog	(Ljava/lang/String;)V
    //   120: aload_0
    //   121: areturn
    //   122: astore_1
    //   123: goto -41 -> 82
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	126	0	paramContext	Context
    //   0	126	1	paramString	String
    //   27	42	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	68	79	java/lang/Exception
    //   68	77	122	java/lang/Exception
  }
  
  public static X509Certificate a(String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return null;
    }
    Provider localProvider = Security.getProvider("BC");
    try
    {
      paramString = org.a.e.a.a.b(paramString.getBytes());
      paramString = (X509Certificate)CertificateFactory.getInstance("X.509", localProvider).generateCertificate(new ByteArrayInputStream(paramString));
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static void a(Context paramContext, PrivateKey paramPrivateKey, Certificate paramCertificate, String paramString)
  {
    if (paramCertificate == null) {}
    for (;;)
    {
      try
      {
        paramCertificate = paramContext.getResources().getAssets().open("default.crt");
        Object localObject = new byte[paramCertificate.available()];
        paramCertificate.read((byte[])localObject);
        localObject = org.a.e.a.a.b((byte[])localObject);
        paramCertificate = CertificateFactory.getInstance("X.509", Security.getProvider("BC"));
        localObject = new ByteArrayInputStream((byte[])localObject);
        paramCertificate = (X509Certificate)paramCertificate.generateCertificate((InputStream)localObject);
        ((ByteArrayInputStream)localObject).close();
        localObject = a.a(paramContext) + "/" + "savePrivateKey.keystore";
        paramContext = KeyStore.getInstance("PKCS12", "BC");
        paramContext.load(null, null);
        paramContext.setKeyEntry("savePrivateKey", paramPrivateKey, paramString.toCharArray(), new Certificate[] { paramCertificate });
        paramPrivateKey = new FileOutputStream((String)localObject);
        paramContext.store(paramPrivateKey, paramString.toCharArray());
        paramPrivateKey.flush();
        paramPrivateKey.close();
        WriteLogFile.witeLog("CertificateHandle.savePrivateKeyToKeyStore 将私钥及证书存放到keystore中操作成功savePrivateKey");
        return;
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
        WriteLogFile.witeLog("CertificateHandle.savePrivateKeyToKeyStore 将私钥及证书存放到keystore中操作异常......" + paramContext.getMessage() + ";;;;;" + paramContext.toString());
        return;
      }
    }
  }
  
  public static void a(Context paramContext, PrivateKey paramPrivateKey, Certificate paramCertificate, String paramString1, String paramString2)
  {
    PrivateKey localPrivateKey = paramPrivateKey;
    if (paramPrivateKey == null) {}
    try
    {
      localPrivateKey = a(paramContext, "123456");
      paramPrivateKey = a.a(paramContext, paramString2, paramString1);
      if (!"0".equals(paramPrivateKey))
      {
        WriteLogFile.witeLog("将密码放到sn文件操作错误，sn：" + paramString2 + " error：" + paramPrivateKey);
        return;
      }
      paramPrivateKey = a.a(paramContext) + "/" + "cert_" + paramString2 + ".keystore";
      paramContext = KeyStore.getInstance("PKCS12", "BC");
      paramContext.load(null, null);
      paramContext.setKeyEntry(paramString2, localPrivateKey, paramString1.toCharArray(), new Certificate[] { paramCertificate });
      paramPrivateKey = new FileOutputStream(paramPrivateKey);
      paramContext.store(paramPrivateKey, paramString1.toCharArray());
      paramPrivateKey.flush();
      paramPrivateKey.close();
      return;
    }
    catch (Exception paramContext)
    {
      WriteLogFile.witeLog("CertificateHandle.getPrivateFromKeyStore 保存证书操作异常....." + paramContext.getMessage() + ";;;;;" + paramContext.toString());
      paramContext.printStackTrace();
    }
  }
  
  /* Error */
  public static String b(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokestatic 306	com/b/b:c	(Landroid/content/Context;Ljava/lang/String;)Ljava/security/cert/X509Certificate;
    //   5: astore_3
    //   6: aload_3
    //   7: ifnonnull +7 -> 14
    //   10: ldc_w 308
    //   13: areturn
    //   14: aload_0
    //   15: aload_1
    //   16: invokestatic 310	com/b/b:b	(Landroid/content/Context;Ljava/lang/String;)Ljava/security/PrivateKey;
    //   19: astore_0
    //   20: aload_0
    //   21: ifnonnull +7 -> 28
    //   24: ldc_w 312
    //   27: areturn
    //   28: new 314	org/a/c/b/a
    //   31: dup
    //   32: invokespecial 315	org/a/c/b/a:<init>	()V
    //   35: invokestatic 319	java/security/Security:addProvider	(Ljava/security/Provider;)I
    //   38: pop
    //   39: new 321	org/a/b/h
    //   42: dup
    //   43: invokespecial 322	org/a/b/h:<init>	()V
    //   46: astore 4
    //   48: aload 4
    //   50: aload_0
    //   51: aload_3
    //   52: getstatic 327	org/a/b/j:g	Ljava/lang/String;
    //   55: invokevirtual 330	org/a/b/h:a	(Ljava/security/PrivateKey;Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    //   58: aload 4
    //   60: new 332	org/a/b/e
    //   63: dup
    //   64: aload_2
    //   65: ldc_w 334
    //   68: invokevirtual 337	java/lang/String:getBytes	(Ljava/lang/String;)[B
    //   71: invokespecial 338	org/a/b/e:<init>	([B)V
    //   74: iconst_1
    //   75: ldc 22
    //   77: invokevirtual 341	org/a/b/h:a	(Lorg/a/b/d;ZLjava/lang/String;)Lorg/a/b/g;
    //   80: astore_0
    //   81: getstatic 347	java/lang/System:out	Ljava/io/PrintStream;
    //   84: new 115	java/lang/String
    //   87: dup
    //   88: aload_0
    //   89: invokevirtual 350	org/a/b/g:a	()[B
    //   92: invokestatic 122	org/a/e/a/a:a	([B)[B
    //   95: invokespecial 123	java/lang/String:<init>	([B)V
    //   98: invokevirtual 355	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   101: new 128	java/lang/StringBuilder
    //   104: dup
    //   105: ldc_w 357
    //   108: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   111: aload_1
    //   112: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: ldc_w 359
    //   118: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   124: invokestatic 154	com/cairh/app/sjkh/common/WriteLogFile:witeLog	(Ljava/lang/String;)V
    //   127: new 115	java/lang/String
    //   130: dup
    //   131: aload_0
    //   132: invokevirtual 350	org/a/b/g:a	()[B
    //   135: invokestatic 122	org/a/e/a/a:a	([B)[B
    //   138: invokespecial 123	java/lang/String:<init>	([B)V
    //   141: astore_0
    //   142: aload_0
    //   143: areturn
    //   144: astore_0
    //   145: new 128	java/lang/StringBuilder
    //   148: dup
    //   149: ldc_w 357
    //   152: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   155: aload_1
    //   156: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: ldc_w 361
    //   162: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   165: aload_0
    //   166: invokevirtual 204	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   169: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: ldc -115
    //   174: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: aload_0
    //   178: invokevirtual 148	java/lang/Exception:toString	()Ljava/lang/String;
    //   181: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: invokestatic 154	com/cairh/app/sjkh/common/WriteLogFile:witeLog	(Ljava/lang/String;)V
    //   190: aconst_null
    //   191: areturn
    //   192: astore_2
    //   193: aconst_null
    //   194: astore_0
    //   195: aload_2
    //   196: invokevirtual 126	java/lang/Exception:printStackTrace	()V
    //   199: new 128	java/lang/StringBuilder
    //   202: dup
    //   203: ldc_w 357
    //   206: invokespecial 131	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   209: aload_1
    //   210: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: ldc_w 361
    //   216: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: aload_2
    //   220: invokevirtual 204	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   223: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: ldc -115
    //   228: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: aload_2
    //   232: invokevirtual 148	java/lang/Exception:toString	()Ljava/lang/String;
    //   235: invokevirtual 144	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   238: invokevirtual 149	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   241: invokestatic 154	com/cairh/app/sjkh/common/WriteLogFile:witeLog	(Ljava/lang/String;)V
    //   244: goto -117 -> 127
    //   247: astore_2
    //   248: goto -53 -> 195
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	251	0	paramContext	Context
    //   0	251	1	paramString1	String
    //   0	251	2	paramString2	String
    //   5	47	3	localX509Certificate	X509Certificate
    //   46	13	4	localh	org.a.b.h
    // Exception table:
    //   from	to	target	type
    //   0	6	144	java/lang/Exception
    //   14	20	144	java/lang/Exception
    //   28	39	144	java/lang/Exception
    //   127	142	144	java/lang/Exception
    //   195	244	144	java/lang/Exception
    //   39	81	192	java/lang/Exception
    //   81	127	247	java/lang/Exception
  }
  
  public static PrivateKey b(Context paramContext, String paramString)
  {
    try
    {
      String str = a.a(paramContext, paramString);
      Object localObject = a.a(paramContext) + "/" + "cert_" + paramString + ".keystore";
      paramContext = KeyStore.getInstance("PKCS12", "BC");
      localObject = new FileInputStream((String)localObject);
      paramContext.load((InputStream)localObject, str.toCharArray());
      paramContext = (PrivateKey)paramContext.getKey(paramString, str.toCharArray());
      localException1.printStackTrace();
    }
    catch (Exception localException1)
    {
      try
      {
        ((InputStream)localObject).close();
        WriteLogFile.witeLog("CertificateHandle.getPrivateFromKeyStore 从keystore中读取私钥操作成功 sn：" + paramString);
        return paramContext;
      }
      catch (Exception localException2)
      {
        for (;;) {}
      }
      localException1 = localException1;
      paramContext = null;
    }
    WriteLogFile.witeLog("CertificateHandle.getPrivateFromKeyStore ，sn：" + paramString + "从keystore中读取私钥操作异常....." + localException1.getMessage() + ";;;;;" + localException1.toString());
    return paramContext;
  }
  
  public static X509Certificate c(Context paramContext, String paramString)
  {
    try
    {
      String str = a.a(paramContext, paramString);
      if ((!"-10".equals(str)) && (!"-1".equals(str)) && (!"-2".equals(str)))
      {
        Object localObject = a.a(paramContext) + "/" + "cert_" + paramString + ".keystore";
        paramContext = KeyStore.getInstance("PKCS12", "BC");
        localObject = new FileInputStream((String)localObject);
        paramContext.load((InputStream)localObject, str.toCharArray());
        paramContext = (X509Certificate)paramContext.getCertificateChain(paramString)[0];
        ((InputStream)localObject).close();
        WriteLogFile.witeLog("CertificateHandle.getPrivateFromKeyStore 从keystore中读取证书操作成功 sn:" + paramString);
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
      WriteLogFile.witeLog("CertificateHandle.getPrivateFromKeyStore ，sn：" + paramString + "从keystore中读取证书操作异常....." + paramContext.getMessage() + ";;;;;" + paramContext.toString());
      return null;
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */