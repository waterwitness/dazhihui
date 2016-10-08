package com.android.dazhihui.ui.widget;

import android.os.Handler;

class fl
  implements Runnable
{
  fl(IndexTopLayout paramIndexTopLayout) {}
  
  public void run()
  {
    if ((IndexTopLayout.a(this.a) != null) && (IndexTopLayout.b(this.a) != null))
    {
      this.a.sendRequest(IndexTopLayout.b(this.a));
      IndexTopLayout.d(this.a).removeCallbacks(IndexTopLayout.c(this.a));
      IndexTopLayout.d(this.a).postDelayed(IndexTopLayout.c(this.a), IndexTopLayout.e(this.a));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\fl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */