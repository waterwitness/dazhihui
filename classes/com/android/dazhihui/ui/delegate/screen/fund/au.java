package com.android.dazhihui.ui.delegate.screen.fund;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class au
  implements lz
{
  au(FundListViewPublic paramFundListViewPublic) {}
  
  public void a()
  {
    FundListViewPublic.a(this.a, 20);
    FundListViewPublic.b(this.a, 0);
    if (FundListViewPublic.b(this.a).equals("jjinfo")) {
      this.a.a(false);
    }
    do
    {
      return;
      if (FundListViewPublic.b(this.a).equals("femx"))
      {
        this.a.b(false);
        return;
      }
    } while (!FundListViewPublic.b(this.a).equals("jjzhcx"));
    this.a.c(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d) {
      FundListViewPublic.a(this.a).d();
    }
    do
    {
      return;
      FundListViewPublic.a(this.a, 10);
      FundListViewPublic.b(this.a, paramInt);
      if (FundListViewPublic.b(this.a).equals("jjinfo"))
      {
        this.a.a(false);
        return;
      }
      if (FundListViewPublic.b(this.a).equals("femx"))
      {
        this.a.b(false);
        return;
      }
    } while (!FundListViewPublic.b(this.a).equals("jjzhcx"));
    this.a.c(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */