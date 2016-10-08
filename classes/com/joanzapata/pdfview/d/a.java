package com.joanzapata.pdfview.d;

import java.util.ArrayList;
import java.util.List;

public class a
{
  public static int[] a(int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new ArrayList();
    int k = paramArrayOfInt.length;
    int j = -1;
    int i = 0;
    while (i < k)
    {
      Integer localInteger = Integer.valueOf(paramArrayOfInt[i]);
      if (j != localInteger.intValue()) {
        localArrayList.add(localInteger);
      }
      j = localInteger.intValue();
      i += 1;
    }
    paramArrayOfInt = new int[localArrayList.size()];
    i = 0;
    while (i < localArrayList.size())
    {
      paramArrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
      i += 1;
    }
    return paramArrayOfInt;
  }
  
  public static int[] b(int[] paramArrayOfInt)
  {
    int j = 0;
    int[] arrayOfInt = new int[paramArrayOfInt.length];
    if (paramArrayOfInt.length == 0) {
      return arrayOfInt;
    }
    arrayOfInt[0] = paramArrayOfInt[0];
    int i = 1;
    while (i < paramArrayOfInt.length)
    {
      int k = j;
      if (paramArrayOfInt[i] != paramArrayOfInt[(i - 1)]) {
        k = j + 1;
      }
      arrayOfInt[i] = k;
      i += 1;
      j = k;
    }
    return arrayOfInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */