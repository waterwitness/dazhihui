package com.android.dazhihui.ui.delegate.screen.setplan;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

class c
  implements View.OnClickListener
{
  c(SetPlanCaptialShare paramSetPlanCaptialShare) {}
  
  public void onClick(View paramView)
  {
    SetPlanCaptialShare.a(this.a, 2);
    this.a.a();
    SetPlanCaptialShare.g(this.a).setTextColor(SetPlanCaptialShare.a(this.a));
    SetPlanCaptialShare.b(this.a).setTextColor(SetPlanCaptialShare.d(this.a));
    SetPlanCaptialShare.e(this.a).setTextColor(SetPlanCaptialShare.d(this.a));
    SetPlanCaptialShare.c(this.a).setBackgroundColor(-1);
    SetPlanCaptialShare.f(this.a).setBackgroundColor(-1);
    SetPlanCaptialShare.h(this.a).setBackgroundResource(2130838694);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */