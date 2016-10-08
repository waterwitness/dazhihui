package com.baidu.location.e;

import android.os.Handler;
import android.os.Message;
import com.baidu.location.f;

public class d
  extends Handler
{
  public d(b paramb) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (!f.f) {
      return;
    }
    switch (paramMessage.what)
    {
    default: 
      return;
    case 21: 
      this.a.a(paramMessage);
      return;
    }
    this.a.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */