package com.android.dazhihui.ui.delegate.screen.margin;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mc;
import com.android.dazhihui.ui.widget.mh;
import java.util.Hashtable;
import java.util.List;

class bw
  implements mc
{
  bw(bt parambt) {}
  
  public void a(int paramInt) {}
  
  public void a(mh parammh) {}
  
  public void a(mh parammh, int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= bt.b(this.a).getDataModel().size())) {
      return;
    }
    if ((bt.d(this.a) == 0) || (bt.d(this.a) == 1))
    {
      parammh = this.a.b(paramInt);
      ((MarginCommonScreen2)this.a.getActivity()).b = ((String)parammh.get("1036"));
      ((MarginCommonScreen2)this.a.getActivity()).a(0);
      return;
    }
    this.a.a(parammh, paramInt, bt.e(this.a), bt.f(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */