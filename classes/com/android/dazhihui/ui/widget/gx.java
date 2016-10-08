package com.android.dazhihui.ui.widget;

import android.inputmethodservice.KeyboardView;
import android.inputmethodservice.KeyboardView.OnKeyboardActionListener;
import android.text.Editable;
import android.widget.EditText;
import com.android.dazhihui.d.n;

class gx
  implements KeyboardView.OnKeyboardActionListener
{
  gx(gw paramgw) {}
  
  public void onKey(int paramInt, int[] paramArrayOfInt)
  {
    int i = 0;
    paramArrayOfInt = gw.a(this.a).getText();
    int j = gw.a(this.a).getSelectionStart();
    if (paramInt == -3) {
      this.a.c();
    }
    do
    {
      do
      {
        do
        {
          return;
          if (paramInt != -5) {
            break;
          }
        } while ((paramArrayOfInt == null) || (paramArrayOfInt.length() <= 0) || (j <= 0));
        paramArrayOfInt.delete(j - 1, j);
        return;
        if (paramInt == -1)
        {
          gw.b(this.a);
          gw.d(this.a).setKeyboard(gw.c(this.a));
          return;
        }
        if (paramInt == -2)
        {
          if (this.a.a)
          {
            this.a.a = false;
            gw.d(this.a).setKeyboard(gw.c(this.a));
            n.a("", 1069);
            return;
          }
          this.a.a = true;
          gw.d(this.a).setKeyboard(gw.e(this.a));
          n.a("", 1178);
          return;
        }
        if (paramInt != 57419) {
          break;
        }
      } while (j <= 0);
      gw.a(this.a).setSelection(j - 1);
      return;
      if (paramInt != 57421) {
        break;
      }
    } while (j >= gw.a(this.a).length());
    gw.a(this.a).setSelection(j + 1);
    return;
    if (paramInt == 10000)
    {
      gw.f(this.a);
      return;
    }
    do
    {
      i += 1;
      if (i >= gw.g(this.a).length) {
        break;
      }
    } while (paramInt != gw.g(this.a)[i]);
    if ((gw.a(this.a).getText() != null) && (!gw.a(this.a).getText().equals("")))
    {
      gw.a(this.a).append(gw.h(this.a)[i]);
      return;
    }
    gw.a(this.a).setText(gw.h(this.a)[i]);
    return;
    paramArrayOfInt.insert(j, Character.toString((char)paramInt));
  }
  
  public void onPress(int paramInt) {}
  
  public void onRelease(int paramInt) {}
  
  public void onText(CharSequence paramCharSequence) {}
  
  public void swipeDown() {}
  
  public void swipeLeft() {}
  
  public void swipeRight() {}
  
  public void swipeUp() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */