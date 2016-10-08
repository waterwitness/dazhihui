package com.tencent.avsdk.activity;

import com.android.dazhihui.ui.model.stock.MyFavoriteVo;
import com.android.dazhihui.ui.widget.dzhrefresh.BaseRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import com.android.dazhihui.ui.widget.dzhrefresh.b;

class MyFavoriteActivity$2
  implements b
{
  MyFavoriteActivity$2(MyFavoriteActivity paramMyFavoriteActivity) {}
  
  public void onFooterLoad(BaseRefreshView paramBaseRefreshView, int paramInt1, int paramInt2)
  {
    if (MyFavoriteActivity.access$000(this.this$0) != null) {
      MyFavoriteActivity.access$000(this.this$0).b();
    }
    if (MyFavoriteActivity.access$300(this.this$0) == null) {
      return;
    }
    if ((MyFavoriteActivity.access$300(this.this$0).getLastPage() != null) && (!MyFavoriteActivity.access$300(this.this$0).getLastPage().equals(MyFavoriteActivity.access$300(this.this$0).getCurPage())))
    {
      paramBaseRefreshView = MyFavoriteActivity.access$300(this.this$0).getNextPage();
      MyFavoriteActivity.access$200(this.this$0, paramBaseRefreshView);
      return;
    }
    MyFavoriteActivity.access$000(this.this$0).setLastPage(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\MyFavoriteActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */