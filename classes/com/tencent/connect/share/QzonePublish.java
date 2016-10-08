package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.a.a;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.open.TDialog;
import com.tencent.open.a.f;
import com.tencent.open.b.d;
import com.tencent.open.utils.Global;
import com.tencent.open.utils.SystemUtils;
import com.tencent.open.utils.Util;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.net.URLEncoder;
import java.util.ArrayList;

public class QzonePublish
  extends BaseApi
{
  public static final String PUBLISH_TO_QZONE_APP_NAME = "appName";
  public static final String PUBLISH_TO_QZONE_IMAGE_URL = "imageUrl";
  public static final String PUBLISH_TO_QZONE_KEY_TYPE = "req_type";
  public static final String PUBLISH_TO_QZONE_SUMMARY = "summary";
  public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHMOOD = 3;
  public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO = 4;
  public static final String PUBLISH_TO_QZONE_VIDEO_DURATION = "videoDuration";
  public static final String PUBLISH_TO_QZONE_VIDEO_PATH = "videoPath";
  public static final String PUBLISH_TO_QZONE_VIDEO_SIZE = "videoSize";
  
  public QzonePublish(Context paramContext, QQToken paramQQToken)
  {
    super(paramQQToken);
  }
  
  private void a(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.QzonePublish", "doPublishToQzone() --start");
    paramIUiListener = new StringBuffer("mqqapi://qzone/publish?src_type=app&version=1&file_type=news");
    ArrayList localArrayList = paramBundle.getStringArrayList("imageUrl");
    String str1 = paramBundle.getString("summary");
    int j = paramBundle.getInt("req_type", 3);
    String str2 = paramBundle.getString("appName");
    String str3 = paramBundle.getString("videoPath");
    int k = paramBundle.getInt("videoDuration");
    long l = paramBundle.getLong("videoSize");
    paramBundle = this.mToken.getAppId();
    String str4 = this.mToken.getOpenId();
    f.a("openSDK_LOG.QzonePublish", "openId:" + str4);
    if ((3 == j) && (localArrayList != null))
    {
      StringBuffer localStringBuffer = new StringBuffer();
      int m = localArrayList.size();
      int i = 0;
      while (i < m)
      {
        localStringBuffer.append(URLEncoder.encode((String)localArrayList.get(i)));
        if (i != m - 1) {
          localStringBuffer.append(";");
        }
        i += 1;
      }
      paramIUiListener.append("&image_url=" + Base64.encodeToString(Util.getBytesUTF8(localStringBuffer.toString()), 2));
    }
    if (4 == j)
    {
      paramIUiListener.append("&videoPath=" + Base64.encodeToString(Util.getBytesUTF8(str3), 2));
      paramIUiListener.append("&videoDuration=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(k)), 2));
      paramIUiListener.append("&videoSize=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(l)), 2));
    }
    if (!TextUtils.isEmpty(str1)) {
      paramIUiListener.append("&description=" + Base64.encodeToString(Util.getBytesUTF8(str1), 2));
    }
    if (!TextUtils.isEmpty(paramBundle)) {
      paramIUiListener.append("&share_id=" + paramBundle);
    }
    if (!TextUtils.isEmpty(str2)) {
      paramIUiListener.append("&app_name=" + Base64.encodeToString(Util.getBytesUTF8(str2), 2));
    }
    if (!Util.isEmpty(str4)) {
      paramIUiListener.append("&open_id=" + Base64.encodeToString(Util.getBytesUTF8(str4), 2));
    }
    paramIUiListener.append("&req_type=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(j)), 2));
    f.a("openSDK_LOG.QzonePublish", "doPublishToQzone, url: " + paramIUiListener.toString());
    a.a(Global.getContext(), this.mToken, "requireApi", new String[] { "shareToNativeQQ" });
    paramBundle = new Intent("android.intent.action.VIEW");
    paramBundle.setData(Uri.parse(paramIUiListener.toString()));
    paramBundle.putExtra("pkg_name", paramActivity.getPackageName());
    if (hasActivityForIntent(paramBundle))
    {
      startAssistActivity(paramActivity, 10104, paramBundle, false);
      d.a().a(0, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent success");
    }
    for (;;)
    {
      f.c("openSDK_LOG", "doPublishToQzone() --end");
      return;
      f.e("openSDK_LOG.QzonePublish", "doPublishToQzone() target activity not found");
      d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
    }
  }
  
  public void publishToQzone(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    int i = 0;
    f.c("openSDK_LOG.QzonePublish", "publishToQzone() -- start");
    if (paramBundle == null)
    {
      paramIUiListener.onError(new UiError(-6, "传入参数不可以为空", null));
      f.e("openSDK_LOG.QzonePublish", "-->publishToQzone, params is null");
      d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "传入参数不可以为空");
      return;
    }
    if (SystemUtils.compareQQVersion(paramActivity, "5.9.5") < 0)
    {
      paramIUiListener.onError(new UiError(-15, "手Q版本过低，请下载安装最新版手Q", null));
      f.e("openSDK_LOG.QzonePublish", "-->publishToQzone, this is not support below qq 5.9.5");
      d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publicToQzone, this is not support below qq 5.9.5");
      new TDialog(paramActivity, "", getCommonDownloadQQUrl(""), null, this.mToken).show();
      return;
    }
    String str = paramBundle.getString("summary");
    ArrayList localArrayList = paramBundle.getStringArrayList("imageUrl");
    Object localObject2 = Util.getApplicationLable(paramActivity);
    Object localObject1;
    if (localObject2 == null) {
      localObject1 = paramBundle.getString("appName");
    }
    int j;
    for (;;)
    {
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        paramBundle.putString("appName", (String)localObject1);
      }
      paramBundle.putString("summary", str);
      j = paramBundle.getInt("req_type");
      if (j != 3) {
        break label372;
      }
      if ((localArrayList == null) || (localArrayList.size() <= 0)) {
        break label356;
      }
      while (i < localArrayList.size())
      {
        if (!Util.isValidPath((String)localArrayList.get(i))) {
          localArrayList.remove(i);
        }
        i += 1;
      }
      localObject1 = localObject2;
      if (((String)localObject2).length() > 20) {
        localObject1 = ((String)localObject2).substring(0, 20) + "...";
      }
    }
    paramBundle.putStringArrayList("imageUrl", localArrayList);
    label356:
    a(paramActivity, paramBundle, paramIUiListener);
    f.c("openSDK_LOG.QzonePublish", "publishToQzone() --end");
    return;
    label372:
    if (j == 4)
    {
      localObject1 = paramBundle.getString("videoPath");
      if (!Util.isValidPath((String)localObject1))
      {
        f.e("openSDK_LOG.QzonePublish", "publishToQzone() video url invalid");
        paramIUiListener.onError(new UiError(-5, "请选择有效的视频文件", null));
        return;
      }
      localObject2 = new MediaPlayer();
      ((MediaPlayer)localObject2).setOnPreparedListener(new QzonePublish.1(this, (String)localObject1, paramBundle, paramActivity, paramIUiListener));
      ((MediaPlayer)localObject2).setOnErrorListener(new QzonePublish.2(this, paramIUiListener));
      try
      {
        ((MediaPlayer)localObject2).setDataSource((String)localObject1);
        ((MediaPlayer)localObject2).prepareAsync();
        return;
      }
      catch (Exception paramActivity)
      {
        f.e("openSDK_LOG.QzonePublish", "publishToQzone() exception(s) occurred when preparing mediaplayer");
        paramIUiListener.onError(new UiError(-5, "请选择有效的视频文件", null));
        return;
      }
    }
    paramIUiListener.onError(new UiError(-5, "请选择支持的分享类型", null));
    f.e("openSDK_LOG.QzonePublish", "publishToQzone() error--end请选择支持的分享类型");
    d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "publishToQzone() 请选择支持的分享类型");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\share\QzonePublish.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */