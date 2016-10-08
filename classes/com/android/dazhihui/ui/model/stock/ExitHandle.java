package com.android.dazhihui.ui.model.stock;

import android.app.Activity;
import android.webkit.JavascriptInterface;
import com.android.dazhihui.ui.screen.stock.MainScreen;

public class ExitHandle
{
  private Activity mActivity;
  
  public ExitHandle(Activity paramActivity)
  {
    this.mActivity = paramActivity;
  }
  
  @JavascriptInterface
  public void closeSJKH()
  {
    if ((this.mActivity != null) && (!(this.mActivity instanceof MainScreen))) {
      this.mActivity.finish();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\ExitHandle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */