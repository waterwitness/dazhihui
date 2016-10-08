package com.iflytek.cloud;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class IdentityVerifier$1
  extends Handler
{
  IdentityVerifier$1(IdentityVerifier paramIdentityVerifier, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    if (IdentityVerifier.a(this.a) == null) {
      return;
    }
    IdentityVerifier.a(this.a).onInit(paramMessage.what);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\IdentityVerifier$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */