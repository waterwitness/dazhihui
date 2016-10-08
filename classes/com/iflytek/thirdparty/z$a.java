package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;

public class z$a
  implements SpeechListener
{
  private SpeechListener b = null;
  private Handler c = new z.a.1(this, Looper.getMainLooper());
  
  public z$a(z paramz, SpeechListener paramSpeechListener)
  {
    this.b = paramSpeechListener;
  }
  
  public void onBufferReceived(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = this.c.obtainMessage(1, paramArrayOfByte);
    this.c.sendMessage(paramArrayOfByte);
  }
  
  public void onCompleted(SpeechError paramSpeechError)
  {
    paramSpeechError = this.c.obtainMessage(2, paramSpeechError);
    this.c.sendMessage(paramSpeechError);
  }
  
  public void onEvent(int paramInt, Bundle paramBundle)
  {
    paramBundle = this.c.obtainMessage(0, paramInt, 0, paramBundle);
    this.c.sendMessage(paramBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\z$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */