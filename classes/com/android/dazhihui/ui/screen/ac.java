package com.android.dazhihui.ui.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.android.dazhihui.ui.model.stock.HttpPostAsyncTask;

class ac
  implements DialogInterface.OnCancelListener
{
  ac(ShareActivity paramShareActivity) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    ShareActivity.b(this.a).abort();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */