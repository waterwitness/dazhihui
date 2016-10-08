package com.android.dazhihui.ui.widget;

import android.text.SpannableString;
import android.widget.EditText;
import com.android.dazhihui.ui.screen.stock.GUHDetailBZTJ;
import java.io.PrintStream;

class dj
  implements kp
{
  dj(EmojiInputView paramEmojiInputView) {}
  
  public void a()
  {
    GUHDetailBZTJ.a(EmojiInputView.d(this.a));
  }
  
  public void a(SpannableString paramSpannableString)
  {
    if (paramSpannableString != null)
    {
      System.out.println("spanEmojiStr = " + paramSpannableString);
      paramSpannableString = jm.a(paramSpannableString, EmojiInputView.e(this.a));
      System.out.println("msgStr = " + paramSpannableString);
      EmojiInputView.d(this.a).append(paramSpannableString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */