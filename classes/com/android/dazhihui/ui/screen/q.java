package com.android.dazhihui.ui.screen;

import com.android.dazhihui.ui.delegate.screen.gc;
import com.android.dazhihui.ui.screen.stock.eu;
import com.android.dazhihui.ui.screen.stock.io;
import com.android.dazhihui.ui.screen.stock.mf;
import com.tencent.avsdk.activity.HotVideoListFragment;

public class q
{
  public static int a = 0;
  public static int b = 536870912;
  public static int c = 1073741824;
  public static int d = 268435456;
  public static int e = 805306368;
  private e f = a(0);
  private e g = a(268435456);
  private e h = a(536870912);
  private e i = a(805306368);
  private e j = a(1073741824);
  
  public e a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      if (this.f == null) {
        this.f = new eu();
      }
      return this.f;
    case 268435456: 
      if (this.g == null) {
        this.g = new io();
      }
      return this.g;
    case 536870912: 
      if (this.h == null) {
        this.h = new mf();
      }
      return this.h;
    case 805306368: 
      if (this.i == null) {
        this.i = new gc();
      }
      return this.i;
    }
    if (this.j == null) {
      this.j = new HotVideoListFragment();
    }
    return this.j;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */