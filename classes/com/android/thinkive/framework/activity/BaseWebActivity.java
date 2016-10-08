package com.android.thinkive.framework.activity;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.WebViewManager;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.js.BaseJsInterface;
import com.android.thinkive.framework.js.ICallBack;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.ScreenUtil;
import com.android.thinkive.framework.util.WebViewDialogHelper;
import com.android.thinkive.framework.view.BaseWebViewLinearlayout;
import com.android.thinkive.framework.view.BaseWebViewLinearlayout.OnSoftKeyboardListener;
import com.android.thinkive.framework.view.MyWebView;
import com.android.thinkive.framework.view.MyWebView.UrlLoadListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class BaseWebActivity
  extends Activity
{
  private static final String DISABLE_WEBVIEW_CACHE = "disableWebViewCache";
  private static final int INPUT_FILE_REQUEST_CODE = 4097;
  private static final String JS_INTERFACE_NAME = "external";
  private static String mH5FilesSavePath;
  private String mCacheUrl;
  private String mCameraPhotoPath;
  private Context mContext;
  private WebViewDialogHelper mDialogsHelper;
  private boolean mDisableWebViewCache = false;
  private ValueCallback<Uri> mFileUploadCallbackFirst;
  private ValueCallback<Uri[]> mFileUploadCallbackSecond;
  private BaseJsInterface mJsInterface;
  private MyWebView.UrlLoadListener mLoadListener = new BaseWebActivity.1(this);
  private BaseWebViewLinearlayout mRootLayout;
  private FrameLayout mTitleBar;
  private LinearLayout mWebLayout;
  private MyWebView mWebView;
  private String mWebViewName;
  
  private File createImageFile()
  {
    String str = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
    return File.createTempFile("JPEG_" + str + "_", ".jpg", Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));
  }
  
  private View createView()
  {
    this.mDialogsHelper = new WebViewDialogHelper(this.mContext);
    this.mRootLayout = new BaseWebViewLinearlayout(this.mContext);
    this.mRootLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.mRootLayout.setOrientation(1);
    this.mRootLayout.setBackgroundColor(-1);
    this.mWebLayout = new LinearLayout(this.mContext);
    this.mWebLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    this.mWebLayout.setOrientation(1);
    this.mWebLayout.setBackgroundColor(-1);
    this.mTitleBar = new FrameLayout(this.mContext);
    this.mTitleBar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    initWebView();
    this.mWebLayout.addView(this.mTitleBar);
    this.mWebLayout.addView(this.mWebView);
    this.mRootLayout.addView(this.mWebLayout);
    return this.mRootLayout;
  }
  
  @TargetApi(16)
  private void initWebView()
  {
    String str = ConfigManager.getInstance().getSystemConfigValue("disableWebViewCache");
    if (this.mDisableWebViewCache) {
      this.mWebView = WebViewManager.getInstance().getNewWebView(this);
    }
    for (;;)
    {
      this.mWebView.addUrlLoadListener(this.mLoadListener);
      this.mWebView.setWebChromeClient(new BaseWebActivity.2(this));
      return;
      if (!TextUtils.isEmpty(str))
      {
        if (Boolean.valueOf(Boolean.parseBoolean(str)).booleanValue()) {
          this.mWebView = WebViewManager.getInstance().getNewWebView(this);
        } else {
          this.mWebView = WebViewManager.getInstance().getWebView(this.mWebViewName);
        }
      }
      else {
        this.mWebView = WebViewManager.getInstance().getWebView(this.mWebViewName);
      }
    }
  }
  
  private void openFileInput(ValueCallback<Uri> paramValueCallback, ValueCallback<Uri[]> paramValueCallback1)
  {
    if (this.mFileUploadCallbackFirst != null) {
      this.mFileUploadCallbackFirst.onReceiveValue(null);
    }
    this.mFileUploadCallbackFirst = paramValueCallback;
    if (this.mFileUploadCallbackSecond != null) {
      this.mFileUploadCallbackSecond.onReceiveValue(null);
    }
    this.mFileUploadCallbackSecond = paramValueCallback1;
    Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
    paramValueCallback = localIntent;
    if (localIntent.resolveActivity(getPackageManager()) != null) {}
    for (;;)
    {
      try
      {
        paramValueCallback = createImageFile();
        Log.e("Unable to create Image File", paramValueCallback1);
      }
      catch (IOException paramValueCallback1)
      {
        try
        {
          localIntent.putExtra("PhotoPath", this.mCameraPhotoPath);
          if (paramValueCallback == null) {
            break label228;
          }
          this.mCameraPhotoPath = ("file:" + paramValueCallback.getAbsolutePath());
          localIntent.putExtra("output", Uri.fromFile(paramValueCallback));
          paramValueCallback = localIntent;
          paramValueCallback1 = new Intent("android.intent.action.GET_CONTENT");
          paramValueCallback1.addCategory("android.intent.category.OPENABLE");
          paramValueCallback1.setType("image/*");
          if (paramValueCallback == null) {
            break label233;
          }
          paramValueCallback = new Intent[] { paramValueCallback };
          localIntent = new Intent("android.intent.action.CHOOSER");
          localIntent.putExtra("android.intent.extra.INTENT", paramValueCallback1);
          localIntent.putExtra("android.intent.extra.TITLE", "Image Chooser");
          localIntent.putExtra("android.intent.extra.INITIAL_INTENTS", paramValueCallback);
          startActivityForResult(localIntent, 4097);
          return;
        }
        catch (IOException paramValueCallback1)
        {
          for (;;) {}
        }
        paramValueCallback1 = paramValueCallback1;
        paramValueCallback = null;
      }
      continue;
      label228:
      paramValueCallback = null;
      continue;
      label233:
      paramValueCallback = new Intent[0];
    }
  }
  
  private void sendMessage50113(String paramString)
  {
    int i = 0;
    String[] arrayOfString = paramString.split("[?]");
    paramString = null;
    if (arrayOfString.length > 1) {
      paramString = arrayOfString[1].split("&");
    }
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        localJSONObject.put("toPage", arrayOfString[0]);
        if (paramString != null)
        {
          int j = paramString.length;
          if (i < j) {
            continue;
          }
        }
      }
      catch (JSONException paramString)
      {
        paramString.printStackTrace();
        continue;
      }
      Log.e("fragment send 50113 message = " + localJSONObject.toString());
      sendMessageToH5(new AppMessage(50113, localJSONObject));
      return;
      arrayOfString = paramString[i].split("=");
      localJSONObject.put(arrayOfString[0], arrayOfString[1]);
      i += 1;
    }
  }
  
  public void addJavascriptInterface(BaseJsInterface paramBaseJsInterface)
  {
    if ((paramBaseJsInterface != null) && (this.mWebView != null)) {
      this.mWebView.addJavascriptInterface(paramBaseJsInterface, "external");
    }
  }
  
  protected int dp2Px(int paramInt)
  {
    return (int)ScreenUtil.dpToPx(this.mContext, paramInt);
  }
  
  public LinearLayout getRootLayout()
  {
    return this.mRootLayout;
  }
  
  public WebView getWebView()
  {
    return this.mWebView;
  }
  
  public boolean isLoadComplete()
  {
    return this.mWebView.isLoadComplete();
  }
  
  public void loadUrl(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      Log.d("load url error, url is empty!!!");
      return;
    }
    Object localObject = WebViewManager.getInstance().splitUrl(paramString);
    if (localObject[0].equals(this.mWebView.getUrlPrefix()))
    {
      paramString = "default";
      if (localObject.length > 1) {
        paramString = localObject[1];
      }
      if (this.mWebView.isLoadComplete())
      {
        sendMessage50113(paramString);
        return;
      }
      Log.e("activity mWebView don't load complete ,cacheurl = " + paramString);
      this.mCacheUrl = paramString;
      return;
    }
    if (localObject.length == 1)
    {
      this.mWebView.setUrlPrefix(localObject[0]);
      this.mWebView.setUrlSuffix("");
    }
    while ((paramString.startsWith("file:///android_asset")) || (paramString.startsWith("http")) || (paramString.startsWith("https")))
    {
      this.mWebView.loadUrl(paramString);
      this.mWebView.setLoadUrl(paramString);
      Log.d("load h5 url  = " + paramString);
      return;
      if (localObject.length == 2)
      {
        this.mWebView.setUrlPrefix(localObject[0]);
        this.mWebView.setUrlSuffix(localObject[1]);
      }
      else
      {
        this.mWebView.setUrlPrefix("");
        this.mWebView.setUrlSuffix("");
      }
    }
    localObject = "file://" + mH5FilesSavePath + File.separator + paramString;
    this.mWebView.loadUrl((String)localObject);
    this.mWebView.setLoadUrl(paramString);
    Log.d("load www dir h5 url  = " + (String)localObject);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 != 4097) || ((this.mFileUploadCallbackFirst == null) && (this.mFileUploadCallbackSecond == null))) {
      super.onActivityResult(paramInt1, paramInt2, paramIntent);
    }
    label176:
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (paramInt2 != -1) {
              break label176;
            }
            if (paramIntent == null) {
              break;
            }
            if (this.mFileUploadCallbackFirst != null)
            {
              this.mFileUploadCallbackFirst.onReceiveValue(paramIntent.getData());
              this.mFileUploadCallbackFirst = null;
              return;
            }
          } while (this.mFileUploadCallbackSecond == null);
          paramIntent = Uri.parse(paramIntent.getDataString());
          this.mFileUploadCallbackSecond.onReceiveValue(new Uri[] { paramIntent });
          this.mFileUploadCallbackSecond = null;
          return;
        } while (this.mCameraPhotoPath == null);
        paramIntent = Uri.parse(this.mCameraPhotoPath);
        if (this.mFileUploadCallbackFirst != null)
        {
          this.mFileUploadCallbackFirst.onReceiveValue(Uri.parse(this.mCameraPhotoPath));
          this.mFileUploadCallbackFirst = null;
          return;
        }
      } while (this.mFileUploadCallbackSecond == null);
      this.mFileUploadCallbackSecond.onReceiveValue(new Uri[] { paramIntent });
      this.mFileUploadCallbackSecond = null;
      return;
      if (this.mFileUploadCallbackFirst != null)
      {
        this.mFileUploadCallbackFirst.onReceiveValue(null);
        this.mFileUploadCallbackFirst = null;
        return;
      }
    } while (this.mFileUploadCallbackSecond == null);
    this.mFileUploadCallbackSecond.onReceiveValue(null);
    this.mFileUploadCallbackSecond = null;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mContext = this;
    this.mWebViewName = returnWebViewName();
    if (TextUtils.isEmpty(this.mWebViewName)) {
      this.mWebViewName = getClass().getName();
    }
    mH5FilesSavePath = getFilesDir().getPath();
    setContentView(createView());
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    this.mWebLayout.removeView(this.mWebView);
    this.mWebView.removeUrlLoadListener(this.mLoadListener);
    ThinkiveInitializer.getInstance();
    if (ThinkiveInitializer.isExit()) {
      WebViewManager.getInstance().releaseWebView(this.mWebView);
    }
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void registerH5Callback(String paramString, ICallBack paramICallBack)
  {
    this.mJsInterface = this.mWebView.getJsInterface();
    this.mJsInterface.registerCallBack(paramString, paramICallBack);
  }
  
  public void reloadUrl(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
    {
      Log.d("load url error, url is empty!!!");
      return;
    }
    Object localObject1 = WebViewManager.getInstance().splitUrl(paramString);
    Object localObject2 = localObject1[0];
    if (localObject1.length == 1)
    {
      this.mWebView.setUrlPrefix(localObject1[0]);
      this.mWebView.setUrlSuffix("");
    }
    while ((paramString.startsWith("file:///android_asset")) || (paramString.startsWith("http")) || (paramString.startsWith("https")))
    {
      this.mWebView.loadUrl(paramString);
      this.mWebView.setLoadUrl(paramString);
      Log.e("reload h5 url  = " + paramString);
      return;
      if (localObject1.length == 2)
      {
        this.mWebView.setUrlPrefix(localObject1[0]);
        this.mWebView.setUrlSuffix(localObject1[1]);
      }
      else
      {
        this.mWebView.setUrlPrefix("");
        this.mWebView.setUrlSuffix("");
      }
    }
    localObject1 = "file://" + mH5FilesSavePath + File.separator + paramString;
    this.mWebView.loadUrl((String)localObject1);
    this.mWebView.setLoadUrl(paramString);
    Log.d("reload www dir h5 url  = " + (String)localObject1);
  }
  
  public abstract String returnWebViewName();
  
  public void sendMessageToH5(AppMessage paramAppMessage)
  {
    if ((paramAppMessage == null) && (this.mWebView == null)) {}
    JSONObject localJSONObject;
    do
    {
      return;
      localJSONObject = paramAppMessage.getContent();
    } while (localJSONObject == null);
    try
    {
      localJSONObject.put("funcNo", paramAppMessage.getMsgId());
      this.mWebView.loadUrl("javascript:callMessage(" + localJSONObject.toString() + ")");
      return;
    }
    catch (JSONException paramAppMessage)
    {
      for (;;)
      {
        paramAppMessage.printStackTrace();
      }
    }
  }
  
  public void sendMessageToH5(JSONObject paramJSONObject)
  {
    if ((paramJSONObject == null) || (this.mWebView == null)) {
      return;
    }
    this.mWebView.loadUrl("javascript:callMessage(" + paramJSONObject.toString() + ")");
  }
  
  public void setDisableWebViewCache(boolean paramBoolean)
  {
    this.mDisableWebViewCache = paramBoolean;
  }
  
  public void setOnSoftKeyboardListener(BaseWebViewLinearlayout.OnSoftKeyboardListener paramOnSoftKeyboardListener)
  {
    if (this.mRootLayout != null) {
      this.mRootLayout.setOnSoftKeyboardListener(paramOnSoftKeyboardListener);
    }
  }
  
  protected void setTitleBar(View paramView)
  {
    if (paramView != null) {
      this.mTitleBar.addView(paramView);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\activity\BaseWebActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */