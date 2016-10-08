package com.tencent.imsdk;

import android.content.Context;
import android.util.Log;
import com.tencent.IMCoreWrapper;
import com.tencent.TIMLogListener;
import com.tencent.imcore.IMCore;
import com.tencent.imcore.LogLevel;

public class QLog
{
  public static final int CLR = 2;
  public static final int DEV = 4;
  public static final String ERR_KEY = "imsdk_error|";
  public static final int LOG_ITEM_MAX_CACHE_SIZE = 50;
  public static final int USR = 1;
  public static String sBuildNumber = "";
  
  public static void d(String paramString1, int paramInt, String paramString2)
  {
    if ((IMMsfCoreProxy.get().getMode() == 1) && (IMCoreWrapper.get().isLogInited()))
    {
      IMCore.get().lOGGERLOG(LogLevel.kDebug.swigValue(), "", 0, "", paramString1, paramString2);
      return;
    }
    QLogImpl.d(paramString1, paramInt, paramString2, null);
  }
  
  public static void d(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    QLogImpl.d(paramString1, paramInt, paramString2, paramThrowable);
  }
  
  public static void dfile(String paramString1, int paramInt, String paramString2)
  {
    if ((IMMsfCoreProxy.get().getMode() == 1) && (IMCoreWrapper.get().isLogInited()))
    {
      IMCore.get().lOGGERLOG(LogLevel.kDebug.swigValue(), "", 0, "", paramString1, paramString2);
      return;
    }
    QLogImpl.dfile(paramString1, paramInt, paramString2);
  }
  
  public static void e(String paramString1, int paramInt, String paramString2)
  {
    if ((IMMsfCoreProxy.get().getMode() == 1) && (IMCoreWrapper.get().isLogInited()))
    {
      IMCore.get().lOGGERLOG(LogLevel.kError.swigValue(), "", 0, "", paramString1, paramString2);
      return;
    }
    QLogImpl.e(paramString1, paramInt, paramString2, null);
  }
  
  public static void e(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    QLogImpl.e(paramString1, paramInt, paramString2, paramThrowable);
  }
  
  public static void efile(String paramString1, int paramInt, String paramString2)
  {
    if ((IMMsfCoreProxy.get().getMode() == 1) && (IMCoreWrapper.get().isLogInited()))
    {
      IMCore.get().lOGGERLOG(LogLevel.kError.swigValue(), "", 0, "", paramString1, paramString2);
      return;
    }
    QLogImpl.efile(paramString1, paramInt, paramString2);
  }
  
  public static String getStackTraceString(Throwable paramThrowable)
  {
    return Log.getStackTraceString(paramThrowable);
  }
  
  public static void i(String paramString1, int paramInt, String paramString2)
  {
    if ((IMMsfCoreProxy.get().getMode() == 1) && (IMCoreWrapper.get().isLogInited()))
    {
      IMCore.get().lOGGERLOG(LogLevel.kInfo.swigValue(), "", 0, "", paramString1, paramString2);
      return;
    }
    QLogImpl.i(paramString1, paramInt, paramString2, null);
  }
  
  public static void i(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    QLogImpl.i(paramString1, paramInt, paramString2, paramThrowable);
  }
  
  public static void ifile(String paramString1, int paramInt, String paramString2)
  {
    if ((IMMsfCoreProxy.get().getMode() == 1) && (IMCoreWrapper.get().isLogInited()))
    {
      IMCore.get().lOGGERLOG(LogLevel.kInfo.swigValue(), "", 0, "", paramString1, paramString2);
      return;
    }
    QLogImpl.ifile(paramString1, paramInt, paramString2);
  }
  
  public static void init(Context paramContext)
  {
    QLogImpl.init(paramContext);
  }
  
  public static boolean isColorLevel()
  {
    return QLogImpl.isColorUser();
  }
  
  public static boolean isDevelopLevel()
  {
    return QLogImpl.isDEVELOPER();
  }
  
  public static void p(String paramString1, String paramString2)
  {
    QLogImpl.p(paramString1, paramString2);
  }
  
  public static void setSdkLogListener(TIMLogListener paramTIMLogListener)
  {
    QLogImpl.setSdkLogListener(paramTIMLogListener);
  }
  
  public static void w(String paramString1, int paramInt, String paramString2)
  {
    if ((IMMsfCoreProxy.get().getMode() == 1) && (IMCoreWrapper.get().isLogInited()))
    {
      IMCore.get().lOGGERLOG(LogLevel.kWarn.swigValue(), "", 0, "", paramString1, paramString2);
      return;
    }
    QLogImpl.w(paramString1, paramInt, paramString2, null);
  }
  
  public static void w(String paramString1, int paramInt, String paramString2, Throwable paramThrowable)
  {
    QLogImpl.w(paramString1, paramInt, paramString2, paramThrowable);
  }
  
  public static void wfile(String paramString1, int paramInt, String paramString2)
  {
    if ((IMMsfCoreProxy.get().getMode() == 1) && (IMCoreWrapper.get().isLogInited()))
    {
      IMCore.get().lOGGERLOG(LogLevel.kWarn.swigValue(), "", 0, "", paramString1, paramString2);
      return;
    }
    QLogImpl.wfile(paramString1, paramInt, paramString2);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imsdk\QLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */