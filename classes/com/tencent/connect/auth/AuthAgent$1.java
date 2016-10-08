package com.tencent.connect.auth;

import android.app.Activity;
import com.tencent.open.utils.SystemUtils;
import com.tencent.tauth.IUiListener;
import java.lang.ref.WeakReference;

class AuthAgent$1
  implements Runnable
{
  AuthAgent$1(AuthAgent paramAuthAgent, String paramString, IUiListener paramIUiListener) {}
  
  public void run()
  {
    SystemUtils.extractSecureLib(AuthAgent.SECURE_LIB_FILE_NAME, AuthAgent.SECURE_LIB_NAME, 3);
    Activity localActivity = (Activity)AuthAgent.e(this.c).get();
    if (localActivity != null) {
      localActivity.runOnUiThread(new AuthAgent.1.1(this, localActivity));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\auth\AuthAgent$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */