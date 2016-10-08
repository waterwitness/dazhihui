package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class MessageCenterSettingScreen
  extends BaseActivity
  implements View.OnClickListener, cp, cs
{
  private DzhHeader a;
  private ImageView b;
  private ImageView c;
  private ImageView d;
  private ImageView e;
  private ImageView f;
  private g g = g.a();
  
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
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (ja.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.a == null);
      this.a.a(paramy);
      return;
    } while (this.a == null);
    this.a.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = getString(2131166147);
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  protected void init(Bundle paramBundle)
  {
    setContentView(2130903306);
    this.a = ((DzhHeader)findViewById(2131558567));
    this.c = ((ImageView)findViewById(2131559973));
    this.d = ((ImageView)findViewById(2131559971));
    this.e = ((ImageView)findViewById(2131559975));
    this.f = ((ImageView)findViewById(2131559977));
    this.b = ((ImageView)findViewById(2131559969));
    this.a.a(this, this);
    this.a.setOnHeaderButtonClickListener(this);
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    this.b.setOnClickListener(this);
    if (this.g.e())
    {
      this.c.setImageResource(2130838594);
      if (!this.g.d()) {
        break label230;
      }
      this.d.setImageResource(2130838594);
      label179:
      if (!this.g.f()) {
        break label242;
      }
      this.e.setImageResource(2130838594);
    }
    for (;;)
    {
      if (!this.g.g()) {
        break label254;
      }
      this.f.setImageResource(2130838594);
      return;
      this.c.setImageResource(2130838593);
      break;
      label230:
      this.d.setImageResource(2130838593);
      break label179;
      label242:
      this.e.setImageResource(2130838593);
    }
    label254:
    this.f.setImageResource(2130838593);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.b) {
      if (this.g.c())
      {
        this.g.a(false);
        this.b.setImageResource(2130838593);
        g.a().m(0);
      }
    }
    do
    {
      return;
      this.g.a(true);
      this.b.setImageResource(2130838594);
      g.a().m(1);
      return;
      if (paramView == this.c)
      {
        if (this.g.e())
        {
          this.g.c(false);
          this.c.setImageResource(2130838593);
          return;
        }
        this.g.c(true);
        this.c.setImageResource(2130838594);
        return;
      }
      if (paramView == this.d)
      {
        if (this.g.d())
        {
          this.g.b(false);
          this.d.setImageResource(2130838593);
          return;
        }
        this.g.b(true);
        this.d.setImageResource(2130838594);
        return;
      }
      if (paramView == this.e)
      {
        if (this.g.f())
        {
          this.g.d(false);
          this.e.setImageResource(2130838593);
          return;
        }
        this.g.d(true);
        this.e.setImageResource(2130838594);
        return;
      }
    } while (paramView != this.f);
    if (this.g.g())
    {
      this.g.e(false);
      this.f.setImageResource(2130838593);
      return;
    }
    this.g.e(true);
    this.f.setImageResource(2130838594);
  }
  
  protected void onStop()
  {
    g.a().ag();
    super.onStop();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\MessageCenterSettingScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */