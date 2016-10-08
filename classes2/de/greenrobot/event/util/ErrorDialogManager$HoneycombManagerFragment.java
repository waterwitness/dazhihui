package de.greenrobot.event.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DialogFragment;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import de.greenrobot.event.EventBus;

@TargetApi(11)
public class ErrorDialogManager$HoneycombManagerFragment
  extends Fragment
{
  protected Bundle argumentsForErrorDialog;
  private EventBus eventBus;
  private Object executionScope;
  protected boolean finishAfterDialog;
  
  public static void attachTo(Activity paramActivity, Object paramObject, boolean paramBoolean, Bundle paramBundle)
  {
    FragmentManager localFragmentManager = paramActivity.getFragmentManager();
    HoneycombManagerFragment localHoneycombManagerFragment = (HoneycombManagerFragment)localFragmentManager.findFragmentByTag("de.greenrobot.eventbus.error_dialog_manager");
    paramActivity = localHoneycombManagerFragment;
    if (localHoneycombManagerFragment == null)
    {
      paramActivity = new HoneycombManagerFragment();
      localFragmentManager.beginTransaction().add(paramActivity, "de.greenrobot.eventbus.error_dialog_manager").commit();
      localFragmentManager.executePendingTransactions();
    }
    paramActivity.finishAfterDialog = paramBoolean;
    paramActivity.argumentsForErrorDialog = paramBundle;
    paramActivity.executionScope = paramObject;
  }
  
  public void onEventMainThread(ThrowableFailureEvent paramThrowableFailureEvent)
  {
    if (!ErrorDialogManager.access$0(this.executionScope, paramThrowableFailureEvent)) {}
    FragmentManager localFragmentManager;
    do
    {
      return;
      ErrorDialogManager.checkLogException(paramThrowableFailureEvent);
      localFragmentManager = getFragmentManager();
      localFragmentManager.executePendingTransactions();
      DialogFragment localDialogFragment = (DialogFragment)localFragmentManager.findFragmentByTag("de.greenrobot.eventbus.error_dialog");
      if (localDialogFragment != null) {
        localDialogFragment.dismiss();
      }
      paramThrowableFailureEvent = (DialogFragment)ErrorDialogManager.factory.prepareErrorFragment(paramThrowableFailureEvent, this.finishAfterDialog, this.argumentsForErrorDialog);
    } while (paramThrowableFailureEvent == null);
    paramThrowableFailureEvent.show(localFragmentManager, "de.greenrobot.eventbus.error_dialog");
  }
  
  public void onPause()
  {
    this.eventBus.unregister(this);
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    this.eventBus = ErrorDialogManager.factory.config.getEventBus();
    this.eventBus.register(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\ErrorDialogManager$HoneycombManagerFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */