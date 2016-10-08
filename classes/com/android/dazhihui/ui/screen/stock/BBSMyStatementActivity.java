package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;

public class BBSMyStatementActivity
  extends BaseActivity
  implements View.OnClickListener
{
  private View a;
  private ViewPager b;
  private TextView c;
  private TextView d;
  private String[] e = { "我发表的", "回复我的" };
  private RelativeLayout f;
  
  public void a(int paramInt)
  {
    if (paramInt == 0)
    {
      this.c.setSelected(true);
      this.d.setSelected(false);
      n.a("", 20085);
    }
    while (paramInt != 1) {
      return;
    }
    this.c.setSelected(false);
    this.d.setSelected(true);
    n.a("", 20086);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {}
    switch (t.a[paramy.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.f.setBackgroundColor(getResources().getColor(2131493291));
      return;
    }
    this.f.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903054);
    int i = getIntent().getIntExtra("type", 0);
    this.f = ((RelativeLayout)findViewById(2131558585));
    this.a = findViewById(2131558586);
    this.c = ((TextView)findViewById(2131558598));
    this.d = ((TextView)findViewById(2131558599));
    this.b = ((ViewPager)findViewById(2131558600));
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.b.setAdapter(new u(this, getSupportFragmentManager(), this.e));
    this.b.setOnPageChangeListener(new s(this));
    this.a.setOnClickListener(this);
    if (i == 1)
    {
      a(1);
      this.b.setCurrentItem(1);
    }
    for (;;)
    {
      n.a("", 20084);
      return;
      a(0);
    }
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
    case 2131558598: 
      this.b.setCurrentItem(0);
      return;
    }
    this.b.setCurrentItem(1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\BBSMyStatementActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */