package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.BodyField;
import com.android.dazhihui.ui.model.stock.HeaderField;
import com.android.dazhihui.ui.model.stock.JpNewsVo;
import com.android.dazhihui.ui.model.stock.JsonHeader;
import com.android.dazhihui.ui.model.stock.JsonNewsItem;
import com.android.dazhihui.ui.model.stock.KxNewsVo;
import com.android.dazhihui.ui.model.stock.KxNewsVo.Header;
import com.android.dazhihui.ui.model.stock.KxNewsVo.KxItem;
import com.android.dazhihui.ui.model.stock.NewsVo;
import com.android.dazhihui.ui.model.stock.NewsXgfxVo;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.model.stock.StockNewItem;
import com.android.dazhihui.ui.model.stock.StockNewsVo;
import com.android.dazhihui.ui.model.stock.adapter.NewsAdapter.AdsAdapter;
import com.android.dazhihui.ui.model.stock.adapter.NewsAdapter.KxAdsAdapter;
import com.android.dazhihui.ui.model.stock.adapter.NewsAdapter.KxNewsAdapter;
import com.android.dazhihui.ui.model.stock.adapter.NewsAdapter.MyStockInfoAdapter;
import com.android.dazhihui.ui.model.stock.adapter.NewsAdapter.NewStockAdapter;
import com.android.dazhihui.ui.model.stock.adapter.NewsAdapter.SelfStockAdapter;
import com.android.dazhihui.ui.model.stock.adapter.NewsAdapter.StockNewsAdapter;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.PageLoadTip;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.flip.CircleFlowIndicator;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import com.c.a.k;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class lp
  extends com.android.dazhihui.ui.screen.a
  implements AdapterView.OnItemClickListener
{
  private com.android.dazhihui.c.b.a A;
  private boolean B = false;
  private List<NewsVo> C = new ArrayList();
  private LoadAndRefreshView D;
  public NewsAdapter.MyStockInfoAdapter a;
  public NewsAdapter.NewStockAdapter b;
  public NewsAdapter.SelfStockAdapter c;
  public int d;
  public List<KxNewsVo.KxItem> e = new ArrayList();
  private ListView f;
  private String g;
  private String h;
  private PageLoadTip i;
  private int j;
  private String k;
  private boolean l;
  private NewsAdapter.StockNewsAdapter m;
  private NewsAdapter.KxNewsAdapter n;
  private LayoutInflater o;
  private NewsAdapter.AdsAdapter p;
  private NewsAdapter.KxAdsAdapter q;
  private ViewFlow r;
  private View s;
  private boolean t = false;
  private boolean u = false;
  private f v;
  private f w;
  private f x;
  private com.android.dazhihui.a.b.m y;
  private com.android.dazhihui.a.b.m z;
  
  public static lp a(int paramInt, String paramString1, String paramString2, boolean paramBoolean)
  {
    lp locallp = new lp();
    Bundle localBundle = new Bundle();
    localBundle.putInt("type", paramInt);
    localBundle.putString("firstUrl", paramString1);
    localBundle.putString("titleName", paramString2);
    localBundle.putBoolean("isNeedCache", paramBoolean);
    locallp.setArguments(localBundle);
    return locallp;
  }
  
  public static lp a(int paramInt, String paramString1, String paramString2, boolean paramBoolean, String paramString3)
  {
    lp locallp = new lp();
    Bundle localBundle = new Bundle();
    localBundle.putInt("type", paramInt);
    localBundle.putString("firstUrl", paramString1);
    localBundle.putString("titleName", paramString2);
    localBundle.putBoolean("isNeedCache", paramBoolean);
    localBundle.putString("stockCode", paramString3);
    locallp.setArguments(localBundle);
    return locallp;
  }
  
  private void a(String paramString, boolean paramBoolean)
  {
    this.t = true;
    if (this.j == 1)
    {
      this.a.getmDataVo().setCurrentUrl(paramString);
      this.w = new f();
      this.w.c(paramString);
      this.w.a(Boolean.valueOf(paramBoolean));
      registRequestListener(this.w);
      sendRequest(this.w);
    }
    do
    {
      return;
      if (this.j == 3)
      {
        this.v = new f();
        this.v.c(paramString);
        this.v.a(Boolean.valueOf(paramBoolean));
        registRequestListener(this.v);
        sendRequest(this.v);
        return;
      }
      if (this.j == 2)
      {
        int i3 = Integer.parseInt(paramString);
        int i2 = SelfSelectedStockManager.getInstance().getSelfStockVectorSize();
        if (i2 == 0)
        {
          this.i.a(16, 2131492868);
          this.i.a("暂无自选新闻,点击添加自选", 2130837511, new mb(this));
          return;
        }
        int i1 = i2;
        if (i2 > 20) {
          i1 = 20;
        }
        paramString = new com.c.a.r().a().b();
        localObject1 = new LinkedHashMap();
        Object localObject2 = new StringBuilder();
        i2 = 0;
        while (i2 < i1)
        {
          ((StringBuilder)localObject2).append(((SelfStock)SelfSelectedStockManager.getInstance().getSelfStockVector().get(i2)).getCode()).append(",");
          i2 += 1;
        }
        ((StringBuilder)localObject2).deleteCharAt(((StringBuilder)localObject2).length() - 1);
        ((Map)localObject1).put("data", new BodyField(0, "", "", i3, ((StringBuilder)localObject2).toString()));
        ((Map)localObject1).put("header", new HeaderField(100));
        localObject2 = new ArrayList(1);
        ((ArrayList)localObject2).add(localObject1);
        paramString = paramString.a(localObject2);
        localObject1 = new x(3005);
        ((x)localObject1).b(2);
        Log.i("GUH", "3005自选新闻=" + paramString);
        ((x)localObject1).a(paramString.getBytes());
        this.y = new com.android.dazhihui.a.b.m((x)localObject1);
        this.y.a(Boolean.valueOf(paramBoolean));
        registRequestListener(this.y);
        sendRequest(this.y);
        return;
      }
      if (this.j == 4)
      {
        this.m.getmStockNewsVo().setCurPage(paramString);
        this.x = new f();
        this.x.c(paramString);
        this.x.a(Boolean.valueOf(paramBoolean));
        registRequestListener(this.x);
        sendRequest(this.x);
        return;
      }
    } while (this.j != 6);
    Object localObject1 = new x(3005);
    ((x)localObject1).b(2);
    ((x)localObject1).a(KxNewsVo.getRequest(paramString).getBytes());
    this.z = new com.android.dazhihui.a.b.m((x)localObject1);
    this.z.a(Boolean.valueOf(paramBoolean));
    registRequestListener(this.z);
    sendRequest(this.z);
  }
  
  public static boolean a(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      boolean bool1;
      if ((String)com.android.dazhihui.ui.a.m.a().i().get(paramString) != null) {
        bool1 = true;
      }
      boolean bool2;
      do
      {
        return bool1;
        d locald = d.a();
        bool2 = locald.a(1, paramString);
        locald.g();
        bool1 = bool2;
      } while (!bool2);
      com.android.dazhihui.ui.a.m.a().i().put(paramString, paramString);
      return bool2;
    }
    return false;
  }
  
  public static void b(String paramString)
  {
    if ((paramString != null) && (paramString.length() > 0))
    {
      com.android.dazhihui.ui.a.m.a().i().put(paramString, paramString);
      d locald = d.a();
      locald.a(1, paramString, (int)(new Date().getTime() / 1000L));
      locald.g();
    }
  }
  
  private void c(String paramString)
  {
    this.i.a(paramString, new lt(this));
  }
  
  public String a(boolean paramBoolean)
  {
    if (com.android.dazhihui.a.g.a().o())
    {
      if (paramBoolean) {
        return "请求数据失败，点击重试!";
      }
      return "请求数据失败!";
    }
    if (paramBoolean) {
      return "网络连接异常,请检查网络情况,点击重新加载!";
    }
    return "网络连接异常,请检查网络情况!";
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(View paramView)
  {
    this.i = ((PageLoadTip)paramView.findViewById(2131558569));
    this.D = ((LoadAndRefreshView)paramView.findViewById(2131560105));
    this.D.setOnFooterLoadListener(new lq(this));
    this.D.setOnHeaderRefreshListener(new lv(this));
    this.f = ((ListView)paramView.findViewById(2131558568));
    this.f.setOnItemClickListener(this);
    if (this.j == 1) {
      if (this.l)
      {
        paramView = (JpNewsVo)this.A.a(this.g, new lw(this));
        if (paramView == null) {
          break label156;
        }
        this.a = new NewsAdapter.MyStockInfoAdapter(getActivity(), paramView);
        label138:
        a(paramView);
      }
    }
    label156:
    Object localObject;
    label577:
    do
    {
      return;
      this.i.b();
      paramView = null;
      break;
      paramView = new JpNewsVo();
      this.a = new NewsAdapter.MyStockInfoAdapter(getActivity(), paramView);
      this.i.b();
      break label138;
      if (this.j == 2)
      {
        if (this.l)
        {
          localObject = (ArrayList)this.A.a(this.g, new lx(this));
          paramView = (View)localObject;
          if (localObject == null) {
            this.i.b();
          }
        }
        for (paramView = (View)localObject;; paramView = null)
        {
          localObject = paramView;
          if (paramView == null) {
            localObject = new ArrayList();
          }
          this.c = new NewsAdapter.SelfStockAdapter(getActivity(), (ArrayList)localObject);
          this.f.setAdapter(this.c);
          return;
          this.i.b();
        }
      }
      if (this.j == 3)
      {
        paramView = this.o.inflate(2130903338, null);
        this.f.addHeaderView(paramView, null, false);
        if (this.l)
        {
          localObject = (List)this.A.a(this.g, new ly(this));
          paramView = (View)localObject;
          if (localObject == null) {
            this.i.b();
          }
        }
        for (paramView = (View)localObject;; paramView = null)
        {
          localObject = paramView;
          if (paramView == null) {
            localObject = new ArrayList();
          }
          this.b = new NewsAdapter.NewStockAdapter(getActivity(), (List)localObject);
          this.f.setAdapter(this.b);
          return;
          this.i.b();
        }
      }
      if (this.j == 4)
      {
        if (this.l)
        {
          localObject = (StockNewsVo)this.A.a(this.g, new lz(this));
          paramView = (View)localObject;
          if (localObject == null)
          {
            this.i.b();
            paramView = (View)localObject;
          }
          localObject = paramView;
          if (paramView == null) {
            localObject = new StockNewsVo();
          }
          this.m = new NewsAdapter.StockNewsAdapter(getActivity(), (StockNewsVo)localObject);
          if (com.android.dazhihui.g.a().b() != y.a) {
            break label577;
          }
          this.f.setDivider(new ColorDrawable(getResources().getColor(2131493692)));
        }
        for (;;)
        {
          this.f.setDividerHeight(1);
          this.f.setAdapter(this.m);
          return;
          this.i.b();
          paramView = null;
          break;
          this.f.setDivider(new ColorDrawable(getResources().getColor(2131493695)));
        }
      }
    } while (this.j != 6);
    if (this.l)
    {
      localObject = (KxNewsVo)this.A.a(this.g, new ma(this));
      paramView = (View)localObject;
      if (localObject == null) {
        this.i.b();
      }
    }
    for (paramView = (View)localObject;; paramView = null)
    {
      localObject = paramView;
      if (paramView == null) {
        localObject = new KxNewsVo();
      }
      this.n = new NewsAdapter.KxNewsAdapter(getActivity(), this.g, (KxNewsVo)localObject);
      this.f.setOnItemClickListener(this.n);
      this.f.setDivider(getResources().getDrawable(2131493692));
      this.f.setDividerHeight(1);
      a((KxNewsVo)localObject);
      return;
      this.i.b();
    }
  }
  
  public void a(JpNewsVo paramJpNewsVo)
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)this.o.inflate(2130903160, null, false);
    Object localObject = (FrameLayout)localRelativeLayout.findViewById(2131559233);
    if (this.d != 0)
    {
      AdvertView localAdvertView = new AdvertView(getActivity());
      localAdvertView.setAdvCode(this.d);
      addAdvert(localAdvertView);
      ((FrameLayout)localObject).addView(localAdvertView, -1, -2);
    }
    this.s = localRelativeLayout.findViewById(2131559234);
    this.s.setVisibility(8);
    this.r = ((ViewFlow)localRelativeLayout.findViewById(2131559235));
    localObject = (CircleFlowIndicator)localRelativeLayout.findViewById(2131559236);
    this.r.setFlowIndicator((CircleFlowIndicator)localObject);
    this.r.setOnItemClickListener(this);
    this.p = new NewsAdapter.AdsAdapter(getActivity(), this.r, paramJpNewsVo, this.C);
    this.r.setAdapter(this.p);
    this.f.addHeaderView(localRelativeLayout);
    this.p.refresh(null);
    addAdvert(new me(this, 113));
    this.f.setAdapter(this.a);
  }
  
  public void a(KxNewsVo paramKxNewsVo)
  {
    RelativeLayout localRelativeLayout = (RelativeLayout)this.o.inflate(2130903160, null, false);
    this.r = ((ViewFlow)localRelativeLayout.findViewById(2131559235));
    this.s = localRelativeLayout.findViewById(2131559234);
    this.s.setVisibility(8);
    this.q = new NewsAdapter.KxAdsAdapter(getActivity(), this.r, paramKxNewsVo, this.e);
    this.r.setAdapter(this.q);
    paramKxNewsVo = (CircleFlowIndicator)localRelativeLayout.findViewById(2131559236);
    this.r.setFlowIndicator(paramKxNewsVo);
    this.r.setOnItemClickListener(this);
    this.r.setFlogTouch(true);
    this.f.addHeaderView(localRelativeLayout);
    this.q.refresh(null);
    addAdvert(new md(this, 113));
    this.f.setAdapter(this.n);
  }
  
  public void b(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (lu.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
          } while (this.j != 4);
          if (this.m != null) {
            this.m.changeLookFace(paramy);
          }
        } while (this.f == null);
        this.f.setDivider(new ColorDrawable(getResources().getColor(2131493695)));
        this.f.setDividerHeight(1);
        return;
      } while (this.j != 4);
      if (this.m != null) {
        this.m.changeLookFace(paramy);
      }
    } while (this.f == null);
    this.f.setDivider(new ColorDrawable(getResources().getColor(2131493692)));
    this.f.setDividerHeight(1);
  }
  
  public View getScroolView()
  {
    return this.f;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    if (getActivity() == null) {}
    label258:
    int i1;
    label706:
    label832:
    do
    {
      for (;;)
      {
        return;
        if (paramh == this.v)
        {
          this.i.a();
          try
          {
            paramj = new String(((com.android.dazhihui.a.b.g)paramj).a(), "UTF-8");
            paramh = paramj;
            if (!paramj.startsWith("[")) {
              paramh = paramj.substring(1);
            }
            paramh = new JSONArray(paramh);
            paramh = (ArrayList)new k().a(paramh.getJSONObject(0).getJSONArray("data").toString(), new mc(this).getType());
            if (this.l) {
              this.A.a(this.g, paramh);
            }
            this.b.getXgfaList().addAll(paramh);
          }
          catch (Exception paramh)
          {
            for (;;)
            {
              paramh.printStackTrace();
              if (this.b.getXgfaList().size() == 0) {
                this.i.a("解析数据异常,点击重试!", new lr(this));
              } else {
                showShortToast("解析数据异常!");
              }
            }
          }
          this.b.notifyDataSetChanged();
          this.f.setSelection(0);
          return;
        }
        if (paramh == this.y)
        {
          paramh = (o)paramj;
          bool = Boolean.parseBoolean(this.y.j().toString());
          if (bool)
          {
            this.c.getMineStockNewsList().clear();
            this.D.a(true, 1);
            this.i.a();
            paramh = paramh.h().b;
            if ((paramh == null) || (paramh.length <= 0)) {
              continue;
            }
            paramj = new q(paramh);
          }
          try
          {
            i1 = (short)(paramh.length - 1);
            paramj.b();
            paramj = new JSONArray(new String(paramh, 1, i1)).getJSONObject(0);
            k localk = new k();
            paramh = (JsonHeader)localk.a(paramj.getJSONObject("header").toString(), JsonHeader.class);
            if ("1".equals(paramh.getError())) {
              Toast.makeText(getActivity(), getResources().getString(2131165394), 0).show();
            }
            if ((!"100".equals(paramh.getService())) || ("0".equals(paramh.getType())))
            {
              paramj = (ArrayList)localk.a(paramj.getJSONArray("data").toString(), new ls(this).getType());
              if ((paramj != null) && (paramj.size() > 0))
              {
                if ((paramh.getNext() != null) && (paramh.getNext().equals(""))) {}
                this.c.getMineStockNewsList().addAll(paramj);
                if ((this.l) && (bool)) {
                  this.A.a(this.g, this.c.getMineStockNewsList());
                }
                this.c.notifyDataSetChanged();
                if (!bool) {
                  continue;
                }
                this.f.setSelection(0);
              }
            }
          }
          catch (JSONException paramh)
          {
            paramh.printStackTrace();
            if (this.c.getMineStockNewsList().size() == 0)
            {
              this.i.setPageError("解析数据异常!");
              return;
              this.D.b();
              break label258;
              this.i.setPageTip(getResources().getString(2131165395));
              return;
            }
          }
          catch (Exception paramh)
          {
            paramh.printStackTrace();
            if (this.c.getMineStockNewsList().size() == 0)
            {
              this.i.setPageError("解析数据异常!");
              return;
              showShortToast("解析数据异常!");
              return;
            }
            showShortToast("解析数据异常!");
            return;
          }
        }
      }
      if (paramh == this.w)
      {
        this.i.a();
        paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
        bool = Boolean.parseBoolean(this.w.j().toString());
        if (bool)
        {
          this.a.getmDataVo().clear();
          this.D.a(true, 1);
          this.a.getmDataVo().decode(paramh);
          if ((bool) && (this.l)) {
            this.A.a(this.g, this.a.getmDataVo());
          }
          if (bool)
          {
            this.p.refresh(null);
            if (this.p.getCount() <= 0) {
              break label832;
            }
            this.s.setVisibility(0);
          }
        }
        for (;;)
        {
          this.a.notifyDataSetChanged();
          if (bool) {
            this.f.setSelection(0);
          }
          if (!this.a.getmDataVo().isLast(this.a.getmDataVo().getCurrentUrl())) {
            break;
          }
          return;
          this.D.b();
          break label706;
          this.s.setVisibility(8);
        }
      }
      if (paramh == this.x)
      {
        this.i.a();
        paramh = new String(((com.android.dazhihui.a.b.g)paramj).a());
        bool = Boolean.parseBoolean(this.x.j().toString());
        if (bool)
        {
          this.m.getmStockNewsVo().getNews().clear();
          this.D.a(true, 1);
        }
        for (;;)
        {
          if ((bool) && (this.u))
          {
            this.u = false;
            if ((getActivity() != null) && ((getActivity() instanceof StockChartScreen))) {
              ((StockChartScreen)getActivity()).a().d(true);
            }
          }
          this.m.getmStockNewsVo().decode(paramh);
          if ((bool) && (this.l)) {
            this.A.a(this.g, this.m.getmStockNewsVo());
          }
          this.m.notifyDataSetChanged();
          if (bool) {
            this.f.setSelection(0);
          }
          if (!this.m.getmStockNewsVo().isLastPage()) {
            break;
          }
          return;
          this.D.b();
        }
      }
    } while (paramh != this.z);
    paramh = (o)paramj;
    boolean bool = Boolean.parseBoolean(this.z.j().toString());
    if (bool)
    {
      this.n.getKxNewsVo().data.clear();
      this.D.a(true, 1);
      label1104:
      this.i.a();
    }
    for (;;)
    {
      try
      {
        paramh = paramh.h().b;
        paramj = new q(paramh);
        i1 = (short)(paramh.length - 1);
        paramj.b();
        paramh = KxNewsVo.decode(new String(paramh, 1, i1));
        if (paramh == null) {
          break label1334;
        }
        this.n.getKxNewsVo().header = paramh.header;
        this.n.getKxNewsVo().data.addAll(paramh.data);
        if ((!TextUtils.isEmpty(this.n.getKxNewsVo().header.next)) || ((this.l) && (bool))) {
          this.A.a(this.g, this.n.getKxNewsVo());
        }
        if (bool)
        {
          this.q.refresh(null);
          if (this.q.getCount() <= 0) {
            break label1373;
          }
          this.s.setVisibility(0);
        }
        this.n.notifyDataSetChanged();
        if (!bool) {
          break;
        }
        this.f.setSelection(0);
        return;
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        if (this.n.getKxNewsVo().data.size() != 0) {
          break label1385;
        }
      }
      this.i.setPageError("解析数据异常!");
      return;
      this.D.b();
      break label1104;
      label1334:
      if (this.n.getKxNewsVo().data.size() == 0)
      {
        this.i.setPageError("解析数据异常!");
      }
      else
      {
        showShortToast("解析数据异常!");
        continue;
        label1373:
        this.s.setVisibility(8);
      }
    }
    label1385:
    showShortToast("解析数据异常!");
  }
  
  public void handleTimeout(h paramh)
  {
    if (Boolean.parseBoolean(paramh.j().toString()))
    {
      this.D.a(false, 2);
      if (paramh != this.v) {
        break label73;
      }
      if (this.b.getXgfaList().size() != 0) {
        break label65;
      }
      c("数据请求超时,点击重试!");
    }
    label65:
    label73:
    label261:
    label263:
    do
    {
      for (;;)
      {
        return;
        this.D.b();
        break;
        showShortToast("数据请求超时!");
        return;
        if (paramh == this.y)
        {
          if (this.c.getMineStockNewsList().size() == 0)
          {
            c("数据请求超时,点击重试!");
            return;
          }
          showShortToast("数据请求超时!");
          return;
        }
        if (paramh == this.w)
        {
          if ((this.a.getmDataVo().getDataList() == null) || (this.a.getmDataVo().getDataList().size() == 0))
          {
            c("数据请求超时,点击重试!");
            return;
          }
          showShortToast("数据请求超时!");
          return;
        }
        if (paramh != this.x) {
          break label263;
        }
        if ((this.m.getmStockNewsVo().getNews() == null) || (this.m.getmStockNewsVo().getNews().size() == 0)) {
          c("数据请求超时,点击重试!");
        }
        for (;;)
        {
          if (!this.u) {
            break label261;
          }
          this.u = false;
          if ((getActivity() == null) || (!(getActivity() instanceof StockChartScreen))) {
            break;
          }
          ((StockChartScreen)getActivity()).a().d(false);
          return;
          showShortToast("数据请求超时!");
        }
      }
    } while (paramh != this.z);
    if (this.n.getKxNewsVo().data.size() == 0)
    {
      c("数据请求超时,点击重试!");
      return;
    }
    showShortToast("数据请求超时!");
  }
  
  public void loadMoreData()
  {
    if (this.j == 1) {
      a(this.a.getmDataVo().getNextUrl(), false);
    }
    do
    {
      return;
      if ((this.j == 2) || (this.j == 6))
      {
        this.k = String.valueOf(Integer.parseInt(this.k) + 1);
        a(this.k, false);
        return;
      }
    } while (this.j != 4);
    a(this.m.getmStockNewsVo().getNextPage(), false);
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (Boolean.parseBoolean(paramh.j().toString()))
    {
      this.D.a(false, 2);
      if (paramh != this.v) {
        break label77;
      }
      if (this.b.getXgfaList().size() != 0) {
        break label67;
      }
      c(a(true));
    }
    label67:
    label77:
    label277:
    label279:
    do
    {
      for (;;)
      {
        return;
        this.D.b();
        break;
        showShortToast(a(false));
        return;
        if (paramh == this.y)
        {
          if (this.c.getMineStockNewsList().size() == 0)
          {
            c(a(true));
            return;
          }
          showShortToast(a(false));
          return;
        }
        if (paramh == this.w)
        {
          if ((this.a.getmDataVo().getDataList() == null) || (this.a.getmDataVo().getDataList().size() == 0))
          {
            c(a(true));
            return;
          }
          showShortToast(a(false));
          return;
        }
        if (paramh != this.x) {
          break label279;
        }
        if ((this.m.getmStockNewsVo().getNews() == null) || (this.m.getmStockNewsVo().getNews().size() == 0)) {
          c(a(true));
        }
        for (;;)
        {
          if (!this.u) {
            break label277;
          }
          this.u = false;
          if ((getActivity() == null) || (!(getActivity() instanceof StockChartScreen))) {
            break;
          }
          ((StockChartScreen)getActivity()).a().d(false);
          return;
          showShortToast(a(false));
        }
      }
    } while (paramh != this.z);
    if (this.n.getKxNewsVo().data.size() == 0)
    {
      c(a(true));
      return;
    }
    showShortToast(a(false));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.A = DzhApplication.a().b();
    if (getArguments() != null)
    {
      this.j = getArguments().getInt("type");
      this.k = getArguments().getString("firstUrl");
      if ((this.j == 2) || (this.j == 6)) {
        this.k = String.valueOf(1);
      }
      this.g = getArguments().getString("titleName");
      this.l = getArguments().getBoolean("isNeedCache");
      this.h = getArguments().getString("stockCode");
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.o = paramLayoutInflater;
    paramLayoutInflater = paramLayoutInflater.inflate(2130903344, paramViewGroup, false);
    if (this.j == 4) {
      paramLayoutInflater.setBackgroundColor(getResources().getColor(17170445));
    }
    a(paramLayoutInflater);
    changeLookFace(this.mLookFace);
    return paramLayoutInflater;
  }
  
  public void onDestroyView()
  {
    super.onDestroyView();
    this.t = false;
    this.B = false;
  }
  
  public void onFragmentChanged(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      if (this.t) {
        break label26;
      }
      this.B = false;
      a(this.k, true);
    }
    label26:
    while (!this.B) {
      return;
    }
    this.B = false;
    refresh();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i1 = 0;
    String str;
    Object localObject;
    if (paramAdapterView == this.f)
    {
      i1 = paramInt - this.f.getHeaderViewsCount();
      if (this.j == 3)
      {
        paramAdapterView = new Intent(getActivity(), NewsXgfxDetailScreen.class);
        paramAdapterView.putExtra("DETAIL_JSON", ((NewsXgfxVo)this.b.getXgfaList().get(i1)).getUrl());
        startActivity(paramAdapterView);
        return;
      }
      if (this.j == 2)
      {
        paramView = (JsonNewsItem)this.c.getMineStockNewsList().get(i1);
        paramAdapterView = paramView.getUrl();
        str = paramView.getType();
        paramAdapterView = paramAdapterView.substring(paramAdapterView.indexOf("wap"), paramAdapterView.length());
        localObject = "http://mnews.gw.com.cn/" + paramAdapterView;
        paramAdapterView = "";
        if (str.equals("1")) {
          paramAdapterView = getResources().getString(2131165992);
        }
        for (;;)
        {
          if (!a(paramView.getId()))
          {
            b(paramView.getId());
            this.c.notifyDataSetChanged();
          }
          if ((paramView.getId() != null) && (!paramView.getId().isEmpty())) {
            n.a(paramView.getId(), 0);
          }
          NewsDetailInfo.a(getActivity(), (String)localObject, paramView.getId(), paramView.getTitle(), paramAdapterView, "", "", "", paramView.getAdvTypeShare());
          return;
          if (str.equals("2")) {
            paramAdapterView = getResources().getString(2131165993);
          } else if (str.equals("3")) {
            paramAdapterView = getResources().getString(2131165990);
          } else if (str.equals("4")) {
            paramAdapterView = getResources().getString(2131165989);
          } else if (str.equals("5")) {
            paramAdapterView = getResources().getString(2131165994);
          }
        }
      }
      if (this.j == 1)
      {
        localObject = (NewsVo)this.a.getmDataVo().getDataList().get(i1);
        paramAdapterView = ((NewsVo)localObject).getUrl();
        if (!a(((NewsVo)localObject).getId()))
        {
          b(((NewsVo)localObject).getId());
          this.a.notifyDataSetChanged();
        }
        paramView = ((NewsVo)localObject).getCountId();
        localObject = ((NewsVo)localObject).getId();
        if (((paramView != null) && (!paramView.isEmpty())) || ((localObject != null) && (!((String)localObject).isEmpty()))) {
          if ((paramView == null) || (paramView.isEmpty())) {
            break label1126;
          }
        }
      }
    }
    label1126:
    for (paramInt = Integer.parseInt(paramView);; paramInt = 0)
    {
      n.a((String)localObject, paramInt);
      if (paramAdapterView.endsWith(".json"))
      {
        paramView = (NewsVo)this.a.getmDataVo().getDataList().get(i1);
        NewsDetailInfo.a(getActivity(), paramAdapterView, (String)localObject, paramView.getTitle(), this.g, paramView.getOrigins(), paramView.getContent(), "", paramView.getAdvTypeShare());
        return;
      }
      paramView = new Intent(getActivity(), BrowserActivity.class);
      localObject = new Bundle();
      ((Bundle)localObject).putString("nexturl", paramAdapterView);
      ((Bundle)localObject).putString("names", this.g);
      paramView.putExtras((Bundle)localObject);
      startActivity(paramView);
      return;
      if (this.j != 4) {
        break;
      }
      paramView = (StockNewItem)this.m.getmStockNewsVo().getNews().get(i1);
      localObject = paramView.getUrl();
      if (!a(paramView.getId()))
      {
        b(paramView.getId());
        this.m.notifyDataSetChanged();
      }
      str = String.valueOf(paramView.getType());
      paramAdapterView = "";
      if (str.equals("1")) {
        paramAdapterView = getResources().getString(2131165992);
      }
      for (;;)
      {
        NewsDetailInfo.a(getActivity(), (String)localObject, paramView.getId(), paramView.getTitle(), paramAdapterView, paramView.getSource(), paramView.getSummary(), this.h, paramView.getAdvTypeShare());
        return;
        if (str.equals("2")) {
          paramAdapterView = getResources().getString(2131165993);
        } else if (str.equals("3")) {
          paramAdapterView = getResources().getString(2131165990);
        } else if (str.equals("4")) {
          paramAdapterView = getResources().getString(2131165989);
        } else if (str.equals("5")) {
          paramAdapterView = getResources().getString(2131165994);
        }
      }
      if (paramAdapterView != this.r) {
        break;
      }
      if (this.j == 6)
      {
        paramAdapterView = (KxNewsVo.KxItem)this.q.getItem(paramInt);
        if (paramAdapterView.isAdvert)
        {
          com.android.dazhihui.d.r.a(paramAdapterView.url, getActivity(), String.valueOf(paramAdapterView.countid), null);
          return;
        }
        if (paramAdapterView.url.endsWith(".json"))
        {
          NewsDetailInfo.a(getActivity(), paramAdapterView.url, paramAdapterView.id, paramAdapterView.title, this.g, paramAdapterView.source, "", "", paramAdapterView.advTypeShare);
          return;
        }
        paramView = new Intent(getActivity(), BrowserActivity.class);
        localObject = new Bundle();
        ((Bundle)localObject).putString("nexturl", paramAdapterView.url);
        ((Bundle)localObject).putString("names", this.g);
        paramView.putExtras((Bundle)localObject);
        getActivity().startActivity(paramView);
        return;
      }
      paramAdapterView = (NewsVo)this.p.getItem(paramInt);
      if (paramAdapterView.isAdvert())
      {
        com.android.dazhihui.d.r.a(paramAdapterView.getUrl(), getActivity(), paramAdapterView.getCountId(), null);
        return;
      }
      paramView = paramAdapterView.getCountId();
      localObject = paramAdapterView.getId();
      if (((paramView != null) && (!paramView.isEmpty())) || ((localObject != null) && (!((String)localObject).isEmpty())))
      {
        paramInt = i1;
        if (paramView != null)
        {
          paramInt = i1;
          if (!paramView.isEmpty()) {
            paramInt = Integer.parseInt(paramView);
          }
        }
        n.a((String)localObject, paramInt);
      }
      NewsDetailInfo.a(getActivity(), paramAdapterView.getUrl(), (String)localObject, paramAdapterView.getTitle(), this.g, paramAdapterView.getOrigins(), "", "", paramAdapterView.getAdvTypeShare());
      return;
    }
  }
  
  public void onPulledrefresh(boolean paramBoolean)
  {
    super.onPulledrefresh(paramBoolean);
    this.u = paramBoolean;
    refresh();
  }
  
  public void onResume()
  {
    super.onResume();
    if ((this.j == 2) && (getUserVisibleHint())) {
      refresh();
    }
  }
  
  public void refresh()
  {
    if ((this.j == 2) || (this.j == 6)) {
      this.k = "1";
    }
    a(this.k, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\lp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */