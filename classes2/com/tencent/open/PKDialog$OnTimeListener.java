package com.tencent.open;

import android.content.Context;
import android.os.SystemClock;
import com.tencent.open.b.g;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

class PKDialog$OnTimeListener
  implements IUiListener
{
  private String mAction;
  String mAppid;
  String mUrl;
  private WeakReference<Context> mWeakCtx;
  private IUiListener mWeakL;
  
  public PKDialog$OnTimeListener(Context paramContext, String paramString1, String paramString2, String paramString3, IUiListener paramIUiListener)
  {
    this.mWeakCtx = new WeakReference(paramContext);
    this.mAction = paramString1;
    this.mUrl = paramString2;
    this.mAppid = paramString3;
    this.mWeakL = paramIUiListener;
  }
  
  private void onComplete(String paramString)
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
    if (this.mWeakL != null)
    {
      this.mWeakL.onCancel();
      this.mWeakL = null;
    }
  }
  
  public void onComplete(Object paramObject)
  {
    paramObject = (JSONObject)paramObject;
    g.a().a(this.mAction + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, ((JSONObject)paramObject).optInt("ret", -6), this.mUrl, false);
    if (this.mWeakL != null)
    {
      this.mWeakL.onComplete(paramObject);
      this.mWeakL = null;
    }
  }
  
  public void onError(UiError paramUiError)
  {
    if (paramUiError.errorMessage != null) {}
    for (String str = paramUiError.errorMessage + this.mUrl;; str = this.mUrl)
    {
      g.a().a(this.mAction + "_H5", SystemClock.elapsedRealtime(), 0L, 0L, paramUiError.errorCode, str, false);
      if (this.mWeakL != null)
      {
        this.mWeakL.onError(paramUiError);
        this.mWeakL = null;
      }
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\PKDialog$OnTimeListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */