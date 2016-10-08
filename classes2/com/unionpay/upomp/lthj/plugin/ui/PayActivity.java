package com.unionpay.upomp.lthj.plugin.ui;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.f.a.a.ac;
import com.f.a.a.ad;
import com.f.a.a.ae;
import com.f.a.a.af;
import com.f.a.a.ag;
import com.f.a.a.ai;
import com.f.a.a.aj;
import com.f.a.a.ak;
import com.f.a.a.aq;
import com.f.a.a.au;
import com.f.a.a.ax;
import com.f.a.a.b;
import com.f.a.a.ba;
import com.f.a.a.bf;
import com.f.a.a.bp;
import com.f.a.a.br;
import com.f.a.a.bs;
import com.f.a.a.bw;
import com.f.a.a.bx;
import com.f.a.a.cd;
import com.f.a.a.cn;
import com.f.a.a.co;
import com.f.a.a.cp;
import com.f.a.a.cq;
import com.f.a.a.cr;
import com.f.a.a.ct;
import com.f.a.a.cu;
import com.f.a.a.cv;
import com.f.a.a.cw;
import com.f.a.a.cx;
import com.f.a.a.dg;
import com.f.a.a.dm;
import com.f.a.a.dp;
import com.f.a.a.dw;
import com.f.a.a.dz;
import com.f.a.a.ec;
import com.f.a.a.ed;
import com.f.a.a.ef;
import com.f.a.a.ei;
import com.f.a.a.es;
import com.f.a.a.u;
import com.f.a.a.v;
import com.f.a.a.y;
import com.unionpay.upomp.lthj.plugin.model.GetBundleBankCardList;
import com.unionpay.upomp.lthj.plugin.model.HeadData;
import com.unionpay.upomp.lthj.plugin.model.SmsCodeVerfiyData;
import com.unionpay.upomp.lthj.widget.CustomInputView;
import com.unionpay.upomp.lthj.widget.LineFrameView;
import com.unionpay.upomp.lthj.widget.ValidateCodeView;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public class PayActivity
  extends BaseActivity
  implements View.OnClickListener, UIResponseListener
{
  private static String b = "PayActivity";
  private ImageButton A;
  private RelativeLayout B;
  private ValidateCodeView C;
  private View.OnClickListener D = new ak(this);
  private View.OnClickListener E = new aj(this);
  private Handler F = new cv(this);
  private CustomInputView G;
  private CustomInputView H;
  private Dialog I;
  private Button J;
  private Button K;
  private Button L;
  private CheckBox M;
  private Button N;
  private CustomInputView O;
  public int a = 60;
  public TimerTask aaTimerTask;
  private String c;
  private EditText d;
  private EditText e;
  private EditText f;
  private Button g;
  private String h;
  private String i;
  private String j;
  private EditText k;
  private LineFrameView l;
  private LineFrameView m;
  private LineFrameView n;
  private Button o;
  private Button p;
  private CustomInputView q;
  private CustomInputView r;
  private CustomInputView s;
  private Button t;
  private String[] u;
  private Button v;
  private Button w;
  private Button x;
  private ax y;
  private Button z;
  
  private void a(bf parambf)
  {
    setContentView(bp.aa());
    LineFrameView localLineFrameView1 = (LineFrameView)findViewById(bp.db());
    LineFrameView localLineFrameView2 = (LineFrameView)findViewById(bp.aH());
    ((LineFrameView)findViewById(bp.by())).a(parambf.b());
    if (Integer.parseInt(parambf.s()) == 0)
    {
      findViewById(bp.cZ()).setVisibility(8);
      localLineFrameView2.setVisibility(8);
      localLineFrameView1.a(bp.em());
      localLineFrameView1.b(bp.z());
    }
    for (;;)
    {
      localLineFrameView1.a().setTextColor(-65536);
      ((Button)findViewById(bp.bg())).setOnClickListener(new ac(this));
      return;
      localLineFrameView1.a(bp.en());
      localLineFrameView2.a(parambf.t());
      localLineFrameView1.b(bp.y());
    }
  }
  
  private void a(bx parambx)
  {
    if (Integer.parseInt(parambx.s()) == 0)
    {
      g();
      return;
    }
    setContentView(bp.X());
    ((LineFrameView)findViewById(bp.aI())).a().setTextColor(-65536);
    ((LineFrameView)findViewById(bp.aH())).a().setText(parambx.t());
    ((Button)findViewById(bp.bg())).setOnClickListener(new ad(this));
  }
  
  private void a(dg paramdg)
  {
    a(getString(bp.i()), this.E);
    setContentView(bp.ap());
    LineFrameView localLineFrameView1 = (LineFrameView)findViewById(bp.da());
    LineFrameView localLineFrameView2 = (LineFrameView)findViewById(bp.cY());
    localLineFrameView2.a().setTextColor(-65536);
    localLineFrameView1.a().setTextColor(-65536);
    int i1 = Integer.parseInt(paramdg.s());
    TextView localTextView1 = (TextView)findViewById(bp.aX());
    TextView localTextView2 = (TextView)findViewById(bp.aY());
    TextView localTextView3 = (TextView)findViewById(bp.aZ());
    TextView localTextView4 = (TextView)findViewById(bp.ba());
    localTextView1.setText(u.a().j);
    localTextView2.setText(ec.d(u.a().n));
    localTextView3.setText(u.a().l);
    localTextView4.setText(ec.c(u.a().m));
    ((Button)findViewById(bp.aO())).setOnClickListener(new cr(this));
    if (i1 == 0)
    {
      ec.d(this, u.a().w.toString());
      if (this.h == "1") {
        u.a().c.c(false);
      }
      for (;;)
      {
        localLineFrameView1.a(bp.ek());
        findViewById(bp.cZ()).setVisibility(8);
        localLineFrameView2.setVisibility(8);
        this.z = ((Button)findViewById(bp.aB()));
        if (!this.h.equals("1")) {
          break;
        }
        this.z.setOnClickListener(new cq(this));
        return;
        if (this.h == "3") {
          u.a().c.d(false);
        }
      }
      localLineFrameView2.a(paramdg.t());
      this.z.setText(bp.i());
      this.z.setOnClickListener(new cp(this));
      return;
    }
    if (this.h == "1") {
      u.a().c.c(true);
    }
    for (;;)
    {
      localLineFrameView1.b(bp.y());
      localLineFrameView1.a(bp.el());
      if (paramdg.s().equals("2098")) {
        localLineFrameView1.a("交易处理中");
      }
      localLineFrameView2.a(paramdg.t() + "(" + paramdg.s() + ")");
      this.z = ((Button)findViewById(bp.aB()));
      this.z.setText(bp.s());
      this.z.setOnClickListener(new co(this));
      return;
      if (this.h == "3") {
        u.a().c.d(true);
      }
    }
  }
  
  private void b()
  {
    this.h = "1";
    setContentView(bp.P());
    a(getString(bp.j()), new ai(this));
    this.C = ((ValidateCodeView)findViewById(bp.df()));
    if (u.a().c.c())
    {
      this.C.setVisibility(0);
      ec.a(this.C);
    }
    this.l = ((LineFrameView)findViewById(bp.bq()));
    this.m = ((LineFrameView)findViewById(bp.bp()));
    this.n = ((LineFrameView)findViewById(bp.bm()));
    this.l.a(this.i + "-" + ec.a(this.c) + "(" + u.a().w.substring(u.a().w.length() - 4) + ")");
    this.m.a(ec.f(this.j));
    this.d = ((EditText)findViewById(bp.bd()));
    this.e = ((EditText)findViewById(bp.bf()));
    this.f = ((EditText)findViewById(bp.be()));
    this.g = ((Button)findViewById(bp.bg()));
    this.g.setOnClickListener(this);
    this.K = ((Button)findViewById(bp.aK()));
    this.L = ((Button)findViewById(bp.aJ()));
    this.L.setOnClickListener(this);
    this.K.setOnClickListener(this);
    Object localObject = new b(0);
    this.f.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.f.setOnTouchListener((View.OnTouchListener)localObject);
    localObject = new b(2);
    this.d.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.d.setOnTouchListener((View.OnTouchListener)localObject);
    this.y = new ax();
    localObject = new dz(this.y);
    this.e.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.e.setOnTouchListener((View.OnTouchListener)localObject);
    this.k = ((EditText)findViewById(bp.bj()));
    this.o = ((Button)findViewById(bp.bu()));
    this.o.setOnClickListener(new ag(this));
    if ("00".equals(this.c)) {
      findViewById(bp.br()).setVisibility(8);
    }
    while (!"01".equals(this.c)) {
      return;
    }
    findViewById(bp.bt()).setVisibility(8);
    findViewById(bp.bs()).setVisibility(8);
  }
  
  private void c()
  {
    this.h = "3";
    setContentView(bp.T());
    this.C = ((ValidateCodeView)findViewById(bp.df()));
    this.f = ((EditText)findViewById(bp.be()));
    this.l = ((LineFrameView)findViewById(bp.bq()));
    this.l.a(this.i + "-" + ec.a(this.c) + "(" + u.a().w.substring(u.a().w.length() - 4) + ")");
    this.g = ((Button)findViewById(bp.bg()));
    this.g.setOnClickListener(this);
    b localb = new b(0);
    this.f.setOnFocusChangeListener(localb);
    this.f.setOnTouchListener(localb);
    if (u.a().c.d())
    {
      this.C.setVisibility(0);
      ec.a(this.C);
    }
  }
  
  private void d()
  {
    this.h = "2";
    bs.a(this, this);
    l();
  }
  
  private void e()
  {
    setContentView(bp.W());
    this.O = ((CustomInputView)findViewById(bp.by()));
    this.O.a(this.j);
    this.O.b().setFilters(new InputFilter[] { new InputFilter.LengthFilter(20) });
    this.G = ((CustomInputView)findViewById(bp.bw()));
    b localb = new b(8);
    this.G.b().setOnTouchListener(localb);
    this.G.b().setOnFocusChangeListener(localb);
    this.M = ((CheckBox)findViewById(bp.at()));
    ((Button)findViewById(bp.au())).setOnClickListener(new af(this));
    this.H = ((CustomInputView)findViewById(bp.bE()));
    localb = new b(7);
    this.H.b().setOnTouchListener(localb);
    this.H.b().setOnFocusChangeListener(localb);
    this.J = ((Button)findViewById(bp.aB()));
    this.J.setOnClickListener(this);
  }
  
  private void f()
  {
    View localView = View.inflate(this, bp.Y(), null);
    this.q = ((CustomInputView)localView.findViewById(bp.bx()));
    this.N = ((Button)localView.findViewById(bp.as()));
    this.N.setOnClickListener(new ae(this));
    this.q.a(com.f.a.a.cs.b[0]);
    this.r = ((CustomInputView)localView.findViewById(bp.bn()));
    this.s = ((CustomInputView)localView.findViewById(bp.bo()));
    this.r.a(bp.ej());
    this.s.a(this.i + ec.a(this.c) + ec.h(u.a().w.toString()));
    this.p = ((Button)localView.findViewById(bp.bg()));
    this.p.setOnClickListener(this);
    this.t = ((Button)localView.findViewById(bp.aE()));
    this.t.setOnClickListener(this);
    this.I = new Dialog(this, bp.et());
    Display localDisplay = ((WindowManager)getSystemService("window")).getDefaultDisplay();
    WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
    localLayoutParams.height = ((int)(localDisplay.getHeight() * 0.5D));
    localLayoutParams.width = localDisplay.getWidth();
    localLayoutParams.x = 0;
    localLayoutParams.y = (localDisplay.getHeight() - localLayoutParams.height);
    this.I.getWindow().setAttributes(localLayoutParams);
    this.I.setContentView(localView);
    this.I.show();
  }
  
  private void g()
  {
    setContentView(bp.Z());
    this.l = ((LineFrameView)findViewById(bp.bq()));
    this.m = ((LineFrameView)findViewById(bp.by()));
    this.l.a(this.i + "-" + ec.a(this.c) + "(" + u.a().w.substring(u.a().w.length() - 4, u.a().w.length()) + ")");
    this.m.a(this.j);
    this.d = ((EditText)findViewById(bp.bd()));
    this.e = ((EditText)findViewById(bp.bf()));
    this.f = ((EditText)findViewById(bp.be()));
    this.v = ((Button)findViewById(bp.bg()));
    this.v.setOnClickListener(this);
    Object localObject = new b(0);
    this.f.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.f.setOnTouchListener((View.OnTouchListener)localObject);
    localObject = new b(2);
    this.d.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.d.setOnTouchListener((View.OnTouchListener)localObject);
    this.y = new ax();
    localObject = new dz(this.y);
    this.e.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.e.setOnTouchListener((View.OnTouchListener)localObject);
    if ("00".equals(this.c)) {
      findViewById(bp.br()).setVisibility(8);
    }
    while (!"01".equals(this.c)) {
      return;
    }
    findViewById(bp.bt()).setVisibility(8);
    findViewById(bp.bs()).setVisibility(8);
  }
  
  private void h()
  {
    if (!cd.a(this, this.k, this.o)) {}
    label15:
    label233:
    label438:
    label503:
    dg localdg;
    do
    {
      do
      {
        do
        {
          dp localdp;
          do
          {
            break label15;
            break label15;
            break label15;
            break label15;
            do
            {
              return;
            } while (!cd.a(this, this.C));
            if (!u.a().v) {
              break label503;
            }
            localdp = new dp(8227);
            localdp.a(HeadData.createHeadData("PreAuth.Req", this));
            localdp.a(this.h);
            if (!this.h.equals("1")) {
              break label438;
            }
            localdp.f(u.a().w.toString());
            if (!"00".equals(this.c)) {
              break;
            }
          } while ((!cd.j(this, this.d)) || (!cd.i(this, this.e)));
          localdp.i(this.d.getText().toString());
          localObject = new StringBuffer();
          ((StringBuffer)localObject).append(new String(JniMethod.getJniMethod().decryptConfig(this.y.b(), this.y.b().length)));
          ((StringBuffer)localObject).append(new String(JniMethod.getJniMethod().decryptConfig(this.y.a(), this.y.a().length)));
          localdp.h(((StringBuffer)localObject).toString());
          ((StringBuffer)localObject).delete(0, ((StringBuffer)localObject).length());
          localdp.c(this.j);
          for (;;)
          {
            if (this.C != null) {
              localdp.e(this.C.d());
            }
            if (this.k != null) {
              localdp.d(this.k.getText().toString());
            }
            localdp.k(u.a().i);
            localdp.j(u.a().j);
            localdp.n(u.a().n);
            localdp.o(u.a().o);
            localdp.l(u.a().l);
            localdp.m(u.a().m);
            localdp.p(u.a().q);
            localdp.r(u.a().r);
            localdp.s(u.a().p);
            localdp.q(u.a().L);
            try
            {
              br.a().a(localdp, this, this, true, false);
              return;
            }
            catch (Exception localException1)
            {
              localException1.printStackTrace();
              return;
            }
            if (!"01".equals(this.c)) {
              break label233;
            }
            if (!cd.l(this, this.f)) {
              break;
            }
            localException1.g(u.a().z.toString());
            break label233;
            if (this.h.equals("2"))
            {
              localException1.b(u.a().A.toString());
              localException1.a(u.a().C);
              localException1.f(u.a().E.pan);
              localException1.c(u.a().E.mobileNumber);
            }
          }
        } while (!cd.a(this, this.k, this.o));
        localdg = new dg(8210);
        localdg.a(HeadData.createHeadData("CommonPay.Req", this));
        localdg.b(this.h);
        if (!this.h.equals("1")) {
          break;
        }
        localObject = new SmsCodeVerfiyData();
        ((SmsCodeVerfiyData)localObject).smsCode = this.k.getText().toString();
        ((SmsCodeVerfiyData)localObject).sessionID = v.a;
        ((SmsCodeVerfiyData)localObject).codeMd5 = u.a().y.toString();
      } while (!cd.a(this, (SmsCodeVerfiyData)localObject));
      localdg.h(u.a().w.toString());
      if (!"00".equals(this.c)) {
        break;
      }
    } while ((!cd.j(this, this.d)) || (!cd.i(this, this.e)));
    localdg.k(this.d.getText().toString());
    Object localObject = new StringBuffer();
    ((StringBuffer)localObject).append(new String(JniMethod.getJniMethod().decryptConfig(this.y.b(), this.y.b().length)));
    ((StringBuffer)localObject).append(new String(JniMethod.getJniMethod().decryptConfig(this.y.a(), this.y.a().length)));
    localdg.j(((StringBuffer)localObject).toString());
    ((StringBuffer)localObject).delete(0, ((StringBuffer)localObject).length());
    label765:
    localdg.e(this.j);
    for (;;)
    {
      if (this.C != null) {
        localdg.g(this.C.d());
      }
      if (this.k != null) {
        localdg.f(this.k.getText().toString());
      }
      localdg.a(u.a().k);
      localdg.f(this.k.getText().toString());
      localdg.m(u.a().i);
      localdg.l(u.a().j);
      localdg.p(u.a().n);
      localdg.q(u.a().o);
      localdg.n(u.a().l);
      localdg.o(u.a().m);
      localdg.s(u.a().q);
      localdg.r(u.a().r);
      localdg.t(u.a().p);
      localdg.u(u.a().L);
      try
      {
        br.a().a(localdg, this, this, true, false);
        return;
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
        return;
      }
      if (!"01".equals(this.c)) {
        break label765;
      }
      if (!cd.l(this, this.f)) {
        break;
      }
      localException2.i(u.a().z.toString());
      break label765;
      if (this.h.equals("2"))
      {
        localException2.c(u.a().A.toString());
        localException2.d(new String(u.a().C));
        localException2.h(u.a().E.pan);
        localException2.e(u.a().E.mobileNumber);
      }
    }
  }
  
  private void i()
  {
    ed localed = new ed(8222);
    localed.a(HeadData.createHeadData("CheckUserExist.Req", this));
    localed.a(this.j);
    try
    {
      br.a().a(localed, this, this, true, true);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
  
  private void j()
  {
    if ("2" == this.h)
    {
      k();
      return;
    }
    Intent localIntent = new Intent(this, HomeActivity.class);
    a().changeSubActivity(localIntent);
  }
  
  private void k()
  {
    if ((u.a().D == null) || (u.a().D.size() == 0))
    {
      l();
      return;
    }
    a(getString(bp.j()), this.D);
    setContentView(bp.U());
    this.w = ((Button)findViewById(bp.bz()));
    this.w.setOnClickListener(this);
    this.l = ((LineFrameView)findViewById(bp.bq()));
    this.m = ((LineFrameView)findViewById(bp.bp()));
    this.k = ((EditText)findViewById(bp.bj()));
    this.o = ((Button)findViewById(bp.bu()));
    ((LineFrameView)findViewById(bp.by())).a(u.a().A.toString());
    LineFrameView localLineFrameView = (LineFrameView)findViewById(bp.bx());
    localLineFrameView.a(u.a().G);
    localLineFrameView.a().setTextColor(-65536);
    u.a().E = ec.a(u.a().D);
    if (u.a().E == null) {
      u.a().E = ((GetBundleBankCardList)u.a().D.get(0));
    }
    this.l.a(u.a().E.panBank + "-" + ec.b(u.a().E.panType) + "(" + u.a().E.pan.substring(u.a().E.pan.length() - 4, u.a().E.pan.length()) + ")");
    this.m.a(ec.f(u.a().E.mobileNumber));
    this.o.setOnClickListener(new cn(this));
    this.B = ((RelativeLayout)findViewById(bp.aS()));
    this.B.setOnClickListener(this);
    this.g = ((Button)findViewById(bp.bg()));
    this.g.setOnClickListener(this);
  }
  
  private void l()
  {
    a(getString(bp.j()), this.D);
    setContentView(bp.V());
    LineFrameView localLineFrameView1 = (LineFrameView)findViewById(bp.by());
    LineFrameView localLineFrameView2 = (LineFrameView)findViewById(bp.bx());
    this.x = ((Button)findViewById(bp.aB()));
    this.x.setOnClickListener(this);
    localLineFrameView1.a(u.a().A.toString());
    localLineFrameView2.a(u.a().G);
    this.w = ((Button)findViewById(bp.bz()));
    this.w.setOnClickListener(this);
    this.A = ((ImageButton)findViewById(bp.bh()));
    this.A.setOnClickListener(this);
  }
  
  private void m()
  {
    int i2 = u.a().D.size();
    String[] arrayOfString = new String[i2];
    int i1 = 0;
    while (i1 < i2)
    {
      GetBundleBankCardList localGetBundleBankCardList = (GetBundleBankCardList)u.a().D.get(i1);
      arrayOfString[i1] = (localGetBundleBankCardList.panBank + "-" + ec.b(localGetBundleBankCardList.panType) + "-" + localGetBundleBankCardList.pan.substring(localGetBundleBankCardList.pan.length() - 4));
      i1 += 1;
    }
    new AlertDialog.Builder(this).setTitle(bp.h()).setItems(arrayOfString, new dw(this)).setPositiveButton(getString(bp.e()), new cw(this)).setNegativeButton(getString(bp.g()), new cx(this)).create().show();
  }
  
  private void n()
  {
    ef.a().a(this, getString(bp.f()), new dm(this));
  }
  
  public void backToMerchant()
  {
    a().backToMerchant();
  }
  
  public void errorCallBack(String paramString)
  {
    if (this.o != null)
    {
      this.o.setEnabled(true);
      this.o.setText(getString(bp.ee()));
    }
    ec.a(this, paramString);
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.g) {
      h();
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if (paramView == this.w)
              {
                paramView = new Intent(this, AccountActivity.class);
                paramView.addFlags(67108864);
                a().changeSubActivity(paramView);
                return;
              }
              if (paramView != this.J) {
                break;
              }
            } while ((!cd.c(this, this.G.b())) || (!cd.b(this, this.O.b())) || (!cd.a(this)) || (!cd.a(this, this.M)));
            f();
            return;
            if (paramView != this.p) {
              break;
            }
          } while ((!cd.f(this, this.q.b())) || (!cd.g(this, this.r.b())) || (!cd.h(this, this.s.b())));
          this.I.dismiss();
          bs.b(this, this, this.j, this.q.a().toString(), this.r.a().toString(), this.s.a().toString());
          return;
          if (paramView != this.v) {
            break;
          }
        } while (!cd.a(this, this.k, this.o));
        if (!"00".equals(this.c)) {
          break;
        }
      } while ((!cd.j(this, this.d)) || (!cd.i(this, this.e)));
      while ((!"01".equals(this.c)) || (cd.l(this, this.f)))
      {
        bs.a(this, this, this.j, this.y, this.d.getText().toString());
        return;
      }
      return;
      if (paramView == this.x)
      {
        paramView = new Intent(this, BankCardInfoActivity.class);
        paramView.setFlags(67108864);
        paramView.putExtra("isQuickPayBind", true);
        a().changeSubActivity(paramView);
        return;
      }
      if (paramView == this.A)
      {
        bs.a(this, this);
        return;
      }
      if (paramView == this.B)
      {
        m();
        return;
      }
      if (paramView == this.t)
      {
        paramView = u.a().a.h();
        this.u = new String[paramView.size() + 1];
        this.u[0] = getString(bp.d());
        int i1 = 0;
        while (i1 < paramView.size())
        {
          this.u[(i1 + 1)] = ((String)paramView.get(i1));
          i1 += 1;
        }
        new AlertDialog.Builder(this).setItems(this.u, new aq(this)).setTitle(bp.c()).show();
        return;
      }
    } while ((paramView != this.K) && (paramView != this.L));
    ec.c(this);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (getIntent().getBooleanExtra("isAcount", false))
    {
      d();
      return;
    }
    this.c = getIntent().getStringExtra("panType");
    this.i = getIntent().getStringExtra("panBank");
    this.j = getIntent().getStringExtra("mobilenumber");
    if ("02".equals(this.c))
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
    if ((this.h == "2") && (this.l != null) && (this.m != null) && (u.a().E != null))
    {
      this.l.a(u.a().E.panBank + "-" + ec.b(u.a().E.panType) + "-" + u.a().E.pan.substring(u.a().E.pan.length() - 4, u.a().E.pan.length()));
      this.m.a(ec.f(u.a().E.mobileNumber));
    }
    super.onResume();
  }
  
  public void processRefreshConn()
  {
    if (this.aaTimerTask == null)
    {
      Timer localTimer = new Timer();
      this.aaTimerTask = new cu(this);
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
      ef.a().a(this, parames, new ct(this));
      return;
    }
    switch (i1)
    {
    default: 
      return;
    case 8200: 
      parames = (ei)parames;
      if (i2 == 0)
      {
        Object localObject = Toast.makeText(this, getString(bp.dx()), 1);
        ((Toast)localObject).setGravity(17, 0, 0);
        ((Toast)localObject).show();
        localObject = parames.b();
        if (this.n != null)
        {
          localObject = getString(bp.b()) + "-" + (String)localObject;
          SpannableString localSpannableString = new SpannableString((CharSequence)localObject);
          localSpannableString.setSpan(new ForegroundColorSpan(-65536), ((String)localObject).length() - 4, ((String)localObject).length(), 33);
          this.n.a(localSpannableString);
        }
        u.a().y.delete(0, u.a().y.length());
        u.a().y.append(parames.c());
        processRefreshConn();
        return;
      }
      parames = Toast.makeText(this, getString(bp.dy()) + parames.t() + ",错误码为：" + i2, 1);
      parames.setGravity(17, 0, 0);
      parames.show();
      this.o.setEnabled(true);
      this.o.setText(getString(bp.ee()));
      return;
    case 8207: 
      parames = (ba)parames;
      if (i2 == 0)
      {
        u.a().D = ec.a(parames);
        if ((u.a().D == null) || (u.a().D.size() == 0))
        {
          l();
          return;
        }
        k();
        return;
      }
      ec.a(this, parames.t(), i2);
      return;
    case 8210: 
    case 8227: 
      parames = (dg)parames;
      u.a().H = parames.d();
      u.a().I = parames.c();
      u.a().J = parames.e();
      u.a().K = parames.f();
      u.a().t = parames.s();
      u.a().u = parames.t();
      switch (i2)
      {
      default: 
        a(parames);
        return;
      }
      if (this.G != null) {
        this.G.a(null);
      }
      ec.a(this, parames.t(), i2);
      return;
    case 8222: 
      parames = (ed)parames;
      if (i2 == 0)
      {
        if ("0".equals(parames.b()))
        {
          e();
          return;
        }
        backToMerchant();
        return;
      }
      backToMerchant();
      return;
    case 8225: 
      a((bx)parames);
      return;
    }
    a((bf)parames);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\PayActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */