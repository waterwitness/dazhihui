package com.android.dazhihui.ui.screen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.bj;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.widget.MyWebView;
import com.android.dazhihui.w;
import com.kwlopen.sdk.activity.KwlOpenActivity;
import com.tencent.avsdkhost.control.IlvbHostPhotoManage;

public class BrowserActivity
  extends BaseActivity
{
  private i browserFragment;
  FrameLayout frameView;
  Boolean isToMain;
  IlvbHostPhotoManage mIlvbHostPhotoManage;
  private bj uploadImgManage;
  
  public void doneUpLoadImg(int paramInt)
  {
    String str = n.z(w.a().f());
    str = String.format(f.k, new Object[] { str });
    if (this.uploadImgManage == null) {
      this.uploadImgManage = new bj(this);
    }
    if (paramInt == 0)
    {
      this.uploadImgManage.b(str, new g(this));
      return;
    }
    this.uploadImgManage.a(str, new h(this));
  }
  
  public void finish()
  {
    super.finish();
    ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(this.frameView.getWindowToken(), 0);
  }
  
  protected void init(Bundle paramBundle) {}
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    MyWebView localMyWebView;
    if ((this.browserFragment != null) && (this.browserFragment.a() != null))
    {
      localMyWebView = this.browserFragment.a();
      if (paramInt1 == 2456)
      {
        if ((localMyWebView == null) || (localMyWebView.a == null)) {
          return;
        }
        if ((paramIntent == null) || (paramInt2 != -1)) {
          break label350;
        }
      }
    }
    label345:
    label350:
    for (Uri localUri1 = paramIntent.getData();; localUri1 = null)
    {
      Uri localUri2 = localUri1;
      if (localUri1 == null)
      {
        localUri2 = localUri1;
        if (paramIntent == null)
        {
          localUri2 = localUri1;
          if (paramInt2 == -1)
          {
            localUri2 = localUri1;
            if (localMyWebView.c != null) {
              localUri2 = localMyWebView.c;
            }
          }
        }
      }
      Log.i("GUH", "MyWebVeiw FILECHOOSER_RESULTCODE result=" + localUri2);
      localMyWebView.a.onReceiveValue(localUri2);
      localMyWebView.a = null;
      localMyWebView.c = null;
      return;
      if (paramInt1 == 2457)
      {
        if ((localMyWebView == null) || (localMyWebView.b == null)) {
          break;
        }
        if ((paramIntent == null) || (paramInt2 != -1)) {
          break label345;
        }
      }
      for (paramIntent = paramIntent.getData();; paramIntent = null)
      {
        Log.i("GUH", "MyWebVeiw FILECHOOSER_RESULTCODE result=" + paramIntent);
        if (paramIntent != null) {
          localMyWebView.b.onReceiveValue(new Uri[] { paramIntent });
        }
        for (;;)
        {
          localMyWebView.b = null;
          return;
          localMyWebView.b.onReceiveValue(new Uri[0]);
        }
        if ((this.mIlvbHostPhotoManage != null) && ((paramInt1 == 17427) || (paramInt1 == 17428) || (paramInt1 == 17429)))
        {
          this.mIlvbHostPhotoManage.onActivityResult(paramInt1, paramInt2, paramIntent);
          return;
        }
        if (((paramInt1 == 13) || (paramInt1 == 14) || (paramInt1 == 15)) && (this.uploadImgManage != null)) {
          this.uploadImgManage.a(paramInt1, paramInt2, paramIntent);
        }
        super.onActivityResult(paramInt1, paramInt2, paramIntent);
        return;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.frameView = new FrameLayout(this);
    int i = this.frameView.hashCode();
    this.frameView.setId(i);
    setContentView(this.frameView);
    paramBundle = getIntent().getExtras();
    this.isToMain = Boolean.valueOf(paramBundle.getBoolean("isToMain", true));
    if ((paramBundle != null) && (paramBundle.getBoolean("HTML5_ACCOUNT")))
    {
      KwlOpenActivity.show(this, paramBundle.getString("HTML5_ACCOUNT_URL"), "手机开户", true);
      finish();
      return;
    }
    this.browserFragment = i.a(paramBundle);
    this.browserFragment.b(false);
    getSupportFragmentManager().a().a(i, this.browserFragment, "browserFragment").b();
  }
  
  protected void onFinish()
  {
    if (this.isToMain.booleanValue()) {
      super.onFinish();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((this.browserFragment != null) && (this.browserFragment.a() != null))
    {
      MyWebView localMyWebView = this.browserFragment.a();
      if ((paramInt == 4) && (localMyWebView.canGoBack()))
      {
        localMyWebView.goBack();
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void refresh()
  {
    if ((this.browserFragment != null) && (this.browserFragment.a() != null)) {
      this.browserFragment.a().reload();
    }
  }
  
  public void setIlvbHostPhotoManage(IlvbHostPhotoManage paramIlvbHostPhotoManage)
  {
    this.mIlvbHostPhotoManage = paramIlvbHostPhotoManage;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\BrowserActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */