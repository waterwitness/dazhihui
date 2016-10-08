package com.android.dazhihui.ui.screen.stock;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.model.stock.JsonMyTalkItem;
import java.io.PrintStream;

class am
  implements View.OnClickListener
{
  am(v paramv) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558617: 
      String str2 = v.d(this.a).getText().toString();
      if (TextUtils.isEmpty(str2))
      {
        Toast.makeText(this.a.getActivity(), 2131165948, 0).show();
        return;
      }
      String str1 = "快讯";
      paramView = str1;
      if (v.e(this.a).getTopurl().equals(""))
      {
        paramView = str1;
        if (v.e(this.a).getStock() != null)
        {
          String[] arrayOfString = v.e(this.a).getStock().toString().replace("{", "").replace("}", "").split("=|:");
          paramView = str1;
          if (arrayOfString != null)
          {
            paramView = str1;
            if (arrayOfString.length == 2) {
              paramView = arrayOfString[0];
            }
          }
        }
      }
      System.out.println("stockcode = " + paramView);
      this.a.a(v.f(this.a), str2, paramView);
      return;
    case 2131558594: 
      this.a.b(2);
      return;
    case 2131558595: 
      this.a.b(3);
      return;
    case 2131558592: 
      n.a("", 20089);
      this.a.b(4);
      return;
    }
    this.a.a(v.d(this.a), paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */