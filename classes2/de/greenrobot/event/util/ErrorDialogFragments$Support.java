package de.greenrobot.event.util;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.support.v4.app.t;

public class ErrorDialogFragments$Support
  extends t
  implements DialogInterface.OnClickListener
{
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ErrorDialogFragments.handleOnClick(paramDialogInterface, paramInt, getActivity(), getArguments());
  }
  
  public Dialog onCreateDialog(Bundle paramBundle)
  {
    return ErrorDialogFragments.createDialog(getActivity(), getArguments(), this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\ErrorDialogFragments$Support.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */