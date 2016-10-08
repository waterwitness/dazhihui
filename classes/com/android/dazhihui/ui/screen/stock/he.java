package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.a;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.q;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhBottomLayout;
import com.android.dazhihui.ui.widget.ck;

public class he
  extends a
  implements View.OnClickListener
{
  private com.android.dazhihui.ui.a.m a = com.android.dazhihui.ui.a.m.a();
  private DzhBottomLayout b;
  private FrameLayout c;
  private int d = q.a;
  private int e = -1;
  private ad f;
  private e g;
  private int h;
  private int i;
  private q j = new q();
  private View k;
  private long l = SystemClock.uptimeMillis();
  private long m = SystemClock.uptimeMillis();
  
  public he() {}
  
  public he(int paramInt1, int paramInt2, int paramInt3)
  {
    this.d = paramInt1;
    this.h = paramInt2;
    this.i = paramInt3;
  }
  
  private void a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      n.a("", 1182);
      return;
    case 268435456: 
      n.a("", 1183);
      return;
    case 536870912: 
      n.a("", 1184);
      return;
    case 805306368: 
      n.a("", 1403);
      return;
    case 1073741824: 
      n.a("", 1420);
      return;
    case 1342177280: 
      n.a("", 1420);
      return;
    case 1610612736: 
      n.a("", 20232);
      return;
    case 1879048192: 
      n.a("", 20275);
      return;
    }
    n.a("", 20287);
  }
  
  private void a(int paramInt1, Bundle paramBundle, boolean paramBoolean, int paramInt2, int paramInt3)
  {
    this.d = paramInt1;
    this.h = paramInt2;
    Object localObject = this.g;
    if (this.f == null) {}
    e locale;
    do
    {
      return;
      locale = this.j.a(paramInt1);
    } while (locale == null);
    int i1 = this.b.getCurrentIndex();
    int n;
    at localat;
    switch (paramInt1)
    {
    default: 
      n = i1;
      if (this.g != locale) {
        this.g = locale;
      }
      this.b.a(n);
      localat = this.f.a();
      if (paramBoolean)
      {
        if (i1 > n) {
          localat.a(2130968632, 2130968633);
        }
      }
      else
      {
        label190:
        if (localObject != null)
        {
          ((e)localObject).beforeHidden();
          localat.b((Fragment)localObject);
        }
        if ((paramInt2 <= 0) && (paramInt3 <= 0)) {
          break label425;
        }
        localObject = paramBundle;
        if (paramBundle == null) {
          localObject = new Bundle();
        }
        ((Bundle)localObject).putInt("fragment_index", paramInt2);
        ((Bundle)localObject).putInt("fragment_sub_index", paramInt3);
        label252:
        if ((n != 0) && (n != 1) && (n != 2) && (n != 3) && (n != 4)) {
          break label570;
        }
        this.b.a();
        label288:
        if (localObject != null) {
          locale.setBundle((Bundle)localObject);
        }
        if (locale.isAdded()) {
          break label580;
        }
        localat.a(2131559719, locale);
      }
      break;
    }
    for (;;)
    {
      localat.b();
      a(paramInt1);
      if ((this.e != -1) && (this.e != paramInt1)) {
        f();
      }
      this.e = paramInt1;
      return;
      n = 0;
      break;
      n = 1;
      break;
      n = 2;
      break;
      n = 3;
      break;
      n = 4;
      break;
      n = 5;
      break;
      n = 6;
      break;
      n = 7;
      break;
      n = 8;
      break;
      localat.a(2130968628, 2130968629);
      break label190;
      label425:
      if ((n != 5) && (n != 6) && (n != 7))
      {
        localObject = paramBundle;
        if (n != 8) {
          break label252;
        }
      }
      Bundle localBundle = paramBundle;
      if (paramBundle == null) {
        localBundle = new Bundle();
      }
      if (n == 5)
      {
        localBundle.putInt("showType", gg.a);
        localObject = localBundle;
        break label252;
      }
      if (n == 6)
      {
        localBundle.putInt("showType", gg.b);
        localObject = localBundle;
        break label252;
      }
      if (n == 7)
      {
        localBundle.putInt("showType", gg.c);
        localObject = localBundle;
        break label252;
      }
      localObject = localBundle;
      if (n != 8) {
        break label252;
      }
      localBundle.putInt("showType", gg.d);
      localObject = localBundle;
      break label252;
      label570:
      this.b.b();
      break label288;
      label580:
      localat.c(locale);
      this.g.setSubFragmentIndex(paramInt2, paramInt3);
      locale.show();
    }
  }
  
  private void f()
  {
    long l1 = SystemClock.uptimeMillis() - this.l;
    this.l = SystemClock.uptimeMillis();
    if (l1 > 0L) {}
    switch (this.e)
    {
    default: 
      return;
    case 0: 
      g.a().a(com.android.dazhihui.m.a, l1);
      return;
    case 268435456: 
      g.a().a(com.android.dazhihui.m.b, l1);
      return;
    case 536870912: 
      g.a().a(com.android.dazhihui.m.c, l1);
      return;
    case 805306368: 
      g.a().a(com.android.dazhihui.m.d, l1);
      return;
    }
    g.a().a(com.android.dazhihui.m.e, l1);
  }
  
  private boolean g()
  {
    long l1 = SystemClock.uptimeMillis();
    long l2 = this.m;
    this.m = l1;
    return Math.abs(l1 - l2) > 200L;
  }
  
  public void a(int paramInt1, Bundle paramBundle, int paramInt2, int paramInt3)
  {
    a(paramInt1, paramBundle, false, paramInt2, paramInt3);
  }
  
  public boolean a()
  {
    return (this.g == null) || (this.g.getPrevious() == null);
  }
  
  public e b()
  {
    return this.g;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if ((paramy != null) && (getActivity() != null)) {
      switch (hf.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        if (this.k != null) {
          this.k.setBackgroundColor(getActivity().getResources().getColor(2131493537));
        }
        if (this.b != null) {
          this.b.a(paramy);
        }
      } while (this.g == null);
      this.g.setLookFace();
      return;
      if (this.k != null) {
        this.k.setBackgroundColor(getActivity().getResources().getColor(2131493600));
      }
      if (this.b != null) {
        this.b.a(paramy);
      }
    } while (this.g == null);
    this.g.setLookFace();
  }
  
  public int d()
  {
    return this.h;
  }
  
  public int e()
  {
    return this.i;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    this.b.c();
    this.f = getFragmentManager();
    if (paramBundle != null)
    {
      this.d = paramBundle.getInt("currentSelected", q.a);
      this.h = paramBundle.getInt("currentSelectedIndex", 0);
      this.i = paramBundle.getInt("currentSelectedIndex", 0);
    }
    a(this.d, null, false, this.h, this.i);
  }
  
  public void onBackPressed()
  {
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    int n = this.b.getCurrentIndex();
    switch (paramView.getId())
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return;
              } while ((n == 0) || (!g()));
              a(0, null, -1, -1);
              this.d = 0;
              com.android.dazhihui.ui.delegate.b.o.r = false;
              return;
            } while ((n == 1) || (!g()));
            a(268435456, null, -1, -1);
            this.d = 268435456;
            com.android.dazhihui.ui.delegate.b.o.r = false;
            return;
            if (n == 2) {
              break;
            }
          } while (!g());
          a(536870912, null, -1, -1);
          this.d = 536870912;
          com.android.dazhihui.ui.delegate.b.o.r = false;
          return;
        } while ((this.g == null) || (!(this.g instanceof mf)));
        ((mf)this.g).b();
        return;
      } while ((n == 3) || (!g()));
      a(805306368, null, 0, 0);
      this.d = 805306368;
      return;
    } while ((n == 4) || (!g()));
    a(1073741824, null, -1, -1);
    this.d = 1073741824;
    this.b.a.d_();
    com.android.dazhihui.ui.delegate.b.o.r = false;
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.k = paramLayoutInflater.inflate(2130903250, paramViewGroup, false);
    this.b = ((DzhBottomLayout)this.k.findViewById(2131559718));
    this.c = ((FrameLayout)this.k.findViewById(2131559719));
    this.b.setOnBottomClickListener(this);
    addAdvert(this.b.a);
    changeLookFace(this.mLookFace);
    return this.k;
  }
  
  public void onDestroy()
  {
    this.b.d();
    this.j = null;
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
    f();
  }
  
  public void onResume()
  {
    super.onResume();
    this.l = SystemClock.uptimeMillis();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    paramBundle.putInt("currentSelected", this.d);
    paramBundle.putInt("currentSelectedIndex", this.h);
    paramBundle.putInt("currentSelectedIndex", this.i);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void onStop()
  {
    super.onStop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\he.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */