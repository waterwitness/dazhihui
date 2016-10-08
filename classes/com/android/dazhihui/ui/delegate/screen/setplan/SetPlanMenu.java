package com.android.dazhihui.ui.delegate.screen.setplan;

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

public class SetPlanMenu
  extends DelegateBaseActivity
  implements cp, cs
{
  private String[] a = { "产品查询", "产品认购", "产品申购", "产品赎回", "份额查询", "分红方式设置", "历史委托查询", "成交查询", "当日委托/撤单" };
  private DzhHeader b;
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (y.a[paramy.ordinal()])
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
    paramct.d = "集合计划";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.b = paramDzhHeader;
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903483);
    this.b = ((DzhHeader)findViewById(2131558513));
    this.b.a(this, this);
    paramBundle = (ListView)findViewById(2131560746);
    paramBundle.setAdapter(new a(this, this.a));
    paramBundle.setOnItemClickListener(new z(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\SetPlanMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */