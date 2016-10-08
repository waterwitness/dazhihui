package com.android.dazhihui;

import com.baidu.location.BDLocation;
import com.baidu.location.d;

public class k
  implements d
{
  public k(g paramg) {}
  
  public void onReceiveLocation(BDLocation paramBDLocation)
  {
    g.a(this.a, paramBDLocation.c());
    g.b(this.a, paramBDLocation.d());
    this.a.ao();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */