package com.android.dazhihui.ui.delegate.screen;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

class fq
  implements View.OnClickListener
{
  fq(fi paramfi) {}
  
  public void onClick(View paramView)
  {
    if (fi.m(this.a))
    {
      fi.a(this.a, false);
      fi.d(this.a, fi.r(this.a).getProgress());
      fi.s(this.a).setText("天");
      fi.t(this.a).setText(fi.q(this.a) + "");
      fi.u(this.a).setText(fi.A(this.a) + "");
      fi.x(this.a).setTextColor(-16777216);
      fi.y(this.a).setImageResource(2130838253);
      fi.v(this.a).setTextColor(this.a.getResources().getColor(2131493178));
      fi.w(this.a).setImageResource(2130838254);
      fi.r(this.a).setMax(fi.A(this.a) - fi.q(this.a));
      fi.r(this.a).setProgress(fi.B(this.a));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */