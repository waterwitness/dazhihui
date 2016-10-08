package com.tencent.connect.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.tencent.open.a.f;
import com.tencent.open.b.d;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import org.json.JSONObject;

public class AssistActivity
  extends Activity
{
  public static final String EXTRA_INTENT = "openSDK_LOG.AssistActivity.ExtraIntent";
  protected static final int FINISH_BY_TIMEOUT = 0;
  private static final String RESTART_FLAG = "RESTART_FLAG";
  private static final String TAG = "openSDK_LOG.AssistActivity";
  private boolean canFinishByTimeout = false;
  private boolean canStartTimeout = false;
  protected Handler handler = new AssistActivity.1(this);
  private boolean isRestart = false;
  
  public static Intent getAssistActivityIntent(Context paramContext)
  {
    return new Intent(paramContext, AssistActivity.class);
  }
  
  private void openBrowser(Bundle paramBundle)
  {
    String str2 = paramBundle.getString("viaShareType");
    Object localObject = paramBundle.getString("callbackAction");
    String str4 = paramBundle.getString("url");
    String str3 = paramBundle.getString("openId");
    String str5 = paramBundle.getString("appId");
    paramBundle = "";
    String str1 = "";
    if ("shareToQQ".equals(localObject))
    {
      paramBundle = "ANDROIDQQ.SHARETOQQ.XX";
      str1 = "10";
      if (Util.openBrowser(this, str4)) {
        break label160;
      }
      localObject = UIListenerManager.getInstance().getListnerWithAction((String)localObject);
      if (localObject != null) {
        ((IUiListener)localObject).onError(new UiError(-6, "打开浏览器失败!", null));
      }
      d.a().a(str3, str5, paramBundle, str1, "3", "1", str2, "0", "2", "0");
      finish();
    }
    for (;;)
    {
      getIntent().removeExtra("shareH5");
      return;
      if (!"shareToQzone".equals(localObject)) {
        break;
      }
      paramBundle = "ANDROIDQQ.SHARETOQZ.XX";
      str1 = "11";
      break;
      label160:
      d.a().a(str3, str5, paramBundle, str1, "3", "0", str2, "0", "2", "0");
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    StringBuilder localStringBuilder = new StringBuilder().append("--onActivityResult--requestCode: ").append(paramInt1).append(" | resultCode: ").append(paramInt2).append("data = null ? ");
    if (paramIntent == null) {}
    for (boolean bool = true;; bool = false)
    {
      f.c("openSDK_LOG.AssistActivity", bool);
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
      if (paramInt1 != 0) {
        break;
      }
      return;
    }
    if (paramIntent != null) {
      paramIntent.putExtra("key_action", "action_login");
    }
    setResultData(paramInt2, paramIntent);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    requestWindowFeature(1);
    super.onCreate(paramBundle);
    setRequestedOrientation(3);
    f.b("openSDK_LOG.AssistActivity", "--onCreate--");
    if (getIntent() == null)
    {
      f.e("openSDK_LOG.AssistActivity", "-->onCreate--getIntent() returns null");
      finish();
    }
    Intent localIntent = (Intent)getIntent().getParcelableExtra("openSDK_LOG.AssistActivity.ExtraIntent");
    if (localIntent == null) {}
    Bundle localBundle;
    for (int i = 0;; i = localIntent.getIntExtra("key_request_code", 0))
    {
      localBundle = getIntent().getBundleExtra("h5_share_data");
      if (paramBundle != null) {
        this.isRestart = paramBundle.getBoolean("RESTART_FLAG");
      }
      if (this.isRestart) {
        break label198;
      }
      if (localBundle != null) {
        break label185;
      }
      if (localIntent == null) {
        break label173;
      }
      f.c("openSDK_LOG.AssistActivity", "--onCreate--activityIntent not null, will start activity, reqcode = " + i);
      if (localIntent.getComponent() == null) {
        break;
      }
      this.canFinishByTimeout = false;
      startActivityForResult(localIntent, i);
      return;
    }
    this.canFinishByTimeout = true;
    this.canStartTimeout = false;
    startActivity(localIntent);
    return;
    label173:
    f.e("openSDK_LOG.AssistActivity", "--onCreate--activityIntent is null");
    finish();
    return;
    label185:
    f.d("openSDK_LOG.AssistActivity", "--onCreate--h5 bundle not null, will open browser");
    openBrowser(localBundle);
    return;
    label198:
    f.b("openSDK_LOG.AssistActivity", "is restart");
  }
  
  protected void onDestroy()
  {
    f.b("openSDK_LOG.AssistActivity", "-->onDestroy");
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    f.c("openSDK_LOG.AssistActivity", "--onNewIntent");
    super.onNewIntent(paramIntent);
    paramIntent.putExtra("key_action", "action_share");
    setResult(-1, paramIntent);
    if (!isFinishing())
    {
      f.c("openSDK_LOG.AssistActivity", "--onNewIntent--activity not finished, finish now");
      finish();
    }
  }
  
  protected void onPause()
  {
    f.b("openSDK_LOG.AssistActivity", "-->onPause");
    if (this.canFinishByTimeout)
    {
      if (!this.canStartTimeout) {
        break label35;
      }
      this.handler.removeMessages(0);
    }
    for (;;)
    {
      super.onPause();
      return;
      label35:
      this.canStartTimeout = true;
    }
  }
  
  protected void onResume()
  {
    f.b("openSDK_LOG.AssistActivity", "-->onResume");
    super.onResume();
    Object localObject = getIntent();
    if (((Intent)localObject).getBooleanExtra("is_login", false)) {}
    do
    {
      return;
      if ((!((Intent)localObject).getBooleanExtra("is_qq_mobile_share", false)) && (this.isRestart) && (!isFinishing())) {
        finish();
      }
    } while ((!this.canFinishByTimeout) || (!this.canStartTimeout));
    localObject = this.handler.obtainMessage(0);
    this.handler.sendMessageDelayed((Message)localObject, 200L);
  }
  
  protected void onSaveInstanceState(Bundle paramBundle)
  {
    f.b("openSDK_LOG.AssistActivity", "--onSaveInstanceState--");
    paramBundle.putBoolean("RESTART_FLAG", true);
    super.onSaveInstanceState(paramBundle);
  }
  
  protected void onStart()
  {
    f.b("openSDK_LOG.AssistActivity", "-->onStart");
    super.onStart();
  }
  
  protected void onStop()
  {
    f.b("openSDK_LOG.AssistActivity", "-->onStop");
    super.onStop();
  }
  
  public void setResultData(int paramInt, Intent paramIntent)
  {
    if (paramIntent == null)
    {
      f.d("openSDK_LOG.AssistActivity", "--setResultData--intent is null, setResult ACTIVITY_CANCEL");
      setResult(0, paramIntent);
      return;
    }
    try
    {
      String str = paramIntent.getStringExtra("key_response");
      f.b("openSDK_LOG.AssistActivity", "--setResultDataForLogin-- " + str);
      if (TextUtils.isEmpty(str)) {
        break label147;
      }
      Object localObject = new JSONObject(str);
      str = ((JSONObject)localObject).optString("openid");
      localObject = ((JSONObject)localObject).optString("access_token");
      if ((!TextUtils.isEmpty(str)) && (!TextUtils.isEmpty((CharSequence)localObject)))
      {
        f.c("openSDK_LOG.AssistActivity", "--setResultData--openid and token not empty, setResult ACTIVITY_OK");
        setResult(-1, paramIntent);
        return;
      }
    }
    catch (Exception paramIntent)
    {
      f.e("openSDK_LOG.AssistActivity", "--setResultData--parse response failed");
      paramIntent.printStackTrace();
      return;
    }
    f.d("openSDK_LOG.AssistActivity", "--setResultData--openid or token is empty, setResult ACTIVITY_CANCEL");
    setResult(0, paramIntent);
    return;
    label147:
    f.d("openSDK_LOG.AssistActivity", "--setResultData--response is empty, setResult ACTIVITY_OK");
    setResult(-1, paramIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\common\AssistActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */