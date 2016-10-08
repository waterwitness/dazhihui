package com.tencent.feedback.proguard;

import com.tencent.feedback.common.e;

final class t$2
  implements Runnable
{
  t$2(t paramt, s params, int paramInt) {}
  
  public final void run()
  {
    this.a.d();
    if (this.b >= 3)
    {
      e.e("rqdp{  query finished should notify}", new Object[0]);
      this.a.e();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\t$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */