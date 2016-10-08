package com.android.dazhihui.ui.delegate.newtrade;

import com.android.dazhihui.ui.delegate.newtrade.b.c;
import java.util.Comparator;

final class l
  implements Comparator<c>
{
  public int a(c paramc1, c paramc2)
  {
    if ((paramc1 == null) || (paramc1.a == null)) {
      return -1;
    }
    if ((paramc2 == null) || (paramc2.a == null)) {
      return 1;
    }
    return (int)(Double.valueOf(paramc2.a).doubleValue() - Double.valueOf(paramc1.a).doubleValue());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */