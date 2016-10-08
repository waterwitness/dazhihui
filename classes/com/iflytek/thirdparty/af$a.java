package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.IdentityListener;
import com.iflytek.cloud.IdentityResult;
import com.iflytek.cloud.SpeechError;

final class af$a
  implements IdentityListener
{
  private IdentityListener b = null;
  private boolean c = false;
  private Handler d = new af.a.1(this, Looper.getMainLooper());
  
  public af$a(af paramaf, IdentityListener paramIdentityListener)
  {
    this.b = paramIdentityListener;
  }
  
  protected void a()
  {
    ((u)af.a(this.a)).a().a();
    N.b(af.b(this.a), Boolean.valueOf(af.c(this.a)), null);
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    a();
    paramSpeechError = this.d.obtainMessage(0, paramSpeechError);
    this.d.sendMessage(paramSpeechError);
  }
  
  public void onEvent(int paramInt1, int paramInt2, int paramInt3, Bundle paramBundle)
  {
    Message localMessage = new Message();
    localMessage.what = paramInt1;
    localMessage.arg1 = paramInt2;
    localMessage.arg2 = paramInt3;
    localMessage.obj = paramBundle;
    paramBundle = this.d.obtainMessage(6, 0, 0, localMessage);
    this.d.sendMessage(paramBundle);
  }
  
  public void onResult(IdentityResult paramIdentityResult, boolean paramBoolean)
  {
    int i = 1;
    if (paramBoolean) {
      a();
    }
    Handler localHandler = this.d;
    if (paramBoolean == true) {}
    for (;;)
    {
      paramIdentityResult = localHandler.obtainMessage(4, i, 0, paramIdentityResult);
      this.d.sendMessage(paramIdentityResult);
      return;
      i = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\af$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */