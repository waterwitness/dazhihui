package com.tencent.imcore;

public final class SessionType
{
  public static final SessionType kC2C;
  public static final SessionType kGroup;
  public static final SessionType kNull = new SessionType("kNull", internalJNI.kNull_get());
  public static final SessionType kSystemSessionType;
  private static int swigNext = 0;
  private static SessionType[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kC2C = new SessionType("kC2C");
    kGroup = new SessionType("kGroup");
    kSystemSessionType = new SessionType("kSystemSessionType");
    swigValues = new SessionType[] { kNull, kC2C, kGroup, kSystemSessionType };
  }
  
  private SessionType(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private SessionType(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private SessionType(String paramString, SessionType paramSessionType)
  {
    this.swigName = paramString;
    this.swigValue = paramSessionType.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static SessionType swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + SessionType.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\SessionType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */