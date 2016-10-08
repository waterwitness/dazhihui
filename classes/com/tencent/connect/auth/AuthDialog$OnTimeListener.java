package com.tencent.connect.auth;

import android.os.SystemClock;
import com.tencent.open.b.g;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONException;
import org.json.JSONObject;

class AuthDialog$OnTimeListener
  implements IUiListener
{
  String a;
  String b;
  private String d;
  private IUiListener e;
  
  public AuthDialog$OnTimeListener(AuthDialog paramAuthDialog, String paramString1, String paramString2, String paramString3, IUiListener paramIUiListener)
  {
    this.d = paramString1;
    this.a = paramString2;
    this.b = paramString3;
    this.e = paramIUiListener;
  }
  
  private void a(String paramString)
  {
    try
    {
      onComplete(Util.parseJson(paramString));
      return;
    }
    catch (JSONException localJSONException)
    {
      localJSONException.printStackTrace();
      onError(new UiError(-4, "服务器返回数据格式有误!", paramString));
    }
  }
  
  public void onCancel()
  {
    if (this.e != null)
    {
      this.e.onCancel();
      this.e = null;
    }
  }
  
  public void onComplete(Object paramObject)
  {
    paramObject = (JSONObject)paramObject;
    g.a().a(this.d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, ((JSONObject)paramObject).optInt("ret", -6), this.a, false);
    if (this.e != null)
    {
      this.e.onComplete(paramObject);
      this.e = null;
    }
  }
  
  public void onError(UiError paramUiError)
  {
    if (paramUiError.errorMessage != null) {}
    for (String str = paramUiError.errorMessage + this.a;; str = this.a)
    {
      g.a().a(this.d + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, paramUiError.errorCode, str, false);
      AuthDialog.a(this.c, str);
      if (this.e != null)
      {
        this.e.onError(paramUiError);
        this.e = null;
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthDialog$OnTimeListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */