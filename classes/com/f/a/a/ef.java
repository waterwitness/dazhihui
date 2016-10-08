package com.f.a.a;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ef
{
  private static ef c;
  private Dialog a;
  private View b;
  
  public static ef a()
  {
    if (c == null) {
      c = new ef();
    }
    return c;
  }
  
  public void a(Context paramContext, String paramString, View.OnClickListener paramOnClickListener)
  {
    a(paramContext, paramString, null, null, paramOnClickListener, null);
  }
  
  public void a(Context paramContext, String paramString1, String paramString2)
  {
    a(paramContext, paramString1, paramString2, null);
  }
  
  public void a(Context paramContext, String paramString1, String paramString2, View.OnClickListener paramOnClickListener)
  {
    if (paramContext == null) {
      return;
    }
    this.b = LayoutInflater.from(paramContext).inflate(bp.ab(), null);
    ((ProgressBar)this.b.findViewById(bp.bk())).setVisibility(8);
    Button localButton = (Button)this.b.findViewById(bp.bi());
    if (!localButton.isShown()) {
      localButton.setVisibility(0);
    }
    if (!localButton.isEnabled()) {
      localButton.setEnabled(true);
    }
    localButton.setText(paramString1);
    if (paramOnClickListener == null) {
      localButton.setOnClickListener(new o(this));
    }
    for (;;)
    {
      ((TextView)this.b.findViewById(bp.bl())).setText(paramString2);
      if (this.a == null) {
        this.a = new Dialog(paramContext, bp.et());
      }
      this.a.setContentView(this.b);
      this.a.setCancelable(false);
      this.a.show();
      return;
      localButton.setOnClickListener(paramOnClickListener);
    }
  }
  
  public void a(Context paramContext, String paramString1, String paramString2, String paramString3, View.OnClickListener paramOnClickListener1, View.OnClickListener paramOnClickListener2)
  {
    if (paramContext == null) {
      return;
    }
    this.b = LayoutInflater.from(paramContext).inflate(bp.ac(), null);
    Button localButton = (Button)this.b.findViewById(bp.bg());
    if (paramString2 != null) {
      localButton.setText(paramString2);
    }
    localButton.setOnClickListener(paramOnClickListener1);
    paramString2 = (Button)this.b.findViewById(bp.bi());
    if (paramString3 != null) {
      paramString2.setText(paramString3);
    }
    if (paramOnClickListener2 != null) {
      paramString2.setOnClickListener(paramOnClickListener2);
    }
    for (;;)
    {
      ((TextView)this.b.findViewById(bp.bl())).setText(paramString1);
      if (this.a == null) {
        this.a = new Dialog(paramContext, bp.et());
      }
      this.a.setContentView(this.b);
      this.a.setCancelable(false);
      this.a.show();
      return;
      paramString2.setOnClickListener(new r(this));
    }
  }
  
  public void a(Context paramContext, boolean paramBoolean, View.OnClickListener paramOnClickListener)
  {
    if (paramContext == null) {
      return;
    }
    if (this.a == null) {
      this.a = new Dialog(paramContext, bp.et());
    }
    this.b = LayoutInflater.from(paramContext).inflate(bp.ab(), null);
    this.a.setContentView(this.b);
    paramContext = (Button)this.b.findViewById(bp.bi());
    if (!paramBoolean)
    {
      paramContext.setEnabled(false);
      paramContext.setVisibility(4);
    }
    paramContext.setTextColor(bp.t());
    paramContext.setOnClickListener(paramOnClickListener);
    ((ProgressBar)this.b.findViewById(bp.bk())).setVisibility(0);
    this.a.setCancelable(false);
    this.a.show();
  }
  
  public void b()
  {
    if ((this.a != null) && (this.a.isShowing()))
    {
      this.a.dismiss();
      this.a = null;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ef.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */