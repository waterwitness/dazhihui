package com.android.dazhihui.ui.delegate.screen;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

class fp
  implements View.OnClickListener
{
  fp(fi paramfi) {}
  
  public void onClick(View paramView)
  {
    if (!fi.m(this.a))
    {
      fi.a(this.a, true);
      fi.c(this.a, fi.r(this.a).getProgress());
      fi.s(this.a).setText("分钟");
      fi.t(this.a).setText("5");
      fi.u(this.a).setText("180");
      fi.v(this.a).setTextColor(-16777216);
      fi.w(this.a).setImageResource(2130838253);
      fi.x(this.a).setTextColor(this.a.getResources().getColor(2131493178));
      fi.y(this.a).setImageResource(2130838254);
      fi.r(this.a).setMax(175);
      fi.r(this.a).setProgress(fi.z(this.a));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */