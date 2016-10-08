package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.c.a.a;

class dn
  implements AdapterView.OnItemClickListener
{
  dn(RemoveAccount paramRemoveAccount) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    RemoveAccount.a(this.a, paramInt);
    if (a.E != null) {
      new AlertDialog.Builder(this.a).setTitle("确定要删除\n" + a.E[RemoveAccount.b(this.a)][0] + "--" + a.E[RemoveAccount.b(this.a)][2]).setPositiveButton(2131165363, new dp(this)).setNegativeButton(2131165331, new do(this)).show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */