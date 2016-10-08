package com.android.dazhihui.ui.delegate.screen;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;

class bn
  implements View.OnClickListener
{
  bn(EntrustSettingScreen paramEntrustSettingScreen) {}
  
  public void onClick(View paramView)
  {
    n.a("", 1336);
    if (!TextUtils.isEmpty(EntrustSettingScreen.a(this.a))) {
      r.a(EntrustSettingScreen.a(this.a), this.a, null, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */