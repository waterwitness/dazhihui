package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;

class pe
  implements i
{
  pe(oy paramoy, pr parampr) {}
  
  public void handleResponse(h paramh, j paramj)
  {
    if (paramj == null) {}
    label4:
    do
    {
      do
      {
        do
        {
          break label4;
          do
          {
            return;
          } while (!(paramj instanceof o));
          paramh = ((o)paramj).h();
        } while ((paramh == null) || (paramh.a != 3005));
        paramh = paramh.b;
      } while (paramh == null);
      oy.a(this.b, paramh);
    } while (this.a == null);
    this.a.a();
  }
  
  public void handleTimeout(h paramh) {}
  
  public void netException(h paramh, Exception paramException) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\pe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */