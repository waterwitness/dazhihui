package com.f.a.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;
import com.unionpay.upomp.lthj.widget.CustomInputView;

public class aq
  implements DialogInterface.OnClickListener
{
  public aq(PayActivity paramPayActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    PayActivity.f(this.a).a(PayActivity.e(this.a)[paramInt]);
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */