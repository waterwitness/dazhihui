package com.android.dazhihui.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.widget.OverScroller;
import android.widget.Scroller;

@TargetApi(9)
class ms
{
  Scroller a;
  OverScroller b;
  boolean c;
  
  public ms(TouchImageView paramTouchImageView, Context paramContext)
  {
    if (Build.VERSION.SDK_INT < 9)
    {
      this.c = true;
      this.a = new Scroller(paramContext);
      return;
    }
    this.c = false;
    this.b = new OverScroller(paramContext);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if (this.c)
    {
      this.a.fling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
      return;
    }
    this.b.fling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.c)
    {
      this.a.forceFinished(paramBoolean);
      return;
    }
    this.b.forceFinished(paramBoolean);
  }
  
  public boolean a()
  {
    if (this.c) {
      return this.a.isFinished();
    }
    return this.b.isFinished();
  }
  
  public boolean b()
  {
    if (this.c) {
      return this.a.computeScrollOffset();
    }
    this.b.computeScrollOffset();
    return this.b.computeScrollOffset();
  }
  
  public int c()
  {
    if (this.c) {
      return this.a.getCurrX();
    }
    return this.b.getCurrX();
  }
  
  public int d()
  {
    if (this.c) {
      return this.a.getCurrY();
    }
    return this.b.getCurrY();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ms.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */