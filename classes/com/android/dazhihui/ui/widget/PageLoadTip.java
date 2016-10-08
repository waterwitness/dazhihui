package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

public class PageLoadTip
  extends RelativeLayout
{
  private int a = 3;
  private String b;
  private String c;
  private int d = -1;
  private View.OnClickListener e;
  private int f = 16;
  private int g = -1;
  
  public PageLoadTip(Context paramContext)
  {
    super(paramContext);
    c();
  }
  
  public PageLoadTip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
  }
  
  private void c()
  {
    d();
  }
  
  private void d()
  {
    removeAllViews();
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.addRule(13);
    Object localObject3;
    if (this.a == 0)
    {
      localObject1 = new ProgressBar(getContext(), null, 16842871);
      localObject2 = new LinearLayout(getContext());
      ((LinearLayout)localObject2).setOrientation(1);
      localObject3 = new LinearLayout.LayoutParams(-2, -2);
      ((LinearLayout.LayoutParams)localObject3).gravity = 17;
      ((LinearLayout)localObject2).addView((View)localObject1, (ViewGroup.LayoutParams)localObject3);
      addView((View)localObject2, localLayoutParams);
    }
    do
    {
      return;
      if (this.a == 3)
      {
        localObject1 = new TextView(getContext());
        ((TextView)localObject1).setText(this.c);
        ((TextView)localObject1).setTextColor(-16777216);
        addView((View)localObject1, localLayoutParams);
        return;
      }
      if (this.a == 1)
      {
        if (this.b == null) {
          this.b = "非常抱歉,出现异常,请联系管理员！";
        }
        localObject1 = new TextView(getContext());
        ((TextView)localObject1).setText(this.b);
        ((TextView)localObject1).setTextColor(-16777216);
        addView((View)localObject1, localLayoutParams);
        return;
      }
    } while (this.a != 2);
    Object localObject1 = new LinearLayout(getContext());
    ((LinearLayout)localObject1).setOnClickListener(this.e);
    ((LinearLayout)localObject1).setOrientation(1);
    Object localObject2 = new ImageView(getContext());
    if (this.d != -1) {
      ((ImageView)localObject2).setImageResource(this.d);
    }
    for (;;)
    {
      localObject3 = new TextView(getContext());
      if (this.c == null) {
        this.c = "点击屏幕,重新加载";
      }
      ((TextView)localObject3).setTextSize(2, this.f);
      if (this.g != -1) {
        ((TextView)localObject3).setTextColor(getResources().getColor(this.g));
      }
      ((TextView)localObject3).setText(this.c);
      ((TextView)localObject3).setPadding(0, 10, 0, 0);
      LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
      localLayoutParams1.gravity = 17;
      ((LinearLayout)localObject1).addView((View)localObject2, localLayoutParams1);
      ((LinearLayout)localObject1).addView((View)localObject3, localLayoutParams1);
      addView((View)localObject1, localLayoutParams);
      return;
      ((ImageView)localObject2).setImageResource(2130838507);
    }
  }
  
  public void a()
  {
    setVisibility(8);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.f = paramInt1;
    this.g = paramInt2;
  }
  
  public void a(String paramString, int paramInt, View.OnClickListener paramOnClickListener)
  {
    this.c = paramString;
    this.e = paramOnClickListener;
    this.d = paramInt;
    setShowType(2);
  }
  
  public void a(String paramString, View.OnClickListener paramOnClickListener)
  {
    this.c = paramString;
    this.e = paramOnClickListener;
    setShowType(2);
  }
  
  public void b()
  {
    setShowType(0);
  }
  
  public void setPageError(String paramString)
  {
    this.b = paramString;
    setShowType(1);
  }
  
  public void setPageTip(String paramString)
  {
    this.c = paramString;
    setShowType(3);
  }
  
  public void setShowType(int paramInt)
  {
    this.a = paramInt;
    setVisibility(0);
    d();
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0)
    {
      setClickable(true);
      return;
    }
    setClickable(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\PageLoadTip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */