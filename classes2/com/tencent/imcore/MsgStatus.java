package com.tencent.imcore;

public final class MsgStatus
{
  public static final MsgStatus kHasDeleted;
  public static final MsgStatus kSendFail;
  public static final MsgStatus kSendSucc;
  public static final MsgStatus kSending = new MsgStatus("kSending", internalJNI.kSending_get());
  private static int swigNext = 0;
  private static MsgStatus[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kSendSucc = new MsgStatus("kSendSucc", internalJNI.kSendSucc_get());
    kSendFail = new MsgStatus("kSendFail", internalJNI.kSendFail_get());
    kHasDeleted = new MsgStatus("kHasDeleted", internalJNI.kHasDeleted_get());
    swigValues = new MsgStatus[] { kSending, kSendSucc, kSendFail, kHasDeleted };
  }
  
  private MsgStatus(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private MsgStatus(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private MsgStatus(String paramString, MsgStatus paramMsgStatus)
  {
    this.swigName = paramString;
    this.swigValue = paramMsgStatus.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static MsgStatus swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + MsgStatus.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\MsgStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */