package com.android.dazhihui.ui.delegate.newtrade;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.delegate.newtrade.b.b;
import java.util.List;

class i
  implements AdapterView.OnItemClickListener
{
  i(h paramh) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((h.a(this.a) == null) || (paramInt >= h.a(this.a).size())) {
      return;
    }
    ((f)this.a.getParentFragment()).a((b)h.a(this.a).get(paramInt), h.b(this.a), h.c(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */