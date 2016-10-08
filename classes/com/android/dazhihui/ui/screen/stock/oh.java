package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.bf;
import com.android.dazhihui.d.bg;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.DZLHItem;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import java.util.ArrayList;
import java.util.Vector;

public class oh
  extends e
{
  String a = "http://mnews.gw.com.cn/";
  protected int b;
  private int c = 1;
  private int d = 4095;
  private int e = 37904;
  private boolean[] f;
  private int[] g;
  private String[] h;
  private byte i = 0;
  private int j = 30;
  private int[] k = null;
  private MarketVo l;
  private String m;
  private TableLayoutGroup n;
  private com.android.dazhihui.ui.a.m o = com.android.dazhihui.ui.a.m.a();
  private String p;
  private Vector<String> q;
  private com.android.dazhihui.a.b.m r;
  private f s;
  private ArrayList<DZLHItem> t;
  private final String u = this.a + "wap/data/gold/jygz.json";
  private int v;
  private bg w;
  
  private void a(int paramInt)
  {
    if (this.v != 0) {
      if ((this.q != null) && (this.q.size() != 0)) {}
    }
    while ((this.d == 106) || (this.d == 107))
    {
      return;
      if (paramInt + 50 < this.q.size()) {}
      for (int i1 = 50;; i1 = this.q.size() - paramInt)
      {
        localObject = new x(2955);
        ((x)localObject).c(this.d);
        ((x)localObject).c(this.e);
        ((x)localObject).a(this.q, paramInt, i1);
        ((x)localObject).c("市场-自动包-子市场名=-带代码集合requestID=" + this.d + "-begin=" + paramInt);
        this.r = new com.android.dazhihui.a.b.m((x)localObject);
        registRequestListener(this.r);
        this.r.a(Integer.valueOf(paramInt));
        setAutoRequest(this.r);
        return;
      }
    }
    Object localObject = new x[1];
    localObject[0] = new x(2955);
    localObject[0].c(this.d);
    localObject[0].c(this.e);
    localObject[0].b(this.c);
    localObject[0].b(this.i);
    localObject[0].c(paramInt);
    localObject[0].c(this.j);
    localObject[0].c("-requestID=" + this.d + "-begin=" + paramInt);
    localObject = new com.android.dazhihui.a.b.m((x[])localObject);
    ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
    registRequestListener((h)localObject);
    setAutoRequest((h)localObject);
  }
  
  private int b(int paramInt)
  {
    int i2 = 0;
    int i1 = i2;
    if (paramInt >= 0)
    {
      i1 = i2;
      if (paramInt < this.g.length) {
        i1 = this.g[paramInt];
      }
    }
    return i1;
  }
  
  private void c(int paramInt)
  {
    x[] arrayOfx = new x[2];
    arrayOfx[0] = new x(2955);
    arrayOfx[0].c(107);
    arrayOfx[0].c(this.e);
    Object localObject = new Vector();
    ((Vector)localObject).add(this.m);
    arrayOfx[0].a((Vector)localObject);
    localObject = "";
    if (this.l != null) {
      localObject = this.l.getName();
    }
    arrayOfx[0].c("市场-板块详情列表-" + (String)localObject + "-自动包-107-moduleCode=" + this.m);
    arrayOfx[1] = new x(2955);
    arrayOfx[1].c(this.d);
    arrayOfx[1].c(this.e);
    arrayOfx[1].b(this.c);
    arrayOfx[1].b(this.i);
    arrayOfx[1].c(paramInt);
    arrayOfx[1].c(this.j);
    arrayOfx[1].c("市场-板块详情列表-" + (String)localObject + "-自动包-moduleCode=" + this.m + "-requestID=" + this.d + "-begin=" + paramInt);
    localObject = new com.android.dazhihui.a.b.m(arrayOfx);
    ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
    registRequestListener((h)localObject);
    setAutoRequest((h)localObject);
  }
  
  public void a()
  {
    this.s = new f();
    this.s.c(this.u);
    this.s.a(this);
    sendRequest(this.s);
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    x localx = new x(2955);
    localx.c(4095);
    localx.c(this.e);
    localx.b(this.c);
    localx.b(this.i);
    localx.c(paramInt);
    localx.c(this.j);
    localx.a(this.m);
    Object localObject = "";
    if (this.l != null) {
      localObject = this.l.getName();
    }
    localx.c("市场-板块详情列表-" + (String)localObject + "-4095-moduleCode=" + this.m + "-begin=" + paramInt);
    localObject = new com.android.dazhihui.a.b.m(localx);
    ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
    registRequestListener((h)localObject);
    setAutoRequest((h)localObject);
    sendRequest((h)localObject);
  }
  
  public void a(View paramView)
  {
    boolean bool = false;
    if (this.v == 0)
    {
      this.e = 37904;
      this.f = new boolean[] { 0, 1, 0, 0, 0, 1, 1, 0, 0 };
      this.g = new int[] { 0, 17, 0, 0, 0, 3, 1, 0, 0 };
      this.h = getResources().getStringArray(2131361923);
      if (!TextUtils.isEmpty(this.p)) {
        this.h[0] = this.p;
      }
      n.a(this.m, 1008);
      this.n = ((TableLayoutGroup)paramView.findViewById(2131560209));
      this.n.setLayerType(1, null);
      this.n.setContinuousLoading(true);
      this.n.setColumnClickable(this.f);
      this.n.setHeaderColumn(this.h);
      paramView = this.n;
      if (this.i != 0) {
        break label467;
      }
    }
    for (;;)
    {
      paramView.a(2, bool);
      this.n.setColumnAlign(Paint.Align.CENTER);
      this.n.setOnLoadingListener(new oi(this));
      this.n.setOnContentScrollChangeListener(new oj(this));
      this.n.setOnTableLayoutClickListener(new ok(this));
      changeLookFace(this.mLookFace);
      return;
      this.d = 106;
      this.w = bf.a("交易关注");
      if (this.w == null) {
        this.w = bf.a();
      }
      if (this.w == null) {
        break;
      }
      this.e = this.w.e();
      Object localObject = this.w.a();
      this.h = new String[localObject.length];
      int i1 = 0;
      while (i1 < localObject.length)
      {
        this.h[i1] = localObject[i1];
        i1 += 1;
      }
      localObject = this.w.b();
      this.f = new boolean[localObject.length];
      i1 = 0;
      while (i1 < localObject.length)
      {
        this.f[i1] = localObject[i1];
        i1 += 1;
      }
      this.g = this.w.c();
      this.b = this.w.d();
      this.c = b(this.b);
      break;
      label467:
      bool = true;
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    if ((this.q == null) || (this.q.size() == 0)) {
      return;
    }
    int i1 = 0;
    if (i1 < this.q.size())
    {
      if (i1 + 50 < this.q.size()) {}
      for (int i2 = 50;; i2 = this.q.size() - i1)
      {
        x localx = new x(2955);
        localx.c(this.d);
        localx.c(this.e);
        localx.a(this.q, i1, i2);
        this.r = new com.android.dazhihui.a.b.m(localx);
        registRequestListener(this.r);
        this.r.a(Integer.valueOf(i1));
        sendRequest(this.r);
        i1 += 50;
        break;
      }
    }
    a(0);
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (ol.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.n == null);
      this.n.setBackgroundColor(getResources().getColor(2131493542));
      this.n.a(paramy);
      return;
    } while (this.n == null);
    this.n.setBackgroundColor(getResources().getColor(2131493605));
    this.n.a(paramy);
  }
  
  public View getScroolView()
  {
    return this.n;
  }
  
  /* Error */
  public void handleResponse(h paramh, com.android.dazhihui.a.b.j paramj)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 365
    //   4: ifne +11 -> 15
    //   7: aload_0
    //   8: getfield 191	com/android/dazhihui/ui/screen/stock/oh:s	Lcom/android/dazhihui/a/b/f;
    //   11: aload_1
    //   12: if_acmpne +294 -> 306
    //   15: aload_2
    //   16: checkcast 365	com/android/dazhihui/a/b/g
    //   19: astore_1
    //   20: aload_1
    //   21: ifnonnull +4 -> 25
    //   24: return
    //   25: aload_1
    //   26: invokevirtual 368	com/android/dazhihui/a/b/g:a	()[B
    //   29: astore_1
    //   30: new 323	java/lang/String
    //   33: dup
    //   34: aload_1
    //   35: ldc_w 370
    //   38: invokespecial 373	java/lang/String:<init>	([BLjava/lang/String;)V
    //   41: astore_1
    //   42: new 375	org/json/JSONArray
    //   45: dup
    //   46: aload_1
    //   47: invokespecial 377	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   50: iconst_0
    //   51: invokevirtual 381	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   54: ldc_w 383
    //   57: invokevirtual 388	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   60: astore_2
    //   61: aload_2
    //   62: ifnull +56 -> 118
    //   65: ldc_w 390
    //   68: aload_2
    //   69: ldc_w 392
    //   72: invokevirtual 396	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   75: invokevirtual 399	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   78: ifne +40 -> 118
    //   81: aload_0
    //   82: invokevirtual 403	com/android/dazhihui/ui/screen/stock/oh:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   85: aload_0
    //   86: invokevirtual 212	com/android/dazhihui/ui/screen/stock/oh:getResources	()Landroid/content/res/Resources;
    //   89: ldc_w 404
    //   92: invokevirtual 407	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   95: iconst_0
    //   96: invokestatic 413	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   99: invokevirtual 416	android/widget/Toast:show	()V
    //   102: return
    //   103: astore_1
    //   104: aload_1
    //   105: invokevirtual 419	org/json/JSONException:printStackTrace	()V
    //   108: return
    //   109: astore_1
    //   110: aload_1
    //   111: invokevirtual 420	java/lang/Exception:printStackTrace	()V
    //   114: return
    //   115: astore_1
    //   116: aload_1
    //   117: athrow
    //   118: new 375	org/json/JSONArray
    //   121: dup
    //   122: aload_1
    //   123: invokespecial 377	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   126: iconst_0
    //   127: invokevirtual 381	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   130: ldc_w 422
    //   133: invokevirtual 426	org/json/JSONObject:getJSONArray	(Ljava/lang/String;)Lorg/json/JSONArray;
    //   136: astore_1
    //   137: aload_1
    //   138: ifnull +146 -> 284
    //   141: aload_0
    //   142: getfield 428	com/android/dazhihui/ui/screen/stock/oh:t	Ljava/util/ArrayList;
    //   145: ifnonnull +14 -> 159
    //   148: aload_0
    //   149: new 430	java/util/ArrayList
    //   152: dup
    //   153: invokespecial 431	java/util/ArrayList:<init>	()V
    //   156: putfield 428	com/android/dazhihui/ui/screen/stock/oh:t	Ljava/util/ArrayList;
    //   159: aload_0
    //   160: getfield 428	com/android/dazhihui/ui/screen/stock/oh:t	Ljava/util/ArrayList;
    //   163: invokevirtual 434	java/util/ArrayList:clear	()V
    //   166: aload_0
    //   167: getfield 94	com/android/dazhihui/ui/screen/stock/oh:q	Ljava/util/Vector;
    //   170: ifnonnull +14 -> 184
    //   173: aload_0
    //   174: new 96	java/util/Vector
    //   177: dup
    //   178: invokespecial 161	java/util/Vector:<init>	()V
    //   181: putfield 94	com/android/dazhihui/ui/screen/stock/oh:q	Ljava/util/Vector;
    //   184: aload_0
    //   185: getfield 94	com/android/dazhihui/ui/screen/stock/oh:q	Ljava/util/Vector;
    //   188: invokevirtual 435	java/util/Vector:clear	()V
    //   191: iconst_0
    //   192: istore 7
    //   194: iload 7
    //   196: aload_1
    //   197: invokevirtual 438	org/json/JSONArray:length	()I
    //   200: if_icmpge +78 -> 278
    //   203: aload_1
    //   204: iload 7
    //   206: invokevirtual 381	org/json/JSONArray:getJSONObject	(I)Lorg/json/JSONObject;
    //   209: astore 4
    //   211: aload 4
    //   213: ldc_w 440
    //   216: invokevirtual 396	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   219: astore_2
    //   220: aload 4
    //   222: ldc_w 442
    //   225: invokevirtual 396	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   228: astore_3
    //   229: aload 4
    //   231: ldc_w 444
    //   234: invokevirtual 396	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   237: astore 4
    //   239: aload_0
    //   240: getfield 94	com/android/dazhihui/ui/screen/stock/oh:q	Ljava/util/Vector;
    //   243: aload_2
    //   244: invokevirtual 167	java/util/Vector:add	(Ljava/lang/Object;)Z
    //   247: pop
    //   248: new 446	com/android/dazhihui/ui/model/stock/DZLHItem
    //   251: dup
    //   252: aload_2
    //   253: aload_3
    //   254: aload 4
    //   256: invokespecial 449	com/android/dazhihui/ui/model/stock/DZLHItem:<init>	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   259: astore_2
    //   260: aload_0
    //   261: getfield 428	com/android/dazhihui/ui/screen/stock/oh:t	Ljava/util/ArrayList;
    //   264: aload_2
    //   265: invokevirtual 450	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   268: pop
    //   269: iload 7
    //   271: iconst_1
    //   272: iadd
    //   273: istore 7
    //   275: goto -81 -> 194
    //   278: aload_0
    //   279: iconst_0
    //   280: invokevirtual 452	com/android/dazhihui/ui/screen/stock/oh:a	(Z)V
    //   283: return
    //   284: aload_0
    //   285: invokevirtual 403	com/android/dazhihui/ui/screen/stock/oh:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   288: aload_0
    //   289: invokevirtual 212	com/android/dazhihui/ui/screen/stock/oh:getResources	()Landroid/content/res/Resources;
    //   292: ldc_w 404
    //   295: invokevirtual 407	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   298: iconst_0
    //   299: invokestatic 413	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   302: invokevirtual 416	android/widget/Toast:show	()V
    //   305: return
    //   306: aload_2
    //   307: checkcast 454	com/android/dazhihui/a/b/o
    //   310: invokevirtual 457	com/android/dazhihui/a/b/o:h	()Lcom/android/dazhihui/a/b/p;
    //   313: astore_3
    //   314: aload_3
    //   315: ifnull +369 -> 684
    //   318: new 459	com/android/dazhihui/ui/model/stock/Stock2955Vo
    //   321: dup
    //   322: invokespecial 460	com/android/dazhihui/ui/model/stock/Stock2955Vo:<init>	()V
    //   325: astore_2
    //   326: aload_3
    //   327: getfield 464	com/android/dazhihui/a/b/p:a	I
    //   330: sipush 2955
    //   333: if_icmpne +351 -> 684
    //   336: aload_3
    //   337: getfield 467	com/android/dazhihui/a/b/p:b	[B
    //   340: astore_3
    //   341: aload_3
    //   342: ifnull +342 -> 684
    //   345: new 469	com/android/dazhihui/a/b/q
    //   348: dup
    //   349: aload_3
    //   350: invokespecial 472	com/android/dazhihui/a/b/q:<init>	([B)V
    //   353: astore_3
    //   354: aload_3
    //   355: invokevirtual 473	com/android/dazhihui/a/b/q:e	()I
    //   358: istore 10
    //   360: aload_3
    //   361: invokevirtual 473	com/android/dazhihui/a/b/q:e	()I
    //   364: istore 11
    //   366: aload_3
    //   367: invokevirtual 473	com/android/dazhihui/a/b/q:e	()I
    //   370: istore 9
    //   372: aload_3
    //   373: invokevirtual 473	com/android/dazhihui/a/b/q:e	()I
    //   376: istore 12
    //   378: iload 10
    //   380: bipush 105
    //   382: if_icmpeq +17 -> 399
    //   385: iload 10
    //   387: bipush 113
    //   389: if_icmpeq +10 -> 399
    //   392: iload 10
    //   394: bipush 114
    //   396: if_icmpne +11 -> 407
    //   399: aload_0
    //   400: iload 12
    //   402: newarray <illegal type>
    //   404: putfield 60	com/android/dazhihui/ui/screen/stock/oh:k	[I
    //   407: iconst_0
    //   408: istore 8
    //   410: iconst_0
    //   411: istore 7
    //   413: iload 10
    //   415: aload_0
    //   416: getfield 51	com/android/dazhihui/ui/screen/stock/oh:d	I
    //   419: if_icmpne +42 -> 461
    //   422: iload 8
    //   424: istore 7
    //   426: aload_1
    //   427: invokeinterface 478 1 0
    //   432: ifnull +255 -> 687
    //   435: aload_1
    //   436: invokeinterface 478 1 0
    //   441: checkcast 132	java/lang/Integer
    //   444: invokevirtual 481	java/lang/Integer:intValue	()I
    //   447: istore 7
    //   449: goto +238 -> 687
    //   452: aload_0
    //   453: getfield 160	com/android/dazhihui/ui/screen/stock/oh:n	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   456: iload 13
    //   458: invokevirtual 484	com/android/dazhihui/ui/widget/TableLayoutGroup:setLoadingDown	(Z)V
    //   461: new 430	java/util/ArrayList
    //   464: dup
    //   465: invokespecial 431	java/util/ArrayList:<init>	()V
    //   468: astore_1
    //   469: iload 12
    //   471: iconst_1
    //   472: isub
    //   473: istore 9
    //   475: iload 9
    //   477: istore 8
    //   479: iload 8
    //   481: iflt +193 -> 674
    //   484: aload_0
    //   485: getfield 221	com/android/dazhihui/ui/screen/stock/oh:h	[Ljava/lang/String;
    //   488: arraylength
    //   489: anewarray 323	java/lang/String
    //   492: astore 4
    //   494: aload_0
    //   495: getfield 221	com/android/dazhihui/ui/screen/stock/oh:h	[Ljava/lang/String;
    //   498: arraylength
    //   499: newarray <illegal type>
    //   501: astore 5
    //   503: aload_2
    //   504: aload_3
    //   505: iload 10
    //   507: iload 11
    //   509: invokevirtual 488	com/android/dazhihui/ui/model/stock/Stock2955Vo:decode	(Lcom/android/dazhihui/a/b/q;II)V
    //   512: aload_2
    //   513: aload_0
    //   514: getfield 221	com/android/dazhihui/ui/screen/stock/oh:h	[Ljava/lang/String;
    //   517: aload 4
    //   519: aload 5
    //   521: iconst_0
    //   522: invokevirtual 492	com/android/dazhihui/ui/model/stock/Stock2955Vo:getData	([Ljava/lang/String;[Ljava/lang/String;[II)V
    //   525: aload_0
    //   526: getfield 428	com/android/dazhihui/ui/screen/stock/oh:t	Ljava/util/ArrayList;
    //   529: ifnull +32 -> 561
    //   532: aload 4
    //   534: iconst_3
    //   535: aload_0
    //   536: getfield 428	com/android/dazhihui/ui/screen/stock/oh:t	Ljava/util/ArrayList;
    //   539: iload 9
    //   541: iload 8
    //   543: isub
    //   544: invokevirtual 496	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   547: checkcast 446	com/android/dazhihui/ui/model/stock/DZLHItem
    //   550: invokevirtual 499	com/android/dazhihui/ui/model/stock/DZLHItem:getSszt	()Ljava/lang/String;
    //   553: aastore
    //   554: aload 5
    //   556: iconst_3
    //   557: sipush 39936
    //   560: iastore
    //   561: new 501	com/android/dazhihui/ui/widget/mh
    //   564: dup
    //   565: invokespecial 502	com/android/dazhihui/ui/widget/mh:<init>	()V
    //   568: astore 6
    //   570: aload 6
    //   572: aload 4
    //   574: putfield 504	com/android/dazhihui/ui/widget/mh:a	[Ljava/lang/String;
    //   577: aload 6
    //   579: aload 5
    //   581: putfield 506	com/android/dazhihui/ui/widget/mh:b	[I
    //   584: aload 6
    //   586: aload_2
    //   587: getfield 509	com/android/dazhihui/ui/model/stock/Stock2955Vo:code	Ljava/lang/String;
    //   590: invokestatic 511	com/android/dazhihui/d/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   593: putfield 513	com/android/dazhihui/ui/widget/mh:d	Ljava/lang/String;
    //   596: aload 6
    //   598: aload_2
    //   599: getfield 516	com/android/dazhihui/ui/model/stock/Stock2955Vo:type	I
    //   602: putfield 518	com/android/dazhihui/ui/widget/mh:g	I
    //   605: aload_2
    //   606: getfield 521	com/android/dazhihui/ui/model/stock/Stock2955Vo:ggsm	I
    //   609: ifle +9 -> 618
    //   612: aload 6
    //   614: iconst_1
    //   615: putfield 524	com/android/dazhihui/ui/widget/mh:i	Z
    //   618: iload 10
    //   620: bipush 10
    //   622: if_icmpne +9 -> 631
    //   625: aload 6
    //   627: iconst_1
    //   628: putfield 526	com/android/dazhihui/ui/widget/mh:j	Z
    //   631: aload 6
    //   633: aload_2
    //   634: getfield 529	com/android/dazhihui/ui/model/stock/Stock2955Vo:isLoanable	Z
    //   637: putfield 531	com/android/dazhihui/ui/widget/mh:h	Z
    //   640: aload 6
    //   642: iconst_1
    //   643: anewarray 533	java/lang/Object
    //   646: dup
    //   647: iconst_0
    //   648: aload_2
    //   649: getfield 509	com/android/dazhihui/ui/model/stock/Stock2955Vo:code	Ljava/lang/String;
    //   652: aastore
    //   653: putfield 536	com/android/dazhihui/ui/widget/mh:k	[Ljava/lang/Object;
    //   656: aload_1
    //   657: aload 6
    //   659: invokeinterface 539 2 0
    //   664: pop
    //   665: iload 8
    //   667: iconst_1
    //   668: isub
    //   669: istore 8
    //   671: goto -192 -> 479
    //   674: aload_0
    //   675: getfield 160	com/android/dazhihui/ui/screen/stock/oh:n	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   678: aload_1
    //   679: iload 7
    //   681: invokevirtual 542	com/android/dazhihui/ui/widget/TableLayoutGroup:a	(Ljava/util/List;I)V
    //   684: return
    //   685: astore_1
    //   686: return
    //   687: iconst_0
    //   688: istore 13
    //   690: iload 7
    //   692: iload 12
    //   694: iadd
    //   695: iload 9
    //   697: if_icmpge -245 -> 452
    //   700: iconst_1
    //   701: istore 13
    //   703: goto -251 -> 452
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	706	0	this	oh
    //   0	706	1	paramh	h
    //   0	706	2	paramj	com.android.dazhihui.a.b.j
    //   228	277	3	localObject1	Object
    //   209	364	4	localObject2	Object
    //   501	79	5	arrayOfInt	int[]
    //   568	90	6	localmh	com.android.dazhihui.ui.widget.mh
    //   192	503	7	i1	int
    //   408	262	8	i2	int
    //   370	328	9	i3	int
    //   358	265	10	i4	int
    //   364	144	11	i5	int
    //   376	319	12	i6	int
    //   456	246	13	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   30	61	103	org/json/JSONException
    //   65	102	103	org/json/JSONException
    //   118	137	103	org/json/JSONException
    //   141	159	103	org/json/JSONException
    //   159	184	103	org/json/JSONException
    //   184	191	103	org/json/JSONException
    //   194	269	103	org/json/JSONException
    //   278	283	103	org/json/JSONException
    //   284	305	103	org/json/JSONException
    //   0	15	109	java/lang/Exception
    //   15	20	109	java/lang/Exception
    //   25	30	109	java/lang/Exception
    //   104	108	109	java/lang/Exception
    //   306	314	109	java/lang/Exception
    //   318	341	109	java/lang/Exception
    //   345	378	109	java/lang/Exception
    //   399	407	109	java/lang/Exception
    //   413	422	109	java/lang/Exception
    //   426	449	109	java/lang/Exception
    //   452	461	109	java/lang/Exception
    //   461	469	109	java/lang/Exception
    //   484	554	109	java/lang/Exception
    //   561	618	109	java/lang/Exception
    //   625	631	109	java/lang/Exception
    //   631	665	109	java/lang/Exception
    //   674	684	109	java/lang/Exception
    //   0	15	115	finally
    //   15	20	115	finally
    //   25	30	115	finally
    //   30	61	115	finally
    //   65	102	115	finally
    //   104	108	115	finally
    //   110	114	115	finally
    //   118	137	115	finally
    //   141	159	115	finally
    //   159	184	115	finally
    //   184	191	115	finally
    //   194	269	115	finally
    //   278	283	115	finally
    //   284	305	115	finally
    //   306	314	115	finally
    //   318	341	115	finally
    //   345	378	115	finally
    //   399	407	115	finally
    //   413	422	115	finally
    //   426	449	115	finally
    //   452	461	115	finally
    //   461	469	115	finally
    //   484	554	115	finally
    //   561	618	115	finally
    //   625	631	115	finally
    //   631	665	115	finally
    //   674	684	115	finally
    //   30	61	685	java/lang/Exception
    //   65	102	685	java/lang/Exception
    //   118	137	685	java/lang/Exception
    //   141	159	685	java/lang/Exception
    //   159	184	685	java/lang/Exception
    //   184	191	685	java/lang/Exception
    //   194	269	685	java/lang/Exception
    //   278	283	685	java/lang/Exception
    //   284	305	685	java/lang/Exception
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    this.m = paramBundle.getString("code");
    this.p = paramBundle.getString("name");
    this.v = paramBundle.getInt("requestType");
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903372, null);
    a(paramLayoutInflater);
    return paramLayoutInflater;
  }
  
  public void onResume()
  {
    setAutoRequestPeriod(com.android.dazhihui.ui.a.m.a().u() * 1000);
    if (this.v == 0) {
      a(0, true);
    }
    for (;;)
    {
      super.onResume();
      return;
      a();
    }
  }
  
  public void onStop()
  {
    super.onStop();
  }
  
  public void refresh()
  {
    super.refresh();
  }
  
  public void show()
  {
    if (this.v == 0)
    {
      n.a(this.m, 1008);
      a(0, false);
    }
    for (;;)
    {
      super.show();
      return;
      a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\oh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */