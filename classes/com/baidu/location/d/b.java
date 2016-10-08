package com.baidu.location.d;

import com.baidu.location.BDLocation;
import com.baidu.location.d;
import java.util.ArrayList;

public class b
  implements d
{
  public b(a parama) {}
  
  public void onReceiveLocation(BDLocation paramBDLocation)
  {
    if ((a.a(this.a) != null) && (a.a(this.a).size() > 0)) {
      a.a(this.a, paramBDLocation);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */