package com.android.dazhihui.ui.screen.stock;

import android.support.v4.app.Fragment;
import android.support.v4.app.ad;
import android.support.v4.app.ao;

class u
  extends ao
{
  private String[] b;
  
  public u(BBSMyStatementActivity paramBBSMyStatementActivity, ad paramad, String[] paramArrayOfString)
  {
    super(paramad);
    this.b = paramArrayOfString;
  }
  
  public int getCount()
  {
    if (this.b != null) {
      return this.b.length;
    }
    return 0;
  }
  
  public Fragment getItem(int paramInt)
  {
    if (paramInt == 0) {
      return v.a(1);
    }
    if (paramInt == 1) {
      return v.a(2);
    }
    return null;
  }
  
  public CharSequence getPageTitle(int paramInt)
  {
    return this.b[paramInt];
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */