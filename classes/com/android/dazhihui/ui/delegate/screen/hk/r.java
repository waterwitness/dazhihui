package com.android.dazhihui.ui.delegate.screen.hk;

import android.widget.ImageView;
import android.widget.ListView;
import java.util.Vector;

class r
  implements m
{
  r(q paramq) {}
  
  public void a(String paramString, int paramInt)
  {
    q.a(this.a, paramInt);
    q.a(this.a, bk.b(q.a(this.a), q.b(this.a).length - 1, q.c(this.a)));
    q.b(this.a, bk.b(q.a(this.a), q.d(this.a), q.b(this.a).length - 1, q.c(this.a)));
    q.e(this.a).notifyDataSetInvalidated();
    q.f(this.a).removeFooterView(q.e(this.a).a());
    if (q.g(this.a).size() == 0)
    {
      q.h(this.a).setVisibility(0);
      return;
    }
    q.h(this.a).setVisibility(8);
    q.f(this.a).setSelection(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */