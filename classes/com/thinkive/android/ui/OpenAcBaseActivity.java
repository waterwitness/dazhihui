package com.thinkive.android.ui;

import an;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.android.thinkive.framework.compatible.TKActivity;
import com.android.thinkive.framework.network.NetWorkService;
import com.android.thinkive.framework.storage.MemoryStorage;
import com.thinkive.mobile.account.entity.IntentTransformer;

public abstract class OpenAcBaseActivity
  extends TKActivity
{
  protected IntentTransformer a;
  private CookieSyncManager b;
  private AlertDialog c;
  
  public static void b() {}
  
  protected String a()
  {
    if ((this.a != null) && (!TextUtils.isEmpty(this.a.getUrl()))) {
      return this.a.getUrl();
    }
    return new MemoryStorage().loadData("serverUrl");
  }
  
  public final void c()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("提示");
    localBuilder.setMessage("因为客户端长时间没有操作，您需要重新登陆！");
    localBuilder.setPositiveButton("确定", new OpenAcBaseActivity.1(this));
    this.c = localBuilder.create();
    this.c.show();
  }
  
  protected boolean enableStatusBarColor()
  {
    return false;
  }
  
  protected void findViews() {}
  
  public void initData()
  {
    this.a = ((IntentTransformer)getIntent().getSerializableExtra(an.a));
  }
  
  protected void initViews() {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onStart()
  {
    super.onStart();
    this.b = CookieSyncManager.createInstance(this);
    this.b.sync();
    Object localObject = CookieManager.getInstance();
    String str = a();
    if (!TextUtils.isEmpty(str))
    {
      localObject = ((CookieManager)localObject).getCookie(str);
      Log.e("asos", "serverUrl == " + str + "cookie == " + (String)localObject);
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        NetWorkService.getInstance().setCookie(str, (String)localObject);
      }
    }
  }
  
  protected void setListeners() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\android\ui\OpenAcBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */