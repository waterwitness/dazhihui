package com.android.dazhihui.ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.WisdomHostVo.HotMsgs;

class no
  implements View.OnClickListener
{
  no(nn paramnn, String paramString, WisdomHostVo.HotMsgs paramHotMsgs) {}
  
  public void onClick(View paramView)
  {
    if ((this.a.equals("")) || (this.a.length() == 0)) {
      this.c.a.a(this.b.getContent());
    }
    for (;;)
    {
      n.a("", 20254);
      n.a("", this.b.getCountid());
      return;
      r.a(this.a, this.c.a.getContext(), "", null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\no.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */