package com.android.dazhihui.ui.screen.moneybox;

import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.text.Editable;
import android.widget.EditText;

class z
  implements KeyboardView.OnKeyboardActionListener
{
  z(FundSubscription paramFundSubscription) {}
  
  public void onKey(int paramInt, int[] paramArrayOfInt)
  {
    paramArrayOfInt = this.a.n.getText();
    int i = this.a.n.getSelectionStart();
    if (paramInt == -5)
    {
      if ((paramArrayOfInt != null) && (paramArrayOfInt.length() > 0) && (i > 0)) {
        paramArrayOfInt.delete(i - 1, i);
      }
      return;
    }
    if (paramInt == 4896)
    {
      paramArrayOfInt.clear();
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */