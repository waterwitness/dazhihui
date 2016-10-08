package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.flip.f;

class j
  implements f
{
  j(h paramh) {}
  
  public void a(View paramView, int paramInt)
  {
    if (paramInt == 0)
    {
      h.c(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837606));
      h.d(this.a).setText("人民币账户");
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        h.c(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837608));
        h.d(this.a).setText("美元账户");
        return;
      }
    } while (paramInt != 2);
    h.c(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837607));
    h.d(this.a).setText("港币账户");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */