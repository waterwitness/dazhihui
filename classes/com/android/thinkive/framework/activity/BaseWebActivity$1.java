package com.android.thinkive.framework.activity;

import android.text.TextUtils;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView.UrlLoadListener;

class BaseWebActivity$1
  implements MyWebView.UrlLoadListener
{
  BaseWebActivity$1(BaseWebActivity paramBaseWebActivity) {}
  
  public void onComplete()
  {
    if (!TextUtils.isEmpty(BaseWebActivity.access$0(this.this$0)))
    {
      Log.d("activity mCacheUrl = " + BaseWebActivity.access$0(this.this$0));
      BaseWebActivity.access$1(this.this$0, BaseWebActivity.access$0(this.this$0));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\activity\BaseWebActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */