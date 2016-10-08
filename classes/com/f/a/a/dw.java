package com.f.a.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.unionpay.upomp.lthj.plugin.model.GetBundleBankCardList;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;
import com.unionpay.upomp.lthj.widget.LineFrameView;
import java.util.Vector;

public class dw
  implements DialogInterface.OnClickListener
{
  public dw(PayActivity paramPayActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    u.a().E = ((GetBundleBankCardList)u.a().D.get(paramInt));
    PayActivity.j(this.a).a(u.a().E.panBank + "-" + ec.b(u.a().E.panType) + "-" + u.a().E.pan.substring(u.a().E.pan.length() - 4, u.a().E.pan.length()));
    PayActivity.k(this.a).a(ec.f(u.a().E.mobileNumber));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\dw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */