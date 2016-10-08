package com.android.dazhihui.ui.screen.stock;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.MyWebView;
import java.util.ArrayList;

class qo
  implements View.OnFocusChangeListener
{
  qo(SearchHuiFragment paramSearchHuiFragment) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      SearchHuiFragment.d(this.a).setVisibility(8);
      if (TextUtils.isEmpty(this.a.d.getText().toString()))
      {
        if ((SearchHuiFragment.a(this.a) != null) && (SearchHuiFragment.a(this.a).size() > 0)) {
          break label106;
        }
        this.a.o.setVisibility(8);
      }
      for (;;)
      {
        this.a.n.setVisibility(0);
        this.a.n.setText("取消");
        this.a.n.setTextColor(-14540254);
        return;
        label106:
        this.a.o.setVisibility(0);
      }
    }
    this.a.o.setVisibility(8);
    this.a.n.setVisibility(8);
    SearchHuiFragment.d(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */