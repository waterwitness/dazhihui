package com.android.dazhihui.ui.screen.stock;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.adv.ai;
import com.android.dazhihui.w;

class cj
  extends ai
{
  cj(bs parambs, int paramInt)
  {
    super(paramInt);
  }
  
  public void a()
  {
    bs.a(this.a, true);
    String str = "";
    if (w.a().l()) {
      str = w.a().f();
    }
    FragmentActivity localFragmentActivity = this.a.getActivity();
    this.a.getActivity();
    int i = localFragmentActivity.getSharedPreferences("DzhPush", 0).getInt("MY_BBS" + str, 0);
    bs.h(this.a).setText("" + i);
    bs.h(this.a).setVisibility(0);
    if (i == 0) {
      bs.h(this.a).setVisibility(8);
    }
  }
  
  public void b()
  {
    bs.a(this.a, false);
    bs.h(this.a).setVisibility(8);
    String str = "";
    if (w.a().l()) {
      str = w.a().f();
    }
    FragmentActivity localFragmentActivity = this.a.getActivity();
    this.a.getActivity();
    localFragmentActivity.getSharedPreferences("DzhPush", 0).edit().putInt("MY_BBS" + str, 0).commit();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */