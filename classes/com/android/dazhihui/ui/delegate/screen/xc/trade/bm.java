package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.text.Editable;
import android.text.TextWatcher;
import com.android.dazhihui.ui.delegate.b.o;

class bm
  implements TextWatcher
{
  bm(ax paramax) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.toString().length() == 6)
    {
      ax.d(this.a, paramCharSequence.toString());
      if (o.l())
      {
        ax.h(this.a);
        return;
      }
      if (o.m())
      {
        this.a.c(ax.b(this.a));
        return;
      }
      ax.i(this.a);
      return;
    }
    ax.c(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */