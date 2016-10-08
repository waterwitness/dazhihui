package com.baidu.location.h;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import com.baidu.location.f;

class o
  extends Handler
{
  o(a parama) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (!f.f) {}
    do
    {
      return;
      switch (paramMessage.what)
      {
      default: 
        return;
      case 1: 
        a.a(this.a, (Location)paramMessage.obj);
        return;
      }
    } while (a.a(this.a) == null);
    a.a(this.a).a((String)paramMessage.obj);
    return;
    a.a(this.a, "&og=1", (Location)paramMessage.obj);
    return;
    a.a(this.a, "&og=2", (Location)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */