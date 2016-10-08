package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.android.dazhihui.ui.delegate.b.o;

class ak
  implements AbsListView.OnScrollListener
{
  ak(af paramaf) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 0)
    {
      if ((paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (paramAbsListView.getLastVisiblePosition() + 1 < af.c(this.a).b())) {
        af.a(this.a, false);
      }
      if ((paramAbsListView.getLastVisiblePosition() == paramAbsListView.getCount() - 1) && (af.d(this.a)))
      {
        if (!o.i) {
          break label84;
        }
        this.a.c(o.g);
      }
    }
    return;
    label84:
    af.b(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */