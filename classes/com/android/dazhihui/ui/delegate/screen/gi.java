package com.android.dazhihui.ui.delegate.screen;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.FragmentActivity;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.s;
import com.android.dazhihui.ui.screen.e;

class gi
  extends s
{
  gi(gc paramgc, i parami, int paramInt)
  {
    super(parami);
  }
  
  public void invokeNextHandle()
  {
    if ((gc.c(this.b) != null) && (((gc.c(this.b) instanceof dy)) || ((gc.c(this.b) instanceof fi)))) {
      gc.c(this.b).refresh();
    }
    if (this.b.getActivity() != null) {
      this.b.getActivity().getSharedPreferences("BrokerListRefreshTime", 0).edit().putString("BrokerListRefreshTime", String.valueOf(this.a)).commit();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\gi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */