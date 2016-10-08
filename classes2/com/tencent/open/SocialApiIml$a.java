package com.tencent.open;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.open.a.f;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONException;
import org.json.JSONObject;

class SocialApiIml$a
  implements IUiListener
{
  private IUiListener b;
  private String c;
  private String d;
  private Bundle e;
  private Activity f;
  
  SocialApiIml$a(SocialApiIml paramSocialApiIml, Activity paramActivity, IUiListener paramIUiListener, String paramString1, String paramString2, Bundle paramBundle)
  {
    this.b = paramIUiListener;
    this.c = paramString1;
    this.d = paramString2;
    this.e = paramBundle;
  }
  
  public void onCancel()
  {
    this.b.onCancel();
  }
  
  public void onComplete(Object paramObject)
  {
    paramObject = (JSONObject)paramObject;
    try
    {
      paramObject = ((JSONObject)paramObject).getString("encry_token");
      this.e.putString("encrytoken", (String)paramObject);
      SocialApiIml.a(this.a, SocialApiIml.a(this.a), this.c, this.e, this.d, this.b);
      if (TextUtils.isEmpty((CharSequence)paramObject))
      {
        f.b("openSDK_LOG.SocialApiIml", "The token get from qq or qzone is empty. Write temp token to localstorage.");
        this.a.writeEncryToken(this.f);
      }
      return;
    }
    catch (JSONException paramObject)
    {
      for (;;)
      {
        ((JSONException)paramObject).printStackTrace();
        f.b("openSDK_LOG.SocialApiIml", "OpenApi, EncrytokenListener() onComplete error", (Throwable)paramObject);
        paramObject = null;
      }
    }
  }
  
  public void onError(UiError paramUiError)
  {
    f.b("openSDK_LOG.SocialApiIml", "OpenApi, EncryptTokenListener() onError" + paramUiError.errorMessage);
    this.b.onError(paramUiError);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\SocialApiIml$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */