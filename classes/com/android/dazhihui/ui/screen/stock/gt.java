package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.screen.BrowserActivity;

class gt
  implements View.OnClickListener
{
  gt(LoginMainScreen paramLoginMainScreen) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", f.I);
    localBundle.putString("names", "大智慧商城");
    paramView.putExtras(localBundle);
    paramView.setClass(this.a, BrowserActivity.class);
    this.a.startActivity(paramView);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */