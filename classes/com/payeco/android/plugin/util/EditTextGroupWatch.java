package com.payeco.android.plugin.util;

import android.text.Editable;
import android.text.TextWatcher;

public class EditTextGroupWatch
  implements TextWatcher
{
  private String ch = "";
  private int ci;
  
  public EditTextGroupWatch(int paramInt)
  {
    this.ci = paramInt;
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    String str1 = paramEditable.toString().replace(" ", "");
    int j = str1.length() / this.ci;
    int i = j;
    if (str1.length() % this.ci == 0)
    {
      i = j;
      if (str1.length() >= this.ci) {
        i = j - 1;
      }
    }
    j = 0;
    for (;;)
    {
      if (j >= i)
      {
        if (!this.ch.equals(paramEditable.toString()))
        {
          paramEditable.delete(0, paramEditable.length());
          this.ch = str1;
          paramEditable.append(str1);
        }
        return;
      }
      String str2 = str1.substring(0, this.ci * (j + 1) + j);
      str1 = str1.substring(this.ci * (j + 1) + j);
      str1 = str2 + " " + str1;
      j += 1;
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\util\EditTextGroupWatch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */