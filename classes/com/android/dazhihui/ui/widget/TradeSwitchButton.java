package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TradeSwitchButton
  extends LinearLayout
{
  public nd a;
  private String b = "A股";
  private String c = "港美";
  private TextView d;
  private TextView e;
  private int f;
  
  public TradeSwitchButton(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public TradeSwitchButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  private void a(int paramInt)
  {
    this.f = paramInt;
    switch (paramInt)
    {
    }
    for (;;)
    {
      if (this.a != null) {
        this.a.a(paramInt);
      }
      return;
      this.d.setSelected(true);
      this.e.setSelected(false);
      continue;
      com.android.dazhihui.ui.delegate.b.o.r = false;
      this.d.setSelected(false);
      this.e.setSelected(true);
    }
  }
  
  private void a(Context paramContext)
  {
    LayoutInflater.from(paramContext).inflate(2130903506, this);
    setOrientation(0);
    this.d = ((TextView)findViewById(2131560904));
    this.d.setOnClickListener(new nb(this));
    this.e = ((TextView)findViewById(2131558864));
    this.e.setOnClickListener(new nc(this));
    a(0);
  }
  
  public int getSwitchSide()
  {
    return this.f;
  }
  
  public void setButtonSwitchListener(nd paramnd)
  {
    this.a = paramnd;
  }
  
  public void setSelectButton(int paramInt)
  {
    this.f = paramInt;
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.d.setSelected(true);
      this.e.setSelected(false);
      return;
    }
    com.android.dazhihui.ui.delegate.b.o.r = false;
    this.d.setSelected(false);
    this.e.setSelected(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\TradeSwitchButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */