package com.android.dazhihui.ui.delegate.screen.margin;

import android.widget.EditText;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.List;

class ab
  implements mc
{
  ab(aa paramaa) {}
  
  public void a(int paramInt) {}
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= aa.a(this.a).getDataModel().size())) {}
    do
    {
      return;
      if (aa.b(this.a) != null) {
        aa.c(this.a);
      }
      if (aa.d(this.a) == 1)
      {
        paramInt = 0;
        while (paramInt < aa.e(this.a).length)
        {
          if (aa.e(this.a)[paramInt].equals("1019")) {
            aa.a(this.a, parammh.a[paramInt]);
          }
          paramInt += 1;
        }
      }
      parammh = parammh.d;
    } while (parammh == null);
    aa.f(this.a).setText(parammh);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */