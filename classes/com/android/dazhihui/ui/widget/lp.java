package com.android.dazhihui.ui.widget;

import java.util.List;

class lp
  implements Runnable
{
  lp(TableLayoutGroup paramTableLayoutGroup) {}
  
  public void run()
  {
    if ((TableLayoutGroup.a(this.a) != null) && (TableLayoutGroup.b(this.a) != null))
    {
      int j = mf.a(TableLayoutGroup.b(this.a));
      int i = j;
      if (j > TableLayoutGroup.c(this.a).size() - 1) {
        i = TableLayoutGroup.c(this.a).size() - 1;
      }
      TableLayoutGroup.a(this.a).a(mf.b(TableLayoutGroup.b(this.a)), i);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\lp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */