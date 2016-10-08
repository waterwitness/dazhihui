package com.android.dazhihui.ui.screen.stock;

class gv
  implements Runnable
{
  gv(LoginMainScreen paramLoginMainScreen) {}
  
  public void run()
  {
    if (LoginMainScreen.b != null) {
      LoginMainScreen.b.run();
    }
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */