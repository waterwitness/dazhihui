package com.android.thinkive.framework.message.handler;

import android.app.Activity;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.keyboard.KeyboardManager;
import com.android.thinkive.framework.util.CommonUtil;
import com.android.thinkive.framework.util.Log;

class Message50210$2
  implements Runnable
{
  Message50210$2(Message50210 paramMessage50210, short paramShort) {}
  
  public void run()
  {
    if (KeyboardManager.getInstance() != null) {
      KeyboardManager.getInstance().dismiss();
    }
    String str = CommonUtil.getTopActivity(Message50210.access$5(this.this$0));
    Activity localActivity = ThinkiveInitializer.getInstance().getActivity(str);
    Log.d("50210 currentActivityName = " + str + " currentActivity = " + localActivity);
    if (localActivity != null) {
      Message50210.access$6(this.this$0, new KeyboardManager(localActivity, this.val$keyboardType));
    }
    for (;;)
    {
      Message50210.access$0(this.this$0).setExportActionListener(Message50210.access$7(this.this$0));
      Message50210.access$0(this.this$0).show();
      return;
      Message50210.access$6(this.this$0, new KeyboardManager(Message50210.access$5(this.this$0), this.val$keyboardType));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50210$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */