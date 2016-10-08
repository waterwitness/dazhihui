package com.iflytek.thirdparty;

import android.database.ContentObserver;
import android.os.Handler;

class av$a
  extends ContentObserver
{
  public av$a(av paramav, Handler paramHandler)
  {
    super(paramHandler);
  }
  
  public void onChange(boolean paramBoolean)
  {
    X.a("iFly_ContactManager", "ContactObserver_Contact| onChange");
    if (System.currentTimeMillis() - av.b(this.a) < 5000L)
    {
      X.a("iFly_ContactManager", "onChange too much");
      return;
    }
    av.a(this.a, System.currentTimeMillis());
    av.a(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\av$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */