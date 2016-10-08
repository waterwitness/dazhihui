package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.adv.GifView;

public class UpdateHeaderView
  extends LinearLayout
{
  public Handler a;
  private GifView b;
  private LinearLayout c;
  private LinearLayout d;
  private LinearLayout e;
  private TextView f;
  private m g;
  
  public UpdateHeaderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(2130903577, this);
    a();
    c();
  }
  
  private void c()
  {
    this.b.setImage(2130837624);
  }
  
  public void a()
  {
    this.c = ((LinearLayout)findViewById(2131561268));
    this.b = ((GifView)findViewById(2131561270));
    this.d = ((LinearLayout)findViewById(2131561269));
    this.e = ((LinearLayout)findViewById(2131561271));
    this.f = ((TextView)findViewById(2131561272));
  }
  
  public void a(String paramString)
  {
    this.d.setVisibility(8);
    this.e.setVisibility(0);
    this.f.setText(paramString);
    this.a = new Handler(new l(this));
    this.a.sendEmptyMessageDelayed(0, 1500L);
  }
  
  public void b()
  {
    this.d.setVisibility(0);
    this.e.setVisibility(8);
  }
  
  public void setRefreshListener(m paramm)
  {
    this.g = paramm;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\UpdateHeaderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */