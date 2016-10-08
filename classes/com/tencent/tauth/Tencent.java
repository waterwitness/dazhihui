package com.tencent.tauth;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.tencent.connect.auth.QQAuth;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.connect.share.QQShare;
import com.tencent.connect.share.QzonePublish;
import com.tencent.connect.share.QzoneShare;
import com.tencent.open.SocialApi;
import com.tencent.open.a.f;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.SystemUtils;
import org.json.JSONObject;

public class Tencent
{
  public static final int REQUEST_LOGIN = 10001;
  private static final String TAG = "openSDK_LOG.Tencent";
  private static Tencent sInstance;
  private final QQAuth mQQAuth;
  
  private Tencent(String paramString, Context paramContext)
  {
    Global.setContext(paramContext.getApplicationContext());
    this.mQQAuth = QQAuth.createInstance(paramString, paramContext);
  }
  
  private static boolean checkManifestConfig(Context paramContext, String paramString)
  {
    try
    {
      ComponentName localComponentName = new ComponentName(paramContext.getPackageName(), "com.tencent.tauth.AuthActivity");
      paramContext.getPackageManager().getActivityInfo(localComponentName, 0);
      return false;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      try
      {
        paramString = new ComponentName(paramContext.getPackageName(), "com.tencent.connect.common.AssistActivity");
        paramContext.getPackageManager().getActivityInfo(paramString, 0);
        return true;
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        paramContext = "没有在AndroidManifest.xml中检测到com.tencent.connect.common.AssistActivity,请加上com.tencent.connect.common.AssistActivity,详细信息请查看官网文档." + "\n配置示例如下: \n<activity\n     android:name=\"com.tencent.connect.common.AssistActivity\"\n     android:screenOrientation=\"behind\"\n     android:theme=\"@android:style/Theme.Translucent.NoTitleBar\"\n     android:configChanges=\"orientation|keyboardHidden\">\n</activity>";
        f.e("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.connect.common.AssistActivity\n" + paramContext);
      }
      paramContext = paramContext;
      paramContext = "没有在AndroidManifest.xml中检测到com.tencent.tauth.AuthActivity,请加上com.tencent.tauth.AuthActivity,并配置<data android:scheme=\"tencent" + paramString + "\" />,详细信息请查看官网文档.";
      paramContext = paramContext + "\n配置示例如下: \n<activity\n     android:name=\"com.tencent.tauth.AuthActivity\"\n     android:noHistory=\"true\"\n     android:launchMode=\"singleTask\">\n<intent-filter>\n    <action android:name=\"android.intent.action.VIEW\" />\n    <category android:name=\"android.intent.category.DEFAULT\" />\n    <category android:name=\"android.intent.category.BROWSABLE\" />\n    <data android:scheme=\"tencent" + paramString + "\" />\n" + "</intent-filter>\n" + "</activity>";
      f.e("openSDK_LOG.Tencent", "AndroidManifest.xml 没有检测到com.tencent.tauth.AuthActivity" + paramContext);
      return false;
    }
  }
  
  public static Tencent createInstance(String paramString, Context paramContext)
  {
    for (;;)
    {
      try
      {
        Global.setContext(paramContext.getApplicationContext());
        f.c("openSDK_LOG.Tencent", "createInstance()  -- start");
        if (sInstance == null)
        {
          sInstance = new Tencent(paramString, paramContext);
          boolean bool = checkManifestConfig(paramContext, paramString);
          if (!bool)
          {
            paramString = null;
            return paramString;
          }
        }
        else
        {
          if (paramString.equals(sInstance.getAppId())) {
            continue;
          }
          sInstance.logout(paramContext);
          sInstance = new Tencent(paramString, paramContext);
          continue;
        }
        f.c("openSDK_LOG.Tencent", "createInstance()  -- end");
      }
      finally {}
      paramString = sInstance;
    }
  }
  
  public static void handleResultData(Intent paramIntent, IUiListener paramIUiListener)
  {
    boolean bool2 = true;
    StringBuilder localStringBuilder = new StringBuilder().append("handleResultData() data = null ? ");
    if (paramIntent == null)
    {
      bool1 = true;
      localStringBuilder = localStringBuilder.append(bool1).append(", listener = null ? ");
      if (paramIUiListener != null) {
        break label67;
      }
    }
    label67:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      f.c("openSDK_LOG.Tencent", bool1);
      UIListenerManager.getInstance().handleDataToListener(paramIntent, paramIUiListener);
      return;
      bool1 = false;
      break;
    }
  }
  
  public static boolean onActivityResultData(int paramInt1, int paramInt2, Intent paramIntent, IUiListener paramIUiListener)
  {
    boolean bool2 = true;
    StringBuilder localStringBuilder = new StringBuilder().append("onActivityResultData() reqcode = ").append(paramInt1).append(", resultcode = ").append(paramInt2).append(", data = null ? ");
    if (paramIntent == null)
    {
      bool1 = true;
      localStringBuilder = localStringBuilder.append(bool1).append(", listener = null ? ");
      if (paramIUiListener != null) {
        break label96;
      }
    }
    label96:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      f.c("openSDK_LOG.Tencent", bool1);
      return UIListenerManager.getInstance().onActivityResult(paramInt1, paramInt2, paramIntent, paramIUiListener);
      bool1 = false;
      break;
    }
  }
  
  public int ask(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "ask()");
    new SocialApi(this.mQQAuth.getQQToken()).ask(paramActivity, paramBundle, paramIUiListener);
    return 0;
  }
  
  public void checkLogin(IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "checkLogin()");
    this.mQQAuth.checkLogin(paramIUiListener);
  }
  
  public String getAccessToken()
  {
    return this.mQQAuth.getQQToken().getAccessToken();
  }
  
  public String getAppId()
  {
    return this.mQQAuth.getQQToken().getAppId();
  }
  
  public long getExpiresIn()
  {
    return this.mQQAuth.getQQToken().getExpireTimeInSecond();
  }
  
  public String getOpenId()
  {
    return this.mQQAuth.getQQToken().getOpenId();
  }
  
  public QQToken getQQToken()
  {
    return this.mQQAuth.getQQToken();
  }
  
  public int gift(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "gift()");
    new SocialApi(this.mQQAuth.getQQToken()).gift(paramActivity, paramBundle, paramIUiListener);
    return 0;
  }
  
  @Deprecated
  public void handleLoginData(Intent paramIntent, IUiListener paramIUiListener)
  {
    boolean bool2 = true;
    StringBuilder localStringBuilder = new StringBuilder().append("handleLoginData() data = null ? ");
    if (paramIntent == null)
    {
      bool1 = true;
      localStringBuilder = localStringBuilder.append(bool1).append(", listener = null ? ");
      if (paramIUiListener != null) {
        break label72;
      }
    }
    label72:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      f.c("openSDK_LOG.Tencent", bool1);
      UIListenerManager.getInstance().handleDataToListener(paramIntent, paramIUiListener);
      return;
      bool1 = false;
      break;
    }
  }
  
  public int invite(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "invite()");
    new SocialApi(this.mQQAuth.getQQToken()).invite(paramActivity, paramBundle, paramIUiListener);
    return 0;
  }
  
  public boolean isReady()
  {
    return (isSessionValid()) && (getOpenId() != null);
  }
  
  public boolean isSessionValid()
  {
    return this.mQQAuth.isSessionValid();
  }
  
  public boolean isSupportSSOLogin(Activity paramActivity)
  {
    if (SystemUtils.getAppVersionName(paramActivity, "com.tencent.mobileqq") == null) {
      return false;
    }
    return SystemUtils.checkMobileQQ(paramActivity);
  }
  
  public int login(Activity paramActivity, String paramString, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "login() with activity, scope is " + paramString);
    return this.mQQAuth.login(paramActivity, paramString, paramIUiListener);
  }
  
  public int login(Fragment paramFragment, String paramString, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "login() with fragment, scope is " + paramString);
    return this.mQQAuth.login(paramFragment, paramString, paramIUiListener, "");
  }
  
  public int loginServerSide(Activity paramActivity, String paramString, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "loginServerSide() with activity, scope = " + paramString + ",server_side");
    return this.mQQAuth.login(paramActivity, paramString + ",server_side", paramIUiListener);
  }
  
  public int loginServerSide(Fragment paramFragment, String paramString, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "loginServerSide() with fragment, scope = " + paramString + ",server_side");
    return this.mQQAuth.login(paramFragment, paramString + ",server_side", paramIUiListener, "");
  }
  
  public int loginWithOEM(Activity paramActivity, String paramString1, IUiListener paramIUiListener, String paramString2, String paramString3, String paramString4)
  {
    f.c("openSDK_LOG.Tencent", "loginWithOEM() with activity, scope = " + paramString1);
    return this.mQQAuth.loginWithOEM(paramActivity, paramString1, paramIUiListener, paramString2, paramString3, paramString4);
  }
  
  public void logout(Context paramContext)
  {
    f.c("openSDK_LOG.Tencent", "logout()");
    this.mQQAuth.getQQToken().setAccessToken(null, "0");
    this.mQQAuth.getQQToken().setOpenId(null);
  }
  
  public boolean onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    f.c("openSDK_LOG.Tencent", "onActivityResult() deprecated, will do nothing");
    return false;
  }
  
  public void publishToQzone(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "publishToQzone()");
    new QzonePublish(paramActivity, this.mQQAuth.getQQToken()).publishToQzone(paramActivity, paramBundle, paramIUiListener);
  }
  
  public int reAuth(Activity paramActivity, String paramString, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "reAuth() with activity, scope = " + paramString);
    return this.mQQAuth.reAuth(paramActivity, paramString, paramIUiListener);
  }
  
  public void releaseResource() {}
  
  public void reportDAU()
  {
    this.mQQAuth.reportDAU();
  }
  
  public JSONObject request(String paramString1, Bundle paramBundle, String paramString2)
  {
    f.c("openSDK_LOG.Tencent", "request()");
    return HttpUtils.request(this.mQQAuth.getQQToken(), Global.getContext(), paramString1, paramBundle, paramString2);
  }
  
  public void requestAsync(String paramString1, Bundle paramBundle, String paramString2, IRequestListener paramIRequestListener, Object paramObject)
  {
    f.c("openSDK_LOG.Tencent", "requestAsync()");
    HttpUtils.requestAsync(this.mQQAuth.getQQToken(), Global.getContext(), paramString1, paramBundle, paramString2, paramIRequestListener);
  }
  
  public void setAccessToken(String paramString1, String paramString2)
  {
    f.a("openSDK_LOG.Tencent", "setAccessToken(), expiresIn = " + paramString2 + "");
    this.mQQAuth.setAccessToken(paramString1, paramString2);
  }
  
  public void setOpenId(String paramString)
  {
    f.a("openSDK_LOG.Tencent", "setOpenId() --start");
    this.mQQAuth.setOpenId(Global.getContext(), paramString);
    f.a("openSDK_LOG.Tencent", "setOpenId() --end");
  }
  
  public void shareToQQ(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "shareToQQ()");
    new QQShare(paramActivity, this.mQQAuth.getQQToken()).shareToQQ(paramActivity, paramBundle, paramIUiListener);
  }
  
  public void shareToQzone(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "shareToQzone()");
    new QzoneShare(paramActivity, this.mQQAuth.getQQToken()).shareToQzone(paramActivity, paramBundle, paramIUiListener);
  }
  
  public int story(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.Tencent", "story()");
    new SocialApi(this.mQQAuth.getQQToken()).story(paramActivity, paramBundle, paramIUiListener);
    return 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\tauth\Tencent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */