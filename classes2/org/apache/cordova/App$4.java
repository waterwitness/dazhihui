package org.apache.cordova;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

class App$4
  extends BroadcastReceiver
{
  App$4(App paramApp) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramIntent != null) && (paramIntent.getAction().equals("android.intent.action.PHONE_STATE")) && (paramIntent.hasExtra("state")))
    {
      paramContext = paramIntent.getStringExtra("state");
      if (!paramContext.equals(TelephonyManager.EXTRA_STATE_RINGING)) {
        break label64;
      }
      LOG.i("CordovaApp", "Telephone RINGING");
      this.this$0.webView.postMessage("telephone", "ringing");
    }
    label64:
    do
    {
      return;
      if (paramContext.equals(TelephonyManager.EXTRA_STATE_OFFHOOK))
      {
        LOG.i("CordovaApp", "Telephone OFFHOOK");
        this.this$0.webView.postMessage("telephone", "offhook");
        return;
      }
    } while (!paramContext.equals(TelephonyManager.EXTRA_STATE_IDLE));
    LOG.i("CordovaApp", "Telephone IDLE");
    this.this$0.webView.postMessage("telephone", "idle");
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\App$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */