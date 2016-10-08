package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.JsonPLItem;

class ix
  implements View.OnClickListener
{
  ix(io paramio, ViewGroup paramViewGroup) {}
  
  public void onClick(View paramView)
  {
    n.a("", 20071);
    paramView = (JsonPLItem)paramView.getTag();
    if ((paramView.getCalltype() == null) || (paramView.getCalltype().isEmpty()) || ("0".equals(paramView.getCalltype()))) {
      if (io.b(this.b) != null)
      {
        io.a(this.b, this.a);
        io.b(this.b).a(paramView, Boolean.valueOf(false));
      }
    }
    do
    {
      return;
      if ("1".equals(paramView.getCalltype()))
      {
        r.a(io.f(this.b), null, paramView.getCallurl(), null);
        return;
      }
    } while (!"2".equals(paramView.getCalltype()));
    r.a(paramView.getCallurl(), io.f(this.b), null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */