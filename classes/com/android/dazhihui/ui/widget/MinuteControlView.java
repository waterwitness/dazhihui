package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.RelativeLayout;

public class MinuteControlView
  extends RelativeLayout
{
  protected DisplayMetrics a = null;
  public View b;
  public MinutePriceView c;
  public MinuteTradeVolumeView d;
  
  public MinuteControlView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinuteControlView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinuteControlView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = (WindowManager)paramContext.getSystemService("window");
    this.a = new DisplayMetrics();
    paramContext.getDefaultDisplay().getMetrics(this.a);
    setBackgroundColor(0);
    a();
  }
  
  private void a()
  {
    View localView = LayoutInflater.from(getContext()).inflate(2130903251, null);
    this.b = localView.findViewById(2131559720);
    this.c = ((MinutePriceView)localView.findViewById(2131559722));
    this.d = ((MinuteTradeVolumeView)localView.findViewById(2131559723));
    addView(localView, new FrameLayout.LayoutParams(-1, -1));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MinuteControlView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */