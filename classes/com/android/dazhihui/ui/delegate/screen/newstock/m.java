package com.android.dazhihui.ui.delegate.screen.newstock;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.List;

class m
  implements View.OnClickListener
{
  m(NewStockBatchEntrust paramNewStockBatchEntrust) {}
  
  public void onClick(View paramView)
  {
    if ((NewStockBatchEntrust.a(this.a) == null) || (NewStockBatchEntrust.a(this.a).size() == 0)) {}
    int i;
    do
    {
      return;
      i = paramView.getId();
      if (i == 2131560933)
      {
        i = 0;
        while (i < NewStockBatchEntrust.a(this.a).size())
        {
          ((n)NewStockBatchEntrust.a(this.a).get(i)).f = true;
          i += 1;
        }
        NewStockBatchEntrust.b(this.a);
        NewStockBatchEntrust.c(this.a).notifyDataSetChanged();
        return;
      }
      if (i == 2131560934)
      {
        i = 0;
        if (i < NewStockBatchEntrust.a(this.a).size())
        {
          paramView = (n)NewStockBatchEntrust.a(this.a).get(i);
          if (!((n)NewStockBatchEntrust.a(this.a).get(i)).f) {}
          for (boolean bool = true;; bool = false)
          {
            paramView.f = bool;
            i += 1;
            break;
          }
        }
        NewStockBatchEntrust.b(this.a);
        NewStockBatchEntrust.c(this.a).notifyDataSetChanged();
        return;
      }
    } while (i != 2131560935);
    if (NewStockBatchEntrust.d(this.a))
    {
      NewStockBatchEntrust.e(this.a);
      return;
    }
    NewStockBatchEntrust.f(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */