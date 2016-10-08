package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.view.View;
import com.android.dazhihui.ui.widget.cp;

class jq
  implements cp
{
  jq(jp paramjp) {}
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      this.a.a.finish();
      continue;
      MoreNewsListScreen.b(this.a.a);
      continue;
      paramView = new Intent(this.a.a.getApplicationContext(), SearchStockScreen.class);
      this.a.a.startActivity(paramView);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\jq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */