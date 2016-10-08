package com.tencent.connect.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.webkit.CookieSyncManager;
import com.tencent.connect.a.a;
import com.tencent.open.a.f;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONException;
import org.json.JSONObject;

class AuthAgent$TokenListener
  implements IUiListener
{
  private final IUiListener b;
  private final boolean c;
  private final Context d;
  
  public AuthAgent$TokenListener(AuthAgent paramAuthAgent, Context paramContext, IUiListener paramIUiListener, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.d = paramContext;
    this.b = paramIUiListener;
    this.c = paramBoolean1;
    f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener()");
  }
  
  public void onCancel()
  {
    f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onCancel");
    this.b.onCancel();
    f.b();
  }
  
  public void onComplete(Object paramObject)
  {
    f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete");
    paramObject = (JSONObject)paramObject;
    for (;;)
    {
      try
      {
        str1 = ((JSONObject)paramObject).getString("access_token");
        String str2 = ((JSONObject)paramObject).getString("expires_in");
        String str3 = ((JSONObject)paramObject).getString("openid");
        if ((str1 != null) && (AuthAgent.a(this.a) != null) && (str3 != null))
        {
          AuthAgent.b(this.a).setAccessToken(str1, str2);
          AuthAgent.c(this.a).setOpenId(str3);
          a.d(this.d, AuthAgent.d(this.a));
        }
        str1 = ((JSONObject)paramObject).getString("pf");
        if (str1 == null) {}
      }
      catch (JSONException localJSONException)
      {
        String str1;
        localJSONException.printStackTrace();
        f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", localJSONException);
        continue;
      }
      try
      {
        this.d.getSharedPreferences("pfStore", 0).edit().putString("pf", str1).commit();
        if (this.c) {
          CookieSyncManager.getInstance().sync();
        }
        this.b.onComplete(paramObject);
        this.a.releaseResource();
        f.b();
        return;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onComplete error", localException);
      }
    }
  }
  
  public void onError(UiError paramUiError)
  {
    f.b("openSDK_LOG.AuthAgent", "OpenUi, TokenListener() onError");
    this.b.onError(paramUiError);
    f.b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthAgent$TokenListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */