package com.android.dazhihui.ui.delegate.screen;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.a.e;
import com.android.dazhihui.ui.delegate.a;
import com.android.dazhihui.ui.delegate.b.k;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.screen.BaseActivity;
import com.android.dazhihui.ui.screen.ai;
import com.android.dazhihui.ui.screen.d;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

public class ad
  extends ai
  implements v, d
{
  long a;
  Handler b = new Handler();
  private Runnable c = new ae(this);
  private Vector<Hashtable<String, String>> d = new Vector();
  
  public void a()
  {
    if (isAdded())
    {
      ((BaseActivity)getActivity()).registerTouchOrClickListener(this);
      com.android.dazhihui.a.g.a().a(this);
    }
  }
  
  public void a(int paramInt)
  {
    if (getActivity() != b.a().f()) {
      return;
    }
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      localToast = Toast.makeText(getActivity(), "未从服务器上取到数据请重试！", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    case 1: 
      localToast = Toast.makeText(getActivity(), "  网络连接超时请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    case 2: 
      localToast = Toast.makeText(getActivity(), "  正在获取营业部列表请等待......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    case 3: 
      localToast = Toast.makeText(getActivity(), "正在查询请等待......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    case 4: 
      localToast = Toast.makeText(getActivity(), "没有取到数据 ", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    case 5: 
      localToast = Toast.makeText(getActivity(), "　　账号密码都必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    case 6: 
      localToast = Toast.makeText(getActivity(), "　　正在登录，请稍候……", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    case 7: 
      localToast = Toast.makeText(getActivity(), "　　验证码输入错误。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    case 8: 
      localToast = Toast.makeText(getActivity(), "    网络异常，请重新登陆......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    Toast localToast = Toast.makeText(getActivity(), "  网络连接异常请重试......", 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  public void a(com.android.dazhihui.a.b.h paramh, boolean paramBoolean)
  {
    if ((paramh instanceof com.android.dazhihui.a.b.u))
    {
      String str = com.android.dazhihui.ui.delegate.b.g.c(((com.android.dazhihui.a.b.u)paramh).w()[0].e());
      int i = str.indexOf("21004=");
      str = str.substring(i + 6, str.indexOf("\001", i));
      if ((o.r()) && ((paramh instanceof com.android.dazhihui.a.b.u)) && (o.v(str)))
      {
        a.c = (BaseActivity)getActivity();
        a.d = this;
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
    } while ((!paramBoolean) || (getActivity() != b.a().f()));
    m().show();
  }
  
  public void a(com.android.dazhihui.ui.delegate.b.h paramh, int paramInt)
  {
    if (paramh == null) {}
    do
    {
      return;
      paramh = Arrays.asList(paramh.f());
    } while ((paramh == null) || (this.d.size() < paramInt));
    int i = 0;
    label30:
    if (i < paramh.size())
    {
      if (paramInt + i >= this.d.size()) {
        break label78;
      }
      this.d.set(paramInt + i, paramh.get(i));
    }
    for (;;)
    {
      i += 1;
      break label30;
      break;
      label78:
      this.d.add(paramh.get(i));
    }
  }
  
  public void a(String paramString)
  {
    new AlertDialog.Builder(getActivity()).setMessage(paramString).setPositiveButton("确定", null).show();
  }
  
  public Hashtable<String, String> b(int paramInt)
  {
    int i = this.d.size();
    if ((paramInt >= 0) && (paramInt < i)) {
      return (Hashtable)this.d.get(paramInt);
    }
    if (i > 0) {
      return (Hashtable)this.d.get(i - 1);
    }
    return new Hashtable();
  }
  
  public void b(String paramString)
  {
    new AlertDialog.Builder(getActivity()).setTitle(2131166406).setMessage(paramString).setPositiveButton(2131165363, null).show();
  }
  
  public void beforeHidden()
  {
    super.beforeHidden();
    if (isAdded())
    {
      ((BaseActivity)getActivity()).unRegisterTouchOrClickListener(this);
      com.android.dazhihui.a.g.a().b(this);
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
  
  public void j()
  {
    k.a(getActivity()).c();
  }
  
  public void j(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      Log.d("trade", "DelegateBaseFragment  onNetStatusChange true");
      if (System.currentTimeMillis() - this.a > 5000L)
      {
        e.a().v();
        if (o.r()) {
          a.a().m();
        }
        this.a = System.currentTimeMillis();
      }
    }
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if ((isAdded()) && (m().isShowing())) {
      m().dismiss();
    }
    j(com.android.dazhihui.a.g.a().o());
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    ((BaseActivity)getActivity()).registerTouchOrClickListener(this);
    com.android.dazhihui.a.g.a().a(this);
  }
  
  public void onDestroy()
  {
    ((BaseActivity)getActivity()).unRegisterTouchOrClickListener(this);
    com.android.dazhihui.a.g.a().b(this);
    super.onDestroy();
  }
  
  public void show()
  {
    super.show();
    this.b.postDelayed(this.c, 100L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */