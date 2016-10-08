package com.android.dazhihui.ui.widget;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class mk
  implements View.OnTouchListener
{
  mk(mj parammj, TableLayoutGroup paramTableLayoutGroup) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      paramView.setBackgroundResource(TableLayoutGroup.A(this.b.a));
    }
    for (;;)
    {
      return false;
      paramView.setBackgroundResource(this.b.getResources().getColor(17170445));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */