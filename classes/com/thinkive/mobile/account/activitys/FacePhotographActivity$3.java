package com.thinkive.mobile.account.activitys;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import ar;
import com.android.thinkive.framework.compatible.DialogFrame;
import com.android.thinkive.framework.compatible.Parameter;
import org.json.JSONException;
import org.json.JSONObject;

final class FacePhotographActivity$3
  extends Handler
{
  FacePhotographActivity$3(FacePhotographActivity paramFacePhotographActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    paramMessage = paramMessage.getData().getString("result");
    for (;;)
    {
      try
      {
        paramMessage = new JSONObject(paramMessage);
        if (!paramMessage.has("errorNo")) {
          i = paramMessage.getInt("error_no");
        }
        Parameter localParameter;
        try
        {
          if (!paramMessage.has("errorInfo"))
          {
            FacePhotographActivity.a(this.a, paramMessage.getString("error_info"));
            paramMessage = new DialogFrame(this.a);
            if (i != 0) {
              continue;
            }
          }
        }
        catch (JSONException paramMessage) {}
      }
      catch (JSONException paramMessage)
      {
        int i = -1;
        continue;
      }
      try
      {
        localParameter = new Parameter();
        localParameter.addParameter("user_id", FacePhotographActivity.a(this.a).getString("user_id"));
        localParameter.addParameter("url", FacePhotographActivity.a(this.a).getString("url"));
        localParameter.addParameter("id_no", FacePhotographActivity.a(this.a).getString("id_no"));
        localParameter.addParameter("compare_kind", "0");
        localParameter.addParameter("jsessionid", FacePhotographActivity.a(this.a).getString("jsessionid"));
        this.a.startTask(new ar(this.a, localParameter));
        paramMessage.unWaitDialog();
        return;
      }
      catch (Exception paramMessage)
      {
        paramMessage.printStackTrace();
        return;
      }
      i = paramMessage.getInt("errorNo");
      continue;
      FacePhotographActivity.a(this.a, paramMessage.getString("error_info"));
      continue;
      paramMessage.printStackTrace();
    }
    try
    {
      paramMessage.unWaitDialog();
      this.a.g();
      return;
    }
    catch (Exception paramMessage)
    {
      paramMessage.printStackTrace();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\account\activitys\FacePhotographActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */