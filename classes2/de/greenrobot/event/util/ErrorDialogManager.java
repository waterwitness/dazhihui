package de.greenrobot.event.util;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.Log;
import de.greenrobot.event.EventBus;

public class ErrorDialogManager
{
  public static final String KEY_EVENT_TYPE_ON_CLOSE = "de.greenrobot.eventbus.errordialog.event_type_on_close";
  public static final String KEY_FINISH_AFTER_DIALOG = "de.greenrobot.eventbus.errordialog.finish_after_dialog";
  public static final String KEY_ICON_ID = "de.greenrobot.eventbus.errordialog.icon_id";
  public static final String KEY_MESSAGE = "de.greenrobot.eventbus.errordialog.message";
  public static final String KEY_TITLE = "de.greenrobot.eventbus.errordialog.title";
  protected static final String TAG_ERROR_DIALOG = "de.greenrobot.eventbus.error_dialog";
  protected static final String TAG_ERROR_DIALOG_MANAGER = "de.greenrobot.eventbus.error_dialog_manager";
  public static ErrorDialogFragmentFactory<?> factory;
  
  public static void attachTo(Activity paramActivity)
  {
    attachTo(paramActivity, false, null);
  }
  
  public static void attachTo(Activity paramActivity, Object paramObject, boolean paramBoolean, Bundle paramBundle)
  {
    if (factory == null) {
      throw new RuntimeException("You must set the static factory field to configure error dialogs for your app.");
    }
    if (isSupportActivity(paramActivity))
    {
      ErrorDialogManager.SupportManagerFragment.attachTo(paramActivity, paramObject, paramBoolean, paramBundle);
      return;
    }
    ErrorDialogManager.HoneycombManagerFragment.attachTo(paramActivity, paramObject, paramBoolean, paramBundle);
  }
  
  public static void attachTo(Activity paramActivity, boolean paramBoolean)
  {
    attachTo(paramActivity, paramBoolean, null);
  }
  
  public static void attachTo(Activity paramActivity, boolean paramBoolean, Bundle paramBundle)
  {
    attachTo(paramActivity, paramActivity.getClass(), paramBoolean, paramBundle);
  }
  
  protected static void checkLogException(ThrowableFailureEvent paramThrowableFailureEvent)
  {
    if (factory.config.logExceptions)
    {
      String str2 = factory.config.tagForLoggingExceptions;
      String str1 = str2;
      if (str2 == null) {
        str1 = EventBus.TAG;
      }
      Log.i(str1, "Error dialog manager received exception", paramThrowableFailureEvent.throwable);
    }
  }
  
  private static boolean isInExecutionScope(Object paramObject, ThrowableFailureEvent paramThrowableFailureEvent)
  {
    if ((paramObject != null) && ((paramThrowableFailureEvent instanceof HasExecutionScope)))
    {
      paramThrowableFailureEvent = paramThrowableFailureEvent.getExecutionScope();
      if ((paramThrowableFailureEvent != null) && (!paramThrowableFailureEvent.equals(paramObject))) {
        return false;
      }
    }
    return true;
  }
  
  private static boolean isSupportActivity(Activity paramActivity)
  {
    boolean bool = false;
    for (Class localClass = paramActivity.getClass().getSuperclass();; localClass = localClass.getSuperclass())
    {
      if (localClass == null) {
        throw new RuntimeException("Illegal activity type: " + paramActivity.getClass());
      }
      String str = localClass.getName();
      if (str.equals("android.support.v4.app.FragmentActivity")) {
        bool = true;
      }
      do
      {
        return bool;
        if ((str.startsWith("com.actionbarsherlock.app")) && ((str.endsWith(".SherlockActivity")) || (str.endsWith(".SherlockListActivity")) || (str.endsWith(".SherlockPreferenceActivity")))) {
          throw new RuntimeException("Please use SherlockFragmentActivity. Illegal activity: " + str);
        }
        if (!str.equals("android.app.Activity")) {
          break;
        }
      } while (Build.VERSION.SDK_INT >= 11);
      throw new RuntimeException("Illegal activity without fragment support. Either use Android 3.0+ or android.support.v4.app.FragmentActivity.");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\ErrorDialogManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */