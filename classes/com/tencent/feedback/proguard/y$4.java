package com.tencent.feedback.proguard;

import com.tencent.feedback.upload.e;

final class y$4
  implements Runnable
{
  y$4(y paramy, byte paramByte) {}
  
  public final void run()
  {
    e locale = this.b.h();
    if (locale != null) {
      locale.a(new A(y.a(this.b), y.a(), this.a));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\feedback\proguard\y$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */