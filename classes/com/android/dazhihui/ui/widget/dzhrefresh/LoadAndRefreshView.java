package com.android.dazhihui.ui.widget.dzhrefresh;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class LoadAndRefreshView
  extends BaseRefreshView
{
  protected DzhLoading d;
  protected TextView e;
  
  public LoadAndRefreshView(Context paramContext)
  {
    super(paramContext);
  }
  
  public LoadAndRefreshView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected View a(LayoutInflater paramLayoutInflater)
  {
    paramLayoutInflater = paramLayoutInflater.inflate(2130903386, this, false);
    this.d = ((DzhLoading)paramLayoutInflater.findViewById(2131560234));
    this.e = ((TextView)paramLayoutInflater.findViewById(2131558837));
    return paramLayoutInflater;
  }
  
  protected void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.d.a(paramInt2);
    if (paramInt3 == 1) {
      this.e.setText(2131165184);
    }
    while (paramInt3 != 2) {
      return;
    }
    this.e.setText(q.a().b());
  }
  
  protected void b(boolean paramBoolean, int paramInt)
  {
    this.d.b();
    if ((paramInt == 1) || (paramInt == 2) || (paramInt == 3))
    {
      this.d.a(100);
      String str;
      if (paramInt == 1) {
        str = "刷新成功";
      }
      for (;;)
      {
        this.e.setText(str);
        postDelayed(new p(this, paramBoolean), 1000L);
        return;
        if (paramInt == 2) {
          str = "刷新失败";
        } else {
          str = "完成刷新";
        }
      }
    }
    b(paramBoolean);
  }
  
  protected void h()
  {
    this.d.a(0);
    this.e.setText(2131165184);
  }
  
  protected void i()
  {
    this.d.a();
    this.e.setText(2131165185);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dzhrefresh\LoadAndRefreshView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */