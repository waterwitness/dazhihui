package com.tencent.imcore;

public final class NotifyFlag
{
  public static final NotifyFlag kAllGroupNotify;
  public static final NotifyFlag kAllNotify;
  public static final NotifyFlag kC2CNotify = new NotifyFlag("kC2CNotify", internalJNI.kC2CNotify_get());
  private static int swigNext = 0;
  private static NotifyFlag[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kAllGroupNotify = new NotifyFlag("kAllGroupNotify", internalJNI.kAllGroupNotify_get());
    kAllNotify = new NotifyFlag("kAllNotify", internalJNI.kAllNotify_get());
    swigValues = new NotifyFlag[] { kC2CNotify, kAllGroupNotify, kAllNotify };
  }
  
  private NotifyFlag(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private NotifyFlag(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private NotifyFlag(String paramString, NotifyFlag paramNotifyFlag)
  {
    this.swigName = paramString;
    this.swigValue = paramNotifyFlag.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static NotifyFlag swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + NotifyFlag.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\NotifyFlag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */