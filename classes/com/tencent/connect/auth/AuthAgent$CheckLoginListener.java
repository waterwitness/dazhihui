package com.tencent.connect.auth;

import com.tencent.open.a.f;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONException;
import org.json.JSONObject;

class AuthAgent$CheckLoginListener
  implements IUiListener
{
  IUiListener a;
  
  public AuthAgent$CheckLoginListener(AuthAgent paramAuthAgent, IUiListener paramIUiListener)
  {
    this.a = paramIUiListener;
  }
  
  public void onCancel()
  {
    if (this.a != null) {
      this.a.onCancel();
    }
  }
  
  public void onComplete(Object paramObject)
  {
    if (paramObject == null)
    {
      f.e("openSDK_LOG.AuthAgent", "CheckLoginListener response data is null");
      return;
    }
    for (paramObject = (JSONObject)paramObject;; paramObject = ((JSONObject)paramObject).getString("msg")) {
      try
      {
        int i = ((JSONObject)paramObject).getInt("ret");
        if (i == 0)
        {
          paramObject = "success";
          if (this.a == null) {
            break;
          }
          this.a.onComplete(new JSONObject().put("ret", i).put("msg", paramObject));
          return;
        }
      }
      catch (JSONException paramObject)
      {
        ((JSONException)paramObject).printStackTrace();
        f.e("openSDK_LOG.AuthAgent", "CheckLoginListener response data format error");
        return;
      }
    }
  }
  
  public void onError(UiError paramUiError)
  {
    if (this.a != null) {
      this.a.onError(paramUiError);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthAgent$CheckLoginListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */