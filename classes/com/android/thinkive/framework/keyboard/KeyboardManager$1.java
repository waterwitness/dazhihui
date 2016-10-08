package com.android.thinkive.framework.keyboard;

import android.text.Editable;
import android.widget.EditText;

class KeyboardManager$1
  implements KeyboardEventListener
{
  KeyboardManager$1(KeyboardManager paramKeyboardManager) {}
  
  public void onKeyEvent(int paramInt)
  {
    if (paramInt < 0)
    {
      if ((KeyboardManager.access$0(this.this$0) != null) && ((-3 == paramInt) || (-4 == paramInt)))
      {
        this.this$0.dismiss();
        KeyboardManager.access$0(this.this$0).onInputComplete();
      }
      if ((KeyboardManager.access$1(this.this$0) == null) && (-2 == paramInt)) {
        KeyboardManager.access$2(this.this$0).onKeyEvent(paramInt);
      }
      if ((KeyboardManager.access$2(this.this$0) != null) && ((-3 == paramInt) || (-5 == paramInt) || (paramInt <= -21)) && (KeyboardManager.access$2(this.this$0) != null)) {
        KeyboardManager.access$2(this.this$0).onKeyEvent(paramInt);
      }
      if ((KeyboardManager.access$2(this.this$0) != null) && ((-14 == paramInt) || (-13 == paramInt) || (-11 == paramInt) || (-12 == paramInt))) {
        if (KeyboardManager.access$2(this.this$0) != null) {
          KeyboardManager.access$2(this.this$0).onKeyEvent(paramInt);
        }
      }
    }
    do
    {
      return;
      KeyboardManager.access$3(this.this$0, paramInt);
      return;
      if (KeyboardManager.access$2(this.this$0) != null)
      {
        KeyboardManager.access$2(this.this$0).onKeyEvent(paramInt);
        return;
      }
    } while (KeyboardManager.access$1(this.this$0) == null);
    int i = KeyboardManager.access$1(this.this$0).getSelectionStart();
    KeyboardManager.access$1(this.this$0).getText().insert(i, (char)paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\keyboard\KeyboardManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */