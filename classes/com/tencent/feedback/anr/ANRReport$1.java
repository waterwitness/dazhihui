package com.tencent.feedback.anr;

import android.content.Context;

final class ANRReport$1
  implements Runnable
{
  ANRReport$1(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, long paramLong) {}
  
  public final void run()
  {
    ANRReport.uploadANRInfo(this.a, this.b, this.c, this.d, this.e, this.f);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\anr\ANRReport$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */