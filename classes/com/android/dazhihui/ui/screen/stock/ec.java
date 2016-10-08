package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.w;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ec
  implements View.OnClickListener
{
  ec(GUHDetailBZTJ paramGUHDetailBZTJ) {}
  
  public void onClick(View paramView)
  {
    String str1 = GUHDetailBZTJ.c(this.a).getText().toString();
    String str2 = g.a().v();
    String str3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
    Object localObject;
    if (w.a().l())
    {
      localObject = w.a().g();
      paramView = (View)localObject;
      if ("".equals(localObject))
      {
        paramView = w.a().f();
        paramView = paramView.replace(paramView.subSequence(paramView.length() - 3, paramView.length()), "***");
      }
    }
    for (;;)
    {
      localObject = new ArrayList();
      GUHDetailBZTJ.a(this.a, new JsonPLItem("", paramView, str1, str3, "0", str2, "1", (List)localObject));
      if (!"".equals(str1)) {
        break;
      }
      Toast.makeText(this.a, 2131165948, 0).show();
      return;
      if ((str2 != null) && (str2.length() > 3)) {
        paramView = "android股友(" + str2.substring(str2.length() - 4) + ")";
      } else {
        paramView = "android股友(0000)";
      }
    }
    this.a.a(GUHDetailBZTJ.k(this.a), str1);
    this.a.a(Boolean.valueOf(false), GUHDetailBZTJ.c(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */