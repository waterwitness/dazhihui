package com.d.a;

import com.d.a.a.c;
import com.d.a.b.g;
import com.d.a.b.l;
import java.net.InetAddress;
import java.net.InetSocketAddress;

class v
  implements g<InetAddress>
{
  v(q paramq, c paramc, l paraml, InetSocketAddress paramInetSocketAddress) {}
  
  public void a(Exception paramException, InetAddress paramInetAddress)
  {
    if (paramException != null)
    {
      this.b.a(paramException, null);
      this.c.a(paramException);
      return;
    }
    this.c.a(q.a(this.a, new InetSocketAddress(paramInetAddress, this.d.getPort()), this.b));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */