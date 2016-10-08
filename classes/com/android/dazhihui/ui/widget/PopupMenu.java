package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.SearchView.OnCloseListener;

public class PopupMenu
  extends LinearLayout
{
  private Animation a;
  private Animation b;
  private Animation c;
  private Animation d;
  private LinearLayout e;
  private boolean f = true;
  private int g;
  private SearchView.OnCloseListener h;
  
  public PopupMenu(Context paramContext)
  {
    super(paramContext);
    a(null);
  }
  
  public PopupMenu(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramAttributeSet);
  }
  
  public PopupMenu(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramAttributeSet);
  }
  
  private void a(AttributeSet paramAttributeSet)
  {
    if (paramAttributeSet != null)
    {
      paramAttributeSet = paramAttributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "gravity");
      if ((paramAttributeSet != null) && (!paramAttributeSet.isEmpty())) {
        this.g = Integer.parseInt(paramAttributeSet.substring(2), 16);
      }
    }
    setBackgroundColor(getResources().getColor(17170444));
    getBackground().setAlpha(100);
    setOnClickListener(new jy(this));
    setOrientation(0);
    this.e = new LinearLayout(getContext());
    this.e.setOrientation(1);
    paramAttributeSet = new LinearLayout.LayoutParams(-1, -2);
    super.addView(this.e, -1, paramAttributeSet);
    this.a = AnimationUtils.loadAnimation(getContext().getApplicationContext(), 2130968610);
    this.b = AnimationUtils.loadAnimation(getContext().getApplicationContext(), 2130968611);
    this.c = AnimationUtils.loadAnimation(getContext().getApplicationContext(), 2130968612);
    this.d = AnimationUtils.loadAnimation(getContext().getApplicationContext(), 2130968613);
    this.d.setAnimationListener(new jz(this));
    this.b.setAnimationListener(new ka(this));
  }
  
  public boolean a()
  {
    return getVisibility() == 0;
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    this.e.addView(paramView, paramLayoutParams);
  }
  
  public void b()
  {
    setVisibility(0);
    if (this.g == 80) {
      this.e.startAnimation(this.a);
    }
    for (;;)
    {
      this.e.setVisibility(0);
      setFocusableInTouchMode(true);
      requestFocusFromTouch();
      return;
      this.e.startAnimation(this.c);
    }
  }
  
  public void c()
  {
    if (this.g == 80) {
      this.e.startAnimation(this.b);
    }
    for (;;)
    {
      this.e.setVisibility(8);
      if (this.h != null) {
        this.h.onClose();
      }
      return;
      this.e.startAnimation(this.d);
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (a()))
    {
      c();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void setClickOutClose(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void setOnCloseListener(SearchView.OnCloseListener paramOnCloseListener)
  {
    this.h = paramOnCloseListener;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\PopupMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */