package com.android.dazhihui.ui.delegate.screen.otc;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.widget.TableLayoutGroup;

class ak
  implements DialogInterface.OnClickListener
{
  ak(OtcQuery paramOtcQuery) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    OtcQuery.a(this.a, true);
    OtcQuery.b(this.a, 0);
    OtcQuery.a(this.a).a();
    OtcQuery.a(this.a, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */