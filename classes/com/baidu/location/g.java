package com.baidu.location;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

public abstract interface g
{
  public abstract double a();
  
  public abstract void a(Context paramContext);
  
  public abstract boolean a(Intent paramIntent);
  
  public abstract IBinder onBind(Intent paramIntent);
  
  public abstract void onDestroy();
  
  public abstract int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */