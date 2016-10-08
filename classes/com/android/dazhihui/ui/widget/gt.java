package com.android.dazhihui.ui.widget;

import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.text.Editable;
import android.widget.EditText;

class gt
  implements KeyboardView.OnKeyboardActionListener
{
  gt(gr paramgr) {}
  
  public void onKey(int paramInt, int[] paramArrayOfInt)
  {
    paramArrayOfInt = gr.c(this.a).getText();
    int i = gr.c(this.a).getSelectionStart();
    if (paramInt == -3) {
      this.a.c();
    }
    do
    {
      return;
      if (paramInt != -5) {
        break;
      }
    } while ((paramArrayOfInt == null) || (paramArrayOfInt.length() <= 0) || (i <= 0));
    paramArrayOfInt.delete(i - 1, i);
    return;
    if (paramInt == 99000)
    {
      if ((gr.c(this.a).getText() != null) && (!gr.c(this.a).getText().equals("")))
      {
        gr.c(this.a).append("000");
        return;
      }
      gr.c(this.a).setText("000");
      return;
    }
    paramArrayOfInt.insert(i, Character.toString((char)paramInt));
  }
  
  public void onPress(int paramInt) {}
  
  public void onRelease(int paramInt) {}
  
  public void onText(CharSequence paramCharSequence) {}
  
  public void swipeDown() {}
  
  public void swipeLeft() {}
  
  public void swipeRight() {}
  
  public void swipeUp() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */