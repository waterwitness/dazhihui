package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class CaptialAnalPeriodOperation
  extends LinearLayout
{
  private RingView a;
  private RingView b;
  private RingView c;
  
  public CaptialAnalPeriodOperation(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public CaptialAnalPeriodOperation(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private void a()
  {
    this.a = ((RingView)findViewById(2131558655));
    this.b = ((RingView)findViewById(2131558656));
    this.c = ((RingView)findViewById(2131558657));
  }
  
  private void a(Context paramContext)
  {
    LayoutInflater.from(paramContext).inflate(2130903069, this);
    a();
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    this.a.a(paramFloat1, getResources().getColor(2131492962));
    this.b.a(paramFloat2, getResources().getColor(2131492975));
    this.c.setPercentFlag(false);
    this.c.a(paramFloat3, getResources().getColor(2131492970));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\CaptialAnalPeriodOperation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */