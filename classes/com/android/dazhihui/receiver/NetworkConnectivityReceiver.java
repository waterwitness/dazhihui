package com.android.dazhihui.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.android.dazhihui.a.w;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.widget.ToastMaker;

public class NetworkConnectivityReceiver
  extends BroadcastReceiver
{
  private Handler a = new a(this, Looper.getMainLooper());
  
  private void a(Context paramContext)
  {
    int i;
    if (com.android.dazhihui.a.g.a().b())
    {
      if ((paramContext != null) && (!this.a.hasMessages(1)))
      {
        com.android.dazhihui.a.g.a().a(w.a);
        this.a.sendEmptyMessageDelayed(1, 2000L);
      }
      i = com.android.dazhihui.a.g.a().p();
      this.a.removeMessages(0);
      if (i != 1) {
        break label71;
      }
      c(paramContext);
    }
    label71:
    while (i != 2) {
      return;
    }
    if (paramContext != null) {
      b(paramContext);
    }
    this.a.sendEmptyMessageDelayed(0, 300L);
  }
  
  private void b(Context paramContext)
  {
    com.android.dazhihui.a.g.a().a(false);
    if ((b.a().f() != null) && (paramContext != null)) {}
    try
    {
      ToastMaker.a(paramContext, paramContext.getString(2131165964));
      return;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private void c(Context paramContext)
  {
    com.android.dazhihui.a.g.a().a(true);
    if ((b.a().f() != null) && (com.android.dazhihui.g.a().L())) {}
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
    {
      Log.w("Protocol", "networkconnectivity receiver");
      a(paramContext);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\receiver\NetworkConnectivityReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */