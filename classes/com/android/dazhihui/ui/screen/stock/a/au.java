package com.android.dazhihui.ui.screen.stock.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.b.a;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.MarketManager;
import com.android.dazhihui.ui.model.stock.MarketMenuVo;
import com.android.dazhihui.ui.model.stock.MarketMenuVo.Config;
import com.android.dazhihui.ui.model.stock.MarketMenuVo.Header;
import com.android.dazhihui.ui.model.stock.MarketMenuVo.MenuItem;
import com.android.dazhihui.ui.model.stock.MarketMenuVo.MoreMarket;
import com.android.dazhihui.ui.model.stock.MarketVo;
import com.android.dazhihui.ui.model.stock.NewsTitleVo;
import com.android.dazhihui.ui.model.stock.NewsTitleVo.NewsTitleItem;
import com.android.dazhihui.ui.screen.stock.MarketFocusScreen;
import com.android.dazhihui.ui.screen.stock.MarketListScreenActivity;
import com.android.dazhihui.ui.screen.stock.MorningPostScreen;
import com.android.dazhihui.ui.screen.stock.ProfitExpectedScreen;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.NoScrollGridView;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class au
  extends l
  implements AdapterView.OnItemClickListener, cp, cs
{
  private NoScrollGridView[] R;
  private List<MarketMenuVo.MenuItem> S;
  private ArrayList<MarketVo> T;
  private LinearLayout[] U;
  private NoScrollGridView[] V;
  private String[] W = { "沪深市场", "资讯", "决策", "基金", "期权", "债券", "外汇", "港股", "美股", "商品期货", "大宗电子" };
  private final int X = 10;
  private final int Y = 9;
  private com.android.dazhihui.a.b.f Z;
  private View a;
  private com.android.dazhihui.a.b.m aa;
  private com.android.dazhihui.a.b.f ab;
  private NewsTitleVo ac;
  private final int ad = 1;
  private DzhHeader ae;
  private AdapterView.OnItemClickListener af = new aw(this);
  private String ag = "";
  private LinearLayout b;
  private MarketManager c;
  private MarketMenuVo d;
  private LinearLayout[] e;
  
  private void a(MarketVo paramMarketVo)
  {
    if (paramMarketVo == null) {
      return;
    }
    if ("2".equals(paramMarketVo.getHandleType()))
    {
      r.a(paramMarketVo.getUrlPath(), getActivity(), null, null);
      n.a("", paramMarketVo.getCountid());
      return;
    }
    if ("3".equals(paramMarketVo.getHandleType()))
    {
      r.a(getActivity(), null, paramMarketVo.getUrlPath(), null);
      n.a("", paramMarketVo.getCountid());
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putParcelable("market_vo", paramMarketVo);
    Intent localIntent;
    if (("决策".equals(MarketManager.get().getParent(paramMarketVo.getName()))) && ("盈利预期".equals(paramMarketVo.getName()))) {
      localIntent = new Intent(getActivity(), ProfitExpectedScreen.class);
    }
    for (;;)
    {
      localIntent.putExtras(localBundle);
      startActivity(localIntent);
      MarketManager.get().setStatisticsUserAction("", paramMarketVo.getName());
      return;
      if (("交易关注".equals(MarketManager.get().getParent(paramMarketVo.getName()))) && ("交易关注".equals(paramMarketVo.getName())))
      {
        localIntent = new Intent(getActivity(), MarketFocusScreen.class);
      }
      else if (("决策".equals(MarketManager.get().getParent(paramMarketVo.getName()))) && ("异动主题".equals(paramMarketVo.getName())))
      {
        localIntent = new Intent(getActivity(), MorningPostScreen.class);
      }
      else
      {
        if (("板块综合".equals(paramMarketVo.getName())) || ("行业板块".equals(paramMarketVo.getName())) || ("概念板块".equals(paramMarketVo.getName())))
        {
          byte b1 = 0;
          if ("行业板块".equals(paramMarketVo.getName())) {
            b1 = 1;
          }
          for (;;)
          {
            localBundle.putParcelable("market_vo", paramMarketVo);
            localBundle.putByte("type", b1);
            localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
            break;
            if ("概念板块".equals(paramMarketVo.getName())) {
              b1 = 2;
            }
          }
        }
        if ((("基金".equals(MarketManager.get().getParent(paramMarketVo.getName()))) && ((paramMarketVo.getId() == 15) || (paramMarketVo.getId() == 16) || (paramMarketVo.getId() == 14) || (paramMarketVo.getId() == 24))) || ("分级基金".equals(paramMarketVo.getName())) || ("债券".equals(MarketManager.get().getParent(paramMarketVo.getName()))) || (("商品期货".equals(MarketManager.get().getParent(paramMarketVo.getName()))) && ("常用商品".equals(paramMarketVo.getName())))) {
          localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        } else if (("基金".equals(MarketManager.get().getParent(paramMarketVo.getName()))) && (paramMarketVo.getId() != 15) && (paramMarketVo.getId() != 16) && (paramMarketVo.getId() != 14) && (paramMarketVo.getId() != 24)) {
          localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        } else if (("商品期货".equals(MarketManager.get().getParent(paramMarketVo.getName()))) && (!"常用商品".equals(paramMarketVo.getName()))) {
          localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        } else if ("大宗电子".equals(MarketManager.get().getParent(paramMarketVo.getName()))) {
          localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        } else if ("期权".equals(MarketManager.get().getParent(paramMarketVo.getName()))) {
          localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        } else if ((paramMarketVo.getType() == 104) || (paramMarketVo.getType() == 109)) {
          localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        } else {
          localIntent = new Intent(getActivity(), MarketListScreenActivity.class);
        }
      }
    }
  }
  
  private void a(ArrayList<MarketVo> paramArrayList, NoScrollGridView paramNoScrollGridView, boolean paramBoolean)
  {
    if ((paramArrayList != null) && (paramArrayList.size() > 0))
    {
      paramNoScrollGridView.setAdapter(new ax(this, getActivity(), paramArrayList, paramBoolean));
      if (paramNoScrollGridView.getMeasuredHeight() == 0) {
        paramNoScrollGridView.measure(getView().getWidth(), getView().getHeight());
      }
      paramNoScrollGridView.setVisibility(0);
      return;
    }
    paramNoScrollGridView.setVisibility(8);
  }
  
  private void c(boolean paramBoolean)
  {
    this.ab = new com.android.dazhihui.a.b.f();
    this.ab.a(Boolean.valueOf(paramBoolean));
    this.ab.c(com.android.dazhihui.a.f.e);
    registRequestListener(this.ab);
    sendRequest(this.ab);
  }
  
  private void g()
  {
    int i;
    if ((this.V != null) && (this.V.length > 0))
    {
      i = 0;
      if (i < this.V.length)
      {
        if ("资讯".equals(this.W[i])) {
          h();
        }
        for (;;)
        {
          i += 1;
          break;
          Object localObject = this.c.getChildList(this.W[i]);
          ArrayList localArrayList;
          MarketVo localMarketVo;
          if (("决策".equals(this.W[i])) && (localObject != null))
          {
            localArrayList = new ArrayList();
            localObject = ((ArrayList)localObject).iterator();
            while (((Iterator)localObject).hasNext())
            {
              localMarketVo = (MarketVo)((Iterator)localObject).next();
              if (!"股价预警".equals(localMarketVo.getName())) {
                localArrayList.add(localMarketVo);
              }
            }
            a(localArrayList, this.V[i], false);
            this.V[i].setOnItemClickListener(this);
          }
          else if (("沪深市场".equals(this.W[i])) && (localObject != null))
          {
            localArrayList = new ArrayList();
            localObject = ((ArrayList)localObject).iterator();
            while (((Iterator)localObject).hasNext())
            {
              localMarketVo = (MarketVo)((Iterator)localObject).next();
              localArrayList.add(localMarketVo);
              if ("中小板块".equals(localMarketVo.getName()))
              {
                localArrayList.add(new MarketVo("板块综合", false, false, -100));
                localArrayList.add(new MarketVo("行业板块", false, false, -100));
                localArrayList.add(new MarketVo("概念板块", false, false, -100));
              }
            }
            a(localArrayList, this.V[i], false);
            this.V[i].setOnItemClickListener(this);
          }
          else
          {
            a((ArrayList)localObject, this.V[i], false);
            this.V[i].setOnItemClickListener(this);
          }
        }
      }
    }
    if ((this.R != null) && (this.R.length == 1) && (this.T != null) && (this.T.size() > 0))
    {
      i = 0;
      while (i < this.R.length)
      {
        a(this.T, this.R[i], false);
        this.R[i].setOnItemClickListener(this);
        i += 1;
      }
    }
  }
  
  private void h()
  {
    if ((this.V != null) && (1 < this.V.length) && (this.ac != null))
    {
      ArrayList localArrayList = new ArrayList();
      Iterator localIterator = this.ac.getNewsTitleList().iterator();
      while (localIterator.hasNext())
      {
        NewsTitleVo.NewsTitleItem localNewsTitleItem = (NewsTitleVo.NewsTitleItem)localIterator.next();
        if (localNewsTitleItem.getMenuflag() == 3)
        {
          String str = this.ac.getVersion() + localNewsTitleItem.getCountid() + localNewsTitleItem.getNavigationname();
          ah.a().a(14, str);
        }
        localArrayList.add(new MarketVo(localNewsTitleItem.getNavigationname(), false, false, -100, -1, "1", String.valueOf(localNewsTitleItem.getMenuflag()), localNewsTitleItem.getCountid(), localNewsTitleItem.getLinkurl()));
      }
      a(localArrayList, this.V[1], true);
      this.V[1].setOnItemClickListener(this.af);
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return false;
      if (getActivity() != null) {
        startActivity(new Intent(getActivity(), SearchStockScreen.class));
      }
    }
  }
  
  public void a()
  {
    NewsTitleVo localNewsTitleVo = (NewsTitleVo)DzhApplication.a().b().a("NewsTitleJson", new av(this));
    this.ac = localNewsTitleVo;
    if ((localNewsTitleVo == null) || (!localNewsTitleVo.isSameDay()))
    {
      c(false);
      return;
    }
    h();
  }
  
  public void a(boolean paramBoolean)
  {
    if ((this.a != null) && (paramBoolean)) {
      this.a.scrollTo(0, 0);
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 8225;
    paramct.d = "投哪";
    paramct.p = this;
  }
  
  public void f()
  {
    this.Z = new com.android.dazhihui.a.b.f();
    this.Z.c("http://mnews.gw.com.cn/wap/data/scfl.json");
    registRequestListener(this.Z);
    x localx = new x(2981);
    localx.c("市场-加号-2981包获取商品期货和大宗电子的子市场");
    this.aa = new com.android.dazhihui.a.b.m(localx);
    registRequestListener(this.aa);
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.ae = paramDzhHeader;
  }
  
  /* Error */
  public void handleResponse(h paramh, com.android.dazhihui.a.b.j paramj)
  {
    // Byte code:
    //   0: aload_2
    //   1: ifnonnull +4 -> 5
    //   4: return
    //   5: aload_2
    //   6: instanceof 481
    //   9: ifeq +147 -> 156
    //   12: aload_2
    //   13: checkcast 481	com/android/dazhihui/a/b/g
    //   16: astore_2
    //   17: aload_1
    //   18: aload_0
    //   19: getfield 267	com/android/dazhihui/ui/screen/stock/a/au:ab	Lcom/android/dazhihui/a/b/f;
    //   22: if_acmpne +81 -> 103
    //   25: aload_1
    //   26: invokeinterface 486 1 0
    //   31: invokestatic 489	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   34: invokestatic 492	java/lang/Boolean:valueOf	(Ljava/lang/String;)Ljava/lang/Boolean;
    //   37: invokevirtual 495	java/lang/Boolean:booleanValue	()Z
    //   40: istore_3
    //   41: new 55	java/lang/String
    //   44: dup
    //   45: aload_2
    //   46: invokevirtual 498	com/android/dazhihui/a/b/g:a	()[B
    //   49: invokespecial 501	java/lang/String:<init>	([B)V
    //   52: astore_1
    //   53: new 339	com/android/dazhihui/ui/model/stock/NewsTitleVo
    //   56: dup
    //   57: invokespecial 502	com/android/dazhihui/ui/model/stock/NewsTitleVo:<init>	()V
    //   60: astore_2
    //   61: aload_2
    //   62: aload_1
    //   63: invokevirtual 505	com/android/dazhihui/ui/model/stock/NewsTitleVo:decode	(Ljava/lang/String;)V
    //   66: invokestatic 407	com/android/dazhihui/DzhApplication:a	()Lcom/android/dazhihui/DzhApplication;
    //   69: invokevirtual 410	com/android/dazhihui/DzhApplication:b	()Lcom/android/dazhihui/c/b/a;
    //   72: ldc_w 412
    //   75: aload_2
    //   76: invokevirtual 508	com/android/dazhihui/c/b/a:a	(Ljava/lang/String;Ljava/lang/Object;)V
    //   79: aload_0
    //   80: aload_2
    //   81: putfield 100	com/android/dazhihui/ui/screen/stock/a/au:ac	Lcom/android/dazhihui/ui/model/stock/NewsTitleVo;
    //   84: iload_3
    //   85: ifeq +3 -> 88
    //   88: aload_0
    //   89: invokespecial 296	com/android/dazhihui/ui/screen/stock/a/au:h	()V
    //   92: return
    //   93: astore_1
    //   94: aload_1
    //   95: invokevirtual 511	org/json/JSONException:printStackTrace	()V
    //   98: iload_3
    //   99: ifeq -95 -> 4
    //   102: return
    //   103: aload_1
    //   104: aload_0
    //   105: getfield 447	com/android/dazhihui/ui/screen/stock/a/au:Z	Lcom/android/dazhihui/a/b/f;
    //   108: if_acmpne -104 -> 4
    //   111: aload_2
    //   112: invokevirtual 498	com/android/dazhihui/a/b/g:a	()[B
    //   115: astore_1
    //   116: aload_1
    //   117: ifnull -113 -> 4
    //   120: invokestatic 155	com/android/dazhihui/ui/model/stock/MarketManager:get	()Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   123: new 55	java/lang/String
    //   126: dup
    //   127: aload_1
    //   128: ldc_w 513
    //   131: invokespecial 516	java/lang/String:<init>	([BLjava/lang/String;)V
    //   134: invokevirtual 519	com/android/dazhihui/ui/model/stock/MarketManager:decodeStockList	(Ljava/lang/String;)V
    //   137: return
    //   138: astore_1
    //   139: aload_1
    //   140: invokevirtual 511	org/json/JSONException:printStackTrace	()V
    //   143: return
    //   144: astore_1
    //   145: aload_1
    //   146: invokevirtual 520	java/lang/Exception:printStackTrace	()V
    //   149: return
    //   150: astore_1
    //   151: aload_1
    //   152: invokevirtual 521	java/io/UnsupportedEncodingException:printStackTrace	()V
    //   155: return
    //   156: aload_2
    //   157: instanceof 523
    //   160: ifeq -156 -> 4
    //   163: aload_2
    //   164: checkcast 523	com/android/dazhihui/a/b/o
    //   167: astore_2
    //   168: aload_1
    //   169: aload_0
    //   170: getfield 463	com/android/dazhihui/ui/screen/stock/a/au:aa	Lcom/android/dazhihui/a/b/m;
    //   173: if_acmpne -169 -> 4
    //   176: aload_2
    //   177: invokevirtual 526	com/android/dazhihui/a/b/o:h	()Lcom/android/dazhihui/a/b/p;
    //   180: astore_1
    //   181: aload_1
    //   182: ifnull -178 -> 4
    //   185: aload_1
    //   186: getfield 529	com/android/dazhihui/a/b/p:a	I
    //   189: sipush 2981
    //   192: if_icmpne -188 -> 4
    //   195: aload_1
    //   196: getfield 532	com/android/dazhihui/a/b/p:b	[B
    //   199: astore_1
    //   200: aload_1
    //   201: ifnull -197 -> 4
    //   204: aload_1
    //   205: arraylength
    //   206: iconst_2
    //   207: if_icmple -203 -> 4
    //   210: new 534	com/android/dazhihui/a/b/q
    //   213: dup
    //   214: aload_1
    //   215: invokespecial 535	com/android/dazhihui/a/b/q:<init>	([B)V
    //   218: astore_2
    //   219: invokestatic 155	com/android/dazhihui/ui/model/stock/MarketManager:get	()Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   222: aload_2
    //   223: invokevirtual 539	com/android/dazhihui/ui/model/stock/MarketManager:decodeFutures	(Lcom/android/dazhihui/a/b/q;)V
    //   226: aload_0
    //   227: invokevirtual 121	com/android/dazhihui/ui/screen/stock/a/au:getActivity	()Landroid/support/v4/app/FragmentActivity;
    //   230: astore_2
    //   231: aload_2
    //   232: ifnull -228 -> 4
    //   235: aload_2
    //   236: invokevirtual 545	android/content/Context:getFilesDir	()Ljava/io/File;
    //   239: ifnull -235 -> 4
    //   242: new 547	java/io/File
    //   245: dup
    //   246: new 353	java/lang/StringBuilder
    //   249: dup
    //   250: invokespecial 354	java/lang/StringBuilder:<init>	()V
    //   253: aload_2
    //   254: invokevirtual 545	android/content/Context:getFilesDir	()Ljava/io/File;
    //   257: invokevirtual 550	java/io/File:getPath	()Ljava/lang/String;
    //   260: invokevirtual 361	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   263: ldc_w 552
    //   266: invokevirtual 361	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   269: invokevirtual 371	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   272: invokespecial 554	java/io/File:<init>	(Ljava/lang/String;)V
    //   275: astore_2
    //   276: new 556	java/io/FileOutputStream
    //   279: dup
    //   280: aload_2
    //   281: invokespecial 559	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   284: astore_2
    //   285: aload_2
    //   286: aload_1
    //   287: invokevirtual 562	java/io/FileOutputStream:write	([B)V
    //   290: aload_2
    //   291: invokevirtual 565	java/io/FileOutputStream:close	()V
    //   294: aload_0
    //   295: getfield 293	com/android/dazhihui/ui/screen/stock/a/au:V	[Lcom/android/dazhihui/ui/widget/NoScrollGridView;
    //   298: ifnull -294 -> 4
    //   301: bipush 10
    //   303: aload_0
    //   304: getfield 293	com/android/dazhihui/ui/screen/stock/a/au:V	[Lcom/android/dazhihui/ui/widget/NoScrollGridView;
    //   307: arraylength
    //   308: if_icmpge -304 -> 4
    //   311: bipush 9
    //   313: aload_0
    //   314: getfield 293	com/android/dazhihui/ui/screen/stock/a/au:V	[Lcom/android/dazhihui/ui/widget/NoScrollGridView;
    //   317: arraylength
    //   318: if_icmpge -314 -> 4
    //   321: aload_0
    //   322: aload_0
    //   323: getfield 298	com/android/dazhihui/ui/screen/stock/a/au:c	Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   326: ldc 75
    //   328: invokevirtual 302	com/android/dazhihui/ui/model/stock/MarketManager:getChildList	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   331: aload_0
    //   332: getfield 293	com/android/dazhihui/ui/screen/stock/a/au:V	[Lcom/android/dazhihui/ui/widget/NoScrollGridView;
    //   335: bipush 9
    //   337: aaload
    //   338: iconst_0
    //   339: invokespecial 324	com/android/dazhihui/ui/screen/stock/a/au:a	(Ljava/util/ArrayList;Lcom/android/dazhihui/ui/widget/NoScrollGridView;Z)V
    //   342: aload_0
    //   343: aload_0
    //   344: getfield 298	com/android/dazhihui/ui/screen/stock/a/au:c	Lcom/android/dazhihui/ui/model/stock/MarketManager;
    //   347: ldc 77
    //   349: invokevirtual 302	com/android/dazhihui/ui/model/stock/MarketManager:getChildList	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   352: aload_0
    //   353: getfield 293	com/android/dazhihui/ui/screen/stock/a/au:V	[Lcom/android/dazhihui/ui/widget/NoScrollGridView;
    //   356: bipush 10
    //   358: aaload
    //   359: iconst_0
    //   360: invokespecial 324	com/android/dazhihui/ui/screen/stock/a/au:a	(Ljava/util/ArrayList;Lcom/android/dazhihui/ui/widget/NoScrollGridView;Z)V
    //   363: return
    //   364: astore_1
    //   365: aload_1
    //   366: invokevirtual 566	java/io/FileNotFoundException:printStackTrace	()V
    //   369: goto -75 -> 294
    //   372: astore_1
    //   373: aload_1
    //   374: invokevirtual 567	java/io/IOException:printStackTrace	()V
    //   377: goto -83 -> 294
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	380	0	this	au
    //   0	380	1	paramh	h
    //   0	380	2	paramj	com.android.dazhihui.a.b.j
    //   40	59	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   53	84	93	org/json/JSONException
    //   88	92	93	org/json/JSONException
    //   120	137	138	org/json/JSONException
    //   5	53	144	java/lang/Exception
    //   53	84	144	java/lang/Exception
    //   88	92	144	java/lang/Exception
    //   94	98	144	java/lang/Exception
    //   103	116	144	java/lang/Exception
    //   120	137	144	java/lang/Exception
    //   139	143	144	java/lang/Exception
    //   151	155	144	java/lang/Exception
    //   156	181	144	java/lang/Exception
    //   185	200	144	java/lang/Exception
    //   204	231	144	java/lang/Exception
    //   235	276	144	java/lang/Exception
    //   276	294	144	java/lang/Exception
    //   294	363	144	java/lang/Exception
    //   365	369	144	java/lang/Exception
    //   373	377	144	java/lang/Exception
    //   120	137	150	java/io/UnsupportedEncodingException
    //   276	294	364	java/io/FileNotFoundException
    //   276	294	372	java/io/IOException
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if ((this.a != null) && (getActivity() != null))
    {
      this.ae = ((DzhHeader)this.a.findViewById(2131558683));
      this.ae.a(getActivity(), this);
    }
    this.c = MarketManager.get();
    g();
    f();
    a();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.a = paramLayoutInflater.inflate(2130903327, null);
    this.b = ((LinearLayout)this.a.findViewById(2131560082));
    this.d = com.android.dazhihui.ui.a.m.a().L();
    if ((this.d != null) && (this.d.header != null) && (this.d.data != null) && ("0".equals(this.d.header.error)) && (this.d.data.jxtj != null) && (this.d.data.jxtj.subnames != null) && (this.d.data.jxtj.rname != null))
    {
      this.S = this.d.data.jxtj.subnames;
      this.T = new ArrayList();
      paramViewGroup = this.S.iterator();
      while (paramViewGroup.hasNext())
      {
        paramBundle = (MarketMenuVo.MenuItem)paramViewGroup.next();
        if (paramBundle.getMenuflag().equals("3"))
        {
          String str = this.d.header.vs + paramBundle.getCountid() + paramBundle.getName();
          ah.a().a(14, str);
        }
        this.T.add(new MarketVo(paramBundle.getName(), false, false, -100, paramBundle.getId(), paramBundle.getType(), paramBundle.getMenuflag(), paramBundle.getCountid(), paramBundle.getUrlPath()));
      }
      this.e = new LinearLayout[1];
      this.R = new NoScrollGridView[1];
      i = 0;
      while (i < 1)
      {
        this.e[i] = ((LinearLayout)paramLayoutInflater.inflate(2130903326, null));
        this.R[i] = ((NoScrollGridView)this.e[i].findViewById(2131560080));
        ((TextView)this.e[i].findViewById(2131560079)).setText(this.d.data.jxtj.rname);
        this.b.addView(this.e[i]);
        i += 1;
      }
    }
    this.U = new LinearLayout[this.W.length];
    this.V = new NoScrollGridView[this.W.length];
    int i = 0;
    while (i < this.W.length)
    {
      this.U[i] = ((LinearLayout)paramLayoutInflater.inflate(2130903326, null));
      this.V[i] = ((NoScrollGridView)this.U[i].findViewById(2131560080));
      ((TextView)this.U[i].findViewById(2131560079)).setText(this.W[i]);
      this.b.addView(this.U[i]);
      i += 1;
    }
    return this.a;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (MarketVo)paramAdapterView.getAdapter().getItem(paramInt);
    if (paramAdapterView.getMenuflag().equals("3"))
    {
      paramView = paramView.getTag();
      if ((paramView != null) && ((paramView instanceof ay))) {
        ((ay)paramView).b.setVisibility(8);
      }
      paramView = this.d.header.vs + paramAdapterView.getCountid() + paramAdapterView.getName();
      ah.a().b(14, paramView);
    }
    a(paramAdapterView);
  }
  
  public void refresh()
  {
    super.refresh();
    sendRequest(this.Z);
    sendRequest(this.aa);
  }
  
  public void show()
  {
    super.show();
    refresh();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */