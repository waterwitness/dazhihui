package com.android.dazhihui.ui.delegate.screen;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.s;

class gn
  extends s
{
  gn(TradeOutsideScreen paramTradeOutsideScreen, i parami, int paramInt)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    this.b.getSharedPreferences("NoticeListRefreshTime", 0).edit().putString("NoticeListRefreshTime", String.valueOf(this.a)).commit();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */