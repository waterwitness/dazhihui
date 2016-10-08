package com.android.dazhihui.ui.widget;

import android.os.Handler;
import java.util.List;

class lt
  implements Runnable
{
  private int b = -1;
  private Handler c = new lv(this);
  
  private lt(TableLayoutGroup paramTableLayoutGroup) {}
  
  public void a()
  {
    this.b = -1;
  }
  
  public void run()
  {
    if ((this.b == -1) && (TableLayoutGroup.R(this.a) != null))
    {
      this.b = TableLayoutGroup.c(this.a).size();
      TableLayoutGroup.R(this.a).a(this.b);
      this.c.postDelayed(new lu(this), 500L);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\lt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */