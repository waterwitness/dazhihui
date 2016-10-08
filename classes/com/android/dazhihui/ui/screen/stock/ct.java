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

class ct
  implements View.OnClickListener
{
  ct(cq paramcq) {}
  
  public void onClick(View paramView)
  {
    String str2 = cq.e(this.a).getText().toString();
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
      if (!cq.f(this.a)) {
        break;
      }
      n.a(this.a.a, 1137);
      cq.c(this.a, new JsonPLItem("", paramView, str2, str4, "0", str3, "1", localArrayList));
      if (!TextUtils.isEmpty(str2)) {
        break label724;
      }
      Toast.makeText(this.a.getActivity(), 2131165948, 0).show();
      return;
      if ((str3 != null) && (str3.length() > 3)) {
        paramView = "android股友(" + str3.substring(str3.length() - 4) + ")";
      } else {
        paramView = "android股友(0000)";
      }
    }
    if (!cq.g(this.a))
    {
      n.a(this.a.a, 1138);
      localArrayList.addAll(cq.h(this.a).getRemarks());
      localArrayList.add(new JsonPLItem.UtilsItem(cq.h(this.a).getId(), cq.h(this.a).getIp(), cq.h(this.a).getContent(), cq.h(this.a).getOtime(), cq.h(this.a).getGood(), cq.h(this.a).getMac(), cq.h(this.a).getFloor()));
      if (TextUtils.isEmpty(cq.h(this.a).getFloor())) {}
      for (str1 = String.valueOf(localArrayList.size() + 1);; str1 = String.valueOf(Integer.valueOf(cq.h(this.a).getFloor()).intValue() + 1))
      {
        cq.c(this.a, new JsonPLItem("", paramView, str2, str4, "0", str3, str1, localArrayList));
        break;
      }
    }
    n.a(this.a.a, 1138);
    if ((cq.i(this.a) != null) && (cq.i(this.a).size() > 0))
    {
      int j = cq.i(this.a).indexOf(cq.j(this.a));
      int i = 0;
      while (i <= j)
      {
        localArrayList.add(cq.i(this.a).get(i));
        i += 1;
      }
      if (TextUtils.isEmpty(cq.j(this.a).getFloor())) {
        str1 = String.valueOf(localArrayList.size() + 1);
      }
    }
    for (;;)
    {
      cq.c(this.a, new JsonPLItem("", paramView, str2, str4, "0", str3, str1, localArrayList));
      break;
      str1 = String.valueOf(Integer.valueOf(cq.j(this.a).getFloor()).intValue() + 1);
      continue;
      localArrayList.add(new JsonPLItem.UtilsItem(cq.j(this.a).getId(), cq.j(this.a).getIp(), cq.j(this.a).getContent(), cq.j(this.a).getOtime(), cq.j(this.a).getGood(), cq.j(this.a).getMac(), "1"));
      str1 = "2";
    }
    label724:
    this.a.b(cq.k(this.a), str2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ct.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */