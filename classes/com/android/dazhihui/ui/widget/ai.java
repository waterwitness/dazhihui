package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class ai
  implements View.OnClickListener
{
  ai(CommentListViewSubFloor paramCommentListViewSubFloor) {}
  
  public void onClick(View paramView)
  {
    CommentListViewSubFloor.a(this.a).dismiss();
    CommentListViewSubFloor.c(this.a).a(CommentListViewSubFloor.b(this.a), this.a.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */