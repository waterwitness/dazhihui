package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.JsonPLItem;

class ap
  implements View.OnClickListener
{
  ap(am paramam, ImageView paramImageView, ViewGroup paramViewGroup) {}
  
  public void onClick(View paramView)
  {
    n.a(this.c.a, 20073);
    if (this.a.isSelected()) {
      this.c.a("已赞");
    }
    while (am.a(this.c) == null) {
      return;
    }
    paramView = (JsonPLItem)paramView.getTag();
    am.a(this.c, this.b);
    am.a(this.c).a(paramView.getId(), true, paramView, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */