package com.android.dazhihui.ui.delegate.screen.ggt;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class q
  implements lz
{
  q(GgtQuiry paramGgtQuiry) {}
  
  public void a()
  {
    GgtQuiry.a(this.a, 20);
    GgtQuiry.b(this.a, 0);
    GgtQuiry.a(this.a, false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      GgtQuiry.a(this.a).d();
      return;
    }
    GgtQuiry.a(this.a, 10);
    GgtQuiry.b(this.a, paramInt);
    GgtQuiry.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */