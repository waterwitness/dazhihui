package com.thinkive.mobile.video.activities;

import an;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.MessageManager;
import com.thinkive.mobile.account.entity.IntentTransformer;
import org.json.JSONException;
import org.json.JSONObject;

final class TwoWayVideoActivity$7
  implements Runnable
{
  TwoWayVideoActivity$7(TwoWayVideoActivity paramTwoWayVideoActivity, String paramString) {}
  
  public final void run()
  {
    JSONObject localJSONObject = new JSONObject();
    AppMessage localAppMessage = new AppMessage(TwoWayVideoActivity.g(this.a).getModuleName(), an.c, localJSONObject);
    try
    {
      if (!TextUtils.isEmpty(this.b))
      {
        localJSONObject.put("videoFlag", this.b);
        localJSONObject.put("rejectReason", "rejectReason");
        MessageManager.getInstance(this.a).sendMessage(localAppMessage);
      }
      return;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\video\activities\TwoWayVideoActivity$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */