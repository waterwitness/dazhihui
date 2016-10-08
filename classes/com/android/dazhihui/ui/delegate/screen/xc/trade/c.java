package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.flip.f;

class c
  implements f
{
  c(a parama) {}
  
  public void a(View paramView, int paramInt)
  {
    if ((this.a.getActivity() == null) || (this.a.getActivity().isFinishing())) {}
    do
    {
      return;
      if (paramInt == 0)
      {
        a.c(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837606));
        a.d(this.a).setText("人民币账户");
        return;
      }
      if (paramInt == 1)
      {
        a.c(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837608));
        a.d(this.a).setText("美元账户");
        return;
      }
    } while (paramInt != 2);
    a.c(this.a).setBackgroundDrawable(this.a.getResources().getDrawable(2130837607));
    a.d(this.a).setText("港币账户");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */