package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import com.android.dazhihui.ui.widget.bz;

class eb
  implements bz
{
  eb(dy paramdy) {}
  
  public void a(String paramString)
  {
    new AlertDialog.Builder(this.a.getActivity()).setTitle("确定要删除该账号？").setPositiveButton(2131165363, new ed(this, paramString)).setNegativeButton(2131165331, new ec(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\eb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */