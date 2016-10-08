package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;

class cs
  implements View.OnClickListener
{
  cs(MobileLogin paramMobileLogin, String paramString) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + this.a));
    this.b.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */