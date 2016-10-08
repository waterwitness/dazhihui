package com.cairh.app.sjkh;

import android.content.Context;
import android.content.SharedPreferences;

class MainActivity$MyLocationListener$1
  implements Runnable
{
  MainActivity$MyLocationListener$1(MainActivity.MyLocationListener paramMyLocationListener, String paramString1, String paramString2, String paramString3) {}
  
  public void run()
  {
    if ((MainActivity.access$24(MainActivity.MyLocationListener.access$0(this.this$1)) == null) || ("".equals(MainActivity.access$24(MainActivity.MyLocationListener.access$0(this.this$1)))))
    {
      MainActivity.MyLocationListener.access$0(this.this$1).callJSFunc("selectNearby('" + this.val$locationa + "','" + this.val$province + "','" + this.val$city + "');");
      return;
    }
    Object localObject = MainActivity.MyLocationListener.access$0(this.this$1).context.getSharedPreferences("channelInfo", 0);
    String str = ((SharedPreferences)localObject).getString("branchNo", "");
    localObject = ((SharedPreferences)localObject).getString("brokerCode", "");
    MainActivity.MyLocationListener.access$0(this.this$1).callJSFunc(MainActivity.access$24(MainActivity.MyLocationListener.access$0(this.this$1)) + "('" + this.val$locationa + "','" + this.val$province + "','" + this.val$city + "','" + str + "','" + (String)localObject + "');");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$MyLocationListener$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */