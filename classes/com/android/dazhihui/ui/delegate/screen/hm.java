package com.android.dazhihui.ui.delegate.screen;

import com.android.dazhihui.ui.widget.DropDownEditTextView;
import com.android.dazhihui.ui.widget.bo;

class hm
  implements bo
{
  hm(TransferMenuNew paramTransferMenuNew) {}
  
  public void a(String paramString, int paramInt)
  {
    if (TransferMenuNew.e(this.a) == 0)
    {
      TransferMenuNew.f(this.a).setCurrentPositon(paramInt);
      TransferMenuNew.d(this.a, paramInt);
    }
    do
    {
      return;
      if (TransferMenuNew.e(this.a) == 1)
      {
        TransferMenuNew.g(this.a).setCurrentPositon(paramInt);
        TransferMenuNew.d(this.a, paramInt);
        return;
      }
    } while (TransferMenuNew.e(this.a) != 2);
    TransferMenuNew.h(this.a).setCurrentPositon(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */