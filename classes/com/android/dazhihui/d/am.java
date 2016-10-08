package com.android.dazhihui.d;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.screen.e;
import com.android.dazhihui.ui.screen.stock.MainScreen;
import com.android.dazhihui.ui.screen.stock.SystemSetingScreen;
import com.android.dazhihui.ui.screen.stock.he;

final class am
  implements DialogInterface.OnClickListener
{
  am(Activity paramActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    
    if ((this.a != null) && ((this.a instanceof MainScreen))) {
      ((MainScreen)this.a).d().b().show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */