package com.android.thinkive.framework.notice;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

class NoticeDialog$1
  extends Handler
{
  NoticeDialog$1(NoticeDialog paramNoticeDialog) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 257) {
      NoticeDialog.access$0(this.this$0).setText((CharSequence)paramMessage.obj);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\notice\NoticeDialog$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */