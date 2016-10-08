package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.screen.BrowserActivity;

class tw
  implements View.OnClickListener
{
  tw(ti paramti) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent();
    Bundle localBundle = new Bundle();
    localBundle.putString("nexturl", f.n);
    localBundle.putString("names", "跳转测试");
    paramView.putExtras(localBundle);
    paramView.setClass(this.a.getActivity(), BrowserActivity.class);
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\tw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */