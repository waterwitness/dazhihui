package com.android.dazhihui.ui.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.android.dazhihui.ui.model.stock.HttpPostAsyncTask;

class ad
  implements DialogInterface.OnDismissListener
{
  ad(ShareActivity paramShareActivity) {}
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    ShareActivity.b(this.a).abort();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */