package com.android.dazhihui.ui.widget;

import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.text.Editable;
import android.widget.EditText;
import com.android.dazhihui.d.n;

class go
  implements KeyboardView.OnKeyboardActionListener
{
  go(gn paramgn) {}
  
  public void onKey(int paramInt, int[] paramArrayOfInt)
  {
    paramArrayOfInt = gn.a(this.a).getText();
    int i = gn.a(this.a).getSelectionStart();
    if (paramInt == -4) {
      if (gn.b(this.a) != null) {
        gn.b(this.a).a();
      }
    }
    do
    {
      do
      {
        return;
        this.a.c();
        return;
        if (paramInt == -3)
        {
          this.a.c();
          return;
        }
        if (paramInt != -5) {
          break;
        }
      } while ((paramArrayOfInt == null) || (paramArrayOfInt.length() <= 0) || (i <= 0));
      paramArrayOfInt.delete(i - 1, i);
      return;
      if (paramInt == -1)
      {
        gn.c(this.a);
        gn.e(this.a).setKeyboard(gn.d(this.a));
        return;
      }
      if (paramInt == -2)
      {
        if (this.a.a)
        {
          this.a.a = false;
          gn.e(this.a).setKeyboard(gn.d(this.a));
          n.a("", 1069);
          return;
        }
        this.a.a = true;
        gn.e(this.a).setKeyboard(gn.f(this.a));
        n.a("", 1178);
        return;
      }
      if (paramInt == 10000)
      {
        gn.g(this.a);
        return;
      }
      if (paramInt != 57421) {
        break;
      }
    } while (i >= gn.a(this.a).length());
    gn.a(this.a).setSelection(i + 1);
    return;
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\go.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */