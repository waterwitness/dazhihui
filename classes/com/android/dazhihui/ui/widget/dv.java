package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import java.lang.ref.WeakReference;

class dv
  extends Handler
{
  int a = 0;
  private boolean b = false;
  private long c;
  private WeakReference<GoldAnimation> d;
  
  public dv(GoldAnimation paramGoldAnimation, int paramInt)
  {
    this.d = new WeakReference(paramGoldAnimation);
    this.c = paramInt;
  }
  
  private void b()
  {
    removeMessages(0);
    sendMessageDelayed(obtainMessage(0), this.c);
  }
  
  private boolean c()
  {
    if (this.d.get() != null)
    {
      this.a += 3;
      if (this.a >= ((GoldAnimation)this.d.get()).c)
      {
        this.a = ((GoldAnimation)this.d.get()).c;
        GoldAnimation.e((GoldAnimation)this.d.get()).setText(String.valueOf(this.a));
        postDelayed(new dw(this), 600L);
        this.a = 0;
        return false;
      }
      GoldAnimation.e((GoldAnimation)this.d.get()).setText(String.valueOf(this.a));
      return true;
    }
    return false;
  }
  
  public void a()
  {
    this.b = false;
    removeMessages(0);
    sendMessage(obtainMessage(0));
  }
  
  public void handleMessage(Message paramMessage)
  {
    if ((!this.b) && (c())) {
      b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */