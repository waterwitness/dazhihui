package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.android.dazhihui.ui.widget.EmojiInputView;

class bt
  implements AbsListView.OnScrollListener
{
  bt(bs parambs) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt2 = paramAbsListView.getTop();
    paramInt3 = paramInt1 - bs.a(this.a);
    if (paramInt3 >= 1)
    {
      if ((bs.b(this.a) != null) && (bs.b(this.a).getVisibility() != 8))
      {
        bs.b(this.a).setVisibility(8);
        bs.b(this.a).clearAnimation();
        bs.b(this.a).startAnimation(bs.c(this.a));
        this.a.a(Boolean.valueOf(false), bs.b(this.a));
      }
      if ((paramInt2 > 0) || (bs.e(this.a).getVisibility() == 0)) {
        break label217;
      }
      bs.e(this.a).setVisibility(0);
    }
    for (;;)
    {
      bs.a(this.a, paramInt1);
      return;
      if ((paramInt3 > -1) || (bs.b(this.a) == null) || (bs.b(this.a).getVisibility() == 0)) {
        break;
      }
      this.a.e();
      this.a.a(true, false);
      bs.b(this.a).clearAnimation();
      bs.b(this.a).startAnimation(bs.d(this.a));
      break;
      label217:
      if ((paramInt2 > 0) && (bs.e(this.a).getVisibility() == 0)) {
        bs.e(this.a).setVisibility(0);
      }
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */