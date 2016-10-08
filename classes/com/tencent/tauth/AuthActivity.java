package com.tencent.tauth;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import com.tencent.open.a.f;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import org.json.JSONObject;

public class AuthActivity
  extends Activity
{
  private static final String ACTION_ADD_TO_QQFAVORITES = "addToQQFavorites";
  public static final String ACTION_KEY = "action";
  private static final String ACTION_SEND_TO_MY_COMPUTER = "sendToMyComputer";
  public static final String ACTION_SHARE_PRIZE = "sharePrize";
  private static final String ACTION_SHARE_TO_QQ = "shareToQQ";
  private static final String ACTION_SHARE_TO_QZONE = "shareToQzone";
  private static final String ACTION_SHARE_TO_TROOP_BAR = "shareToTroopBar";
  private static final String SHARE_PRIZE_ACTIVITY_ID = "activityid";
  private static final String TAG = "openSDK_LOG.AuthActivity";
  private static int mShareQzoneBackTime = 0;
  
  private void execAuthCallback(Bundle paramBundle, String paramString)
  {
    f.a("openSDK_LOG.AuthActivity", "execAuthCallback url = " + paramString);
  }
  
  private void handleActionUri(Uri paramUri)
  {
    f.c("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
    if ((paramUri == null) || (paramUri.toString() == null) || (paramUri.toString().equals("")))
    {
      f.d("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
      finish();
      return;
    }
    Object localObject1 = paramUri.toString();
    paramUri = Util.decodeUrl(((String)localObject1).substring(((String)localObject1).indexOf("#") + 1));
    if (paramUri == null)
    {
      f.d("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
      finish();
      return;
    }
    Object localObject2 = paramUri.getString("action");
    f.c("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + (String)localObject2);
    if (localObject2 == null)
    {
      execAuthCallback(paramUri, (String)localObject1);
      return;
    }
    if ((((String)localObject2).equals("shareToQQ")) || (((String)localObject2).equals("shareToQzone")) || (((String)localObject2).equals("addToQQFavorites")) || (((String)localObject2).equals("sendToMyComputer")) || (((String)localObject2).equals("shareToTroopBar")))
    {
      if ((((String)localObject2).equals("shareToQzone")) && (SystemUtils.getAppVersionName(this, "com.tencent.mobileqq") != null) && (SystemUtils.compareQQVersion(this, "5.2.0") < 0))
      {
        mShareQzoneBackTime += 1;
        if (mShareQzoneBackTime == 2)
        {
          mShareQzoneBackTime = 0;
          finish();
          return;
        }
      }
      f.c("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
      localObject1 = new Intent(this, AssistActivity.class);
      ((Intent)localObject1).putExtras(paramUri);
      ((Intent)localObject1).setFlags(603979776);
      startActivity((Intent)localObject1);
      finish();
      return;
    }
    if (((String)localObject2).equals("sharePrize"))
    {
      localObject2 = getPackageManager().getLaunchIntentForPackage(getPackageName());
      localObject1 = paramUri.getString("response");
      paramUri = "";
      try
      {
        localObject1 = Util.parseJson((String)localObject1).getString("activityid");
        paramUri = (Uri)localObject1;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          f.b("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", localException);
        }
      }
      if (!TextUtils.isEmpty(paramUri))
      {
        ((Intent)localObject2).putExtra("sharePrize", true);
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("activityid", paramUri);
        ((Intent)localObject2).putExtras((Bundle)localObject1);
      }
      startActivity((Intent)localObject2);
      finish();
      return;
    }
    execAuthCallback(paramUri, localException);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      f.d("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
      return;
    }
    paramBundle = null;
    try
    {
      Uri localUri = getIntent().getData();
      paramBundle = localUri;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        f.e("openSDK_LOG.AuthActivity", "-->onCreate, getIntent().getData() has exception! " + localException.getMessage());
      }
    }
    f.a("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + paramBundle);
    handleActionUri(paramBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\tauth\AuthActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */