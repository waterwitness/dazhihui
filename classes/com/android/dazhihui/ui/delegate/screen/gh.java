package com.android.dazhihui.ui.delegate.screen;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.FragmentActivity;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.s;

class gh
  extends s
{
  gh(gc paramgc, i parami, int paramInt)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    if (this.b.getActivity() != null) {
      this.b.getActivity().getSharedPreferences("NoticeListRefreshTime", 0).edit().putString("NoticeListRefreshTime", String.valueOf(this.a)).commit();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */