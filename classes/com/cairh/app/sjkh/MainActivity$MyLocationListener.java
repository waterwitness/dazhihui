package com.cairh.app.sjkh;

import android.os.Handler;
import android.util.Log;
import com.baidu.location.BDLocation;
import com.baidu.location.d;
import com.baidu.location.h;

public class MainActivity$MyLocationListener
  implements d
{
  public MainActivity$MyLocationListener(MainActivity paramMainActivity) {}
  
  public void onReceiveLocation(BDLocation paramBDLocation)
  {
    Log.i("", ">>>>>>>>>>>>>>>>MyLocationListener MyLocationListener MyLocationListener>>>>>>>>>>>>>>>>>>>>>111111");
    StringBuffer localStringBuffer = new StringBuffer(256);
    localStringBuffer.append("time : ");
    localStringBuffer.append(paramBDLocation.b());
    localStringBuffer.append("\nerror code : ");
    localStringBuffer.append(paramBDLocation.h());
    localStringBuffer.append("\nlatitude : ");
    localStringBuffer.append(paramBDLocation.c());
    localStringBuffer.append("\nlontitude : ");
    localStringBuffer.append(paramBDLocation.d());
    localStringBuffer.append("\nradius : ");
    localStringBuffer.append(paramBDLocation.f());
    if (paramBDLocation.h() == 61)
    {
      localStringBuffer.append("\nspeed : ");
      localStringBuffer.append(paramBDLocation.e());
      localStringBuffer.append("\nsatellite : ");
      localStringBuffer.append(paramBDLocation.i());
      localStringBuffer.append("\ndirection : ");
      localStringBuffer.append("\naddr : ");
      localStringBuffer.append(paramBDLocation.m());
      localStringBuffer.append(paramBDLocation.j());
    }
    for (;;)
    {
      String str1 = paramBDLocation.c() + "," + paramBDLocation.d();
      String str2 = paramBDLocation.n();
      String str3 = paramBDLocation.o();
      this.this$0.cwjHandler.post(new MainActivity.MyLocationListener.1(this, str1, str2, str3));
      this.this$0.mLocationClient.d();
      Log.i("BaiduLocationApiDem", localStringBuffer.toString());
      Log.i("BaiduLocationApiDem", "省：" + paramBDLocation.n());
      Log.i("BaiduLocationApiDem", "市：" + paramBDLocation.o());
      return;
      if (paramBDLocation.h() == 161)
      {
        localStringBuffer.append("\naddr : ");
        localStringBuffer.append(paramBDLocation.m());
        localStringBuffer.append("\noperationers : ");
        localStringBuffer.append(paramBDLocation.s());
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$MyLocationListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */