package com.iflytek.thirdparty;

import android.os.Handler;
import android.os.Looper;
import com.iflytek.cloud.LexiconListener;
import com.iflytek.cloud.SpeechError;

final class ai$b
  implements LexiconListener
{
  private LexiconListener b = null;
  private Handler c = new ai.b.1(this, Looper.getMainLooper());
  
  public ai$b(ai paramai, LexiconListener paramLexiconListener)
  {
    this.b = paramLexiconListener;
  }
  
  public void onLexiconUpdated(String paramString, SpeechError paramSpeechError)
  {
    if (paramSpeechError != null)
    {
      paramString = this.c.obtainMessage(0, paramSpeechError);
      this.c.sendMessage(paramString);
      return;
    }
    paramString = this.c.obtainMessage(1, paramString);
    this.c.sendMessage(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ai$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */