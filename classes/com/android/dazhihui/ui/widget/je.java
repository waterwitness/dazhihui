package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.model.stock.JsonPLItem;

class je
  implements View.OnClickListener
{
  je(NewsCommentListViewSubFloor paramNewsCommentListViewSubFloor) {}
  
  public void onClick(View paramView)
  {
    NewsCommentListViewSubFloor.c(this.a).a(NewsCommentListViewSubFloor.e(this.a), (JsonPLItem)this.a.getTag());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\je.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */