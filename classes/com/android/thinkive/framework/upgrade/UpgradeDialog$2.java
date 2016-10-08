package com.android.thinkive.framework.upgrade;

import android.view.View;
import android.view.View.OnClickListener;

class UpgradeDialog$2
  implements View.OnClickListener
{
  UpgradeDialog$2(UpgradeDialog paramUpgradeDialog) {}
  
  public void onClick(View paramView)
  {
    this.this$0.dismiss();
    if (UpgradeDialog.access$0(this.this$0) != null) {
      UpgradeDialog.access$0(this.this$0).startDownload();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\upgrade\UpgradeDialog$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */