package com.iflytek.cloud;

import com.iflytek.speech.LexiconListener.Stub;

class SpeechRecognizer$3
  extends LexiconListener.Stub
{
  SpeechRecognizer$3(SpeechRecognizer paramSpeechRecognizer, LexiconListener paramLexiconListener) {}
  
  public void onLexiconUpdated(String paramString, int paramInt)
  {
    LexiconListener localLexiconListener;
    if (this.a != null)
    {
      localLexiconListener = this.a;
      if (paramInt != 0) {
        break label29;
      }
    }
    label29:
    for (SpeechError localSpeechError = null;; localSpeechError = new SpeechError(paramInt))
    {
      localLexiconListener.onLexiconUpdated(paramString, localSpeechError);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechRecognizer$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */