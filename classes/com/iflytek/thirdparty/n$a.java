package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;

public final class n$a
  implements SpeechListener
{
  private SpeechListener a = null;
  private Handler b = new n.a.1(this, Looper.getMainLooper());
  
  public n$a(SpeechListener paramSpeechListener)
  {
    this.a = paramSpeechListener;
  }
  
  public void onBufferReceived(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = this.b.obtainMessage(1, paramArrayOfByte);
    this.b.sendMessage(paramArrayOfByte);
  }
  
  public void onCompleted(SpeechError paramSpeechError)
  {
    paramSpeechError = this.b.obtainMessage(2, paramSpeechError);
    this.b.sendMessage(paramSpeechError);
  }
  
  public void onEvent(int paramInt, Bundle paramBundle)
  {
    paramBundle = this.b.obtainMessage(0, paramInt, 0, paramBundle);
    this.b.sendMessage(paramBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\n$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */