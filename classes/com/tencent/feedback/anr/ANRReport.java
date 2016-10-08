package com.tencent.feedback.anr;

import android.content.Context;
import com.tencent.feedback.eup.CrashReport;
import com.tencent.feedback.eup.CrashStrategyBean;

public class ANRReport
{
  public static void startANRMonitor(Context paramContext)
  {
    b.a(paramContext).startWatching();
  }
  
  public static void stopANRMonitor()
  {
    if (b.a(null) != null) {
      b.a(null).stopWatching();
    }
  }
  
  public static boolean uploadANRInfo(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, long paramLong)
  {
    com.tencent.feedback.common.c localc = com.tencent.feedback.common.c.a(paramContext);
    if (localc == null)
    {
      com.tencent.feedback.common.e.d("commonInfo is null not init ?", new Object[0]);
      return false;
    }
    CrashStrategyBean localCrashStrategyBean = CrashReport.getCrashRuntimeStrategy();
    if (localCrashStrategyBean == null)
    {
      com.tencent.feedback.common.e.d("crash strategy null,not init?", new Object[0]);
      return false;
    }
    paramString1 = com.tencent.feedback.eup.b.a(paramContext, localc.h(), localc.p(), localc.k(), localc.y(), paramString1, "main", "", "ANR_RQD_EXCEPTION", "", paramString2, paramLong, paramString3, null);
    paramString1.e(true);
    boolean bool = com.tencent.feedback.eup.c.a(paramContext).a(paramString1, localCrashStrategyBean);
    com.tencent.feedback.common.e.b("sha1:%s %d", new Object[] { paramString1.q(), Integer.valueOf(paramString1.o()) });
    com.tencent.feedback.common.e.b("handle anr %b", new Object[] { Boolean.valueOf(bool) });
    return bool;
  }
  
  public static void uploadANRInfoAsync(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, long paramLong)
  {
    if ((paramInt <= 0) || (paramString1 == null) || (paramLong <= 0L))
    {
      com.tencent.feedback.common.e.d("anr args unright pid, procName ,anrTime should not be null", new Object[0]);
      return;
    }
    com.tencent.feedback.common.b.b().a(new ANRReport.1(paramContext, paramInt, paramString1, paramString2, paramString3, paramLong));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\anr\ANRReport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */