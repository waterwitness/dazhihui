package com.thinkive.mobile.account.activitys;

import android.widget.Toast;
import com.android.thinkive.framework.network.ResponseListener;
import org.json.JSONObject;

final class IdentityPhotoActivity$7
  implements ResponseListener<JSONObject>
{
  IdentityPhotoActivity$7(IdentityPhotoActivity paramIdentityPhotoActivity) {}
  
  public final void onErrorResponse(Exception paramException)
  {
    paramException = this.a;
    IdentityPhotoActivity.b();
    Toast.makeText(this.a, "网络异常了，请重试！", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\activitys\IdentityPhotoActivity$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */