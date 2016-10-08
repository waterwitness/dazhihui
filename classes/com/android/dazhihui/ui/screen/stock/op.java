package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BrowserActivity;

class op
  implements View.OnClickListener
{
  op(PlateListScreen paramPlateListScreen) {}
  
  public void onClick(View paramView)
  {
    if (PlateListScreen.d(this.a) != null)
    {
      paramView = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("nexturl", PlateListScreen.d(this.a).d);
      paramView.putExtras(localBundle);
      paramView.setClass(this.a, BrowserActivity.class);
      this.a.startActivity(paramView);
      n.a(PlateListScreen.e(this.a), 1393);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\op.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */