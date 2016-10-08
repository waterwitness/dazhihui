package com.iflytek.cloud;

import android.content.Context;
import com.iflytek.thirdparty.B;
import com.iflytek.thirdparty.X;
import com.iflytek.thirdparty.z;
import com.iflytek.thirdparty.z.a;

public class DataDownloader
  extends z
{
  public DataDownloader(Context paramContext)
  {
    super(paramContext);
  }
  
  protected boolean b_()
  {
    return true;
  }
  
  public int downloadData(SpeechListener paramSpeechListener)
  {
    try
    {
      this.d = new B(this.a, this.b, a("download"));
      ((B)this.d).a(new z.a(this, paramSpeechListener));
      return 0;
    }
    catch (SpeechError paramSpeechListener)
    {
      int i = paramSpeechListener.getErrorCode();
      X.a(paramSpeechListener);
      return i;
    }
    catch (Throwable paramSpeechListener)
    {
      X.a(paramSpeechListener);
    }
    return 20999;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\DataDownloader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */