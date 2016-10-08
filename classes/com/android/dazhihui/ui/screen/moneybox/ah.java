package com.android.dazhihui.ui.screen.moneybox;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class ah
  extends Dialog
{
  Context a;
  String b;
  String c;
  String d;
  String e;
  View.OnClickListener f;
  View.OnClickListener g;
  
  public ah(Context paramContext, String paramString1, String paramString2)
  {
    super(paramContext, 2131296272);
    this.a = paramContext;
    this.b = paramString1;
    this.c = paramString2;
  }
  
  public void a(String paramString, View.OnClickListener paramOnClickListener)
  {
    this.d = paramString;
    this.f = paramOnClickListener;
  }
  
  public void b(String paramString, View.OnClickListener paramOnClickListener)
  {
    this.e = paramString;
    this.g = paramOnClickListener;
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    requestWindowFeature(1);
    setContentView(2130903321);
    paramBundle = (TextView)findViewById(2131558567);
    TextView localTextView = (TextView)findViewById(2131558579);
    Button localButton1 = (Button)findViewById(2131560066);
    Button localButton2 = (Button)findViewById(2131560067);
    paramBundle.setText("" + this.b);
    localTextView.setText("" + this.c);
    if (this.d != null)
    {
      localButton1.setText("" + this.d);
      localButton1.setOnClickListener(this.f);
      localButton1.setVisibility(0);
    }
    if (this.e != null)
    {
      localButton2.setText("" + this.e);
      localButton2.setOnClickListener(this.g);
      localButton2.setVisibility(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\moneybox\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */