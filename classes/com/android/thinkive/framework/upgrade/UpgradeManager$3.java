package com.android.thinkive.framework.upgrade;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.download.DownloadDialog;
import com.android.thinkive.framework.util.CommonUtil;

class UpgradeManager$3
  implements Runnable
{
  UpgradeManager$3(UpgradeManager paramUpgradeManager) {}
  
  public void run()
  {
    Object localObject = CommonUtil.getTopActivity(UpgradeManager.access$12(this.this$0));
    localObject = ThinkiveInitializer.getInstance().getActivity((String)localObject);
    if (localObject != null) {
      UpgradeManager.access$14(this.this$0, new DownloadDialog((Context)localObject, UpgradeManager.access$13(this.this$0)));
    }
    for (;;)
    {
      if (UpgradeManager.access$2(this.this$0)) {
        UpgradeManager.access$0(this.this$0).hideBottomLayout();
      }
      UpgradeManager.access$0(this.this$0).setProgressBarMax(100);
      UpgradeManager.access$0(this.this$0).setProgressBarVaule(0);
      UpgradeManager.access$0(this.this$0).show();
      return;
      if ((UpgradeManager.access$12(this.this$0) instanceof Activity))
      {
        UpgradeManager.access$14(this.this$0, new DownloadDialog(UpgradeManager.access$12(this.this$0), UpgradeManager.access$13(this.this$0)));
      }
      else
      {
        UpgradeManager.access$14(this.this$0, new DownloadDialog(UpgradeManager.access$12(this.this$0), UpgradeManager.access$13(this.this$0)));
        UpgradeManager.access$0(this.this$0).getWindow().setType(2003);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\upgrade\UpgradeManager$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */