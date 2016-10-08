package com.tencent.av.utils;

public class ArrayUtils
{
  public static boolean contains(int[] paramArrayOfInt, int paramInt)
  {
    return indexOf(paramArrayOfInt, paramInt) != -1;
  }
  
  public static boolean contains(Object[] paramArrayOfObject, Object paramObject)
  {
    return indexOf(paramArrayOfObject, paramObject) != -1;
  }
  
  public static int indexOf(int[] paramArrayOfInt, int paramInt)
  {
    return indexOf(paramArrayOfInt, paramInt, 0);
  }
  
  public static int indexOf(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    if (paramArrayOfInt == null)
    {
      paramInt2 = -1;
      return paramInt2;
    }
    int i = paramInt2;
    if (paramInt2 < 0) {
      i = 0;
    }
    for (;;)
    {
      if (i >= paramArrayOfInt.length) {
        break label38;
      }
      paramInt2 = i;
      if (paramInt1 == paramArrayOfInt[i]) {
        break;
      }
      i += 1;
    }
    label38:
    return -1;
  }
  
  public static int indexOf(Object[] paramArrayOfObject, Object paramObject)
  {
    return indexOf(paramArrayOfObject, paramObject, 0);
  }
  
  public static int indexOf(Object[] paramArrayOfObject, Object paramObject, int paramInt)
  {
    if (paramArrayOfObject == null)
    {
      paramInt = -1;
      return paramInt;
    }
    if (paramInt < 0) {
      paramInt = 0;
    }
    for (;;)
    {
      int i;
      if (paramObject == null)
      {
        i = paramInt;
        for (;;)
        {
          if (i >= paramArrayOfObject.length) {
            break label82;
          }
          paramInt = i;
          if (paramArrayOfObject[i] == null) {
            break;
          }
          i += 1;
        }
      }
      if (paramArrayOfObject.getClass().getComponentType().isInstance(paramObject))
      {
        i = paramInt;
        for (;;)
        {
          if (i >= paramArrayOfObject.length) {
            break label82;
          }
          paramInt = i;
          if (paramObject.equals(paramArrayOfObject[i])) {
            break;
          }
          i += 1;
        }
      }
      label82:
      return -1;
    }
  }
  
  public static int lastIndexOf(Object[] paramArrayOfObject, Object paramObject)
  {
    return lastIndexOf(paramArrayOfObject, paramObject, Integer.MAX_VALUE);
  }
  
  public static int lastIndexOf(Object[] paramArrayOfObject, Object paramObject, int paramInt)
  {
    if (paramArrayOfObject == null) {}
    while (paramInt < 0) {
      return -1;
    }
    if (paramInt >= paramArrayOfObject.length) {
      paramInt = paramArrayOfObject.length - 1;
    }
    for (;;)
    {
      if (paramObject == null)
      {
        while (paramInt >= 0)
        {
          if (paramArrayOfObject[paramInt] == null) {
            return paramInt;
          }
          paramInt -= 1;
        }
        break;
      }
      if (!paramArrayOfObject.getClass().getComponentType().isInstance(paramObject)) {
        break;
      }
      while (paramInt >= 0)
      {
        if (paramObject.equals(paramArrayOfObject[paramInt])) {
          return paramInt;
        }
        paramInt -= 1;
      }
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\utils\ArrayUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */