package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;

class d
  implements AdapterView.OnItemLongClickListener
{
  d(AppendList paramAppendList) {}
  
  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((AppendList.d(this.a) != null) && (AppendList.b(this.a) == 1000) && (AppendList.c(this.a))) {
      return AppendList.d(this.a).a(this.a, paramView, paramInt, paramLong);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */