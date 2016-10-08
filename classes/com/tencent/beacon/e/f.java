package com.tencent.beacon.e;

import android.util.SparseArray;

public final class f<E>
{
  public static SparseArray<E> a(SparseArray<E> paramSparseArray)
  {
    if (paramSparseArray != null)
    {
      SparseArray localSparseArray = new SparseArray(paramSparseArray.size());
      int i = 0;
      while (i < paramSparseArray.size())
      {
        int j = paramSparseArray.keyAt(i);
        localSparseArray.append(j, paramSparseArray.get(j));
        i += 1;
      }
      return localSparseArray;
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */