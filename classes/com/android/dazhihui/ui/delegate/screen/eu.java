package com.android.dazhihui.ui.delegate.screen;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

class eu
  implements View.OnClickListener
{
  eu(dy paramdy) {}
  
  public void onClick(View paramView)
  {
    if (dy.A(this.a))
    {
      dy.b(this.a, false);
      dy.e(this.a, dy.F(this.a).getProgress());
      dy.G(this.a).setText("天");
      dy.H(this.a).setText(dy.E(this.a) + "");
      dy.I(this.a).setText(dy.O(this.a) + "");
      dy.L(this.a).setTextColor(-16777216);
      dy.M(this.a).setImageResource(2130838253);
      dy.J(this.a).setTextColor(this.a.getResources().getColor(2131493178));
      dy.K(this.a).setImageResource(2130838254);
      dy.F(this.a).setMax(dy.O(this.a) - dy.E(this.a));
      dy.F(this.a).setProgress(dy.P(this.a));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\eu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */