package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;

class vb
  implements AdapterView.OnItemClickListener
{
  vb(uv paramuv) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    uv.c(this.a).dismiss();
    uv.m(this.a).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */