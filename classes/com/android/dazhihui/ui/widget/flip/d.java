package com.android.dazhihui.ui.widget.flip;

import android.database.DataSetObserver;

class d
  extends DataSetObserver
{
  d(ViewFlow paramViewFlow) {}
  
  public void onChanged()
  {
    this.a.postDelayed(new e(this), 10L);
  }
  
  public void onInvalidated() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */