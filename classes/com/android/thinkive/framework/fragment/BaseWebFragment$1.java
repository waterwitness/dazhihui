package com.android.thinkive.framework.fragment;

import android.text.TextUtils;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView.UrlLoadListener;

class BaseWebFragment$1
  implements MyWebView.UrlLoadListener
{
  BaseWebFragment$1(BaseWebFragment paramBaseWebFragment) {}
  
  public void onComplete()
  {
    Log.e("url load listener on completer !!!!!! mCacheUrl = " + BaseWebFragment.access$0(this.this$0));
    if (!TextUtils.isEmpty(BaseWebFragment.access$0(this.this$0)))
    {
      Log.e("fragment mCacheUrl = " + BaseWebFragment.access$0(this.this$0));
      BaseWebFragment.access$1(this.this$0, BaseWebFragment.access$0(this.this$0));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\fragment\BaseWebFragment$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */