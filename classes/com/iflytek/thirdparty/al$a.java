package com.iflytek.thirdparty;

import android.os.Bundle;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;
import com.iflytek.cloud.TextUnderstanderListener;
import com.iflytek.cloud.UnderstanderResult;
import java.io.UnsupportedEncodingException;

class al$a
  implements SpeechListener
{
  private TextUnderstanderListener b;
  
  public al$a(al paramal, TextUnderstanderListener paramTextUnderstanderListener)
  {
    this.b = paramTextUnderstanderListener;
  }
  
  public void onBufferReceived(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null) {}
    try
    {
      paramArrayOfByte = new UnderstanderResult(new String(paramArrayOfByte, "utf-8"));
      this.b.onResult(paramArrayOfByte);
      return;
    }
    catch (NullPointerException paramArrayOfByte)
    {
      X.a(paramArrayOfByte);
      return;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      X.a(paramArrayOfByte);
    }
  }
  
  public void onCompleted(SpeechError paramSpeechError)
  {
    if ((this.b != null) && (paramSpeechError != null)) {
      this.b.onError(paramSpeechError);
    }
  }
  
  public void onEvent(int paramInt, Bundle paramBundle) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\al$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */