package com.android.dazhihui.ui.delegate.screen.margin;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class bo
  implements lz
{
  bo(MarginQuery paramMarginQuery) {}
  
  public void a()
  {
    MarginQuery.a(this.a, 20);
    MarginQuery.b(this.a, 0);
    MarginQuery.a(this.a, false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= MarginQuery.a(this.a))
    {
      MarginQuery.b(this.a).d();
      return;
    }
    MarginQuery.a(this.a, 10);
    MarginQuery.b(this.a, paramInt);
    MarginQuery.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */