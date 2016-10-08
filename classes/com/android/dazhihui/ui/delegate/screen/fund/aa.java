package com.android.dazhihui.ui.delegate.screen.fund;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class aa
  implements lz
{
  aa(FundCancelTable paramFundCancelTable) {}
  
  public void a()
  {
    FundCancelTable.a(this.a, 20);
    FundCancelTable.b(this.a, 0);
    this.a.a(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      FundCancelTable.a(this.a).d();
      return;
    }
    FundCancelTable.a(this.a, 10);
    FundCancelTable.b(this.a, paramInt);
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */