package com.iflytek.cloud;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class SpeechUtility$a
  extends BroadcastReceiver
{
  private SpeechUtility$a(SpeechUtility paramSpeechUtility) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = paramIntent.getAction();
    paramIntent = paramIntent.getDataString();
    String str = String.valueOf("package:").concat("com.iflytek.vflynote");
    if ((("android.intent.action.PACKAGE_ADDED".equals(paramContext)) || ("android.intent.action.PACKAGE_REMOVED".equals(paramContext)) || ("android.intent.action.PACKAGE_REPLACED".equals(paramContext))) && (str.equals(paramIntent)) && (SpeechUtility.getUtility() != null)) {
      SpeechUtility.getUtility().checkServiceInstalled();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechUtility$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */