package de.greenrobot.event.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class ErrorDialogFragmentFactory$Support
  extends ErrorDialogFragmentFactory<Fragment>
{
  public ErrorDialogFragmentFactory$Support(ErrorDialogConfig paramErrorDialogConfig)
  {
    super(paramErrorDialogConfig);
  }
  
  protected Fragment createErrorFragment(ThrowableFailureEvent paramThrowableFailureEvent, Bundle paramBundle)
  {
    paramThrowableFailureEvent = new ErrorDialogFragments.Support();
    paramThrowableFailureEvent.setArguments(paramBundle);
    return paramThrowableFailureEvent;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\ErrorDialogFragmentFactory$Support.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */