package com.android.dazhihui.ui.delegate.screen;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;

public class TransferTable
  extends DelegateBaseActivity
  implements cp, cs
{
  protected boolean a;
  protected int b;
  protected int c;
  protected int d;
  public String[][] e;
  public int[][] f;
  private int g = m.a().H();
  private FrameLayout h;
  private String[] i;
  private String[] j;
  private String[] m;
  private Spinner n;
  private Spinner o;
  private int p;
  private int[] q;
  private Button r;
  private String[] s;
  private View t;
  private DzhHeader u;
  private com.android.dazhihui.a.b.u v;
  
  public TransferTable()
  {
    String[] arrayOfString;
    if (a.q == null)
    {
      arrayOfString = new String[6];
      arrayOfString[0] = "流水号";
      arrayOfString[1] = "银行名称";
      arrayOfString[2] = "转帐方向";
      arrayOfString[3] = "转帐金额";
      arrayOfString[4] = "转帐日期";
      arrayOfString[5] = "转帐时间";
      this.i = arrayOfString;
      if (a.r != null) {
        break label200;
      }
      arrayOfString = new String[6];
      arrayOfString[0] = "1191";
      arrayOfString[1] = "1187";
      arrayOfString[2] = "1083";
      arrayOfString[3] = "1192";
      arrayOfString[4] = "1195";
      arrayOfString[5] = "1196";
    }
    for (;;)
    {
      this.j = arrayOfString;
      this.m = new String[] { "人民币", "美元", "港币", "所有币种" };
      this.a = true;
      this.b = 0;
      this.c = 0;
      this.d = 0;
      this.e = ((String[][])null);
      this.f = ((int[][])null);
      this.p = 0;
      this.q = null;
      this.s = null;
      this.t = null;
      return;
      arrayOfString = a.q;
      break;
      label200:
      arrayOfString = a.r;
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return false;
      finish();
    }
  }
  
  public void a()
  {
    if (!o.r()) {
      return;
    }
    this.v = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11130").h()) });
    registRequestListener(this.v);
    a(this.v, true);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (hs.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.u == null);
      this.u.a(paramy);
      return;
    } while (this.u == null);
    this.u.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = paramContext.getResources().getString(2131165246);
    paramct.a = 40;
    paramct.d = paramContext;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.u = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (paramj == null) {
      if (paramh == this.v)
      {
        paramh = Toast.makeText(this, "　　获取银行列表失败，请返回重试。", 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
      }
    }
    do
    {
      do
      {
        return;
        paramh = Toast.makeText(this, "　　连接失败，请重试!", 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      } while (paramh != this.v);
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (!paramh.b()) {
        break;
      }
      paramj = new String[paramh.g()];
      this.s = new String[paramh.g()];
      this.q = new int[paramj.length];
      int k = 0;
      while (k < paramj.length)
      {
        paramj[k] = paramh.a(k, "1187");
        this.s[k] = paramh.a(k, "1186");
        this.q[k] = paramh.b(k, "1028");
        k += 1;
      }
      if (paramj.length > 1)
      {
        this.n.setPrompt("请选择银行名称");
        paramh = new ArrayAdapter(this, 17367048, paramj);
        paramh.setDropDownViewResource(17367049);
        this.n.setVisibility(1);
        this.n.setAdapter(paramh);
        this.n.setClickable(true);
        return;
      }
    } while (paramj.length != 1);
    paramh = new ArrayAdapter(this, 17367048, paramj);
    paramh.setDropDownViewResource(17367049);
    this.n.setVisibility(1);
    this.n.setClickable(false);
    this.n.setAdapter(paramh);
    paramh = new ArrayAdapter(this, 17367048, this.m);
    paramh.setDropDownViewResource(17367049);
    this.o.setVisibility(0);
    this.o.setAdapter(paramh);
    this.o.setSelection(this.q[0]);
    return;
    paramh = Toast.makeText(this, paramh.d(), 0);
    paramh.setGravity(17, 0, 0);
    paramh.show();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903452);
    this.u = ((DzhHeader)findViewById(2131558643));
    this.u.a(this, this);
    this.h = ((FrameLayout)findViewById(2131560580));
    this.t = getLayoutView(2130903548);
    this.r = ((Button)this.t.findViewById(2131561146));
    this.r.setOnClickListener(new hp(this));
    this.n = ((Spinner)this.t.findViewById(2131561142));
    this.n.setPrompt("请选择银行名称");
    paramBundle = new ArrayAdapter(this, 17367048, new String[] { "银行名称" });
    paramBundle.setDropDownViewResource(17367049);
    this.n.setVisibility(1);
    this.n.setAdapter(paramBundle);
    this.o = ((Spinner)this.t.findViewById(2131561144));
    this.o.setPrompt("请选择币种类别");
    paramBundle = new ArrayAdapter(this, 17367048, this.m);
    paramBundle.setDropDownViewResource(17367049);
    this.o.setVisibility(0);
    this.o.setAdapter(paramBundle);
    this.o.setOnItemSelectedListener(new hq(this));
    this.n.setOnItemSelectedListener(new hr(this));
    this.h.addView(this.t);
    a();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\TransferTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */