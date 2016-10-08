package tencent.tls.report;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import tencent.tls.tools.util;

public class QLog
{
  private static final int DEBUG = 4;
  private static final int ERROR = 1;
  private static final int INFO = 3;
  public static final String TAG = "tls_sdk";
  private static final int WARN = 2;
  private static Method info;
  private static Method log;
  private static Object tim;
  
  private static void _d(String paramString)
  {
    doit(4, paramString);
  }
  
  private static void _i(String paramString)
  {
    doit(3, paramString);
  }
  
  private static void _w(String paramString)
  {
    doit(2, paramString);
  }
  
  public static void d(String paramString)
  {
    _d(wrapMsg(paramString, 0L));
  }
  
  public static void d(String paramString, long paramLong)
  {
    _d(wrapMsg(paramString, paramLong));
  }
  
  private static void doit(int paramInt, String paramString)
  {
    if ((paramInt != 1) && (!util.LOGCAT_OUT)) {
      return;
    }
    try
    {
      if (log == null)
      {
        info.invoke(null, new Object[] { "tls_sdk", Integer.valueOf(1), paramString });
        return;
      }
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
      return;
    }
    log.invoke(tim, new Object[] { Integer.valueOf(paramInt), "tls_sdk", paramString });
  }
  
  public static void e(Throwable paramThrowable)
  {
    StringWriter localStringWriter = new StringWriter();
    PrintWriter localPrintWriter = new PrintWriter(localStringWriter, true);
    paramThrowable.printStackTrace(localPrintWriter);
    localPrintWriter.flush();
    localStringWriter.flush();
    doit(1, localStringWriter.toString());
  }
  
  public static void i(String paramString)
  {
    _i(wrapMsg(paramString, 0L));
  }
  
  public static void i(String paramString, long paramLong)
  {
    _i(wrapMsg(paramString, paramLong));
  }
  
  public static void init()
  {
    try
    {
      tim = Class.forName("com.tencent.TIMManager").getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
      log = tim.getClass().getMethod("log", new Class[] { Integer.TYPE, String.class, String.class });
      return;
    }
    catch (Exception localException)
    {
      e(localException);
    }
  }
  
  public static void initQAL()
  {
    if (info != null) {
      return;
    }
    try
    {
      info = Class.forName("com.tencent.qalsdk.util.QLog").getMethod("i", new Class[] { String.class, Integer.TYPE, String.class });
      return;
    }
    catch (Exception localException1)
    {
      try
      {
        init();
        return;
      }
      catch (Exception localException2)
      {
        e(localException2);
      }
    }
  }
  
  public static void w(String paramString)
  {
    _w(wrapMsg(paramString, 0L));
  }
  
  private static String wrapMsg(String paramString, long paramLong)
  {
    String str1 = "";
    if (paramLong != 0L) {
      str1 = "[" + Long.toHexString(paramLong) + "]";
    }
    String str2 = util.getLineInfo(3);
    return str2 + str1 + paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\report\QLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */