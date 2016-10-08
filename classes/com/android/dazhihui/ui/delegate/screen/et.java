package com.android.dazhihui.ui.delegate.screen;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

class et
  implements View.OnClickListener
{
  et(dy paramdy) {}
  
  public void onClick(View paramView)
  {
    if (!dy.A(this.a))
    {
      dy.b(this.a, true);
      dy.d(this.a, dy.F(this.a).getProgress());
      dy.G(this.a).setText("分钟");
      dy.H(this.a).setText("5");
      dy.I(this.a).setText("180");
      dy.J(this.a).setTextColor(-16777216);
      dy.K(this.a).setImageResource(2130838253);
      dy.L(this.a).setTextColor(this.a.getResources().getColor(2131493178));
      dy.M(this.a).setImageResource(2130838254);
      dy.F(this.a).setMax(175);
      dy.F(this.a).setProgress(dy.N(this.a));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\et.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */