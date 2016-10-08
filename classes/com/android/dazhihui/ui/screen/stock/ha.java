package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.d.n;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONObject;

public class ha
  implements IUiListener
{
  protected void a(JSONObject paramJSONObject) {}
  
  public void onCancel()
  {
    n.c("Cancel");
  }
  
  public void onComplete(Object paramObject)
  {
    String str = paramObject.toString();
    n.c("qqMsg: " + str);
    a((JSONObject)paramObject);
  }
  
  public void onError(UiError paramUiError)
  {
    n.c("onError: " + paramUiError.errorDetail);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ha.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */