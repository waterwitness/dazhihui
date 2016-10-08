package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.GoldAnimation;
import com.android.dazhihui.ui.widget.adv.AdvertView;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.w;

public class RegisterSuccessScreen
  extends AdvertBaseActivity
  implements View.OnClickListener, cp, cs
{
  GoldAnimation a;
  int b = 0;
  private DzhHeader c;
  private TextView d;
  private Button e;
  private String f = "FROM_STOCK";
  private String g;
  private boolean h = false;
  private int i = 0;
  private View j;
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return false;
      finish();
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 4392;
    paramct.p = this;
    if (this.i == 0)
    {
      paramct.d = getResources().getString(2131166396);
      return;
    }
    if ((this.i == 1) || (this.i == 2))
    {
      paramct.d = getResources().getString(2131165410);
      return;
    }
    if (this.i == 3)
    {
      paramct.d = getResources().getString(2131166195);
      return;
    }
    paramct.d = getResources().getString(2131165362);
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  protected void init(Bundle paramBundle) {}
  
  public void onBackPressed()
  {
    super.onBackPressed();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    }
    if (this.i == 0) {
      n.a("", 1321);
    }
    if (this.b > 0)
    {
      this.a.setVisibility(0);
      this.a.a(this.b);
      this.a.setOnBtnClickListener(new qh(this));
      return;
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903248);
    paramBundle = getIntent();
    if (paramBundle != null)
    {
      this.f = paramBundle.getStringExtra("REGISTER_FROM_TYPE");
      this.g = paramBundle.getStringExtra("name");
      this.i = paramBundle.getIntExtra("type", 0);
      this.b = paramBundle.getIntExtra("COINS", 0);
    }
    this.c = ((DzhHeader)findViewById(2131558567));
    this.c.setOnHeaderButtonClickListener(this);
    this.c.a(this, this);
    if ((!TextUtils.isEmpty(this.f)) && (this.f.equals("FROM_LOTTERY"))) {
      this.c.setBackgroundResource(2130838345);
    }
    this.d = ((TextView)findViewById(2131559715));
    paramBundle = (AdvertView)findViewById(2131559626);
    this.e = ((Button)findViewById(2131559717));
    this.a = ((GoldAnimation)findViewById(2131558921));
    TextView localTextView = (TextView)findViewById(2131559713);
    this.j = findViewById(2131559714);
    findViewById(2131559716);
    this.e.setOnClickListener(this);
    if ((TextUtils.isEmpty(this.g)) && (!TextUtils.isEmpty(w.a().f()))) {
      this.g = w.a().f();
    }
    if (this.i == 0)
    {
      this.d.setText(this.g);
      w.a().b(true);
      paramBundle.setAdvCode(108);
      a(paramBundle);
    }
    while ((this.i != 1) && (this.i != 2)) {
      return;
    }
    this.d.setText(this.g);
    localTextView.setText("恭喜你登录成功!");
    w.a().b(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\RegisterSuccessScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */