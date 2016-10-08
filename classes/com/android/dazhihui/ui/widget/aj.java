package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class aj
  implements View.OnClickListener
{
  aj(CommentListViewSubFloor paramCommentListViewSubFloor) {}
  
  public void onClick(View paramView)
  {
    CommentListViewSubFloor.a(this.a).dismiss();
    CommentListViewSubFloor.c(this.a).a(CommentListViewSubFloor.d(this.a), false, null, CommentListViewSubFloor.b(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */