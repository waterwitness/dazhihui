package com.android.thinkive.framework.download;

import com.android.thinkive.framework.db.ThinkiveDatabase;

class DownloadManager$3
  implements Runnable
{
  DownloadManager$3(DownloadManager paramDownloadManager, DownloadItemBean paramDownloadItemBean, DownloadListener paramDownloadListener) {}
  
  public void run()
  {
    DownloadManager.access$0(this.this$0).updateDownloadItem(this.val$downloadItemBean);
    if (this.val$listener != null) {
      this.val$listener.onDownloadResumed(this.val$downloadItemBean);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\download\DownloadManager$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */