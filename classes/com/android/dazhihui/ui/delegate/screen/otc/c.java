package com.android.dazhihui.ui.delegate.screen.otc;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

class c
  implements View.OnClickListener
{
  c(OtcCaptialShare paramOtcCaptialShare) {}
  
  public void onClick(View paramView)
  {
    OtcCaptialShare.a(this.a, 2);
    this.a.a();
    OtcCaptialShare.g(this.a).setTextColor(OtcCaptialShare.a(this.a));
    OtcCaptialShare.b(this.a).setTextColor(OtcCaptialShare.d(this.a));
    OtcCaptialShare.e(this.a).setTextColor(OtcCaptialShare.d(this.a));
    OtcCaptialShare.c(this.a).setBackgroundColor(-1);
    OtcCaptialShare.f(this.a).setBackgroundColor(-1);
    OtcCaptialShare.h(this.a).setBackgroundResource(2130838694);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */