package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.IInterface;
import com.iflytek.speech.GrammarListener;
import com.iflytek.speech.LexiconListener;
import com.iflytek.speech.RecognizerListener;

public abstract interface ISpeechRecognizer
  extends IInterface
{
  public abstract void buildGrammar(Intent paramIntent, GrammarListener paramGrammarListener);
  
  public abstract void cancel(RecognizerListener paramRecognizerListener);
  
  public abstract boolean isListening();
  
  public abstract void startListening(Intent paramIntent, RecognizerListener paramRecognizerListener);
  
  public abstract void stopListening(RecognizerListener paramRecognizerListener);
  
  public abstract void updateLexicon(Intent paramIntent, LexiconListener paramLexiconListener);
  
  public abstract void writeAudio(Intent paramIntent, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeechRecognizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */