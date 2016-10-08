package com.android.thinkive.framework.notice;

import android.os.Handler;
import android.os.Message;
import android.text.Html;
import android.text.Html.ImageGetter;

class NoticeDialog$4
  implements Runnable
{
  Message msg = Message.obtain();
  
  NoticeDialog$4(NoticeDialog paramNoticeDialog, String paramString) {}
  
  public void run()
  {
    Object localObject = new NoticeDialog.4.1(this);
    localObject = Html.fromHtml(this.val$content, (Html.ImageGetter)localObject, null);
    this.msg.what = 257;
    this.msg.obj = localObject;
    this.this$0.handler.sendMessage(this.msg);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\notice\NoticeDialog$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */