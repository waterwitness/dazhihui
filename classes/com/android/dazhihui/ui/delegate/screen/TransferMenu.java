package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListView;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class TransferMenu
  extends DelegateBaseActivity
  implements cp, cs
{
  private String[] a = { "银行转证券", "证券转银行", "转账查询", "银行余额查询" };
  private DzhHeader b;
  private gz c;
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    setContentView(2130903546);
    this.b = ((DzhHeader)findViewById(2131558643));
    this.b.a(this, this);
    ListView localListView = (ListView)findViewById(2131561135);
    int i = 0;
    while (i < this.a.length)
    {
      this.a[i] = (i + 1 + "." + this.a[i]);
      i += 1;
    }
    this.c = new gz(this, this, this.a);
    localListView.setAdapter(this.c);
    localListView.setOnItemClickListener(new hb(this));
    super.setTitle("银证转账");
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (gy.a[paramy.ordinal()])
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
    paramContext = paramContext.getResources().getString(2131166384);
    paramct.a = 40;
    paramct.d = paramContext;
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
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\TransferMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */