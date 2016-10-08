package com.iflytek.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.iflytek.thirdparty.aE;
import com.iflytek.thirdparty.aM;

final class b
  extends BroadcastReceiver
{
  b(LaunchService paramLaunchService) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    aM.a(paramContext, "alarm onReceive");
    aE.a(paramContext);
    LaunchService.a(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\common\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */