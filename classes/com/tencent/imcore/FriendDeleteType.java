package com.tencent.imcore;

public final class FriendDeleteType
{
  public static final FriendDeleteType FirendDeleteBothType;
  public static final FriendDeleteType FriendDeleteSingleType = new FriendDeleteType("FriendDeleteSingleType", internalJNI.FriendDeleteSingleType_get());
  private static int swigNext = 0;
  private static FriendDeleteType[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    FirendDeleteBothType = new FriendDeleteType("FirendDeleteBothType", internalJNI.FirendDeleteBothType_get());
    swigValues = new FriendDeleteType[] { FriendDeleteSingleType, FirendDeleteBothType };
  }
  
  private FriendDeleteType(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private FriendDeleteType(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private FriendDeleteType(String paramString, FriendDeleteType paramFriendDeleteType)
  {
    this.swigName = paramString;
    this.swigValue = paramFriendDeleteType.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static FriendDeleteType swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + FriendDeleteType.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FriendDeleteType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */