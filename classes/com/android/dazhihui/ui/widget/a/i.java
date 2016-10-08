package com.android.dazhihui.ui.widget.a;

class i
  implements Runnable
{
  i(h paramh, Runnable paramRunnable) {}
  
  public void run()
  {
    try
    {
      this.a.run();
      return;
    }
    finally
    {
      this.b.a();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */