package com.android.dazhihui.ui.screen.stock;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.s;

class hj
  extends s
{
  hj(MainScreen paramMainScreen, i parami, int paramInt)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    this.b.getSharedPreferences("NoticeListRefreshTime", 0).edit().putString("NoticeListRefreshTime", String.valueOf(this.a)).commit();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\hj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */