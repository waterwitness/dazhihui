package com.android.dazhihui.ui.delegate.screen.structuredfund;

import java.util.Comparator;

final class n
  implements Comparator<String[]>
{
  public int a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    if ((paramArrayOfString1 == null) || (paramArrayOfString1.length < 2)) {
      return -1;
    }
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length < 2)) {
      return 1;
    }
    if ((int)(Double.valueOf(paramArrayOfString2[i.k()]).doubleValue() - Double.valueOf(paramArrayOfString1[i.k()]).doubleValue()) == 0) {
      return (int)(Double.valueOf(paramArrayOfString1[i.l()]).doubleValue() - Double.valueOf(paramArrayOfString2[i.l()]).doubleValue());
    }
    return (int)(Double.valueOf(paramArrayOfString2[i.k()]).doubleValue() - Double.valueOf(paramArrayOfString1[i.k()]).doubleValue());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */