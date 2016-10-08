package com.android.dazhihui.ui.delegate.newtrade.widge;

import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.newtrade.b.b;
import java.util.Comparator;

final class a
  implements Comparator<b>
{
  public int a(b paramb1, b paramb2)
  {
    if ((paramb1 == null) || (paramb1.c == null)) {}
    do
    {
      return -1;
      if ((paramb2 == null) || (paramb2.c == null)) {
        return 1;
      }
    } while (n.w(paramb1.c) - n.w(paramb2.c) > 0.0F);
    return 1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */