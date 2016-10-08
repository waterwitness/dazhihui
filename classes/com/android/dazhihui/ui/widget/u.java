package com.android.dazhihui.ui.widget;

import android.widget.RelativeLayout;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.screen.stock.bs;
import com.android.dazhihui.ui.widget.adv.c;
import com.android.dazhihui.ui.widget.adv.p;
import java.io.PrintStream;

class u
  implements p
{
  u(o paramo, RelativeLayout paramRelativeLayout) {}
  
  public void onStateChanged(int paramInt)
  {
    System.out.println("---onStateChanged type = " + paramInt);
    if (paramInt == 1)
    {
      o.a = true;
      this.a.setVisibility(0);
    }
    AdvertBaseActivity localAdvertBaseActivity;
    do
    {
      do
      {
        do
        {
          return;
          this.a.setVisibility(8);
        } while (!o.a);
        o.a = false;
      } while ((o.g(this.b).getActivity() == null) || (!(o.g(this.b).getActivity() instanceof AdvertBaseActivity)));
      localAdvertBaseActivity = (AdvertBaseActivity)o.g(this.b).getActivity();
    } while (localAdvertBaseActivity.Z == null);
    localAdvertBaseActivity.Z.a(138);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */