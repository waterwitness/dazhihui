package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import java.io.PrintStream;

class ki
  implements PopupWindow.OnDismissListener
{
  ki(ju paramju) {}
  
  public void onDismiss()
  {
    System.out.println("mInputPop Dismiss");
    this.a.a(1);
    this.a.a.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ki.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */