package com.tencent.avsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.android.dazhihui.ui.model.stock.MyFavoriteVo.FavoriteItem;
import com.android.dazhihui.ui.screen.BrowserActivity;
import java.util.ArrayList;

class MyFavoriteActivity$3
  implements AdapterView.OnItemClickListener
{
  MyFavoriteActivity$3(MyFavoriteActivity paramMyFavoriteActivity) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if ((MyFavoriteActivity.access$400(this.this$0) == null) || (paramInt > MyFavoriteActivity.access$400(this.this$0).size() - 1)) {
      return;
    }
    paramAdapterView = ((MyFavoriteVo.FavoriteItem)MyFavoriteActivity.access$400(this.this$0).get(paramInt)).getClickurl();
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", paramAdapterView);
    localBundle.putString("names", ((MyFavoriteVo.FavoriteItem)MyFavoriteActivity.access$400(this.this$0).get(paramInt)).getTitle());
    paramView.putExtras(localBundle);
    paramView.setClass(this.this$0, BrowserActivity.class);
    this.this$0.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\MyFavoriteActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */