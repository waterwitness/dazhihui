package android.support.v4.app;

import android.app.RemoteInput;
import android.app.RemoteInput.Builder;

class cv
{
  static RemoteInput[] a(cx[] paramArrayOfcx)
  {
    if (paramArrayOfcx == null) {
      return null;
    }
    RemoteInput[] arrayOfRemoteInput = new RemoteInput[paramArrayOfcx.length];
    int i = 0;
    while (i < paramArrayOfcx.length)
    {
      cx localcx = paramArrayOfcx[i];
      arrayOfRemoteInput[i] = new RemoteInput.Builder(localcx.a()).setLabel(localcx.b()).setChoices(localcx.c()).setAllowFreeFormInput(localcx.d()).addExtras(localcx.e()).build();
      i += 1;
    }
    return arrayOfRemoteInput;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\app\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */