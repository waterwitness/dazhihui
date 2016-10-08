package com.thinkive.mobile.account.activitys;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.android.thinkive.framework.network.ResponseListener;
import java.util.HashMap;
import org.json.JSONObject;

final class FacePhotographActivity$9
  implements ResponseListener<JSONObject>
{
  FacePhotographActivity$9(FacePhotographActivity paramFacePhotographActivity) {}
  
  public final void onErrorResponse(Exception paramException)
  {
    Object localObject = "{\"errorInfo\":\"" + Log.getStackTraceString(paramException) + "\",\"errorNo\":\"-119\"}";
    paramException = new HashMap();
    paramException.put("wrapped", localObject);
    localObject = new Message();
    Bundle localBundle = new Bundle();
    localBundle.putString("result", (String)paramException.get("wrapped"));
    ((Message)localObject).setData(localBundle);
    this.a.f.sendMessage((Message)localObject);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\FacePhotographActivity$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */