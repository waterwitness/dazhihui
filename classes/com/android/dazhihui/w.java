package com.android.dazhihui;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.s;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.a.a;
import com.android.dazhihui.d.bi;
import com.c.a.k;
import com.c.a.r;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class w
  implements i
{
  private static w c = null;
  private int A = 0;
  private int B = 0;
  private String C = "0.0";
  private g D = g.a();
  private String E;
  private Handler F = new ab(this, Looper.getMainLooper());
  public String a = "";
  public int b;
  private long d = 0L;
  private int[] e;
  private int f = 0;
  private String g = "";
  private String h = "";
  private String i = "";
  private String j = "";
  private String k = null;
  private int l = 0;
  private int m = 0;
  private int n = -1;
  private c o = c.b;
  private List<b> p = new ArrayList();
  private String q;
  private int r;
  private String s = "";
  private boolean t = false;
  private com.android.dazhihui.a.b.m u = null;
  private com.android.dazhihui.a.b.m v = null;
  private String w = "";
  private long x;
  private com.android.dazhihui.a.b.m y = null;
  private int z = 0;
  
  private w()
  {
    this.F.sendEmptyMessageDelayed(0, 300000L);
  }
  
  public static w a()
  {
    if (c == null)
    {
      c = new w();
      o.a();
    }
    return c;
  }
  
  private void e(boolean paramBoolean)
  {
    this.v = f(paramBoolean);
    if (!paramBoolean) {
      this.v.a(new z(this, this));
    }
    com.android.dazhihui.a.g.a().a(this.v);
  }
  
  private com.android.dazhihui.a.b.m f(boolean paramBoolean)
  {
    com.android.dazhihui.a.g.a().a(0L);
    Object localObject1 = new com.android.dazhihui.a.b.x[3];
    localObject1[0] = new com.android.dazhihui.a.b.x(2972);
    localObject1[0].b(2);
    com.android.dazhihui.a.b.x localx = new com.android.dazhihui.a.b.x(130);
    Object localObject2 = new r().a().b();
    Object localObject3 = new LinkedHashMap();
    if (paramBoolean)
    {
      ((Map)localObject3).put("keytp", "");
      ArrayList localArrayList = new ArrayList(1);
      localArrayList.add(localObject3);
      localObject2 = ((k)localObject2).a(localArrayList, new aa(this).getType());
      localObject3 = j();
      if (localObject3 != "".getBytes()) {
        break label242;
      }
      localx.a("");
    }
    for (;;)
    {
      localx.a((byte[])localObject3, 0);
      localx.b(0);
      localx.a((String)localObject2);
      localObject1[0].a(localx);
      localObject1[1] = new com.android.dazhihui.a.b.x(2986);
      localObject1[1].d(1);
      localObject1[2] = v();
      localObject1 = new com.android.dazhihui.a.b.m((com.android.dazhihui.a.b.x[])localObject1);
      ((com.android.dazhihui.a.b.m)localObject1).a(com.android.dazhihui.a.b.n.a);
      ((com.android.dazhihui.a.b.m)localObject1).a(this);
      ((com.android.dazhihui.a.b.m)localObject1).a(Boolean.valueOf(paramBoolean));
      return (com.android.dazhihui.a.b.m)localObject1;
      ((Map)localObject3).put("keytp", "unknown");
      break;
      label242:
      localx.a(this.g);
    }
  }
  
  private com.android.dazhihui.a.b.x v()
  {
    this.D.h(false);
    com.android.dazhihui.a.b.x localx1 = new com.android.dazhihui.a.b.x(3000);
    localx1.b(2);
    com.android.dazhihui.a.b.x localx2 = new com.android.dazhihui.a.b.x(104);
    localx2.d(0);
    label83:
    String str;
    if (TextUtils.isEmpty(this.g))
    {
      localx2.a("");
      if ((!TextUtils.isEmpty(this.k)) && (this.k.length() >= 11)) {
        break label314;
      }
      localx2.a("");
      localx2.a(this.D.u());
      localx2.a(this.D.t());
      localx2.a(this.D.x());
      localx2.a(this.D.r());
      localx2.d(2);
      localx2.a(this.D.v());
      localx2.a(this.D.aq() + ":" + this.D.ap());
      str = this.D.z();
      if (!TextUtils.isEmpty(str)) {
        break label325;
      }
      localx2.a(String.valueOf(this.D.y()));
    }
    for (;;)
    {
      localx2.a(Build.MODEL);
      localx2.a(this.D.ad());
      localx2.a("0");
      localx2.c(this.D.b().a());
      localx2.a("" + this.D.n() + "*" + this.D.m());
      localx1.a(localx2);
      return localx1;
      localx2.a(this.g);
      break;
      label314:
      localx2.a(this.k);
      break label83;
      label325:
      localx2.a(str);
    }
  }
  
  private void w()
  {
    List localList = com.android.dazhihui.ui.a.m.a().m();
    if (localList.size() <= 0) {
      return;
    }
    Object localObject1 = new com.android.dazhihui.a.b.x(3000);
    ((com.android.dazhihui.a.b.x)localObject1).b(1);
    com.android.dazhihui.a.b.x localx = new com.android.dazhihui.a.b.x(103);
    if (TextUtils.isEmpty(this.g))
    {
      localx.a("");
      if ((!TextUtils.isEmpty(this.k)) && (this.k.length() >= 11)) {
        break label268;
      }
      localx.a("");
    }
    for (;;)
    {
      localx.a(this.D.u());
      Object localObject2 = new Date();
      int i1 = ((Date)localObject2).getHours();
      int i2 = ((Date)localObject2).getMinutes();
      int i3 = ((Date)localObject2).getSeconds();
      localx.a(com.android.dazhihui.d.b.a(com.android.dazhihui.ui.a.m.a().p(), com.android.dazhihui.ui.a.m.a().n(), com.android.dazhihui.ui.a.m.a().o(), i1, i2, i3));
      localx.d(this.z + this.A);
      localObject2 = localList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        bi localbi = (bi)((Iterator)localObject2).next();
        i1 = localbi.a;
        String str = localbi.b;
        i2 = localbi.c;
        i3 = localbi.d;
        localx.d(i1);
        localx.a(str);
        localx.c(i2);
        localx.c(i3);
      }
      localx.a(this.g);
      break;
      label268:
      localx.a(this.k);
    }
    ((com.android.dazhihui.a.b.x)localObject1).a(localx);
    localObject1 = new com.android.dazhihui.a.b.m((com.android.dazhihui.a.b.x)localObject1, com.android.dazhihui.a.b.n.a);
    ((com.android.dazhihui.a.b.m)localObject1).d(false);
    com.android.dazhihui.a.g.a().a((h)localObject1);
    localList.clear();
    this.z = 0;
    this.A = 0;
  }
  
  public void a(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.d = paramLong;
  }
  
  public void a(s params)
  {
    com.android.dazhihui.a.b.x[] arrayOfx = new com.android.dazhihui.a.b.x[1];
    arrayOfx[0] = new com.android.dazhihui.a.b.x(2972);
    arrayOfx[0].b(2);
    com.android.dazhihui.a.b.x localx = new com.android.dazhihui.a.b.x(151);
    localx.a(f());
    localx.a(j(), 0);
    localx.d(86400);
    arrayOfx[0].a(localx);
    this.y = new com.android.dazhihui.a.b.m(arrayOfx);
    this.y.a(this);
    this.y.a(params);
    com.android.dazhihui.a.g.a().a(this.y);
  }
  
  public void a(b paramb)
  {
    if ((paramb != null) && (!this.p.contains(paramb)))
    {
      this.p.add(paramb);
      paramb.loginStatusChange(this.o);
    }
  }
  
  public void a(c paramc)
  {
    this.o = paramc;
  }
  
  public void a(String paramString)
  {
    this.E = paramString;
  }
  
  public void a(String paramString1, String paramString2)
  {
    d locald = d.a();
    locald.a("MARK_NAME", com.android.dazhihui.ui.a.m.a().j());
    locald.g();
    locald.a("AUTO_LOGIN", g.a().p());
    locald.g();
    a().b(paramString1);
    a().d(paramString2);
    locald.a("USER_NAME", a().f());
    locald.g();
    locald.a("USER_MD5_PWD", a().i());
    locald.g();
    a().b(false);
  }
  
  public void a(boolean paramBoolean)
  {
    this.n = -1;
    b(c.a);
    s();
    this.u.a(new x(this, this, paramBoolean));
    com.android.dazhihui.a.g.a().a(this.u);
  }
  
  public String b()
  {
    return this.E;
  }
  
  public void b(int paramInt)
  {
    this.r = paramInt;
  }
  
  public void b(c paramc)
  {
    this.o = paramc;
    Iterator localIterator = this.p.iterator();
    while (localIterator.hasNext())
    {
      b localb = (b)localIterator.next();
      if (localb != null) {
        localb.loginStatusChange(paramc);
      }
    }
  }
  
  public void b(String paramString)
  {
    this.g = paramString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.F.removeMessages(2);
    Message localMessage = this.F.obtainMessage(2);
    if (paramBoolean) {}
    for (int i1 = 1;; i1 = 0)
    {
      localMessage.arg1 = i1;
      this.F.sendMessageDelayed(localMessage, 1200L);
      return;
    }
  }
  
  public boolean b(b paramb)
  {
    if ((paramb != null) && (this.p.contains(paramb)))
    {
      this.p.remove(paramb);
      return true;
    }
    return false;
  }
  
  public long c()
  {
    return this.d;
  }
  
  public void c(int paramInt)
  {
    try
    {
      this.z += paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void c(String paramString)
  {
    this.h = paramString;
  }
  
  public void c(boolean paramBoolean)
  {
    u();
    b(c.a);
    if (!this.D.k().b())
    {
      s();
      this.u.a(new y(this, this, paramBoolean));
      com.android.dazhihui.a.g.a().a(this.u);
      return;
    }
    e(paramBoolean);
  }
  
  public int d()
  {
    return this.f;
  }
  
  public void d(int paramInt)
  {
    try
    {
      this.A += paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void d(String paramString)
  {
    this.i = paramString;
  }
  
  public void d(boolean paramBoolean)
  {
    Object localObject = new com.android.dazhihui.a.b.x(3001);
    ((com.android.dazhihui.a.b.x)localObject).b(2);
    com.android.dazhihui.a.b.x localx = new com.android.dazhihui.a.b.x(517);
    localx.a(f());
    localx.a(this.D.v());
    localx.b(this.D.ac());
    localx.a(this.D.r());
    if (paramBoolean) {
      localx.b(1);
    }
    for (;;)
    {
      ((com.android.dazhihui.a.b.x)localObject).a(localx, 1, com.android.dazhihui.ui.a.m.a().h());
      localObject = new com.android.dazhihui.a.b.m((com.android.dazhihui.a.b.x)localObject, com.android.dazhihui.a.b.n.a);
      ((com.android.dazhihui.a.b.m)localObject).a(this);
      com.android.dazhihui.a.g.a().a((h)localObject);
      return;
      localx.b(2);
    }
  }
  
  public int e()
  {
    return this.b;
  }
  
  public void e(String paramString)
  {
    this.i = a.a(paramString);
    paramString = d.a();
    paramString.a("USER_MD5_PWD", this.i);
    paramString.g();
  }
  
  public String f()
  {
    if (TextUtils.isEmpty(this.g))
    {
      d locald = d.a();
      this.g = locald.b("USER_NAME");
      locald.g();
      if (TextUtils.isEmpty(this.g)) {
        return "";
      }
    }
    return this.g;
  }
  
  public void f(String paramString)
  {
    this.k = paramString;
  }
  
  public String g()
  {
    return this.h;
  }
  
  public void g(String paramString)
  {
    this.q = paramString;
  }
  
  public c h()
  {
    return this.o;
  }
  
  public void h(String paramString)
  {
    this.j = paramString;
  }
  
  /* Error */
  public void handleResponse(h paramh, com.android.dazhihui.a.b.j paramj)
  {
    // Byte code:
    //   0: aload_2
    //   1: checkcast 548	com/android/dazhihui/a/b/o
    //   4: invokevirtual 551	com/android/dazhihui/a/b/o:h	()Lcom/android/dazhihui/a/b/p;
    //   7: astore_2
    //   8: aload_2
    //   9: ifnull +1121 -> 1130
    //   12: aload_1
    //   13: aload_0
    //   14: getfield 99	com/android/dazhihui/w:u	Lcom/android/dazhihui/a/b/m;
    //   17: if_acmpeq +11 -> 28
    //   20: aload_1
    //   21: aload_0
    //   22: getfield 105	com/android/dazhihui/w:y	Lcom/android/dazhihui/a/b/m;
    //   25: if_acmpne +301 -> 326
    //   28: aload_2
    //   29: getfield 554	com/android/dazhihui/a/b/p:a	I
    //   32: sipush 2972
    //   35: if_icmpne +1095 -> 1130
    //   38: new 556	com/android/dazhihui/a/b/q
    //   41: dup
    //   42: aload_2
    //   43: getfield 559	com/android/dazhihui/a/b/p:b	[B
    //   46: invokespecial 562	com/android/dazhihui/a/b/q:<init>	([B)V
    //   49: astore_2
    //   50: aload_2
    //   51: invokevirtual 564	com/android/dazhihui/a/b/q:b	()I
    //   54: istore_3
    //   55: aload_2
    //   56: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   59: istore 4
    //   61: aload_2
    //   62: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   65: pop
    //   66: aload_2
    //   67: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   70: pop
    //   71: iload 4
    //   73: bipush 125
    //   75: if_icmpne +58 -> 133
    //   78: iload_3
    //   79: iconst_2
    //   80: if_icmpne +39 -> 119
    //   83: aload_2
    //   84: invokevirtual 567	com/android/dazhihui/a/b/q:h	()I
    //   87: istore_3
    //   88: iload_3
    //   89: ifeq +23 -> 112
    //   92: aload_2
    //   93: invokevirtual 569	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   96: astore_2
    //   97: aload_0
    //   98: getfield 122	com/android/dazhihui/w:D	Lcom/android/dazhihui/g;
    //   101: invokevirtual 513	com/android/dazhihui/g:k	()Lcom/android/dazhihui/d/a/b;
    //   104: aload_2
    //   105: iload_3
    //   106: invokestatic 326	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   109: invokevirtual 570	com/android/dazhihui/d/a/b:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   112: aload_1
    //   113: invokeinterface 574 1 0
    //   118: return
    //   119: aload_0
    //   120: getstatic 84	com/android/dazhihui/c:b	Lcom/android/dazhihui/c;
    //   123: invokevirtual 475	com/android/dazhihui/w:b	(Lcom/android/dazhihui/c;)V
    //   126: return
    //   127: astore_1
    //   128: aload_1
    //   129: invokevirtual 577	java/lang/Exception:printStackTrace	()V
    //   132: return
    //   133: iload 4
    //   135: sipush 151
    //   138: if_icmpne +992 -> 1130
    //   141: iload_3
    //   142: iconst_2
    //   143: if_icmpne +145 -> 288
    //   146: aload_2
    //   147: invokevirtual 564	com/android/dazhihui/a/b/q:b	()I
    //   150: istore_3
    //   151: iload_3
    //   152: ifne +50 -> 202
    //   155: aload_2
    //   156: invokevirtual 569	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   159: astore_2
    //   160: aload_2
    //   161: invokestatic 282	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   164: istore 5
    //   166: iload 5
    //   168: ifne +962 -> 1130
    //   171: aload_0
    //   172: new 579	org/json/JSONObject
    //   175: dup
    //   176: aload_2
    //   177: invokespecial 581	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   180: ldc_w 583
    //   183: invokevirtual 586	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   186: invokevirtual 588	com/android/dazhihui/w:i	(Ljava/lang/String;)V
    //   189: aload_1
    //   190: invokeinterface 574 1 0
    //   195: return
    //   196: astore_1
    //   197: aload_1
    //   198: invokevirtual 577	java/lang/Exception:printStackTrace	()V
    //   201: return
    //   202: iload_3
    //   203: iconst_1
    //   204: if_icmpne +41 -> 245
    //   207: aload_1
    //   208: invokeinterface 591 1 0
    //   213: invokevirtual 597	com/android/dazhihui/a/b/s:getRequestListener	()Lcom/android/dazhihui/a/b/i;
    //   216: ifnull +914 -> 1130
    //   219: aload_1
    //   220: invokeinterface 591 1 0
    //   225: invokevirtual 597	com/android/dazhihui/a/b/s:getRequestListener	()Lcom/android/dazhihui/a/b/i;
    //   228: aload_1
    //   229: new 544	java/lang/Exception
    //   232: dup
    //   233: ldc_w 599
    //   236: invokespecial 600	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   239: invokeinterface 604 3 0
    //   244: return
    //   245: iload_3
    //   246: iconst_2
    //   247: if_icmpne +883 -> 1130
    //   250: aload_1
    //   251: invokeinterface 591 1 0
    //   256: invokevirtual 597	com/android/dazhihui/a/b/s:getRequestListener	()Lcom/android/dazhihui/a/b/i;
    //   259: ifnull +871 -> 1130
    //   262: aload_1
    //   263: invokeinterface 591 1 0
    //   268: invokevirtual 597	com/android/dazhihui/a/b/s:getRequestListener	()Lcom/android/dazhihui/a/b/i;
    //   271: aload_1
    //   272: new 544	java/lang/Exception
    //   275: dup
    //   276: ldc_w 606
    //   279: invokespecial 600	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   282: invokeinterface 604 3 0
    //   287: return
    //   288: aload_1
    //   289: invokeinterface 591 1 0
    //   294: invokevirtual 597	com/android/dazhihui/a/b/s:getRequestListener	()Lcom/android/dazhihui/a/b/i;
    //   297: ifnull +833 -> 1130
    //   300: aload_1
    //   301: invokeinterface 591 1 0
    //   306: invokevirtual 597	com/android/dazhihui/a/b/s:getRequestListener	()Lcom/android/dazhihui/a/b/i;
    //   309: aload_1
    //   310: new 544	java/lang/Exception
    //   313: dup
    //   314: ldc_w 606
    //   317: invokespecial 600	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   320: invokeinterface 604 3 0
    //   325: return
    //   326: aload_1
    //   327: aload_0
    //   328: getfield 101	com/android/dazhihui/w:v	Lcom/android/dazhihui/a/b/m;
    //   331: if_acmpne +676 -> 1007
    //   334: aload_2
    //   335: getfield 554	com/android/dazhihui/a/b/p:a	I
    //   338: sipush 2972
    //   341: if_icmpne +492 -> 833
    //   344: new 556	com/android/dazhihui/a/b/q
    //   347: dup
    //   348: aload_2
    //   349: getfield 559	com/android/dazhihui/a/b/p:b	[B
    //   352: invokespecial 562	com/android/dazhihui/a/b/q:<init>	([B)V
    //   355: astore_1
    //   356: aload_1
    //   357: invokevirtual 564	com/android/dazhihui/a/b/q:b	()I
    //   360: istore_3
    //   361: aload_1
    //   362: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   365: istore 4
    //   367: aload_1
    //   368: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   371: pop
    //   372: aload_1
    //   373: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   376: pop
    //   377: iload 4
    //   379: sipush 130
    //   382: if_icmpne +748 -> 1130
    //   385: iload_3
    //   386: iconst_2
    //   387: if_icmpne +289 -> 676
    //   390: aload_1
    //   391: invokevirtual 564	com/android/dazhihui/a/b/q:b	()I
    //   394: istore_3
    //   395: aload_0
    //   396: iload_3
    //   397: putfield 80	com/android/dazhihui/w:n	I
    //   400: iload_3
    //   401: ifeq +11 -> 412
    //   404: ldc 64
    //   406: sipush 1424
    //   409: invokestatic 609	com/android/dazhihui/d/n:a	(Ljava/lang/String;I)V
    //   412: iload_3
    //   413: ifne +277 -> 690
    //   416: aload_0
    //   417: iconst_0
    //   418: putfield 76	com/android/dazhihui/w:l	I
    //   421: aload_0
    //   422: iconst_0
    //   423: putfield 78	com/android/dazhihui/w:m	I
    //   426: iload_3
    //   427: ifne +359 -> 786
    //   430: aload_0
    //   431: iconst_1
    //   432: putfield 62	com/android/dazhihui/w:f	I
    //   435: invokestatic 443	com/android/dazhihui/c/a/d:a	()Lcom/android/dazhihui/c/a/d;
    //   438: astore_2
    //   439: aload_2
    //   440: ldc_w 611
    //   443: aload_0
    //   444: getfield 62	com/android/dazhihui/w:f	I
    //   447: invokevirtual 450	com/android/dazhihui/c/a/d:a	(Ljava/lang/String;I)V
    //   450: aload_2
    //   451: invokevirtual 452	com/android/dazhihui/c/a/d:g	()V
    //   454: aload_0
    //   455: aload_1
    //   456: invokevirtual 613	com/android/dazhihui/a/b/q:k	()J
    //   459: putfield 60	com/android/dazhihui/w:d	J
    //   462: aload_0
    //   463: aload_1
    //   464: invokevirtual 616	com/android/dazhihui/a/b/q:j	()[I
    //   467: putfield 618	com/android/dazhihui/w:e	[I
    //   470: aload_1
    //   471: invokevirtual 569	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   474: astore_2
    //   475: invokestatic 443	com/android/dazhihui/c/a/d:a	()Lcom/android/dazhihui/c/a/d;
    //   478: astore_1
    //   479: aload_1
    //   480: ldc_w 620
    //   483: aload_0
    //   484: getfield 60	com/android/dazhihui/w:d	J
    //   487: invokevirtual 623	com/android/dazhihui/c/a/d:a	(Ljava/lang/String;J)V
    //   490: iload_3
    //   491: ifne +181 -> 672
    //   494: aload_2
    //   495: invokestatic 282	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   498: istore 5
    //   500: iload 5
    //   502: ifne +311 -> 813
    //   505: new 579	org/json/JSONObject
    //   508: dup
    //   509: aload_2
    //   510: invokespecial 581	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   513: astore_2
    //   514: aload_2
    //   515: ifnull +115 -> 630
    //   518: aload_0
    //   519: aload_2
    //   520: ldc_w 625
    //   523: invokevirtual 586	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   526: putfield 539	com/android/dazhihui/w:q	Ljava/lang/String;
    //   529: aload_0
    //   530: aload_2
    //   531: ldc_w 627
    //   534: iconst_0
    //   535: invokevirtual 631	org/json/JSONObject:optInt	(Ljava/lang/String;I)I
    //   538: putfield 485	com/android/dazhihui/w:r	I
    //   541: aload_0
    //   542: aload_2
    //   543: ldc_w 633
    //   546: invokevirtual 586	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   549: putfield 66	com/android/dazhihui/w:g	Ljava/lang/String;
    //   552: aload_0
    //   553: aload_2
    //   554: ldc_w 635
    //   557: invokevirtual 586	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   560: putfield 68	com/android/dazhihui/w:h	Ljava/lang/String;
    //   563: aload_0
    //   564: aload_2
    //   565: ldc_w 637
    //   568: invokevirtual 586	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   571: putfield 74	com/android/dazhihui/w:k	Ljava/lang/String;
    //   574: aload_0
    //   575: aload_2
    //   576: ldc_w 639
    //   579: iconst_0
    //   580: invokevirtual 643	org/json/JSONObject:optBoolean	(Ljava/lang/String;Z)Z
    //   583: putfield 97	com/android/dazhihui/w:t	Z
    //   586: aload_0
    //   587: aload_2
    //   588: ldc_w 645
    //   591: invokevirtual 586	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   594: putfield 95	com/android/dazhihui/w:s	Ljava/lang/String;
    //   597: aload_0
    //   598: aload_2
    //   599: ldc_w 647
    //   602: invokevirtual 586	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   605: putfield 93	com/android/dazhihui/w:a	Ljava/lang/String;
    //   608: aload_1
    //   609: ldc_w 463
    //   612: aload_0
    //   613: getfield 66	com/android/dazhihui/w:g	Ljava/lang/String;
    //   616: invokevirtual 465	com/android/dazhihui/c/a/d:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   619: aload_1
    //   620: ldc_w 649
    //   623: aload_0
    //   624: getfield 68	com/android/dazhihui/w:h	Ljava/lang/String;
    //   627: invokevirtual 465	com/android/dazhihui/c/a/d:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   630: aload_0
    //   631: getfield 101	com/android/dazhihui/w:v	Lcom/android/dazhihui/a/b/m;
    //   634: invokevirtual 650	com/android/dazhihui/a/b/m:g	()Lcom/android/dazhihui/a/b/s;
    //   637: ifnull +35 -> 672
    //   640: aload_0
    //   641: getfield 101	com/android/dazhihui/w:v	Lcom/android/dazhihui/a/b/m;
    //   644: invokevirtual 650	com/android/dazhihui/a/b/m:g	()Lcom/android/dazhihui/a/b/s;
    //   647: invokevirtual 653	com/android/dazhihui/a/b/s:invokeNextHandle	()V
    //   650: aload_0
    //   651: invokevirtual 655	com/android/dazhihui/w:l	()Z
    //   654: ifeq +18 -> 672
    //   657: aload_0
    //   658: getfield 66	com/android/dazhihui/w:g	Ljava/lang/String;
    //   661: invokestatic 282	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   664: ifne +8 -> 672
    //   667: aload_0
    //   668: iconst_1
    //   669: invokevirtual 656	com/android/dazhihui/w:d	(Z)V
    //   672: aload_1
    //   673: invokevirtual 452	com/android/dazhihui/c/a/d:g	()V
    //   676: aload_0
    //   677: getstatic 84	com/android/dazhihui/c:b	Lcom/android/dazhihui/c;
    //   680: invokevirtual 475	com/android/dazhihui/w:b	(Lcom/android/dazhihui/c;)V
    //   683: return
    //   684: astore_1
    //   685: aload_1
    //   686: invokevirtual 577	java/lang/Exception:printStackTrace	()V
    //   689: return
    //   690: iload_3
    //   691: iconst_3
    //   692: if_icmpne +21 -> 713
    //   695: aload_0
    //   696: aload_0
    //   697: getfield 101	com/android/dazhihui/w:v	Lcom/android/dazhihui/a/b/m;
    //   700: invokevirtual 658	com/android/dazhihui/a/b/m:j	()Ljava/lang/Object;
    //   703: invokevirtual 659	java/lang/Object:toString	()Ljava/lang/String;
    //   706: invokestatic 663	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   709: invokevirtual 665	com/android/dazhihui/w:a	(Z)V
    //   712: return
    //   713: aload_0
    //   714: getfield 101	com/android/dazhihui/w:v	Lcom/android/dazhihui/a/b/m;
    //   717: invokevirtual 658	com/android/dazhihui/a/b/m:j	()Ljava/lang/Object;
    //   720: invokevirtual 659	java/lang/Object:toString	()Ljava/lang/String;
    //   723: invokestatic 663	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   726: ifeq -300 -> 426
    //   729: aload_0
    //   730: invokevirtual 230	com/android/dazhihui/w:j	()[B
    //   733: astore_2
    //   734: aload_0
    //   735: getfield 66	com/android/dazhihui/w:g	Ljava/lang/String;
    //   738: invokestatic 282	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   741: ifne -315 -> 426
    //   744: aload_2
    //   745: ifnull -319 -> 426
    //   748: aload_2
    //   749: arraylength
    //   750: ifle -324 -> 426
    //   753: invokestatic 670	com/android/dazhihui/b/b:a	()Lcom/android/dazhihui/b/b;
    //   756: invokevirtual 673	com/android/dazhihui/b/b:f	()Lcom/android/dazhihui/ui/screen/BaseActivity;
    //   759: astore_2
    //   760: aload_2
    //   761: ifnull -335 -> 426
    //   764: aload_2
    //   765: aload_2
    //   766: ldc_w 674
    //   769: invokevirtual 679	com/android/dazhihui/ui/screen/BaseActivity:getString	(I)Ljava/lang/String;
    //   772: invokestatic 684	com/android/dazhihui/ui/widget/ToastMaker:a	(Landroid/content/Context;Ljava/lang/String;)V
    //   775: goto -349 -> 426
    //   778: astore_2
    //   779: aload_2
    //   780: invokevirtual 577	java/lang/Exception:printStackTrace	()V
    //   783: goto -357 -> 426
    //   786: aload_0
    //   787: iconst_0
    //   788: putfield 62	com/android/dazhihui/w:f	I
    //   791: invokestatic 443	com/android/dazhihui/c/a/d:a	()Lcom/android/dazhihui/c/a/d;
    //   794: astore_2
    //   795: aload_2
    //   796: ldc_w 611
    //   799: aload_0
    //   800: getfield 62	com/android/dazhihui/w:f	I
    //   803: invokevirtual 450	com/android/dazhihui/c/a/d:a	(Ljava/lang/String;I)V
    //   806: aload_2
    //   807: invokevirtual 452	com/android/dazhihui/c/a/d:g	()V
    //   810: goto -356 -> 454
    //   813: aload_0
    //   814: ldc 64
    //   816: putfield 539	com/android/dazhihui/w:q	Ljava/lang/String;
    //   819: aload_0
    //   820: iconst_0
    //   821: putfield 485	com/android/dazhihui/w:r	I
    //   824: aload_0
    //   825: ldc 64
    //   827: putfield 74	com/android/dazhihui/w:k	Ljava/lang/String;
    //   830: goto -200 -> 630
    //   833: aload_2
    //   834: getfield 554	com/android/dazhihui/a/b/p:a	I
    //   837: sipush 2986
    //   840: if_icmpne +46 -> 886
    //   843: aload_0
    //   844: invokevirtual 655	com/android/dazhihui/w:l	()Z
    //   847: ifeq +31 -> 878
    //   850: new 556	com/android/dazhihui/a/b/q
    //   853: dup
    //   854: aload_2
    //   855: getfield 559	com/android/dazhihui/a/b/p:b	[B
    //   858: invokespecial 562	com/android/dazhihui/a/b/q:<init>	([B)V
    //   861: astore_1
    //   862: aload_1
    //   863: invokevirtual 567	com/android/dazhihui/a/b/q:h	()I
    //   866: pop
    //   867: invokestatic 176	com/android/dazhihui/a/g:a	()Lcom/android/dazhihui/a/g;
    //   870: aload_1
    //   871: invokevirtual 613	com/android/dazhihui/a/b/q:k	()J
    //   874: invokevirtual 182	com/android/dazhihui/a/g:a	(J)V
    //   877: return
    //   878: invokestatic 176	com/android/dazhihui/a/g:a	()Lcom/android/dazhihui/a/g;
    //   881: lconst_0
    //   882: invokevirtual 182	com/android/dazhihui/a/g:a	(J)V
    //   885: return
    //   886: aload_2
    //   887: getfield 554	com/android/dazhihui/a/b/p:a	I
    //   890: sipush 3000
    //   893: if_icmpne +237 -> 1130
    //   896: new 556	com/android/dazhihui/a/b/q
    //   899: dup
    //   900: aload_2
    //   901: getfield 559	com/android/dazhihui/a/b/p:b	[B
    //   904: invokespecial 562	com/android/dazhihui/a/b/q:<init>	([B)V
    //   907: astore_1
    //   908: aload_1
    //   909: invokevirtual 564	com/android/dazhihui/a/b/q:b	()I
    //   912: istore_3
    //   913: aload_1
    //   914: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   917: istore 4
    //   919: aload_1
    //   920: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   923: pop
    //   924: aload_1
    //   925: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   928: pop
    //   929: iload 4
    //   931: bipush 104
    //   933: if_icmpne +197 -> 1130
    //   936: iload_3
    //   937: iconst_2
    //   938: if_icmpne +192 -> 1130
    //   941: aload_1
    //   942: invokevirtual 564	com/android/dazhihui/a/b/q:b	()I
    //   945: istore_3
    //   946: iload_3
    //   947: iconst_1
    //   948: if_icmpne +20 -> 968
    //   951: aload_0
    //   952: getfield 122	com/android/dazhihui/w:D	Lcom/android/dazhihui/g;
    //   955: iconst_1
    //   956: invokevirtual 276	com/android/dazhihui/g:h	(Z)V
    //   959: aload_0
    //   960: getfield 122	com/android/dazhihui/w:D	Lcom/android/dazhihui/g;
    //   963: iconst_1
    //   964: invokevirtual 686	com/android/dazhihui/g:i	(Z)V
    //   967: return
    //   968: iload_3
    //   969: iconst_2
    //   970: if_icmpne +20 -> 990
    //   973: aload_0
    //   974: getfield 122	com/android/dazhihui/w:D	Lcom/android/dazhihui/g;
    //   977: iconst_1
    //   978: invokevirtual 276	com/android/dazhihui/g:h	(Z)V
    //   981: aload_0
    //   982: getfield 122	com/android/dazhihui/w:D	Lcom/android/dazhihui/g;
    //   985: iconst_0
    //   986: invokevirtual 686	com/android/dazhihui/g:i	(Z)V
    //   989: return
    //   990: aload_0
    //   991: getfield 122	com/android/dazhihui/w:D	Lcom/android/dazhihui/g;
    //   994: iconst_0
    //   995: invokevirtual 276	com/android/dazhihui/g:h	(Z)V
    //   998: aload_0
    //   999: getfield 122	com/android/dazhihui/w:D	Lcom/android/dazhihui/g;
    //   1002: iconst_0
    //   1003: invokevirtual 686	com/android/dazhihui/g:i	(Z)V
    //   1006: return
    //   1007: aload_2
    //   1008: getfield 554	com/android/dazhihui/a/b/p:a	I
    //   1011: sipush 3001
    //   1014: if_icmpne +116 -> 1130
    //   1017: new 556	com/android/dazhihui/a/b/q
    //   1020: dup
    //   1021: aload_2
    //   1022: getfield 559	com/android/dazhihui/a/b/p:b	[B
    //   1025: invokespecial 562	com/android/dazhihui/a/b/q:<init>	([B)V
    //   1028: astore_1
    //   1029: aload_1
    //   1030: invokevirtual 564	com/android/dazhihui/a/b/q:b	()I
    //   1033: iconst_2
    //   1034: if_icmpne +96 -> 1130
    //   1037: aload_1
    //   1038: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   1041: istore_3
    //   1042: aload_1
    //   1043: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   1046: pop
    //   1047: aload_1
    //   1048: invokevirtual 566	com/android/dazhihui/a/b/q:e	()I
    //   1051: pop
    //   1052: iload_3
    //   1053: sipush 517
    //   1056: if_icmpne +74 -> 1130
    //   1059: aload_1
    //   1060: invokevirtual 564	com/android/dazhihui/a/b/q:b	()I
    //   1063: ifne +16 -> 1079
    //   1066: aload_1
    //   1067: invokevirtual 569	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   1070: astore_1
    //   1071: getstatic 692	java/lang/System:out	Ljava/io/PrintStream;
    //   1074: aload_1
    //   1075: invokevirtual 697	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   1078: return
    //   1079: aload_1
    //   1080: invokevirtual 567	com/android/dazhihui/a/b/q:h	()I
    //   1083: istore_3
    //   1084: aload_1
    //   1085: invokevirtual 569	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   1088: astore_1
    //   1089: getstatic 692	java/lang/System:out	Ljava/io/PrintStream;
    //   1092: new 299	java/lang/StringBuilder
    //   1095: dup
    //   1096: invokespecial 300	java/lang/StringBuilder:<init>	()V
    //   1099: ldc_w 699
    //   1102: invokevirtual 313	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1105: iload_3
    //   1106: invokevirtual 350	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   1109: ldc_w 701
    //   1112: invokevirtual 313	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1115: aload_1
    //   1116: invokevirtual 313	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1119: invokevirtual 319	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1122: invokevirtual 697	java/io/PrintStream:println	(Ljava/lang/String;)V
    //   1125: return
    //   1126: astore_2
    //   1127: goto -497 -> 630
    //   1130: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1131	0	this	w
    //   0	1131	1	paramh	h
    //   0	1131	2	paramj	com.android.dazhihui.a.b.j
    //   54	1052	3	i1	int
    //   59	875	4	i2	int
    //   164	337	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   12	28	127	java/lang/Exception
    //   28	71	127	java/lang/Exception
    //   83	88	127	java/lang/Exception
    //   92	112	127	java/lang/Exception
    //   112	118	127	java/lang/Exception
    //   119	126	127	java/lang/Exception
    //   146	151	127	java/lang/Exception
    //   155	166	127	java/lang/Exception
    //   197	201	127	java/lang/Exception
    //   207	244	127	java/lang/Exception
    //   250	287	127	java/lang/Exception
    //   288	325	127	java/lang/Exception
    //   326	356	127	java/lang/Exception
    //   685	689	127	java/lang/Exception
    //   833	877	127	java/lang/Exception
    //   878	885	127	java/lang/Exception
    //   886	929	127	java/lang/Exception
    //   941	946	127	java/lang/Exception
    //   951	967	127	java/lang/Exception
    //   973	989	127	java/lang/Exception
    //   990	1006	127	java/lang/Exception
    //   1007	1052	127	java/lang/Exception
    //   1059	1078	127	java/lang/Exception
    //   1079	1125	127	java/lang/Exception
    //   171	195	196	java/lang/Exception
    //   356	377	684	java/lang/Exception
    //   390	400	684	java/lang/Exception
    //   404	412	684	java/lang/Exception
    //   416	426	684	java/lang/Exception
    //   430	454	684	java/lang/Exception
    //   454	490	684	java/lang/Exception
    //   494	500	684	java/lang/Exception
    //   505	514	684	java/lang/Exception
    //   518	630	684	java/lang/Exception
    //   630	672	684	java/lang/Exception
    //   672	676	684	java/lang/Exception
    //   676	683	684	java/lang/Exception
    //   695	712	684	java/lang/Exception
    //   713	744	684	java/lang/Exception
    //   748	760	684	java/lang/Exception
    //   779	783	684	java/lang/Exception
    //   786	810	684	java/lang/Exception
    //   813	830	684	java/lang/Exception
    //   764	775	778	java/lang/Exception
    //   505	514	1126	org/json/JSONException
    //   518	630	1126	org/json/JSONException
  }
  
  public void handleTimeout(h paramh)
  {
    if ((paramh == this.u) || (paramh == this.v))
    {
      b(c.b);
      if (paramh == this.v) {
        com.android.dazhihui.d.n.a("", 1424);
      }
    }
    while ((paramh != this.y) || (paramh.g().getRequestListener() == null)) {
      return;
    }
    paramh.g().getRequestListener().handleTimeout(paramh);
  }
  
  public String i()
  {
    if (TextUtils.isEmpty(this.i))
    {
      d locald = d.a();
      this.i = locald.b("USER_MD5_PWD");
      locald.g();
    }
    if (this.i == null) {
      return "";
    }
    return this.i;
  }
  
  public void i(String paramString)
  {
    this.w = paramString;
    this.x = System.currentTimeMillis();
  }
  
  public byte[] j()
  {
    Object localObject = this.D.k();
    if (TextUtils.isEmpty(this.i))
    {
      i();
      if (this.i == null) {
        localObject = "".getBytes();
      }
    }
    byte[] arrayOfByte;
    do
    {
      return (byte[])localObject;
      arrayOfByte = ((com.android.dazhihui.d.a.b)localObject).a(this.i.getBytes());
      localObject = arrayOfByte;
    } while (arrayOfByte != null);
    return "".getBytes();
  }
  
  public String k()
  {
    return this.k;
  }
  
  public boolean l()
  {
    return this.n == 0;
  }
  
  public int m()
  {
    return this.n;
  }
  
  public String n()
  {
    return this.j;
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if ((paramh == this.u) || (paramh == this.v))
    {
      b(c.b);
      if (paramh == this.v) {
        com.android.dazhihui.d.n.a("", 1424);
      }
    }
    while ((paramh != this.y) || (paramh.g().getRequestListener() == null)) {
      return;
    }
    paramh.g().getRequestListener().netException(paramh, paramException);
  }
  
  public String o()
  {
    return this.w;
  }
  
  public boolean p()
  {
    long l1 = System.currentTimeMillis();
    long l2 = this.x;
    return (!TextUtils.isEmpty(this.w)) && (l1 - l2 <= 85800000L);
  }
  
  public void q()
  {
    this.o = c.b;
  }
  
  public void r()
  {
    if (!TextUtils.isEmpty(this.g)) {
      d(false);
    }
  }
  
  public com.android.dazhihui.a.b.m s()
  {
    com.android.dazhihui.d.a.b localb = this.D.k();
    com.android.dazhihui.a.b.x localx1 = new com.android.dazhihui.a.b.x(2972);
    localx1.b(2);
    com.android.dazhihui.a.b.x localx2 = new com.android.dazhihui.a.b.x(125);
    localx2.d(localb.a());
    localx1.a(localx2);
    this.u = new com.android.dazhihui.a.b.m(localx1, com.android.dazhihui.a.b.n.a);
    this.u.a(this);
    return this.u;
  }
  
  public boolean t()
  {
    return this.t;
  }
  
  public void u()
  {
    a(0L);
    this.n = -1;
    i("");
    com.android.dazhihui.a.g.a().a(0L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */