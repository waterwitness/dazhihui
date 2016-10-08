package com.unionpay.upomp.lthj.plugin.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ImageButton;
import android.widget.Toast;
import com.f.a.a.au;
import com.f.a.a.ax;
import com.f.a.a.b;
import com.f.a.a.ba;
import com.f.a.a.bh;
import com.f.a.a.bp;
import com.f.a.a.bs;
import com.f.a.a.bw;
import com.f.a.a.cd;
import com.f.a.a.cg;
import com.f.a.a.ci;
import com.f.a.a.cj;
import com.f.a.a.cl;
import com.f.a.a.cm;
import com.f.a.a.cy;
import com.f.a.a.cz;
import com.f.a.a.d;
import com.f.a.a.db;
import com.f.a.a.dc;
import com.f.a.a.dd;
import com.f.a.a.df;
import com.f.a.a.dh;
import com.f.a.a.di;
import com.f.a.a.dj;
import com.f.a.a.dn;
import com.f.a.a.do;
import com.f.a.a.dz;
import com.f.a.a.ec;
import com.f.a.a.ef;
import com.f.a.a.ei;
import com.f.a.a.es;
import com.f.a.a.u;
import com.unionpay.upomp.lthj.plugin.model.GetBundleBankCardList;
import com.unionpay.upomp.lthj.widget.LineFrameView;
import com.unionpay.upomp.lthj.widget.ValidateCodeView;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Vector;

public class BankCardInfoActivity
  extends BaseActivity
  implements View.OnClickListener, ExpandableListView.OnChildClickListener, UIResponseListener
{
  public static final String TAG = "BankCardInfoActivity";
  private boolean A;
  private View B;
  ExpandableListView a;
  public TimerTask aaTimerTask;
  public int b = 60;
  private Button c;
  private EditText d;
  private EditText e;
  private String f;
  private String g;
  private Button h;
  private Button i;
  private Button j;
  private View.OnClickListener k = new ci(this);
  private Handler l = new cg(this);
  private View.OnClickListener m = new cy(this);
  private View.OnClickListener n = new cz(this);
  private ValidateCodeView o;
  private EditText p;
  private EditText q;
  private EditText r;
  private EditText s;
  private ax t;
  private ImageButton u;
  private GetBundleBankCardList v;
  private Button w;
  private Button x;
  private Button y;
  private boolean z;
  
  private void b()
  {
    bs.a(this, this);
  }
  
  private void c()
  {
    a(getString(bp.j()), this.k);
    setContentView(bp.ah());
    this.a = ((ExpandableListView)findViewById(bp.bI()));
    Object localObject = findViewById(bp.di());
    this.u = ((ImageButton)findViewById(bp.bh()));
    if ((u.a().D == null) || (u.a().D.size() == 0))
    {
      this.u.setOnClickListener(this);
      this.a.setVisibility(8);
      ((View)localObject).setVisibility(0);
    }
    for (;;)
    {
      this.h = ((Button)findViewById(bp.bS()));
      this.h.setOnClickListener(this);
      return;
      this.a.setVisibility(0);
      ((View)localObject).setVisibility(8);
      localObject = new bh(this);
      this.a.setAdapter((ExpandableListAdapter)localObject);
      this.a.setChoiceMode(1);
      this.a.setItemChecked(0, true);
      this.a.setCacheColorHint(0);
      this.a.setGroupIndicator(null);
      this.a.setOnChildClickListener(this);
    }
  }
  
  private void d()
  {
    a(getString(bp.j()), this.m);
    setContentView(bp.ai());
    ((LineFrameView)findViewById(bp.by())).a(u.a().A.toString());
    this.o = ((ValidateCodeView)findViewById(bp.df()));
    this.d = ((EditText)findViewById(bp.bb()));
    this.d.addTextChangedListener(new cl(this.d));
    this.e = ((EditText)findViewById(bp.bc()));
    this.c = ((Button)findViewById(bp.aB()));
    this.c.setOnClickListener(this);
    this.j = ((Button)findViewById(bp.aD()));
    this.j.setOnClickListener(this);
    if (u.a().c.b())
    {
      this.o.setVisibility(0);
      ec.a(this.o);
    }
    this.B = findViewById(bp.av());
    this.B.setOnClickListener(this);
  }
  
  private void e()
  {
    a(getString(bp.j()), this.n);
    setContentView(bp.aj());
    Object localObject = (LineFrameView)findViewById(bp.bq());
    LineFrameView localLineFrameView = (LineFrameView)findViewById(bp.bp());
    ((LineFrameView)localObject).a(this.f + "-" + ec.a(this.g) + "(" + u.a().e.a.substring(u.a().e.a.length() - 4, u.a().e.a.length()) + ")");
    localLineFrameView.a(ec.f(this.e.getText().toString()));
    this.q = ((EditText)findViewById(bp.bd()));
    this.r = ((EditText)findViewById(bp.bf()));
    this.s = ((EditText)findViewById(bp.be()));
    this.i = ((Button)findViewById(bp.bg()));
    this.i.setOnClickListener(this);
    localObject = new b(0);
    this.s.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.s.setOnTouchListener((View.OnTouchListener)localObject);
    localObject = new b(2);
    this.q.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.q.setOnTouchListener((View.OnTouchListener)localObject);
    this.x = ((Button)findViewById(bp.aK()));
    this.y = ((Button)findViewById(bp.aJ()));
    this.y.setOnClickListener(this);
    this.x.setOnClickListener(this);
    this.t = new ax();
    localObject = new dz(this.t);
    this.r.setOnFocusChangeListener((View.OnFocusChangeListener)localObject);
    this.r.setOnTouchListener((View.OnTouchListener)localObject);
    this.p = ((EditText)findViewById(bp.bj()));
    this.w = ((Button)findViewById(bp.bu()));
    this.w.setOnClickListener(new db(this));
    if ("00".equals(this.g)) {
      findViewById(bp.br()).setVisibility(8);
    }
    while (!"01".equals(this.g)) {
      return;
    }
    findViewById(bp.bt()).setVisibility(8);
    findViewById(bp.bs()).setVisibility(8);
  }
  
  private void f()
  {
    bs.a(this, this, this.v.bindId);
  }
  
  private void g()
  {
    bs.b(this, this, this.v.bindId, this.v.isDefault);
  }
  
  public void errorCallBack(String paramString)
  {
    if (this.w != null)
    {
      this.w.setEnabled(true);
      this.w.setText(getString(bp.ee()));
    }
    ef.a().a(this, "确定", paramString);
  }
  
  public boolean onChildClick(ExpandableListView paramExpandableListView, View paramView, int paramInt1, int paramInt2, long paramLong)
  {
    if (paramExpandableListView == this.a)
    {
      this.v = ((GetBundleBankCardList)u.a().D.get(paramInt1));
      int i1 = paramInt2;
      if (paramExpandableListView.getExpandableListAdapter().getChildrenCount(paramInt1) == 2)
      {
        i1 = paramInt2;
        if (paramInt2 == 1) {
          i1 = paramInt2 + 1;
        }
      }
      switch (i1)
      {
      }
    }
    for (;;)
    {
      return false;
      u.a().E = this.v;
      paramExpandableListView = new Intent(this, PayActivity.class);
      a().changeSubActivity(paramExpandableListView);
      continue;
      ef.a().a(this, getString(bp.o()), new dc(this));
      continue;
      ef.a().a(this, getString(bp.n()), new dd(this));
    }
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.c) {
      if (cd.k(this, this.d)) {}
    }
    label19:
    do
    {
      do
      {
        do
        {
          break label19;
          do
          {
            return;
          } while ((!cd.a(this, this.e)) || (!cd.a(this, this.o)));
          paramView = new StringBuffer();
          paramView.delete(0, paramView.length());
          paramView.append(this.d.getText().toString());
          int i1 = 0;
          while (i1 < paramView.length())
          {
            if (paramView.charAt(i1) == ' ') {
              paramView.deleteCharAt(i1);
            }
            i1 += 1;
          }
          u.a().e.a.setLength(0);
          u.a().e.a.append(paramView);
          paramView.delete(0, paramView.length());
          bs.a(this, this, u.a().e.a.toString(), this.o.d(), false);
          return;
          if (paramView == this.h)
          {
            d();
            return;
          }
          if (paramView != this.i) {
            break;
          }
        } while (!cd.a(this, this.p, this.w));
        if (!"00".equals(this.g)) {
          break;
        }
      } while ((!cd.j(this, this.q)) || (!cd.i(this, this.r)));
      while (cd.l(this, this.s))
      {
        bs.a(this, this, this.e.getText().toString(), this.p.getText().toString(), this.d.getText().toString().replace(" ", ""), this.t, this.q.getText().toString(), true);
        return;
      }
      return;
      if (paramView == this.u)
      {
        bs.a(this, this);
        return;
      }
      if ((paramView == this.x) || (paramView == this.y))
      {
        ec.c(this);
        return;
      }
      if (paramView == this.j)
      {
        paramView = new Intent(this, SupportCardActivity.class);
        paramView.putExtra("tranType", "2");
        paramView.addFlags(67108864);
        a().changeSubActivity(paramView);
        return;
      }
    } while (paramView != this.B);
    paramView = new Intent(this, AccountActivity.class);
    a().changeSubActivity(paramView);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.z = getIntent().getBooleanExtra("isQuickPayBind", false);
    this.A = getIntent().getBooleanExtra("isBind", false);
    if ((this.z) || (this.A))
    {
      d();
      return;
    }
    c();
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
  
  public void processRefreshConn()
  {
    if (this.aaTimerTask == null)
    {
      Timer localTimer = new Timer();
      this.aaTimerTask = new cj(this);
      localTimer.schedule(this.aaTimerTask, 0L, 'Ϩ');
    }
  }
  
  public void responseCallBack(es parames)
  {
    if ((parames == null) || (parames.s() == null)) {}
    for (;;)
    {
      return;
      if (!isFinishing())
      {
        int i1 = parames.j();
        int i2 = Integer.parseInt(parames.s());
        if ("5309".equals(parames.s()))
        {
          parames = getString(bp.ez());
          ef.a().a(this, parames, new do(this));
          return;
        }
        switch (i1)
        {
        }
        while (parames.j() != 8200)
        {
          ec.b(this.o);
          return;
          a(getString(bp.j()), this.k);
          Object localObject = (ba)parames;
          if (i2 == 0)
          {
            u.a().D = ec.a((ba)localObject);
            c();
          }
          else
          {
            ec.a(this, ((ba)localObject).t(), i2);
            continue;
            localObject = (cm)parames;
            if (i2 == 0)
            {
              this.f = ((cm)localObject).c();
              this.g = ((cm)localObject).b();
              e();
              u.a().c.b(false);
            }
            else
            {
              u.a().c.b(true);
              if ("5110".equals(parames.s()))
              {
                ef.a().a(this, ec.b(this, parames.t(), i2), getString(bp.p()), getString(bp.eA()), new dn(this), new dh(this));
              }
              else
              {
                ec.a(this, parames.t(), i2);
                continue;
                if (i2 == 0)
                {
                  ef.a().a(this, getString(bp.p()), getString(bp.em()), new df(this));
                }
                else
                {
                  ef.a().a(this, getString(bp.en()) + "(" + parames.s() + ")", getString(bp.p()), getString(bp.eo()), new dj(this), new di(this));
                  continue;
                  localObject = (ei)parames;
                  if (i2 == 0)
                  {
                    Toast localToast = Toast.makeText(this, getString(bp.dx()), 1);
                    localToast.setGravity(17, 0, 0);
                    localToast.show();
                    u.a().y.delete(0, u.a().y.length());
                    u.a().y.append(((ei)localObject).c());
                    processRefreshConn();
                  }
                  else
                  {
                    localObject = Toast.makeText(this, getString(bp.dy()) + ((ei)localObject).t() + ",错误码为：" + i2, 1);
                    ((Toast)localObject).setGravity(17, 0, 0);
                    ((Toast)localObject).show();
                    this.w.setEnabled(true);
                    this.w.setText(getString(bp.ee()));
                    continue;
                    b();
                    continue;
                    b();
                  }
                }
              }
            }
          }
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\ui\BankCardInfoActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */