package com.tencent.connect.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.UIListenerManager;
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

public class QzoneShare
  extends BaseApi
{
  public static final String SHARE_TO_QQ_APP_NAME = "appName";
  public static final String SHARE_TO_QQ_AUDIO_URL = "audio_url";
  public static final String SHARE_TO_QQ_EXT_INT = "cflag";
  public static final String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
  public static final String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
  public static final String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
  public static final String SHARE_TO_QQ_SITE = "site";
  public static final String SHARE_TO_QQ_SUMMARY = "summary";
  public static final String SHARE_TO_QQ_TARGET_URL = "targetUrl";
  public static final String SHARE_TO_QQ_TITLE = "title";
  public static final String SHARE_TO_QZONE_KEY_TYPE = "req_type";
  public static final int SHARE_TO_QZONE_TYPE_APP = 6;
  public static final int SHARE_TO_QZONE_TYPE_IMAGE = 5;
  public static final int SHARE_TO_QZONE_TYPE_IMAGE_TEXT = 1;
  public static final int SHARE_TO_QZONE_TYPE_NO_TYPE = 0;
  private boolean a = true;
  private boolean b = false;
  private boolean c = false;
  private boolean d = false;
  public String mViaShareQzoneType = "";
  
  public QzoneShare(Context paramContext, QQToken paramQQToken)
  {
    super(paramQQToken);
  }
  
  private void a(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.QzoneShare", "doshareToQzone() --start");
    StringBuffer localStringBuffer1 = new StringBuffer("mqqapi://share/to_qzone?src_type=app&version=1&file_type=news");
    ArrayList localArrayList = paramBundle.getStringArrayList("imageUrl");
    String str1 = paramBundle.getString("title");
    String str2 = paramBundle.getString("summary");
    String str3 = paramBundle.getString("targetUrl");
    String str4 = paramBundle.getString("audio_url");
    int k = paramBundle.getInt("req_type", 1);
    String str5 = paramBundle.getString("appName");
    int m = paramBundle.getInt("cflag", 0);
    paramBundle = paramBundle.getString("share_qq_ext_str");
    String str6 = this.mToken.getAppId();
    String str7 = this.mToken.getOpenId();
    f.a("openSDK_LOG.QzoneShare", "openId:" + str7);
    if (localArrayList != null)
    {
      StringBuffer localStringBuffer2 = new StringBuffer();
      if (localArrayList.size() > 9) {}
      for (int i = 9;; i = localArrayList.size())
      {
        int j = 0;
        while (j < i)
        {
          localStringBuffer2.append(URLEncoder.encode((String)localArrayList.get(j)));
          if (j != i - 1) {
            localStringBuffer2.append(";");
          }
          j += 1;
        }
      }
      localStringBuffer1.append("&image_url=" + Base64.encodeToString(Util.getBytesUTF8(localStringBuffer2.toString()), 2));
    }
    if (!TextUtils.isEmpty(str1)) {
      localStringBuffer1.append("&title=" + Base64.encodeToString(Util.getBytesUTF8(str1), 2));
    }
    if (!TextUtils.isEmpty(str2)) {
      localStringBuffer1.append("&description=" + Base64.encodeToString(Util.getBytesUTF8(str2), 2));
    }
    if (!TextUtils.isEmpty(str6)) {
      localStringBuffer1.append("&share_id=" + str6);
    }
    if (!TextUtils.isEmpty(str3)) {
      localStringBuffer1.append("&url=" + Base64.encodeToString(Util.getBytesUTF8(str3), 2));
    }
    if (!TextUtils.isEmpty(str5)) {
      localStringBuffer1.append("&app_name=" + Base64.encodeToString(Util.getBytesUTF8(str5), 2));
    }
    if (!Util.isEmpty(str7)) {
      localStringBuffer1.append("&open_id=" + Base64.encodeToString(Util.getBytesUTF8(str7), 2));
    }
    if (!Util.isEmpty(str4)) {
      localStringBuffer1.append("&audioUrl=" + Base64.encodeToString(Util.getBytesUTF8(str4), 2));
    }
    localStringBuffer1.append("&req_type=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(k)), 2));
    if (!Util.isEmpty(paramBundle)) {
      localStringBuffer1.append("&share_qq_ext_str=" + Base64.encodeToString(Util.getBytesUTF8(paramBundle), 2));
    }
    localStringBuffer1.append("&cflag=" + Base64.encodeToString(Util.getBytesUTF8(String.valueOf(m)), 2));
    f.a("openSDK_LOG.QzoneShare", "doshareToQzone, url: " + localStringBuffer1.toString());
    com.tencent.connect.a.a.a(Global.getContext(), this.mToken, "requireApi", new String[] { "shareToNativeQQ" });
    paramBundle = new Intent("android.intent.action.VIEW");
    paramBundle.setData(Uri.parse(localStringBuffer1.toString()));
    paramBundle.putExtra("pkg_name", paramActivity.getPackageName());
    if (SystemUtils.compareQQVersion(paramActivity, "4.6.0") < 0)
    {
      if (hasActivityForIntent(paramBundle))
      {
        UIListenerManager.getInstance().setListenerWithRequestcode(11104, paramIUiListener);
        startAssitActivity(paramActivity, paramBundle, 11104);
      }
      f.c("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is < 4.6.0");
      if (!hasActivityForIntent(paramBundle)) {
        break label929;
      }
      d.a().a(this.mToken.getOpenId(), this.mToken.getAppId(), "ANDROIDQQ.SHARETOQZ.XX", "11", "3", "0", this.mViaShareQzoneType, "0", "1", "0");
      d.a().a(0, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "");
    }
    for (;;)
    {
      f.c("openSDK_LOG", "doShareToQzone() --end");
      return;
      f.c("openSDK_LOG.QzoneShare", "doShareToQzone() -- QQ Version is > 4.6.0");
      if (UIListenerManager.getInstance().setListnerWithAction("shareToQzone", paramIUiListener) != null) {
        f.c("openSDK_LOG.QzoneShare", "doShareToQzone() -- do listener onCancel()");
      }
      if (!hasActivityForIntent(paramBundle)) {
        break;
      }
      startAssistActivity(paramActivity, 10104, paramBundle, false);
      break;
      label929:
      d.a().a(this.mToken.getOpenId(), this.mToken.getAppId(), "ANDROIDQQ.SHARETOQZ.XX", "11", "3", "1", this.mViaShareQzoneType, "0", "1", "0");
      d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "hasActivityForIntent fail");
    }
  }
  
  public void releaseResource() {}
  
  public void shareToQzone(Activity paramActivity, Bundle paramBundle, IUiListener paramIUiListener)
  {
    f.c("openSDK_LOG.QzoneShare", "shareToQzone() -- start");
    if (paramBundle == null)
    {
      paramIUiListener.onError(new UiError(-6, "传入参数不可以为空", null));
      f.e("openSDK_LOG.QzoneShare", "shareToQzone() params is null");
      d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "传入参数不可以为空");
      return;
    }
    Object localObject2 = paramBundle.getString("title");
    String str = paramBundle.getString("summary");
    Object localObject3 = paramBundle.getString("targetUrl");
    ArrayList localArrayList = paramBundle.getStringArrayList("imageUrl");
    Object localObject4 = Util.getApplicationLable(paramActivity);
    Object localObject1;
    int j;
    if (localObject4 == null)
    {
      localObject1 = paramBundle.getString("appName");
      j = paramBundle.getInt("req_type");
      switch (j)
      {
      case 2: 
      case 3: 
      case 4: 
      default: 
        this.mViaShareQzoneType = "1";
        switch (j)
        {
        case 2: 
        case 3: 
        case 4: 
        default: 
          label183:
          if ((Util.isEmpty((String)localObject2)) && (Util.isEmpty(str))) {
            if ((localArrayList != null) && (localArrayList.size() != 0)) {
              this.a = false;
            }
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      this.b = false;
      this.c = true;
      this.d = false;
      localObject4 = localObject3;
      localObject3 = localObject2;
      localObject2 = localObject4;
      for (;;)
      {
        if ((Util.hasSDCard()) || (SystemUtils.compareQQVersion(paramActivity, "4.5.0") >= 0)) {
          break label703;
        }
        paramIUiListener.onError(new UiError(-6, "分享图片失败，检测不到SD卡!", null));
        f.e("openSDK_LOG.QzoneShare", "shareToQzone() sdcard is null--end");
        d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "分享图片失败，检测不到SD卡!");
        return;
        localObject1 = localObject4;
        if (((String)localObject4).length() <= 20) {
          break;
        }
        localObject1 = ((String)localObject4).substring(0, 20) + "...";
        break;
        this.mViaShareQzoneType = "4";
        break label183;
        this.mViaShareQzoneType = "1";
        break label183;
        this.mViaShareQzoneType = "2";
        break label183;
        if (SystemUtils.compareQQVersion(paramActivity, "5.0.0") < 0)
        {
          paramIUiListener.onError(new UiError(-15, "手Q版本过低，应用分享只支持手Q5.0及其以上版本", null));
          f.e("openSDK_LOG.QzoneShare", "-->shareToQzone, app share is not support below qq5.0.");
          d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone, app share is not support below qq5.0.");
          return;
        }
        localObject4 = String.format("http://fusion.qq.com/cgi-bin/qzapps/unified_jump?appid=%1$s&from=%2$s&isOpenAppID=1", new Object[] { this.mToken.getAppId(), "mqq" });
        paramBundle.putString("targetUrl", (String)localObject4);
        localObject3 = localObject2;
        localObject2 = localObject4;
        continue;
        this.a = true;
        this.b = false;
        this.c = true;
        this.d = false;
        localObject4 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject4;
      }
      paramIUiListener.onError(new UiError(-5, "请选择支持的分享类型", null));
      f.e("openSDK_LOG.QzoneShare", "shareToQzone() error--end请选择支持的分享类型");
      d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 请选择支持的分享类型");
      return;
      localObject2 = "来自" + (String)localObject1 + "的分享";
      this.a = true;
      continue;
      this.a = true;
    }
    label703:
    if (this.a)
    {
      if (TextUtils.isEmpty((CharSequence)localObject2))
      {
        paramIUiListener.onError(new UiError(-5, "targetUrl为必填项，请补充后分享", null));
        f.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl null error--end");
        d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "targetUrl为必填项，请补充后分享");
        return;
      }
      if (!Util.isValidUrl((String)localObject2))
      {
        paramIUiListener.onError(new UiError(-5, "targetUrl有误", null));
        f.e("openSDK_LOG.QzoneShare", "shareToQzone() targetUrl error--end");
        d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "targetUrl有误");
        return;
      }
    }
    if (this.b)
    {
      paramBundle.putString("title", "");
      paramBundle.putString("summary", "");
    }
    for (;;)
    {
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        paramBundle.putString("appName", (String)localObject1);
      }
      if ((localArrayList != null) && ((localArrayList == null) || (localArrayList.size() != 0))) {
        break;
      }
      if (!this.d) {
        break label1267;
      }
      paramIUiListener.onError(new UiError(-6, "纯图分享，imageUrl 不能为空", null));
      f.e("openSDK_LOG.QzoneShare", "shareToQzone() imageUrl is null -- end");
      d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() imageUrl is null");
      return;
      if ((this.c) && (Util.isEmpty((String)localObject3)))
      {
        paramIUiListener.onError(new UiError(-6, "title不能为空!", null));
        f.e("openSDK_LOG.QzoneShare", "shareToQzone() title is null--end");
        d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() title is null");
        return;
      }
      if ((!Util.isEmpty((String)localObject3)) && (((String)localObject3).length() > 200)) {
        paramBundle.putString("title", Util.subString((String)localObject3, 200, null, null));
      }
      if ((!Util.isEmpty(str)) && (str.length() > 600)) {
        paramBundle.putString("summary", Util.subString(str, 600, null, null));
      }
    }
    int i = 0;
    while (i < localArrayList.size())
    {
      localObject1 = (String)localArrayList.get(i);
      if ((!Util.isValidUrl((String)localObject1)) && (!Util.isValidPath((String)localObject1))) {
        localArrayList.remove(i);
      }
      i += 1;
    }
    if (localArrayList.size() == 0)
    {
      paramIUiListener.onError(new UiError(-6, "非法的图片地址!", null));
      f.e("openSDK_LOG.QzoneShare", "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end");
      d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone() 非法的图片地址!");
      return;
    }
    paramBundle.putStringArrayList("imageUrl", localArrayList);
    label1267:
    if (SystemUtils.compareQQVersion(paramActivity, "4.6.0") >= 0)
    {
      f.c("openSDK_LOG.QzoneShare", "shareToQzone() qqver greater than 4.6.0");
      a.a(paramActivity, localArrayList, new QzoneShare.1(this, paramBundle, paramActivity, paramIUiListener));
    }
    for (;;)
    {
      f.c("openSDK_LOG.QzoneShare", "shareToQzone() --end");
      return;
      if ((SystemUtils.compareQQVersion(paramActivity, "4.2.0") >= 0) && (SystemUtils.compareQQVersion(paramActivity, "4.6.0") < 0))
      {
        f.d("openSDK_LOG.QzoneShare", "shareToQzone() qqver between 4.2.0 and 4.6.0, will use qqshare");
        localObject1 = new QQShare(paramActivity, this.mToken);
        if ((localArrayList != null) && (localArrayList.size() > 0))
        {
          localObject2 = (String)localArrayList.get(0);
          if ((j == 5) && (!Util.fileExists((String)localObject2)))
          {
            paramIUiListener.onError(new UiError(-6, "手Q版本过低，纯图分享不支持网路图片", null));
            f.e("openSDK_LOG.QzoneShare", "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
            d.a().a(1, "SHARE_CHECK_SDK", "1000", this.mToken.getAppId(), String.valueOf(4), Long.valueOf(SystemClock.elapsedRealtime()), 0, 1, "shareToQzone()手Q版本过低，纯图分享不支持网路图片");
            return;
          }
          paramBundle.putString("imageLocalUrl", (String)localObject2);
        }
        if (SystemUtils.compareQQVersion(paramActivity, "4.5.0") >= 0) {
          paramBundle.putInt("cflag", 1);
        }
        ((QQShare)localObject1).shareToQQ(paramActivity, paramBundle, paramIUiListener);
      }
      else
      {
        f.d("openSDK_LOG.QzoneShare", "shareToQzone() qqver below 4.2.0, will show download dialog");
        new TDialog(paramActivity, "", getCommonDownloadQQUrl(""), null, this.mToken).show();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\share\QzoneShare.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */