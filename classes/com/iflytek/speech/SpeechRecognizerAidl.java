package com.iflytek.speech;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.iflytek.cloud.InitListener;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.speech.aidl.ISpeechRecognizer;
import com.iflytek.thirdparty.X;

public class SpeechRecognizerAidl
  extends SpeechModuleAidl<ISpeechRecognizer>
{
  public SpeechRecognizerAidl(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext, paramInitListener, "com.iflytek.vflynote.recognize");
  }
  
  public int buildGrammar(String paramString1, String paramString2, GrammarListener paramGrammarListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramGrammarListener == null) {
      return 20012;
    }
    try
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("grammar_type", paramString1);
      localIntent.putExtra("grammar_content", paramString2);
      ((ISpeechRecognizer)this.mService).buildGrammar(localIntent, paramGrammarListener);
      return 0;
    }
    catch (RemoteException paramString1)
    {
      X.a(paramString1);
      return 21004;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        paramString1.printStackTrace();
      }
    }
  }
  
  public int cancel(RecognizerListener paramRecognizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramRecognizerListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechRecognizer)this.mService).cancel(paramRecognizerListener);
      return 0;
    }
    catch (RemoteException paramRecognizerListener)
    {
      X.a(paramRecognizerListener);
      return 21004;
    }
    catch (Exception paramRecognizerListener)
    {
      for (;;)
      {
        paramRecognizerListener.printStackTrace();
      }
    }
  }
  
  public boolean destory()
  {
    this.mService = null;
    return super.destory();
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isListening()
  {
    for (;;)
    {
      try
      {
        if (this.mService != null)
        {
          bool = ((ISpeechRecognizer)this.mService).isListening();
          return bool;
        }
      }
      catch (RemoteException localRemoteException)
      {
        X.a(localRemoteException);
        return false;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return false;
      }
      boolean bool = false;
    }
  }
  
  public int setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startListening(RecognizerListener paramRecognizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramRecognizerListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechRecognizer)this.mService).startListening(getIntent(), paramRecognizerListener);
      return 0;
    }
    catch (RemoteException paramRecognizerListener)
    {
      X.a(paramRecognizerListener);
      return 21004;
    }
    catch (Exception paramRecognizerListener)
    {
      for (;;)
      {
        paramRecognizerListener.printStackTrace();
      }
    }
  }
  
  public int stopListening(RecognizerListener paramRecognizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramRecognizerListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechRecognizer)this.mService).stopListening(paramRecognizerListener);
      return 0;
    }
    catch (RemoteException paramRecognizerListener)
    {
      X.a(paramRecognizerListener);
      return 21004;
    }
    catch (Exception paramRecognizerListener)
    {
      for (;;)
      {
        paramRecognizerListener.printStackTrace();
      }
    }
  }
  
  public int updateLexicon(String paramString1, String paramString2, LexiconListener paramLexiconListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramLexiconListener == null) {
      return 20012;
    }
    try
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("lexicon_name", paramString1);
      localIntent.putExtra("lexicon_content", paramString2);
      ((ISpeechRecognizer)this.mService).updateLexicon(localIntent, paramLexiconListener);
      return 0;
    }
    catch (RemoteException paramString1)
    {
      X.a(paramString1);
      return 21004;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        paramString1.printStackTrace();
      }
    }
  }
  
  public int writeAudio(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (SpeechUtility.getUtility().getServiceVersion() < 44) {
      return 20018;
    }
    if (this.mService == null) {
      return 21003;
    }
    try
    {
      Intent localIntent = getIntent();
      ((ISpeechRecognizer)this.mService).writeAudio(localIntent, paramArrayOfByte, paramInt1, paramInt2);
      return 0;
    }
    catch (RemoteException paramArrayOfByte)
    {
      X.a(paramArrayOfByte);
      return 0;
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;)
      {
        paramArrayOfByte.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\SpeechRecognizerAidl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */