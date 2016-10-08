package android.support.v4.media.session;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

public class MediaButtonReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject = new Intent("android.intent.action.MEDIA_BUTTON");
    ((Intent)localObject).setPackage(paramContext.getPackageName());
    localObject = paramContext.getPackageManager().queryIntentServices((Intent)localObject, 0);
    if (((List)localObject).size() != 1) {
      throw new IllegalStateException("Expected 1 Service that handles android.intent.action.MEDIA_BUTTON, found " + ((List)localObject).size());
    }
    localObject = (ResolveInfo)((List)localObject).get(0);
    paramIntent.setComponent(new ComponentName(((ResolveInfo)localObject).serviceInfo.packageName, ((ResolveInfo)localObject).serviceInfo.name));
    paramContext.startService(paramIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\media\session\MediaButtonReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */