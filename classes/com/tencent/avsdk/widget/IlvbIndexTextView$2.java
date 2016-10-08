package com.tencent.avsdk.widget;

import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.model.RequestAdapter;

class IlvbIndexTextView$2
  extends RequestAdapter
{
  IlvbIndexTextView$2(IlvbIndexTextView paramIlvbIndexTextView) {}
  
  public void handleResponseEx(h paramh, j paramj)
  {
    this.this$0.handleResponse(paramh, paramj);
  }
  
  public void handleTimeoutEx(h paramh)
  {
    this.this$0.handleTimeout(paramh);
  }
  
  public void netExceptionEx(h paramh, Exception paramException)
  {
    this.this$0.netException(paramh, paramException);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\IlvbIndexTextView$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */