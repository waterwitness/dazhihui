package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;

public class MoreNewsListScreen
  extends BaseActivity
{
  private String a;
  private int b;
  private String c;
  private DzhHeader d;
  private lp e;
  
  private void a()
  {
    this.e.refresh();
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (jr.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.d == null);
      this.d.a(paramy);
      return;
    } while (this.d == null);
    this.d.a(paramy);
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903328);
    paramBundle = getIntent();
    this.a = paramBundle.getStringExtra("name");
    this.b = paramBundle.getIntExtra("type", 1);
    this.c = paramBundle.getStringExtra("url");
    this.d = ((DzhHeader)findViewById(2131559624));
    this.e = lp.a(this.b, this.c, this.a, false);
    paramBundle = getSupportFragmentManager().a();
    paramBundle.a(2131560083, this.e);
    paramBundle.a();
    this.d.a(this, new jp(this));
    changeLookFace(this.mLookFace);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MoreNewsListScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */