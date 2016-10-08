package android.support.v4.app;

import android.app.Notification.Action.Builder;
import android.app.Notification.Builder;
import android.app.RemoteInput;

class ca
{
  public static void a(Notification.Builder paramBuilder, cf paramcf)
  {
    Notification.Action.Builder localBuilder = new Notification.Action.Builder(paramcf.a(), paramcf.b(), paramcf.c());
    if (paramcf.f() != null)
    {
      RemoteInput[] arrayOfRemoteInput = cv.a(paramcf.f());
      int j = arrayOfRemoteInput.length;
      int i = 0;
      while (i < j)
      {
        localBuilder.addRemoteInput(arrayOfRemoteInput[i]);
        i += 1;
      }
    }
    if (paramcf.d() != null) {
      localBuilder.addExtras(paramcf.d());
    }
    paramBuilder.addAction(localBuilder.build());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */