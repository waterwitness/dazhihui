package com.android.thinkive.framework.upgrade;

import com.android.thinkive.framework.download.DownloadDialog;
import com.android.thinkive.framework.download.DownloadItemBean;
import com.android.thinkive.framework.download.DownloadListener;
import com.android.thinkive.framework.util.FormatUtil;
import com.android.thinkive.framework.util.Log;

class UpgradeManager$1
  implements DownloadListener
{
  UpgradeManager$1(UpgradeManager paramUpgradeManager) {}
  
  public void onDownLoadFinished(DownloadItemBean paramDownloadItemBean)
  {
    if (UpgradeManager.access$0(this.this$0).isShowing()) {
      UpgradeManager.access$0(this.this$0).dismiss();
    }
    paramDownloadItemBean = paramDownloadItemBean.getSavePath();
    Log.d("upgrade file path = " + paramDownloadItemBean);
    this.this$0.installUpgradeFile(paramDownloadItemBean);
  }
  
  public void onDownloadCanceled(DownloadItemBean paramDownloadItemBean)
  {
    if ((UpgradeManager.access$0(this.this$0) != null) && (UpgradeManager.access$0(this.this$0).isShowing())) {
      UpgradeManager.access$0(this.this$0).dismiss();
    }
  }
  
  public void onDownloadFailed(DownloadItemBean paramDownloadItemBean, String paramString)
  {
    if (UpgradeManager.access$2(this.this$0)) {
      UpgradeManager.access$0(this.this$0).showBottomLayout();
    }
    UpgradeManager.access$0(this.this$0).setTitleContent("下载失败");
    UpgradeManager.access$0(this.this$0).setRightButtonContent("我知道了");
  }
  
  public void onDownloadPaused(DownloadItemBean paramDownloadItemBean) {}
  
  public void onDownloadResumed(DownloadItemBean paramDownloadItemBean) {}
  
  public void onDownloadStarted(DownloadItemBean paramDownloadItemBean) {}
  
  public void onProgressUpdate(DownloadItemBean paramDownloadItemBean)
  {
    if ((paramDownloadItemBean.getTotalSize() <= 0L) && (UpgradeManager.access$1(this.this$0) > 0L)) {
      paramDownloadItemBean.setTotalSize(UpgradeManager.access$1(this.this$0));
    }
    int i = (int)(paramDownloadItemBean.getFinishedSize() * 100L / paramDownloadItemBean.getTotalSize());
    long l1 = paramDownloadItemBean.getFinishedSize();
    long l2 = paramDownloadItemBean.getTotalSize();
    UpgradeManager.access$0(this.this$0).setTitleContent("下载中...");
    UpgradeManager.access$0(this.this$0).setProgressBarVaule(i);
    UpgradeManager.access$0(this.this$0).setDownLoadFinishedSize("已完成: " + FormatUtil.getAppSize(l1) + "/" + FormatUtil.getAppSize(l2));
    UpgradeManager.access$0(this.this$0).setDownloadPercent(FormatUtil.getPercent(l1, l2));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\upgrade\UpgradeManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */