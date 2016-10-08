package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.stock.a.bl;
import com.android.dazhihui.ui.screen.y;

public class TabIndicatorLayout
  extends RelativeLayout
  implements View.OnClickListener
{
  private LayoutInflater a;
  private Context b;
  private View c;
  private View d;
  private View e;
  private TextView f;
  private TextView g;
  private TextView h;
  private View i;
  private View j;
  private View k;
  private bl l;
  
  public TabIndicatorLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TabIndicatorLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TabIndicatorLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = paramContext;
    this.a = LayoutInflater.from(paramContext);
    this.a.inflate(2130903456, this);
    this.j = findViewById(2131558585);
    this.i = this.j;
    this.k = this.i.findViewById(2131560622);
    this.c = this.i.findViewById(2131558586);
    this.c.setOnClickListener(this);
    this.d = this.i.findViewById(2131560128);
    this.d.setOnClickListener(this);
    this.e = this.i.findViewById(2131560626);
    this.e.setOnClickListener(this);
    this.f = ((TextView)this.i.findViewById(2131560623));
    this.f.setOnClickListener(this);
    this.g = ((TextView)this.i.findViewById(2131560624));
    this.g.setOnClickListener(this);
    this.h = ((TextView)this.i.findViewById(2131560625));
    this.h.setOnClickListener(this);
  }
  
  public void a()
  {
    if ((this.f != null) && (this.g != null) && (this.h != null) && (this.l != null)) {}
    switch (this.l.a)
    {
    default: 
      return;
    case 101: 
      this.f.setSelected(true);
      this.g.setSelected(false);
      this.h.setSelected(false);
      return;
    case 106: 
      this.f.setSelected(false);
      this.g.setSelected(true);
      this.h.setSelected(false);
      return;
    }
    this.f.setSelected(false);
    this.g.setSelected(false);
    this.h.setSelected(true);
  }
  
  public void a(int paramInt)
  {
    if (this.l != null)
    {
      this.l.a = paramInt;
      a();
      this.l.refresh();
    }
  }
  
  public void a(y paramy)
  {
    if (paramy != null) {
      switch (lj.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.j == null);
      this.j.setBackgroundColor(getResources().getColor(2131493536));
      this.k.setBackgroundResource(2130838678);
      this.f.setBackgroundResource(2130838680);
      this.g.setBackgroundResource(2130838680);
      this.h.setBackgroundResource(2130838680);
      this.f.setTextColor(-1);
      this.g.setTextColor(-1);
      this.h.setTextColor(-1);
      return;
    } while (this.j == null);
    this.j.setBackgroundColor(getResources().getColor(2131493599));
    this.k.setBackgroundResource(2130838679);
    this.f.setBackgroundResource(2130838681);
    this.g.setBackgroundResource(2130838681);
    this.h.setBackgroundResource(2130838681);
    this.f.setTextColor(getResources().getColorStateList(2130838856));
    this.g.setTextColor(getResources().getColorStateList(2130838856));
    this.h.setTextColor(getResources().getColorStateList(2130838856));
  }
  
  public void onClick(View paramView)
  {
    if ((paramView != null) && (this.l != null)) {
      switch (paramView.getId())
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
            ((Activity)this.b).finish();
            return;
            paramView = new Intent(this.b, SearchStockScreen.class);
            this.b.startActivity(paramView);
            return;
          } while (this.l == null);
          this.l.refresh();
          return;
        } while (this.l == null);
        a(101);
        return;
      } while (this.l == null);
      a(106);
      return;
    } while (this.l == null);
    a(107);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public void setSelfStockFragment(bl parambl)
  {
    this.l = parambl;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\TabIndicatorLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */