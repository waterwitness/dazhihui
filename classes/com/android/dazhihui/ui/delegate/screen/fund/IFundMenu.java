package com.android.dazhihui.ui.delegate.screen.fund;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.a.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class IFundMenu
  extends DelegateBaseActivity
  implements cp, cs
{
  private DzhHeader a;
  private String[] b = { "场内认购", "场内申购", "场内赎回" };
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    setContentView(2130903483);
    this.a = ((DzhHeader)findViewById(2131558513));
    this.a.a(this, this);
    ListView localListView = (ListView)findViewById(2131560746);
    int i = 0;
    while (i < this.b.length)
    {
      this.b[i] = (i + 1 + "." + this.b[i]);
      i += 1;
    }
    localListView.setAdapter(new a(this, this.b));
    localListView.setOnItemClickListener(new cn(this));
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (cm.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.a == null);
      this.a.a(paramy);
      return;
    } while (this.a == null);
    this.a.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "场内基金";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    a();
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\IFundMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */