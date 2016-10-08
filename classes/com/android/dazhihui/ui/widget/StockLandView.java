package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;

public class StockLandView
  extends LinearLayout
  implements View.OnClickListener
{
  private DisplayMetrics a;
  private TextView[] b = new TextView[6];
  private View[] c = new View[4];
  private lh d;
  
  public StockLandView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public StockLandView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public StockLandView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = (WindowManager)paramContext.getSystemService("window");
    this.a = new DisplayMetrics();
    paramContext.getDefaultDisplay().getMetrics(this.a);
    a();
    a(g.a().b());
  }
  
  public int a(int[] paramArrayOfInt)
  {
    this.b[4].getLocationOnScreen(paramArrayOfInt);
    return this.b[4].getWidth();
  }
  
  public void a()
  {
    View localView = LayoutInflater.from(getContext()).inflate(2130903310, null);
    this.b[0] = ((TextView)localView.findViewById(2131560000));
    this.b[1] = ((TextView)localView.findViewById(2131560002));
    this.b[2] = ((TextView)localView.findViewById(2131560004));
    this.b[3] = ((TextView)localView.findViewById(2131560006));
    this.b[4] = ((TextView)localView.findViewById(2131560008));
    this.b[5] = ((TextView)localView.findViewById(2131560009));
    this.c[0] = localView.findViewById(2131560001);
    this.c[1] = localView.findViewById(2131560003);
    this.c[2] = localView.findViewById(2131560005);
    this.c[3] = localView.findViewById(2131560007);
    int i = 0;
    while (i < 6)
    {
      this.b[i].setOnClickListener(this);
      i += 1;
    }
    addView(localView, new LinearLayout.LayoutParams(-1, -2));
  }
  
  public void a(y paramy)
  {
    int i = 0;
    int j = 0;
    if (paramy == y.a)
    {
      i = j;
      while (i < 6)
      {
        this.b[i].setBackgroundDrawable(getResources().getDrawable(2130838399));
        this.b[i].setTextColor(getResources().getColorStateList(2131493707));
        if (i < 4) {
          this.c[i].setBackgroundColor(-13157550);
        }
        i += 1;
      }
    }
    while (i < 6)
    {
      this.b[i].setBackgroundDrawable(getResources().getDrawable(2130838400));
      this.b[i].setTextColor(getResources().getColorStateList(2131493708));
      if (i < 4) {
        this.c[i].setBackgroundColor(-2697514);
      }
      if (i == 5) {
        this.b[i].setBackgroundDrawable(new ColorDrawable(-7292952));
      }
      i += 1;
    }
  }
  
  public void a(boolean paramBoolean) {}
  
  public TextView getTextView()
  {
    return this.b[4];
  }
  
  public int getViewHeight()
  {
    return this.b[4].getHeight();
  }
  
  public void onClick(View paramView)
  {
    if (this.d == null) {
      return;
    }
    switch (paramView.getId())
    {
    case 2131560001: 
    case 2131560003: 
    case 2131560005: 
    case 2131560007: 
    default: 
      return;
    case 2131560000: 
      this.d.a(0);
      setSelected(0);
      return;
    case 2131560002: 
      this.d.a(1);
      setSelected(1);
      return;
    case 2131560004: 
      this.d.a(2);
      setSelected(2);
      return;
    case 2131560006: 
      this.d.a(3);
      setSelected(3);
      return;
    case 2131560008: 
      this.d.a(4);
      return;
    }
    this.d.a(5);
  }
  
  public void setEnable(boolean paramBoolean)
  {
    this.b[0].setClickable(paramBoolean);
  }
  
  public void setOnChildListener(lh paramlh)
  {
    this.d = paramlh;
  }
  
  public void setSelected(int paramInt)
  {
    int i = 0;
    if (i < this.b.length)
    {
      if (i == paramInt) {
        this.b[i].setSelected(true);
      }
      for (;;)
      {
        i += 1;
        break;
        this.b[i].setSelected(false);
      }
    }
    if (paramInt < 4) {
      setViewText(getResources().getString(2131165386));
    }
  }
  
  public void setViewText(String paramString)
  {
    this.b[4].setText(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\StockLandView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */