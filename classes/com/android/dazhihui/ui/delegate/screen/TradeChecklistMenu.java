package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class TradeChecklistMenu
  extends DelegateBaseActivity
  implements cp, cs
{
  private static BaseActivity m;
  String a = "";
  private String[] b = { "历史委托", "历史成交" };
  private String[] c = { "密码修改", "退出委托" };
  private String[] d = { "银证转账", "密码修改", "退出委托" };
  private String[] e = { "银证转账", "湘财网厅", "密码修改", "退出委托" };
  private String[] f = { "银证转账", "密码修改", "退出委托" };
  private String[] g = { "银证转账", "密码修改", "退出委托" };
  private String[] h = { "银证转账", "退出委托" };
  private String[] i = { "开放式基金", "场内基金" };
  private String[] j = { "委托下单", "查询" };
  private DzhHeader n;
  private dv o;
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    this.a = getIntent().getExtras().getString("type");
    setContentView(2130903539);
    ListView localListView = (ListView)findViewById(2131560919);
    this.n = ((DzhHeader)findViewById(2131558643));
    this.n.a(this, this);
    String[] arrayOfString;
    if ("lscx".equals(this.a)) {
      arrayOfString = this.b;
    }
    for (;;)
    {
      int k = 0;
      for (;;)
      {
        if (k < arrayOfString.length)
        {
          arrayOfString[k] = (k + 1 + "." + arrayOfString[k]);
          k += 1;
          continue;
          if ("set".equals(this.a))
          {
            arrayOfString = this.c;
            break;
          }
          if ("jjjy".equals(this.a))
          {
            arrayOfString = this.i;
            break;
          }
          if ("more".equals(this.a))
          {
            arrayOfString = this.d;
            break;
          }
          if ("ggt".equals(this.a))
          {
            arrayOfString = this.j;
            break;
          }
          if (!"xcmore".equals(this.a)) {
            break label299;
          }
          if ((o.k()) || (o.l()))
          {
            arrayOfString = this.g;
            break;
          }
          if (o.m())
          {
            arrayOfString = this.h;
            break;
          }
          if (o.i())
          {
            arrayOfString = this.f;
            break;
          }
          arrayOfString = this.e;
          break;
        }
      }
      this.o = new dv(this, this, arrayOfString);
      localListView.setAdapter(this.o);
      localListView.setOnItemClickListener(new dx(this));
      return;
      label299:
      arrayOfString = null;
    }
  }
  
  public void b()
  {
    new AlertDialog.Builder(this).setIcon(2130837525).setTitle("你确定退出？").setPositiveButton(2131165363, new dt(this)).setNegativeButton(2131165331, new ds(this)).show();
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (du.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.n == null);
      this.n.a(paramy);
      return;
    } while (this.n == null);
    this.n.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext.getResources().getString(2131165334);
    paramct.a = 40;
    paramContext = "更多";
    if ("lscx".equals(this.a)) {
      paramContext = "历史查询";
    }
    for (;;)
    {
      paramct.d = paramContext;
      paramct.p = this;
      return;
      if ("set".equals(this.a)) {
        paramContext = "委托设置";
      } else if ("jjjy".equals(this.a)) {
        paramContext = "基金交易";
      } else if ("ggt".equals(this.a)) {
        paramContext = "港股通";
      }
    }
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.n = paramDzhHeader;
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    a();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    if (paramInt == 4) {
      finish();
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\TradeChecklistMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */