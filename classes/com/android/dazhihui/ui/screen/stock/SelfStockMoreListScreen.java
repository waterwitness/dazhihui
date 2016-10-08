package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.view.View;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.stock.a.bl;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.TabIndicatorLayout;

public class SelfStockMoreListScreen
  extends BaseActivity
{
  private bl a;
  private TabIndicatorLayout b;
  private View c;
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (tg.a[paramy.ordinal()])
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
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903410);
    this.b = ((TabIndicatorLayout)findViewById(2131560364));
    this.c = findViewById(2131560363);
    this.a = new bl();
    this.b.setSelfStockFragment(this.a);
    paramBundle = getIntent();
    if (paramBundle != null) {
      this.a.a = paramBundle.getIntExtra("mode", 107);
    }
    this.b.a();
    getSupportFragmentManager().a().a(2131559491, this.a, "SelfStockMoreListFragment").b();
    changeLookFace(this.mLookFace);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\SelfStockMoreListScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */