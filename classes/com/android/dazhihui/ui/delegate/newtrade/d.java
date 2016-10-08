package com.android.dazhihui.ui.delegate.newtrade;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.android.dazhihui.a.b.l;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.g;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.newtrade.widge.CaptialAnalPeriodOperation;
import com.android.dazhihui.ui.delegate.newtrade.widge.CaptialAnalPeriodStock;
import com.android.dazhihui.ui.delegate.newtrade.widge.CaptialAnalPeriodTrend;
import com.android.dazhihui.ui.delegate.newtrade.widge.CaptialPeriodSelector;
import com.android.dazhihui.ui.delegate.newtrade.widge.NormalScrollView;
import com.android.dazhihui.ui.delegate.newtrade.widge.UpdateHeaderView;
import com.android.dazhihui.ui.delegate.newtrade.widge.c;
import com.android.dazhihui.ui.delegate.newtrade.widge.m;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

public class d
  extends com.android.dazhihui.ui.delegate.newtrade.screen.b
  implements com.android.dazhihui.ui.delegate.newtrade.widge.b, c, com.android.dazhihui.ui.delegate.newtrade.widge.d, com.android.dazhihui.ui.delegate.newtrade.widge.j, m
{
  private View a = null;
  private NormalScrollView d;
  private UpdateHeaderView e;
  private CaptialPeriodSelector f;
  private CaptialAnalPeriodTrend g;
  private CaptialAnalPeriodStock h;
  private CaptialAnalPeriodOperation i;
  private int j = 0;
  private int k;
  private String l;
  private String m;
  private List<com.android.dazhihui.ui.delegate.newtrade.b.a> n = new ArrayList();
  private List<com.android.dazhihui.ui.delegate.newtrade.b.b> o = new ArrayList();
  private boolean p = false;
  private boolean q = false;
  private Animation r;
  private com.android.dazhihui.a.b.k s = null;
  private com.android.dazhihui.a.b.k t = null;
  private com.android.dazhihui.a.b.k u = null;
  private com.android.dazhihui.a.b.k v = null;
  private com.android.dazhihui.a.b.k w = null;
  
  private void k()
  {
    this.d = ((NormalScrollView)this.a.findViewById(2131558651));
    this.e = ((UpdateHeaderView)this.a.findViewById(2131558649));
    this.f = ((CaptialPeriodSelector)this.a.findViewById(2131558650));
    this.g = ((CaptialAnalPeriodTrend)this.a.findViewById(2131558652));
    this.h = ((CaptialAnalPeriodStock)this.a.findViewById(2131558653));
    this.i = ((CaptialAnalPeriodOperation)this.a.findViewById(2131558654));
  }
  
  private void l()
  {
    this.d.setScrollViewListener(this);
    this.e.setRefreshListener(this);
    this.f.setCaptialPeriodSelectorListener(this);
    this.h.setStockRankingTypeListener(this);
    this.h.setGotoStockAnalysisFragmentListenr(this);
  }
  
  private void n()
  {
    this.g.setDataType(this.j);
    this.h.setDataType(this.j);
    this.r = new e(this, 0.0F, 0.0F, 0.0F, -getResources().getDimensionPixelOffset(2131230749));
    this.r.setDuration(500L);
    this.r.setFillAfter(true);
    this.g.setParentScroll(this.d);
    this.d.setView(this.g.getTrendView());
  }
  
  private void o()
  {
    this.n.clear();
    this.o.clear();
    Object localObject2 = new SimpleDateFormat("yyyyMMdd");
    Calendar localCalendar2 = Calendar.getInstance();
    Calendar localCalendar1 = Calendar.getInstance();
    Object localObject1 = null;
    switch (this.j)
    {
    }
    for (;;)
    {
      localCalendar1.set(5, localCalendar1.getActualMaximum(5));
      this.m = ((SimpleDateFormat)localObject2).format(localCalendar1.getTime());
      p();
      if ((com.android.dazhihui.ui.delegate.newtrade.a.a.e != null) && (n.i(com.android.dazhihui.ui.delegate.newtrade.a.a.e, o.y()).intValue() >= 0)) {
        break;
      }
      com.android.dazhihui.ui.delegate.newtrade.a.a.b();
      d();
      return;
      localCalendar2.add(2, 0);
      localCalendar2.set(5, 1);
      this.l = ((SimpleDateFormat)localObject2).format(localCalendar2.getTime());
      localObject1 = com.android.dazhihui.ui.delegate.newtrade.a.a.f;
      continue;
      localCalendar2.add(2, -1);
      localCalendar2.set(5, 1);
      this.l = ((SimpleDateFormat)localObject2).format(localCalendar2.getTime());
      localObject1 = com.android.dazhihui.ui.delegate.newtrade.a.a.g;
      continue;
      localCalendar2.add(2, -2);
      localCalendar2.set(5, 1);
      this.l = ((SimpleDateFormat)localObject2).format(localCalendar2.getTime());
      localObject1 = com.android.dazhihui.ui.delegate.newtrade.a.a.h;
      continue;
      localCalendar2.add(2, -5);
      localCalendar2.set(5, 1);
      this.l = ((SimpleDateFormat)localObject2).format(localCalendar2.getTime());
      localObject1 = com.android.dazhihui.ui.delegate.newtrade.a.a.i;
      continue;
      localCalendar2.add(2, -11);
      localCalendar2.set(5, 1);
      this.l = ((SimpleDateFormat)localObject2).format(localCalendar2.getTime());
      localObject1 = com.android.dazhihui.ui.delegate.newtrade.a.a.j;
    }
    if ((localObject1 == null) || (((List)localObject1).size() == 0))
    {
      d();
      return;
    }
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.android.dazhihui.ui.delegate.newtrade.b.a)((Iterator)localObject1).next();
      this.n.add(localObject2);
    }
    this.g.setReturnRate(this.n);
    e();
  }
  
  private void p()
  {
    if (this.q)
    {
      String str = o.y();
      str = this.l.substring(4, 6) + "月" + this.l.substring(6) + "日-" + str.substring(4, 6) + "月" + str.substring(6) + "日";
      ((CaptialAnalMainScreen)getActivity()).a("资产分析", str);
      return;
    }
    ((CaptialAnalMainScreen)getActivity()).a("资产分析", null);
  }
  
  public void a()
  {
    if (!this.p)
    {
      b();
      return;
    }
    o();
  }
  
  public void a(int paramInt)
  {
    if (this.j == paramInt) {
      return;
    }
    this.j = paramInt;
    this.g.setDataType(this.j);
    this.h.setDataType(this.j);
    o();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > getResources().getDimensionPixelOffset(2131230800)) && (this.l != null) && (this.l.length() >= 8)) {
      if ((getActivity() instanceof CaptialAnalMainScreen))
      {
        this.q = true;
        p();
      }
    }
    while (!(getActivity() instanceof CaptialAnalMainScreen)) {
      return;
    }
    this.q = false;
    p();
  }
  
  public void a(com.android.dazhihui.ui.delegate.newtrade.b.b paramb, int paramInt)
  {
    ((f)getParentFragment()).a(paramb, paramInt, this.j);
  }
  
  public void b()
  {
    this.s = new com.android.dazhihui.a.b.k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(com.android.dazhihui.ui.delegate.newtrade.a.a.a("18804").a("1030", com.android.dazhihui.ui.delegate.c.d.b).i()) });
    registRequestListener(this.s);
    a(this.s, false);
  }
  
  public void b(int paramInt)
  {
    this.k = paramInt;
    this.o.clear();
    e();
  }
  
  public void c()
  {
    this.t = new com.android.dazhihui.a.b.k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(com.android.dazhihui.ui.delegate.newtrade.a.a.a("18806").i()) });
    registRequestListener(this.t);
    a(this.t, false);
  }
  
  public void d()
  {
    this.g.setReturnRate(new ArrayList());
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.newtrade.a.a.a("18808");
    localh.a("1022", this.l).a("1023", this.m).a("1206", "").a("1277", "");
    this.u = new com.android.dazhihui.a.b.k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(localh.i()) });
    registRequestListener(this.u);
    a(this.u, true);
  }
  
  public void e()
  {
    this.h.setStockRank(null);
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.newtrade.a.a.a("18810");
    localh.a("1022", this.l).a("1023", this.m).a("1026", this.k).a("1277", "").a("1206", "");
    this.v = new com.android.dazhihui.a.b.k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(localh.i()) });
    registRequestListener(this.v);
    a(this.v, true);
  }
  
  public void f()
  {
    this.i.a(0.0F, 0.0F, 0.0F);
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.newtrade.a.a.a("18814");
    localh.a("1022", this.l).a("1023", this.m);
    this.w = new com.android.dazhihui.a.b.k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(localh.i()) });
    registRequestListener(this.w);
    a(this.w, true);
  }
  
  public void g()
  {
    if (this.a != null) {
      this.a.startAnimation(this.r);
    }
  }
  
  public void h()
  {
    ((f)getParentFragment()).a(1);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    int i1 = 0;
    super.handleResponse(paramh, paramj);
    paramj = ((l)paramj).b();
    if (com.android.dazhihui.ui.delegate.newtrade.a.b.a(paramj, getActivity()))
    {
      g.b(paramj.d());
      localObject = com.android.dazhihui.ui.delegate.b.h.a(paramj.d());
      if (paramh != this.s) {
        break label93;
      }
      if (((com.android.dazhihui.ui.delegate.b.h)localObject).b()) {
        break label82;
      }
      paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject).d();
      this.p = true;
      this.e.a(paramh);
      o();
    }
    label82:
    label93:
    do
    {
      return;
      paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject).a("1208");
      break;
      if (paramh == this.t)
      {
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
        {
          showShortToast(((com.android.dazhihui.ui.delegate.b.h)localObject).d());
          return;
        }
        paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject).a("3084");
        localObject = ((com.android.dazhihui.ui.delegate.b.h)localObject).a("1215");
        if ((paramh != null) && (paramh.equals("1")))
        {
          this.p = true;
          paramj = this.e;
          if (localObject != null) {}
          for (paramh = ((String)localObject).trim();; paramh = "")
          {
            paramj.a(paramh);
            o();
            return;
          }
        }
        if ((paramh != null) && (paramh.equals("0")) && (localObject != null) && (((String)localObject).trim().equals("0")))
        {
          b();
          paramh = new com.android.dazhihui.ui.widget.k();
          paramh.b("初次加载数据，数据分析时间可能稍长，请耐心等待。");
          paramh.b("恩，我知道了", null);
          paramh.a(getActivity());
          return;
        }
        b();
        return;
      }
      int i2;
      if (paramh == this.u)
      {
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
        {
          showShortToast(((com.android.dazhihui.ui.delegate.b.h)localObject).d());
          e();
          return;
        }
        i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
        while (i1 < i2)
        {
          paramh = new com.android.dazhihui.ui.delegate.newtrade.b.a();
          paramh.a = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "1215");
          paramh.b = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "2378");
          paramh.c = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "2390");
          paramh.d = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "2251");
          this.n.add(paramh);
          i1 += 1;
        }
        switch (this.j)
        {
        }
        for (;;)
        {
          com.android.dazhihui.ui.delegate.newtrade.a.a.e = o.y();
          this.g.setReturnRate(this.n);
          e();
          return;
          com.android.dazhihui.ui.delegate.newtrade.a.a.f = new ArrayList();
          paramh = this.n.iterator();
          while (paramh.hasNext())
          {
            paramj = (com.android.dazhihui.ui.delegate.newtrade.b.a)paramh.next();
            com.android.dazhihui.ui.delegate.newtrade.a.a.f.add(paramj);
          }
          com.android.dazhihui.ui.delegate.newtrade.a.a.g = new ArrayList();
          paramh = this.n.iterator();
          while (paramh.hasNext())
          {
            paramj = (com.android.dazhihui.ui.delegate.newtrade.b.a)paramh.next();
            com.android.dazhihui.ui.delegate.newtrade.a.a.g.add(paramj);
          }
          com.android.dazhihui.ui.delegate.newtrade.a.a.h = new ArrayList();
          paramh = this.n.iterator();
          while (paramh.hasNext())
          {
            paramj = (com.android.dazhihui.ui.delegate.newtrade.b.a)paramh.next();
            com.android.dazhihui.ui.delegate.newtrade.a.a.h.add(paramj);
          }
          com.android.dazhihui.ui.delegate.newtrade.a.a.i = new ArrayList();
          paramh = this.n.iterator();
          while (paramh.hasNext())
          {
            paramj = (com.android.dazhihui.ui.delegate.newtrade.b.a)paramh.next();
            com.android.dazhihui.ui.delegate.newtrade.a.a.i.add(paramj);
          }
          com.android.dazhihui.ui.delegate.newtrade.a.a.j = new ArrayList();
          paramh = this.n.iterator();
          while (paramh.hasNext())
          {
            paramj = (com.android.dazhihui.ui.delegate.newtrade.b.a)paramh.next();
            com.android.dazhihui.ui.delegate.newtrade.a.a.j.add(paramj);
          }
        }
      }
      if (paramh == this.v)
      {
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
        {
          showShortToast(((com.android.dazhihui.ui.delegate.b.h)localObject).d());
          f();
          return;
        }
        i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject).g();
        i1 = 0;
        if (i1 < i2)
        {
          paramj = new com.android.dazhihui.ui.delegate.newtrade.b.b();
          paramj.a = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "1036");
          if (((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "1037") == null) {}
          for (paramh = "";; paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "1037"))
          {
            paramj.b = paramh;
            paramj.c = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "3104");
            paramj.d = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "1894");
            paramj.f = n.t(((com.android.dazhihui.ui.delegate.b.h)localObject).a(i1, "1003"));
            this.o.add(paramj);
            i1 += 1;
            break;
          }
        }
        this.h.setStockRank(this.o);
        f();
        return;
      }
    } while (paramh != this.w);
    if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
    {
      showShortToast(((com.android.dazhihui.ui.delegate.b.h)localObject).d());
      return;
    }
    if (((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "9030") == null)
    {
      paramh = "0";
      if (((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "9031") != null) {
        break label976;
      }
      paramj = "0";
      label929:
      if (((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "9032") != null) {
        break label988;
      }
    }
    label976:
    label988:
    for (Object localObject = "0";; localObject = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "9032"))
    {
      this.i.a(n.w(paramh), n.w(paramj), n.w((String)localObject));
      return;
      paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "9030");
      break;
      paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "9031");
      break label929;
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if ((this.t == paramh) || (this.s == paramh)) {
      b();
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if ((this.t == paramh) || (this.s == paramh)) {
      b();
    }
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    this.a = paramLayoutInflater.inflate(2130903068, paramViewGroup, false);
    k();
    l();
    n();
    this.e.b();
    c();
    return this.a;
  }
  
  public void show()
  {
    super.show();
    if (this.a != null) {
      p();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */