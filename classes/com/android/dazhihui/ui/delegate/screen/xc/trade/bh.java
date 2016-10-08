package com.android.dazhihui.ui.delegate.screen.xc.trade;

import java.util.Comparator;

final class bh
  implements Comparator<String[]>
{
  public int a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    int j = 1;
    int i;
    if ((paramArrayOfString1 == null) || (paramArrayOfString1.length < 2)) {
      i = -1;
    }
    do
    {
      do
      {
        return i;
        i = j;
      } while (paramArrayOfString2 == null);
      i = j;
    } while (paramArrayOfString2.length < 2);
    return (int)(Double.valueOf(paramArrayOfString2[1]).doubleValue() - Double.valueOf(paramArrayOfString1[1]).doubleValue());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */