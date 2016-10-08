package com.android.thinkive.framework.activity;

import android.webkit.JsResult;
import com.android.thinkive.framework.util.WebViewDialogHelper.Result;

class BaseWebActivity$2$2
  implements WebViewDialogHelper.Result
{
  BaseWebActivity$2$2(BaseWebActivity.2 param2, JsResult paramJsResult) {}
  
  public void gotResult(boolean paramBoolean, String paramString)
  {
    if (paramBoolean)
    {
      this.val$result.confirm();
      return;
    }
    this.val$result.cancel();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\activity\BaseWebActivity$2$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */