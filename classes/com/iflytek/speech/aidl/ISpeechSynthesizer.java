package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.IInterface;
import com.iflytek.speech.SynthesizerListener;

public abstract interface ISpeechSynthesizer
  extends IInterface
{
  public abstract String getLocalSpeakerList();
  
  public abstract boolean isSpeaking();
  
  public abstract int pauseSpeaking(SynthesizerListener paramSynthesizerListener);
  
  public abstract int resumeSpeaking(SynthesizerListener paramSynthesizerListener);
  
  public abstract int startSpeaking(Intent paramIntent, SynthesizerListener paramSynthesizerListener);
  
  public abstract int stopSpeaking(SynthesizerListener paramSynthesizerListener);
  
  public abstract int synthesizeToUrl(Intent paramIntent, SynthesizerListener paramSynthesizerListener);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeechSynthesizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */