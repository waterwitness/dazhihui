package com.android.dazhihui.ui.widget;

class hr
  implements Runnable
{
  hr(MinuteTradeVolumeView paramMinuteTradeVolumeView) {}
  
  public void run()
  {
    this.a.invalidate();
    MinuteTradeVolumeView.a(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */