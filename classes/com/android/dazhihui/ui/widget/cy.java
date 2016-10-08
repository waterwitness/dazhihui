package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.android.dazhihui.ui.widget.adv.ai;
import com.android.dazhihui.w;

class cy
  extends ai
{
  cy(DzhMainHeader paramDzhMainHeader, int paramInt)
  {
    super(paramInt);
  }
  
  public void a()
  {
    this.a.g = true;
    String str = "";
    if (w.a().l()) {
      str = w.a().f();
    }
    Object localObject = this.a.getContext();
    this.a.getContext();
    localObject = ((Context)localObject).getSharedPreferences("DzhPush", 0);
    this.a.c = ((SharedPreferences)localObject).getInt("MY_BBS" + str, 0);
    DzhMainHeader.b(this.a);
  }
  
  public void b()
  {
    this.a.g = false;
    String str = "";
    if (w.a().l()) {
      str = w.a().f();
    }
    Context localContext = this.a.getContext();
    this.a.getContext();
    localContext.getSharedPreferences("DzhPush", 0).edit().putInt("MY_BBS" + str, 0).commit();
    this.a.c = 0;
    DzhMainHeader.b(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\cy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */