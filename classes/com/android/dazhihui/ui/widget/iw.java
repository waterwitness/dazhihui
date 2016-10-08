package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.JsonPLItem;

class iw
  implements View.OnClickListener
{
  iw(io paramio, ImageView paramImageView, ViewGroup paramViewGroup) {}
  
  public void onClick(View paramView)
  {
    n.a("", 20073);
    if (this.a.isSelected()) {
      this.c.a("已赞");
    }
    while (io.b(this.c) == null) {
      return;
    }
    paramView = (JsonPLItem)paramView.getTag();
    io.a(this.c, this.b);
    io.b(this.c).a(paramView.getId(), true, paramView, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\iw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */