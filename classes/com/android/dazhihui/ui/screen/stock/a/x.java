package com.android.dazhihui.ui.screen.stock.a;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.market.MarketStockVo;
import com.android.dazhihui.ui.screen.stock.MarketListScreenActivity;
import java.util.ArrayList;
import java.util.Vector;

public class x
  extends l
{
  private final int R;
  private final int S;
  private final int T;
  private final int U;
  private final int V;
  private final int W;
  private Vector<String> X;
  private Vector<String> Y;
  private Vector<String> Z;
  private ArrayList<ArrayList<MarketStockVo>> a = new ArrayList();
  private Vector<String> aa;
  private Vector<String> ab;
  private Vector<String> ac;
  private com.android.dazhihui.a.b.m ad;
  private com.android.dazhihui.a.b.m b;
  private com.android.dazhihui.a.b.m c;
  private String[][] d;
  private MarketVo e;
  
  public x()
  {
    String[] arrayOfString1 = { "美元/人民币", "港币/人民币", "欧元/人民币", "100日元/人民币", "英镑/人民币" };
    String[] arrayOfString2 = { "黄金现货", "Comex 黄金", "Au(T+D)" };
    this.d = new String[][] { { "道琼斯", "英国富时", "德国 DAX", "法国 CAC", "日经 225", "韩国 指数" }, arrayOfString1, { "美元指数", "欧元/美元", "英镑/美元", "美元/日元" }, { "白银现货 / 美元", "COMEX 白银", "Ag(T+D)" }, arrayOfString2, { "布伦特原油", "美原油连续" } };
    this.R = 60001;
    this.S = 60002;
    this.T = 60003;
    this.U = 60004;
    this.V = 60005;
    this.W = 60006;
    this.k = 3;
    this.j = new String[] { "全球股指", "人民币中间价", "外汇", "白银", "黄金", "原油" };
    this.y = null;
    this.I = new boolean[] { 1, 1, 1, 0, 0, 1 };
    this.x = new int[] { 60001, 60002, 60003, 60004, 60005, 60006 };
    g();
  }
  
  private com.android.dazhihui.a.b.x a(int paramInt, Vector<String> paramVector)
  {
    com.android.dazhihui.a.b.x localx = new com.android.dazhihui.a.b.x(2955);
    localx.c(paramInt);
    localx.c(4096);
    localx.a(paramVector);
    return localx;
  }
  
  private void a(int paramInt, ArrayList<MarketStockVo> paramArrayList)
  {
    paramArrayList = this.P.obtainMessage(paramInt, paramArrayList);
    this.P.sendMessage(paramArrayList);
  }
  
  private com.android.dazhihui.a.b.m f()
  {
    com.android.dazhihui.a.b.x[] arrayOfx = new com.android.dazhihui.a.b.x[6];
    arrayOfx[0] = a(this.x[0], this.X);
    arrayOfx[0].c("市场-全球-全球股指");
    arrayOfx[1] = a(this.x[1], this.Y);
    arrayOfx[1].c("市场-全球-人民币中间价");
    arrayOfx[2] = a(this.x[2], this.Z);
    arrayOfx[2].c("市场-全球-外汇");
    arrayOfx[3] = a(this.x[3], this.aa);
    arrayOfx[3].c("市场-全球-白银");
    arrayOfx[4] = a(this.x[4], this.ab);
    arrayOfx[4].c("市场-全球-黄金");
    arrayOfx[5] = a(this.x[5], this.ac);
    arrayOfx[5].c("市场-全球-原油");
    return new com.android.dazhihui.a.b.m(arrayOfx);
  }
  
  private void g()
  {
    this.X = new Vector();
    this.X.add("IXDJIA");
    this.X.add("IXFTSE");
    this.X.add("IXGDAXI");
    this.X.add("IXFCHI");
    this.X.add("IXN225");
    this.X.add("IXKSP2");
    this.Y = new Vector();
    this.Y.add("IBUSDCNYC");
    this.Y.add("IBHKDCNYC");
    this.Y.add("IBEURCNYC");
    this.Y.add("IBJPYCNYC");
    this.Y.add("IBGBPCNYC");
    this.aa = new Vector();
    this.aa.add("XAGUSD");
    this.aa.add("CXSIY0");
    this.aa.add("Ag(T+D)");
    this.Z = new Vector();
    this.Z.add("FEUDI");
    this.Z.add("FEEURUSD");
    this.Z.add("FEGBPUSD");
    this.Z.add("FEUSDJPY");
    this.ab = new Vector();
    this.ab.add("FEXAUUSD");
    this.ab.add("CXGCY0");
    this.ab.add("SGAu(T+D)");
    this.ac = new Vector();
    this.ac.add("NXXBZY0");
    this.ac.add("NXCLY0");
  }
  
  public void a()
  {
    com.android.dazhihui.a.b.x localx = new com.android.dazhihui.a.b.x(2981);
    localx.c("市场-全球-2981包获取商品期货和大宗电子的子市场");
    this.ad = new com.android.dazhihui.a.b.m(localx);
    this.ad.a(this);
    sendRequest(this.ad);
  }
  
  public void a(boolean paramBoolean)
  {
    if ((this.F != null) && (paramBoolean)) {
      this.F.setSelection(0);
    }
    refresh();
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
  }
  
  public void d(int paramInt)
  {
    Intent localIntent = new Intent();
    Bundle localBundle;
    if (paramInt == 0)
    {
      MarketManager.get().setStatisticsUserAction("", "全球指数");
      localObject = MarketManager.get().getMarketVo("全球指数");
      localBundle = new Bundle();
      localBundle.putParcelable("market_vo", (Parcelable)localObject);
      localIntent.setClass(getActivity(), MarketListScreenActivity.class);
      localIntent.putExtras(localBundle);
      getActivity().startActivity(localIntent);
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        MarketManager.get().setStatisticsUserAction("", "人民币中间价");
        localObject = MarketManager.get().getMarketVo("人民币中间价");
        localBundle = new Bundle();
        localBundle.putParcelable("market_vo", (Parcelable)localObject);
        localIntent.setClass(getActivity(), MarketListScreenActivity.class);
        localIntent.putExtras(localBundle);
        getActivity().startActivity(localIntent);
        return;
      }
      if (paramInt == 2)
      {
        MarketManager.get().setStatisticsUserAction("", "全球外汇");
        localObject = MarketManager.get().getMarketVo("全球外汇");
        localBundle = new Bundle();
        localBundle.putParcelable("market_vo", (Parcelable)localObject);
        localIntent.setClass(getActivity(), MarketListScreenActivity.class);
        localIntent.putExtras(localBundle);
        getActivity().startActivity(localIntent);
        return;
      }
    } while (paramInt != 5);
    MarketManager.get().setStatisticsUserAction("", "全球原油更多");
    Object localObject = new Bundle();
    ((Bundle)localObject).putParcelable("market_vo", this.e);
    localIntent.setClass(getActivity(), MarketListScreenActivity.class);
    localIntent.putExtras((Bundle)localObject);
    getActivity().startActivity(localIntent);
  }
  
  /* Error */
  public void handleResponse(h paramh, com.android.dazhihui.a.b.j paramj)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: aload_1
    //   4: aload_0
    //   5: getfield 266	com/android/dazhihui/ui/screen/stock/a/x:ad	Lcom/android/dazhihui/a/b/m;
    //   8: if_acmpne +277 -> 285
    //   11: aload_2
    //   12: checkcast 355	com/android/dazhihui/a/b/o
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +8 -> 25
    //   20: aload_0
    //   21: invokevirtual 357	com/android/dazhihui/ui/screen/stock/a/x:e	()V
    //   24: return
    //   25: aload_1
    //   26: invokevirtual 361	com/android/dazhihui/a/b/o:h	()Lcom/android/dazhihui/a/b/p;
    //   29: astore_1
    //   30: aload_1
    //   31: ifnonnull +8 -> 39
    //   34: aload_0
    //   35: invokevirtual 357	com/android/dazhihui/ui/screen/stock/a/x:e	()V
    //   38: return
    //   39: aload_1
    //   40: getfield 365	com/android/dazhihui/a/b/p:a	I
    //   43: sipush 2981
    //   46: if_icmpne +211 -> 257
    //   49: aload_1
    //   50: getfield 368	com/android/dazhihui/a/b/p:b	[B
    //   53: astore_1
    //   54: aload_1
    //   55: ifnull +202 -> 257
    //   58: aload_1
    //   59: arraylength
    //   60: iconst_2
    //   61: if_icmple +196 -> 257
    //   64: new 370	com/android/dazhihui/a/b/q
    //   67: dup
    //   68: aload_1
    //   69: invokespecial 373	com/android/dazhihui/a/b/q:<init>	([B)V
    //   72: astore_2
    //   73: invokestatic 298	com/android/dazhihui/ui/model/stock/MarketManager:get	()Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   76: aload_2
    //   77: invokevirtual 377	com/android/dazhihui/ui/model/stock/MarketManager:decodeFutures	(Lcom/android/dazhihui/a/b/q;)V
    //   80: invokestatic 298	com/android/dazhihui/ui/model/stock/MarketManager:get	()Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   83: ldc_w 379
    //   86: invokevirtual 383	com/android/dazhihui/ui/model/stock/MarketManager:getChildList	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   89: astore_2
    //   90: iconst_0
    //   91: istore 6
    //   93: iload 6
    //   95: aload_2
    //   96: invokevirtual 387	java/util/ArrayList:size	()I
    //   99: if_icmpge +74 -> 173
    //   102: aload_2
    //   103: iload 6
    //   105: invokevirtual 390	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   108: checkcast 392	com/android/dazhihui/ui/model/stock/MarketVo
    //   111: invokevirtual 396	com/android/dazhihui/ui/model/stock/MarketVo:getName	()Ljava/lang/String;
    //   114: ldc_w 398
    //   117: invokevirtual 401	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   120: ifeq +6 -> 126
    //   123: goto +553 -> 676
    //   126: aload_2
    //   127: iload 6
    //   129: invokevirtual 390	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   132: checkcast 392	com/android/dazhihui/ui/model/stock/MarketVo
    //   135: invokevirtual 396	com/android/dazhihui/ui/model/stock/MarketVo:getName	()Ljava/lang/String;
    //   138: ldc_w 403
    //   141: invokevirtual 401	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   144: ifeq +532 -> 676
    //   147: aload_0
    //   148: aload_2
    //   149: iload 6
    //   151: invokevirtual 390	java/util/ArrayList:get	(I)Ljava/lang/Object;
    //   154: checkcast 392	com/android/dazhihui/ui/model/stock/MarketVo
    //   157: putfield 345	com/android/dazhihui/ui/screen/stock/a/x:e	Lcom/android/dazhihui/ui/model/stock/MarketVo;
    //   160: goto +516 -> 676
    //   163: astore_1
    //   164: aload_1
    //   165: invokevirtual 406	java/lang/Exception:printStackTrace	()V
    //   168: aload_0
    //   169: invokevirtual 357	com/android/dazhihui/ui/screen/stock/a/x:e	()V
    //   172: return
    //   173: aload_0
    //   174: invokevirtual 410	com/android/dazhihui/ui/screen/stock/a/x:isAdded	()Z
    //   177: ifeq +80 -> 257
    //   180: aload_0
    //   181: invokevirtual 323	com/android/dazhihui/ui/screen/stock/a/x:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   184: astore_2
    //   185: aload_2
    //   186: ifnonnull +8 -> 194
    //   189: aload_0
    //   190: invokevirtual 357	com/android/dazhihui/ui/screen/stock/a/x:e	()V
    //   193: return
    //   194: aload_2
    //   195: invokevirtual 416	android/content/Context:getFilesDir	()Ljava/io/File;
    //   198: astore_2
    //   199: aload_2
    //   200: ifnonnull +8 -> 208
    //   203: aload_0
    //   204: invokevirtual 357	com/android/dazhihui/ui/screen/stock/a/x:e	()V
    //   207: return
    //   208: new 418	java/io/File
    //   211: dup
    //   212: new 420	java/lang/StringBuilder
    //   215: dup
    //   216: invokespecial 421	java/lang/StringBuilder:<init>	()V
    //   219: aload_2
    //   220: invokevirtual 424	java/io/File:getPath	()Ljava/lang/String;
    //   223: invokevirtual 428	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   226: ldc_w 430
    //   229: invokevirtual 428	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   232: invokevirtual 433	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   235: invokespecial 435	java/io/File:<init>	(Ljava/lang/String;)V
    //   238: astore_2
    //   239: new 437	java/io/FileOutputStream
    //   242: dup
    //   243: aload_2
    //   244: invokespecial 440	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   247: astore_2
    //   248: aload_2
    //   249: aload_1
    //   250: invokevirtual 443	java/io/FileOutputStream:write	([B)V
    //   253: aload_2
    //   254: invokevirtual 446	java/io/FileOutputStream:close	()V
    //   257: aload_0
    //   258: invokevirtual 357	com/android/dazhihui/ui/screen/stock/a/x:e	()V
    //   261: return
    //   262: astore_1
    //   263: aload_1
    //   264: invokevirtual 447	java/io/FileNotFoundException:printStackTrace	()V
    //   267: goto -10 -> 257
    //   270: astore_1
    //   271: aload_0
    //   272: invokevirtual 357	com/android/dazhihui/ui/screen/stock/a/x:e	()V
    //   275: aload_1
    //   276: athrow
    //   277: astore_1
    //   278: aload_1
    //   279: invokevirtual 448	java/io/IOException:printStackTrace	()V
    //   282: goto -25 -> 257
    //   285: aload_1
    //   286: aload_0
    //   287: getfield 450	com/android/dazhihui/ui/screen/stock/a/x:b	Lcom/android/dazhihui/a/b/m;
    //   290: if_acmpeq +11 -> 301
    //   293: aload_1
    //   294: aload_0
    //   295: getfield 452	com/android/dazhihui/ui/screen/stock/a/x:c	Lcom/android/dazhihui/a/b/m;
    //   298: if_acmpne -41 -> 257
    //   301: aload_1
    //   302: getstatic 458	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   305: invokeinterface 463 2 0
    //   310: aload_2
    //   311: checkcast 355	com/android/dazhihui/a/b/o
    //   314: astore_1
    //   315: aload_1
    //   316: ifnonnull +8 -> 324
    //   319: aload_0
    //   320: invokevirtual 357	com/android/dazhihui/ui/screen/stock/a/x:e	()V
    //   323: return
    //   324: aload_1
    //   325: invokevirtual 361	com/android/dazhihui/a/b/o:h	()Lcom/android/dazhihui/a/b/p;
    //   328: astore_1
    //   329: aload_1
    //   330: ifnull -73 -> 257
    //   333: aload_1
    //   334: getfield 365	com/android/dazhihui/a/b/p:a	I
    //   337: sipush 2955
    //   340: if_icmpne -83 -> 257
    //   343: new 370	com/android/dazhihui/a/b/q
    //   346: dup
    //   347: aload_1
    //   348: getfield 368	com/android/dazhihui/a/b/p:b	[B
    //   351: invokespecial 373	com/android/dazhihui/a/b/q:<init>	([B)V
    //   354: astore_1
    //   355: aload_1
    //   356: invokevirtual 465	com/android/dazhihui/a/b/q:e	()I
    //   359: istore 7
    //   361: aload_1
    //   362: invokevirtual 465	com/android/dazhihui/a/b/q:e	()I
    //   365: pop
    //   366: aload_1
    //   367: invokevirtual 465	com/android/dazhihui/a/b/q:e	()I
    //   370: pop
    //   371: aload_1
    //   372: invokevirtual 465	com/android/dazhihui/a/b/q:e	()I
    //   375: istore 8
    //   377: new 36	java/util/ArrayList
    //   380: dup
    //   381: invokespecial 37	java/util/ArrayList:<init>	()V
    //   384: astore_2
    //   385: iload 7
    //   387: tableswitch	default:+37->424, 60001:+42->429, 60002:+42->429, 60003:+42->429, 60004:+42->429, 60005:+42->429, 60006:+42->429
    //   424: aload_0
    //   425: invokevirtual 357	com/android/dazhihui/ui/screen/stock/a/x:e	()V
    //   428: return
    //   429: iload 6
    //   431: iload 8
    //   433: if_icmpge +147 -> 580
    //   436: new 467	com/android/dazhihui/ui/model/stock/market/MarketStockVo
    //   439: dup
    //   440: invokespecial 468	com/android/dazhihui/ui/model/stock/market/MarketStockVo:<init>	()V
    //   443: astore_3
    //   444: aload_1
    //   445: invokevirtual 471	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   448: astore 4
    //   450: aload_1
    //   451: invokevirtual 471	com/android/dazhihui/a/b/q:l	()Ljava/lang/String;
    //   454: astore 5
    //   456: aload_3
    //   457: aload 4
    //   459: invokevirtual 474	com/android/dazhihui/ui/model/stock/market/MarketStockVo:setStockCode	(Ljava/lang/String;)V
    //   462: aload_3
    //   463: aload 5
    //   465: invokevirtual 477	com/android/dazhihui/ui/model/stock/market/MarketStockVo:setStockName	(Ljava/lang/String;)V
    //   468: aload_3
    //   469: aload_1
    //   470: invokevirtual 479	com/android/dazhihui/a/b/q:b	()I
    //   473: invokevirtual 482	com/android/dazhihui/ui/model/stock/market/MarketStockVo:setDecl	(I)V
    //   476: aload_3
    //   477: aload_1
    //   478: invokevirtual 479	com/android/dazhihui/a/b/q:b	()I
    //   481: invokevirtual 485	com/android/dazhihui/ui/model/stock/market/MarketStockVo:setType	(I)V
    //   484: aload_3
    //   485: aload_1
    //   486: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   489: invokevirtual 490	com/android/dazhihui/ui/model/stock/market/MarketStockVo:setZs	(I)V
    //   492: aload_1
    //   493: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   496: pop
    //   497: aload_3
    //   498: aload_1
    //   499: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   502: invokevirtual 493	com/android/dazhihui/ui/model/stock/market/MarketStockVo:setZxData	(I)V
    //   505: aload_1
    //   506: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   509: pop
    //   510: aload_1
    //   511: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   514: pop
    //   515: aload_3
    //   516: aload_1
    //   517: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   520: invokevirtual 496	com/android/dazhihui/ui/model/stock/market/MarketStockVo:setCje	(I)V
    //   523: aload_3
    //   524: aload_1
    //   525: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   528: aload_1
    //   529: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   532: invokevirtual 500	com/android/dazhihui/ui/model/stock/market/MarketStockVo:setLiuInfo	(II)V
    //   535: aload_1
    //   536: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   539: pop
    //   540: aload_1
    //   541: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   544: pop
    //   545: aload_1
    //   546: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   549: pop
    //   550: aload_1
    //   551: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   554: pop
    //   555: aload_1
    //   556: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   559: pop
    //   560: aload_1
    //   561: invokevirtual 487	com/android/dazhihui/a/b/q:h	()I
    //   564: pop
    //   565: aload_2
    //   566: aload_3
    //   567: invokevirtual 501	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   570: pop
    //   571: iload 6
    //   573: iconst_1
    //   574: iadd
    //   575: istore 6
    //   577: goto -148 -> 429
    //   580: iload 7
    //   582: ldc 92
    //   584: if_icmpne +12 -> 596
    //   587: aload_0
    //   588: iconst_0
    //   589: aload_2
    //   590: invokespecial 503	com/android/dazhihui/ui/screen/stock/a/x:a	(ILjava/util/ArrayList;)V
    //   593: goto -336 -> 257
    //   596: iload 7
    //   598: ldc 95
    //   600: if_icmpne +12 -> 612
    //   603: aload_0
    //   604: iconst_1
    //   605: aload_2
    //   606: invokespecial 503	com/android/dazhihui/ui/screen/stock/a/x:a	(ILjava/util/ArrayList;)V
    //   609: goto -352 -> 257
    //   612: iload 7
    //   614: ldc 98
    //   616: if_icmpne +12 -> 628
    //   619: aload_0
    //   620: iconst_2
    //   621: aload_2
    //   622: invokespecial 503	com/android/dazhihui/ui/screen/stock/a/x:a	(ILjava/util/ArrayList;)V
    //   625: goto -368 -> 257
    //   628: iload 7
    //   630: ldc 101
    //   632: if_icmpne +12 -> 644
    //   635: aload_0
    //   636: iconst_3
    //   637: aload_2
    //   638: invokespecial 503	com/android/dazhihui/ui/screen/stock/a/x:a	(ILjava/util/ArrayList;)V
    //   641: goto -384 -> 257
    //   644: iload 7
    //   646: ldc 104
    //   648: if_icmpne +12 -> 660
    //   651: aload_0
    //   652: iconst_4
    //   653: aload_2
    //   654: invokespecial 503	com/android/dazhihui/ui/screen/stock/a/x:a	(ILjava/util/ArrayList;)V
    //   657: goto -400 -> 257
    //   660: iload 7
    //   662: ldc 107
    //   664: if_icmpne -407 -> 257
    //   667: aload_0
    //   668: iconst_5
    //   669: aload_2
    //   670: invokespecial 503	com/android/dazhihui/ui/screen/stock/a/x:a	(ILjava/util/ArrayList;)V
    //   673: goto -416 -> 257
    //   676: iload 6
    //   678: iconst_1
    //   679: iadd
    //   680: istore 6
    //   682: goto -589 -> 93
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	685	0	this	x
    //   0	685	1	paramh	h
    //   0	685	2	paramj	com.android.dazhihui.a.b.j
    //   443	124	3	localMarketStockVo	MarketStockVo
    //   448	10	4	str1	String
    //   454	10	5	str2	String
    //   1	680	6	i	int
    //   359	306	7	j	int
    //   375	59	8	k	int
    // Exception table:
    //   from	to	target	type
    //   3	16	163	java/lang/Exception
    //   25	30	163	java/lang/Exception
    //   39	54	163	java/lang/Exception
    //   58	90	163	java/lang/Exception
    //   93	123	163	java/lang/Exception
    //   126	160	163	java/lang/Exception
    //   173	185	163	java/lang/Exception
    //   194	199	163	java/lang/Exception
    //   208	239	163	java/lang/Exception
    //   239	257	163	java/lang/Exception
    //   263	267	163	java/lang/Exception
    //   278	282	163	java/lang/Exception
    //   285	301	163	java/lang/Exception
    //   301	315	163	java/lang/Exception
    //   324	329	163	java/lang/Exception
    //   333	385	163	java/lang/Exception
    //   436	571	163	java/lang/Exception
    //   587	593	163	java/lang/Exception
    //   603	609	163	java/lang/Exception
    //   619	625	163	java/lang/Exception
    //   635	641	163	java/lang/Exception
    //   651	657	163	java/lang/Exception
    //   667	673	163	java/lang/Exception
    //   239	257	262	java/io/FileNotFoundException
    //   3	16	270	finally
    //   25	30	270	finally
    //   39	54	270	finally
    //   58	90	270	finally
    //   93	123	270	finally
    //   126	160	270	finally
    //   164	168	270	finally
    //   173	185	270	finally
    //   194	199	270	finally
    //   208	239	270	finally
    //   239	257	270	finally
    //   263	267	270	finally
    //   278	282	270	finally
    //   285	301	270	finally
    //   301	315	270	finally
    //   324	329	270	finally
    //   333	385	270	finally
    //   436	571	270	finally
    //   587	593	270	finally
    //   603	609	270	finally
    //   619	625	270	finally
    //   635	641	270	finally
    //   651	657	270	finally
    //   667	673	270	finally
    //   239	257	277	java/io/IOException
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if ((paramh == this.b) || (paramh == this.c))
    {
      if (paramh.j() == Boolean.TRUE) {}
      paramh.a(Boolean.FALSE);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if ((paramh == this.b) || (paramh == this.c))
    {
      if (paramh.j() == Boolean.TRUE) {
        showShortToast(2131166192);
      }
      paramh.a(Boolean.FALSE);
    }
  }
  
  public void onPause()
  {
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void refresh()
  {
    super.refresh();
    a();
    if (this.a.size() == 0)
    {
      i = 0;
      while (i < this.j.length)
      {
        ArrayList localArrayList = new ArrayList();
        this.a.add(localArrayList);
        i += 1;
      }
    }
    this.c = f();
    this.c.a(Boolean.TRUE);
    this.c.a("市场-全球----单次包 NioRequest");
    registRequestListener(this.c);
    sendRequest(this.c);
    int j = com.android.dazhihui.ui.a.m.a().u();
    int i = j;
    if (j == 0) {
      i = 5;
    }
    setAutoRequestPeriod(i * 1000);
    if (this.b == null)
    {
      this.b = f();
      this.b.a("市场-全球----自动包  NioRequest");
      this.b.a(Boolean.TRUE);
      registRequestListener(this.b);
      setAutoRequest(this.b);
    }
    startAutoRequestPeriod();
    d();
  }
  
  public void show()
  {
    super.show();
    refresh();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */