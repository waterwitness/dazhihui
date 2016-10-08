package com.android.dazhihui.ui.delegate.newtrade;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.a.b.k;
import com.android.dazhihui.a.b.l;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.b.g;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.newtrade.a.a;
import com.android.dazhihui.ui.delegate.newtrade.widge.CaptialPeriodSelector;
import com.android.dazhihui.ui.delegate.newtrade.widge.d;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class h
  extends com.android.dazhihui.ui.delegate.newtrade.screen.b
  implements View.OnClickListener, d
{
  private View a = null;
  private TextView d;
  private LinearLayout e;
  private LinearLayout f;
  private TextView g;
  private TextView h;
  private CaptialPeriodSelector i;
  private ListView j;
  private int k = 0;
  private List<com.android.dazhihui.ui.delegate.newtrade.b.b> l = new ArrayList();
  private int m = 0;
  private String n;
  private String o;
  private LayoutInflater p;
  private j q;
  private k r = null;
  
  private void b(int paramInt)
  {
    this.m = paramInt;
    switch (this.m)
    {
    }
    for (;;)
    {
      f();
      b();
      return;
      this.g.setTextColor(getResources().getColor(2131492962));
      this.g.setBackgroundResource(2130837571);
      this.h.setTextColor(getResources().getColor(2131492964));
      this.h.setBackgroundResource(2131492954);
      this.d.setText(getResources().getString(2131166273));
      continue;
      this.g.setTextColor(getResources().getColor(2131492964));
      this.g.setBackgroundResource(2131492954);
      this.h.setTextColor(getResources().getColor(2131492962));
      this.h.setBackgroundResource(2130837571);
      this.d.setText(getResources().getString(2131166272));
    }
  }
  
  private void c()
  {
    this.e = ((LinearLayout)this.a.findViewById(2131560479));
    this.f = ((LinearLayout)this.a.findViewById(2131560480));
    this.d = ((TextView)this.a.findViewById(2131558534));
    this.g = ((TextView)this.a.findViewById(2131559774));
    this.h = ((TextView)this.a.findViewById(2131560481));
    this.i = ((CaptialPeriodSelector)this.a.findViewById(2131558650));
    this.j = ((ListView)this.a.findViewById(2131560485));
  }
  
  private void d()
  {
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.i.setCaptialPeriodSelectorListener(this);
    this.j.setOnItemClickListener(new i(this));
  }
  
  private void e()
  {
    this.p = LayoutInflater.from(getContext());
    this.q = new j(this);
    this.j.setAdapter(this.q);
    g();
  }
  
  private void f()
  {
    if (this.j != null) {
      this.j.setBackgroundResource(2131492954);
    }
    this.l.clear();
    if (this.q != null) {
      this.q.notifyDataSetChanged();
    }
  }
  
  private void g()
  {
    Object localObject = new SimpleDateFormat("yyyyMMdd");
    Calendar localCalendar1 = Calendar.getInstance();
    Calendar localCalendar2 = Calendar.getInstance();
    switch (this.k)
    {
    }
    for (;;)
    {
      localCalendar2.set(5, localCalendar2.getActualMaximum(5));
      this.o = ((SimpleDateFormat)localObject).format(localCalendar2.getTime());
      localObject = o.y();
      localObject = this.n.substring(4, 6) + "月" + this.n.substring(6) + "日-" + ((String)localObject).substring(4, 6) + "月" + ((String)localObject).substring(6) + "日";
      ((CaptialAnalMainScreen)getActivity()).a("股票分析", (String)localObject);
      f();
      b();
      return;
      localCalendar1.add(2, 0);
      localCalendar1.set(5, 1);
      this.n = ((SimpleDateFormat)localObject).format(localCalendar1.getTime());
      continue;
      localCalendar1.add(2, -1);
      localCalendar1.set(5, 1);
      this.n = ((SimpleDateFormat)localObject).format(localCalendar1.getTime());
      continue;
      localCalendar1.add(2, -2);
      localCalendar1.set(5, 1);
      this.n = ((SimpleDateFormat)localObject).format(localCalendar1.getTime());
      continue;
      localCalendar1.add(2, -5);
      localCalendar1.set(5, 1);
      this.n = ((SimpleDateFormat)localObject).format(localCalendar1.getTime());
      continue;
      localCalendar1.add(2, -11);
      localCalendar1.set(5, 1);
      this.n = ((SimpleDateFormat)localObject).format(localCalendar1.getTime());
    }
  }
  
  public void a()
  {
    if ((this.l == null) || (this.l.size() == 0)) {
      g();
    }
  }
  
  public void a(int paramInt)
  {
    this.k = paramInt;
    g();
  }
  
  public void b()
  {
    com.android.dazhihui.ui.delegate.b.h localh = a.a("18810");
    localh.a("1022", this.n).a("1023", this.o).a("1206", "").a("1277", "").a("1026", this.m);
    this.r = new k(new com.android.dazhihui.ui.delegate.newtrade.a.b[] { new com.android.dazhihui.ui.delegate.newtrade.a.b(localh.i()) });
    registRequestListener(this.r);
    a(this.r, true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((l)paramj).b();
    if (com.android.dazhihui.ui.delegate.newtrade.a.b.a(paramj, getActivity()))
    {
      g.b(paramj.d());
      paramj = com.android.dazhihui.ui.delegate.b.h.a(paramj.d());
      if (paramh == this.r)
      {
        if (paramj.b()) {
          break label65;
        }
        showShortToast(paramj.d());
      }
    }
    return;
    label65:
    int i2 = paramj.g();
    int i1;
    label89:
    com.android.dazhihui.ui.delegate.newtrade.b.b localb;
    if (i2 == 0)
    {
      this.j.setBackgroundResource(2130838490);
      i1 = 0;
      if (i1 >= i2) {
        break label238;
      }
      localb = new com.android.dazhihui.ui.delegate.newtrade.b.b();
      localb.a = paramj.a(i1, "1036");
      if (paramj.a(i1, "1037") != null) {
        break label225;
      }
    }
    label225:
    for (paramh = "";; paramh = paramj.a(i1, "1037"))
    {
      localb.b = paramh;
      localb.c = paramj.a(i1, "3104");
      localb.d = paramj.a(i1, "1894");
      localb.e = paramj.a(i1, "9030");
      localb.f = n.t(paramj.a(i1, "1003"));
      this.l.add(localb);
      i1 += 1;
      break label89;
      this.j.setBackgroundResource(2131492954);
      break;
    }
    label238:
    this.q.notifyDataSetChanged();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        return;
      } while (this.m == 0);
      b(0);
      return;
    } while (this.m == 1);
    b(1);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    super.onCreateView(paramLayoutInflater, paramViewGroup, paramBundle);
    this.a = paramLayoutInflater.inflate(2130903434, paramViewGroup, false);
    c();
    d();
    e();
    return this.a;
  }
  
  public void show()
  {
    super.show();
    if (this.a != null) {
      g();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */