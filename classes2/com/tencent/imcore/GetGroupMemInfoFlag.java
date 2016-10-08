package com.tencent.imcore;

public final class GetGroupMemInfoFlag
{
  public static final GetGroupMemInfoFlag kGetGroupMemInfoNone = new GetGroupMemInfoFlag("kGetGroupMemInfoNone", internalJNI.kGetGroupMemInfoNone_get());
  public static final GetGroupMemInfoFlag kGetGroupMemJionTime = new GetGroupMemInfoFlag("kGetGroupMemJionTime", internalJNI.kGetGroupMemJionTime_get());
  public static final GetGroupMemInfoFlag kGetGroupMemMsgFlag = new GetGroupMemInfoFlag("kGetGroupMemMsgFlag", internalJNI.kGetGroupMemMsgFlag_get());
  public static final GetGroupMemInfoFlag kGetGroupMemMsgSeq = new GetGroupMemInfoFlag("kGetGroupMemMsgSeq", internalJNI.kGetGroupMemMsgSeq_get());
  public static final GetGroupMemInfoFlag kGetGroupMemNameCard;
  public static final GetGroupMemInfoFlag kGetGroupMemRole = new GetGroupMemInfoFlag("kGetGroupMemRole", internalJNI.kGetGroupMemRole_get());
  public static final GetGroupMemInfoFlag kGetGroupMemShutupUntill = new GetGroupMemInfoFlag("kGetGroupMemShutupUntill", internalJNI.kGetGroupMemShutupUntill_get());
  private static int swigNext = 0;
  private static GetGroupMemInfoFlag[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kGetGroupMemNameCard = new GetGroupMemInfoFlag("kGetGroupMemNameCard", internalJNI.kGetGroupMemNameCard_get());
    swigValues = new GetGroupMemInfoFlag[] { kGetGroupMemInfoNone, kGetGroupMemJionTime, kGetGroupMemMsgFlag, kGetGroupMemMsgSeq, kGetGroupMemRole, kGetGroupMemShutupUntill, kGetGroupMemNameCard };
  }
  
  private GetGroupMemInfoFlag(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private GetGroupMemInfoFlag(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private GetGroupMemInfoFlag(String paramString, GetGroupMemInfoFlag paramGetGroupMemInfoFlag)
  {
    this.swigName = paramString;
    this.swigValue = paramGetGroupMemInfoFlag.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static GetGroupMemInfoFlag swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + GetGroupMemInfoFlag.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GetGroupMemInfoFlag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */