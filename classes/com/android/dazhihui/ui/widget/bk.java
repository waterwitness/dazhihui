package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

class bk
  extends Handler
{
  bk(DropDownEditTextView paramDropDownEditTextView) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    }
    do
    {
      do
      {
        return;
      } while ((this.a.c == null) || (DropDownEditTextView.e(this.a) == null) || (DropDownEditTextView.e(this.a).size() <= 0) || (DropDownEditTextView.g(this.a) == -1));
      this.a.c.a((String)DropDownEditTextView.e(this.a).get(DropDownEditTextView.g(this.a)), DropDownEditTextView.g(this.a));
      return;
    } while (this.a.e == null);
    this.a.e.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */