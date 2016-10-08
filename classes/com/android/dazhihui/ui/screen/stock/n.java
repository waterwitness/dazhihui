package com.android.dazhihui.ui.screen.stock;

import java.lang.ref.WeakReference;

class n
  implements Runnable
{
  private WeakReference<AppRestoreAdvertScreen> a;
  
  public n(AppRestoreAdvertScreen paramAppRestoreAdvertScreen)
  {
    this.a = new WeakReference(paramAppRestoreAdvertScreen);
  }
  
  public void run()
  {
    AppRestoreAdvertScreen localAppRestoreAdvertScreen = (AppRestoreAdvertScreen)this.a.get();
    if (localAppRestoreAdvertScreen != null) {
      AppRestoreAdvertScreen.d(localAppRestoreAdvertScreen);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */