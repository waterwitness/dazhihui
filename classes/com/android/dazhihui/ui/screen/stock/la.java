package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import com.android.dazhihui.ui.widget.jf;

class la
  implements jf
{
  la(kz paramkz) {}
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > paramInt4) && (paramInt2 - paramInt4 > 5) && (kz.a(this.a) != 0))
    {
      kz.b(this.a).setVisibility(8);
      kz.b(this.a).clearAnimation();
      kz.b(this.a).startAnimation(kz.c(this.a));
      kz.a(this.a, 0);
    }
    while ((paramInt2 >= paramInt4) || (paramInt4 - paramInt2 <= 5) || (kz.a(this.a) == 1)) {
      return;
    }
    kz.b(this.a).setVisibility(0);
    kz.b(this.a).clearAnimation();
    kz.b(this.a).startAnimation(kz.d(this.a));
    kz.a(this.a, 1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\la.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */