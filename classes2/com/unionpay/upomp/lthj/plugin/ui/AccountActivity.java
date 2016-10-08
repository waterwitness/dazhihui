package com.unionpay.upomp.lthj.plugin.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.f.a.a.ar;
import com.f.a.a.as;
import com.f.a.a.at;
import com.f.a.a.au;
import com.f.a.a.av;
import com.f.a.a.aw;
import com.f.a.a.ay;
import com.f.a.a.az;
import com.f.a.a.b;
import com.f.a.a.bb;
import com.f.a.a.bd;
import com.f.a.a.bp;
import com.f.a.a.bs;
import com.f.a.a.cd;
import com.f.a.a.d;
import com.f.a.a.ec;
import com.f.a.a.ef;
import com.f.a.a.ei;
import com.f.a.a.es;
import com.f.a.a.i;
import com.f.a.a.u;
import com.f.a.a.w;
import com.f.a.a.y;
import com.unionpay.upomp.lthj.widget.CustomInputView;
import com.unionpay.upomp.lthj.widget.LineFrameView;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public class AccountActivity
  extends BaseActivity
  implements View.OnClickListener, UIResponseListener
{
  public int a = 60;
  public TimerTask aaTimerTask;
  private View.OnClickListener b = new ar(this);
  private Button c;
  private Button d;
  private Button e;
  private Button f;
  private CustomInputView g;
  private CustomInputView h;
  private CustomInputView i;
  private EditText j;
  private Button k;
  private EditText l;
  private Button m;
  private Handler n = new bd(this);
  
  private void b()
  {
    Intent localIntent = new Intent(this, BankCardInfoActivity.class);
    localIntent.addFlags(67108864);
    a().changeSubActivity(localIntent);
  }
  
  private void c()
  {
    a(getString(bp.j()), new at(this));
    setContentView(bp.ad());
    LineFrameView localLineFrameView1 = (LineFrameView)findViewById(bp.by());
    LineFrameView localLineFrameView2 = (LineFrameView)findViewById(bp.bx());
    LineFrameView localLineFrameView3 = (LineFrameView)findViewById(bp.bp());
    LineFrameView localLineFrameView4 = (LineFrameView)findViewById(bp.bA());
    localLineFrameView1.a(u.a().A);
    localLineFrameView2.a(u.a().G);
    localLineFrameView3.a(ec.f(u.a().B.toString()));
    this.e = ((Button)findViewById(bp.bD()));
    if ((u.a().D == null) || (u.a().D.size() == 0))
    {
      localLineFrameView4.a(bp.eq());
      this.e.setText(getString(bp.ep()));
      this.e.setOnClickListener(new as(this));
    }
    for (;;)
    {
      this.c = ((Button)findViewById(bp.bB()));
      this.c.setOnClickListener(this);
      this.d = ((Button)findViewById(bp.bC()));
      this.d.setOnClickListener(this);
      return;
      localLineFrameView4.a(u.a().D.size() + "张(上限" + u.a().a.c() + "张)");
      this.e.setOnClickListener(this);
    }
  }
  
  private void d()
  {
    a(getString(bp.j()), this.b);
    setContentView(bp.af());
    this.g = ((CustomInputView)findViewById(bp.bG()));
    this.h = ((CustomInputView)findViewById(bp.bF()));
    this.i = ((CustomInputView)findViewById(bp.bE()));
    b localb = new b(9);
    this.g.b().setOnTouchListener(localb);
    this.g.b().setOnFocusChangeListener(localb);
    localb = new b(8);
    this.h.b().setOnTouchListener(localb);
    this.h.b().setOnFocusChangeListener(localb);
    localb = new b(7);
    this.i.b().setOnTouchListener(localb);
    this.i.b().setOnFocusChangeListener(localb);
    this.j = ((EditText)findViewById(bp.bj()));
    ((LineFrameView)findViewById(bp.bp())).a(ec.f(u.a().B.toString()));
    this.f = ((Button)findViewById(bp.bg()));
    this.f.setOnClickListener(this);
    this.m = ((Button)findViewById(bp.bu()));
    this.m.setOnClickListener(new az(this));
  }
  
  private void e()
  {
    a(getString(bp.j()), this.b);
    setContentView(bp.ae());
    this.l = ((EditText)findViewById(bp.bH()));
    this.j = ((EditText)findViewById(bp.bj()));
    ((LineFrameView)findViewById(bp.bp())).a(u.a().B);
    this.k = ((Button)findViewById(bp.bg()));
    this.k.setOnClickListener(this);
    this.m = ((Button)findViewById(bp.bu()));
    this.m.setOnClickListener(new ay(this));
  }
  
  public void errorCallBack(String paramString)
  {
    ec.a(this, paramString);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.c) {
      d();
    }
    do
    {
      do
      {
        return;
        if (paramView == this.d)
        {
          e();
          return;
        }
        if (paramView == this.e)
        {
          b();
          return;
        }
        if (paramView != this.f) {
          break;
        }
      } while ((!cd.d(this, this.g.b())) || (!cd.e(this, this.h.b())) || (!cd.c(this, this.i.b())) || (!cd.a(this)) || (!cd.a(this, this.j, this.m)));
      bs.b(this, this, this.j.getText().toString());
      return;
    } while ((paramView != this.k) || (!cd.a(this, this.l)) || (!cd.a(this, this.j, this.m)));
    bs.c(this, this, this.l.getText().toString(), this.j.getText().toString());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    c();
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.aaTimerTask != null)
    {
      this.aaTimerTask.cancel();
      this.aaTimerTask = null;
    }
  }
  
  public void processRefreshConn()
  {
    if (this.aaTimerTask == null)
    {
      Timer localTimer = new Timer();
      this.aaTimerTask = new bb(this);
      localTimer.schedule(this.aaTimerTask, 0L, 'Ϩ');
    }
  }
  
  public void responseCallBack(es parames)
  {
    if ((parames == null) || (parames.s() == null)) {}
    while (isFinishing()) {
      return;
    }
    int i1 = parames.j();
    int i2 = Integer.parseInt(parames.s());
    if ("5309".equals(parames.s()))
    {
      parames = getString(bp.ez());
      ef.a().a(this, parames, new aw(this));
      return;
    }
    switch (i1)
    {
    case 8198: 
    case 8199: 
    default: 
      return;
    case 8196: 
      if (i2 == 0)
      {
        u.a().C.setLength(0);
        u.a().C.append(u.a().e.d);
        u.a().e.d.setLength(0);
        ef.a().a(this, getString(bp.p()), getString(bp.es()), new av(this));
        return;
      }
      ec.a(this, parames.t(), i2);
      d();
      return;
    case 8197: 
      if (i2 == 0)
      {
        parames = (w)parames;
        u.a().B.setLength(0);
        u.a().B.append(parames.b());
        ef.a().a(this, getString(bp.p()), getString(bp.er()), new i(this));
        return;
      }
      ec.a(this, parames.t(), i2);
      e();
      return;
    }
    parames = (ei)parames;
    if (i2 == 0)
    {
      Toast localToast = Toast.makeText(this, getString(bp.dx()), 1);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      u.a().y.delete(0, u.a().y.length());
      u.a().y.append(parames.c());
      processRefreshConn();
      return;
    }
    parames = Toast.makeText(this, getString(bp.dy()) + parames.t() + ",错误码为：" + i2, 1);
    parames.setGravity(17, 0, 0);
    parames.show();
    this.m.setEnabled(true);
    this.m.setText(getString(bp.ee()));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\AccountActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */