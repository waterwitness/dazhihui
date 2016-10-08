package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnLongClickListener;

class u
  implements View.OnLongClickListener
{
  u(OfflineCapitalMine paramOfflineCapitalMine) {}
  
  public boolean onLongClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    switch (paramView.getId())
    {
    }
    for (;;)
    {
      return true;
      paramView = new AlertDialog.Builder(this.a);
      paramView.setTitle("取消同步");
      paramView.setMessage("您确定要取消同步吗？");
      paramView.setPositiveButton("确认", new v(this, i));
      paramView.setNegativeButton("取消", new w(this));
      paramView.show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */