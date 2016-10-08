package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

class qn
  implements TextWatcher
{
  qn(SearchHuiFragment paramSearchHuiFragment) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a.i.setVisibility(8);
    SearchHuiFragment.b(this.a).setVisibility(8);
    if (TextUtils.isEmpty(paramCharSequence))
    {
      if ((SearchHuiFragment.a(this.a) == null) || (SearchHuiFragment.a(this.a).size() <= 0))
      {
        this.a.o.setVisibility(8);
        this.a.c.setVisibility(0);
      }
      for (;;)
      {
        if (this.a.j != null) {
          this.a.j.clear();
        }
        this.a.g.notifyDataSetChanged();
        this.a.f.setVisibility(8);
        this.a.n.setText("取消");
        this.a.n.setBackgroundResource(2131493660);
        this.a.n.setTextColor(-14540254);
        return;
        this.a.o.setVisibility(0);
        this.a.c.setVisibility(8);
      }
    }
    this.a.o.setVisibility(8);
    this.a.c.setVisibility(0);
    this.a.f.setVisibility(0);
    this.a.n.setText("搜索");
    this.a.n.setBackgroundColor(-12686651);
    this.a.n.setTextColor(-1);
    SearchHuiFragment.c(this.a);
    paramCharSequence = new Message();
    paramCharSequence.what = 286335522;
    this.a.q.sendMessageDelayed(paramCharSequence, 400L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */