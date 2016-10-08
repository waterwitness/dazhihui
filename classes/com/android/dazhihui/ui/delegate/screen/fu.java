package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import com.android.dazhihui.ui.widget.bz;

class fu
  implements bz
{
  fu(fi paramfi) {}
  
  public void a(String paramString)
  {
    new AlertDialog.Builder(this.a.getActivity()).setTitle("确定要删除该账号？").setPositiveButton(2131165363, new fw(this, paramString)).setNegativeButton(2131165331, new fv(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */