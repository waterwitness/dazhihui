package com.iflytek.thirdparty;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechListener;

public class n
  extends v
{
  private p a = new p();
  private SpeechListener b;
  
  public n(Context paramContext, HandlerThread paramHandlerThread)
  {
    super(paramContext, paramHandlerThread);
  }
  
  protected void a(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    try
    {
      paramMessage = String.format("{'ret':%d,'cmd':%s}", new Object[] { Integer.valueOf(this.a.a(this.r, this)), v().e("cmd") });
      if (this.b != null) {
        this.b.onBufferReceived(paramMessage.getBytes(p()));
      }
      a(21);
      return;
    }
    finally {}
  }
  
  protected void a(SpeechError paramSpeechError)
  {
    super.a(paramSpeechError);
    if (this.b != null) {
      this.b.onCompleted(paramSpeechError);
    }
  }
  
  public void a(aa paramaa, n.a parama)
  {
    this.b = parama;
    a(paramaa);
    paramaa = Message.obtain();
    paramaa.what = 13;
    d(paramaa);
  }
  
  public String e()
  {
    return this.a.g();
  }
  
  public String f()
  {
    return this.a.f();
  }
  
  protected String g()
  {
    return "ivp";
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */