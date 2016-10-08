package de.greenrobot.event.util;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import de.greenrobot.event.EventBus;

public class ErrorDialogFragments
{
  public static int ERROR_DIALOG_ICON = 0;
  public static Class<?> EVENT_TYPE_ON_CLICK;
  
  public static Dialog createDialog(Context paramContext, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener)
  {
    paramContext = new AlertDialog.Builder(paramContext);
    paramContext.setTitle(paramBundle.getString("de.greenrobot.eventbus.errordialog.title"));
    paramContext.setMessage(paramBundle.getString("de.greenrobot.eventbus.errordialog.message"));
    if (ERROR_DIALOG_ICON != 0) {
      paramContext.setIcon(ERROR_DIALOG_ICON);
    }
    paramContext.setPositiveButton(17039370, paramOnClickListener);
    return paramContext.create();
  }
  
  public static void handleOnClick(DialogInterface paramDialogInterface, int paramInt, Activity paramActivity, Bundle paramBundle)
  {
    if (EVENT_TYPE_ON_CLICK != null) {}
    try
    {
      paramDialogInterface = EVENT_TYPE_ON_CLICK.newInstance();
      ErrorDialogManager.factory.config.getEventBus().post(paramDialogInterface);
      if ((paramBundle.getBoolean("de.greenrobot.eventbus.errordialog.finish_after_dialog", false)) && (paramActivity != null)) {
        paramActivity.finish();
      }
      return;
    }
    catch (Exception paramDialogInterface)
    {
      throw new RuntimeException("Event cannot be constructed", paramDialogInterface);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\de\greenrobot\event\util\ErrorDialogFragments.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */