package com.iflytek.thirdparty;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SynthesizerListener;
import com.iflytek.cloud.record.b;
import java.io.IOException;
import java.util.ArrayList;

class E$5
  implements D
{
  E$5(E paramE, Handler paramHandler, String paramString) {}
  
  public void a(SpeechError paramSpeechError)
  {
    if ((E.j(this.c) != null) && (paramSpeechError != null))
    {
      if (E.k(this.c)) {
        Message.obtain(this.a, 6, paramSpeechError).sendToTarget();
      }
    }
    else {
      return;
    }
    E.j(this.c).onCompleted(paramSpeechError);
  }
  
  public void a(ArrayList<byte[]> paramArrayList, int paramInt1, int paramInt2, int paramInt3, String paramString)
  {
    if ((E.l(this.c) != null) && (E.m(this.c).v().a("tts_data_notify", false)) && (E.j(this.c) != null) && (paramArrayList != null))
    {
      int i = 0;
      if (i < paramArrayList.size())
      {
        Object localObject = (byte[])paramArrayList.get(i);
        Bundle localBundle = new Bundle();
        localBundle.putByteArray("buffer", (byte[])localObject);
        if (E.k(this.c))
        {
          localObject = Message.obtain();
          ((Message)localObject).what = 21001;
          ((Message)localObject).arg1 = 0;
          ((Message)localObject).arg2 = 0;
          ((Message)localObject).obj = localBundle;
          Message.obtain(this.a, 7, 0, 0, localObject).sendToTarget();
        }
        for (;;)
        {
          i += 1;
          break;
          E.j(this.c).onEvent(21001, 0, 0, localBundle);
        }
      }
    }
    for (;;)
    {
      try
      {
        E.c(this.c).a(paramArrayList, paramInt1, paramInt2, paramInt3);
        if (E.j(this.c) != null)
        {
          paramArrayList = new Bundle();
          paramArrayList.putInt("percent", paramInt1);
          paramArrayList.putInt("begpos", paramInt2);
          paramArrayList.putInt("endpos", paramInt3);
          paramArrayList.putString("spellinfo", paramString);
          if (!E.k(this.c)) {
            break label412;
          }
          Message.obtain(this.a, 2, paramArrayList).sendToTarget();
        }
        if (paramInt1 < 100) {
          break label411;
        }
        if ((E.n(this.c) == null) || (!E.o(this.c).v().a("tts_data_notify", false))) {
          break;
        }
        paramArrayList = E.p(this.c).v().b("audio_format", null);
        if ((TextUtils.isEmpty(this.b)) || (E.c(this.c).b(paramArrayList) == true)) {
          break label507;
        }
        throw new IOException();
      }
      catch (IOException paramArrayList)
      {
        X.a(paramArrayList);
        if (E.j(this.c) != null)
        {
          if (!E.k(this.c)) {
            break label555;
          }
          Message.obtain(this.a, 6, new SpeechError(20010)).sendToTarget();
        }
      }
      if (E.s(this.c) != null) {
        E.t(this.c).b(false);
      }
      label411:
      return;
      label412:
      E.j(this.c).onBufferProgress(paramInt1, paramInt2, paramInt3, paramString);
    }
    if (E.q(this.c) != null) {}
    for (paramArrayList = E.r(this.c).v().b("audio_format", null);; paramArrayList = null)
    {
      if (E.c(this.c).b() == 0) {
        throw new SpeechError(10118);
      }
      if (E.c(this.c).b(paramArrayList) != true) {
        throw new IOException();
      }
      label507:
      if (E.j(this.c) == null) {
        break label411;
      }
      if (E.k(this.c))
      {
        Message.obtain(this.a, 6, null).sendToTarget();
        return;
      }
      E.j(this.c).onCompleted(null);
      return;
      try
      {
        label555:
        E.j(this.c).onCompleted(new SpeechError(20010));
      }
      catch (Exception paramArrayList) {}
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\E$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */