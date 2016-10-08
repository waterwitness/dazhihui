package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import com.android.dazhihui.a.f;
import com.android.dazhihui.d.bb;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.JsonPLItem;
import com.android.dazhihui.w;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

class kv
  implements View.OnClickListener
{
  kv(ju paramju) {}
  
  public void onClick(View paramView)
  {
    if ((this.a.j.isChecked()) && (!w.a().l())) {
      this.a.showShortToast("请先登录,登录后才能发表评论!");
    }
    String str3;
    String str5;
    String str2;
    label203:
    do
    {
      return;
      if (TextUtils.isEmpty(this.a.c.getText()))
      {
        this.a.showShortToast("评论内容不能为空!");
        return;
      }
      str3 = this.a.c.getText().toString();
      if (TextUtils.isEmpty(this.a.b)) {
        break label437;
      }
      if (!TextUtils.isEmpty(this.a.e)) {
        break;
      }
      str1 = this.a.i;
      ArrayList localArrayList = new ArrayList();
      String str4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(System.currentTimeMillis()));
      str5 = g.a().v();
      if (!w.a().l()) {
        break label367;
      }
      str2 = w.a().g();
      paramView = str2;
      if ("".equals(str2))
      {
        paramView = w.a().f();
        paramView = paramView.replace(paramView.subSequence(paramView.length() - 3, paramView.length()), "***");
      }
      ju.a(this.a, new JsonPLItem("", paramView, str3, str4, "0", str5, "1", localArrayList));
      this.a.a(this.a.b, str3, str1);
    } while (!this.a.j.isChecked());
    String str1 = f.o + this.a.f;
    if ((this.a.g != null) && (!this.a.g.isEmpty())) {}
    for (paramView = this.a.g;; paramView = this.a.h)
    {
      str2 = this.a.k.getString("news_title");
      bb.a(this.a.getActivity()).a(str2, f.p, paramView, str1, str3);
      return;
      str1 = this.a.e;
      break;
      label367:
      if ((str5 != null) && (str5.length() > 3))
      {
        paramView = "android股友(" + str5.substring(str5.length() - 4) + ")";
        break label203;
      }
      paramView = "android股友(0000)";
      break label203;
    }
    label437:
    this.a.showShortToast("发表评论异常,请稍后重试!");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\kv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */