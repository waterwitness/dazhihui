package com.android.dazhihui.ui.delegate.newtrade.screen;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.g;
import com.android.dazhihui.a.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.newtrade.a.a;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.ai;
import com.android.dazhihui.ui.screen.d;
import java.util.Hashtable;
import java.util.Vector;

public class b
  extends ai
  implements v, com.android.dazhihui.ui.a.k, d
{
  private Runnable a = new c(this);
  long b;
  Handler c = new Handler();
  private Vector<Hashtable<String, String>> d = new Vector();
  
  public void a() {}
  
  public void a(com.android.dazhihui.a.b.h paramh, boolean paramBoolean)
  {
    if (!a.a()) {}
    do
    {
      return;
      sendRequest(paramh);
    } while ((!paramBoolean) || (getActivity() != com.android.dazhihui.b.b.a().f()));
    m().show();
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
    if (isAdded())
    {
      ((BaseActivity)getActivity()).unRegisterTouchOrClickListener(this);
      g.a().b(this);
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if ((isAdded()) && (m().isShowing())) {
      m().dismiss();
    }
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if ((isAdded()) && (m().isShowing())) {
      m().dismiss();
    }
  }
  
  public void i()
  {
    if (isAdded())
    {
      ((BaseActivity)getActivity()).registerTouchOrClickListener(this);
      g.a().a(this);
    }
  }
  
  public void j()
  {
    com.android.dazhihui.ui.delegate.b.k.a(getActivity()).c();
  }
  
  public void j(boolean paramBoolean)
  {
    if ((paramBoolean) && (System.currentTimeMillis() - this.b > 5000L))
    {
      if (o.r()) {
        com.android.dazhihui.ui.a.h.a().b(false);
      }
      this.b = System.currentTimeMillis();
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if ((isAdded()) && (m().isShowing())) {
      m().dismiss();
    }
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    ((BaseActivity)getActivity()).registerTouchOrClickListener(this);
    g.a().a(this);
    com.android.dazhihui.ui.a.h.a().a(this);
  }
  
  public void onDestroy()
  {
    ((BaseActivity)getActivity()).unRegisterTouchOrClickListener(this);
    g.a().b(this);
    com.android.dazhihui.ui.a.h.a().a(null);
    super.onDestroy();
  }
  
  public void show()
  {
    super.show();
    this.c.postDelayed(this.a, 100L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\screen\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */