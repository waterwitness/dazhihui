package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.w;

class uk
  implements AdapterView.OnItemClickListener
{
  uk(SettingThirdScreen paramSettingThirdScreen) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((!SettingThirdScreen.b(this.a)) && (w.a().l()) && (!TextUtils.isEmpty(w.a().f())) && (w.a().i() != null) && (w.a().j().length > 0) && (paramInt != 1) && (paramInt == 3)) {}
    new Handler().postDelayed(new ul(this, paramInt), 500L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\uk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */