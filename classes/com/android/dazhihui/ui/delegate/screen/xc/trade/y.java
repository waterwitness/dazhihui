package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.g;

public class y
  extends Dialog
{
  private String a;
  private String b;
  private TextView c;
  private TextView d;
  private aa e;
  private String[] f;
  private LinearLayout g;
  
  public y(Context paramContext, String[] paramArrayOfString, String paramString1, String paramString2)
  {
    super(paramContext);
    this.f = paramArrayOfString;
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public void a()
  {
    this.g = ((LinearLayout)findViewById(2131558785));
    this.c = ((TextView)findViewById(2131558787));
    this.d = ((TextView)findViewById(2131558786));
    this.c.setText(this.a);
    this.d.setText(this.b);
    this.c.setOnClickListener(new ab(this, null));
    this.d.setOnClickListener(new ab(this, null));
    b();
    Window localWindow = getWindow();
    WindowManager.LayoutParams localLayoutParams = localWindow.getAttributes();
    localLayoutParams.width = ((int)(g.a().m() * 0.9D));
    localWindow.setAttributes(localLayoutParams);
    localWindow.setBackgroundDrawableResource(2131493678);
  }
  
  void a(aa paramaa)
  {
    this.e = paramaa;
  }
  
  public void b()
  {
    if (this.f != null)
    {
      int j = this.f.length;
      int i = 0;
      while (i < j)
      {
        TextView localTextView = new TextView(getContext());
        localTextView.setTextSize(18.0F);
        localTextView.setTextColor(-16776961);
        localTextView.getPaint().setFlags(8);
        localTextView.getPaint().setAntiAlias(true);
        localTextView.setText(this.f[i]);
        localTextView.setClickable(true);
        localTextView.setOnClickListener(new z(this, i));
        localTextView.setPadding(20, 10, 20, 0);
        this.g.addView(localTextView);
        i += 1;
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2130903089);
    a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */