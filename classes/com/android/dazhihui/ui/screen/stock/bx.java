package com.android.dazhihui.ui.screen.stock;

import android.widget.PopupWindow.OnDismissListener;
import com.android.dazhihui.ui.widget.EmojiInputView;
import java.io.PrintStream;

class bx
  implements PopupWindow.OnDismissListener
{
  bx(bs parambs) {}
  
  public void onDismiss()
  {
    System.out.println("mInputPop Dismiss");
    bs.i(this.a).setBbsMenuGroupStatus(1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */