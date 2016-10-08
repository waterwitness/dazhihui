package com.android.thinkive.framework.upgrade;

import android.app.ProgressDialog;

class UpgradeManager$4
  implements Runnable
{
  UpgradeManager$4(UpgradeManager paramUpgradeManager) {}
  
  public void run()
  {
    if ((UpgradeManager.access$15(this.this$0) != null) && (UpgradeManager.access$15(this.this$0).isShowing())) {
      UpgradeManager.access$15(this.this$0).dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\upgrade\UpgradeManager$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */