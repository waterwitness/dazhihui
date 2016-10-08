package com.android.dazhihui.ui.screen.stock;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.ui.model.stock.JsonPLItem.UtilsItem;
import com.android.dazhihui.w;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class kd
  implements View.OnClickListener
{
  kd(ju paramju) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558617: 
      String str2 = ju.g(this.a).getText().toString();
      String str3 = g.a().v();
      String str4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
      String str1;
      if (w.a().l())
      {
        str1 = w.a().g();
        paramView = str1;
        if ("".equals(str1))
        {
          paramView = w.a().f();
          paramView = paramView.replace(paramView.subSequence(paramView.length() - 3, paramView.length()), "***");
        }
      }
      ArrayList localArrayList;
      for (;;)
      {
        localArrayList = new ArrayList();
        if (!ju.h(this.a)) {
          break;
        }
        n.a(this.a.b, 1137);
        ju.a(this.a, new JsonPLItem("", paramView, str2, str4, "0", str3, "1", localArrayList));
        if (!TextUtils.isEmpty(str2)) {
          break label813;
        }
        Toast.makeText(this.a.getActivity(), 2131165948, 0).show();
        return;
        if ((str3 != null) && (str3.length() > 3)) {
          paramView = "android股友(" + str3.substring(str3.length() - 4) + ")";
        } else {
          paramView = "android股友(0000)";
        }
      }
      if (!ju.i(this.a))
      {
        n.a(this.a.b, 1138);
        localArrayList.addAll(ju.j(this.a).getRemarks());
        localArrayList.add(new JsonPLItem.UtilsItem(ju.j(this.a).getId(), ju.j(this.a).getIp(), ju.j(this.a).getContent(), ju.j(this.a).getOtime(), ju.j(this.a).getGood(), ju.j(this.a).getMac(), ju.j(this.a).getFloor()));
        if (TextUtils.isEmpty(ju.j(this.a).getFloor())) {}
        for (str1 = String.valueOf(localArrayList.size() + 1);; str1 = String.valueOf(Integer.valueOf(ju.j(this.a).getFloor()).intValue() + 1))
        {
          ju.a(this.a, new JsonPLItem("", paramView, str2, str4, "0", str3, str1, localArrayList));
          break;
        }
      }
      n.a(this.a.b, 1138);
      if ((ju.k(this.a) != null) && (ju.k(this.a).size() > 0))
      {
        int j = ju.k(this.a).indexOf(ju.l(this.a));
        int i = 0;
        while (i <= j)
        {
          localArrayList.add(ju.k(this.a).get(i));
          i += 1;
        }
        if (TextUtils.isEmpty(ju.l(this.a).getFloor())) {
          str1 = String.valueOf(localArrayList.size() + 1);
        }
      }
      for (;;)
      {
        ju.a(this.a, new JsonPLItem("", paramView, str2, str4, "0", str3, str1, localArrayList));
        break;
        str1 = String.valueOf(Integer.valueOf(ju.l(this.a).getFloor()).intValue() + 1);
        continue;
        localArrayList.add(new JsonPLItem.UtilsItem(ju.l(this.a).getId(), ju.l(this.a).getIp(), ju.l(this.a).getContent(), ju.l(this.a).getOtime(), ju.l(this.a).getGood(), ju.l(this.a).getMac(), "1"));
        str1 = "2";
      }
      this.a.a(ju.m(this.a), str2, this.a.b);
      return;
    case 2131558594: 
      this.a.a(2);
      return;
    case 2131558595: 
      this.a.a(3);
      return;
    case 2131558592: 
      label813:
      n.a("", 20089);
      this.a.a(4);
      return;
    }
    n.a(this.a.b, 20077);
    this.a.a(ju.g(this.a), paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\kd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */