package com.android.dazhihui.richscan.b;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;

public final class f
  implements DialogInterface.OnCancelListener, DialogInterface.OnClickListener, Runnable
{
  private final Activity a;
  
  public f(Activity paramActivity)
  {
    this.a = paramActivity;
  }
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    run();
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    run();
  }
  
  public void run()
  {
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\b\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */