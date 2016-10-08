package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.JsonPLItem;

class z
  implements View.OnClickListener
{
  z(o paramo) {}
  
  public void onClick(View paramView)
  {
    paramView = (JsonPLItem)paramView.getTag(2131558470);
    if ((paramView.getAuthortype() == null) || (paramView.getAuthortype().isEmpty()) || ("0".equals(paramView.getAuthortype()))) {}
    do
    {
      return;
      if ("1".equals(paramView.getAuthortype()))
      {
        r.a(o.f(this.a), null, paramView.getAuthorlink(), null);
        return;
      }
    } while (!"2".equals(paramView.getAuthortype()));
    r.a(paramView.getAuthorlink(), o.f(this.a), null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */