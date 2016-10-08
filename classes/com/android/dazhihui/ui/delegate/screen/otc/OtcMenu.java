package com.android.dazhihui.ui.delegate.screen.otc;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.a.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class OtcMenu
  extends DelegateBaseActivity
  implements cp, cs
{
  private String[] a = { "产品查询", "产品认购", "资金份额", "当日委托查询", "历史成交查询", "历史委托查询" };
  private DzhHeader b;
  
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
    this.b = ((DzhHeader)findViewById(2131558513));
    this.b.a(this, this);
    ListView localListView = (ListView)findViewById(2131560746);
    localListView.setAdapter(new a(this, this.a));
    localListView.setOnItemClickListener(new y(this));
  }
  
  protected void changeLookFace(com.android.dazhihui.ui.screen.y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (x.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.b == null);
      this.b.a(paramy);
      return;
    } while (this.b == null);
    this.b.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "理财产品";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.b = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    a();
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\OtcMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */