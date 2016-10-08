package com.thinkive.mobile.account.activitys;

import android.util.Log;
import android.widget.Toast;
import com.android.thinkive.framework.compatible.DialogFrame;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.network.http.VolleyErrorHelper;
import com.android.volley.VolleyError;
import java.util.HashMap;
import org.json.JSONObject;

final class CameraActivity$6
  implements ResponseListener<JSONObject>
{
  CameraActivity$6(CameraActivity paramCameraActivity, HashMap paramHashMap, String paramString) {}
  
  public final void onErrorResponse(Exception paramException)
  {
    CameraActivity.a(this.a).unWaitDialog();
    try
    {
      if ((paramException instanceof VolleyError)) {
        Log.e("asos", VolleyErrorHelper.getMessage(paramException, this.a));
      }
      Toast.makeText(this.a, "网络异常了，请重试！", 1).show();
      this.a.finish();
      return;
    }
    catch (Exception paramException)
    {
      for (;;) {}
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\CameraActivity$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */