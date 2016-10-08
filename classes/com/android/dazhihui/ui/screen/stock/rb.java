package com.android.dazhihui.ui.screen.stock;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;

class rb
  implements TextWatcher
{
  rb(SearchPeopleFragment paramSearchPeopleFragment) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a.j.setVisibility(8);
    if (TextUtils.isEmpty(paramCharSequence))
    {
      if ((this.a.m == null) || (this.a.m.size() <= 0)) {
        this.a.n.setVisibility(8);
      }
      for (;;)
      {
        this.a.c.setVisibility(8);
        if (this.a.k != null) {
          this.a.k.clear();
        }
        this.a.g.notifyDataSetChanged();
        this.a.f.setVisibility(8);
        return;
        this.a.n.setVisibility(0);
      }
    }
    this.a.n.setVisibility(8);
    this.a.c.setVisibility(0);
    this.a.a(this.a.d.getText().toString());
    this.a.f.setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */