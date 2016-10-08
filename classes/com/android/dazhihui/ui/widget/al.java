package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.model.stock.JsonPLItem;

class al
  implements View.OnClickListener
{
  al(CommentListViewSubFloor paramCommentListViewSubFloor) {}
  
  public void onClick(View paramView)
  {
    CommentListViewSubFloor.c(this.a).a(CommentListViewSubFloor.e(this.a), (JsonPLItem)this.a.getTag());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */