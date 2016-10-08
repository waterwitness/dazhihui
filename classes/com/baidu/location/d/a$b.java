package com.baidu.location.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.location.h;
import java.util.ArrayList;

public class a$b
  extends BroadcastReceiver
{
  public a$b(a parama) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((a.a(this.a) == null) || (a.a(this.a).isEmpty())) {
      return;
    }
    a.b(this.a).a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\d\a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */