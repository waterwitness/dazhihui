package com.android.thinkive.framework.notice;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.thinkive.framework.storage.DatabaseStorage;

class NoticeDialog$2
  implements View.OnClickListener
{
  NoticeDialog$2(NoticeDialog paramNoticeDialog) {}
  
  public void onClick(View paramView)
  {
    this.this$0.dismiss();
    NoticeDialog.access$1(this.this$0);
    if (NoticeDialog.access$2(this.this$0).getShowType().equals("1")) {
      NoticeDialog.access$3(this.this$0).saveData(NoticeDialog.access$2(this.this$0).getId(), "1");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\notice\NoticeDialog$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */