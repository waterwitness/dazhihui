package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
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

public class FundMenu
  extends DelegateBaseActivity
  implements cp, cs
{
  public static String a;
  public static String b;
  public static String c;
  private String[] d = { "基金认购", "分红方式", "基金转换", "基金撤单", "委托查询", "历史成交", "份额明细", "基金开户", "基金账户" };
  private DzhHeader e;
  
  private void b()
  {
    if (a != null) {}
    for (String str = "得分：" + a + ", ";; str = "")
    {
      new AlertDialog.Builder(this).setTitle("风险信息查询").setMessage("您的基金风险承受能力调查结果如下：\n\t\t" + str + "风险级别：" + c + "," + b).setPositiveButton("返回", null).show();
      return;
    }
  }
  
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
    this.e = ((DzhHeader)findViewById(2131558513));
    this.e.a(this, this);
    ListView localListView = (ListView)findViewById(2131560746);
    localListView.setAdapter(new a(this, this.d));
    localListView.setOnItemClickListener(new ay(this));
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (ax.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.e == null);
      this.e.a(paramy);
      return;
    } while (this.e == null);
    this.e.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "基金交易";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.e = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    a();
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\FundMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */