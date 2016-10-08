package com.iflytek.cloud;

import com.iflytek.speech.GrammarListener.Stub;

class SpeechRecognizer$2
  extends GrammarListener.Stub
{
  SpeechRecognizer$2(SpeechRecognizer paramSpeechRecognizer, GrammarListener paramGrammarListener) {}
  
  public void onBuildFinish(String paramString, int paramInt)
  {
    GrammarListener localGrammarListener;
    if (this.a != null)
    {
      localGrammarListener = this.a;
      if (paramInt != 0) {
        break label29;
      }
    }
    label29:
    for (SpeechError localSpeechError = null;; localSpeechError = new SpeechError(paramInt))
    {
      localGrammarListener.onBuildFinish(paramString, localSpeechError);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\SpeechRecognizer$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */