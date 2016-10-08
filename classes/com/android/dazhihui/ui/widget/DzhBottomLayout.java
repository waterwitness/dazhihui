package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.ui.widget.adv.ai;
import com.android.dazhihui.ui.widget.adv.aj;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DzhBottomLayout
  extends LinearLayout
{
  public ck a;
  private Context b;
  private View[] c;
  private TextView[] d;
  private ImageView[] e;
  private int f = -1;
  private View g;
  private View h;
  private View i;
  private View j;
  private View k;
  private View l;
  private ai m;
  private ai n;
  private ai o;
  private ai p;
  private ai q;
  private ai r;
  private ai s;
  private aj t;
  private List<Integer> u = new ArrayList();
  private List<Integer> v = new ArrayList();
  private TextView w;
  private View x;
  private View y;
  private View z;
  
  public DzhBottomLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.x = LayoutInflater.from(paramContext).inflate(2130903551, this);
    this.b = paramContext;
    this.y = this.x.findViewById(2131561152);
    this.z = this.x.findViewById(2131561151);
    this.c = new View[10];
    this.c[0] = this.x.findViewById(2131561153);
    this.c[1] = this.x.findViewById(2131561156);
    this.c[2] = this.x.findViewById(2131561160);
    this.c[3] = this.x.findViewById(2131561165);
    this.c[4] = this.x.findViewById(2131561169);
    this.c[5] = this.x.findViewById(2131561175);
    this.c[6] = this.x.findViewById(2131561179);
    this.c[7] = this.x.findViewById(2131561183);
    this.c[8] = this.x.findViewById(2131561187);
    this.c[9] = this.x.findViewById(2131561191);
    this.d = new TextView[10];
    this.d[0] = ((TextView)this.x.findViewById(2131561154));
    this.d[1] = ((TextView)this.x.findViewById(2131561157));
    this.d[2] = ((TextView)this.x.findViewById(2131561161));
    this.d[3] = ((TextView)this.x.findViewById(2131561166));
    this.d[4] = ((TextView)this.x.findViewById(2131561170));
    this.d[5] = ((TextView)this.x.findViewById(2131561176));
    this.d[6] = ((TextView)this.x.findViewById(2131561180));
    this.d[7] = ((TextView)this.x.findViewById(2131561184));
    this.d[8] = ((TextView)this.x.findViewById(2131561188));
    this.d[9] = ((TextView)this.x.findViewById(2131561192));
    this.e = new ImageView[10];
    this.e[0] = ((ImageView)this.x.findViewById(2131561155));
    this.e[1] = ((ImageView)this.x.findViewById(2131561158));
    this.e[2] = ((ImageView)this.x.findViewById(2131561162));
    this.e[3] = ((ImageView)this.x.findViewById(2131561167));
    this.e[4] = ((ImageView)this.x.findViewById(2131561171));
    this.e[5] = ((ImageView)this.x.findViewById(2131561177));
    this.e[6] = ((ImageView)this.x.findViewById(2131561181));
    this.e[7] = ((ImageView)this.x.findViewById(2131561185));
    this.e[8] = ((ImageView)this.x.findViewById(2131561189));
    this.e[9] = ((ImageView)this.x.findViewById(2131561193));
    this.i = this.x.findViewById(2131561163);
    this.j = this.x.findViewById(2131561164);
    this.h = this.x.findViewById(2131561173);
    this.g = this.x.findViewById(2131561172);
    this.k = this.x.findViewById(2131561168);
    this.l = this.x.findViewById(2131561159);
    this.w = ((TextView)this.x.findViewById(2131561174));
    e();
    this.a = new ck(this, 135);
  }
  
  private void e()
  {
    this.m = new cb(this, 60004);
    this.o = new cc(this, 11);
    this.n = new cd(this, 1164);
    this.s = new ce(this, 1001);
    this.p = new cf(this, 10);
    this.q = new cg(this, 12);
    this.r = new ch(this, 14);
    this.t = new ci(this);
  }
  
  public void a()
  {
    if (this.c[0].getVisibility() == 8)
    {
      this.c[0].setVisibility(0);
      this.c[1].setVisibility(0);
      this.c[2].setVisibility(0);
      this.c[3].setVisibility(0);
      this.c[4].setVisibility(0);
    }
    if (this.c[5].getVisibility() == 0)
    {
      this.c[5].setVisibility(8);
      this.c[6].setVisibility(8);
      this.c[7].setVisibility(8);
      this.c[8].setVisibility(8);
      this.c[9].setVisibility(8);
    }
  }
  
  public void a(int paramInt)
  {
    if ((this.f != -1) && (this.f != Integer.MAX_VALUE)) {
      this.c[this.f].setSelected(false);
    }
    if (paramInt != Integer.MAX_VALUE) {
      this.c[paramInt].setSelected(true);
    }
    this.f = paramInt;
  }
  
  public void a(y paramy)
  {
    switch (cj.a[paramy.ordinal()])
    {
    }
    do
    {
      int i2;
      int i1;
      Object localObject;
      do
      {
        return;
        if (this.z != null) {
          this.z.setBackgroundColor(getResources().getColor(2131493537));
        }
        if (this.y != null) {
          this.y.setBackgroundColor(getResources().getColor(2131493538));
        }
        if (this.d != null)
        {
          paramy = this.d;
          i2 = paramy.length;
          i1 = 0;
          if (i1 < i2)
          {
            localObject = paramy[i1];
            if (((TextView)localObject).getText().toString().equals("视吧")) {
              ((TextView)localObject).setTextColor(getResources().getColorStateList(2130838780));
            }
            for (;;)
            {
              i1 += 1;
              break;
              ((TextView)localObject).setTextColor(getResources().getColorStateList(2130838781));
            }
          }
        }
      } while ((this.e == null) || (this.e.length != 10));
      this.e[0].setImageResource(2130838779);
      this.e[1].setImageResource(2130838764);
      this.e[2].setImageResource(2130838769);
      this.e[3].setImageResource(2130838750);
      this.e[4].setImageResource(2130838763);
      this.e[5].setImageResource(2130838774);
      this.e[6].setImageResource(2130838756);
      this.e[7].setImageResource(2130838753);
      this.e[8].setImageResource(2130838759);
      this.e[9].setImageResource(2130838748);
      return;
      if (this.z != null) {
        this.z.setBackgroundColor(getResources().getColor(2131493611));
      }
      if (this.y != null) {
        this.y.setBackgroundColor(getResources().getColor(2131493601));
      }
      if (this.d != null)
      {
        paramy = this.d;
        i2 = paramy.length;
        i1 = 0;
        if (i1 < i2)
        {
          localObject = paramy[i1];
          if (((TextView)localObject).getText().toString().equals("视吧")) {
            ((TextView)localObject).setTextColor(getResources().getColorStateList(2130838857));
          }
          for (;;)
          {
            i1 += 1;
            break;
            ((TextView)localObject).setTextColor(getResources().getColorStateList(2130838858));
          }
        }
      }
    } while ((this.e == null) || (this.e.length != 10));
    this.e[0].setImageResource(2130838855);
    this.e[1].setImageResource(2130838843);
    this.e[2].setImageResource(2130838848);
    this.e[3].setImageResource(2130838828);
    this.e[4].setImageResource(2130838842);
    this.e[5].setImageResource(2130838852);
    this.e[6].setImageResource(2130838834);
    this.e[7].setImageResource(2130838831);
    this.e[8].setImageResource(2130838837);
    this.e[9].setImageResource(2130838748);
  }
  
  public void a(boolean paramBoolean, int paramInt) {}
  
  public void b()
  {
    if (this.c[0].getVisibility() == 0)
    {
      this.c[0].setVisibility(8);
      this.c[1].setVisibility(8);
      this.c[2].setVisibility(8);
      this.c[3].setVisibility(8);
      this.c[4].setVisibility(8);
    }
    if (this.c[5].getVisibility() == 8)
    {
      this.c[5].setVisibility(0);
      this.c[6].setVisibility(0);
      this.c[7].setVisibility(0);
      this.c[8].setVisibility(0);
      this.c[9].setVisibility(0);
    }
  }
  
  public void b(boolean paramBoolean, int paramInt)
  {
    if (paramBoolean)
    {
      this.u.add(Integer.valueOf(paramInt));
      Iterator localIterator = this.u.iterator();
      Integer localInteger;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localInteger = (Integer)localIterator.next();
      } while ((localInteger.intValue() != 0) && (localInteger.intValue() != 2));
    }
    for (int i1 = 1;; i1 = 0)
    {
      if ((paramInt == 1) && (i1 == 0))
      {
        this.j.setVisibility(0);
        this.i.setVisibility(8);
      }
      do
      {
        do
        {
          return;
          this.j.setVisibility(8);
          this.i.setVisibility(0);
          return;
          if (paramInt == 2)
          {
            i1 = this.u.size() - 1;
            while (i1 > -1)
            {
              if (((Integer)this.u.get(i1)).intValue() == 2) {
                this.u.remove(i1);
              }
              i1 -= 1;
            }
          }
          i1 = this.u.indexOf(Integer.valueOf(paramInt));
          if (i1 != -1) {
            this.u.remove(i1);
          }
          if (paramInt != 1) {
            break;
          }
        } while (this.u.contains(Integer.valueOf(paramInt)));
        this.j.setVisibility(8);
        return;
      } while ((this.u.contains(Integer.valueOf(0))) || (this.u.contains(Integer.valueOf(2))));
      if (this.u.contains(Integer.valueOf(1))) {
        this.j.setVisibility(0);
      }
      this.i.setVisibility(8);
      return;
    }
  }
  
  public void c()
  {
    ah.a().a(this.m);
    ah.a().a(this.n);
    ah.a().a(this.p);
    ah.a().a(this.o);
    ah.a().a(this.q);
    ah.a().a(this.r);
    ah.a().a(this.s);
    ah.a().a(this.t);
    this.t.a(10001);
    this.t.a(10004);
    this.t.a(10003);
    this.t.a(10002);
  }
  
  public void c(boolean paramBoolean, int paramInt)
  {
    System.out.println("vs isVisibility = " + paramBoolean + "type = " + paramInt);
    if (paramBoolean)
    {
      this.v.add(Integer.valueOf(paramInt));
      Iterator localIterator = this.v.iterator();
      Integer localInteger;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localInteger = (Integer)localIterator.next();
      } while ((localInteger.intValue() != 0) && (localInteger.intValue() != 2) && (localInteger.intValue() != 3));
    }
    for (int i1 = 1;; i1 = 0)
    {
      if ((paramInt == 1) && (i1 == 0))
      {
        this.h.setVisibility(0);
        this.g.setVisibility(8);
      }
      do
      {
        do
        {
          return;
          this.h.setVisibility(8);
          this.g.setVisibility(0);
          return;
          if (paramInt == 2)
          {
            i1 = this.v.size() - 1;
            while (i1 > -1)
            {
              if (((Integer)this.v.get(i1)).intValue() == 2) {
                this.v.remove(i1);
              }
              i1 -= 1;
            }
          }
          i1 = this.v.indexOf(Integer.valueOf(paramInt));
          if (i1 != -1) {
            this.v.remove(i1);
          }
          if (paramInt != 1) {
            break;
          }
        } while (this.v.contains(Integer.valueOf(paramInt)));
        this.h.setVisibility(8);
        return;
      } while ((this.v.contains(Integer.valueOf(0))) || (this.v.contains(Integer.valueOf(2))) || (this.v.contains(Integer.valueOf(3))));
      if (this.v.contains(Integer.valueOf(1))) {
        this.h.setVisibility(0);
      }
      n.e("pushService", "hide red --------->");
      this.g.setVisibility(8);
      return;
    }
  }
  
  public void d()
  {
    ah.a().b(this.m);
    ah.a().b(this.n);
    ah.a().b(this.p);
    ah.a().b(this.o);
    ah.a().b(this.q);
    ah.a().b(this.r);
    ah.a().b(this.s);
    ah.a().b(this.t);
  }
  
  public int getCurrentIndex()
  {
    return this.f;
  }
  
  public int getSelectedIndex()
  {
    return this.f;
  }
  
  public void setOnBottomClickListener(View.OnClickListener paramOnClickListener)
  {
    this.c[0].setOnClickListener(paramOnClickListener);
    this.c[1].setOnClickListener(paramOnClickListener);
    this.c[2].setOnClickListener(paramOnClickListener);
    this.c[3].setOnClickListener(paramOnClickListener);
    this.c[4].setOnClickListener(paramOnClickListener);
    this.c[5].setOnClickListener(paramOnClickListener);
    this.c[6].setOnClickListener(paramOnClickListener);
    this.c[7].setOnClickListener(paramOnClickListener);
    this.c[8].setOnClickListener(paramOnClickListener);
    this.c[9].setOnClickListener(paramOnClickListener);
  }
  
  public void setShichangRed(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.l.setVisibility(0);
      return;
    }
    this.l.setVisibility(8);
  }
  
  public void setTradeRedRed(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.k.setVisibility(0);
      return;
    }
    this.k.setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\DzhBottomLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */