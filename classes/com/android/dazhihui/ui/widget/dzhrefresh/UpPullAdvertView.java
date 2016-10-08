package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.adv.AdvertUpPullLayout;

public class UpPullAdvertView
  extends LoadAndRefreshView
{
  Runnable f = new w(this);
  Runnable g = new x(this);
  private y h;
  private AdvertUpPullLayout i;
  private int j;
  
  public UpPullAdvertView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public UpPullAdvertView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected View a(LayoutInflater paramLayoutInflater)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903387, this, false);
    this.i = ((AdvertUpPullLayout)paramLayoutInflater.findViewById(2131560235));
    this.d = ((DzhLoading)paramLayoutInflater.findViewById(2131560234));
    this.e = ((TextView)paramLayoutInflater.findViewById(2131558837));
    if (this.i != null)
    {
      this.i.setType("2");
      this.i.c();
    }
    return paramLayoutInflater;
  }
  
  public void a(y paramy)
  {
    super.a(paramy);
    if ((paramy != null) && (getContext() != null)) {
      switch (y.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
        this.h = y.a;
      } while (this.i == null);
      this.i.a(paramy);
      return;
      this.h = y.b;
    } while (this.i == null);
    this.i.a(paramy);
  }
  
  protected void b(boolean paramBoolean, int paramInt)
  {
    this.d.b();
    String str;
    if ((paramInt == 1) || (paramInt == 2) || (paramInt == 3))
    {
      this.d.a(100);
      if (paramInt != 1) {
        break label106;
      }
      str = "刷新成功";
    }
    for (;;)
    {
      this.e.setText(str);
      if ((this.i == null) || (this.i.getVisibility() == 8)) {
        break;
      }
      this.i.a();
      d(-(AdvertUpPullLayout.a + 10));
      removeCallbacks(this.f);
      postDelayed(this.f, 6000L);
      return;
      label106:
      if (paramInt == 2) {
        str = "刷新失败";
      } else {
        str = "完成刷新";
      }
    }
    postDelayed(new v(this, paramBoolean), 1000L);
  }
  
  public void c(int paramInt)
  {
    this.j = paramInt;
    if ((this.i != null) && (this.i.getVisibility() != 8))
    {
      this.a = ((int)Math.round(this.b.getHeight() * 1.0D));
      return;
    }
    this.a = ((int)Math.round(this.b.getHeight() * 1.1D));
  }
  
  public void d()
  {
    if ((this.i != null) && (this.i.getVisibility() != 8))
    {
      if (this.j < -(AdvertUpPullLayout.a + 10))
      {
        j();
        return;
      }
      e();
      return;
    }
    super.d();
  }
  
  protected void h()
  {
    super.h();
  }
  
  public void j()
  {
    if ((this.i != null) && (this.i.getVisibility() != 8))
    {
      this.i.a();
      d(-(AdvertUpPullLayout.a + 10));
      removeCallbacks(this.g);
      postDelayed(this.g, 6000L);
      return;
    }
    e();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\UpPullAdvertView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */