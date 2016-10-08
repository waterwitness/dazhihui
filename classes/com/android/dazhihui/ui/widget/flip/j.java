package com.android.dazhihui.ui.widget.flip;

import android.database.DataSetObserver;

class j
  extends DataSetObserver
{
  j(ViewUpFlow paramViewUpFlow) {}
  
  public void onChanged()
  {
    this.a.postDelayed(new k(this), 10L);
  }
  
  public void onInvalidated() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\flip\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */