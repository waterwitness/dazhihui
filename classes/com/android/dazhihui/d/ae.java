package com.android.dazhihui.d;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class ae
  implements DialogInterface.OnClickListener
{
  ae(Activity paramActivity, Intent paramIntent) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      this.a.startActivity(this.b);
      return;
    }
    catch (ActivityNotFoundException paramDialogInterface)
    {
      paramDialogInterface.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */