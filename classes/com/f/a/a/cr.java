package com.f.a.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;

public class cr
  implements View.OnClickListener
{
  public cr(PayActivity paramPayActivity) {}
  
  public void onClick(View paramView)
  {
    View localView1 = this.a.findViewById(bp.aQ());
    View localView2 = this.a.findViewById(bp.aP());
    if (localView1.getVisibility() == 8)
    {
      localView1.setVisibility(0);
      localView2.setVisibility(0);
      paramView.setBackgroundResource(bp.u());
      return;
    }
    localView1.setVisibility(8);
    localView2.setVisibility(8);
    paramView.setBackgroundResource(bp.v());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */