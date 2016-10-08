package com.d.a;

import com.d.a.b.l;
import java.net.InetAddress;

class w
  implements Runnable
{
  w(q paramq, String paramString, l paraml) {}
  
  public void run()
  {
    try
    {
      InetAddress[] arrayOfInetAddress = InetAddress.getAllByName(this.b);
      if ((arrayOfInetAddress == null) || (arrayOfInetAddress.length == 0)) {
        throw new av("no addresses for host");
      }
    }
    catch (Exception localException)
    {
      this.a.a(new y(this, this.c, localException));
      return;
    }
    this.a.a(new x(this, this.c, localException));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */