package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.a;
import com.android.dazhihui.ui.delegate.b.k;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.AdvertBaseActivity;
import com.android.dazhihui.ui.screen.y;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public abstract class DelegateBaseActivity
  extends AdvertBaseActivity
  implements v
{
  private Toast a;
  private final int b = 0;
  private final int c = 1;
  private Handler d = new z(this);
  private Vector<Hashtable<String, String>> e = new Vector();
  long k;
  protected y l;
  
  private void a(int paramInt)
  {
    Message localMessage = Message.obtain(this.d);
    localMessage.what = paramInt;
    this.d.sendMessage(localMessage);
  }
  
  public void a(com.android.dazhihui.a.b.h paramh, boolean paramBoolean)
  {
    if ((paramh instanceof com.android.dazhihui.a.b.u))
    {
      String str = com.android.dazhihui.ui.delegate.b.g.c(((com.android.dazhihui.a.b.u)paramh).w()[0].e());
      int i = str.indexOf("21004=");
      str = str.substring(i, str.indexOf("\001", i));
      if ((o.r()) && ((paramh instanceof com.android.dazhihui.a.b.u)) && (o.v(str)))
      {
        a.c = this;
        a.d = null;
        a.a = (com.android.dazhihui.a.b.u)paramh;
        a.b = ((com.android.dazhihui.a.b.u)paramh).w()[0].e();
      }
      if ((a.a().k() != 3) && (com.android.dazhihui.a.g.a().o()) && (o.r()))
      {
        removeRequest(paramh);
        a.a().m();
      }
    }
    do
    {
      return;
      sendRequest(paramh);
    } while ((!paramBoolean) || (this != b.a().f()));
    a(0);
  }
  
  public void a(com.android.dazhihui.ui.delegate.b.h paramh, int paramInt)
  {
    if (paramh == null) {}
    do
    {
      return;
      paramh = Arrays.asList(paramh.f());
    } while ((paramh == null) || (this.e.size() < paramInt));
    int i = 0;
    label30:
    if (i < paramh.size())
    {
      if (paramInt + i >= this.e.size()) {
        break label78;
      }
      this.e.set(paramInt + i, paramh.get(i));
    }
    for (;;)
    {
      i += 1;
      break label30;
      break;
      label78:
      this.e.add(paramh.get(i));
    }
  }
  
  public void a(String paramString)
  {
    if ((this == null) || (isFinishing())) {
      return;
    }
    new AlertDialog.Builder(this).setMessage(paramString).setPositiveButton("确定", null).show();
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    new AlertDialog.Builder(this).setTitle(paramString1).setMessage(paramString2).setPositiveButton(paramString3, null).show();
  }
  
  public void a(String paramString, boolean paramBoolean)
  {
    new AlertDialog.Builder(this).setTitle(2131166406).setMessage(paramString).setPositiveButton(2131165363, new ac(this, paramBoolean)).setOnCancelListener(new ab(this, paramBoolean)).show();
  }
  
  public void b(int paramInt)
  {
    if (this != b.a().f()) {
      return;
    }
    if (this.a == null)
    {
      this.a = Toast.makeText(this, "", 0);
      this.a.setGravity(17, 0, 0);
    }
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.a.setText("未从服务器上取到数据请重试！");
    }
    for (;;)
    {
      this.a.show();
      return;
      this.a.setText("  网络连接超时请重试......");
      continue;
      this.a.setText("  正在获取营业部列表请等待......");
      continue;
      this.a.setText("正在查询请等待......");
      continue;
      this.a.setText("没有取到数据 ");
      continue;
      this.a.setText("　　账号密码都必须填写。");
      continue;
      this.a.setText("　　正在登录，请稍候……");
      continue;
      this.a.setText("　　验证码输入错误。");
      continue;
      this.a.setText("    网络异常，请重新登陆......");
      continue;
      this.a.setText("  网络连接异常请重试......");
      continue;
      this.a.setText("  请先输入密码 ...");
    }
  }
  
  public void b(String paramString)
  {
    if ((this == null) || (isFinishing())) {
      return;
    }
    new AlertDialog.Builder(this).setMessage(paramString).setPositiveButton("确定", new aa(this)).show();
  }
  
  public Hashtable<String, String> c(int paramInt)
  {
    int i = this.e.size();
    if ((paramInt >= 0) && (paramInt < i)) {
      return (Hashtable)this.e.get(paramInt);
    }
    if (i > 0) {
      return (Hashtable)this.e.get(i - 1);
    }
    return new Hashtable();
  }
  
  public void c(String paramString)
  {
    new AlertDialog.Builder(this).setTitle(2131166406).setMessage(paramString).setPositiveButton(2131165363, null).show();
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
  
  public void e()
  {
    this.e.clear();
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
    if (paramBoolean)
    {
      Log.d("trade", "DelegateBaseActivity  onNetStatusChange true");
      if (System.currentTimeMillis() - this.k > 5000L)
      {
        e.a().v();
        if (o.r()) {
          a.a().m();
        }
        this.k = System.currentTimeMillis();
      }
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    a(1);
    j(com.android.dazhihui.a.g.a().o());
  }
  
  public void onDestroy()
  {
    com.android.dazhihui.a.g.a().b(this);
    super.onDestroy();
  }
  
  public void setLookFace()
  {
    y localy = com.android.dazhihui.g.a().b();
    if ((localy != null) && (localy != this.l))
    {
      changeLookFace(localy);
      this.l = localy;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\DelegateBaseActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */