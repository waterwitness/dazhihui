package com.android.dazhihui.ui.screen.stock;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.app.FragmentActivity;
import com.android.dazhihui.ui.widget.adv.ai;
import com.android.dazhihui.w;
import java.util.ArrayList;

class fx
  extends ai
{
  fx(fu paramfu, int paramInt)
  {
    super(paramInt);
  }
  
  public void a()
  {
    int i = 0;
    fu.a(this.a, true);
    String str = "";
    if (w.a().l()) {
      str = w.a().f();
    }
    FragmentActivity localFragmentActivity = this.a.getActivity();
    this.a.getActivity();
    int j = localFragmentActivity.getSharedPreferences("DzhPush", 0).getInt("MY_BBS" + str, 0);
    if ((fu.f(this.a) != null) && (fu.f(this.a).size() > 0)) {
      while (i < fu.f(this.a).size())
      {
        if (((gf)fu.f(this.a).get(i)).e == 20225)
        {
          fu.a(this.a, j);
          ((gf)fu.f(this.a).get(i)).b = j;
        }
        i += 1;
      }
    }
    fu.g(this.a).notifyDataSetChanged();
  }
  
  public void b()
  {
    fu.a(this.a, false);
    String str = "";
    if (w.a().l()) {
      str = w.a().f();
    }
    FragmentActivity localFragmentActivity = this.a.getActivity();
    this.a.getActivity();
    localFragmentActivity.getSharedPreferences("DzhPush", 0).edit().putInt("MY_BBS" + str, 0).commit();
    fu.a(this.a, 0);
    if ((fu.f(this.a) != null) && (fu.f(this.a).size() > 0))
    {
      int i = 0;
      while (i < fu.f(this.a).size())
      {
        if (((gf)fu.f(this.a).get(i)).e == 20225) {
          ((gf)fu.f(this.a).get(i)).b = 0;
        }
        i += 1;
      }
    }
    fu.g(this.a).notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */