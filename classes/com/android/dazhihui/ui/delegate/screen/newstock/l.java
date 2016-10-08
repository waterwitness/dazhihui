package com.android.dazhihui.ui.delegate.screen.newstock;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import java.util.List;

class l
  implements CompoundButton.OnCheckedChangeListener
{
  int a;
  
  l(NewStockBatchEntrust paramNewStockBatchEntrust) {}
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    ((n)NewStockBatchEntrust.a(this.b).get(this.a)).f = paramBoolean;
    NewStockBatchEntrust.b(this.b);
    NewStockBatchEntrust.c(this.b).notifyDataSetChanged();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */