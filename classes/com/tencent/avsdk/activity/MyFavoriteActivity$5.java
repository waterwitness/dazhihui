package com.tencent.avsdk.activity;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.ui.model.stock.MyFavoriteVo.FavoriteItem;
import java.util.ArrayList;

class MyFavoriteActivity$5
  implements View.OnClickListener
{
  MyFavoriteActivity$5(MyFavoriteActivity paramMyFavoriteActivity, int paramInt, PopupWindow paramPopupWindow) {}
  
  public void onClick(View paramView)
  {
    MyFavoriteActivity.access$600(this.this$0, (MyFavoriteVo.FavoriteItem)MyFavoriteActivity.access$400(this.this$0).get(this.val$position));
    MyFavoriteActivity.access$400(this.this$0).remove(this.val$position);
    MyFavoriteActivity.access$700(this.this$0).notifyDataSetChanged();
    MyFavoriteActivity.access$800(this.this$0);
    this.val$popupWindow.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\MyFavoriteActivity$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */