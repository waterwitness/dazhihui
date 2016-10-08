package com.android.dazhihui.ui.screen.stock.klineindicator;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.SeekBar;
import com.android.dazhihui.d;
import java.io.PrintStream;

class s
  implements TextWatcher
{
  private EditText b;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private int f;
  
  public s(SettingMa paramSettingMa, EditText paramEditText, int paramInt1, int paramInt2, int paramInt3)
  {
    this.b = paramEditText;
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    try
    {
      System.out.println("s = " + paramEditable);
      if (this.b == null) {
        return;
      }
      this.f = Integer.valueOf(paramEditable.toString()).intValue();
      if (this.c > this.f) {
        this.f = this.c;
      }
      if (this.d < this.f)
      {
        this.f = this.d;
        this.b.setText("" + this.d);
      }
      this.b.setSelection(this.b.getText().length());
      if (this.e == 1)
      {
        this.a.b[0] = this.f;
        SettingMa.a(this.a).setProgress(this.a.b[0] - 1);
      }
      for (;;)
      {
        this.a.a.j(this.a.b);
        return;
        if (this.e == 2)
        {
          this.a.b[1] = this.f;
          SettingMa.b(this.a).setProgress(this.a.b[1] - 1);
        }
        else if (this.e == 3)
        {
          this.a.b[2] = this.f;
          SettingMa.c(this.a).setProgress(this.a.b[2] - 1);
        }
        else if (this.e == 4)
        {
          this.a.b[3] = this.f;
          SettingMa.d(this.a).setProgress(this.a.b[3] - 1);
        }
        else if (this.e == 5)
        {
          this.a.b[4] = this.f;
          SettingMa.e(this.a).setProgress(this.a.b[4] - 1);
        }
        else if (this.e == 6)
        {
          this.a.b[5] = this.f;
          SettingMa.f(this.a).setProgress(this.a.b[5] - 1);
        }
      }
      return;
    }
    catch (Exception paramEditable) {}
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\klineindicator\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */