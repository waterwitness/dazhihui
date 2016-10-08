package android.support.v4.app;

import android.app.Notification;

class bu
  extends bt
{
  public Notification a(bn parambn, bo parambo)
  {
    parambo = parambn.B;
    parambo.setLatestEventInfo(parambn.a, parambn.b, parambn.c, parambn.d);
    parambo = ch.a(parambo, parambn.a, parambn.b, parambn.c, parambn.d, parambn.e);
    if (parambn.j > 0) {
      parambo.flags |= 0x80;
    }
    return parambo;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */