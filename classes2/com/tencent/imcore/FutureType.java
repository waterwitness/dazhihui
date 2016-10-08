package com.tencent.imcore;

public final class FutureType
{
  public static final FutureType FutureTypeDecide;
  public static final FutureType FutureTypePendencyComeIn = new FutureType("FutureTypePendencyComeIn", internalJNI.FutureTypePendencyComeIn_get());
  public static final FutureType FutureTypePendencySendOut = new FutureType("FutureTypePendencySendOut", internalJNI.FutureTypePendencySendOut_get());
  public static final FutureType FutureTypeRecommend = new FutureType("FutureTypeRecommend", internalJNI.FutureTypeRecommend_get());
  private static int swigNext = 0;
  private static FutureType[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    FutureTypeDecide = new FutureType("FutureTypeDecide", internalJNI.FutureTypeDecide_get());
    swigValues = new FutureType[] { FutureTypePendencyComeIn, FutureTypePendencySendOut, FutureTypeRecommend, FutureTypeDecide };
  }
  
  private FutureType(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private FutureType(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private FutureType(String paramString, FutureType paramFutureType)
  {
    this.swigName = paramString;
    this.swigValue = paramFutureType.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static FutureType swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + FutureType.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FutureType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */