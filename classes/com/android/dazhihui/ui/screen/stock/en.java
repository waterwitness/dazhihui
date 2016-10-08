package com.android.dazhihui.ui.screen.stock;

import android.text.SpannableString;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.jm;
import com.android.dazhihui.ui.widget.kp;
import java.io.PrintStream;

class en
  implements kp
{
  en(GUHDetailBZTJ paramGUHDetailBZTJ) {}
  
  public void a()
  {
    GUHDetailBZTJ.a(GUHDetailBZTJ.c(this.a));
  }
  
  public void a(SpannableString paramSpannableString)
  {
    if (paramSpannableString != null)
    {
      System.out.println("spanEmojiStr = " + paramSpannableString);
      paramSpannableString = jm.a(paramSpannableString, this.a);
      System.out.println("msgStr = " + paramSpannableString);
      GUHDetailBZTJ.c(this.a).append(paramSpannableString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\en.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */