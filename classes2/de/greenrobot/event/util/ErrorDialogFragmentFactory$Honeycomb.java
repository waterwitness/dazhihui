package de.greenrobot.event.util;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;

@TargetApi(11)
public class ErrorDialogFragmentFactory$Honeycomb
  extends ErrorDialogFragmentFactory<Fragment>
{
  public ErrorDialogFragmentFactory$Honeycomb(ErrorDialogConfig paramErrorDialogConfig)
  {
    super(paramErrorDialogConfig);
  }
  
  protected Fragment createErrorFragment(ThrowableFailureEvent paramThrowableFailureEvent, Bundle paramBundle)
  {
    paramThrowableFailureEvent = new ErrorDialogFragments.Honeycomb();
    paramThrowableFailureEvent.setArguments(paramBundle);
    return paramThrowableFailureEvent;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\ErrorDialogFragmentFactory$Honeycomb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */