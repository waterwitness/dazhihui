package com.d.a.c;

import android.net.Uri;
import com.d.a.a.c;
import com.d.a.af;
import com.d.a.b.b;
import com.d.a.b.n;
import java.net.InetAddress;

class aj
  extends n<af, InetAddress[]>
{
  Exception a;
  
  aj(ai paramai, l paraml, Uri paramUri, int paramInt) {}
  
  protected void a(InetAddress[] paramArrayOfInetAddress)
  {
    b localb = new b(new ak(this, this.c, this.m, this.n));
    int j = paramArrayOfInetAddress.length;
    int i = 0;
    for (;;)
    {
      if (i >= j)
      {
        localb.b();
        return;
      }
      InetAddress localInetAddress = paramArrayOfInetAddress[i];
      String str = String.format("%s:%s", new Object[] { localInetAddress, Integer.valueOf(this.n) });
      localb.a(new al(this, this.c, str, localInetAddress, this.n, this.m));
      i += 1;
    }
  }
  
  protected void b(Exception paramException)
  {
    super.b(paramException);
    this.b.a(this.c, this.m, this.n, false, this.c.a).a(paramException, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\c\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */