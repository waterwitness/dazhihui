package com.android.thinkive.framework.upgrade;

class UpgradeManager$H5FileUpgradeThread
  implements Runnable
{
  private String h5FileDownloadPath;
  
  public UpgradeManager$H5FileUpgradeThread(UpgradeManager paramUpgradeManager, String paramString)
  {
    this.h5FileDownloadPath = paramString;
  }
  
  public void run()
  {
    UpgradeManager.access$11(this.this$0, this.h5FileDownloadPath);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\upgrade\UpgradeManager$H5FileUpgradeThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */