package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.view.View;
import android.widget.Scroller;

public class a
  extends View
{
  private Scroller a;
  private d b;
  private int c;
  
  public a(Context paramContext, d paramd)
  {
    super(paramContext);
    this.b = paramd;
    b();
  }
  
  private void b()
  {
    this.a = new Scroller(getContext());
  }
  
  public void a()
  {
    if (!this.a.isFinished()) {
      this.a.abortAnimation();
    }
    invalidate();
  }
  
  public void a(int paramInt)
  {
    if (!this.a.isFinished()) {
      this.a.abortAnimation();
    }
    scrollTo(0, 0);
    invalidate();
    this.c = 0;
    this.a.fling(0, 0, 0, paramInt, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
    invalidate();
  }
  
  public void computeScroll()
  {
    int i;
    if (this.a.computeScrollOffset())
    {
      i = this.a.getCurrY() - this.c;
      if (((i <= 0) || (!this.b.isScrollTop()) || (this.b.getHeaderHidden() != -this.b.getHeaderHeight())) && (this.b.getHeaderHidden() == -this.b.getHeaderHeight())) {
        break label184;
      }
      int j = i + this.b.getHeaderHidden();
      i = j;
      if (j > 0) {
        i = 0;
      }
      j = i;
      if (i < -this.b.getHeaderHeight()) {
        j = -this.b.getHeaderHeight();
      }
      this.b.moveHeader(j - this.b.getHeaderHidden());
    }
    for (;;)
    {
      this.c = this.a.getCurrY();
      scrollTo(this.a.getCurrX(), this.a.getCurrY());
      invalidate();
      return;
      label184:
      this.b.moveContent(-i);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */