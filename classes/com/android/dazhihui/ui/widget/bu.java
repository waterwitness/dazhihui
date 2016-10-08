package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

class bu
  extends Handler
{
  bu(DropDownEditTextView2 paramDropDownEditTextView2) {}
  
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
      } while ((this.a.c == null) || (DropDownEditTextView2.e(this.a) == null) || (DropDownEditTextView2.e(this.a).size() <= 0) || (DropDownEditTextView2.g(this.a) == -1));
      this.a.c.a((String)DropDownEditTextView2.e(this.a).get(DropDownEditTextView2.g(this.a)), DropDownEditTextView2.g(this.a));
      return;
    } while (this.a.e == null);
    this.a.e.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */