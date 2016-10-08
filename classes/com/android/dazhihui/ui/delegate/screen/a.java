package com.android.dazhihui.ui.delegate.screen;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class a
  implements lz
{
  a(BargainAndEntrust_today paramBargainAndEntrust_today) {}
  
  public void a()
  {
    BargainAndEntrust_today.a(this.a, 20);
    BargainAndEntrust_today.b(this.a, 0);
    if (BargainAndEntrust_today.b(this.a).equals("todayEntrust"))
    {
      this.a.a(false);
      return;
    }
    this.a.b(false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= this.a.d)
    {
      BargainAndEntrust_today.a(this.a).d();
      return;
    }
    BargainAndEntrust_today.a(this.a, 10);
    BargainAndEntrust_today.b(this.a, paramInt);
    if (BargainAndEntrust_today.b(this.a).equals("todayEntrust"))
    {
      this.a.a(false);
      return;
    }
    this.a.b(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */