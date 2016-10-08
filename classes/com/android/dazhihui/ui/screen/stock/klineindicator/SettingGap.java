package com.android.dazhihui.ui.screen.stock.klineindicator;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;

public class SettingGap
  extends BaseActivity
{
  private View a;
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (j.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.a == null);
      this.a.setBackgroundColor(getResources().getColor(2131493536));
      return;
    } while (this.a == null);
    this.a.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903421);
    this.a = findViewById(2131558585);
    findViewById(2131558586).setOnClickListener(new i(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\klineindicator\SettingGap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */