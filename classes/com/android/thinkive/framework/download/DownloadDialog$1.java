package com.android.thinkive.framework.download;

import android.view.View;
import android.view.View.OnClickListener;

class DownloadDialog$1
  implements View.OnClickListener
{
  DownloadDialog$1(DownloadDialog paramDownloadDialog) {}
  
  public void onClick(View paramView)
  {
    this.this$0.dismiss();
    DownloadDialog.access$0(this.this$0).cancelDownload(DownloadDialog.access$1(this.this$0));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\download\DownloadDialog$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */