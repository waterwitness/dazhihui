package com.android.dazhihui.ui.delegate.screen;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.android.dazhihui.d.n;

class cn
  extends BroadcastReceiver
{
  cn(InitVerifedDongHai paramInitVerifedDongHai) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str = "";
    paramIntent = paramIntent.getAction();
    int i = getResultCode();
    n.d("SMSBroadcast", paramIntent + " resultCode:" + i);
    if (paramIntent.equals(InitVerifedDongHai.b()))
    {
      paramContext = str;
      switch (i)
      {
      default: 
        paramContext = str;
      }
    }
    for (;;)
    {
      this.a.a(paramContext);
      return;
      paramContext = "发送成功。";
      continue;
      paramContext = "发送失败。";
      continue;
      paramContext = str;
      if (paramIntent.equals(InitVerifedDongHai.c())) {
        switch (i)
        {
        case 0: 
        default: 
          paramContext = str;
          break;
        case -1: 
          paramContext = "发送成功。";
          break;
        case 1: 
        case 2: 
        case 3: 
        case 4: 
          paramContext = "发送失败。";
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */