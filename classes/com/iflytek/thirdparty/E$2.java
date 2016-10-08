package com.iflytek.thirdparty;

import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.record.c;
import com.iflytek.cloud.record.c.a;

class E$2
  implements c.a
{
  E$2(E paramE) {}
  
  public void a()
  {
    if (E.a(this.a) != null) {
      Message.obtain(E.b(this.a), 3).sendToTarget();
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    Message.obtain(E.b(this.a), 5, paramInt1, paramInt2, Integer.valueOf(paramInt3)).sendToTarget();
  }
  
  public void a(SpeechError paramSpeechError)
  {
    Message.obtain(E.b(this.a), 6, paramSpeechError).sendToTarget();
    if (E.i(this.a) != null) {
      E.i(this.a).e();
    }
    this.a.cancel(false);
  }
  
  public void b()
  {
    if (E.a(this.a) != null) {
      Message.obtain(E.b(this.a), 4).sendToTarget();
    }
  }
  
  public void c()
  {
    Message.obtain(E.b(this.a), 6, null).sendToTarget();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\E$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */