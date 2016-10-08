package com.android.dazhihui.ui.screen.stock;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public abstract class qg
{
  public int a;
  public int b;
  public boolean c = false;
  
  public qg(int paramInt)
  {
    this.b = paramInt;
    this.a = (Integer.parseInt(new SimpleDateFormat("HHmmssSSS", Locale.getDefault()).format(new Date())) & new Random().nextInt());
  }
  
  public abstract boolean a();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\qg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */