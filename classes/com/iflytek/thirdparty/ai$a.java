package com.iflytek.thirdparty;

import android.os.Handler;
import android.os.Looper;
import com.iflytek.cloud.GrammarListener;
import com.iflytek.cloud.SpeechError;

final class ai$a
  implements GrammarListener
{
  private GrammarListener b = null;
  private Handler c = new ai.a.1(this, Looper.getMainLooper());
  
  public ai$a(ai paramai, GrammarListener paramGrammarListener)
  {
    this.b = paramGrammarListener;
  }
  
  public void onBuildFinish(String paramString, SpeechError paramSpeechError)
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\ai$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */