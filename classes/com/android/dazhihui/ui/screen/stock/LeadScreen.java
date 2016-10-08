package com.android.dazhihui.ui.screen.stock;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.widget.SlowlyGallery;

public class LeadScreen
  extends Activity
  implements View.OnClickListener
{
  private SlowlyGallery a;
  private ft b;
  private int c;
  private LayoutInflater d;
  private Bundle e;
  private String f;
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    if (this.c == 1)
    {
      m.a().b(false);
      if (this.f == null) {
        startActivity(new Intent(this, MainScreen.class));
      }
      for (;;)
      {
        finish();
        return;
        if (!this.f.equals("com.dazhihui.android.START_LOTTERY")) {
          if (this.f.equals("com.dazhihui.android.START_FINANCIAL"))
          {
            r.a(this);
          }
          else if (this.f.equals("com.dazhihui.android.ACTION_VIEW_STOCK"))
          {
            paramView = new Bundle();
            String str1 = this.e.getString("name");
            String str2 = this.e.getString("code");
            paramView.putString("code", str2);
            paramView.putString("name", str1);
            r.a(this, new StockVo(str1, str2, -1, false), paramView);
          }
          else if (this.f.equals("com.dazhihui.android.ACTION_TRADE"))
          {
            o.a(this);
          }
          else
          {
            startActivity(new Intent(this, MainScreen.class));
          }
        }
      }
    }
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903239);
    this.a = ((SlowlyGallery)findViewById(2131559649));
    this.d = LayoutInflater.from(this);
    this.e = getIntent().getExtras();
    this.f = getIntent().getStringExtra("BUNDLE_ACTION");
    this.c = this.e.getInt("gallry");
    this.b = new ft(this, this);
    this.a.setAdapter(this.b);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\LeadScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */