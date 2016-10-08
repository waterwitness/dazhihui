package com.android.dazhihui.ui.widget;

import android.view.View;
import com.android.dazhihui.ui.widget.adv.ah;
import com.android.dazhihui.ui.widget.adv.aj;
import java.util.Map;

class ci
  implements aj
{
  ci(DzhBottomLayout paramDzhBottomLayout) {}
  
  public void a(int paramInt)
  {
    if (paramInt == 10001) {}
    do
    {
      return;
      if (paramInt == 10002)
      {
        if (ah.f.size() + ah.h.size() + ah.g.size() > 0)
        {
          DzhBottomLayout.a(this.a).setVisibility(0);
          return;
        }
        DzhBottomLayout.a(this.a).setVisibility(8);
        return;
      }
      if (paramInt == 10003)
      {
        if (ah.d.size() > 0)
        {
          DzhBottomLayout.b(this.a).setVisibility(0);
          return;
        }
        DzhBottomLayout.b(this.a).setVisibility(8);
        return;
      }
    } while (paramInt != 10004);
    if (ah.i.size() > 0)
    {
      DzhBottomLayout.c(this.a).setVisibility(0);
      return;
    }
    DzhBottomLayout.c(this.a).setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */