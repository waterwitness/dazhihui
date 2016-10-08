package com.android.thinkive.framework.download;

import com.android.thinkive.framework.db.ThinkiveDatabase;

class DownloadManager$5
  implements Runnable
{
  DownloadManager$5(DownloadManager paramDownloadManager, DownloadItemBean paramDownloadItemBean, DownloadListener paramDownloadListener, String paramString) {}
  
  public void run()
  {
    DownloadManager.access$0(this.this$0).updateDownloadItem(this.val$downloadItemBean);
    if (this.val$listener != null) {
      this.val$listener.onDownloadFailed(this.val$downloadItemBean, this.val$error);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\download\DownloadManager$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */