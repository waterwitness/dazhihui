package com.android.dazhihui.ui.delegate.screen.hk;

import java.util.Comparator;

final class ae
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
    if (paramArrayOfString2[2].length() == 0)
    {
      paramArrayOfString2 = "0";
      if (paramArrayOfString1[2].length() != 0) {
        break label72;
      }
    }
    label72:
    for (paramArrayOfString1 = "0";; paramArrayOfString1 = paramArrayOfString1[1])
    {
      return (int)(Double.valueOf(paramArrayOfString2).doubleValue() - Double.valueOf(paramArrayOfString1).doubleValue());
      paramArrayOfString2 = paramArrayOfString2[1];
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */