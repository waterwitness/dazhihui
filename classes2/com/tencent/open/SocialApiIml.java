package com.tencent.open;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.CookieSyncManager;
import android.webkit.WebSettings;
import com.tencent.connect.auth.QQAuth;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.a.f;
import com.tencent.open.c.b;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.OpenConfig;
import com.tencent.open.utils.ServerSetting;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import org.json.JSONException;
import org.json.JSONObject;

public class SocialApiIml
  extends BaseApi
{
  private Activity a;
  
  public SocialApiIml(QQAuth paramQQAuth, QQToken paramQQToken)
  {
    super(paramQQAuth, paramQQToken);
  }
  
  public SocialApiIml(QQToken paramQQToken)
  {
    super(paramQQToken);
  }
  
  private void a(Activity paramActivity, Intent paramIntent, String paramString, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.SocialApiIml", "-->handleIntentWithAgent action = " + paramString);
    paramIntent.putExtra("key_action", paramString);
    paramIntent.putExtra("key_params", paramBundle);
    UIListenerManager.getInstance().setListenerWithRequestcode(11105, paramIUiListener);
    startAssitActivity(paramActivity, paramIntent, 11105);
  }
  
  private void a(Activity paramActivity, Intent paramIntent, String paramString1, Bundle paramBundle, String paramString2, IUiListener paramIUiListener, boolean paramBoolean)
  {
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder().append("-->handleIntent action = ").append(paramString1).append(", activityIntent = null ? ");
    if (paramIntent == null) {}
    for (boolean bool = true;; bool = false)
    {
      f.c("openSDK_LOG.SocialApiIml", bool);
      if (paramIntent == null) {
        break;
      }
      a(paramActivity, paramIntent, paramString1, paramBundle, paramIUiListener);
      return;
    }
    paramIntent = OpenConfig.getInstance(Global.getContext(), this.mToken.getAppId());
    if ((paramBoolean) || (paramIntent.getBoolean("C_LoginH5"))) {
      i = 1;
    }
    if (i != 0)
    {
      a(paramActivity, paramString1, paramBundle, paramString2, paramIUiListener);
      return;
    }
    handleDownloadLastestQQ(paramActivity, paramBundle, paramIUiListener);
  }
  
  private void a(Activity paramActivity, String paramString, Bundle paramBundle, IUiListener paramIUiListener)
  {
    this.a = paramActivity;
    Intent localIntent2 = getAgentIntentWithTarget("com.tencent.open.agent.SocialFriendChooser");
    Intent localIntent1 = localIntent2;
    if (localIntent2 == null)
    {
      f.c("openSDK_LOG.SocialApiIml", "--askgift--friend chooser not found");
      localIntent1 = getAgentIntentWithTarget("com.tencent.open.agent.RequestFreegiftActivity");
    }
    paramBundle.putAll(composeActivityParams());
    if ("action_ask".equals(paramString)) {
      paramBundle.putString("type", "request");
    }
    for (;;)
    {
      a(paramActivity, localIntent1, paramString, paramBundle, ServerSetting.getInstance().getEnvUrl(Global.getContext(), "http://qzs.qq.com/open/mobile/request/sdk_request.html?"), paramIUiListener, false);
      return;
      if ("action_gift".equals(paramString)) {
        paramBundle.putString("type", "freegift");
      }
    }
  }
  
  private void a(Activity paramActivity, String paramString1, Bundle paramBundle, String paramString2, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5 action = " + paramString1);
    Intent localIntent = getTargetActivityIntent("com.tencent.open.agent.AgentActivity");
    paramString1 = new SocialApiIml.a(this, paramActivity, paramIUiListener, paramString1, paramString2, paramBundle);
    paramBundle = getTargetActivityIntent("com.tencent.open.agent.EncryTokenActivity");
    if ((paramBundle != null) && (localIntent != null) && (localIntent.getComponent() != null) && (paramBundle.getComponent() != null) && (localIntent.getComponent().getPackageName().equals(paramBundle.getComponent().getPackageName())))
    {
      paramBundle.putExtra("oauth_consumer_key", this.mToken.getAppId());
      paramBundle.putExtra("openid", this.mToken.getOpenId());
      paramBundle.putExtra("access_token", this.mToken.getAccessToken());
      paramBundle.putExtra("key_action", "action_check_token");
      if (hasActivityForIntent(paramBundle))
      {
        f.c("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5--found token activity");
        UIListenerManager.getInstance().setListenerWithRequestcode(11106, paramString1);
        startAssitActivity(paramActivity, paramBundle, 11106);
      }
      return;
    }
    f.c("openSDK_LOG.SocialApiIml", "-->handleIntentWithH5--token activity not found");
    paramBundle = Util.encrypt("tencent&sdk&qazxc***14969%%" + this.mToken.getAccessToken() + this.mToken.getAppId() + this.mToken.getOpenId() + "qzone3.4");
    paramActivity = new JSONObject();
    try
    {
      paramActivity.put("encry_token", paramBundle);
      paramString1.onComplete(paramActivity);
      return;
    }
    catch (JSONException paramBundle)
    {
      for (;;)
      {
        paramBundle.printStackTrace();
      }
    }
  }
  
  private void a(Context paramContext, String paramString1, Bundle paramBundle, String paramString2, IUiListener paramIUiListener)
  {
    f.a("openSDK_LOG.SocialApiIml", "OpenUi, showDialog --start");
    CookieSyncManager.createInstance(paramContext);
    paramBundle.putString("oauth_consumer_key", this.mToken.getAppId());
    if (this.mToken.isSessionValid()) {
      paramBundle.putString("access_token", this.mToken.getAccessToken());
    }
    paramContext = this.mToken.getOpenId();
    if (paramContext != null) {
      paramBundle.putString("openid", paramContext);
    }
    try
    {
      paramBundle.putString("pf", Global.getContext().getSharedPreferences("pfStore", 0).getString("pf", "openmobile_android"));
      paramContext = new StringBuilder();
      paramContext.append(paramString2);
      paramContext.append(Util.encodeUrl(paramBundle));
      paramContext = paramContext.toString();
      f.b("openSDK_LOG.SocialApiIml", "OpenUi, showDialog TDialog");
      if (("action_challenge".equals(paramString1)) || ("action_brag".equals(paramString1)))
      {
        f.b("openSDK_LOG.SocialApiIml", "OpenUi, showDialog PKDialog");
        new PKDialog(this.a, paramString1, paramContext, paramIUiListener, this.mToken).show();
        return;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        paramBundle.putString("pf", "openmobile_android");
      }
      new TDialog(this.a, paramString1, paramContext, paramIUiListener, this.mToken).show();
    }
  }
  
  public void ask(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    a(paramActivity, "action_ask", paramBundle, paramIUiListener);
  }
  
  protected Intent getTargetActivityIntent(String paramString)
  {
    Intent localIntent1 = new Intent();
    localIntent1.setClassName("com.qzone", paramString);
    Intent localIntent2 = new Intent();
    localIntent2.setClassName("com.tencent.mobileqq", paramString);
    if ((SystemUtils.isActivityExist(Global.getContext(), localIntent2)) && (SystemUtils.compareQQVersion(Global.getContext(), "4.7") >= 0)) {
      paramString = localIntent2;
    }
    do
    {
      return paramString;
      if ((!SystemUtils.isActivityExist(Global.getContext(), localIntent1)) || (SystemUtils.compareVersion(SystemUtils.getAppVersionName(Global.getContext(), "com.qzone"), "4.2") < 0)) {
        break;
      }
      paramString = localIntent1;
    } while (SystemUtils.isAppSignatureValid(Global.getContext(), localIntent1.getComponent().getPackageName(), "ec96e9ac1149251acbb1b0c5777cae95"));
    return null;
    return null;
  }
  
  public void gift(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    a(paramActivity, "action_gift", paramBundle, paramIUiListener);
  }
  
  public void invite(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    this.a = paramActivity;
    Intent localIntent2 = getAgentIntentWithTarget("com.tencent.open.agent.SocialFriendChooser");
    Intent localIntent1 = localIntent2;
    if (localIntent2 == null)
    {
      f.c("openSDK_LOG.SocialApiIml", "--invite--friend chooser not found");
      localIntent1 = getAgentIntentWithTarget("com.tencent.open.agent.AppInvitationActivity");
    }
    paramBundle.putAll(composeActivityParams());
    a(paramActivity, localIntent1, "action_invite", paramBundle, ServerSetting.getInstance().getEnvUrl(Global.getContext(), "http://qzs.qq.com/open/mobile/invite/sdk_invite.html?"), paramIUiListener, false);
  }
  
  public void story(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    this.a = paramActivity;
    Intent localIntent = getAgentIntentWithTarget("com.tencent.open.agent.SendStoryActivity");
    paramBundle.putAll(composeActivityParams());
    a(paramActivity, localIntent, "action_story", paramBundle, ServerSetting.getInstance().getEnvUrl(Global.getContext(), "http://qzs.qq.com/open/mobile/sendstory/sdk_sendstory_v1.3.html?"), paramIUiListener, false);
  }
  
  @SuppressLint({"SetJavaScriptEnabled"})
  public void writeEncryToken(Context paramContext)
  {
    String str = this.mToken.getAccessToken();
    Object localObject1 = this.mToken.getAppId();
    Object localObject2 = this.mToken.getOpenId();
    if ((str != null) && (str.length() > 0) && (localObject1 != null) && (((String)localObject1).length() > 0) && (localObject2 != null) && (((String)localObject2).length() > 0)) {}
    for (str = Util.encrypt("tencent&sdk&qazxc***14969%%" + str + (String)localObject1 + (String)localObject2 + "qzone3.4");; str = null)
    {
      localObject1 = new b(paramContext);
      localObject2 = ((b)localObject1).getSettings();
      ((WebSettings)localObject2).setDomStorageEnabled(true);
      ((WebSettings)localObject2).setJavaScriptEnabled(true);
      ((WebSettings)localObject2).setDatabaseEnabled(true);
      str = "<!DOCTYPE HTML><html lang=\"en-US\"><head><meta charset=\"UTF-8\"><title>localStorage Test</title><script type=\"text/javascript\">document.domain = 'qq.com';localStorage[\"" + this.mToken.getOpenId() + "_" + this.mToken.getAppId() + "\"]=\"" + str + "\";</script></head><body></body></html>";
      paramContext = ServerSetting.getInstance().getEnvUrl(paramContext, "http://qzs.qq.com");
      ((b)localObject1).loadDataWithBaseURL(paramContext, str, "text/html", "utf-8", paramContext);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\SocialApiIml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */