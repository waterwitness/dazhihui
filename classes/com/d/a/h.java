package com.d.a;

import android.os.Build.VERSION;
import com.d.a.a.e;
import com.d.a.a.f;
import java.nio.ByteBuffer;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLEngineResult.HandshakeStatus;
import javax.net.ssl.SSLEngineResult.Status;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;

public class h
  implements com.d.a.e.a, g
{
  static SSLContext a;
  af b;
  ag c;
  boolean d;
  SSLEngine e;
  boolean f;
  HostnameVerifier g;
  o h;
  X509Certificate[] i;
  com.d.a.a.h j;
  e k;
  TrustManager[] l;
  boolean m;
  boolean n;
  Exception o;
  final ai p = new ai();
  final e q = new j(this);
  ai r = new ai();
  com.d.a.a.a s;
  private int u;
  private String v;
  private boolean w;
  
  static
  {
    boolean bool = true;
    if (!h.class.desiredAssertionStatus()) {}
    for (;;)
    {
      t = bool;
      try
      {
        if (Build.VERSION.SDK_INT <= 15) {
          throw new Exception();
        }
      }
      catch (Exception localException1) {}
      try
      {
        a = SSLContext.getInstance("TLS");
        i locali = new i();
        a.init(null, new TrustManager[] { locali }, null);
        return;
      }
      catch (Exception localException2)
      {
        localException1.printStackTrace();
        localException2.printStackTrace();
      }
      bool = false;
    }
    a = SSLContext.getInstance("Default");
    return;
  }
  
  private h(af paramaf, String paramString, int paramInt, SSLEngine paramSSLEngine, TrustManager[] paramArrayOfTrustManager, HostnameVerifier paramHostnameVerifier, boolean paramBoolean)
  {
    this.b = paramaf;
    this.g = paramHostnameVerifier;
    this.m = paramBoolean;
    this.l = paramArrayOfTrustManager;
    this.e = paramSSLEngine;
    this.v = paramString;
    this.u = paramInt;
    this.e.setUseClientMode(paramBoolean);
    this.c = new ag(paramaf);
    this.c.a(new l(this));
    this.b.b(new m(this));
    this.b.a(this.q);
  }
  
  public static void a(af paramaf, String paramString, int paramInt, SSLEngine paramSSLEngine, TrustManager[] paramArrayOfTrustManager, HostnameVerifier paramHostnameVerifier, boolean paramBoolean, o paramo)
  {
    paramString = new h(paramaf, paramString, paramInt, paramSSLEngine, paramArrayOfTrustManager, paramHostnameVerifier, paramBoolean);
    paramString.h = paramo;
    paramaf.a(new k(paramo));
    try
    {
      paramString.e.beginHandshake();
      paramString.a(paramString.e.getHandshakeStatus());
      return;
    }
    catch (SSLException paramaf)
    {
      paramString.a(paramaf);
    }
  }
  
  private void a(Exception paramException)
  {
    Object localObject = this.h;
    if (localObject != null)
    {
      this.h = null;
      this.b.a(new f());
      this.b.a();
      this.b.a(null);
      this.b.d();
      ((o)localObject).a(paramException, null);
    }
    do
    {
      return;
      localObject = h();
    } while (localObject == null);
    ((com.d.a.a.a)localObject).a(paramException);
  }
  
  /* Error */
  private void a(SSLEngineResult.HandshakeStatus paramHandshakeStatus)
  {
    // Byte code:
    //   0: aload_1
    //   1: getstatic 211	javax/net/ssl/SSLEngineResult$HandshakeStatus:NEED_TASK	Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    //   4: if_acmpne +15 -> 19
    //   7: aload_0
    //   8: getfield 118	com/d/a/h:e	Ljavax/net/ssl/SSLEngine;
    //   11: invokevirtual 215	javax/net/ssl/SSLEngine:getDelegatedTask	()Ljava/lang/Runnable;
    //   14: invokeinterface 220 1 0
    //   19: aload_1
    //   20: getstatic 223	javax/net/ssl/SSLEngineResult$HandshakeStatus:NEED_WRAP	Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    //   23: if_acmpne +11 -> 34
    //   26: aload_0
    //   27: aload_0
    //   28: getfield 108	com/d/a/h:r	Lcom/d/a/ai;
    //   31: invokevirtual 226	com/d/a/h:a	(Lcom/d/a/ai;)V
    //   34: aload_1
    //   35: getstatic 229	javax/net/ssl/SSLEngineResult$HandshakeStatus:NEED_UNWRAP	Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    //   38: if_acmpne +20 -> 58
    //   41: aload_0
    //   42: getfield 106	com/d/a/h:q	Lcom/d/a/a/e;
    //   45: aload_0
    //   46: new 96	com/d/a/ai
    //   49: dup
    //   50: invokespecial 97	com/d/a/ai:<init>	()V
    //   53: invokeinterface 234 3 0
    //   58: aload_0
    //   59: getfield 236	com/d/a/h:f	Z
    //   62: ifne +293 -> 355
    //   65: aload_0
    //   66: getfield 118	com/d/a/h:e	Ljavax/net/ssl/SSLEngine;
    //   69: invokevirtual 173	javax/net/ssl/SSLEngine:getHandshakeStatus	()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    //   72: getstatic 239	javax/net/ssl/SSLEngineResult$HandshakeStatus:NOT_HANDSHAKING	Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    //   75: if_acmpeq +16 -> 91
    //   78: aload_0
    //   79: getfield 118	com/d/a/h:e	Ljavax/net/ssl/SSLEngine;
    //   82: invokevirtual 173	javax/net/ssl/SSLEngine:getHandshakeStatus	()Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    //   85: getstatic 242	javax/net/ssl/SSLEngineResult$HandshakeStatus:FINISHED	Ljavax/net/ssl/SSLEngineResult$HandshakeStatus;
    //   88: if_acmpne +267 -> 355
    //   91: aload_0
    //   92: getfield 114	com/d/a/h:m	Z
    //   95: ifeq +209 -> 304
    //   98: aload_0
    //   99: getfield 116	com/d/a/h:l	[Ljavax/net/ssl/TrustManager;
    //   102: astore_2
    //   103: aload_2
    //   104: ifnonnull +270 -> 374
    //   107: invokestatic 248	javax/net/ssl/TrustManagerFactory:getDefaultAlgorithm	()Ljava/lang/String;
    //   110: invokestatic 251	javax/net/ssl/TrustManagerFactory:getInstance	(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
    //   113: astore_1
    //   114: aload_1
    //   115: aconst_null
    //   116: invokevirtual 254	javax/net/ssl/TrustManagerFactory:init	(Ljava/security/KeyStore;)V
    //   119: aload_1
    //   120: invokevirtual 258	javax/net/ssl/TrustManagerFactory:getTrustManagers	()[Ljavax/net/ssl/TrustManager;
    //   123: astore_2
    //   124: aload_2
    //   125: arraylength
    //   126: istore 5
    //   128: iconst_0
    //   129: istore 4
    //   131: aconst_null
    //   132: astore_1
    //   133: goto +244 -> 377
    //   136: aload_0
    //   137: iconst_1
    //   138: putfield 236	com/d/a/h:f	Z
    //   141: iload 4
    //   143: ifne +166 -> 309
    //   146: new 205	com/d/a/f
    //   149: dup
    //   150: aload_1
    //   151: invokespecial 261	com/d/a/f:<init>	(Ljava/lang/Throwable;)V
    //   154: astore_1
    //   155: aload_0
    //   156: aload_1
    //   157: invokespecial 179	com/d/a/h:a	(Ljava/lang/Exception;)V
    //   160: aload_1
    //   161: invokevirtual 263	com/d/a/f:a	()Z
    //   164: ifne +145 -> 309
    //   167: aload_1
    //   168: athrow
    //   169: astore_1
    //   170: new 265	java/lang/RuntimeException
    //   173: dup
    //   174: aload_1
    //   175: invokespecial 266	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   178: athrow
    //   179: aload_2
    //   180: iload 4
    //   182: aaload
    //   183: astore_3
    //   184: aload_3
    //   185: checkcast 268	javax/net/ssl/X509TrustManager
    //   188: astore_3
    //   189: aload_0
    //   190: aload_0
    //   191: getfield 118	com/d/a/h:e	Ljavax/net/ssl/SSLEngine;
    //   194: invokevirtual 272	javax/net/ssl/SSLEngine:getSession	()Ljavax/net/ssl/SSLSession;
    //   197: invokeinterface 278 1 0
    //   202: checkcast 279	[Ljava/security/cert/X509Certificate;
    //   205: putfield 281	com/d/a/h:i	[Ljava/security/cert/X509Certificate;
    //   208: aload_3
    //   209: aload_0
    //   210: getfield 281	com/d/a/h:i	[Ljava/security/cert/X509Certificate;
    //   213: ldc_w 283
    //   216: invokeinterface 287 3 0
    //   221: aload_0
    //   222: getfield 120	com/d/a/h:v	Ljava/lang/String;
    //   225: ifnull +165 -> 390
    //   228: aload_0
    //   229: getfield 112	com/d/a/h:g	Ljavax/net/ssl/HostnameVerifier;
    //   232: ifnonnull +38 -> 270
    //   235: new 289	org/apache/http/conn/ssl/StrictHostnameVerifier
    //   238: dup
    //   239: invokespecial 290	org/apache/http/conn/ssl/StrictHostnameVerifier:<init>	()V
    //   242: aload_0
    //   243: getfield 120	com/d/a/h:v	Ljava/lang/String;
    //   246: aload_0
    //   247: getfield 281	com/d/a/h:i	[Ljava/security/cert/X509Certificate;
    //   250: iconst_0
    //   251: aaload
    //   252: invokestatic 294	org/apache/http/conn/ssl/StrictHostnameVerifier:getCNs	(Ljava/security/cert/X509Certificate;)[Ljava/lang/String;
    //   255: aload_0
    //   256: getfield 281	com/d/a/h:i	[Ljava/security/cert/X509Certificate;
    //   259: iconst_0
    //   260: aaload
    //   261: invokestatic 297	org/apache/http/conn/ssl/StrictHostnameVerifier:getDNSSubjectAlts	(Ljava/security/cert/X509Certificate;)[Ljava/lang/String;
    //   264: invokevirtual 301	org/apache/http/conn/ssl/StrictHostnameVerifier:verify	(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
    //   267: goto +123 -> 390
    //   270: aload_0
    //   271: getfield 112	com/d/a/h:g	Ljavax/net/ssl/HostnameVerifier;
    //   274: aload_0
    //   275: getfield 120	com/d/a/h:v	Ljava/lang/String;
    //   278: aload_0
    //   279: getfield 118	com/d/a/h:e	Ljavax/net/ssl/SSLEngine;
    //   282: invokevirtual 272	javax/net/ssl/SSLEngine:getSession	()Ljavax/net/ssl/SSLSession;
    //   285: invokeinterface 306 3 0
    //   290: pop
    //   291: goto +99 -> 390
    //   294: astore_1
    //   295: iload 4
    //   297: iconst_1
    //   298: iadd
    //   299: istore 4
    //   301: goto +76 -> 377
    //   304: aload_0
    //   305: iconst_1
    //   306: putfield 236	com/d/a/h:f	Z
    //   309: aload_0
    //   310: getfield 159	com/d/a/h:h	Lcom/d/a/o;
    //   313: aconst_null
    //   314: aload_0
    //   315: invokeinterface 193 3 0
    //   320: aload_0
    //   321: aconst_null
    //   322: putfield 159	com/d/a/h:h	Lcom/d/a/o;
    //   325: aload_0
    //   326: getfield 110	com/d/a/h:b	Lcom/d/a/af;
    //   329: aconst_null
    //   330: invokeinterface 166 2 0
    //   335: aload_0
    //   336: invokevirtual 309	com/d/a/h:l	()Lcom/d/a/q;
    //   339: new 311	com/d/a/n
    //   342: dup
    //   343: aload_0
    //   344: invokespecial 312	com/d/a/n:<init>	(Lcom/d/a/h;)V
    //   347: invokevirtual 317	com/d/a/q:a	(Ljava/lang/Runnable;)Ljava/lang/Object;
    //   350: pop
    //   351: aload_0
    //   352: invokevirtual 319	com/d/a/h:e	()V
    //   355: return
    //   356: astore_1
    //   357: aload_0
    //   358: aload_1
    //   359: invokespecial 179	com/d/a/h:a	(Ljava/lang/Exception;)V
    //   362: return
    //   363: astore_1
    //   364: aload_0
    //   365: aload_1
    //   366: invokespecial 179	com/d/a/h:a	(Ljava/lang/Exception;)V
    //   369: return
    //   370: astore_1
    //   371: goto -76 -> 295
    //   374: goto -250 -> 124
    //   377: iload 4
    //   379: iload 5
    //   381: if_icmplt -202 -> 179
    //   384: iconst_0
    //   385: istore 4
    //   387: goto -251 -> 136
    //   390: iconst_1
    //   391: istore 4
    //   393: goto -257 -> 136
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	396	0	this	h
    //   0	396	1	paramHandshakeStatus	SSLEngineResult.HandshakeStatus
    //   102	78	2	arrayOfTrustManager	TrustManager[]
    //   183	26	3	localObject	Object
    //   129	263	4	i1	int
    //   126	256	5	i2	int
    // Exception table:
    //   from	to	target	type
    //   58	91	169	java/security/NoSuchAlgorithmException
    //   91	103	169	java/security/NoSuchAlgorithmException
    //   107	124	169	java/security/NoSuchAlgorithmException
    //   124	128	169	java/security/NoSuchAlgorithmException
    //   136	141	169	java/security/NoSuchAlgorithmException
    //   146	169	169	java/security/NoSuchAlgorithmException
    //   184	267	169	java/security/NoSuchAlgorithmException
    //   270	291	169	java/security/NoSuchAlgorithmException
    //   304	309	169	java/security/NoSuchAlgorithmException
    //   309	355	169	java/security/NoSuchAlgorithmException
    //   184	267	294	java/security/GeneralSecurityException
    //   270	291	294	java/security/GeneralSecurityException
    //   58	91	356	java/security/GeneralSecurityException
    //   91	103	356	java/security/GeneralSecurityException
    //   107	124	356	java/security/GeneralSecurityException
    //   124	128	356	java/security/GeneralSecurityException
    //   136	141	356	java/security/GeneralSecurityException
    //   146	169	356	java/security/GeneralSecurityException
    //   304	309	356	java/security/GeneralSecurityException
    //   309	355	356	java/security/GeneralSecurityException
    //   58	91	363	com/d/a/f
    //   91	103	363	com/d/a/f
    //   107	124	363	com/d/a/f
    //   124	128	363	com/d/a/f
    //   136	141	363	com/d/a/f
    //   146	169	363	com/d/a/f
    //   184	267	363	com/d/a/f
    //   270	291	363	com/d/a/f
    //   304	309	363	com/d/a/f
    //   309	355	363	com/d/a/f
    //   184	267	370	javax/net/ssl/SSLException
    //   270	291	370	javax/net/ssl/SSLException
  }
  
  public static SSLContext c()
  {
    return a;
  }
  
  int a(int paramInt)
  {
    int i1 = paramInt * 3 / 2;
    paramInt = i1;
    if (i1 == 0) {
      paramInt = 8192;
    }
    return paramInt;
  }
  
  public void a()
  {
    this.b.a();
  }
  
  public void a(com.d.a.a.a parama)
  {
    this.b.a(parama);
  }
  
  public void a(e parame)
  {
    this.k = parame;
  }
  
  public void a(com.d.a.a.h paramh)
  {
    this.j = paramh;
  }
  
  public void a(ai paramai)
  {
    if (this.w) {}
    while (this.c.c() > 0) {
      return;
    }
    this.w = true;
    ByteBuffer localByteBuffer = ai.c(a(paramai.d()));
    Object localObject3 = null;
    if ((this.f) && (paramai.d() == 0))
    {
      label52:
      this.w = false;
      ai.c(localByteBuffer);
      return;
    }
    int i1 = paramai.d();
    Object localObject1 = localByteBuffer;
    Object localObject4 = localObject3;
    try
    {
      ByteBuffer[] arrayOfByteBuffer = paramai.b();
      localObject1 = localByteBuffer;
      localObject4 = localObject3;
      localObject3 = this.e.wrap(arrayOfByteBuffer, localByteBuffer);
      localObject1 = localByteBuffer;
      localObject4 = localObject3;
      paramai.a(arrayOfByteBuffer);
      localObject1 = localByteBuffer;
      localObject4 = localObject3;
      localByteBuffer.flip();
      localObject1 = localByteBuffer;
      localObject4 = localObject3;
      this.r.a(localByteBuffer);
      localObject1 = localByteBuffer;
      localObject4 = localObject3;
      if (!t)
      {
        localObject1 = localByteBuffer;
        localObject4 = localObject3;
        if (this.r.e())
        {
          localObject1 = localByteBuffer;
          localObject4 = localObject3;
          throw new AssertionError();
        }
      }
    }
    catch (SSLException localSSLException1)
    {
      localObject3 = localObject4;
    }
    for (;;)
    {
      a(localSSLException1);
      for (;;)
      {
        if (i1 == paramai.d())
        {
          localObject2 = localObject1;
          if (localObject3 == null) {
            break label52;
          }
          localObject2 = localObject1;
          if (((SSLEngineResult)localObject3).getHandshakeStatus() != SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            break label52;
          }
        }
        Object localObject2 = localObject1;
        if (this.c.c() == 0) {
          break;
        }
        localObject2 = localObject1;
        break label52;
        localObject1 = localObject2;
        localObject4 = localObject3;
        if (this.r.d() > 0)
        {
          localObject1 = localObject2;
          localObject4 = localObject3;
          this.c.a(this.r);
        }
        localObject1 = localObject2;
        localObject4 = localObject3;
        int i2 = ((ByteBuffer)localObject2).capacity();
        try
        {
          if (((SSLEngineResult)localObject3).getStatus() == SSLEngineResult.Status.BUFFER_OVERFLOW)
          {
            localObject1 = ai.c(i2 * 2);
            i1 = -1;
          }
          else
          {
            localObject2 = ai.c(a(paramai.d()));
            localObject1 = localObject2;
            localObject4 = localObject3;
            a(((SSLEngineResult)localObject3).getHandshakeStatus());
            localObject1 = localObject2;
          }
        }
        catch (SSLException localSSLException2)
        {
          localObject1 = null;
        }
      }
    }
  }
  
  void a(ai paramai, ByteBuffer paramByteBuffer)
  {
    paramByteBuffer.flip();
    if (paramByteBuffer.hasRemaining())
    {
      paramai.a(paramByteBuffer);
      return;
    }
    ai.c(paramByteBuffer);
  }
  
  public SSLEngine b()
  {
    return this.e;
  }
  
  public void b(com.d.a.a.a parama)
  {
    this.s = parama;
  }
  
  public void d()
  {
    this.b.d();
  }
  
  public void e()
  {
    bo.a(this, this.p);
    if ((this.n) && (!this.p.e()) && (this.s != null)) {
      this.s.a(this.o);
    }
  }
  
  public e f()
  {
    return this.k;
  }
  
  public com.d.a.a.h g()
  {
    return this.j;
  }
  
  public com.d.a.a.a h()
  {
    return this.s;
  }
  
  public boolean i()
  {
    return this.b.i();
  }
  
  public void j()
  {
    this.b.j();
    e();
  }
  
  public boolean k()
  {
    return this.b.k();
  }
  
  public q l()
  {
    return this.b.l();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */