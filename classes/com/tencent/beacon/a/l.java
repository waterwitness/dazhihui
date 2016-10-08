package com.tencent.beacon.a;

import android.content.Context;
import android.content.IntentFilter;

public final class l
{
  protected Runnable a = new l.1(this);
  private Context b;
  private l.a c;
  
  public l(Context paramContext)
  {
    this.b = paramContext;
    this.c = new l.a(this, (byte)0);
  }
  
  public final void a()
  {
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.intent.action.SCREEN_ON");
    localIntentFilter.addAction("android.intent.action.SCREEN_OFF");
    this.b.registerReceiver(this.c, localIntentFilter);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\beacon\a\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */