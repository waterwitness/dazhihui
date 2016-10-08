package com.android.dazhihui.service;

import android.util.Log;
import com.android.dazhihui.a.g;

class v
  extends z
{
  v(DzhService paramDzhService) {}
  
  public void a()
  {
    if (!DzhService.a(this.a))
    {
      Log.d("Protocol", "startConnection");
      g.a().l();
      DzhService.a(this.a, true);
    }
  }
  
  public void b()
  {
    DzhService.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\service\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */