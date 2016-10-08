package com.android.thinkive.framework.upgrade;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.view.Window;
import android.widget.Toast;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.ThreadManager;
import com.android.thinkive.framework.download.DownloadDialog;
import com.android.thinkive.framework.download.DownloadListener;
import com.android.thinkive.framework.download.DownloadManager;
import com.android.thinkive.framework.network.ResponseListener;
import com.android.thinkive.framework.network.http.HttpService;
import com.android.thinkive.framework.util.AppUtil;
import com.android.thinkive.framework.util.CommonUtil;
import com.android.thinkive.framework.util.FileUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.NetWorkUtil;
import com.android.thinkive.framework.util.PreferencesUtil;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.json.JSONObject;

public class UpgradeManager
{
  public static final String BROADCAST_H5_UPGRADE_COMPLETE = "com.thinkive.android.h5.upgrade.complete";
  private static UpgradeManager sInstance = null;
  private boolean isHideBottomLayout = false;
  private Context mContext;
  private int mCurrentVersionCode;
  private DownloadDialog mDownloadDialog;
  private long mDownloadFileTotalSize;
  private DownloadListener mDownloadListener = new UpgradeManager.1(this);
  private DownloadManager mDownloadManager;
  private String mDownloadUrl;
  private UpgradeManager.UpgradeExposeListener mExposeListener;
  private int mIncrementalFlag;
  private int mLatestVersionCode;
  private String mLatestVersionName;
  private ProgressDialog mProgressDialog;
  private UpgradeDialog mUpgradeDialog;
  private ResponseListener<JSONObject> mUpgradeInfoListener = new UpgradeManager.2(this);
  private UpgradeManager.UpgradeType mUpgradeType;
  private UpgradeInfoBean.VersionInfoBean mVersionInfoBean;
  
  private UpgradeManager(Context paramContext)
  {
    this.mContext = paramContext;
    this.mDownloadManager = DownloadManager.getInstance(paramContext);
    this.mCurrentVersionCode = AppUtil.getVersionCode(this.mContext);
    this.mDownloadManager = DownloadManager.getInstance(paramContext);
  }
  
  private void dismissProgressDialog()
  {
    ThinkiveInitializer.getInstance().getHandler().post(new UpgradeManager.4(this));
  }
  
  public static UpgradeManager getInstance(Context paramContext)
  {
    if (sInstance == null) {
      sInstance = new UpgradeManager(paramContext);
    }
    return sInstance;
  }
  
  private void installApkFile(String paramString)
  {
    paramString = AppUtil.getInstallIntent(paramString);
    this.mContext.startActivity(paramString);
  }
  
  private void installH5File(String paramString)
  {
    ThreadManager.getInstance().submit(new UpgradeManager.H5FileUpgradeThread(this, paramString));
  }
  
  private boolean isForceUpgrade(int paramInt)
  {
    if (paramInt == 0) {}
    while (paramInt != 1) {
      return false;
    }
    return true;
  }
  
  private void saveVersionInfo(UpgradeInfoBean.VersionInfoBean paramVersionInfoBean)
  {
    if (paramVersionInfoBean == null) {
      return;
    }
    int i = paramVersionInfoBean.getVersion_code();
    paramVersionInfoBean = paramVersionInfoBean.getVersion_name();
    Log.d("save versionCode = " + i + " versionName = " + paramVersionInfoBean);
    PreferencesUtil.putInt(this.mContext, "native_version_code", i);
    PreferencesUtil.putInt(this.mContext, "h5_version_code", i);
    PreferencesUtil.putString(this.mContext, "native_version_name", paramVersionInfoBean);
    PreferencesUtil.putString(this.mContext, "h5_version_name", paramVersionInfoBean);
  }
  
  private void showUpgradeDialog(UpgradeInfoBean.VersionInfoBean paramVersionInfoBean)
  {
    if ((this.mUpgradeDialog != null) && (this.mUpgradeDialog.isShowing())) {
      this.mUpgradeDialog.dismiss();
    }
    boolean bool = isForceUpgrade(paramVersionInfoBean.getUpdate_flag());
    String str = paramVersionInfoBean.getDescription();
    this.mDownloadUrl = paramVersionInfoBean.getDownload_url();
    this.mVersionInfoBean = paramVersionInfoBean;
    paramVersionInfoBean = CommonUtil.getTopActivity(this.mContext);
    paramVersionInfoBean = ThinkiveInitializer.getInstance().getActivity(paramVersionInfoBean);
    if (paramVersionInfoBean != null) {
      this.mUpgradeDialog = new UpgradeDialog(paramVersionInfoBean);
    }
    for (;;)
    {
      this.mUpgradeDialog.setUpgradeManager(this);
      this.mUpgradeDialog.setIsForce(bool);
      this.mUpgradeDialog.setDescription(str);
      this.mUpgradeDialog.show();
      this.isHideBottomLayout = false;
      return;
      if ((this.mContext instanceof Activity))
      {
        this.mUpgradeDialog = new UpgradeDialog(this.mContext);
      }
      else
      {
        this.mUpgradeDialog = new UpgradeDialog(this.mContext);
        this.mUpgradeDialog.getWindow().setType(2003);
      }
    }
  }
  
  private void upgradeProcess(String paramString)
  {
    paramString = new File(paramString);
    if (paramString.exists()) {
      try
      {
        Object localObject = paramString.getParent();
        FileUtil.upZipFile(paramString, (String)localObject);
        paramString = new File((String)localObject, "www");
        FileUtil.copyDirectoryToDirectory(paramString, this.mContext.getFilesDir());
        saveVersionInfo(this.mVersionInfoBean);
        dismissProgressDialog();
        localObject = new Intent();
        ((Intent)localObject).setAction("com.thinkive.android.h5.upgrade.complete");
        this.mContext.sendBroadcast((Intent)localObject);
        FileUtil.deleteFile(paramString);
        return;
      }
      catch (IOException paramString)
      {
        paramString.printStackTrace();
        dismissProgressDialog();
        Toast.makeText(ThinkiveInitializer.getInstance().getContext(), "版本更新失败！", 0).show();
        return;
      }
    }
    dismissProgressDialog();
    Toast.makeText(ThinkiveInitializer.getInstance().getContext(), "版本更新失败！", 0).show();
  }
  
  @Deprecated
  public void checkUpgradeAction(String paramString)
  {
    if (NetWorkUtil.isNetworkConnected(this.mContext))
    {
      this.mCurrentVersionCode = AppUtil.getVersionCode(this.mContext);
      HashMap localHashMap = new HashMap();
      localHashMap.put("funcNo", "901916");
      localHashMap.put("channel", "1");
      localHashMap.put("soft_no", this.mContext.getPackageName());
      localHashMap.put("versionsn", String.valueOf(this.mCurrentVersionCode));
      HttpService.getInstance().jsonRequest(paramString, localHashMap, 15000, 1, this.mUpgradeInfoListener);
      return;
    }
    Log.d("net work  unavailable!!!,stop check upgrade info!!!");
  }
  
  public void checkUpgradeInfo(String paramString)
  {
    if (NetWorkUtil.isNetworkConnected(this.mContext))
    {
      this.mCurrentVersionCode = AppUtil.getVersionCode(this.mContext);
      HashMap localHashMap = new HashMap();
      localHashMap.put("funcNo", "901916");
      localHashMap.put("channel", "1");
      localHashMap.put("soft_no", this.mContext.getPackageName());
      localHashMap.put("versionsn", String.valueOf(this.mCurrentVersionCode));
      HttpService.getInstance().jsonRequest(paramString, localHashMap, this.mUpgradeInfoListener);
      return;
    }
    Log.d("net work  unavailable!!!,stop check upgrade info!!!");
  }
  
  public void installUpgradeFile(String paramString)
  {
    if (this.mUpgradeType == UpgradeManager.UpgradeType.H5)
    {
      localObject = CommonUtil.getTopActivity(this.mContext);
      localObject = ThinkiveInitializer.getInstance().getActivity((String)localObject);
      if (localObject != null)
      {
        this.mProgressDialog = new ProgressDialog((Context)localObject);
        this.mProgressDialog.setMessage("版本升级中,请稍后...");
        this.mProgressDialog.setIndeterminate(true);
        this.mProgressDialog.setCancelable(false);
        this.mProgressDialog.show();
        installH5File(paramString);
      }
    }
    while (this.mUpgradeType != UpgradeManager.UpgradeType.NATIVE) {
      for (;;)
      {
        Object localObject;
        return;
        if ((this.mContext instanceof Activity))
        {
          this.mProgressDialog = new ProgressDialog(this.mContext);
        }
        else
        {
          this.mProgressDialog = new ProgressDialog(this.mContext);
          this.mProgressDialog.getWindow().setType(2003);
        }
      }
    }
    installApkFile(paramString);
  }
  
  public void setUpgradeExposeListener(UpgradeManager.UpgradeExposeListener paramUpgradeExposeListener)
  {
    this.mExposeListener = paramUpgradeExposeListener;
  }
  
  protected void startDownload()
  {
    Log.d("start upgrade file download !!!");
    this.mDownloadManager.startDownloadTask(this.mDownloadUrl, this.mDownloadListener);
    ThinkiveInitializer.getInstance().getHandler().post(new UpgradeManager.3(this));
  }
  
  public void startDownloadFromH5Info(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    if (paramInt1 == 0) {
      this.mUpgradeType = UpgradeManager.UpgradeType.NATIVE;
    }
    for (;;)
    {
      this.mDownloadUrl = paramString1;
      this.mVersionInfoBean = new UpgradeInfoBean.VersionInfoBean();
      this.mVersionInfoBean.setDownload_url(this.mDownloadUrl);
      this.mVersionInfoBean.setVersion_code(paramInt2);
      this.mVersionInfoBean.setVersion_name(paramString2);
      this.isHideBottomLayout = true;
      if (this.mDownloadUrl.contains("?content-length="))
      {
        paramString1 = this.mDownloadUrl.split("\\?content-length=");
        this.mDownloadUrl = paramString1[0];
        this.mDownloadFileTotalSize = Long.parseLong(paramString1[1]);
      }
      startDownload();
      return;
      if (paramInt1 == 1) {
        this.mUpgradeType = UpgradeManager.UpgradeType.H5;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\upgrade\UpgradeManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */