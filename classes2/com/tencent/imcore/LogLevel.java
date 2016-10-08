package com.tencent.imcore;

public final class LogLevel
{
  public static final LogLevel kDebug;
  public static final LogLevel kError;
  public static final LogLevel kInfo;
  public static final LogLevel kOff = new LogLevel("kOff", internalJNI.kOff_get());
  public static final LogLevel kWarn;
  private static int swigNext = 0;
  private static LogLevel[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kError = new LogLevel("kError");
    kWarn = new LogLevel("kWarn");
    kInfo = new LogLevel("kInfo");
    kDebug = new LogLevel("kDebug");
    swigValues = new LogLevel[] { kOff, kError, kWarn, kInfo, kDebug };
  }
  
  private LogLevel(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private LogLevel(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private LogLevel(String paramString, LogLevel paramLogLevel)
  {
    this.swigName = paramString;
    this.swigValue = paramLogLevel.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static LogLevel swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + LogLevel.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\LogLevel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */