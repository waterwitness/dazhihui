package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils.TruncateAt;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class gb
  extends LinearLayout
{
  private TextView b;
  private TextView c;
  private TextView d;
  private TextView e;
  
  public gb(IndexTopWidget paramIndexTopWidget, Context paramContext)
  {
    super(paramContext);
    a();
  }
  
  private void a()
  {
    setOrientation(0);
    this.b = new TextView(getContext());
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(0, -1, 1.0F);
    localLayoutParams.leftMargin = getResources().getDimensionPixelSize(2131230774);
    this.b.setGravity(19);
    this.b.setTextSize(2, 15.0F);
    this.b.setTextColor(-4932146);
    this.b.setSingleLine();
    this.b.setEllipsize(TextUtils.TruncateAt.END);
    localLayoutParams.gravity = 16;
    addView(this.b, localLayoutParams);
    this.c = new TextView(getContext());
    localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    this.c.setGravity(19);
    this.c.setTextSize(2, 15.0F);
    localLayoutParams.leftMargin = getResources().getDimensionPixelSize(2131230799);
    localLayoutParams.gravity = 16;
    addView(this.c, localLayoutParams);
    this.d = new TextView(getContext());
    this.d.setVisibility(8);
    localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    this.d.setGravity(19);
    this.d.setTextSize(2, 15.0F);
    localLayoutParams.leftMargin = getResources().getDimensionPixelSize(2131230799);
    localLayoutParams.gravity = 16;
    addView(this.d, localLayoutParams);
    this.e = new TextView(getContext());
    localLayoutParams = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams.leftMargin = getResources().getDimensionPixelSize(2131230799);
    localLayoutParams.rightMargin = getResources().getDimensionPixelSize(2131230799);
    localLayoutParams.gravity = 16;
    this.e.setGravity(19);
    this.e.setTextSize(2, 15.0F);
    addView(this.e, localLayoutParams);
  }
  
  public void a(String paramString)
  {
    paramString = IndexTopWidget.a(this.a, paramString);
    this.b.setText(paramString.b);
    int i = IndexTopWidget.a(this.a, paramString, fv.a);
    this.c.setTextColor(i);
    this.c.setText(IndexTopWidget.a(this.a, paramString));
    this.d.setTextColor(i);
    this.d.setText(IndexTopWidget.b(this.a, paramString));
    this.e.setTextColor(i);
    this.e.setText(IndexTopWidget.c(this.a, paramString));
    requestLayout();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */