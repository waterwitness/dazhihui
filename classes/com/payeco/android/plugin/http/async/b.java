package com.payeco.android.plugin.http.async;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class b
  implements DialogInterface.OnCancelListener
{
  b(a parama, AsyncCallback paramAsyncCallback) {}
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    this.bB.onCallback(new Exception("cancel http request"));
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\async\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */