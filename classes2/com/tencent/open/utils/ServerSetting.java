package com.tencent.open.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import com.tencent.open.a.f;
import java.lang.ref.WeakReference;
import java.net.URL;

public class ServerSetting
{
  public static final String APP_DETAIL_PAGE = "http://fusion.qq.com/cgi-bin/qzapps/unified_jump?appid=%1$s&from=%2$s&isOpenAppID=1";
  public static final String CGI_FETCH_QQ_URL = "http://fusion.qq.com/cgi-bin/qzapps/mapp_getappinfo.cgi";
  public static final String DEFAULT_CGI_AUTHORIZE = "http://openmobile.qq.com/oauth2.0/m_authorize?";
  public static final String DEFAULT_LOCAL_STORAGE_URI = "http://qzs.qq.com";
  public static final String DEFAULT_REDIRECT_URI = "auth://tauth.qq.com/";
  public static final String DEFAULT_URL_ASK = "http://qzs.qq.com/open/mobile/request/sdk_request.html?";
  public static final String DEFAULT_URL_BRAG = "http://qzs.qq.com/open/mobile/brag/sdk_brag.html?";
  public static final String DEFAULT_URL_GIFT = "http://qzs.qq.com/open/mobile/request/sdk_request.html?";
  public static final String DEFAULT_URL_GRAPH_BASE = "https://openmobile.qq.com/";
  public static final String DEFAULT_URL_INVITE = "http://qzs.qq.com/open/mobile/invite/sdk_invite.html?";
  public static final String DEFAULT_URL_REACTIVE = "http://qzs.qq.com/open/mobile/reactive/sdk_reactive.html?";
  public static final String DEFAULT_URL_REPORT = "http://wspeed.qq.com/w.cgi";
  public static final String DEFAULT_URL_SEND_STORY = "http://qzs.qq.com/open/mobile/sendstory/sdk_sendstory_v1.3.html?";
  public static final String DEFAULT_URL_VOICE = "http://qzs.qq.com/open/mobile/not_support.html?";
  public static final String DOWNLOAD_QQ_URL = "http://qzs.qq.com/open/mobile/login/qzsjump.html?";
  public static final String DOWNLOAD_QQ_URL_COMMON = "http://qzs.qq.com/open/mobile/sdk_common/down_qq.htm?";
  public static final int ENVIRONMENT_EXPERIENCE = 1;
  public static final int ENVIRONMENT_NORMOL = 0;
  public static final String KEY_HOST_ANALY = "analy.qq.com";
  public static final String KEY_HOST_APPIC = "appic.qq.com";
  public static final String KEY_HOST_APP_SUPPORT = "appsupport.qq.com";
  public static final String KEY_HOST_FUSION = "fusion.qq.com";
  public static final String KEY_HOST_I_GTIMG = "i.gtimg.cn";
  public static final String KEY_HOST_MAPP_QZONE = "mapp.qzone.qq.com";
  public static final String KEY_HOST_OPEN_MOBILE = "openmobile.qq.com";
  public static final String KEY_HOST_QZAPP_QLOGO = "qzapp.qlogo.cn";
  public static final String KEY_HOST_QZS_QQ = "qzs.qq.com";
  public static final String KEY_OPEN_ENV = "OpenEnvironment";
  public static final String KEY_OPEN_SETTING = "OpenSettings";
  public static final String NEED_QQ_VERSION_TIPS_URL = "http://openmobile.qq.com/oauth2.0/m_jump_by_version?";
  public static final String URL_FUSION_BASE = "http://fusion.qq.com";
  public static final String URL_FUSION_CGI_BASE = "http://fusion.qq.com/cgi-bin";
  public static final String URL_PRIZE_EXCHANGE = "http://fusion.qq.com/cgi-bin/prize_sharing/exchange_prize.cgi";
  public static final String URL_PRIZE_GET_ACTIVITY_STATE = "http://fusion.qq.com/cgi-bin/prize_sharing/get_activity_state.cgi";
  public static final String URL_PRIZE_MAKE_SHARE_URL = "http://fusion.qq.com/cgi-bin/prize_sharing/make_share_url.cgi";
  public static final String URL_PRIZE_QUERY_UNEXCHANGE = "http://fusion.qq.com/cgi-bin/prize_sharing/query_unexchange_prize.cgi";
  private static ServerSetting a = null;
  private volatile WeakReference<SharedPreferences> b = null;
  
  public static ServerSetting getInstance()
  {
    try
    {
      if (a == null) {
        a = new ServerSetting();
      }
      ServerSetting localServerSetting = a;
      return localServerSetting;
    }
    finally {}
  }
  
  public void changeServer()
  {
    this.b = null;
  }
  
  public String getEnvUrl(Context paramContext, String paramString)
  {
    if ((this.b == null) || (this.b.get() == null)) {
      this.b = new WeakReference(paramContext.getSharedPreferences("ServerPrefs", 0));
    }
    paramContext = paramString;
    String str1;
    String str2;
    try
    {
      str1 = new URL(paramString).getHost();
      if (str1 == null)
      {
        paramContext = paramString;
        f.e("openSDK_LOG.ServerSetting", "Get host error. url=" + paramString);
        return paramString;
      }
      paramContext = paramString;
      str2 = ((SharedPreferences)this.b.get()).getString(str1, null);
      if (str2 != null)
      {
        paramContext = paramString;
        if (!str1.equals(str2)) {}
      }
      else
      {
        paramContext = paramString;
        f.a("openSDK_LOG.ServerSetting", "host=" + str1 + ", envHost=" + str2);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      f.e("openSDK_LOG.ServerSetting", "getEnvUrl url=" + paramContext + "error.: " + paramString.getMessage());
      return paramContext;
    }
    paramContext = paramString;
    paramString = paramString.replace(str1, str2);
    paramContext = paramString;
    f.a("openSDK_LOG.ServerSetting", "return environment url : " + paramString);
    return paramString;
  }
  
  public void setEnvironment(Context paramContext, int paramInt)
  {
    if ((paramContext != null) && ((this.b == null) || (this.b.get() == null))) {
      this.b = new WeakReference(paramContext.getSharedPreferences("ServerPrefs", 0));
    }
    if ((paramInt != 0) && (paramInt != 1)) {
      f.e("openSDK_LOG.ServerSetting", "切换环境参数错误，正式环境为0，体验环境为1");
    }
    SharedPreferences.Editor localEditor;
    do
    {
      do
      {
        return;
        switch (paramInt)
        {
        default: 
          return;
        case 0: 
          localEditor = ((SharedPreferences)this.b.get()).edit();
        }
      } while (localEditor == null);
      localEditor.putInt("ServerType", 0);
      localEditor.putString("OpenEnvironment", "formal");
      localEditor.putString("qzs.qq.com", "qzs.qq.com");
      localEditor.putString("openmobile.qq.com", "openmobile.qq.com");
      localEditor.commit();
      changeServer();
      Toast.makeText(paramContext, "已切换到正式环境", 0).show();
      return;
      localEditor = ((SharedPreferences)this.b.get()).edit();
    } while (localEditor == null);
    localEditor.putInt("ServerType", 1);
    localEditor.putString("OpenEnvironment", "exp");
    localEditor.putString("qzs.qq.com", "testmobile.qq.com");
    localEditor.putString("openmobile.qq.com", "test.openmobile.qq.com");
    localEditor.commit();
    changeServer();
    Toast.makeText(paramContext, "已切换到体验环境", 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\ServerSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */