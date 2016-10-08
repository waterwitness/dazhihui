package com.android.dazhihui.ui.delegate.newtrade.screen;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.k;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.screen.y;
import java.util.Hashtable;
import java.util.Vector;

public abstract class NewTradeBaseActivity
  extends AdvertBaseActivity
  implements v
{
  private final int a = 0;
  private final int b = 1;
  protected y c;
  long d;
  private Handler e = new a(this);
  private Vector<Hashtable<String, String>> f = new Vector();
  
  private void a(int paramInt)
  {
    Message localMessage = Message.obtain(this.e);
    localMessage.what = paramInt;
    this.e.sendMessage(localMessage);
  }
  
  public void a(com.android.dazhihui.a.b.h paramh, boolean paramBoolean)
  {
    if (!com.android.dazhihui.ui.delegate.newtrade.a.a.a()) {}
    do
    {
      return;
      sendRequest(paramh);
    } while ((!paramBoolean) || (this != b.a().f()));
    a(0);
  }
  
  protected void changeLookFace(y paramy) {}
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    k.a(this).c();
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    k.a(this).c();
    try
    {
      boolean bool = super.dispatchTouchEvent(paramMotionEvent);
      return bool;
    }
    catch (Exception paramMotionEvent)
    {
      paramMotionEvent.printStackTrace();
    }
    return false;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    a(1);
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    a(1);
  }
  
  protected void init(Bundle paramBundle)
  {
    com.android.dazhihui.a.g.a().a(this);
  }
  
  public void j(boolean paramBoolean)
  {
    if ((paramBoolean) && (System.currentTimeMillis() - this.d > 5000L))
    {
      if (o.r()) {
        com.android.dazhihui.ui.a.h.a().b(false);
      }
      this.d = System.currentTimeMillis();
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    a(1);
  }
  
  public void onDestroy()
  {
    com.android.dazhihui.a.g.a().b(this);
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void setLookFace()
  {
    y localy = com.android.dazhihui.g.a().b();
    if ((localy != null) && (localy != this.c))
    {
      changeLookFace(localy);
      this.c = localy;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\screen\NewTradeBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */