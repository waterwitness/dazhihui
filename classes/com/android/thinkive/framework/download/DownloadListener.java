package com.android.thinkive.framework.download;

public abstract interface DownloadListener
{
  public abstract void onDownLoadFinished(DownloadItemBean paramDownloadItemBean);
  
  public abstract void onDownloadCanceled(DownloadItemBean paramDownloadItemBean);
  
  public abstract void onDownloadFailed(DownloadItemBean paramDownloadItemBean, String paramString);
  
  public abstract void onDownloadPaused(DownloadItemBean paramDownloadItemBean);
  
  public abstract void onDownloadResumed(DownloadItemBean paramDownloadItemBean);
  
  public abstract void onDownloadStarted(DownloadItemBean paramDownloadItemBean);
  
  public abstract void onProgressUpdate(DownloadItemBean paramDownloadItemBean);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\download\DownloadListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */