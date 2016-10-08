package com.android.thinkive.framework.message.handler;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.Window;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.util.CommonUtil;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.InfoDialog;

class Message50110$1
  implements Runnable
{
  Message50110$1(Message50110 paramMessage50110, Context paramContext) {}
  
  public void run()
  {
    String str = CommonUtil.getTopActivity(this.val$context);
    Activity localActivity = ThinkiveInitializer.getInstance().getActivity(str);
    Log.d("50110 currentActivityName = " + str + " currentActivity = " + localActivity);
    if (localActivity != null) {
      Message50110.access$0(this.this$0, new InfoDialog(localActivity));
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(Message50110.access$2(this.this$0))) {
        Message50110.access$1(this.this$0).setTitle(Message50110.access$2(this.this$0));
      }
      Message50110.access$1(this.this$0).setContent(Message50110.access$3(this.this$0));
      if ("0".equals(Message50110.access$4(this.this$0))) {
        Message50110.access$1(this.this$0).setCancelBtnVisible(false);
      }
      Message50110.access$1(this.this$0).setFlag(Message50110.access$5(this.this$0));
      Message50110.access$1(this.this$0).setSourceModule(Message50110.access$6(this.this$0));
      Message50110.access$1(this.this$0).show();
      return;
      Message50110.access$0(this.this$0, new InfoDialog(this.val$context));
      Message50110.access$1(this.this$0).getWindow().setType(2003);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50110$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */