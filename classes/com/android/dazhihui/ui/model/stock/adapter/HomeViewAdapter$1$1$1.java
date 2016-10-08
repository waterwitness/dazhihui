package com.android.dazhihui.ui.model.stock.adapter;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.SelfStock;
import com.android.dazhihui.ui.screen.stock.eu;

class HomeViewAdapter$1$1$1
  implements DialogInterface.OnClickListener
{
  HomeViewAdapter$1$1$1(HomeViewAdapter.1.1 param1) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (this.this$2.val$chooseItem.getSelfType() == 0)
    {
      HomeViewAdapter.access$100(this.this$2.this$1.this$0).removeSelfStockByIndex(this.this$2.val$index);
      this.this$2.this$1.this$0.updateFromSelfStockManager();
      ((eu)HomeViewAdapter.access$000(this.this$2.this$1.this$0)).b();
      return;
    }
    HomeViewAdapter.access$100(this.this$2.this$1.this$0).removeBrowseStockByIndex(this.this$2.val$index);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\adapter\HomeViewAdapter$1$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */