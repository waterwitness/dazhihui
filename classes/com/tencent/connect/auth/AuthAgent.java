package com.tencent.connect.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.BaseApi.TempRequestListener;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.a.f;
import com.tencent.open.b.d;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.HttpUtils;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.ThreadManager;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import java.lang.ref.WeakReference;

public class AuthAgent
  extends BaseApi
{
  public static final String SECURE_LIB_ARM64_FILE_NAME = "libwbsafeedit_64";
  public static final String SECURE_LIB_ARM_FILE_NAME = "libwbsafeedit";
  public static String SECURE_LIB_FILE_NAME = "libwbsafeedit";
  public static String SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
  public static final String SECURE_LIB_X86_64_FILE_NAME = "libwbsafeedit_x86_64";
  public static final String SECURE_LIB_X86_FILE_NAME = "libwbsafeedit_x86";
  private IUiListener a;
  private String b;
  private WeakReference<Activity> c;
  
  static
  {
    String str = Build.CPU_ABI;
    if ((str != null) && (!str.equals("")))
    {
      if (str.equalsIgnoreCase("arm64-v8a"))
      {
        SECURE_LIB_FILE_NAME = "libwbsafeedit_64";
        SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
        f.c("openSDK_LOG.AuthAgent", "is arm64-v8a architecture");
        return;
      }
      if (str.equalsIgnoreCase("x86"))
      {
        SECURE_LIB_FILE_NAME = "libwbsafeedit_x86";
        SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
        f.c("openSDK_LOG.AuthAgent", "is x86 architecture");
        return;
      }
      if (str.equalsIgnoreCase("x86_64"))
      {
        SECURE_LIB_FILE_NAME = "libwbsafeedit_x86_64";
        SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
        f.c("openSDK_LOG.AuthAgent", "is x86_64 architecture");
        return;
      }
      SECURE_LIB_FILE_NAME = "libwbsafeedit";
      SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
      f.c("openSDK_LOG.AuthAgent", "is arm(default) architecture");
      return;
    }
    SECURE_LIB_FILE_NAME = "libwbsafeedit";
    SECURE_LIB_NAME = SECURE_LIB_FILE_NAME + ".so";
    f.c("openSDK_LOG.AuthAgent", "is arm(default) architecture");
  }
  
  public AuthAgent(QQToken paramQQToken)
  {
    super(paramQQToken);
  }
  
  private int a(boolean paramBoolean, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- start");
    CookieSyncManager.createInstance(Global.getContext());
    Object localObject1 = composeCGIParams();
    if (paramBoolean) {
      ((Bundle)localObject1).putString("isadd", "1");
    }
    ((Bundle)localObject1).putString("scope", this.b);
    ((Bundle)localObject1).putString("client_id", this.mToken.getAppId());
    if (isOEM) {
      ((Bundle)localObject1).putString("pf", "desktop_m_qq-" + installChannel + "-" + "android" + "-" + registerChannel + "-" + businessId);
    }
    for (;;)
    {
      Object localObject2 = System.currentTimeMillis() / 1000L + "";
      ((Bundle)localObject1).putString("sign", SystemUtils.getAppSignatureMD5(Global.getContext(), (String)localObject2));
      ((Bundle)localObject1).putString("time", (String)localObject2);
      ((Bundle)localObject1).putString("display", "mobile");
      ((Bundle)localObject1).putString("response_type", "token");
      ((Bundle)localObject1).putString("redirect_uri", "auth://tauth.qq.com/");
      ((Bundle)localObject1).putString("cancel_display", "1");
      ((Bundle)localObject1).putString("switch", "1");
      ((Bundle)localObject1).putString("status_userip", Util.getUserIp());
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append(ServerSetting.getInstance().getEnvUrl(Global.getContext(), "http://openmobile.qq.com/oauth2.0/m_authorize?"));
      ((StringBuilder)localObject2).append(Util.encodeUrl((Bundle)localObject1));
      localObject1 = ((StringBuilder)localObject2).toString();
      paramIUiListener = new AuthAgent.TokenListener(this, Global.getContext(), paramIUiListener, true, false);
      f.b("openSDK_LOG.AuthAgent", "OpenUi, showDialog TDialog");
      ThreadManager.executeOnSubThread(new AuthAgent.1(this, (String)localObject1, paramIUiListener));
      f.c("openSDK_LOG.AuthAgent", "OpenUi, showDialog -- end");
      return 2;
      ((Bundle)localObject1).putString("pf", "openmobile_android");
    }
  }
  
  private boolean a(Activity paramActivity, Fragment paramFragment, boolean paramBoolean)
  {
    f.c("openSDK_LOG.AuthAgent", "startActionActivity() -- start");
    Intent localIntent = getTargetActivityIntent("com.tencent.open.agent.AgentActivity");
    if (localIntent != null)
    {
      Bundle localBundle = composeCGIParams();
      if (paramBoolean) {
        localBundle.putString("isadd", "1");
      }
      localBundle.putString("scope", this.b);
      localBundle.putString("client_id", this.mToken.getAppId());
      if (isOEM)
      {
        localBundle.putString("pf", "desktop_m_qq-" + installChannel + "-" + "android" + "-" + registerChannel + "-" + businessId);
        localBundle.putString("need_pay", "1");
        localBundle.putString("oauth_app_name", SystemUtils.getAppName(Global.getContext()));
        localIntent.putExtra("key_action", "action_login");
        localIntent.putExtra("key_params", localBundle);
        if (!hasActivityForIntent(localIntent)) {
          break label310;
        }
        this.a = new AuthAgent.FeedConfirmListener(this, this.a);
        UIListenerManager.getInstance().setListenerWithRequestcode(11101, this.a);
        if (paramFragment == null) {
          break label289;
        }
        f.b("openSDK_LOG.AuthAgent", "startAssitActivity fragment");
        startAssitActivity(paramFragment, localIntent, 11101);
      }
      for (;;)
      {
        f.c("openSDK_LOG.AuthAgent", "startActionActivity() -- end, found activity for loginIntent");
        d.a().a(0, "LOGIN_CHECK_SDK", "1000", this.mToken.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
        return true;
        localBundle.putString("pf", "openmobile_android");
        break;
        label289:
        f.b("openSDK_LOG.AuthAgent", "startAssitActivity activity");
        startAssitActivity(paramActivity, localIntent, 11101);
      }
    }
    label310:
    d.a().a(1, "LOGIN_CHECK_SDK", "1000", this.mToken.getAppId(), "", Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "startActionActivity fail");
    f.c("openSDK_LOG.AuthAgent", "startActionActivity() -- end, no target activity for loginIntent");
    return false;
  }
  
  protected void a(IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.AuthAgent", "reportDAU() -- start");
    String str1 = this.mToken.getAccessToken();
    String str2 = this.mToken.getOpenId();
    String str3 = this.mToken.getAppId();
    Object localObject = "";
    paramIUiListener = (IUiListener)localObject;
    if (!TextUtils.isEmpty(str1))
    {
      paramIUiListener = (IUiListener)localObject;
      if (!TextUtils.isEmpty(str2))
      {
        paramIUiListener = (IUiListener)localObject;
        if (!TextUtils.isEmpty(str3)) {
          paramIUiListener = Util.encrypt("tencent&sdk&qazxc***14969%%" + str1 + str3 + str2 + "qzone3.4");
        }
      }
    }
    if (TextUtils.isEmpty(paramIUiListener))
    {
      f.e("openSDK_LOG.AuthAgent", "reportDAU -- encrytoken is null");
      return;
    }
    localObject = composeCGIParams();
    ((Bundle)localObject).putString("encrytoken", paramIUiListener);
    HttpUtils.requestAsync(this.mToken, Global.getContext(), "https://openmobile.qq.com/user/user_login_statis", (Bundle)localObject, "POST", null);
    f.c("openSDK_LOG.AuthAgent", "reportDAU() -- end");
  }
  
  protected void b(IUiListener paramIUiListener)
  {
    Bundle localBundle = composeCGIParams();
    localBundle.putString("reqType", "checkLogin");
    paramIUiListener = new BaseApi.TempRequestListener(this, new AuthAgent.CheckLoginListener(this, paramIUiListener));
    HttpUtils.requestAsync(this.mToken, Global.getContext(), "https://openmobile.qq.com/v3/user/get_info", localBundle, "GET", paramIUiListener);
  }
  
  public int doLogin(Activity paramActivity, String paramString, IUiListener paramIUiListener)
  {
    return doLogin(paramActivity, paramString, paramIUiListener, false, null);
  }
  
  public int doLogin(Activity paramActivity, String paramString, IUiListener paramIUiListener, boolean paramBoolean, Fragment paramFragment)
  {
    this.b = paramString;
    this.c = new WeakReference(paramActivity);
    this.a = paramIUiListener;
    if (a(paramActivity, paramFragment, paramBoolean))
    {
      f.c("openSDK_LOG.AuthAgent", "OpenUi, showUi, return Constants.UI_ACTIVITY");
      d.a().a(this.mToken.getOpenId(), this.mToken.getAppId(), "2", "310", "5", "0", "0", "0");
      return 1;
    }
    d.a().a(this.mToken.getOpenId(), this.mToken.getAppId(), "2", "310", "5", "1", "0", "0");
    f.d("openSDK_LOG.AuthAgent", "doLogin startActivity fail show dialog.");
    this.a = new AuthAgent.FeedConfirmListener(this, this.a);
    return a(paramBoolean, this.a);
  }
  
  public void releaseResource()
  {
    this.c = null;
    this.a = null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthAgent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */