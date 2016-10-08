package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;

public class LabelMenu
  extends LinearLayout
{
  private int a = 1;
  private TextView[] b = new TextView[2];
  private ha c;
  private View.OnClickListener d = new gy(this);
  
  public LabelMenu(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public LabelMenu(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LabelMenu(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b[0] = new TextView(getContext());
    this.b[0].setTextSize(2, 14.0F);
    this.b[0].setGravity(17);
    this.b[0].setTextColor(-1);
    this.b[0].setText(2131165922);
    this.b[1] = new TextView(getContext());
    this.b[1].setTextSize(2, 14.0F);
    this.b[1].setGravity(17);
    this.b[1].setTextColor(-1);
    this.b[1].setText(2131166489);
    paramInt = 0;
    while (paramInt < this.b.length)
    {
      this.b[paramInt].setClickable(true);
      this.b[paramInt].setOnClickListener(this.d);
      paramInt += 1;
    }
    paramContext = new LinearLayout.LayoutParams(-1, -1);
    paramContext.weight = 1.0F;
    addView(this.b[0], paramContext);
    addView(this.b[1], paramContext);
    a();
  }
  
  public void a()
  {
    int i = 0;
    if (i < this.b.length)
    {
      if (i == this.a) {
        this.b[i].setBackgroundResource(2130838572);
      }
      for (;;)
      {
        i += 1;
        break;
        this.b[i].setBackgroundDrawable(new ColorDrawable(0));
      }
    }
  }
  
  public void a(y paramy)
  {
    int j = 0;
    int i = 0;
    if (paramy != null) {
      switch (gz.a[paramy.ordinal()])
      {
      }
    }
    for (;;)
    {
      return;
      while (i < this.b.length)
      {
        this.b[i].setTextColor(-1);
        i += 1;
      }
      while (j < this.b.length)
      {
        this.b[j].setTextColor(-14540254);
        j += 1;
      }
    }
  }
  
  public void setOnChangeListener(ha paramha)
  {
    this.c = paramha;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\LabelMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */