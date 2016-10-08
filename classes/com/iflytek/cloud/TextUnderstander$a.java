package com.iflytek.cloud;

import android.os.Handler;
import android.os.Looper;

final class TextUnderstander$a
  implements TextUnderstanderListener
{
  private TextUnderstanderListener b = null;
  private com.iflytek.speech.TextUnderstanderListener c = null;
  private Handler d = new TextUnderstander.a.2(this, Looper.getMainLooper());
  
  public TextUnderstander$a(TextUnderstander paramTextUnderstander, TextUnderstanderListener paramTextUnderstanderListener)
  {
    this.b = paramTextUnderstanderListener;
    this.c = new TextUnderstander.a.1(this, paramTextUnderstander);
  }
  
  public void onError(SpeechError paramSpeechError)
  {
    paramSpeechError = this.d.obtainMessage(0, paramSpeechError);
    this.d.sendMessage(paramSpeechError);
  }
  
  public void onResult(UnderstanderResult paramUnderstanderResult)
  {
    paramUnderstanderResult = this.d.obtainMessage(4, paramUnderstanderResult);
    this.d.sendMessage(paramUnderstanderResult);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\TextUnderstander$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */