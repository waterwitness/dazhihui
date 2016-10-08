package com.f.a.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.BaseActivity;

public class ds
  implements DialogInterface.OnClickListener
{
  public ds(BaseActivity paramBaseActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    BaseActivity.a(this.a).backToMerchant();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */