package com.android.dazhihui.ui.delegate.screen.structuredfund;

import java.util.Comparator;

final class m
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
    if ((int)(Double.valueOf(paramArrayOfString2[i.h()]).doubleValue() - Double.valueOf(paramArrayOfString1[i.h()]).doubleValue()) == 0) {
      return (int)(Double.valueOf(paramArrayOfString1[i.i()]).doubleValue() - Double.valueOf(paramArrayOfString2[i.i()]).doubleValue());
    }
    return (int)(Double.valueOf(paramArrayOfString2[i.h()]).doubleValue() - Double.valueOf(paramArrayOfString1[i.h()]).doubleValue());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */