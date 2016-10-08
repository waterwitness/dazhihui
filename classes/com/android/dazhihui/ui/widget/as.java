package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.JsonPLItem;

class as
  implements View.OnClickListener
{
  as(am paramam, ViewGroup paramViewGroup) {}
  
  public void onClick(View paramView)
  {
    n.a(this.b.a, 20071);
    paramView = (JsonPLItem)paramView.getTag();
    if ((paramView.getCalltype() == null) || (paramView.getCalltype().isEmpty()) || ("0".equals(paramView.getCalltype()))) {
      if (am.a(this.b) != null)
      {
        am.a(this.b, this.a);
        am.a(this.b).a(paramView, Boolean.valueOf(false));
      }
    }
    do
    {
      return;
      if ("1".equals(paramView.getCalltype()))
      {
        r.a(am.b(this.b), null, paramView.getCallurl(), null);
        return;
      }
    } while (!"2".equals(paramView.getCalltype()));
    r.a(paramView.getCallurl(), am.b(this.b), null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */