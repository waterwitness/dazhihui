package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

class k
  implements TextWatcher
{
  private int b;
  private boolean c = false;
  private boolean d = false;
  private int e = 2;
  private int f;
  
  public k(AddWarningActivity paramAddWarningActivity, int paramInt1, int paramInt2)
  {
    this.b = paramInt1;
    this.f = paramInt2;
  }
  
  private int a(String paramString)
  {
    try
    {
      int i = paramString.split("\\.")[1].length();
      return i;
    }
    catch (Exception paramString) {}
    return 0;
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    int i;
    if ((this.d) && (this.f < 2))
    {
      if (this.f != 0) {
        break label150;
      }
      AddWarningActivity.g(this.a).requestFocus();
      i = AddWarningActivity.g(this.a).getText().toString().length();
      if (i > 0) {
        AddWarningActivity.g(this.a).setSelection(i);
      }
    }
    for (;;)
    {
      if (this.c) {
        paramEditable.delete(paramEditable.length() - 1, paramEditable.length());
      }
      AddWarningActivity.a(this.a, this.f);
      Message localMessage = AddWarningActivity.i(this.a).obtainMessage();
      localMessage.what = this.f;
      localMessage.obj = paramEditable.toString().trim();
      AddWarningActivity.i(this.a).sendMessageDelayed(localMessage, 100L);
      return;
      label150:
      if (this.f == 1)
      {
        AddWarningActivity.h(this.a).requestFocus();
        i = AddWarningActivity.h(this.a).getText().toString().length();
        if (i > 0) {
          AddWarningActivity.h(this.a).setSelection(i);
        }
      }
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool2 = true;
    if (this.b == 1) {
      if ((AddWarningActivity.e(this.a) == 1) && ((AddWarningActivity.f(this.a).startsWith("SH")) || (AddWarningActivity.f(this.a).startsWith("SZ"))))
      {
        this.e = 2;
        if (a(String.valueOf(paramCharSequence)) != this.e) {
          break label123;
        }
        bool1 = true;
        label75:
        this.d = bool1;
        if (a(String.valueOf(paramCharSequence)) <= this.e) {
          break label129;
        }
      }
    }
    label123:
    label129:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      this.c = bool1;
      return;
      this.e = 3;
      break;
      this.e = 2;
      break;
      bool1 = false;
      break label75;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */