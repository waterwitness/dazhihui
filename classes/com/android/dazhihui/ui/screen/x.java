package com.android.dazhihui.ui.screen;

import java.lang.ref.WeakReference;

class x
  implements Runnable
{
  private WeakReference<InitScreen> a;
  
  public x(InitScreen paramInitScreen)
  {
    this.a = new WeakReference(paramInitScreen);
  }
  
  public void run()
  {
    InitScreen localInitScreen = (InitScreen)this.a.get();
    if ((localInitScreen != null) && (!localInitScreen.isFinishing())) {
      InitScreen.g(localInitScreen);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */