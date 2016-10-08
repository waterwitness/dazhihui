package com.android.dazhihui.ui.a;

import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.delegate.newtrade.CaptialAnalMainScreen;
import com.android.dazhihui.ui.screen.BaseActivity;
import java.security.cert.X509Certificate;

public class h
  implements com.android.dazhihui.a.b.i
{
  private static h e;
  private static int i = 0;
  private l a;
  private k b;
  private String[] c;
  private int d = 0;
  private m f = null;
  private m g = null;
  private m h = null;
  private Handler j = new j(this, Looper.getMainLooper());
  
  public static h a()
  {
    if (e == null) {
      e = new h();
    }
    return e;
  }
  
  private void i()
  {
    com.android.dazhihui.b.b.a().f().startActivity(CaptialAnalMainScreen.class);
  }
  
  private void j()
  {
    if (i < 3)
    {
      i += 1;
      this.j.sendEmptyMessage(0);
      return;
    }
    com.android.dazhihui.b.b.a().f().showShortToast("网络连接超时（30110）");
  }
  
  public void a(k paramk)
  {
    this.b = paramk;
  }
  
  public void a(l paraml)
  {
    this.a = paraml;
    if ((!com.android.dazhihui.a.g.a().o()) && (this.a != null))
    {
      this.a.b();
      this.a = null;
    }
  }
  
  public void a(boolean paramBoolean)
  {
    c(paramBoolean);
  }
  
  public int b()
  {
    return this.d;
  }
  
  public void b(boolean paramBoolean)
  {
    d(paramBoolean);
  }
  
  public void c(boolean paramBoolean)
  {
    if (this.d == 1) {
      return;
    }
    this.d = 1;
    this.g = new com.android.dazhihui.a.b.k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(14, new com.android.dazhihui.ui.delegate.b.h("10000").a("1205", "13").a("1202", com.android.dazhihui.g.a().r()).a("1750", "2").a("9030", com.android.dazhihui.ui.delegate.newtrade.a.a.b).i()) });
    this.g.a(this);
    this.g.a(new boolean[] { paramBoolean });
    com.android.dazhihui.a.g.a().a(this.g);
  }
  
  public boolean c()
  {
    return com.android.dazhihui.ui.delegate.newtrade.a.a.d;
  }
  
  public void d()
  {
    if (!o.r())
    {
      o.a(com.android.dazhihui.b.b.a().f());
      return;
    }
    if (com.android.dazhihui.g.a().J() == null)
    {
      i = 0;
      com.android.dazhihui.a.g.a().g();
      if ((com.android.dazhihui.ui.delegate.newtrade.a.a.a == null) || (com.android.dazhihui.ui.delegate.newtrade.a.a.a.length == 0))
      {
        com.android.dazhihui.b.b.a().f().showShortToast("服务器下发参数有误");
        return;
      }
      this.c = com.android.dazhihui.ui.delegate.newtrade.a.a.a;
      com.android.dazhihui.g.a().a(this.c);
      a().a(new i(this));
      return;
    }
    if (com.android.dazhihui.ui.delegate.b.a.j.b == null)
    {
      c(true);
      return;
    }
    if (!com.android.dazhihui.ui.delegate.newtrade.a.b.b())
    {
      d(true);
      return;
    }
    i();
  }
  
  public void d(boolean paramBoolean)
  {
    if (this.d == 2) {}
    do
    {
      return;
      this.d = 2;
      com.android.dazhihui.a.g.a().B();
      com.android.dazhihui.ui.delegate.newtrade.a.b.a();
      com.android.dazhihui.ui.delegate.newtrade.a.b.a(com.android.dazhihui.ui.delegate.b.a.j.b.getPublicKey());
    } while ((com.android.dazhihui.ui.delegate.newtrade.a.b.a == null) || (com.android.dazhihui.ui.delegate.newtrade.a.b.b == null) || (com.android.dazhihui.ui.delegate.newtrade.a.b.c == null));
    String str = Base64.encodeToString(com.android.dazhihui.ui.delegate.newtrade.a.b.c, 0);
    this.h = new com.android.dazhihui.a.b.k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(0, new com.android.dazhihui.ui.delegate.b.h("10000").a("1205", "13").a("1202", com.android.dazhihui.g.a().r()).a("1750", "2").a("9030", com.android.dazhihui.ui.delegate.newtrade.a.b.a).a("9031", "1").a("9032", str).i()) });
    this.h.a(this);
    com.android.dazhihui.a.g.a().a(this.h);
    this.h.a(new boolean[] { paramBoolean });
  }
  
  public m e()
  {
    return new com.android.dazhihui.a.b.k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(com.android.dazhihui.ui.delegate.b.g.b("8=CTRL1.0\00121004=10\001")) });
  }
  
  public m f()
  {
    Object localObject = o.g("");
    String str1 = ((com.android.dazhihui.ui.delegate.b.h)localObject).a("1005");
    localObject = ((com.android.dazhihui.ui.delegate.b.h)localObject).a("1016");
    String str2 = com.android.dazhihui.ui.delegate.a.a().c().c();
    x localx = new x(10000);
    localx.a(com.android.dazhihui.g.a().r());
    localx.a(com.android.dazhihui.g.a().u());
    localx.a(com.android.dazhihui.g.a().t());
    localx.a(str2);
    localx.a(str1);
    localx.a((String)localObject);
    this.f = new m(localx, n.a);
    this.f.e(true);
    this.f.a(7000L);
    this.f.a(this);
    return this.f;
  }
  
  public String[] g()
  {
    return this.c;
  }
  
  public void h()
  {
    if (this.a != null)
    {
      this.a.b();
      this.a = null;
    }
  }
  
  /* Error */
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 35	com/android/dazhihui/ui/a/h:f	Lcom/android/dazhihui/a/b/m;
    //   4: aload_1
    //   5: if_acmpne +131 -> 136
    //   8: aload_2
    //   9: checkcast 322	com/android/dazhihui/a/b/o
    //   12: invokevirtual 325	com/android/dazhihui/a/b/o:h	()Lcom/android/dazhihui/a/b/p;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnull +118 -> 135
    //   20: aload_1
    //   21: getfield 329	com/android/dazhihui/a/b/p:b	[B
    //   24: ifnull +111 -> 135
    //   27: aload_1
    //   28: getfield 331	com/android/dazhihui/a/b/p:a	I
    //   31: sipush 10000
    //   34: if_icmpne +101 -> 135
    //   37: iconst_0
    //   38: putstatic 27	com/android/dazhihui/ui/a/h:i	I
    //   41: new 333	com/android/dazhihui/a/b/q
    //   44: dup
    //   45: aload_1
    //   46: getfield 329	com/android/dazhihui/a/b/p:b	[B
    //   49: invokespecial 334	com/android/dazhihui/a/b/q:<init>	([B)V
    //   52: astore_1
    //   53: ldc_w 336
    //   56: ldc_w 338
    //   59: invokestatic 343	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   62: pop
    //   63: aload_1
    //   64: invokevirtual 346	com/android/dazhihui/a/b/q:m	()[Ljava/lang/String;
    //   67: astore_1
    //   68: aload_1
    //   69: ifnull +45 -> 114
    //   72: aload_1
    //   73: arraylength
    //   74: ifle +40 -> 114
    //   77: aload_1
    //   78: aconst_null
    //   79: invokestatic 351	com/android/dazhihui/d/n:a	([Ljava/lang/String;[I)Ljava/lang/String;
    //   82: invokestatic 354	com/android/dazhihui/d/n:d	(Ljava/lang/String;)[Ljava/lang/String;
    //   85: astore_1
    //   86: invokestatic 133	com/android/dazhihui/g:a	()Lcom/android/dazhihui/g;
    //   89: aload_1
    //   90: iconst_0
    //   91: aaload
    //   92: invokevirtual 356	com/android/dazhihui/g:g	(Ljava/lang/String;)V
    //   95: invokestatic 133	com/android/dazhihui/g:a	()Lcom/android/dazhihui/g;
    //   98: aload_1
    //   99: iconst_1
    //   100: aaload
    //   101: invokestatic 362	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   104: invokevirtual 364	com/android/dazhihui/g:i	(I)V
    //   107: invokestatic 95	com/android/dazhihui/a/g:a	()Lcom/android/dazhihui/a/g;
    //   110: iconst_0
    //   111: invokevirtual 365	com/android/dazhihui/a/g:e	(Z)V
    //   114: aload_0
    //   115: getfield 90	com/android/dazhihui/ui/a/h:a	Lcom/android/dazhihui/ui/a/l;
    //   118: ifnull +17 -> 135
    //   121: aload_0
    //   122: getfield 90	com/android/dazhihui/ui/a/h:a	Lcom/android/dazhihui/ui/a/l;
    //   125: invokeinterface 366 1 0
    //   130: aload_0
    //   131: aconst_null
    //   132: putfield 90	com/android/dazhihui/ui/a/h:a	Lcom/android/dazhihui/ui/a/l;
    //   135: return
    //   136: aload_1
    //   137: aload_0
    //   138: getfield 37	com/android/dazhihui/ui/a/h:g	Lcom/android/dazhihui/a/b/m;
    //   141: if_acmpne +272 -> 413
    //   144: aload_2
    //   145: checkcast 368	com/android/dazhihui/a/b/l
    //   148: invokevirtual 371	com/android/dazhihui/a/b/l:b	()Lcom/android/dazhihui/ui/delegate/newtrade/a/b;
    //   151: astore_1
    //   152: aload_1
    //   153: invokestatic 61	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   156: invokevirtual 64	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   159: invokestatic 374	com/android/dazhihui/ui/delegate/newtrade/a/b:a	(Lcom/android/dazhihui/ui/delegate/newtrade/a/b;Landroid/content/Context;)Z
    //   162: ifeq +91 -> 253
    //   165: aload_1
    //   166: invokevirtual 376	com/android/dazhihui/ui/delegate/newtrade/a/b:d	()[B
    //   169: invokestatic 379	com/android/dazhihui/ui/delegate/b/g:b	([B)Ljava/lang/String;
    //   172: pop
    //   173: aload_1
    //   174: invokevirtual 376	com/android/dazhihui/ui/delegate/newtrade/a/b:d	()[B
    //   177: invokestatic 382	com/android/dazhihui/ui/delegate/b/h:a	([B)Lcom/android/dazhihui/ui/delegate/b/h;
    //   180: iconst_0
    //   181: ldc -113
    //   183: invokevirtual 385	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   186: invokevirtual 390	java/lang/String:getBytes	()[B
    //   189: invokestatic 393	com/android/dazhihui/ui/delegate/b/a/j:a	([B)Z
    //   192: ifne +19 -> 211
    //   195: invokestatic 61	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   198: invokevirtual 64	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   201: ldc_w 395
    //   204: iconst_0
    //   205: invokestatic 401	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   208: invokevirtual 404	android/widget/Toast:show	()V
    //   211: getstatic 406	com/android/dazhihui/ui/delegate/b/a/j:a	Ljava/security/cert/X509Certificate;
    //   214: ifnonnull +27 -> 241
    //   217: invokestatic 61	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   220: invokevirtual 64	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   223: invokevirtual 410	com/android/dazhihui/ui/screen/BaseActivity:getAssets	()Landroid/content/res/AssetManager;
    //   226: ldc_w 412
    //   229: invokevirtual 418	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   232: astore_1
    //   233: aload_1
    //   234: invokestatic 421	com/android/dazhihui/ui/delegate/b/a/j:a	(Ljava/io/InputStream;)V
    //   237: aload_1
    //   238: invokevirtual 426	java/io/InputStream:close	()V
    //   241: getstatic 206	com/android/dazhihui/ui/delegate/b/a/j:b	Ljava/security/cert/X509Certificate;
    //   244: getstatic 406	com/android/dazhihui/ui/delegate/b/a/j:a	Ljava/security/cert/X509Certificate;
    //   247: invokevirtual 221	java/security/cert/X509Certificate:getPublicKey	()Ljava/security/PublicKey;
    //   250: invokevirtual 429	java/security/cert/X509Certificate:verify	(Ljava/security/PublicKey;)V
    //   253: aload_0
    //   254: aload_0
    //   255: getfield 37	com/android/dazhihui/ui/a/h:g	Lcom/android/dazhihui/a/b/m;
    //   258: invokevirtual 432	com/android/dazhihui/a/b/m:j	()Ljava/lang/Object;
    //   261: checkcast 434	[Z
    //   264: checkcast 434	[Z
    //   267: iconst_0
    //   268: baload
    //   269: invokevirtual 109	com/android/dazhihui/ui/a/h:d	(Z)V
    //   272: return
    //   273: astore_1
    //   274: aload_1
    //   275: invokevirtual 437	java/io/IOException:printStackTrace	()V
    //   278: invokestatic 61	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   281: invokevirtual 64	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   284: ldc_w 439
    //   287: iconst_0
    //   288: invokestatic 401	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   291: invokevirtual 404	android/widget/Toast:show	()V
    //   294: return
    //   295: astore_1
    //   296: aload_1
    //   297: invokevirtual 437	java/io/IOException:printStackTrace	()V
    //   300: goto -59 -> 241
    //   303: astore_1
    //   304: aload_1
    //   305: invokevirtual 440	java/security/InvalidKeyException:printStackTrace	()V
    //   308: invokestatic 61	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   311: invokevirtual 64	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   314: ldc_w 442
    //   317: iconst_0
    //   318: invokestatic 401	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   321: invokevirtual 404	android/widget/Toast:show	()V
    //   324: return
    //   325: astore_1
    //   326: aload_1
    //   327: invokevirtual 443	java/security/cert/CertificateException:printStackTrace	()V
    //   330: invokestatic 61	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   333: invokevirtual 64	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   336: ldc_w 442
    //   339: iconst_0
    //   340: invokestatic 401	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   343: invokevirtual 404	android/widget/Toast:show	()V
    //   346: return
    //   347: astore_1
    //   348: aload_1
    //   349: invokevirtual 444	java/security/NoSuchAlgorithmException:printStackTrace	()V
    //   352: invokestatic 61	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   355: invokevirtual 64	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   358: ldc_w 442
    //   361: iconst_0
    //   362: invokestatic 401	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   365: invokevirtual 404	android/widget/Toast:show	()V
    //   368: return
    //   369: astore_1
    //   370: aload_1
    //   371: invokevirtual 445	java/security/NoSuchProviderException:printStackTrace	()V
    //   374: invokestatic 61	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   377: invokevirtual 64	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   380: ldc_w 442
    //   383: iconst_0
    //   384: invokestatic 401	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   387: invokevirtual 404	android/widget/Toast:show	()V
    //   390: return
    //   391: astore_1
    //   392: aload_1
    //   393: invokevirtual 446	java/security/SignatureException:printStackTrace	()V
    //   396: invokestatic 61	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   399: invokevirtual 64	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   402: ldc_w 442
    //   405: iconst_0
    //   406: invokestatic 401	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   409: invokevirtual 404	android/widget/Toast:show	()V
    //   412: return
    //   413: aload_1
    //   414: aload_0
    //   415: getfield 39	com/android/dazhihui/ui/a/h:h	Lcom/android/dazhihui/a/b/m;
    //   418: if_acmpne -283 -> 135
    //   421: aload_2
    //   422: checkcast 368	com/android/dazhihui/a/b/l
    //   425: invokevirtual 371	com/android/dazhihui/a/b/l:b	()Lcom/android/dazhihui/ui/delegate/newtrade/a/b;
    //   428: astore_1
    //   429: aload_1
    //   430: invokestatic 61	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   433: invokevirtual 64	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   436: invokestatic 374	com/android/dazhihui/ui/delegate/newtrade/a/b:a	(Lcom/android/dazhihui/ui/delegate/newtrade/a/b;Landroid/content/Context;)Z
    //   439: ifeq +71 -> 510
    //   442: aload_1
    //   443: invokevirtual 376	com/android/dazhihui/ui/delegate/newtrade/a/b:d	()[B
    //   446: invokestatic 379	com/android/dazhihui/ui/delegate/b/g:b	([B)Ljava/lang/String;
    //   449: pop
    //   450: aload_1
    //   451: invokevirtual 376	com/android/dazhihui/ui/delegate/newtrade/a/b:d	()[B
    //   454: invokestatic 382	com/android/dazhihui/ui/delegate/b/h:a	([B)Lcom/android/dazhihui/ui/delegate/b/h;
    //   457: astore_1
    //   458: aload_1
    //   459: iconst_0
    //   460: ldc_w 448
    //   463: invokevirtual 451	com/android/dazhihui/ui/delegate/b/h:b	(ILjava/lang/String;)I
    //   466: aload_1
    //   467: iconst_0
    //   468: ldc_w 453
    //   471: invokevirtual 385	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   474: invokestatic 456	com/android/dazhihui/ui/delegate/newtrade/a/b:a	(ILjava/lang/String;)V
    //   477: aload_1
    //   478: iconst_0
    //   479: ldc -113
    //   481: invokevirtual 385	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   484: pop
    //   485: aload_1
    //   486: iconst_0
    //   487: ldc -18
    //   489: invokevirtual 385	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   492: pop
    //   493: aload_1
    //   494: iconst_0
    //   495: ldc -14
    //   497: invokevirtual 385	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   500: pop
    //   501: aload_1
    //   502: iconst_0
    //   503: ldc_w 458
    //   506: invokevirtual 385	com/android/dazhihui/ui/delegate/b/h:a	(ILjava/lang/String;)Ljava/lang/String;
    //   509: pop
    //   510: invokestatic 175	com/android/dazhihui/ui/delegate/b/o:r	()Z
    //   513: ifeq -378 -> 135
    //   516: ldc -1
    //   518: invokestatic 258	com/android/dazhihui/ui/delegate/b/o:g	(Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   521: astore_3
    //   522: aload_3
    //   523: ldc_w 260
    //   526: invokevirtual 263	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;)Ljava/lang/String;
    //   529: astore_1
    //   530: aload_3
    //   531: ldc_w 460
    //   534: invokevirtual 263	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;)Ljava/lang/String;
    //   537: astore_2
    //   538: aload_3
    //   539: ldc_w 265
    //   542: invokevirtual 263	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;)Ljava/lang/String;
    //   545: astore_3
    //   546: invokestatic 270	com/android/dazhihui/ui/delegate/a:a	()Lcom/android/dazhihui/ui/delegate/a;
    //   549: invokevirtual 273	com/android/dazhihui/ui/delegate/a:c	()Lcom/android/dazhihui/ui/delegate/c/c;
    //   552: invokevirtual 277	com/android/dazhihui/ui/delegate/c/c:c	()Ljava/lang/String;
    //   555: astore 4
    //   557: new 115	com/android/dazhihui/ui/delegate/b/h
    //   560: dup
    //   561: aconst_null
    //   562: invokespecial 119	com/android/dazhihui/ui/delegate/b/h:<init>	(Ljava/lang/String;)V
    //   565: ldc_w 462
    //   568: aload 4
    //   570: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   573: ldc_w 464
    //   576: aload_3
    //   577: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   580: ldc_w 260
    //   583: aload_1
    //   584: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   587: ldc_w 466
    //   590: aload_2
    //   591: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   594: ldc 121
    //   596: ldc 123
    //   598: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   601: ldc_w 460
    //   604: getstatic 469	com/android/dazhihui/ui/delegate/b/o:k	Ljava/lang/String;
    //   607: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   610: ldc_w 471
    //   613: getstatic 473	com/android/dazhihui/ui/delegate/b/o:j	Ljava/lang/String;
    //   616: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   619: ldc_w 475
    //   622: ldc 117
    //   624: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   627: ldc_w 477
    //   630: getstatic 469	com/android/dazhihui/ui/delegate/b/o:k	Ljava/lang/String;
    //   633: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   636: ldc_w 479
    //   639: getstatic 473	com/android/dazhihui/ui/delegate/b/o:j	Ljava/lang/String;
    //   642: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   645: ldc -128
    //   647: new 481	java/lang/StringBuilder
    //   650: dup
    //   651: invokespecial 482	java/lang/StringBuilder:<init>	()V
    //   654: ldc_w 484
    //   657: invokevirtual 488	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   660: invokestatic 133	com/android/dazhihui/g:a	()Lcom/android/dazhihui/g;
    //   663: invokevirtual 137	com/android/dazhihui/g:r	()Ljava/lang/String;
    //   666: invokevirtual 488	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   669: invokevirtual 491	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   672: invokevirtual 126	com/android/dazhihui/ui/delegate/b/h:a	(Ljava/lang/String;Ljava/lang/String;)Lcom/android/dazhihui/ui/delegate/b/h;
    //   675: invokestatic 494	com/android/dazhihui/ui/delegate/newtrade/a/a:a	(Lcom/android/dazhihui/ui/delegate/b/h;)V
    //   678: iconst_1
    //   679: putstatic 171	com/android/dazhihui/ui/delegate/newtrade/a/a:d	Z
    //   682: aload_0
    //   683: iconst_3
    //   684: putfield 33	com/android/dazhihui/ui/a/h:d	I
    //   687: aload_0
    //   688: getfield 39	com/android/dazhihui/ui/a/h:h	Lcom/android/dazhihui/a/b/m;
    //   691: invokevirtual 432	com/android/dazhihui/a/b/m:j	()Ljava/lang/Object;
    //   694: checkcast 434	[Z
    //   697: checkcast 434	[Z
    //   700: iconst_0
    //   701: baload
    //   702: ifeq +8 -> 710
    //   705: aload_0
    //   706: invokespecial 210	com/android/dazhihui/ui/a/h:i	()V
    //   709: return
    //   710: aload_0
    //   711: getfield 87	com/android/dazhihui/ui/a/h:b	Lcom/android/dazhihui/ui/a/k;
    //   714: ifnull -579 -> 135
    //   717: aload_0
    //   718: getfield 87	com/android/dazhihui/ui/a/h:b	Lcom/android/dazhihui/ui/a/k;
    //   721: invokeinterface 497 1 0
    //   726: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	727	0	this	h
    //   0	727	1	paramh	com.android.dazhihui.a.b.h
    //   0	727	2	paramj	com.android.dazhihui.a.b.j
    //   521	56	3	localObject	Object
    //   555	14	4	str	String
    // Exception table:
    //   from	to	target	type
    //   217	237	273	java/io/IOException
    //   237	241	295	java/io/IOException
    //   241	253	303	java/security/InvalidKeyException
    //   241	253	325	java/security/cert/CertificateException
    //   241	253	347	java/security/NoSuchAlgorithmException
    //   241	253	369	java/security/NoSuchProviderException
    //   241	253	391	java/security/SignatureException
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    if (this.f == paramh) {
      j();
    }
    while ((this.h != paramh) && (this.g != paramh)) {
      return;
    }
    this.d = 0;
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    if (this.f == paramh) {
      j();
    }
    while ((this.h != paramh) && (this.g != paramh)) {
      return;
    }
    this.d = 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */