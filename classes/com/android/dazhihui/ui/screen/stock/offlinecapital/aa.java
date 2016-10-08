package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.util.ArrayList;

class aa
  implements TextWatcher
{
  private EditText b;
  
  public aa(OfflineCapitalSettingActivity paramOfflineCapitalSettingActivity, EditText paramEditText)
  {
    this.b = paramEditText;
  }
  
  public void a(EditText paramEditText)
  {
    this.b = paramEditText;
  }
  
  public void afterTextChanged(Editable paramEditable)
  {
    try
    {
      System.out.println("afterTextChanged---");
      System.out.println("s = " + paramEditable);
      if (this.b != null)
      {
        if (this.b.getTag() == null) {
          return;
        }
        int i = ((Integer)this.b.getTag()).intValue();
        String str = (String)this.b.getTag(2131558470);
        System.out.println("position = " + i);
        System.out.println("type = " + str);
        if (str.equals("chicangliang"))
        {
          ((ag)OfflineCapitalSettingActivity.a(this.a).get(i)).b(Integer.valueOf(paramEditable.toString()).intValue());
          return;
        }
        if (str.equals("chengbenjia"))
        {
          paramEditable = Float.valueOf(paramEditable.toString());
          paramEditable = String.valueOf(new DecimalFormat("#.00").format(paramEditable).toString());
          ((ag)OfflineCapitalSettingActivity.a(this.a).get(i)).c(paramEditable);
        }
      }
      return;
    }
    catch (Exception paramEditable) {}
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */