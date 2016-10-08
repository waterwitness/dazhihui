package com.android.dazhihui.ui.widget;

import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.model.RequestAdapter;

class ft
  extends RequestAdapter
{
  ft(IndexTopWidget paramIndexTopWidget) {}
  
  public void handleResponseEx(h paramh, j paramj)
  {
    this.a.handleResponse(paramh, paramj);
  }
  
  public void handleTimeoutEx(h paramh)
  {
    this.a.handleTimeout(paramh);
  }
  
  public void netExceptionEx(h paramh, Exception paramException)
  {
    this.a.netException(paramh, paramException);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */