package com.tencent.avsdk.activity;

import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.c;

class MyFavoriteActivity$1
  implements c
{
  MyFavoriteActivity$1(MyFavoriteActivity paramMyFavoriteActivity) {}
  
  public void onHeaderRefresh(BaseRefreshView paramBaseRefreshView)
  {
    if (MyFavoriteActivity.access$000(this.this$0) != null) {
      MyFavoriteActivity.access$000(this.this$0).a(true);
    }
    MyFavoriteActivity.access$200(this.this$0, MyFavoriteActivity.access$100(this.this$0));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\MyFavoriteActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */