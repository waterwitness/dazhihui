package com.android.dazhihui.ui.delegate.screen.hk;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.widget.EditText;

class am
  extends Handler
{
  am(HKEntrust paramHKEntrust) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      HKEntrust.d(this.a);
      HKEntrust.e(this.a);
      String str = HKEntrust.b(this.a).getText().toString().toUpperCase();
      if (!TextUtils.isEmpty(str)) {
        HKEntrust.a(this.a, str);
      }
      this.a.a(true, true);
      continue;
      this.a.a(true, true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */