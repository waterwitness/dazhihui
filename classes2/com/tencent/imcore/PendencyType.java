package com.tencent.imcore;

public final class PendencyType
{
  public static final PendencyType PendencyTypeBoth;
  public static final PendencyType PendencyTypeComeIn = new PendencyType("PendencyTypeComeIn", internalJNI.PendencyTypeComeIn_get());
  public static final PendencyType PendencyTypeSendOut = new PendencyType("PendencyTypeSendOut", internalJNI.PendencyTypeSendOut_get());
  private static int swigNext = 0;
  private static PendencyType[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    PendencyTypeBoth = new PendencyType("PendencyTypeBoth", internalJNI.PendencyTypeBoth_get());
    swigValues = new PendencyType[] { PendencyTypeComeIn, PendencyTypeSendOut, PendencyTypeBoth };
  }
  
  private PendencyType(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private PendencyType(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private PendencyType(String paramString, PendencyType paramPendencyType)
  {
    this.swigName = paramString;
    this.swigValue = paramPendencyType.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static PendencyType swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + PendencyType.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\PendencyType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */