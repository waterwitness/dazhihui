package org.apache.cordova;

import android.app.Dialog;
import android.os.Handler;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

class CordovaActivity$5
  implements Runnable
{
  CordovaActivity$5(CordovaActivity paramCordovaActivity1, CordovaActivity paramCordovaActivity2, int paramInt) {}
  
  public void run()
  {
    Display localDisplay = this.this$0.getWindowManager().getDefaultDisplay();
    LinearLayout localLinearLayout = new LinearLayout(this.val$that.getActivity());
    localLinearLayout.setMinimumHeight(localDisplay.getHeight());
    localLinearLayout.setMinimumWidth(localDisplay.getWidth());
    localLinearLayout.setOrientation(1);
    localLinearLayout.setBackgroundColor(this.val$that.getIntegerProperty("backgroundColor", -16777216));
    localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1, 0.0F));
    localLinearLayout.setBackgroundResource(this.val$that.splashscreen);
    this.this$0.splashDialog = new Dialog(this.val$that, 16973840);
    if ((this.this$0.getWindow().getAttributes().flags & 0x400) == 1024) {
      this.this$0.splashDialog.getWindow().setFlags(1024, 1024);
    }
    this.this$0.splashDialog.setContentView(localLinearLayout);
    this.this$0.splashDialog.setCancelable(false);
    this.this$0.splashDialog.show();
    new Handler().postDelayed(new CordovaActivity.5.1(this), this.val$time);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\CordovaActivity$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */