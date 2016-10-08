package com.android.dazhihui.ui.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;

class nk
  implements AdapterView.OnItemClickListener
{
  nk(WebViewJsAndAndroid paramWebViewJsAndAndroid, String[] paramArrayOfString) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.b.jumpGoto(this.a[paramInt]);
    WebViewJsAndAndroid.j(this.b).dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\nk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */