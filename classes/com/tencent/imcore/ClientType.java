package com.tencent.imcore;

public final class ClientType
{
  public static final ClientType eAndroid;
  public static final ClientType eIOS;
  public static final ClientType ePC = new ClientType("ePC", internalJNI.ePC_get());
  private static int swigNext = 0;
  private static ClientType[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    eIOS = new ClientType("eIOS", internalJNI.eIOS_get());
    eAndroid = new ClientType("eAndroid", internalJNI.eAndroid_get());
    swigValues = new ClientType[] { ePC, eIOS, eAndroid };
  }
  
  private ClientType(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private ClientType(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private ClientType(String paramString, ClientType paramClientType)
  {
    this.swigName = paramString;
    this.swigValue = paramClientType.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static ClientType swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + ClientType.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\ClientType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */