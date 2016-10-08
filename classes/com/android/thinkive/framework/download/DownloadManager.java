package com.android.thinkive.framework.download;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import com.android.thinkive.framework.db.ThinkiveDatabase;
import com.android.thinkive.framework.util.DeviceUtil;
import com.android.thinkive.framework.util.FileUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.util.SDCardInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class DownloadManager
{
  private static int MAX_DOWNLOAD_TASK_COUNT = 3;
  private static DownloadManager sInstance = null;
  private Context mContext;
  private String mDefaultSaveDir;
  private HashMap<DownloadItemBean, DownloadListener> mDownloadListeners;
  private HashMap<DownloadItemBean, DownloadTask> mDownloadTasks;
  private ExecutorService mExecutorService;
  private Handler mHandler = new Handler();
  private ThinkiveDatabase mThinkiveDatabase;
  
  private DownloadManager(Context paramContext)
  {
    this.mContext = paramContext;
    this.mDefaultSaveDir = (Environment.getExternalStorageDirectory().getPath() + File.separator + "thinkive" + File.separator + "download");
    this.mDownloadListeners = new HashMap();
    this.mDownloadTasks = new HashMap();
    this.mExecutorService = Executors.newFixedThreadPool(MAX_DOWNLOAD_TASK_COUNT);
    this.mThinkiveDatabase = ThinkiveDatabase.getInstance(paramContext);
  }
  
  private void addDownloadTask(DownloadItemBean paramDownloadItemBean, DownloadListener paramDownloadListener)
  {
    if (this.mDownloadTasks.containsKey(paramDownloadItemBean)) {
      return;
    }
    DownloadTask localDownloadTask = new DownloadTask(paramDownloadItemBean, this);
    this.mDownloadTasks.put(paramDownloadItemBean, localDownloadTask);
    if (paramDownloadListener != null) {
      this.mDownloadListeners.put(paramDownloadItemBean, paramDownloadListener);
    }
    paramDownloadItemBean.setStatus(DownloadStatus.STATUS_PENDDING);
    if (this.mThinkiveDatabase.findDownloadItemById(paramDownloadItemBean.getTaskId()) == null)
    {
      paramDownloadItemBean.setTaskId(new MD5DownloadTaskIDCreator().createId(paramDownloadItemBean));
      this.mThinkiveDatabase.saveDownloadItem(paramDownloadItemBean);
    }
    for (;;)
    {
      this.mExecutorService.submit(localDownloadTask);
      return;
      FileUtil.deleteFile(new File(paramDownloadItemBean.getSavePath() + File.separator + paramDownloadItemBean.getName()));
      this.mThinkiveDatabase.updateDownloadItem(paramDownloadItemBean);
    }
  }
  
  private DownloadItemBean getDownloadItemFromUrl(String paramString)
  {
    Iterator localIterator = this.mDownloadTasks.keySet().iterator();
    Object localObject = null;
    DownloadItemBean localDownloadItemBean;
    do
    {
      if (!localIterator.hasNext()) {
        return (DownloadItemBean)localObject;
      }
      localDownloadItemBean = (DownloadItemBean)localIterator.next();
      localObject = localDownloadItemBean;
    } while (!localDownloadItemBean.getUrl().equals(paramString));
    return localDownloadItemBean;
  }
  
  public static DownloadManager getInstance(Context paramContext)
  {
    try
    {
      if (sInstance == null) {
        sInstance = new DownloadManager(paramContext);
      }
      paramContext = sInstance;
      return paramContext;
    }
    finally {}
  }
  
  private void removeDownloadTask(DownloadItemBean paramDownloadItemBean)
  {
    this.mDownloadTasks.remove(paramDownloadItemBean);
    this.mDownloadListeners.remove(paramDownloadItemBean);
  }
  
  public void cancelDownload(String paramString)
  {
    paramString = getDownloadItemFromUrl(paramString);
    if (paramString == null) {
      return;
    }
    Log.d("cancelDownload: " + paramString.getName());
    DownloadTask localDownloadTask = (DownloadTask)this.mDownloadTasks.get(paramString);
    if (localDownloadTask != null)
    {
      localDownloadTask.cancelDownload();
      return;
    }
    paramString.setStatus(DownloadStatus.STATUS_CANCELED);
    this.mThinkiveDatabase.updateDownloadItem(paramString);
  }
  
  public DownloadItemBean findDownloadItemById(String paramString)
  {
    Iterator localIterator = this.mDownloadTasks.keySet().iterator();
    DownloadItemBean localDownloadItemBean;
    do
    {
      if (!localIterator.hasNext())
      {
        Log.d("findDownloadTaskByAdId from provider");
        return this.mThinkiveDatabase.findDownloadItemById(paramString);
      }
      localDownloadItemBean = (DownloadItemBean)localIterator.next();
    } while (!localDownloadItemBean.getTaskId().equals(paramString));
    Log.d("findDownloadTaskByAdId from map");
    return localDownloadItemBean;
  }
  
  public ArrayList<DownloadItemBean> getAllDownloadItem()
  {
    return this.mThinkiveDatabase.getAllDownloadItem();
  }
  
  public DownloadItemBean getDownloadItemInfo(String paramString)
  {
    return this.mThinkiveDatabase.findDownloadItemByUrl(paramString);
  }
  
  public DownloadListener getDownloadListenerForTask(DownloadItemBean paramDownloadItemBean)
  {
    if (paramDownloadItemBean == null) {
      return null;
    }
    return (DownloadListener)this.mDownloadListeners.get(paramDownloadItemBean);
  }
  
  protected void onDownloadCanceled(DownloadItemBean paramDownloadItemBean)
  {
    paramDownloadItemBean.setStatus(DownloadStatus.STATUS_CANCELED);
    DownloadListener localDownloadListener = (DownloadListener)this.mDownloadListeners.get(paramDownloadItemBean);
    removeDownloadTask(paramDownloadItemBean);
    this.mHandler.post(new DownloadManager.4(this, paramDownloadItemBean, localDownloadListener));
  }
  
  protected void onDownloadFailed(DownloadItemBean paramDownloadItemBean, String paramString)
  {
    paramDownloadItemBean.setStatus(DownloadStatus.STATUS_ERROR);
    DownloadListener localDownloadListener = (DownloadListener)this.mDownloadListeners.get(paramDownloadItemBean);
    removeDownloadTask(paramDownloadItemBean);
    this.mHandler.post(new DownloadManager.5(this, paramDownloadItemBean, localDownloadListener, paramString));
  }
  
  protected void onDownloadFinished(DownloadItemBean paramDownloadItemBean)
  {
    paramDownloadItemBean.setStatus(DownloadStatus.STATUS_FINISHED);
    DownloadListener localDownloadListener = (DownloadListener)this.mDownloadListeners.get(paramDownloadItemBean);
    removeDownloadTask(paramDownloadItemBean);
    this.mHandler.post(new DownloadManager.7(this, paramDownloadItemBean, localDownloadListener));
  }
  
  protected void onDownloadPaused(DownloadItemBean paramDownloadItemBean)
  {
    paramDownloadItemBean.setStatus(DownloadStatus.STATUS_PAUSED);
    DownloadListener localDownloadListener = (DownloadListener)this.mDownloadListeners.get(paramDownloadItemBean);
    this.mHandler.post(new DownloadManager.2(this, paramDownloadItemBean, localDownloadListener));
  }
  
  protected void onDownloadResumed(DownloadItemBean paramDownloadItemBean)
  {
    paramDownloadItemBean.setStatus(DownloadStatus.STATUS_RUNNING);
    DownloadListener localDownloadListener = (DownloadListener)this.mDownloadListeners.get(paramDownloadItemBean);
    this.mHandler.post(new DownloadManager.3(this, paramDownloadItemBean, localDownloadListener));
  }
  
  protected void onDownloadStarted(DownloadItemBean paramDownloadItemBean)
  {
    paramDownloadItemBean.setStatus(DownloadStatus.STATUS_RUNNING);
    DownloadListener localDownloadListener = (DownloadListener)this.mDownloadListeners.get(paramDownloadItemBean);
    this.mHandler.post(new DownloadManager.1(this, paramDownloadItemBean, localDownloadListener));
  }
  
  protected void onPregressUpdate(DownloadItemBean paramDownloadItemBean, long paramLong1, long paramLong2)
  {
    paramDownloadItemBean.setStatus(DownloadStatus.STATUS_RUNNING);
    DownloadListener localDownloadListener = (DownloadListener)this.mDownloadListeners.get(paramDownloadItemBean);
    this.mHandler.post(new DownloadManager.6(this, paramDownloadItemBean, localDownloadListener));
  }
  
  public void pauseDownload(String paramString)
  {
    paramString = getDownloadItemFromUrl(paramString);
    if (paramString == null) {}
    do
    {
      return;
      Log.d("pauseDownload: " + paramString.getName());
      paramString = (DownloadTask)this.mDownloadTasks.get(paramString);
    } while (paramString == null);
    paramString.pauseDownload();
  }
  
  public void removeDownloadItemListener(DownloadItemBean paramDownloadItemBean)
  {
    Log.d("try to removeDownloadItemListener");
    if ((paramDownloadItemBean == null) || (!this.mDownloadListeners.containsKey(paramDownloadItemBean))) {
      return;
    }
    this.mDownloadListeners.remove(paramDownloadItemBean);
  }
  
  public void resumeDownload(String paramString)
  {
    paramString = getDownloadItemFromUrl(paramString);
    if (paramString == null) {}
    do
    {
      return;
      Log.d("resumeDownload: " + paramString.getName());
      paramString = (DownloadTask)this.mDownloadTasks.get(paramString);
    } while (paramString == null);
    paramString.resumeDownload();
  }
  
  public void shutdown()
  {
    if (!this.mExecutorService.isShutdown()) {
      this.mExecutorService.shutdownNow();
    }
    if (sInstance != null) {
      sInstance = null;
    }
  }
  
  public void startDownloadTask(String paramString, DownloadListener paramDownloadListener)
  {
    if (DeviceUtil.isExternalStorageAvailable())
    {
      str = this.mDefaultSaveDir;
      startDownloadTask(paramString, str, paramDownloadListener);
      return;
    }
    HashMap localHashMap = DeviceUtil.getSDCardInfo(this.mContext);
    Iterator localIterator = localHashMap.keySet().iterator();
    String str = null;
    int i = 0;
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        if (i != 0) {
          break;
        }
        str = this.mContext.getCacheDir() + File.separator + "download";
        break;
      }
      SDCardInfo localSDCardInfo = (SDCardInfo)localHashMap.get((String)localIterator.next());
      Log.i("sdcard info = " + localSDCardInfo.getMountPoint() + " isMounted = " + localSDCardInfo.isMounted());
      if (localSDCardInfo.isMounted())
      {
        i = 1;
        str = localSDCardInfo.getMountPoint() + File.separator + "download";
      }
    }
  }
  
  public void startDownloadTask(String paramString1, String paramString2, DownloadListener paramDownloadListener)
  {
    if (TextUtils.isEmpty(paramString1))
    {
      paramDownloadListener.onDownloadFailed(null, "download url can‘t be empty!");
      return;
    }
    DownloadItemBean localDownloadItemBean = new DownloadItemBean();
    localDownloadItemBean.setName(FileUtil.getFileNameByUrl(paramString1));
    localDownloadItemBean.setUrl(paramString1);
    localDownloadItemBean.setSavePath(paramString2);
    addDownloadTask(localDownloadItemBean, paramDownloadListener);
  }
  
  public void updateDownloadTaskListener(DownloadItemBean paramDownloadItemBean, DownloadListener paramDownloadListener)
  {
    Log.d("try to updateDownloadItemListener");
    if ((paramDownloadItemBean == null) || (!this.mDownloadTasks.containsKey(paramDownloadItemBean))) {
      return;
    }
    Log.d("updateDownloadItemListener");
    this.mDownloadListeners.put(paramDownloadItemBean, paramDownloadListener);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\download\DownloadManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */