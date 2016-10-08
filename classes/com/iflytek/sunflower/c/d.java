package com.iflytek.sunflower.c;

import android.content.Context;
import com.iflytek.sunflower.a.c;
import com.iflytek.sunflower.config.a;
import com.iflytek.sunflower.f;
import com.iflytek.sunflower.task.g;
import java.io.PrintWriter;
import java.io.StringWriter;

public class d
  implements Thread.UncaughtExceptionHandler
{
  private static d c;
  private Thread.UncaughtExceptionHandler a;
  private Context b;
  
  private d(Context paramContext)
  {
    if (Thread.getDefaultUncaughtExceptionHandler() != this)
    {
      this.a = Thread.getDefaultUncaughtExceptionHandler();
      Thread.setDefaultUncaughtExceptionHandler(this);
      this.b = paramContext.getApplicationContext();
    }
  }
  
  private String a(Throwable paramThrowable)
  {
    if (paramThrowable == null) {
      return null;
    }
    try
    {
      StringWriter localStringWriter = new StringWriter();
      PrintWriter localPrintWriter = new PrintWriter(localStringWriter);
      paramThrowable.printStackTrace(localPrintWriter);
      localPrintWriter.close();
      paramThrowable = localStringWriter.toString();
      return paramThrowable;
    }
    catch (Exception paramThrowable)
    {
      paramThrowable.printStackTrace();
    }
    return null;
  }
  
  public static void a(Context paramContext)
  {
    if (c == null) {
      c = new d(paramContext);
    }
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    if (a.j.booleanValue())
    {
      String str = a(paramThrowable);
      c localc = new c();
      localc.a = a.f;
      localc.b = e.a(str);
      localc.c = System.currentTimeMillis();
      f.a(localc);
    }
    new g(this.b).a();
    if (this.a != null) {
      this.a.uncaughtException(paramThread, paramThrowable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\c\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */