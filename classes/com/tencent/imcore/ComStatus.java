package com.tencent.imcore;

public final class ComStatus
{
  public static final ComStatus kClose;
  public static final ComStatus kNotSet = new ComStatus("kNotSet", internalJNI.kNotSet_get());
  public static final ComStatus kOpen;
  private static int swigNext = 0;
  private static ComStatus[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kClose = new ComStatus("kClose", internalJNI.kClose_get());
    kOpen = new ComStatus("kOpen", internalJNI.kOpen_get());
    swigValues = new ComStatus[] { kNotSet, kClose, kOpen };
  }
  
  private ComStatus(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private ComStatus(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private ComStatus(String paramString, ComStatus paramComStatus)
  {
    this.swigName = paramString;
    this.swigValue = paramComStatus.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static ComStatus swigToEnum(int paramInt)
  {
    if ((paramInt < swigValues.length) && (paramInt >= 0) && (swigValues[paramInt].swigValue == paramInt)) {
      return swigValues[paramInt];
    }
    int i = 0;
    while (i < swigValues.length)
    {
      if (swigValues[i].swigValue == paramInt) {
        return swigValues[i];
      }
      i += 1;
    }
    throw new IllegalArgumentException("No enum " + ComStatus.class + " with value " + paramInt);
  }
  
  public final int swigValue()
  {
    return this.swigValue;
  }
  
  public final String toString()
  {
    return this.swigName;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\ComStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */