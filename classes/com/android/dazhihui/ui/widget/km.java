package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import java.util.ArrayList;
import java.util.List;

public class km
  implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener
{
  private static final String d = km.class.getSimpleName();
  public List<List<ht>> a = new ArrayList();
  View b;
  Handler c = new ko(this);
  private Context e;
  private View f;
  private ViewPager g;
  private LinearLayout h;
  private LayoutInflater i;
  private int j = 23;
  private List<ht> k = new ArrayList();
  private ArrayList<View> l;
  private List<do> m;
  private int n = 0;
  private ArrayList<ImageView> o;
  private kp p;
  
  public km(Context paramContext, View paramView)
  {
    this.e = paramContext;
    this.i = LayoutInflater.from(this.e);
    this.f = paramView;
    this.g = ((ViewPager)this.f.findViewById(2131560390));
    this.h = ((LinearLayout)this.f.findViewById(2131560391));
    e();
    a();
  }
  
  private void a()
  {
    b();
    c();
    d();
  }
  
  private List<ht> b(int paramInt)
  {
    int i2 = paramInt * this.j;
    int i1 = this.j + i2;
    paramInt = i1;
    if (i1 > this.k.size()) {
      paramInt = this.k.size();
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(this.k.subList(i2, paramInt));
    if (localArrayList.size() < this.j)
    {
      paramInt = localArrayList.size();
      while (paramInt < this.j)
      {
        localArrayList.add(new ht());
        paramInt += 1;
      }
    }
    if (localArrayList.size() == this.j)
    {
      ht localht = new ht();
      localht.a(2130837920);
      localArrayList.add(localht);
    }
    return localArrayList;
  }
  
  private void b()
  {
    this.l = new ArrayList();
    Object localObject = new View(this.e);
    ((View)localObject).setBackgroundColor(0);
    this.l.add(localObject);
    this.m = new ArrayList();
    int i1 = 0;
    while (i1 < this.a.size())
    {
      localObject = (GridView)this.i.inflate(2130903330, null);
      do localdo = new do(this.e, (List)this.a.get(i1));
      ((GridView)localObject).setSelector(2131493660);
      ((GridView)localObject).setAdapter(localdo);
      this.m.add(localdo);
      ((GridView)localObject).setOnItemClickListener(this);
      ((GridView)localObject).setOnItemLongClickListener(this);
      this.l.add(localObject);
      i1 += 1;
    }
    localObject = new View(this.e);
    ((View)localObject).setBackgroundColor(0);
    this.l.add(localObject);
  }
  
  private void c()
  {
    this.o = new ArrayList();
    int i1 = 0;
    while (i1 < this.l.size())
    {
      ImageView localImageView = new ImageView(this.e);
      localImageView.setBackgroundResource(2130838103);
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(new ViewGroup.LayoutParams(-2, -2));
      localLayoutParams.leftMargin = 10;
      localLayoutParams.rightMargin = 10;
      localLayoutParams.width = 8;
      localLayoutParams.height = 8;
      this.h.addView(localImageView, localLayoutParams);
      if ((i1 == 0) || (i1 == this.l.size() - 1)) {
        localImageView.setVisibility(8);
      }
      if (i1 == 1) {
        localImageView.setBackgroundResource(2130838104);
      }
      this.o.add(localImageView);
      i1 += 1;
    }
  }
  
  private void d()
  {
    this.g.setAdapter(new nh(this.l));
    this.g.setCurrentItem(1);
    this.n = 0;
    this.g.setOnPageChangeListener(new kn(this));
  }
  
  private void e()
  {
    int i2 = 0;
    for (;;)
    {
      int i1;
      try
      {
        int i3 = hu.b.length;
        i1 = 0;
        if (i1 < i3)
        {
          int i4 = hu.b[i1];
          if (i4 != 0)
          {
            ht localht = new ht();
            localht.a(i4);
            localht.a(hu.a[i1]);
            this.k.add(localht);
          }
        }
        else
        {
          i3 = (int)Math.ceil(this.k.size() / this.j + 0.1D);
          i1 = i2;
          if (i1 < i3)
          {
            this.a.add(b(i1));
            i1 += 1;
            continue;
          }
          return;
        }
      }
      catch (Exception localException)
      {
        Log.e(d, localException.toString(), localException);
      }
      i1 += 1;
    }
  }
  
  public void a(int paramInt)
  {
    int i1 = 1;
    if (i1 < this.o.size())
    {
      if (paramInt == i1) {
        ((ImageView)this.o.get(i1)).setBackgroundResource(2130838104);
      }
      for (;;)
      {
        i1 += 1;
        break;
        ((ImageView)this.o.get(i1)).setBackgroundResource(2130838103);
      }
    }
  }
  
  public void a(kp paramkp)
  {
    this.p = paramkp;
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (ht)((do)this.m.get(this.n)).getItem(paramInt);
    if ((paramAdapterView.a() == 2130837920) && (this.p != null)) {
      this.p.a();
    }
    if (paramAdapterView.b() != null)
    {
      paramView = dn.a(this.e).a(paramAdapterView.b());
      paramAdapterView = dn.a(this.e).a(this.e, paramAdapterView.a(), paramView);
      Log.d(d, paramAdapterView.toString());
      if (this.p != null) {
        this.p.a(paramAdapterView);
      }
    }
  }
  
  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (((ht)((do)this.m.get(this.n)).getItem(paramInt)).a() == 2130837920)
    {
      this.b = paramView;
      this.c.sendEmptyMessage(1);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\km.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */