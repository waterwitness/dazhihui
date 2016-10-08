package com.android.dazhihui.ui.delegate.screen.newstock;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.a.f;
import com.android.dazhihui.ui.screen.BrowserActivity;

class r
  implements View.OnClickListener
{
  r(p paramp) {}
  
  public void onClick(View paramView)
  {
    paramView = new Bundle();
    Intent localIntent = new Intent();
    paramView.putString("nexturl", f.s);
    paramView.putString("names", this.a.getResources().getString(2131165970));
    localIntent.putExtras(paramView);
    localIntent.setClass(this.a.getActivity(), BrowserActivity.class);
    this.a.startActivity(localIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */