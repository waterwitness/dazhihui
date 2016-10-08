package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.view.View;
import com.android.dazhihui.ui.widget.cp;

class be
  implements cp
{
  be(DecisionScreen paramDecisionScreen) {}
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0)
    {
      this.a.finish();
      return true;
    }
    if (((Integer)paramView.getTag()).intValue() == 3)
    {
      paramView = new Intent(this.a, SearchStockScreen.class);
      this.a.startActivity(paramView);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */