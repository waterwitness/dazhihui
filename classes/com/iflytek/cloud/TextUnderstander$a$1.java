package com.iflytek.cloud;

import android.os.Handler;
import android.os.Message;
import com.iflytek.speech.TextUnderstanderListener.Stub;

class TextUnderstander$a$1
  extends TextUnderstanderListener.Stub
{
  TextUnderstander$a$1(TextUnderstander.a parama, TextUnderstander paramTextUnderstander) {}
  
  public void onError(int paramInt)
  {
    Message localMessage = TextUnderstander.a.b(this.b).obtainMessage(0, new SpeechError(paramInt));
    TextUnderstander.a.b(this.b).sendMessage(localMessage);
  }
  
  public void onResult(com.iflytek.speech.UnderstanderResult paramUnderstanderResult)
  {
    paramUnderstanderResult = TextUnderstander.a.b(this.b).obtainMessage(4, new UnderstanderResult(paramUnderstanderResult.getResultString()));
    TextUnderstander.a.b(this.b).sendMessage(paramUnderstanderResult);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\TextUnderstander$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */