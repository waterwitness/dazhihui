package com.android.dazhihui.ui.widget.adv;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.a;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.RTBAdvertResultVo;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.flip.CircleFlowIndicator;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import com.android.dazhihui.ui.widget.flip.f;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

public class AdvertView
  extends FrameLayout
  implements View.OnClickListener, ac
{
  protected int a;
  public int b = 2;
  public boolean c = true;
  private Animation d;
  private Animation e;
  private ViewFlow f;
  private AdvertVo.AdvertData g;
  private View h;
  private ImageButton i;
  private CircleFlowIndicator j;
  private View.OnClickListener k;
  private boolean l = false;
  private boolean m = false;
  private int n = 2131493677;
  private int o = 2131492903;
  private int p = 15;
  private y q;
  private RTBAdvertResultVo r;
  private p s;
  private View t;
  
  public AdvertView(Context paramContext)
  {
    super(paramContext);
    i();
  }
  
  public AdvertView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    i();
  }
  
  private void c(AdvertVo.AdvertData paramAdvertData)
  {
    if ((this.a != 123) && (this.a != 139)) {
      h();
    }
    int i1;
    if ((this.g != null) && (this.g.closetype != null) && ((this.g.closetype.equals("1")) || (this.g.closetype.equals("2")) || (this.g.closetype.equals("3"))))
    {
      this.i.setVisibility(0);
      if (this.a == 105)
      {
        this.m = false;
        i1 = 0;
        label109:
        if (i1 < this.g.advList.size())
        {
          paramAdvertData = (AdvertVo.AdvItem)this.g.advList.get(i1);
          if ((paramAdvertData.getMatchImg() == null) || (paramAdvertData.text == null) || (paramAdvertData.text.isEmpty())) {
            break label295;
          }
          this.m = true;
        }
        if (!this.m) {
          break label302;
        }
        paramAdvertData = (FrameLayout.LayoutParams)this.j.getLayoutParams();
        paramAdvertData.gravity = 85;
        paramAdvertData.setMargins(0, 0, getResources().getDimensionPixelSize(2131230829), getResources().getDimensionPixelSize(2131230774));
      }
      label215:
      if ((this.g != null) && (this.g.viewtype != null))
      {
        if (!this.g.viewtype.equals("1")) {
          break label330;
        }
        if (this.f.getAdapter() != null) {
          break label314;
        }
        paramAdvertData = new q(this, getContext());
        this.f.setAdapter(paramAdvertData);
      }
    }
    for (;;)
    {
      j();
      return;
      this.i.setVisibility(8);
      break;
      label295:
      i1 += 1;
      break label109;
      label302:
      this.j.setVisibility(8);
      break label215;
      label314:
      ((BaseAdapter)this.f.getAdapter()).notifyDataSetChanged();
      continue;
      label330:
      if (this.g.viewtype.equals("2"))
      {
        if (this.f.getAdapter() == null)
        {
          paramAdvertData = new r(this, getContext());
          this.f.setAdapter(paramAdvertData);
        }
        else
        {
          ((BaseAdapter)this.f.getAdapter()).notifyDataSetChanged();
        }
      }
      else if (!this.g.viewtype.equals("3")) {}
    }
  }
  
  private int getHeightPadding()
  {
    return getPaddingTop() + getPaddingBottom();
  }
  
  private int getWidthPadding()
  {
    return getPaddingLeft() + getPaddingRight();
  }
  
  private void i()
  {
    setVisibility(8);
    this.q = g.a().b();
    this.e = AnimationUtils.loadAnimation(getContext().getApplicationContext(), 2130968578);
    this.d = AnimationUtils.loadAnimation(getContext().getApplicationContext(), 2130968577);
    this.h = LayoutInflater.from(getContext()).inflate(2130903550, this, false);
    addView(this.h, -1, -1);
    this.f = ((ViewFlow)this.h.findViewById(2131561148));
    this.f.setFlogTouch(true);
    this.i = ((ImageButton)this.h.findViewById(2131561149));
    this.i.setVisibility(8);
    this.i.setOnClickListener(this);
    this.j = ((CircleFlowIndicator)this.h.findViewById(2131561150));
    this.j.setVisibility(8);
    this.f.setOnItemClickListener(new k(this));
    this.f.setFlowIndicator(this.j);
  }
  
  private void j()
  {
    if (this.g != null)
    {
      this.j.setVisibility(0);
      if (this.g.viewtype.equals("2")) {
        this.j.setVisibility(8);
      }
      if (this.g.playstyle.equals("1"))
      {
        int i1 = Integer.parseInt(this.g.intervals);
        this.f.a(i1 * 1000);
        return;
      }
    }
    this.f.a();
  }
  
  private void k()
  {
    if ((this.a == 137) || (this.a == 147)) {}
    for (;;)
    {
      int i1;
      try
      {
        String[] arrayOfString = new String[this.g.advList.size()];
        i1 = 0;
        if (i1 < this.g.advList.size()) {
          if (this.a == 137) {
            arrayOfString[i1] = ((AdvertVo.AdvItem)this.g.advList.get(i1)).getMatchImg1()[0];
          } else {
            arrayOfString[i1] = ((AdvertVo.AdvItem)this.g.advList.get(i1)).getMatchImg()[0];
          }
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return;
      }
      com.android.dazhihui.ui.widget.a.r.a(getContext()).a(new n(this), localException);
      return;
      l();
      return;
      i1 += 1;
    }
  }
  
  private void l()
  {
    this.b = 1;
    c(this.g);
    if (getVisibility() == 8)
    {
      setVisibility(0);
      if (this.l) {
        startAnimation(this.e);
      }
    }
    if (this.s != null) {
      this.s.onStateChanged(1);
    }
  }
  
  public void a()
  {
    this.f.a();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 != 0) {
      this.p = paramInt3;
    }
    if (paramInt2 != 0) {
      this.o = paramInt2;
    }
    if (paramInt1 != 0) {
      this.n = paramInt1;
    }
  }
  
  public void a(AdvertVo.AdvertData paramAdvertData)
  {
    paramAdvertData = this.g.vs + this.g.pcode;
    if (a.c().b.containsKey(paramAdvertData)) {}
    Object localObject;
    int i1;
    do
    {
      do
      {
        return;
        localObject = getContext().getSharedPreferences("AdvertClosed", 0);
        if (!((SharedPreferences)localObject).contains(paramAdvertData)) {
          break;
        }
        i1 = Integer.parseInt(this.g.closetype);
      } while ((i1 == 1) || (i1 == 4));
      long l1 = ((SharedPreferences)localObject).getLong(paramAdvertData, 0L);
      localObject = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
      paramAdvertData = ((SimpleDateFormat)localObject).format(new Date(l1));
      localObject = ((SimpleDateFormat)localObject).format(new Date());
    } while (((i1 == 3) || (i1 == 6)) && (paramAdvertData.equals(localObject)));
    if (this.g.isDSP)
    {
      ad.a(getContext(), this.a, new m(this));
      return;
    }
    k();
  }
  
  public void b()
  {
    j();
    g();
    if ((this.a != 123) && (this.a != 139)) {
      h();
    }
  }
  
  public void b(AdvertVo.AdvertData paramAdvertData)
  {
    if (this.g.isDSP)
    {
      ad.a(getContext(), this.a, new o(this));
      return;
    }
    c(paramAdvertData);
  }
  
  public void c()
  {
    this.f.a();
    this.g = null;
    if (this.f.getAdapter() != null) {
      ((BaseAdapter)this.f.getAdapter()).notifyDataSetChanged();
    }
    if (getVisibility() == 0)
    {
      setVisibility(8);
      if (this.l) {
        startAnimation(this.d);
      }
    }
    this.b = 2;
    if (this.s != null) {
      this.s.onStateChanged(2);
    }
  }
  
  public void d()
  {
    c();
  }
  
  public void e()
  {
    Object localObject = a.c().b();
    if (localObject == null) {}
    do
    {
      do
      {
        do
        {
          return;
          localObject = ((AdvertVo)localObject).getAdvert(this.a);
          if (localObject != null) {
            break;
          }
        } while (this.g == null);
        c();
        this.g = null;
        return;
        if (this.g != null) {
          break;
        }
      } while (((((AdvertVo.AdvertData)localObject).viewtype.equals("1")) || (((AdvertVo.AdvertData)localObject).viewtype.equals("2"))) && ((((AdvertVo.AdvertData)localObject).advList == null) || (((AdvertVo.AdvertData)localObject).advList.size() == 0)));
      this.g = ((AdvertVo.AdvertData)localObject);
      a(this.g);
      return;
    } while (this.g.vs.equals(((AdvertVo.AdvertData)localObject).vs));
    if (((((AdvertVo.AdvertData)localObject).viewtype.equals("1")) || (((AdvertVo.AdvertData)localObject).viewtype.equals("2"))) && ((((AdvertVo.AdvertData)localObject).advList == null) || (((AdvertVo.AdvertData)localObject).advList.size() == 0)))
    {
      c();
      this.g = null;
      return;
    }
    this.g = ((AdvertVo.AdvertData)localObject);
    b(this.g);
  }
  
  public void f()
  {
    String str;
    if (this.g != null)
    {
      int i1 = Integer.parseInt(this.g.closetype);
      str = this.g.vs + this.g.pcode;
      if ((i1 != 2) && (i1 != 5)) {
        break label79;
      }
      a.c().b.put(str, Boolean.valueOf(true));
    }
    for (;;)
    {
      c();
      return;
      label79:
      getContext().getSharedPreferences("AdvertClosed", 0).edit().putLong(str, System.currentTimeMillis()).commit();
    }
  }
  
  public void g()
  {
    y localy = g.a().b();
    if (localy != this.q)
    {
      this.q = localy;
      if (this.f.getAdapter() != null) {
        ((BaseAdapter)this.f.getAdapter()).notifyDataSetChanged();
      }
    }
  }
  
  public AdvertVo.AdvertData getAdvertData()
  {
    return this.g;
  }
  
  public void h()
  {
    if ((this.c) && (this.b == 1) && (this.g != null) && (this.g.advList != null) && (this.g.advList.size() > 0))
    {
      Iterator localIterator = this.g.advList.iterator();
      while (localIterator.hasNext())
      {
        AdvertVo.AdvItem localAdvItem = (AdvertVo.AdvItem)localIterator.next();
        if (!TextUtils.isEmpty(localAdvItem.countid)) {
          com.android.dazhihui.d.n.a(String.valueOf(this.a), Integer.parseInt(localAdvItem.countid));
        }
      }
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    do
    {
      return;
      f();
    } while (this.k == null);
    this.k.onClick(paramView);
  }
  
  public void setAdvCode(int paramInt)
  {
    postDelayed(new l(this, paramInt), 200L);
  }
  
  public void setEnableAnimation(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }
  
  public void setOnAdvertStateChangeListener(p paramp)
  {
    this.s = paramp;
  }
  
  public void setOnCarouselistener(f paramf)
  {
    if (this.f != null) {
      this.f.setOnViewSwitchListener(paramf);
    }
  }
  
  public void setOnCloseClickListener(View.OnClickListener paramOnClickListener)
  {
    this.k = paramOnClickListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\AdvertView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */