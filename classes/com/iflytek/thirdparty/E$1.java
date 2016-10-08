package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.record.b;
import com.iflytek.cloud.record.c;
import java.io.IOException;
import java.util.ArrayList;

class E$1
  implements D
{
  E$1(E paramE) {}
  
  public void a(SpeechError paramSpeechError)
  {
    Object localObject = null;
    this.a.i = paramSpeechError;
    if (paramSpeechError == null)
    {
      this.a.g = true;
      if (E.e(this.a) != null) {
        localObject = E.f(this.a).v().b("audio_format", null);
      }
      E.c(this.a).b((String)localObject);
      if (E.g(this.a) != null)
      {
        E.g(this.a).a();
        X.a("onCompleted NextSession pause");
      }
    }
    localObject = new Bundle();
    ((Bundle)localObject).putString("session_id", E.h(this.a).f());
    Message.obtain(E.b(this.a), 7, localObject).sendToTarget();
    if ((E.a(this.a) != null) && (paramSpeechError != null))
    {
      Message.obtain(E.b(this.a), 6, paramSpeechError).sendToTarget();
      if (E.i(this.a) != null) {
        E.i(this.a).e();
      }
    }
  }
  
  public void a(ArrayList<byte[]> paramArrayList, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("percent", paramInt1);
    localBundle.putInt("begpos", paramInt2);
    localBundle.putInt("endpos", paramInt3);
    localBundle.putString("spellinfo", paramString);
    if (E.a(this.a) != null) {
      Message.obtain(E.b(this.a), 2, localBundle).sendToTarget();
    }
    try
    {
      E.c(this.a).a(paramArrayList, paramInt1, paramInt2, paramInt3);
      E.d(this.a);
      return;
    }
    catch (IOException paramArrayList)
    {
      X.a(paramArrayList);
      this.a.i = new SpeechError(20010);
      Message.obtain(E.b(this.a), 6, this.a.i).sendToTarget();
      this.a.cancel(false);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\E$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */