package com.tencent.connect.common;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.tencent.connect.auth.QQAuth;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.TDialog;
import com.tencent.open.a.f;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;

public abstract class BaseApi
{
  protected static final String ACTION_CHECK_TOKEN = "action_check_token";
  protected static final String ACTIVITY_AGENT = "com.tencent.open.agent.AgentActivity";
  protected static final String ACTIVITY_ENCRY_TOKEN = "com.tencent.open.agent.EncryTokenActivity";
  protected static final String DEFAULT_PF = "openmobile_android";
  private static final String KEY_REQUEST_CODE = "key_request_code";
  private static final int MSG_COMPLETE = 0;
  protected static final String PARAM_ENCRY_EOKEN = "encry_token";
  protected static final String PLATFORM = "desktop_m_qq";
  protected static final String PREFERENCE_PF = "pfStore";
  private static final String TAG = "openSDK_LOG.BaseApi";
  protected static final String VERSION = "android";
  public static String businessId = null;
  public static String installChannel;
  public static boolean isOEM = false;
  public static String registerChannel = null;
  protected ProgressDialog mProgressDialog;
  protected QQAuth mQQAuth;
  protected QQToken mToken;
  
  static
  {
    installChannel = null;
  }
  
  public BaseApi(QQAuth paramQQAuth, QQToken paramQQToken)
  {
    this.mQQAuth = paramQQAuth;
    this.mToken = paramQQToken;
  }
  
  public BaseApi(QQToken paramQQToken)
  {
    this(null, paramQQToken);
  }
  
  private Intent getAssitIntent(Activity paramActivity, Intent paramIntent)
  {
    paramActivity = new Intent(paramActivity.getApplicationContext(), AssistActivity.class);
    paramActivity.putExtra("is_login", true);
    paramActivity.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", paramIntent);
    return paramActivity;
  }
  
  protected Bundle composeActivityParams()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("appid", this.mToken.getAppId());
    if (this.mToken.isSessionValid())
    {
      localBundle.putString("keystr", this.mToken.getAccessToken());
      localBundle.putString("keytype", "0x80");
    }
    Object localObject = this.mToken.getOpenId();
    if (localObject != null) {
      localBundle.putString("hopenid", (String)localObject);
    }
    localBundle.putString("platform", "androidqz");
    localObject = Global.getContext().getSharedPreferences("pfStore", 0);
    if (isOEM) {
      localBundle.putString("pf", "desktop_m_qq-" + installChannel + "-" + "android" + "-" + registerChannel + "-" + businessId);
    }
    for (;;)
    {
      localBundle.putString("sdkv", "2.9.4.lite");
      localBundle.putString("sdkp", "a");
      return localBundle;
      localBundle.putString("pf", ((SharedPreferences)localObject).getString("pf", "openmobile_android"));
      localBundle.putString("pf", "openmobile_android");
    }
  }
  
  protected Bundle composeCGIParams()
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("format", "json");
    localBundle.putString("status_os", Build.VERSION.RELEASE);
    localBundle.putString("status_machine", Build.MODEL);
    localBundle.putString("status_version", Build.VERSION.SDK);
    localBundle.putString("sdkv", "2.9.4.lite");
    localBundle.putString("sdkp", "a");
    if ((this.mToken != null) && (this.mToken.isSessionValid()))
    {
      localBundle.putString("access_token", this.mToken.getAccessToken());
      localBundle.putString("oauth_consumer_key", this.mToken.getAppId());
      localBundle.putString("openid", this.mToken.getOpenId());
      localBundle.putString("appid_for_getting_config", this.mToken.getAppId());
    }
    SharedPreferences localSharedPreferences = Global.getContext().getSharedPreferences("pfStore", 0);
    if (isOEM)
    {
      localBundle.putString("pf", "desktop_m_qq-" + installChannel + "-" + "android" + "-" + registerChannel + "-" + businessId);
      return localBundle;
    }
    localBundle.putString("pf", localSharedPreferences.getString("pf", "openmobile_android"));
    return localBundle;
  }
  
  protected Intent getAgentIntent()
  {
    return getTargetActivityIntent("com.tencent.open.agent.AgentActivity");
  }
  
  protected Intent getAgentIntentWithTarget(String paramString)
  {
    Intent localIntent = new Intent();
    paramString = getTargetActivityIntent(paramString);
    if (paramString == null) {}
    while (paramString.getComponent() == null) {
      return null;
    }
    localIntent.setClassName(paramString.getComponent().getPackageName(), "com.tencent.open.agent.AgentActivity");
    return localIntent;
  }
  
  protected String getCommonDownloadQQUrl(String paramString)
  {
    Bundle localBundle = composeCGIParams();
    StringBuilder localStringBuilder = new StringBuilder();
    if (!TextUtils.isEmpty(paramString)) {
      localBundle.putString("need_version", paramString);
    }
    localStringBuilder.append("http://openmobile.qq.com/oauth2.0/m_jump_by_version?");
    localStringBuilder.append(Util.encodeUrl(localBundle));
    return localStringBuilder.toString();
  }
  
  protected Intent getTargetActivityIntent(String paramString)
  {
    Intent localIntent = new Intent();
    if (Util.isTablet(Global.getContext()))
    {
      localIntent.setClassName("com.tencent.minihd.qq", paramString);
      if (!SystemUtils.isActivityExist(Global.getContext(), localIntent)) {}
    }
    do
    {
      return localIntent;
      localIntent.setClassName("com.tencent.mobileqq", paramString);
    } while (SystemUtils.isActivityExist(Global.getContext(), localIntent));
    return null;
  }
  
  protected void handleDownloadLastestQQ(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.BaseApi", "--handleDownloadLastestQQ");
    paramIUiListener = new StringBuilder();
    paramIUiListener.append("http://qzs.qq.com/open/mobile/login/qzsjump.html?");
    paramIUiListener.append(Util.encodeUrl(paramBundle));
    new TDialog(paramActivity, "", paramIUiListener.toString(), null, this.mToken).show();
  }
  
  protected boolean hasActivityForIntent(Intent paramIntent)
  {
    if (paramIntent != null) {
      return SystemUtils.isActivityExist(Global.getContext(), paramIntent);
    }
    return false;
  }
  
  public void releaseResource() {}
  
  protected void showProgressDialog(Context paramContext, String paramString1, String paramString2)
  {
    String str = paramString1;
    if (TextUtils.isEmpty(paramString1)) {
      str = "请稍候";
    }
    paramString1 = paramString2;
    if (TextUtils.isEmpty(paramString2)) {
      paramString1 = "正在加载...";
    }
    this.mProgressDialog = ProgressDialog.show(paramContext, str, paramString1);
    this.mProgressDialog.setCancelable(true);
  }
  
  protected void startAssistActivity(Activity paramActivity, int paramInt, Intent paramIntent, boolean paramBoolean)
  {
    Intent localIntent = new Intent(paramActivity.getApplicationContext(), AssistActivity.class);
    if (paramBoolean) {
      localIntent.putExtra("is_qq_mobile_share", true);
    }
    localIntent.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", paramIntent);
    paramActivity.startActivityForResult(localIntent, paramInt);
  }
  
  protected void startAssistActivity(Activity paramActivity, Bundle paramBundle, int paramInt, Intent paramIntent)
  {
    Intent localIntent = new Intent(paramActivity.getApplicationContext(), AssistActivity.class);
    localIntent.putExtra("h5_share_data", paramBundle);
    localIntent.putExtra("openSDK_LOG.AssistActivity.ExtraIntent", paramIntent);
    paramActivity.startActivityForResult(localIntent, paramInt);
  }
  
  protected void startAssitActivity(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    paramIntent.putExtra("key_request_code", paramInt);
    paramActivity.startActivityForResult(getAssitIntent(paramActivity, paramIntent), paramInt);
  }
  
  protected void startAssitActivity(Fragment paramFragment, Intent paramIntent, int paramInt)
  {
    paramIntent.putExtra("key_request_code", paramInt);
    paramFragment.startActivityForResult(getAssitIntent(paramFragment.getActivity(), paramIntent), paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\common\BaseApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */