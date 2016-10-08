package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class c
  implements AdapterView.OnItemClickListener
{
  c(AppendList paramAppendList) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((AppendList.a(this.a) != null) && (AppendList.b(this.a) == 1000) && (AppendList.c(this.a))) {
      AppendList.a(this.a).a(this.a, paramView, paramInt, paramLong);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */