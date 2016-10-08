package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.text.Html;
import java.text.DecimalFormat;
import java.util.ArrayList;

class i
  implements Runnable
{
  i(AutoTextView paramAutoTextView) {}
  
  public void run()
  {
    AutoTextView.a(this.a).removeCallbacks(this);
    AutoTextView.a(this.a).postDelayed(this, this.a.c);
    AutoTextView.b(this.a).c();
    Object localObject1 = this.a;
    Object localObject2 = this.a;
    int i = ((AutoTextView)localObject2).b + 1;
    ((AutoTextView)localObject2).b = i;
    ((AutoTextView)localObject1).b = (i % this.a.a);
    localObject1 = (String)AutoTextView.c(this.a).get(this.a.b);
    if (this.a.a((String)localObject1))
    {
      double d = Double.parseDouble((String)localObject1);
      localObject2 = new DecimalFormat("0.0");
      if (d < 10000.0D)
      {
        AutoTextView.b(this.a).setText(Html.fromHtml("<font color='#ffea00'>" + (String)localObject1 + "</font>" + "<font color='#88ffffff'>在播</font>"));
        return;
      }
      if (d < 1.0E8D)
      {
        localObject1 = ((DecimalFormat)localObject2).format(d / 10000.0D);
        AutoTextView.b(this.a).setText(Html.fromHtml("<font color='#ffea00'>" + (String)localObject1 + "</font>" + "<font color='#88ffffff'>万在播</font>"));
        return;
      }
      localObject1 = ((DecimalFormat)localObject2).format(d / 1.0E8D);
      AutoTextView.b(this.a).setText(Html.fromHtml("<font color='#ffea00'>" + (String)localObject1 + "</font>" + "<font color='#88ffffff'>亿在播</font>"));
      return;
    }
    AutoTextView.b(this.a).setText((CharSequence)AutoTextView.c(this.a).get(this.a.b));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */