package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class o
  extends Dialog
{
  public o(Context paramContext)
  {
    this(paramContext, 2131296265);
  }
  
  public o(Context paramContext, int paramInt)
  {
    super(paramContext, paramInt);
    paramContext = LayoutInflater.from(paramContext).inflate(2130903157, null);
    setContentView(paramContext);
    setCanceledOnTouchOutside(false);
    ((Button)paramContext.findViewById(2131558854)).setOnClickListener(new p(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */