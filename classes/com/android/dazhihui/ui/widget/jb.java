package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class jb
  implements View.OnClickListener
{
  jb(NewsCommentListViewSubFloor paramNewsCommentListViewSubFloor) {}
  
  public void onClick(View paramView)
  {
    NewsCommentListViewSubFloor.a(this.a).dismiss();
    NewsCommentListViewSubFloor.c(this.a).a(NewsCommentListViewSubFloor.b(this.a), this.a.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\jb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */