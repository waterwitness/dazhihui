package com.iflytek.speech;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.iflytek.cloud.InitListener;
import com.iflytek.speech.aidl.ITextUnderstander;
import com.iflytek.thirdparty.X;

public class TextUnderstanderAidl
  extends SpeechModuleAidl<ITextUnderstander>
{
  public static final String SCENE = "scene";
  private static final String TEXT = "text";
  
  public TextUnderstanderAidl(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext, paramInitListener, "com.iflytek.vflynote.textunderstand");
  }
  
  public int cancel(TextUnderstanderListener paramTextUnderstanderListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramTextUnderstanderListener == null) {
      return 20012;
    }
    try
    {
      ((ITextUnderstander)this.mService).cancel(paramTextUnderstanderListener);
      return 0;
    }
    catch (RemoteException paramTextUnderstanderListener)
    {
      X.a(paramTextUnderstanderListener);
      return 21004;
    }
    catch (Exception paramTextUnderstanderListener)
    {
      for (;;)
      {
        paramTextUnderstanderListener.printStackTrace();
      }
    }
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isUnderstanding()
  {
    for (;;)
    {
      try
      {
        if (this.mService != null)
        {
          bool = ((ITextUnderstander)this.mService).isUnderstanding();
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
  
  public int understandText(String paramString, TextUnderstanderListener paramTextUnderstanderListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramTextUnderstanderListener == null) {
      return 20012;
    }
    try
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("text", paramString);
      ((ITextUnderstander)this.mService).understandText(localIntent, paramTextUnderstanderListener);
      return 0;
    }
    catch (RemoteException paramString)
    {
      X.a(paramString);
      return 21004;
    }
    catch (Exception paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\speech\TextUnderstanderAidl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */