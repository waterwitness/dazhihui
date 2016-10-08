package de.greenrobot.event.util;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.support.v4.app.t;
import de.greenrobot.event.EventBus;

public class ErrorDialogManager$SupportManagerFragment
  extends Fragment
{
  protected Bundle argumentsForErrorDialog;
  private EventBus eventBus;
  private Object executionScope;
  protected boolean finishAfterDialog;
  private boolean skipRegisterOnNextResume;
  
  public static void attachTo(Activity paramActivity, Object paramObject, boolean paramBoolean, Bundle paramBundle)
  {
    ad localad = ((FragmentActivity)paramActivity).getSupportFragmentManager();
    SupportManagerFragment localSupportManagerFragment = (SupportManagerFragment)localad.a("de.greenrobot.eventbus.error_dialog_manager");
    paramActivity = localSupportManagerFragment;
    if (localSupportManagerFragment == null)
    {
      paramActivity = new SupportManagerFragment();
      localad.a().a(paramActivity, "de.greenrobot.eventbus.error_dialog_manager").a();
      localad.b();
    }
    paramActivity.finishAfterDialog = paramBoolean;
    paramActivity.argumentsForErrorDialog = paramBundle;
    paramActivity.executionScope = paramObject;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.eventBus = ErrorDialogManager.factory.config.getEventBus();
    this.eventBus.register(this);
    this.skipRegisterOnNextResume = true;
  }
  
  public void onEventMainThread(ThrowableFailureEvent paramThrowableFailureEvent)
  {
    if (!ErrorDialogManager.access$0(this.executionScope, paramThrowableFailureEvent)) {}
    ad localad;
    do
    {
      return;
      ErrorDialogManager.checkLogException(paramThrowableFailureEvent);
      localad = getFragmentManager();
      localad.b();
      t localt = (t)localad.a("de.greenrobot.eventbus.error_dialog");
      if (localt != null) {
        localt.dismiss();
      }
      paramThrowableFailureEvent = (t)ErrorDialogManager.factory.prepareErrorFragment(paramThrowableFailureEvent, this.finishAfterDialog, this.argumentsForErrorDialog);
    } while (paramThrowableFailureEvent == null);
    paramThrowableFailureEvent.show(localad, "de.greenrobot.eventbus.error_dialog");
  }
  
  public void onPause()
  {
    this.eventBus.unregister(this);
    super.onPause();
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.skipRegisterOnNextResume)
    {
      this.skipRegisterOnNextResume = false;
      return;
    }
    this.eventBus = ErrorDialogManager.factory.config.getEventBus();
    this.eventBus.register(this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\ErrorDialogManager$SupportManagerFragment.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */