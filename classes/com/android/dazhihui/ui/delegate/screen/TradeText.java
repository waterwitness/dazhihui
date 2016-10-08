package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.widget.DzhHeader;

public class TradeText
  extends BaseActivity
{
  private TextView a;
  private String b = null;
  private DzhHeader c;
  
  public void init(Bundle paramBundle)
  {
    this.b = getIntent().getExtras().getString("str");
    setContentView(2130903534);
    this.c = ((DzhHeader)findViewById(2131558643));
    this.c.setTitle("详细信息");
    this.a = ((TextView)findViewById(2131560059));
    if (this.b != null) {
      this.a.setText(this.b);
    }
    this.a.setTextSize(20.0F);
    this.a.setTextColor(-1);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\TradeText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */