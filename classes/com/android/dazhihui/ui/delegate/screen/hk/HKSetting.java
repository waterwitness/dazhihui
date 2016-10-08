package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.Map;

public class HKSetting
  extends DelegateBaseActivity
  implements cp, cs
{
  private DzhHeader a;
  private TextView b = null;
  private RelativeLayout c = null;
  private ToggleButton d = null;
  private ToggleButton e = null;
  private ToggleButton f = null;
  private RelativeLayout g = null;
  private RelativeLayout h = null;
  private SharedPreferences i = null;
  private SharedPreferences.Editor j = null;
  
  private void a()
  {
    this.i = PreferenceManager.getDefaultSharedPreferences(this);
    this.j = this.i.edit();
    Map localMap = this.i.getAll();
    if (!localMap.containsKey("HK_SETTING_QUOTE_COLOR"))
    {
      this.b.setText("红涨绿跌");
      if (localMap.containsKey("HK_SETTING_TRADE_CONFIRM")) {
        break label154;
      }
      this.d.setChecked(true);
      label70:
      if (!bk.a()) {
        break label198;
      }
      if (localMap.containsKey("HK_SETTING_SHOW_TIP")) {
        break label176;
      }
      this.f.setChecked(true);
    }
    for (;;)
    {
      this.e.setChecked(this.i.getBoolean("HK_SETTING_TRADE_COST", false));
      return;
      if (this.i.getBoolean("HK_SETTING_QUOTE_COLOR", true))
      {
        this.b.setText("红涨绿跌");
        break;
      }
      this.b.setText("红跌绿涨");
      break;
      label154:
      this.d.setChecked(this.i.getBoolean("HK_SETTING_TRADE_CONFIRM", true));
      break label70;
      label176:
      this.f.setChecked(this.i.getBoolean("HK_SETTING_SHOW_TIP", true));
      continue;
      label198:
      this.f.setChecked(false);
      this.f.setOnClickListener(new bt(this));
    }
  }
  
  private void b()
  {
    int k = 1;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("涨跌颜色风格选择");
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "红涨绿跌";
    arrayOfString[1] = "红跌绿涨";
    if (!"红涨绿跌".equals(this.b.getText().toString())) {}
    for (;;)
    {
      localBuilder.setSingleChoiceItems(arrayOfString, k, new bv(this, arrayOfString));
      localBuilder.create().show();
      return;
      k = 0;
    }
  }
  
  private void c()
  {
    this.c.setOnClickListener(new bw(this));
    this.g.setOnClickListener(new bx(this));
    this.h.setOnClickListener(new by(this));
  }
  
  private void d()
  {
    this.b = ((TextView)findViewById(2131560839));
    this.d = ((ToggleButton)findViewById(2131560841));
    this.e = ((ToggleButton)findViewById(2131560842));
    this.f = ((ToggleButton)findViewById(2131560844));
    this.g = ((RelativeLayout)findViewById(2131560846));
    this.h = ((RelativeLayout)findViewById(2131560847));
    this.c = ((RelativeLayout)findViewById(2131560837));
    this.a = ((DzhHeader)findViewById(2131558643));
    this.a.a(this, this);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "委托设置";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903499);
    d();
    c();
    a();
    super.init(paramBundle);
  }
  
  public void onDestroy()
  {
    this.j.putBoolean("HK_SETTING_QUOTE_COLOR", "红涨绿跌".equals(this.b.getText().toString()));
    this.j.putBoolean("HK_SETTING_TRADE_CONFIRM", this.d.isChecked());
    this.j.putBoolean("HK_SETTING_TRADE_COST", this.e.isChecked());
    if (bk.a()) {
      this.j.putBoolean("HK_SETTING_SHOW_TIP", this.f.isChecked());
    }
    this.j.commit();
    super.onDestroy();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\HKSetting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */