package com.tencent.feedback.anr;

import android.content.Context;
import android.content.Intent;
import android.os.FileObserver;
import android.os.Process;
import com.tencent.feedback.common.a;
import com.tencent.feedback.common.c;
import com.tencent.feedback.common.e;
import com.tencent.feedback.common.service.RQDService;
import com.tencent.feedback.eup.CrashReport;
import com.tencent.feedback.eup.CrashStrategyBean;
import java.util.Date;
import java.util.Map;

public class b
  extends FileObserver
{
  private static b c = null;
  private long a = -1L;
  private Context b;
  
  private b(Context paramContext)
  {
    super("/data/anr/", 8);
    a.h(paramContext);
    Process.myPid();
    if (paramContext == null) {}
    for (;;)
    {
      this.b = paramContext;
      return;
      Context localContext = paramContext.getApplicationContext();
      if (localContext != null) {
        paramContext = localContext;
      }
    }
  }
  
  /* Error */
  public static b a(Context paramContext)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 14	com/tencent/feedback/anr/b:c	Lcom/tencent/feedback/anr/b;
    //   6: ifnonnull +18 -> 24
    //   9: aload_0
    //   10: ifnonnull +23 -> 33
    //   13: new 2	com/tencent/feedback/anr/b
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 49	com/tencent/feedback/anr/b:<init>	(Landroid/content/Context;)V
    //   21: putstatic 14	com/tencent/feedback/anr/b:c	Lcom/tencent/feedback/anr/b;
    //   24: getstatic 14	com/tencent/feedback/anr/b:c	Lcom/tencent/feedback/anr/b;
    //   27: astore_0
    //   28: ldc 2
    //   30: monitorexit
    //   31: aload_0
    //   32: areturn
    //   33: aload_0
    //   34: invokevirtual 46	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   37: astore_1
    //   38: aload_1
    //   39: ifnull -26 -> 13
    //   42: aload_1
    //   43: astore_0
    //   44: goto -31 -> 13
    //   47: astore_0
    //   48: ldc 2
    //   50: monitorexit
    //   51: aload_0
    //   52: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	53	0	paramContext	Context
    //   37	6	1	localContext	Context
    // Exception table:
    //   from	to	target	type
    //   3	9	47	finally
    //   13	24	47	finally
    //   24	28	47	finally
    //   33	38	47	finally
  }
  
  private boolean a()
  {
    boolean bool = false;
    long l2;
    try
    {
      e.b("onTraceFileCloseWrite", new Object[0]);
      l2 = new Date().getTime();
      if (l2 < this.a + 5000L) {
        e.b("already done", new Object[0]);
      }
      for (;;)
      {
        return bool;
        CrashStrategyBean localCrashStrategyBean = CrashReport.getCrashRuntimeStrategy();
        if (localCrashStrategyBean != null) {
          break;
        }
        e.c("not strategy ? init eup ?", new Object[0]);
      }
      bool = ((CrashStrategyBean)localObject).isMerged();
    }
    finally {}
    c localc = c.a(this.b);
    String str;
    label102:
    long l1;
    if (localc != null)
    {
      str = localc.h();
      if (localc == null) {
        break label206;
      }
      l1 = localc.k();
      label112:
      if (localc == null) {
        break label212;
      }
    }
    label206:
    label212:
    for (Map localMap = localc.y();; localMap = null)
    {
      this.a = l2;
      Intent localIntent = new Intent(this.b, RQDService.class);
      localIntent.setAction("com.tencent.feedback.10");
      localIntent.putExtra("com.tencent.feedback.104", new ANRHandleServiceTask(bool, str, localc.p(), l1, localMap));
      this.b.startService(localIntent);
      e.b("start service", new Object[0]);
      bool = true;
      break;
      str = "10000";
      break label102;
      l1 = 0L;
      break label112;
    }
  }
  
  public void onEvent(int paramInt, String paramString)
  {
    e.c("received event %d %s", new Object[] { Integer.valueOf(paramInt), paramString });
    if (!"/data/anr/traces.txt".equals("/data/anr/" + paramString))
    {
      e.c("not anr file %s", new Object[] { paramString });
      return;
    }
    a();
  }
  
  public void stopWatching()
  {
    try
    {
      c = null;
      super.stopWatching();
      return;
    }
    finally {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\anr\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */