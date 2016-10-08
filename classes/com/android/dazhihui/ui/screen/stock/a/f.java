package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.RequestAdapter;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.hd;
import java.util.ArrayList;

public class f
  extends l
{
  private View R;
  private int S = 0;
  private int T;
  private boolean[] U = { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  private int[] V = { 0, 2, 1, 0, 0, 2, 3, 0, 0, 22, 25, 21, 20 };
  private String[] W;
  private byte X = 0;
  private final int Y = com.android.dazhihui.ui.a.m.a().H();
  private TableLayoutGroup Z;
  protected int a = 0;
  private String aa = "";
  private boolean ab = true;
  private com.android.dazhihui.ui.a.m ac = com.android.dazhihui.ui.a.m.a();
  private boolean ad = false;
  private String ae = "";
  private MarketVo af;
  private ArrayList<MarketVo> ag;
  BaseAdapter b = null;
  PopupWindow c = null;
  ImageView d;
  ListView e;
  
  public static f a(Bundle paramBundle)
  {
    f localf = new f();
    localf.setArguments(paramBundle);
    return localf;
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    if (this.af == null) {}
    do
    {
      return;
      Object localObject = new x(2938);
      int j = this.T;
      int i = j;
      if (j < 0) {
        i = j & 0xFFFF;
      }
      ((x)localObject).c(i);
      ((x)localObject).b(this.X);
      ((x)localObject).b(this.S);
      ((x)localObject).c(paramInt);
      ((x)localObject).c(this.Y);
      if (this.ad) {
        ((x)localObject).b(1);
      }
      ((x)localObject).c("市场-商品期货-" + this.ae + "-" + this.aa + "-requestID=" + this.T + "-begin=" + paramInt);
      localObject = new com.android.dazhihui.a.b.m((x)localObject);
      registRequestListener((com.android.dazhihui.a.b.h)localObject);
      ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
      sendRequest((com.android.dazhihui.a.b.h)localObject);
      h(paramInt);
    } while (!paramBoolean);
    d();
  }
  
  private int g(int paramInt)
  {
    int j = 0;
    int i = j;
    if (paramInt >= 0)
    {
      i = j;
      if (paramInt < this.V.length) {
        i = this.V[paramInt];
      }
    }
    return i;
  }
  
  private void h(int paramInt)
  {
    if (this.af == null) {
      return;
    }
    Object localObject = new x(2938);
    int j = this.T;
    int i = j;
    if (j < 0) {
      i = j & 0xFFFF;
    }
    ((x)localObject).c(i);
    ((x)localObject).b(this.X);
    ((x)localObject).b(this.S);
    ((x)localObject).c(paramInt);
    ((x)localObject).c(this.Y);
    if (this.ad) {
      ((x)localObject).b(1);
    }
    ((x)localObject).c("市场-商品期货-自动包-" + this.ae + "-" + this.aa + "-requestID=" + this.T + "-begin=" + paramInt);
    localObject = new com.android.dazhihui.a.b.m((x)localObject);
    ((com.android.dazhihui.a.b.m)localObject).a(Integer.valueOf(paramInt));
    i = com.android.dazhihui.ui.a.m.a().u();
    paramInt = i;
    if (i == 0) {
      paramInt = 5;
    }
    setAutoRequestPeriod(paramInt * 1000);
    registRequestListener((com.android.dazhihui.a.b.h)localObject);
    setAutoRequest((com.android.dazhihui.a.b.h)localObject);
  }
  
  public void a()
  {
    boolean bool2 = false;
    Object localObject1 = getActivity();
    if ((this.R == null) || (localObject1 == null)) {
      return;
    }
    Object localObject2 = getActivity().getIntent().getExtras();
    if ((localObject2 != null) && (this.af == null)) {
      this.af = ((MarketVo)((Bundle)localObject2).getParcelable("market_vo"));
    }
    if (this.af == null)
    {
      ((ViewGroup)this.R).removeAllViews();
      n.c("market list screen NULL");
      return;
    }
    this.W = getResources().getStringArray(2131361823);
    this.Z = ((TableLayoutGroup)this.R.findViewById(2131559838));
    this.Z.setLayerType(1, null);
    if ((this.af != null) && ("渤海商品".equals(this.af.getName())))
    {
      this.W = getResources().getStringArray(2131361825);
      this.U = new boolean[] { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      this.V = new int[] { 0, 2, 1, 0, 0, 2, 3, 0, 0, 22, 25, 21, 20, 26, 23 };
      this.ad = true;
    }
    this.ae = this.af.getName();
    this.T = 0;
    this.S = 0;
    this.X = 1;
    this.aa = this.ae;
    int i;
    if (this.af.isMenu())
    {
      localObject2 = MarketManager.get();
      i = this.af.getCurrentChild();
      this.ag = ((MarketManager)localObject2).getChildList(this.af.getName());
      if ((this.ag != null) && (i < this.ag.size()))
      {
        if ((((MarketVo)this.ag.get(0)).getType() == 7) || (((MarketVo)this.ag.get(0)).getType() == 8))
        {
          bool1 = true;
          this.ab = bool1;
          this.T = ((MarketVo)this.ag.get(i)).getId();
          this.aa = ((MarketVo)this.ag.get(i)).getName();
          if ((!(localObject1 instanceof MainScreen)) || (this.ag.size() <= 1)) {
            break label956;
          }
          this.U[0] = true;
          this.b = new hd(getActivity(), this.ag);
          this.c = new PopupWindow(getActivity());
          this.c.setWidth(-2);
          this.c.setHeight(-2);
          this.c.setBackgroundDrawable(new ColorDrawable(0));
          this.c.setWindowLayoutMode(-2, -2);
          this.c.setFocusable(true);
          localObject1 = (LinearLayout)LayoutInflater.from(getActivity()).inflate(2130903573, null);
          this.d = ((ImageView)((LinearLayout)localObject1).findViewById(2131561262));
          this.e = ((ListView)((LinearLayout)localObject1).findViewById(2131561263));
          this.e.setAdapter(this.b);
          if ((this.b != null) && (this.b.getCount() > 6))
          {
            localObject2 = this.b.getView(0, null, this.e);
            ((View)localObject2).measure(0, 0);
            i = ((View)localObject2).getMeasuredHeight();
            localObject2 = this.e.getLayoutParams();
            ((ViewGroup.LayoutParams)localObject2).height = (i * 6 + this.e.getDividerHeight() * 6 + 20);
            this.e.setLayoutParams((ViewGroup.LayoutParams)localObject2);
          }
          this.e.setOnItemClickListener(new g(this));
          ((LinearLayout)localObject1).setGravity(1);
          ((LinearLayout.LayoutParams)this.d.getLayoutParams()).rightMargin = 0;
          ((LinearLayout)localObject1).requestLayout();
          this.c.setContentView((View)localObject1);
        }
      }
      else
      {
        label801:
        this.Z.a();
        this.W[0] = this.aa;
        this.Z.setContinuousLoading(true);
        this.Z.setColumnClickable(this.U);
        this.Z.setHeaderColumn(this.W);
        this.Z.setColumnAlign(Paint.Align.CENTER);
        this.Z.setFirstColumnHeadAlign(Paint.Align.CENTER);
        localObject1 = this.Z;
        i = this.a;
        if (this.X != 0) {
          break label1043;
        }
      }
    }
    label956:
    label1043:
    for (boolean bool1 = bool2;; bool1 = true)
    {
      ((TableLayoutGroup)localObject1).a(i, bool1);
      this.Z.setOnLoadingListener(new h(this));
      this.Z.setOnContentScrollChangeListener(new i(this));
      this.Z.setOnTableLayoutClickListener(new j(this));
      changeLookFace(this.mLookFace);
      return;
      bool1 = false;
      break;
      this.U[0] = false;
      break label801;
      if (!TextUtils.isEmpty(this.af.getName())) {
        this.aa = this.af.getName();
      }
      if ((this.af.getType() == 7) || (this.af.getType() == 8)) {}
      for (bool1 = true;; bool1 = false)
      {
        this.ab = bool1;
        this.T = this.af.getId();
        break;
      }
    }
  }
  
  public void a(int paramInt)
  {
    if (this.af != null)
    {
      this.af.setCurrentChild(paramInt);
      a();
      refresh();
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if ((this.R != null) && (paramBoolean)) {
      this.R.scrollTo(0, 0);
    }
    refresh();
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (k.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.Z != null)
        {
          this.Z.setBackgroundColor(getActivity().getResources().getColor(2131493542));
          this.Z.a(paramy);
        }
      } while ((this.e == null) || (this.d == null));
      this.e.setBackgroundResource(2130837566);
      this.e.setDivider(new ColorDrawable(-16777216));
      this.e.setDividerHeight(2);
      this.d.setImageResource(2130838118);
      return;
      if (this.Z != null)
      {
        this.Z.setBackgroundColor(getActivity().getResources().getColor(2131493605));
        this.Z.a(paramy);
      }
    } while ((this.e == null) || (this.d == null));
    this.e.setBackgroundResource(2130838788);
    this.e.setDivider(new ColorDrawable(-2697514));
    this.e.setDividerHeight(2);
    this.d.setImageResource(2130838121);
  }
  
  /* Error */
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    // Byte code:
    //   0: aload_2
    //   1: checkcast 532	com/android/dazhihui/a/b/o
    //   4: astore_2
    //   5: aload_2
    //   6: ifnonnull +8 -> 14
    //   9: aload_0
    //   10: invokevirtual 534	com/android/dazhihui/ui/screen/stock/a/f:e	()V
    //   13: return
    //   14: aload_2
    //   15: invokevirtual 537	com/android/dazhihui/a/b/o:h	()Lcom/android/dazhihui/a/b/p;
    //   18: astore_2
    //   19: aload_2
    //   20: ifnull +744 -> 764
    //   23: aload_2
    //   24: getfield 540	com/android/dazhihui/a/b/p:a	I
    //   27: sipush 2938
    //   30: if_icmpne +734 -> 764
    //   33: aload_2
    //   34: getfield 543	com/android/dazhihui/a/b/p:b	[B
    //   37: astore_2
    //   38: aload_2
    //   39: ifnull +725 -> 764
    //   42: aload_0
    //   43: getfield 175	com/android/dazhihui/ui/screen/stock/a/f:Z	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   46: ifnull +718 -> 764
    //   49: new 545	com/android/dazhihui/a/b/q
    //   52: dup
    //   53: aload_2
    //   54: invokespecial 548	com/android/dazhihui/a/b/q:<init>	([B)V
    //   57: astore 5
    //   59: aload 5
    //   61: invokevirtual 550	com/android/dazhihui/a/b/q:e	()I
    //   64: istore 9
    //   66: aload 5
    //   68: invokevirtual 550	com/android/dazhihui/a/b/q:e	()I
    //   71: istore 11
    //   73: aload_1
    //   74: invokeinterface 556 1 0
    //   79: ifnull +721 -> 800
    //   82: aload_1
    //   83: invokeinterface 556 1 0
    //   88: checkcast 147	java/lang/Integer
    //   91: invokevirtual 559	java/lang/Integer:intValue	()I
    //   94: iload 11
    //   96: iadd
    //   97: iload 9
    //   99: if_icmpge +701 -> 800
    //   102: iconst_1
    //   103: istore 27
    //   105: aload_0
    //   106: getfield 175	com/android/dazhihui/ui/screen/stock/a/f:Z	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   109: iload 27
    //   111: invokevirtual 562	com/android/dazhihui/ui/widget/TableLayoutGroup:setLoadingDown	(Z)V
    //   114: aload_1
    //   115: invokeinterface 556 1 0
    //   120: checkcast 147	java/lang/Integer
    //   123: invokevirtual 559	java/lang/Integer:intValue	()I
    //   126: istore 25
    //   128: new 286	java/util/ArrayList
    //   131: dup
    //   132: invokespecial 563	java/util/ArrayList:<init>	()V
    //   135: astore 6
    //   137: iconst_0
    //   138: istore 10
    //   140: iconst_0
    //   141: istore 9
    //   143: iload 11
    //   145: iconst_1
    //   146: isub
    //   147: istore 13
    //   149: iload 13
    //   151: iflt +602 -> 753
    //   154: new 565	com/android/dazhihui/ui/widget/mh
    //   157: dup
    //   158: invokespecial 566	com/android/dazhihui/ui/widget/mh:<init>	()V
    //   161: astore 7
    //   163: aload_0
    //   164: getfield 78	com/android/dazhihui/ui/screen/stock/a/f:ad	Z
    //   167: ifeq +243 -> 410
    //   170: bipush 15
    //   172: anewarray 262	java/lang/String
    //   175: astore_2
    //   176: bipush 15
    //   178: newarray <illegal type>
    //   180: astore_1
    //   181: aload 5
    //   183: invokevirtual 569	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   186: astore 4
    //   188: aload_0
    //   189: getfield 72	com/android/dazhihui/ui/screen/stock/a/f:aa	Ljava/lang/String;
    //   192: ifnull +602 -> 794
    //   195: aload_0
    //   196: getfield 72	com/android/dazhihui/ui/screen/stock/a/f:aa	Ljava/lang/String;
    //   199: ldc_w 571
    //   202: invokevirtual 575	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   205: ifeq +589 -> 794
    //   208: aload 4
    //   210: ldc_w 577
    //   213: invokevirtual 575	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   216: ifeq +578 -> 794
    //   219: aload 4
    //   221: iconst_2
    //   222: aload 4
    //   224: invokevirtual 580	java/lang/String:length	()I
    //   227: invokevirtual 584	java/lang/String:substring	(II)Ljava/lang/String;
    //   230: astore_3
    //   231: aload_2
    //   232: iconst_0
    //   233: aload 5
    //   235: invokevirtual 569	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   238: aastore
    //   239: aload_1
    //   240: iconst_0
    //   241: sipush 39936
    //   244: iastore
    //   245: aload 5
    //   247: invokevirtual 586	com/android/dazhihui/a/b/q:b	()I
    //   250: istore 24
    //   252: aload 5
    //   254: invokevirtual 550	com/android/dazhihui/a/b/q:e	()I
    //   257: pop
    //   258: aload 5
    //   260: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   263: istore 23
    //   265: aload 5
    //   267: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   270: istore 17
    //   272: aload 5
    //   274: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   277: istore 22
    //   279: aload 5
    //   281: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   284: istore 21
    //   286: aload 5
    //   288: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   291: istore 20
    //   293: aload 5
    //   295: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   298: istore 19
    //   300: aload 5
    //   302: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   305: pop
    //   306: aload 5
    //   308: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   311: istore 18
    //   313: aload 5
    //   315: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   318: istore 14
    //   320: aload 5
    //   322: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   325: istore 16
    //   327: aload 5
    //   329: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   332: istore 15
    //   334: iload 10
    //   336: istore 11
    //   338: iload 9
    //   340: istore 12
    //   342: aload_0
    //   343: getfield 78	com/android/dazhihui/ui/screen/stock/a/f:ad	Z
    //   346: ifeq +468 -> 814
    //   349: aload 5
    //   351: invokevirtual 550	com/android/dazhihui/a/b/q:e	()I
    //   354: istore 26
    //   356: iconst_0
    //   357: istore 11
    //   359: iload 11
    //   361: iload 26
    //   363: if_icmpge +443 -> 806
    //   366: aload 5
    //   368: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   371: istore 12
    //   373: aload 5
    //   375: invokevirtual 588	com/android/dazhihui/a/b/q:h	()I
    //   378: pop
    //   379: iload 11
    //   381: ifne +7 -> 388
    //   384: iload 12
    //   386: istore 10
    //   388: iload 11
    //   390: iconst_1
    //   391: iadd
    //   392: iload 26
    //   394: if_icmpne +397 -> 791
    //   397: iload 12
    //   399: istore 9
    //   401: iload 11
    //   403: iconst_1
    //   404: iadd
    //   405: istore 11
    //   407: goto -48 -> 359
    //   410: bipush 13
    //   412: anewarray 262	java/lang/String
    //   415: astore_2
    //   416: bipush 13
    //   418: newarray <illegal type>
    //   420: astore_1
    //   421: goto -240 -> 181
    //   424: aload_2
    //   425: iconst_1
    //   426: iload 23
    //   428: iload 14
    //   430: invokestatic 592	com/android/dazhihui/d/b:a	(II)Ljava/lang/String;
    //   433: aastore
    //   434: aload_1
    //   435: iconst_1
    //   436: iload 23
    //   438: iload 12
    //   440: invokestatic 595	com/android/dazhihui/d/b:h	(II)I
    //   443: iastore
    //   444: aload_2
    //   445: iconst_2
    //   446: iload 23
    //   448: iload 12
    //   450: invokestatic 597	com/android/dazhihui/d/b:c	(II)Ljava/lang/String;
    //   453: aastore
    //   454: aload_1
    //   455: iconst_2
    //   456: aload_1
    //   457: iconst_1
    //   458: iaload
    //   459: iastore
    //   460: aload_2
    //   461: iconst_3
    //   462: iload 23
    //   464: iload 12
    //   466: iload 14
    //   468: invokestatic 600	com/android/dazhihui/d/b:b	(III)Ljava/lang/String;
    //   471: aastore
    //   472: aload_1
    //   473: iconst_3
    //   474: aload_1
    //   475: iconst_1
    //   476: iaload
    //   477: iastore
    //   478: aload_2
    //   479: iconst_4
    //   480: iload 16
    //   482: iload 15
    //   484: isub
    //   485: iconst_0
    //   486: invokestatic 602	com/android/dazhihui/d/b:d	(II)Ljava/lang/String;
    //   489: aastore
    //   490: aload_1
    //   491: iconst_4
    //   492: iconst_m1
    //   493: iastore
    //   494: aload_2
    //   495: iconst_5
    //   496: iload 22
    //   498: invokestatic 605	com/android/dazhihui/d/b:b	(I)J
    //   501: invokestatic 608	com/android/dazhihui/d/n:e	(J)Ljava/lang/String;
    //   504: aastore
    //   505: aload_1
    //   506: iconst_5
    //   507: ldc_w 609
    //   510: iastore
    //   511: aload_2
    //   512: bipush 6
    //   514: iload 16
    //   516: invokestatic 612	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   519: invokestatic 615	com/android/dazhihui/d/n:g	(Ljava/lang/String;)Ljava/lang/String;
    //   522: aastore
    //   523: aload_1
    //   524: bipush 6
    //   526: sipush 65280
    //   529: iastore
    //   530: aload_2
    //   531: bipush 7
    //   533: iload 18
    //   535: iload 14
    //   537: invokestatic 592	com/android/dazhihui/d/b:a	(II)Ljava/lang/String;
    //   540: aastore
    //   541: aload_1
    //   542: bipush 7
    //   544: iload 18
    //   546: iload 12
    //   548: invokestatic 595	com/android/dazhihui/d/b:h	(II)I
    //   551: iastore
    //   552: aload_2
    //   553: bipush 8
    //   555: iload 17
    //   557: iload 14
    //   559: invokestatic 592	com/android/dazhihui/d/b:a	(II)Ljava/lang/String;
    //   562: aastore
    //   563: aload_1
    //   564: bipush 8
    //   566: iload 17
    //   568: iload 12
    //   570: invokestatic 595	com/android/dazhihui/d/b:h	(II)I
    //   573: iastore
    //   574: aload_2
    //   575: bipush 9
    //   577: iload 19
    //   579: iload 14
    //   581: invokestatic 592	com/android/dazhihui/d/b:a	(II)Ljava/lang/String;
    //   584: aastore
    //   585: aload_1
    //   586: bipush 9
    //   588: iconst_m1
    //   589: iastore
    //   590: aload_2
    //   591: bipush 10
    //   593: iload 21
    //   595: iload 14
    //   597: invokestatic 592	com/android/dazhihui/d/b:a	(II)Ljava/lang/String;
    //   600: aastore
    //   601: aload_1
    //   602: bipush 10
    //   604: iload 21
    //   606: iload 12
    //   608: invokestatic 595	com/android/dazhihui/d/b:h	(II)I
    //   611: iastore
    //   612: aload_2
    //   613: bipush 11
    //   615: iload 20
    //   617: iload 14
    //   619: invokestatic 592	com/android/dazhihui/d/b:a	(II)Ljava/lang/String;
    //   622: aastore
    //   623: aload_1
    //   624: bipush 11
    //   626: iload 20
    //   628: iload 12
    //   630: invokestatic 595	com/android/dazhihui/d/b:h	(II)I
    //   633: iastore
    //   634: aload_2
    //   635: bipush 12
    //   637: iload 11
    //   639: iload 14
    //   641: invokestatic 592	com/android/dazhihui/d/b:a	(II)Ljava/lang/String;
    //   644: aastore
    //   645: aload_1
    //   646: bipush 12
    //   648: iconst_m1
    //   649: iastore
    //   650: aload_0
    //   651: getfield 78	com/android/dazhihui/ui/screen/stock/a/f:ad	Z
    //   654: ifeq +38 -> 692
    //   657: bipush 12
    //   659: istore 11
    //   661: goto +189 -> 850
    //   664: aload_2
    //   665: iconst_4
    //   666: iload 9
    //   668: iload 14
    //   670: invokestatic 592	com/android/dazhihui/d/b:a	(II)Ljava/lang/String;
    //   673: aastore
    //   674: aload_1
    //   675: iconst_4
    //   676: iconst_m1
    //   677: iastore
    //   678: aload_2
    //   679: iconst_5
    //   680: iload 10
    //   682: iload 14
    //   684: invokestatic 592	com/android/dazhihui/d/b:a	(II)Ljava/lang/String;
    //   687: aastore
    //   688: aload_1
    //   689: iconst_5
    //   690: iconst_m1
    //   691: iastore
    //   692: aload 7
    //   694: aload_2
    //   695: putfield 617	com/android/dazhihui/ui/widget/mh:a	[Ljava/lang/String;
    //   698: aload 7
    //   700: aload_1
    //   701: putfield 619	com/android/dazhihui/ui/widget/mh:b	[I
    //   704: aload 7
    //   706: aload_3
    //   707: invokestatic 621	com/android/dazhihui/d/n:e	(Ljava/lang/String;)Ljava/lang/String;
    //   710: putfield 623	com/android/dazhihui/ui/widget/mh:d	Ljava/lang/String;
    //   713: aload 7
    //   715: bipush 7
    //   717: putfield 625	com/android/dazhihui/ui/widget/mh:g	I
    //   720: aload 7
    //   722: iconst_1
    //   723: anewarray 627	java/lang/Object
    //   726: dup
    //   727: iconst_0
    //   728: aload 4
    //   730: aastore
    //   731: putfield 631	com/android/dazhihui/ui/widget/mh:k	[Ljava/lang/Object;
    //   734: aload 6
    //   736: aload 7
    //   738: invokeinterface 636 2 0
    //   743: pop
    //   744: iload 13
    //   746: iconst_1
    //   747: isub
    //   748: istore 13
    //   750: goto -601 -> 149
    //   753: aload_0
    //   754: getfield 175	com/android/dazhihui/ui/screen/stock/a/f:Z	Lcom/android/dazhihui/ui/widget/TableLayoutGroup;
    //   757: aload 6
    //   759: iload 25
    //   761: invokevirtual 639	com/android/dazhihui/ui/widget/TableLayoutGroup:a	(Ljava/util/List;I)V
    //   764: aload_0
    //   765: invokevirtual 534	com/android/dazhihui/ui/screen/stock/a/f:e	()V
    //   768: return
    //   769: astore_1
    //   770: aload_1
    //   771: invokevirtual 642	java/lang/Exception:printStackTrace	()V
    //   774: aload_0
    //   775: invokevirtual 534	com/android/dazhihui/ui/screen/stock/a/f:e	()V
    //   778: return
    //   779: astore_1
    //   780: aload_0
    //   781: invokevirtual 534	com/android/dazhihui/ui/screen/stock/a/f:e	()V
    //   784: aload_1
    //   785: athrow
    //   786: astore 8
    //   788: goto +99 -> 887
    //   791: goto -390 -> 401
    //   794: aload 4
    //   796: astore_3
    //   797: goto -566 -> 231
    //   800: iconst_0
    //   801: istore 27
    //   803: goto -698 -> 105
    //   806: iload 9
    //   808: istore 12
    //   810: iload 10
    //   812: istore 11
    //   814: iload 12
    //   816: istore 9
    //   818: iload 11
    //   820: istore 10
    //   822: iload 14
    //   824: istore 12
    //   826: iload 17
    //   828: istore 11
    //   830: iload 14
    //   832: istore 17
    //   834: iload 24
    //   836: istore 14
    //   838: iload 17
    //   840: ifne -416 -> 424
    //   843: iload 11
    //   845: istore 12
    //   847: goto -423 -> 424
    //   850: iload 11
    //   852: iconst_3
    //   853: if_icmple -189 -> 664
    //   856: aload_2
    //   857: iload 11
    //   859: iconst_2
    //   860: iadd
    //   861: aload_2
    //   862: iload 11
    //   864: aaload
    //   865: aastore
    //   866: aload_1
    //   867: iload 11
    //   869: iconst_2
    //   870: iadd
    //   871: aload_1
    //   872: iload 11
    //   874: iaload
    //   875: iastore
    //   876: iload 11
    //   878: iconst_1
    //   879: isub
    //   880: istore 11
    //   882: goto -32 -> 850
    //   885: astore 8
    //   887: iconst_0
    //   888: istore 15
    //   890: iconst_0
    //   891: istore 16
    //   893: iconst_0
    //   894: istore 17
    //   896: iconst_0
    //   897: istore 18
    //   899: iconst_0
    //   900: istore 19
    //   902: iconst_0
    //   903: istore 20
    //   905: iconst_0
    //   906: istore 21
    //   908: iconst_0
    //   909: istore 22
    //   911: iconst_0
    //   912: istore 23
    //   914: iconst_2
    //   915: istore 14
    //   917: iconst_0
    //   918: istore 11
    //   920: iconst_0
    //   921: istore 12
    //   923: goto -85 -> 838
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	926	0	this	f
    //   0	926	1	paramh	com.android.dazhihui.a.b.h
    //   0	926	2	paramj	com.android.dazhihui.a.b.j
    //   230	567	3	str1	String
    //   186	609	4	str2	String
    //   57	317	5	localq	com.android.dazhihui.a.b.q
    //   135	623	6	localArrayList	ArrayList
    //   161	576	7	localmh	com.android.dazhihui.ui.widget.mh
    //   786	1	8	localException1	Exception
    //   885	1	8	localException2	Exception
    //   64	753	9	i	int
    //   138	683	10	j	int
    //   71	848	11	k	int
    //   340	582	12	m	int
    //   147	602	13	n	int
    //   318	598	14	i1	int
    //   332	557	15	i2	int
    //   325	567	16	i3	int
    //   270	625	17	i4	int
    //   311	587	18	i5	int
    //   298	603	19	i6	int
    //   291	613	20	i7	int
    //   284	623	21	i8	int
    //   277	633	22	i9	int
    //   263	650	23	i10	int
    //   250	585	24	i11	int
    //   126	634	25	i12	int
    //   354	41	26	i13	int
    //   103	699	27	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   0	5	769	java/lang/Exception
    //   14	19	769	java/lang/Exception
    //   23	38	769	java/lang/Exception
    //   42	102	769	java/lang/Exception
    //   105	137	769	java/lang/Exception
    //   154	181	769	java/lang/Exception
    //   181	231	769	java/lang/Exception
    //   231	239	769	java/lang/Exception
    //   410	421	769	java/lang/Exception
    //   424	454	769	java/lang/Exception
    //   460	472	769	java/lang/Exception
    //   478	490	769	java/lang/Exception
    //   494	505	769	java/lang/Exception
    //   511	523	769	java/lang/Exception
    //   530	585	769	java/lang/Exception
    //   590	645	769	java/lang/Exception
    //   650	657	769	java/lang/Exception
    //   664	674	769	java/lang/Exception
    //   678	688	769	java/lang/Exception
    //   692	744	769	java/lang/Exception
    //   753	764	769	java/lang/Exception
    //   0	5	779	finally
    //   14	19	779	finally
    //   23	38	779	finally
    //   42	102	779	finally
    //   105	137	779	finally
    //   154	181	779	finally
    //   181	231	779	finally
    //   231	239	779	finally
    //   245	334	779	finally
    //   342	356	779	finally
    //   366	379	779	finally
    //   410	421	779	finally
    //   424	454	779	finally
    //   460	472	779	finally
    //   478	490	779	finally
    //   494	505	779	finally
    //   511	523	779	finally
    //   530	585	779	finally
    //   590	645	779	finally
    //   650	657	779	finally
    //   664	674	779	finally
    //   678	688	779	finally
    //   692	744	779	finally
    //   753	764	779	finally
    //   770	774	779	finally
    //   366	379	786	java/lang/Exception
    //   245	334	885	java/lang/Exception
    //   342	356	885	java/lang/Exception
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getArguments();
    if ((paramBundle != null) && (this.af == null)) {
      this.af = ((MarketVo)paramBundle.getParcelable("market_vo"));
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.R = paramLayoutInflater.inflate(2130903277, null);
    a();
    return this.R;
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void onResume()
  {
    refresh();
    super.onResume();
    this.mRequestAdapter.startAutoRequestPeriod();
  }
  
  public void refresh()
  {
    super.refresh();
    if (this.Z != null)
    {
      a(this.Z.getContentVisibleBeginPosition(), true);
      return;
    }
    a(0, true);
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
  }
  
  public void show()
  {
    refresh();
    super.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */