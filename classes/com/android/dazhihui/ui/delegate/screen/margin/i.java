package com.android.dazhihui.ui.delegate.screen.margin;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.List;

class i
  implements mc
{
  i(h paramh) {}
  
  public void a(int paramInt) {}
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= h.a(this.a).getDataModel().size())) {
      return;
    }
    String[] arrayOfString = parammh.a;
    String str1 = parammh.d;
    String str2 = parammh.f;
    parammh = "";
    int i = 0;
    while (i < h.b(this.a).length)
    {
      if (h.b(this.a)[i].equals("1037")) {
        parammh = arrayOfString[i];
      }
      i += 1;
    }
    this.a.a(str1, parammh, str2, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */