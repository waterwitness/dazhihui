package com.android.dazhihui.ui.widget.adv;

import com.android.dazhihui.c.a.d;

public abstract class ai
{
  private int a;
  private String b;
  
  public ai(int paramInt)
  {
    this.a = paramInt;
  }
  
  public abstract void a();
  
  public void a(String paramString)
  {
    this.b = paramString;
    a();
  }
  
  public abstract void b();
  
  public void b(String paramString)
  {
    String str = this.a + paramString;
    d locald = d.a();
    locald.a(str, paramString);
    locald.g();
    b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */