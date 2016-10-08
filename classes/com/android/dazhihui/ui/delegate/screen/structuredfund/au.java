package com.android.dazhihui.ui.delegate.screen.structuredfund;

import java.util.Comparator;

final class au
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
    return (int)(Double.valueOf(paramArrayOfString1[0]).doubleValue() - Double.valueOf(paramArrayOfString2[0]).doubleValue());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */