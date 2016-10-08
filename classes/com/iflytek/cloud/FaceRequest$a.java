package com.iflytek.cloud;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class FaceRequest$a
  implements RequestListener
{
  private RequestListener b = null;
  private Handler c = new FaceRequest.a.1(this, Looper.getMainLooper());
  
  public FaceRequest$a(FaceRequest paramFaceRequest, RequestListener paramRequestListener)
  {
    this.b = paramRequestListener;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\FaceRequest$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */