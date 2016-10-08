package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.gr;
import java.io.PrintStream;

class bp
  implements View.OnTouchListener
{
  bp(ax paramax) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    ax.o(this.a).b();
    ax.j(this.a).requestFocus();
    System.out.println("mEtCount.setOnTouchListener");
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */