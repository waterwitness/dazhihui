package com.f.a.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.widget.EditText;
import com.unionpay.upomp.lthj.plugin.ui.YearAndMonthDialog;

public class ea
  implements DialogInterface.OnDismissListener
{
  public ea(YearAndMonthDialog paramYearAndMonthDialog) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    YearAndMonthDialog.a(this.a).setClickable(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */