package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class MyDailyEarning
  extends DelegateBaseActivity
  implements cp, cs
{
  private DzhHeader a;
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return false;
      finish();
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "余额增值";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903090);
    this.a = ((DzhHeader)findViewById(2131558567));
    this.a.a(this, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\MyDailyEarning.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */