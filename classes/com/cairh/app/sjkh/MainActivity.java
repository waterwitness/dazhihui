package com.cairh.app.sjkh;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore.Images.Media;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebSettings.RenderPriority;
import android.webkit.WebView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Toast;
import com.baidu.location.d;
import com.baidu.location.h;
import com.baidu.location.k;
import com.baidu.location.m;
import com.cairh.app.sjkh.common.MResource;
import com.cairh.app.sjkh.common.Util;
import com.cairh.app.sjkh.common.WriteLogFile;
import com.cairh.app.sjkh.handle.CertHandle;
import com.cairh.app.sjkh.handle.IOpenAccountResponseHandler;
import com.cairh.app.sjkh.handle.JtoJHandle;
import com.cairh.app.sjkh.service.BlockUploadService;
import com.cairh.app.sjkh.ui.CameraMainActivity;
import com.cairh.app.sjkh.ui.FaceCameraActivity;
import com.cairh.app.sjkh.ui.GenericWebClient;
import com.cairh.app.sjkh.util.CameraUtil;
import com.cairh.app.sjkh.util.FileUploadUtil;
import com.cairh.app.sjkh.util.FileUploadUtil.IFileUpload;
import com.cairh.app.sjkh.util.ImageUtil;
import com.cairh.app.sjkh.util.ViewUtil;
import com.cairh.app.sjkh.xml.config.ConfigBean;
import com.cairh.app.sjkh.xml.config.ConfigXmlHandle;
import com.e.a.a.v;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;

public class MainActivity
  extends Activity
  implements View.OnClickListener, FileUploadUtil.IFileUpload
{
  public static MainActivity A;
  private static final String CRH_PKG_NAME = "com.cairh.app.sjkh";
  private static final int DIALOG = 12;
  private static boolean Islogin = false;
  private static final int MSG_LOAD_FINISH = 102;
  public static final String PIC_PREVIEW = "_preview";
  public static final String PIC_TYPE_BACK = "back";
  public static final String PIC_TYPE_FACE = "face";
  public static final String PIC_TYPE_FRONT = "front";
  public static final String PIC_TYPE_ID = "id";
  public static final String PIC_TYPE_SIGN_PIC = "futureSign";
  private static final int REQUEST_CODE_CAMERA = 11;
  private static final int REQUEST_CODE_PICLIB = 10;
  private static final int REQUEST_CODE_SVIDEO = 20;
  public static final String TAG = "CRH_MainActivity";
  private static String accessKey;
  private static String accountType;
  private static String channel;
  private static String mobileNo = "";
  private static String packageName;
  private static String password;
  private static String prodCode;
  private static String username;
  private final String IMAGE_TYPE = "image/*";
  private String PARAM_NAME = "fileFullName";
  private String _notifyUrl;
  private String _videoUploadUrl;
  String appCacheDir = "";
  String appServerUrl = "";
  String appUrl = "";
  private String bizStr = "";
  private String callAppScheme = "";
  public CertHandle certHandle;
  private String clientId;
  private String configUrl;
  public Context context;
  private String cookieDomain;
  private String cookiePath;
  private String cookieStr;
  public final Handler cwjHandler = new Handler();
  private String ext;
  private File file;
  int imgAlpha = 0;
  private boolean isDownloadServersSuccess = false;
  boolean isLoading = false;
  private boolean isLocalHasServers = false;
  public JtoJHandle jtoJHandle;
  DialogInterface.OnClickListener listener = new MainActivity.1(this);
  private String locationCallBack;
  boolean logoShowed = false;
  Handler mHandler = new MainActivity.2(this);
  public h mLocationClient = null;
  public MainActivity mainActivity;
  public d myListener = new MainActivity.MyLocationListener(this);
  private IOpenAccountResponseHandler openAccountResponseHandler;
  private String params;
  private int pictureNo;
  private String saveDir = Environment.getExternalStorageDirectory().getPath() + "/temp_image";
  private String serverDomain;
  private File serversFile;
  private String sourceNo;
  private int times = 0;
  public Class toPageClass;
  CountDownTimer touchDownTimer;
  private int type = 0;
  private String uploadDir = Environment.getExternalStorageDirectory().getPath() + "/upload_image";
  private String uploadUrl;
  private FileUploadUtil uploadUtil;
  private GenericWebClient viewClient;
  private ViewUtil vu;
  private WebView webView;
  
  static
  {
    channel = "";
    accessKey = "cairenhuiSDK";
    username = "";
    password = "";
    accountType = "";
  }
  
  private void cancelTouchDownTimer()
  {
    if (this.touchDownTimer != null) {
      this.touchDownTimer.cancel();
    }
  }
  
  public static MainActivity getA()
  {
    return A;
  }
  
  public static String getMobileNo()
  {
    return mobileNo;
  }
  
  public static String getPassword()
  {
    if (!Islogin) {
      return null;
    }
    return password;
  }
  
  private File getRealFile(Intent paramIntent)
  {
    Object localObject = null;
    if (paramIntent != null)
    {
      paramIntent = paramIntent.getData();
      if (TextUtils.isEmpty(paramIntent.getAuthority())) {
        break label83;
      }
      localObject = getContentResolver().query(paramIntent, new String[] { "_data" }, null, null, null);
      ((Cursor)localObject).moveToFirst();
      paramIntent = ((Cursor)localObject).getString(((Cursor)localObject).getColumnIndex("_data"));
      ((Cursor)localObject).close();
    }
    for (;;)
    {
      localObject = new File(paramIntent);
      return (File)localObject;
      label83:
      paramIntent = paramIntent.getPath();
    }
  }
  
  private String getServersDirPath(Context paramContext)
  {
    paramContext = Environment.getExternalStorageDirectory() + "/Android/data/" + paramContext.getPackageName() + "/servers";
    File localFile = new File(paramContext);
    if ((!localFile.exists()) || (!localFile.isDirectory())) {
      localFile.mkdirs();
    }
    return paramContext;
  }
  
  public static String getUsername()
  {
    if (!Islogin) {
      return null;
    }
    return username;
  }
  
  private void initLocation()
  {
    k localk = new k();
    localk.a(m.a);
    localk.a("bd09ll");
    localk.a(5000);
    localk.a(true);
    localk.c(false);
    localk.b(true);
    this.mLocationClient.a(localk);
  }
  
  private void openCamera(int paramInt)
  {
    if (Environment.getExternalStorageState().equals("mounted"))
    {
      Object localObject = new StringBuffer("temp");
      ((StringBuffer)localObject).append(paramInt).append("_").append(new Date().getTime()).append(".jpg");
      this.file = new File(this.saveDir, ((StringBuffer)localObject).toString());
      this.file.delete();
      if (!this.file.exists()) {}
      try
      {
        localObject = new File(this.saveDir);
        if (!((File)localObject).exists()) {
          ((File)localObject).mkdirs();
        }
        this.file.createNewFile();
        if ((Integer.parseInt(Build.VERSION.SDK) > 10) && (paramInt < 2))
        {
          localObject = new Intent(this, CameraMainActivity.class);
          ((Intent)localObject).putExtra(this.PARAM_NAME, this.file.getPath());
          startActivityForResult((Intent)localObject, 11);
          return;
        }
      }
      catch (IOException localIOException)
      {
        localIOException.printStackTrace();
        Toast.makeText(this, "照片创建失败!", 1).show();
        WriteLogFile.witeLog("目录[saveDir]创建失败...");
        return;
      }
      if ((CameraUtil.isFontCameraExist()) && (paramInt == 2))
      {
        localIntent = new Intent(this, FaceCameraActivity.class);
        localIntent.putExtra(this.PARAM_NAME, this.file.getPath());
        startActivityForResult(localIntent, 11);
        return;
      }
      Intent localIntent = new Intent("android.media.action.IMAGE_CAPTURE");
      Uri localUri = Uri.fromFile(this.file);
      localIntent.putExtra("orientation", 0);
      localIntent.putExtra("output", localUri);
      localIntent.putExtra("android.intent.extras.CAMERA_FACING", 1);
      localIntent.putExtra("camerasensortype", 2);
      startActivityForResult(localIntent, 11);
      return;
    }
    Toast.makeText(this, "sdcard无效或没有插入", 0).show();
    WriteLogFile.witeLog("sdcard无效或未插入");
  }
  
  private void openPictureLib()
  {
    Intent localIntent = new Intent("android.intent.action.PICK");
    localIntent.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    startActivityForResult(localIntent, 10);
  }
  
  private CookieStore parseCookie(String paramString)
  {
    v localv = new v(this);
    int i;
    if (paramString != null)
    {
      paramString = paramString.split(";");
      if (paramString != null)
      {
        int j = paramString.length;
        i = 0;
        if (i < j) {
          break label41;
        }
      }
    }
    return localv;
    label41:
    Object localObject = paramString[i];
    if (localObject == null) {}
    for (;;)
    {
      i += 1;
      break;
      localObject = ((String)localObject).split("=");
      if ((localObject != null) && (localObject.length > 1))
      {
        localObject = new BasicClientCookie(localObject[0], localObject[1]);
        ((BasicClientCookie)localObject).setDomain(this.serverDomain);
        ((BasicClientCookie)localObject).setPath(this.cookiePath);
        Calendar localCalendar = Calendar.getInstance();
        localCalendar.add(12, 5);
        ((BasicClientCookie)localObject).setExpiryDate(localCalendar.getTime());
        ((BasicClientCookie)localObject).setVersion(0);
        localv.addCookie((Cookie)localObject);
      }
    }
  }
  
  public static void resetVariables()
  {
    mobileNo = "";
    username = "";
    password = "";
    Islogin = false;
  }
  
  public static void setMobileNo(String paramString)
  {
    mobileNo = paramString;
  }
  
  public static void setPassword(String paramString)
  {
    password = paramString;
  }
  
  public static void setUsername(String paramString)
  {
    username = paramString;
  }
  
  private void startTouchDownTimer()
  {
    if (this.touchDownTimer == null) {
      this.touchDownTimer = new MainActivity.9(this, 600000L, 10000L);
    }
    this.touchDownTimer.cancel();
    this.touchDownTimer.start();
  }
  
  private void switchPicture(int paramInt)
  {
    showDialog(12);
  }
  
  public void callJSFunc(String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer("javascript:");
    localStringBuffer.append(paramString);
    this.cwjHandler.post(new MainActivity.6(this, localStringBuffer));
  }
  
  public void checkVersion(String paramString)
  {
    try
    {
      String str1 = getString(MResource.getIdByName("string", "crh_app_version_code"));
      Log.i("CRH_MainActivity", str1);
      String str2 = getString(MResource.getIdByName("string", "crh_version_channel"));
      this.cwjHandler.post(new MainActivity.4(this, paramString, str1, str2));
      return;
    }
    catch (Exception paramString)
    {
      Log.w("CRH_MainActivity", "未找到包名：'com.cairh.app.sjkh'，手机开户不管理该客户端版本...");
      paramString.printStackTrace();
    }
  }
  
  public void clearCookieHandle()
  {
    this.cwjHandler.post(new MainActivity.8(this));
  }
  
  public void dismissProgressDialog()
  {
    this.vu.dismissProgressDialog();
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  public void finish()
  {
    super.finish();
    if (this.toPageClass != null)
    {
      Intent localIntent = new Intent(this, this.toPageClass);
      localIntent.putExtra("username", username);
      localIntent.putExtra("password", password);
      startActivity(localIntent);
    }
  }
  
  public String getMacAddr()
  {
    Object localObject2 = "000000000000";
    try
    {
      Object localObject1 = (WifiManager)this.context.getSystemService("wifi");
      if (localObject1 == null) {}
      for (localObject1 = null; localObject1 != null; localObject1 = ((WifiManager)localObject1).getConnectionInfo())
      {
        if (TextUtils.isEmpty(((WifiInfo)localObject1).getMacAddress())) {
          return localObject2;
        }
        localObject1 = ((WifiInfo)localObject1).getMacAddress().replace(":", "");
        break label75;
      }
      str = "000000000000";
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return "000000000000";
    }
    String str;
    label75:
    localObject2 = str;
    return (String)localObject2;
  }
  
  public WebView getWebView()
  {
    return this.webView;
  }
  
  @SuppressLint({"NewApi", "SetJavaScriptEnabled"})
  public void initWebView(WebView paramWebView)
  {
    paramWebView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    paramWebView.setHorizontalScrollBarEnabled(false);
    paramWebView.setVerticalScrollBarEnabled(false);
    paramWebView.setScrollBarStyle(0);
    paramWebView.removeJavascriptInterface("searchBoxJavaBridge_");
    WebSettings localWebSettings = paramWebView.getSettings();
    localWebSettings.setRenderPriority(WebSettings.RenderPriority.HIGH);
    localWebSettings.setBuiltInZoomControls(true);
    localWebSettings.setJavaScriptEnabled(true);
    localWebSettings.setJavaScriptCanOpenWindowsAutomatically(true);
    localWebSettings.setUserAgentString(localWebSettings.getUserAgentString() + " crhsdk");
    localWebSettings.setDomStorageEnabled(true);
    localWebSettings.setAppCacheMaxSize(5242880L);
    this.appCacheDir = getApplicationContext().getDir("cache", 0).getPath();
    localWebSettings.setAppCachePath(this.appCacheDir);
    localWebSettings.setAllowFileAccess(true);
    localWebSettings.setAppCacheEnabled(true);
    localWebSettings.setCacheMode(-1);
    this.viewClient = new GenericWebClient(this);
    paramWebView.setWebViewClient(this.viewClient);
    paramWebView.setScrollBarStyle(33554432);
    paramWebView.setWebChromeClient(new MainActivity.5(this));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1) {}
    label142:
    label199:
    label369:
    do
    {
      do
      {
        for (;;)
        {
          return;
          if ((paramInt1 != 11) && (paramInt1 != 10)) {
            break label369;
          }
          if (paramInt1 == 10) {}
          try
          {
            this.file = getRealFile(paramIntent);
            if ((this.file != null) && (this.file.exists()) && (this.file.length() > 0L))
            {
              str = this.file.getPath();
              paramIntent = new File(this.uploadDir, this.file.getName());
              localObject = paramIntent;
              if (paramIntent.exists()) {}
            }
          }
          catch (Exception paramIntent)
          {
            String str;
            Object localObject;
            Log.e("CRH_MainActivity", "选择相册操作异常" + paramIntent.getMessage());
            paramIntent.printStackTrace();
            new AlertDialog.Builder(this.context).setTitle("提示").setMessage("您的手机无法选择相册,请拍照上传").setPositiveButton("确定", null).show();
            return;
          }
        }
        try
        {
          localObject = new File(this.uploadDir);
          if (!((File)localObject).exists()) {
            ((File)localObject).mkdirs();
          }
          paramIntent.createNewFile();
          localObject = paramIntent;
        }
        catch (IOException localIOException)
        {
          localIOException.printStackTrace();
          WriteLogFile.witeLog("目录[" + paramIntent.getPath() + "]创建失败...");
          File localFile = this.file;
          break label142;
          paramIntent = "front";
          break label199;
          paramIntent = "back";
          break label199;
          paramIntent = "face";
          break label199;
          paramIntent = "futureSign";
          break label199;
        }
        ImageUtil.imageInProportion(str, (File)localObject);
        switch (this.pictureNo)
        {
        default: 
          paramIntent = "front";
          this.uploadUtil.uploadPhotos(this.uploadUrl, (File)localObject, paramIntent, FileUploadUtil.parseCookie(this, this.cookieDomain, this.cookiePath, this.cookieStr), this.bizStr);
          return;
        }
      } while (paramInt1 != 20);
      if (paramIntent.getIntExtra("result", -99) == 0)
      {
        callJSFunc("videoSuccess();");
        return;
      }
      paramIntent = paramIntent.getStringExtra("command");
    } while ((paramIntent == null) || ("".equals(paramIntent)));
    callJSFunc(paramIntent);
  }
  
  public void onClick(View paramView) {}
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    getWindow().setFlags(128, 128);
    MResource.setContext(this);
    setContentView(MResource.getIdByName("layout", "main_activity"));
    A = this;
    this.context = this;
    this.mainActivity = this;
    this.certHandle = new CertHandle(this.context);
    this.jtoJHandle = new JtoJHandle(this.context);
    resetVariables();
    this.uploadUtil = new FileUploadUtil(this);
    this.mLocationClient = new h(getApplicationContext());
    this.mLocationClient.b(this.myListener);
    WriteLogFile.initLogFile(this);
    WriteLogFile.witeLog("启动系统");
    this.jtoJHandle.setWvClientClickListener(new MainActivity.WebviewClick(this));
    this.mHandler.sendEmptyMessage(-100);
    paramBundle = getIntent().getStringExtra("mobileNo");
    if ((paramBundle != null) && (!"".equals(paramBundle.trim())) && (Util.checkMobileNumber(paramBundle))) {
      mobileNo = paramBundle.trim();
    }
    Log.i("CRH_MainActivity", "mobileNo -- >" + mobileNo);
    paramBundle = getIntent().getStringExtra("channel");
    if ((paramBundle == null) || (paramBundle.trim().length() == 0))
    {
      channel = getString(MResource.getIdByName("string", "crh_channel_shorturl"));
      paramBundle = getIntent().getStringExtra("appId");
      if ((paramBundle != null) && (!"".equals(paramBundle.trim()))) {
        break label1275;
      }
      paramBundle = "200";
    }
    label614:
    label637:
    label1114:
    label1258:
    label1275:
    for (;;)
    {
      Object localObject = getIntent().getStringExtra("username");
      if ((localObject != null) && (!"".equals(localObject))) {
        username = (String)localObject;
      }
      System.out.println(">>>>>>>>>>> username:" + username);
      localObject = getIntent().getStringExtra("password");
      if ((localObject != null) && (!"".equals(localObject))) {
        password = (String)localObject;
      }
      localObject = getIntent().getStringExtra("accountType");
      if ((localObject != null) && (!"".equals(localObject))) {
        accountType = (String)localObject;
      }
      String str = getIntent().getStringExtra("accessKey");
      if ((str != null) && (!"".equals(str))) {
        accessKey = (String)localObject;
      }
      localObject = getIntent().getStringExtra("prodCode");
      if ((localObject != null) && (!"".equals(localObject))) {
        prodCode = (String)localObject;
      }
      localObject = getIntent().getStringExtra("sourceNo");
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        this.sourceNo = ((String)localObject);
      }
      localObject = getIntent().getStringExtra("ext");
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        this.ext = ((String)localObject);
      }
      localObject = getIntent().getStringExtra("clientId");
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        this.clientId = ((String)localObject);
      }
      localObject = getIntent().getStringExtra("configUrl");
      if (!TextUtils.isEmpty((CharSequence)localObject)) {
        this.configUrl = ((String)localObject);
      }
      Log.e("CRH_MainActivity", ">>>>>configUrl=" + this.configUrl);
      localObject = getIntent().getStringExtra("nextActivityName");
      if ((localObject == null) || (((String)localObject).trim().equals("")))
      {
        this.toPageClass = null;
        localObject = getIntent().getSerializableExtra("openAccountResponseHandler");
        if (localObject == null) {
          break label1114;
        }
        this.openAccountResponseHandler = ((IOpenAccountResponseHandler)localObject);
        localObject = this.context.getPackageName();
        packageName = (String)localObject;
        Log.i("aaa -- pkgName ", (String)localObject);
        this.webView = ((WebView)findViewById(MResource.getIdByName("id", "webview")));
        initWebView(this.webView);
        this.params = ("accessKey=" + accessKey + "&clientCode=1&clientId=" + (String)localObject + "&appId=" + paramBundle + "&v=" + new Date().getTime() + "&channel=" + channel + "&befromFlag=ehtc&sourceNo=" + this.sourceNo + "&clientId=" + this.clientId + "&ext=" + this.ext);
        this.vu = new ViewUtil(this);
        this.vu.showProgressDialog("正在加载数据，请稍后...", true);
        this.webView.addJavascriptInterface(this.jtoJHandle, "jtoJHandle");
        clearCookieHandle();
        this.serversFile = new File(getServersDirPath(this), "servers.xml");
        this.type = getIntent().getIntExtra("type", 0);
        Log.e("CRH_MainActivity", ">>>>>>type的值为：" + this.type);
        if (!this.serversFile.exists()) {
          break label1258;
        }
      }
      for (;;)
      {
        try
        {
          paramBundle = new ConfigXmlHandle(this).readLocalXml(this.serversFile).iterator();
          boolean bool = paramBundle.hasNext();
          if (bool) {
            continue;
          }
        }
        catch (Exception paramBundle)
        {
          Log.e("CRH_MainActivity", "配置文件解析错误");
          paramBundle.printStackTrace();
          continue;
          this.appUrl = (this.appServerUrl + "?" + this.params);
          continue;
        }
        this.isLocalHasServers = true;
        if (this.appServerUrl != null)
        {
          if (!this.appServerUrl.contains("?")) {
            continue;
          }
          this.appUrl = (this.appServerUrl + "&" + this.params);
        }
        Log.e("CRH_MainActivity", ">>>>>appurl=" + this.appUrl);
        this.cwjHandler.post(new MainActivity.3(this));
        this.uploadUtil.downloadFile(this.configUrl);
        return;
        channel = paramBundle;
        break;
        try
        {
          this.toPageClass = Class.forName((String)localObject);
        }
        catch (Exception localException)
        {
          WriteLogFile.witeLog("MainActivity 获取class异常：" + (String)localObject + "\n\t" + localException.getMessage());
          localException.printStackTrace();
        }
        break label614;
        this.openAccountResponseHandler = null;
        break label637;
        localObject = (ConfigBean)paramBundle.next();
        Log.e("CRH_MainActivity", ">>>>>>comfig=" + ((ConfigBean)localObject).toString());
        if (((ConfigBean)localObject).getCrh_app_type() == this.type)
        {
          this.serverDomain = ((ConfigBean)localObject).getCrh_server_domain();
          this.cookiePath = ((ConfigBean)localObject).getCrh_cookie_path();
          this.appServerUrl = ((ConfigBean)localObject).getCrh_server_url();
          this.uploadUrl = ((ConfigBean)localObject).getCrh_upload_url();
        }
      }
      this.uploadUtil.downloadFile(this.configUrl);
      this.isLocalHasServers = false;
      return;
    }
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    }
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("请选择照片");
    localBuilder.setItems(MResource.getIdByName("array", "crh_img_source"), new MainActivity.7(this));
    return localBuilder.create();
  }
  
  protected void onDestroy()
  {
    stopService(new Intent(this, BlockUploadService.class));
    super.onDestroy();
  }
  
  public void onDownError()
  {
    if (this.times < 3)
    {
      this.times += 1;
      this.uploadUtil.downloadFile(this.configUrl);
    }
  }
  
  /* Error */
  public void onDownloadCompletion(byte[] paramArrayOfByte, String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: new 166	java/io/File
    //   4: dup
    //   5: aload_0
    //   6: aload_0
    //   7: invokespecial 1111	com/cairh/app/sjkh/MainActivity:getServersDirPath	(Landroid/content/Context;)Ljava/lang/String;
    //   10: ldc_w 1113
    //   13: invokespecial 473	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   16: putfield 1115	com/cairh/app/sjkh/MainActivity:serversFile	Ljava/io/File;
    //   19: aload_0
    //   20: getfield 1115	com/cairh/app/sjkh/MainActivity:serversFile	Ljava/io/File;
    //   23: invokevirtual 394	java/io/File:exists	()Z
    //   26: ifeq +19 -> 45
    //   29: aload_0
    //   30: getfield 1115	com/cairh/app/sjkh/MainActivity:serversFile	Ljava/io/File;
    //   33: invokevirtual 478	java/io/File:delete	()Z
    //   36: pop
    //   37: aload_0
    //   38: getfield 1115	com/cairh/app/sjkh/MainActivity:serversFile	Ljava/io/File;
    //   41: invokevirtual 481	java/io/File:createNewFile	()Z
    //   44: pop
    //   45: aconst_null
    //   46: astore_2
    //   47: new 1222	java/io/FileOutputStream
    //   50: dup
    //   51: aload_0
    //   52: getfield 1115	com/cairh/app/sjkh/MainActivity:serversFile	Ljava/io/File;
    //   55: invokespecial 1225	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   58: astore_3
    //   59: aload_3
    //   60: astore_2
    //   61: aload_3
    //   62: aload_1
    //   63: invokevirtual 1229	java/io/FileOutputStream:write	([B)V
    //   66: aload_3
    //   67: invokevirtual 1230	java/io/FileOutputStream:close	()V
    //   70: aload_0
    //   71: getfield 228	com/cairh/app/sjkh/MainActivity:isLocalHasServers	Z
    //   74: ifne +138 -> 212
    //   77: ldc 49
    //   79: ldc_w 1232
    //   82: invokestatic 887	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   85: pop
    //   86: new 1123	com/cairh/app/sjkh/xml/config/ConfigXmlHandle
    //   89: dup
    //   90: aload_0
    //   91: invokespecial 1124	com/cairh/app/sjkh/xml/config/ConfigXmlHandle:<init>	(Landroid/content/Context;)V
    //   94: aload_0
    //   95: getfield 1115	com/cairh/app/sjkh/MainActivity:serversFile	Ljava/io/File;
    //   98: invokevirtual 1128	com/cairh/app/sjkh/xml/config/ConfigXmlHandle:readLocalXml	(Ljava/io/File;)Ljava/util/List;
    //   101: invokeinterface 1134 1 0
    //   106: astore_1
    //   107: aload_1
    //   108: invokeinterface 1139 1 0
    //   113: ifne +157 -> 270
    //   116: aload_0
    //   117: getfield 218	com/cairh/app/sjkh/MainActivity:appServerUrl	Ljava/lang/String;
    //   120: ifnull +50 -> 170
    //   123: aload_0
    //   124: getfield 218	com/cairh/app/sjkh/MainActivity:appServerUrl	Ljava/lang/String;
    //   127: ldc_w 1141
    //   130: invokevirtual 1144	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   133: ifeq +208 -> 341
    //   136: aload_0
    //   137: new 158	java/lang/StringBuilder
    //   140: dup
    //   141: aload_0
    //   142: getfield 218	com/cairh/app/sjkh/MainActivity:appServerUrl	Ljava/lang/String;
    //   145: invokestatic 176	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   148: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   151: ldc_w 1146
    //   154: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: aload_0
    //   158: getfield 1093	com/cairh/app/sjkh/MainActivity:params	Ljava/lang/String;
    //   161: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   167: putfield 216	com/cairh/app/sjkh/MainActivity:appUrl	Ljava/lang/String;
    //   170: ldc 49
    //   172: new 158	java/lang/StringBuilder
    //   175: dup
    //   176: ldc_w 1234
    //   179: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   182: aload_0
    //   183: getfield 216	com/cairh/app/sjkh/MainActivity:appUrl	Ljava/lang/String;
    //   186: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   192: invokestatic 887	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   195: pop
    //   196: aload_0
    //   197: getfield 199	com/cairh/app/sjkh/MainActivity:cwjHandler	Landroid/os/Handler;
    //   200: new 1236	com/cairh/app/sjkh/MainActivity$10
    //   203: dup
    //   204: aload_0
    //   205: invokespecial 1237	com/cairh/app/sjkh/MainActivity$10:<init>	(Lcom/cairh/app/sjkh/MainActivity;)V
    //   208: invokevirtual 652	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   211: pop
    //   212: return
    //   213: astore_2
    //   214: aload_2
    //   215: invokevirtual 507	java/io/IOException:printStackTrace	()V
    //   218: goto -173 -> 45
    //   221: astore 4
    //   223: aconst_null
    //   224: astore_1
    //   225: aload_1
    //   226: astore_2
    //   227: aload 4
    //   229: invokevirtual 684	java/lang/Exception:printStackTrace	()V
    //   232: aload_1
    //   233: invokevirtual 1230	java/io/FileOutputStream:close	()V
    //   236: goto -166 -> 70
    //   239: astore_1
    //   240: aload_1
    //   241: invokevirtual 507	java/io/IOException:printStackTrace	()V
    //   244: goto -174 -> 70
    //   247: astore_1
    //   248: aload_2
    //   249: invokevirtual 1230	java/io/FileOutputStream:close	()V
    //   252: aload_1
    //   253: athrow
    //   254: astore_2
    //   255: aload_2
    //   256: invokevirtual 507	java/io/IOException:printStackTrace	()V
    //   259: goto -7 -> 252
    //   262: astore_1
    //   263: aload_1
    //   264: invokevirtual 507	java/io/IOException:printStackTrace	()V
    //   267: goto -197 -> 70
    //   270: aload_1
    //   271: invokeinterface 1168 1 0
    //   276: checkcast 1170	com/cairh/app/sjkh/xml/config/ConfigBean
    //   279: astore_2
    //   280: aload_2
    //   281: invokevirtual 1176	com/cairh/app/sjkh/xml/config/ConfigBean:getCrh_app_type	()I
    //   284: aload_0
    //   285: getfield 201	com/cairh/app/sjkh/MainActivity:type	I
    //   288: if_icmpne -181 -> 107
    //   291: aload_0
    //   292: aload_2
    //   293: invokevirtual 1179	com/cairh/app/sjkh/xml/config/ConfigBean:getCrh_server_domain	()Ljava/lang/String;
    //   296: putfield 295	com/cairh/app/sjkh/MainActivity:serverDomain	Ljava/lang/String;
    //   299: aload_0
    //   300: aload_2
    //   301: invokevirtual 1182	com/cairh/app/sjkh/xml/config/ConfigBean:getCrh_cookie_path	()Ljava/lang/String;
    //   304: putfield 308	com/cairh/app/sjkh/MainActivity:cookiePath	Ljava/lang/String;
    //   307: aload_0
    //   308: aload_2
    //   309: invokevirtual 1185	com/cairh/app/sjkh/xml/config/ConfigBean:getCrh_server_url	()Ljava/lang/String;
    //   312: putfield 218	com/cairh/app/sjkh/MainActivity:appServerUrl	Ljava/lang/String;
    //   315: aload_0
    //   316: aload_2
    //   317: invokevirtual 1188	com/cairh/app/sjkh/xml/config/ConfigBean:getCrh_upload_url	()Ljava/lang/String;
    //   320: putfield 305	com/cairh/app/sjkh/MainActivity:uploadUrl	Ljava/lang/String;
    //   323: goto -207 -> 116
    //   326: astore_1
    //   327: ldc 49
    //   329: ldc_w 1190
    //   332: invokestatic 887	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;)I
    //   335: pop
    //   336: aload_1
    //   337: invokevirtual 684	java/lang/Exception:printStackTrace	()V
    //   340: return
    //   341: aload_0
    //   342: new 158	java/lang/StringBuilder
    //   345: dup
    //   346: aload_0
    //   347: getfield 218	com/cairh/app/sjkh/MainActivity:appServerUrl	Ljava/lang/String;
    //   350: invokestatic 176	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   353: invokespecial 179	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   356: ldc_w 1141
    //   359: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   362: aload_0
    //   363: getfield 1093	com/cairh/app/sjkh/MainActivity:params	Ljava/lang/String;
    //   366: invokevirtual 185	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   369: invokevirtual 188	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   372: putfield 216	com/cairh/app/sjkh/MainActivity:appUrl	Ljava/lang/String;
    //   375: goto -205 -> 170
    //   378: astore_1
    //   379: goto -131 -> 248
    //   382: astore 4
    //   384: aload_3
    //   385: astore_1
    //   386: goto -161 -> 225
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	389	0	this	MainActivity
    //   0	389	1	paramArrayOfByte	byte[]
    //   0	389	2	paramString	String
    //   58	327	3	localFileOutputStream	java.io.FileOutputStream
    //   221	7	4	localException1	Exception
    //   382	1	4	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   37	45	213	java/io/IOException
    //   47	59	221	java/lang/Exception
    //   232	236	239	java/io/IOException
    //   47	59	247	finally
    //   248	252	254	java/io/IOException
    //   66	70	262	java/io/IOException
    //   86	107	326	java/lang/Exception
    //   107	116	326	java/lang/Exception
    //   116	170	326	java/lang/Exception
    //   170	212	326	java/lang/Exception
    //   270	323	326	java/lang/Exception
    //   341	375	326	java/lang/Exception
    //   61	66	378	finally
    //   227	232	378	finally
    //   61	66	382	java/lang/Exception
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      paramKeyEvent = new AlertDialog.Builder(this).create();
      paramKeyEvent.setTitle("温馨提示");
      paramKeyEvent.setMessage("是否要退出此功能操作？");
      paramKeyEvent.setButton("是", this.listener);
      paramKeyEvent.setButton2("否", this.listener);
      paramKeyEvent.show();
    }
    return false;
  }
  
  protected void onRestart()
  {
    super.onRestart();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  public void onStartUpload(String paramString)
  {
    this.vu.showProgressDialog("正在上传和识别，请稍等...");
  }
  
  public void onUploadFailure(String paramString1, String paramString2)
  {
    this.vu.dismissProgressDialog();
    Toast.makeText(this, paramString2, 1).show();
  }
  
  public void onUploadSuccess(String paramString1, String paramString2)
  {
    this.vu.dismissProgressDialog();
    Toast.makeText(this, "上传成功", 1).show();
    callJSFunc("parsePicUrl('" + paramString2 + "')");
  }
  
  public void refreshMainView()
  {
    this.isLoading = true;
    this.mHandler.sendEmptyMessage(102);
  }
  
  public void schemeCallBack()
  {
    if (!this.callAppScheme.equals("")) {
      startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.callAppScheme + "://")));
    }
  }
  
  public void showProgressDialog(String paramString)
  {
    this.vu.showProgressDialog(paramString);
  }
  
  public void superFinish()
  {
    super.finish();
  }
  
  public void updateAlpha()
  {
    this.imgAlpha += 2;
    if (this.imgAlpha < 255)
    {
      this.mHandler.sendEmptyMessageDelayed(-100, 30L);
      return;
    }
    this.imgAlpha = 255;
    this.logoShowed = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */