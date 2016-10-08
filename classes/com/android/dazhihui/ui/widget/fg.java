package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.screen.BrowserActivity;

class fg
  implements View.OnClickListener
{
  fg(ez paramez) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", f.aB);
    paramView.putExtras(localBundle);
    paramView.setClass(IndexStockChartBottomWidget.r(this.a.a), BrowserActivity.class);
    IndexStockChartBottomWidget.r(this.a.a).startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\fg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */