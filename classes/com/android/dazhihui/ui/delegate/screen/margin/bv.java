package com.android.dazhihui.ui.delegate.screen.margin;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.TableLayoutGroup;

class bv
  implements View.OnClickListener
{
  bv(bt parambt) {}
  
  public void onClick(View paramView)
  {
    if (bt.c(this.a).getText().length() < 6)
    {
      this.a.a(0);
      return;
    }
    bt.b(this.a, 0);
    bt.a(this.a, 1);
    bt.b(this.a).a();
    bt.a(this.a, true, bt.c(this.a).getText().toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */