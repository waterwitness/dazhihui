package com.android.dazhihui.ui.screen.stock.klineindicator;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import com.android.dazhihui.d;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.KlineIndicatorDragListView;
import java.io.PrintStream;
import java.util.ArrayList;

public class SettingKlineIndicator
  extends BaseActivity
  implements View.OnClickListener
{
  d a = null;
  private View b;
  private RelativeLayout c;
  private KlineIndicatorDragListView d;
  private o e;
  private ArrayList<String> f = new ArrayList();
  private String[] g = null;
  private RadioGroup h;
  private RadioButton i;
  private RadioButton j;
  private RadioButton k;
  private ImageView l;
  private ImageView m;
  private ImageView n;
  private ImageView o;
  
  private void a()
  {
    if (d.a().b()) {
      this.m.setImageResource(2130837524);
    }
    while (d.a().c())
    {
      this.o.setImageResource(2130837524);
      return;
      this.m.setImageResource(2130837523);
    }
    this.o.setImageResource(2130837523);
  }
  
  public void a(String paramString)
  {
    System.out.println("name = " + paramString);
    Intent localIntent = null;
    if ("VOL".equals(paramString)) {
      localIntent = new Intent(this, SettingVol.class);
    }
    for (;;)
    {
      if (localIntent != null) {
        startActivity(localIntent);
      }
      return;
      if ("MACD".equals(paramString)) {
        localIntent = new Intent(this, SettingMacd.class);
      } else if ("KDJ".equals(paramString)) {
        localIntent = new Intent(this, SettingKdj.class);
      } else if ("RSI".equals(paramString)) {
        localIntent = new Intent(this, SettingRsi.class);
      } else if ("BIAS".equals(paramString)) {
        localIntent = new Intent(this, SettingBias.class);
      } else if ("CCI".equals(paramString)) {
        localIntent = new Intent(this, SettingCci.class);
      } else if ("W&R".equals(paramString)) {
        localIntent = new Intent(this, SettingWr.class);
      } else if ("BOLL".equals(paramString)) {
        localIntent = new Intent(this, SettingBoll.class);
      } else if ("DMA".equals(paramString)) {
        localIntent = new Intent(this, SettingDma.class);
      } else if ("MA".equals(paramString)) {
        localIntent = new Intent(this, SettingMa.class);
      }
    }
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (n.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.c.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.c.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903423);
    this.c = ((RelativeLayout)findViewById(2131558585));
    this.b = findViewById(2131558586);
    this.b.setOnClickListener(this);
    this.h = ((RadioGroup)findViewById(2131560415));
    this.i = ((RadioButton)findViewById(2131560416));
    this.j = ((RadioButton)findViewById(2131560417));
    this.k = ((RadioButton)findViewById(2131560418));
    if (StockVo.getExRights() == 0) {
      this.h.check(this.i.getId());
    }
    for (;;)
    {
      this.h.setOnCheckedChangeListener(new m(this));
      this.l = ((ImageView)findViewById(2131560420));
      this.m = ((ImageView)findViewById(2131560421));
      this.n = ((ImageView)findViewById(2131560423));
      this.o = ((ImageView)findViewById(2131560424));
      this.l.setOnClickListener(this);
      this.m.setOnClickListener(this);
      this.n.setOnClickListener(this);
      this.o.setOnClickListener(this);
      this.d = ((KlineIndicatorDragListView)findViewById(2131559448));
      this.a = d.a();
      if (this.a != null) {
        break;
      }
      return;
      if (StockVo.getExRights() == 1) {
        this.h.check(this.j.getId());
      } else {
        this.h.check(this.k.getId());
      }
    }
    this.g = this.a.g();
    this.f.clear();
    paramBundle = this.g;
    int i2 = paramBundle.length;
    int i1 = 0;
    while (i1 < i2)
    {
      Object localObject = paramBundle[i1];
      this.f.add(localObject);
      i1 += 1;
    }
    this.e = new o(this, this);
    this.d.setAdapter(this.e);
    a();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558586: 
      finish();
      return;
    case 2131560420: 
      a("MA");
      return;
    case 2131560421: 
      if (d.a().b())
      {
        d.a().a(false);
        this.m.setImageResource(2130837523);
        return;
      }
      d.a().a(true);
      this.m.setImageResource(2130837524);
      return;
    case 2131560423: 
      startActivity(new Intent(this, SettingGap.class));
      return;
    }
    if (d.a().c())
    {
      d.a().b(false);
      this.o.setImageResource(2130837523);
      return;
    }
    d.a().b(true);
    this.o.setImageResource(2130837524);
  }
  
  protected void onPause()
  {
    this.a = d.a();
    if (this.a == null) {
      return;
    }
    int i1 = 0;
    while (i1 < this.f.size())
    {
      this.g[i1] = ((String)this.f.get(i1));
      i1 += 1;
    }
    this.a.a(this.g);
    super.onPause();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\klineindicator\SettingKlineIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */