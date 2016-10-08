package com.f.a.a;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class cl
  implements TextWatcher
{
  private EditText a;
  private StringBuffer b;
  private int c = 0;
  private int d = 0;
  
  public cl(EditText paramEditText)
  {
    this.a = paramEditText;
  }
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = new StringBuffer();
    this.b.append(paramCharSequence);
    this.d = this.b.length();
  }
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    paramInt3 = 0;
    this.b = new StringBuffer();
    this.b.append(paramCharSequence);
    this.c = this.b.length();
    paramInt1 = 0;
    for (;;)
    {
      paramInt2 = paramInt3;
      if (paramInt1 >= this.b.length()) {
        break;
      }
      if (this.b.charAt(paramInt1) == ' ') {
        this.b.deleteCharAt(paramInt1);
      }
      paramInt1 += 1;
    }
    while (paramInt2 < this.b.length())
    {
      if (((paramInt2 + 1) % 5 == 0) && (' ' != this.b.charAt(paramInt2))) {
        this.b.insert(paramInt2, ' ');
      }
      paramInt2 += 1;
    }
    paramInt1 = this.a.getSelectionStart();
    if ((this.a instanceof EditText))
    {
      if (this.c > this.d)
      {
        paramInt2 = this.b.toString().length() - this.c;
        this.a.setText(this.b.toString());
        if (paramInt2 < 1) {
          if ((paramInt1 % 5 == 1) || (paramInt1 % 5 == 2) || (paramInt1 % 5 == 3) || (paramInt1 % 5 == 4))
          {
            paramInt2 = paramInt1;
            if (paramInt1 > this.b.toString().length()) {
              paramInt2 = this.b.toString().length();
            }
            this.a.setSelection(paramInt2);
          }
        }
      }
      label256:
      while (this.c >= this.d)
      {
        do
        {
          do
          {
            break label256;
            do
            {
              return;
            } while (paramInt1 % 5 != 0);
            if (paramInt1 + 1 > this.b.toString().length()) {
              paramInt1 = this.b.toString().length();
            }
            for (;;)
            {
              this.a.setSelection(paramInt1);
              return;
              paramInt1 += 1;
            }
          } while (paramInt2 < 1);
          if ((paramInt1 % 5 == 1) || (paramInt1 % 5 == 2) || (paramInt1 % 5 == 3))
          {
            paramInt2 = paramInt1;
            if (paramInt1 > this.b.toString().length()) {
              paramInt2 = this.b.toString().length();
            }
            this.a.setSelection(paramInt2);
            return;
          }
        } while ((paramInt1 % 5 != 0) && (paramInt1 % 5 != 4));
        if (paramInt1 + 1 > this.b.toString().length()) {
          paramInt1 = this.b.toString().length();
        }
        for (;;)
        {
          this.a.setSelection(paramInt1);
          return;
          paramInt1 += 1;
        }
      }
      this.a.setText(this.b.toString());
      paramInt2 = paramInt1;
      if (paramInt1 > this.b.toString().length()) {
        paramInt2 = this.b.toString().length();
      }
      this.a.setSelection(paramInt2);
      return;
    }
    this.a.setText(this.b.toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */