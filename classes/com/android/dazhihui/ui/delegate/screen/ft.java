package com.android.dazhihui.ui.delegate.screen;

import android.widget.EditText;
import com.android.dazhihui.ui.delegate.c.c;
import com.android.dazhihui.ui.widget.DropDownEditTextView;
import com.android.dazhihui.ui.widget.DropDownEditTextView2;
import com.android.dazhihui.ui.widget.by;
import java.util.ArrayList;
import java.util.Iterator;

class ft
  implements by
{
  ft(fi paramfi) {}
  
  public void a(String paramString, int paramInt)
  {
    fi.g(this.a);
    if (paramString == null) {}
    label11:
    c localc;
    do
    {
      do
      {
        do
        {
          return;
          break label11;
          while ((com.android.dazhihui.c.a.a.E == null) || (com.android.dazhihui.c.a.a.E.length <= 0)) {}
          paramString = com.android.dazhihui.ui.delegate.a.a().b();
        } while (paramString == null);
        paramString = paramString.iterator();
      } while (!paramString.hasNext());
      localc = (c)paramString.next();
    } while ((!localc.c().equals(fi.h(this.a).getCurrentItem())) || (!localc.d().equals(fi.i(this.a).getCurrentItem())));
    fi.j(this.a).setText(localc.e());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */