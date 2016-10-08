package com.android.dazhihui.ui.delegate.screen.fund;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import java.io.PrintStream;

class bn
  implements AdapterView.OnItemSelectedListener
{
  bn(FundOpenForm paramFundOpenForm) {}
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    FundOpenForm.a(this.a, paramInt);
    System.out.println("arg2 " + paramInt);
    if (FundOpenForm.b(this.a) == 0)
    {
      FundOpenForm.c(this.a).setText("无须填写");
      FundOpenForm.c(this.a).setFocusable(false);
      return;
    }
    FundOpenForm.c(this.a).setText("");
    FundOpenForm.c(this.a).setFocusable(true);
    FundOpenForm.c(this.a).setFocusableInTouchMode(true);
    FundOpenForm.c(this.a).requestFocus();
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */