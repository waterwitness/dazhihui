package com.tencent;

import com.tencent.imcore.ILogMsgCallback;
import com.tencent.imcore.LogLevel;

public class IMCoreLogMsgCallback
  extends ILogMsgCallback
{
  private static String logTag = "imcore_jni";
  private String identifier;
  private TIMLogListener logListener;
  
  public IMCoreLogMsgCallback(TIMLogListener paramTIMLogListener)
  {
    this.logListener = paramTIMLogListener;
    swigReleaseOwnership();
  }
  
  public void onLogMsg(String paramString1, LogLevel paramLogLevel, String paramString2)
  {
    this.logListener.log(paramLogLevel.swigValue(), paramString2, paramString1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\IMCoreLogMsgCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */