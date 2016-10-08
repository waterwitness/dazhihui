package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.ad;
import android.support.v4.app.at;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;

public class BBSMoreListActivity
  extends BaseActivity
{
  private cq a;
  private TextView b;
  private View c;
  private String d;
  private String e;
  private View f;
  private RelativeLayout g;
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (r.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.f == null);
      this.f.setBackgroundColor(getResources().getColor(2131493542));
      this.g.setBackgroundColor(getResources().getColor(2131493291));
      return;
    } while (this.f == null);
    this.f.setBackgroundColor(getResources().getColor(2131493605));
    this.g.setBackgroundColor(getResources().getColor(2131493599));
  }
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903053);
    this.f = findViewById(2131558584);
    this.g = ((RelativeLayout)findViewById(2131558585));
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.d = paramBundle.getString("code");
      this.e = paramBundle.getString("name");
    }
    this.b = ((TextView)findViewById(2131558587));
    if (!TextUtils.isEmpty(this.e)) {
      this.b.setText(this.e + "吧-全部热帖");
    }
    this.c = findViewById(2131558586);
    this.c.setOnClickListener(new q(this));
    this.a = ((cq)cq.a(this.d, this.e));
    getSupportFragmentManager().a().a(2131558597, this.a, "FragmentMoreListBBS").b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\BBSMoreListActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */