package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.widget.EditText;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.List;

class ay
  implements mc
{
  ay(ax paramax) {}
  
  public void a(int paramInt) {}
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= ax.a(this.a).getDataModel().size())) {}
    do
    {
      return;
      if (ax.b(this.a) != null) {
        ax.c(this.a);
      }
      if ((ax.d(this.a) == 1) && (!o.i))
      {
        paramInt = 0;
        while (paramInt < ax.e(this.a).length)
        {
          if (ax.e(this.a)[paramInt].equals("1019")) {
            ax.a(this.a, parammh.a[paramInt]);
          }
          paramInt += 1;
        }
      }
      parammh = parammh.d;
    } while (parammh == null);
    ax.f(this.a).setText(parammh);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */