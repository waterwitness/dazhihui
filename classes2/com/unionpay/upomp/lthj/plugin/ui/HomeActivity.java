package com.unionpay.upomp.lthj.plugin.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.f.a.a.ah;
import com.f.a.a.al;
import com.f.a.a.am;
import com.f.a.a.an;
import com.f.a.a.ao;
import com.f.a.a.ap;
import com.f.a.a.au;
import com.f.a.a.b;
import com.f.a.a.bi;
import com.f.a.a.bj;
import com.f.a.a.bk;
import com.f.a.a.bl;
import com.f.a.a.bm;
import com.f.a.a.bn;
import com.f.a.a.bo;
import com.f.a.a.bp;
import com.f.a.a.bq;
import com.f.a.a.bs;
import com.f.a.a.bt;
import com.f.a.a.bu;
import com.f.a.a.bw;
import com.f.a.a.cd;
import com.f.a.a.cl;
import com.f.a.a.cm;
import com.f.a.a.d;
import com.f.a.a.ec;
import com.f.a.a.ef;
import com.f.a.a.ei;
import com.f.a.a.er;
import com.f.a.a.es;
import com.f.a.a.u;
import com.f.a.a.z;
import com.unionpay.upomp.lthj.widget.LineFrameView;
import com.unionpay.upomp.lthj.widget.ValidateCodeView;
import java.util.Timer;
import java.util.TimerTask;

public class HomeActivity
  extends BaseActivity
  implements View.OnClickListener, UIResponseListener
{
  public int a = 60;
  public TimerTask aaTimerTask;
  private final String b = "HomeActivity";
  private Button c;
  private Button d;
  private EditText e;
  private EditText f;
  private Button g;
  private EditText h;
  private EditText i;
  private Button j;
  private ValidateCodeView k;
  private Button l;
  private Button m;
  private EditText n;
  private Button o;
  private EditText p;
  private Button q;
  private View.OnClickListener r = new bu(this);
  private Handler s = new ap(this);
  private StringBuffer t;
  private EditText u;
  private String v;
  private bt w;
  
  private void a(ah paramah)
  {
    a(getString(bp.j()), new an(this));
    setContentView(bp.S());
    Object localObject = (LineFrameView)findViewById(bp.by());
    LineFrameView localLineFrameView1 = (LineFrameView)findViewById(bp.bp());
    LineFrameView localLineFrameView2 = (LineFrameView)findViewById(bp.bn());
    this.p = ((EditText)findViewById(bp.bo()));
    ((LineFrameView)localObject).a(paramah.b());
    localLineFrameView1.a(ec.f(paramah.c()));
    localLineFrameView2.a(paramah.d());
    this.f = ((EditText)findViewById(bp.bw()));
    localObject = new b(8);
    this.f.setOnTouchListener((View.OnTouchListener)localObject);
    this.f.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.u = ((EditText)findViewById(bp.bE()));
    localObject = new b(7);
    this.u.setOnTouchListener((View.OnTouchListener)localObject);
    this.u.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.v = paramah.b();
    this.q = ((Button)findViewById(bp.bg()));
    this.q.setOnClickListener(this);
  }
  
  private void a(bt parambt, boolean paramBoolean)
  {
    if ((paramBoolean) && (!parambt.b().equalsIgnoreCase(ec.d(this)))) {
      ec.c(this, parambt.b());
    }
    u.a().A.setLength(0);
    u.a().A.append(parambt.b());
    u.a().F = parambt.d();
    u.a().G = parambt.e();
    u.a().B.setLength(0);
    u.a().B.append(parambt.c());
    parambt = new Intent(this, PayActivity.class);
    parambt.addFlags(67108864);
    parambt.putExtra("isAcount", true);
    a().changeSubActivity(parambt);
  }
  
  private void b()
  {
    setContentView(bp.N());
    d();
    if (u.a().c.b())
    {
      this.k.setVisibility(0);
      ec.a(this.k);
    }
    this.c = ((Button)findViewById(bp.aB()));
    this.c.setOnClickListener(this);
    this.h = ((EditText)findViewById(bp.bb()));
    this.j = ((Button)findViewById(bp.aD()));
    this.j.setOnClickListener(this);
    this.i = ((EditText)findViewById(bp.bc()));
    if (u.a().x.length() != 0) {
      this.i.setText(ec.f(u.a().x.toString()));
    }
    String str = ec.e(this);
    if ((str != null) || (!"".equals(str)))
    {
      u.a().w.setLength(0);
      u.a().w.append(str);
    }
    if (u.a().w.length() != 0) {
      this.h.setText(ec.g(u.a().w.toString()));
    }
    this.h.addTextChangedListener(new cl(this.h));
    ((Button)findViewById(bp.aM())).setOnClickListener(new bm(this));
  }
  
  private void c()
  {
    setContentView(bp.O());
    d();
    if (u.a().c.a())
    {
      this.k.setVisibility(0);
      ec.a(this.k);
    }
    this.d = ((Button)findViewById(bp.aB()));
    this.d.setOnClickListener(this);
    this.e = ((EditText)findViewById(bp.bv()));
    this.e.setText(ec.d(this));
    this.f = ((EditText)findViewById(bp.bw()));
    b localb = new b(1);
    this.f.setOnFocusChangeListener(localb);
    this.f.setOnTouchListener(localb);
    ((Button)findViewById(bp.aL())).setOnClickListener(new bq(this));
    this.l = ((Button)findViewById(bp.aC()));
    this.l.setOnClickListener(this);
  }
  
  private void d()
  {
    this.k = ((ValidateCodeView)findViewById(bp.df()));
    a(getString(bp.r()), this.r);
    TextView localTextView1 = (TextView)findViewById(bp.aX());
    TextView localTextView2 = (TextView)findViewById(bp.aY());
    TextView localTextView3 = (TextView)findViewById(bp.aZ());
    TextView localTextView4 = (TextView)findViewById(bp.ba());
    this.g = ((Button)findViewById(bp.aO()));
    this.g.setOnClickListener(this);
    localTextView1.setText(u.a().j);
    localTextView2.setText(ec.d(u.a().n));
    localTextView3.setText(u.a().l);
    localTextView4.setText(ec.c(u.a().m));
  }
  
  private void e()
  {
    a(getString(bp.j()), new bo(this));
    setContentView(bp.R());
    this.k = ((ValidateCodeView)findViewById(bp.df()));
    if (u.a().c.e())
    {
      this.k.setVisibility(0);
      ec.a(this.k);
    }
    this.e = ((EditText)findViewById(bp.bv()));
    this.e.setText(ec.d(this));
    this.i = ((EditText)findViewById(bp.bc()));
    this.m = ((Button)findViewById(bp.aB()));
    this.m.setOnClickListener(this);
    this.n = ((EditText)findViewById(bp.bj()));
    this.o = ((Button)findViewById(bp.bu()));
    this.o.setOnClickListener(new bj(this));
  }
  
  public void errorCallBack(String paramString)
  {
    ec.b(this, paramString);
  }
  
  public void onClick(View paramView)
  {
    int i1 = 0;
    if (paramView == this.c) {
      if (cd.b(this, this.h, u.a().w.toString())) {}
    }
    label31:
    label198:
    do
    {
      do
      {
        do
        {
          break label31;
          do
          {
            return;
          } while ((!cd.a(this, this.i, u.a().x.toString())) || (!cd.a(this, this.k)));
          if (this.i.getText().toString().contains("*"))
          {
            z.a("HomeActivity", "mobile has ****");
            this.t = new StringBuffer();
            if (!this.h.getText().toString().contains("*")) {
              break label198;
            }
            this.t.append(u.a().w);
          }
          for (;;)
          {
            new er().a(this, this.t.toString(), this.k.d().toString(), true, this);
            return;
            u.a().x.setLength(0);
            u.a().x.append(this.i.getText().toString());
            break;
            this.t.delete(0, this.t.length());
            this.t.append(this.h.getText().toString());
            while (i1 < this.t.length())
            {
              if (this.t.charAt(i1) == ' ') {
                this.t.deleteCharAt(i1);
              }
              i1 += 1;
            }
          }
          if (paramView != this.d) {
            break;
          }
        } while ((!cd.b(this, this.e)) || (!cd.c(this, this.f)) || (!cd.a(this, this.k)));
        bs.d(this, this, this.e.getText().toString(), this.k.d());
        this.f.setText("");
        return;
        if (paramView == this.g)
        {
          View localView1 = findViewById(bp.aQ());
          View localView2 = findViewById(bp.aP());
          if (localView1.getVisibility() == 8)
          {
            localView1.setVisibility(0);
            localView2.setVisibility(0);
            paramView.setBackgroundResource(bp.u());
            return;
          }
          localView1.setVisibility(8);
          localView2.setVisibility(8);
          paramView.setBackgroundResource(bp.v());
          return;
        }
        if (paramView == this.j)
        {
          if (this.h.getText().toString().contains("*")) {}
          for (;;)
          {
            paramView = new Intent(this, SupportCardActivity.class);
            paramView.putExtra("tranType", "1");
            paramView.addFlags(67108864);
            a().changeSubActivity(paramView);
            return;
            if (this.h.getText().length() >= 19)
            {
              paramView = new StringBuffer();
              paramView.append(this.h.getText().toString());
              i1 = 0;
              while (i1 < paramView.length())
              {
                if (paramView.charAt(i1) == ' ') {
                  paramView.deleteCharAt(i1);
                }
                i1 += 1;
              }
              u.a().w.setLength(0);
              u.a().w.append(paramView);
              paramView.setLength(0);
            }
          }
        }
        if (paramView == this.l)
        {
          e();
          return;
        }
        if (paramView != this.m) {
          break;
        }
      } while ((!cd.b(this, this.e)) || (!cd.a(this, this.i)) || (!cd.a(this, this.n, this.o)) || (!cd.a(this, this.k)));
      bs.a(this, this, this.e.getText().toString(), this.i.getText().toString(), this.n.getText().toString(), this.k.d());
      return;
    } while ((paramView != this.q) || (!cd.h(this, this.p)) || (!cd.c(this, this.f)) || (!cd.c(this, this.u)) || (!cd.a(this)));
    bs.a(this, this, this.v, this.p.getText().toString());
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    a(getString(bp.i()), new bn(this));
    if (u.a().h)
    {
      c();
      return;
    }
    b();
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
  
  protected void onResume()
  {
    super.onResume();
    if (u.a().x.length() != 0) {
      this.i.setText(ec.f(u.a().x.toString()));
    }
    if (u.a().w.length() != 0) {
      this.h.setText(ec.g(u.a().w.toString()));
    }
    a().aboutEnable(true);
  }
  
  public void processRefreshConn()
  {
    if (this.aaTimerTask == null)
    {
      Timer localTimer = new Timer();
      this.aaTimerTask = new ao(this);
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
    switch (i1)
    {
    }
    label88:
    while (parames.j() != 8200)
    {
      ec.b(this.k);
      return;
      Object localObject1 = (cm)parames;
      Object localObject2;
      if (i2 == 0)
      {
        ef.a().b();
        u.a().w.setLength(0);
        u.a().w.append(this.t.toString());
        u.a().e.a.setLength(0);
        u.a().e.a.append(this.t.toString());
        u.a().c.b(false);
        localObject2 = new Intent(this, PayActivity.class);
        ((Intent)localObject2).setFlags(67108864);
        ((Intent)localObject2).putExtra("panType", ((cm)localObject1).b());
        ((Intent)localObject2).putExtra("panBank", ((cm)localObject1).c());
        ((Intent)localObject2).putExtra("mobilenumber", u.a().x.toString());
        a().changeSubActivity((Intent)localObject2);
      }
      else
      {
        u.a().c.b(true);
        if ("5110".equals(parames.s()))
        {
          ef.a().a(this, ec.b(this, parames.t(), i2), getString(bp.p()), getString(bp.eA()), new bi(this), new bl(this));
        }
        else
        {
          ec.a(this, parames.t(), i2);
          continue;
          this.w = ((bt)parames);
          if (i2 == 0)
          {
            u.a().c.a(false);
            if (ec.d(this).equals(this.w.b()))
            {
              a(this.w, false);
            }
            else
            {
              localObject1 = new bk(this);
              localObject2 = new al(this);
              ef.a().a(this, getString(bp.dn()), getString(bp.p()), getString(bp.jdMethod_do()), (View.OnClickListener)localObject1, (View.OnClickListener)localObject2);
            }
          }
          else
          {
            u.a().c.a(true);
            ec.a(this, this.w.t(), i2);
            continue;
            localObject1 = (ei)parames;
            if (i2 == 0)
            {
              localObject2 = Toast.makeText(this, getString(bp.dx()), 1);
              ((Toast)localObject2).setGravity(17, 0, 0);
              ((Toast)localObject2).show();
              u.a().y.delete(0, u.a().y.length());
              u.a().y.append(((ei)localObject1).c());
              processRefreshConn();
            }
            else
            {
              localObject1 = Toast.makeText(this, getString(bp.dy()) + ((ei)localObject1).t() + ",错误码为：" + i2, 1);
              ((Toast)localObject1).setGravity(17, 0, 0);
              ((Toast)localObject1).show();
              this.o.setEnabled(true);
              this.o.setText(getString(bp.ee()));
              continue;
              localObject1 = (ah)parames;
              if (i2 == 0)
              {
                u.a().c.e(false);
                a((ah)localObject1);
              }
              else
              {
                u.a().c.e(true);
                ec.a(this, parames.t(), i2);
                continue;
                if (i2 != 0) {
                  break label737;
                }
                ef.a().a(this, getString(bp.p()), getString(bp.es()), new am(this));
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      u.a().e.d.setLength(0);
      break label88;
      break;
      label737:
      ec.a(this, parames.t(), i2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\HomeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */