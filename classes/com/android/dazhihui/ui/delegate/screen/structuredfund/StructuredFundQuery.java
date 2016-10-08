package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class StructuredFundQuery
  extends DelegateBaseActivity
  implements cp, cs
{
  private final String[] A = { "1037", "1039", "1041", "1048", "1040", "1047", "1043" };
  private final String[] B = { "证券名称", "成交时间", "成交价", "成交量", "成交金额" };
  private final String[] C = { "1037", "1046", "1048", "1047", "1049" };
  private final String[] D = { "证券名称", "委托日期", "价格", "均价", "数量", "成交", "状态" };
  private final String[] E = { "1037", "1038", "1041", "1048", "1040", "1047", "1043" };
  private final String[] F = { "证券名称", "成交日期", "成交价", "成交量", "成交金额" };
  private final String[] G = { "1037", "1045", "1048", "1047", "1049" };
  private int H;
  private int I;
  private String J;
  private String[] K;
  private String[] L;
  private int M;
  private int N;
  private int O;
  private String P;
  private int Q;
  private int R;
  private int S;
  private String T;
  private int U;
  private int V;
  private com.android.dazhihui.a.b.u W;
  private DatePickerDialog.OnDateSetListener X = new ag(this);
  private DatePickerDialog.OnDateSetListener Y = new ah(this);
  private DzhHeader a;
  private Calendar aa = Calendar.getInstance();
  private LinearLayout b;
  private LinearLayout c;
  private LinearLayout d;
  private LinearLayout e;
  private TableLayoutGroup f;
  private TextView g;
  private TextView h;
  private Button i;
  private TextView j;
  private TextView m;
  private TextView n;
  private TextView o;
  private ListView p;
  private ImageView q;
  private ImageView r;
  private String[] s;
  private final String[] t = { "委托时间", "价格/均价", "数量/成交", "状态" };
  private final String[] u = { "成交时间", "成交价", "成交量", "成交金额" };
  private final String[] v = { "委托日期", "价格/均价", "数量/成交", "状态" };
  private final String[] w = { "成交日期", "成交价", "成交量", "成交金额" };
  private final String[] x = { "配号日期", "证券", "起始配号", "配号数量" };
  private final String[] y = { "中签日期", "证券名称", "证券代码", "中签股数" };
  private final String[] z = { "证券名称", "委托时间", "价格", "均价", "数量", "成交", "状态" };
  
  private void a()
  {
    this.a = ((DzhHeader)findViewById(2131558643));
    this.b = ((LinearLayout)findViewById(2131558774));
    this.c = ((LinearLayout)findViewById(2131558775));
    this.d = ((LinearLayout)findViewById(2131558776));
    this.e = ((LinearLayout)findViewById(2131558888));
    this.f = ((TableLayoutGroup)findViewById(2131558887));
    this.g = ((TextView)findViewById(2131558687));
    this.h = ((TextView)findViewById(2131558688));
    this.i = ((Button)findViewById(2131558777));
    this.j = ((TextView)findViewById(2131558890));
    this.m = ((TextView)findViewById(2131558891));
    this.n = ((TextView)findViewById(2131558892));
    this.o = ((TextView)findViewById(2131558893));
    this.p = ((ListView)findViewById(2131558780));
    this.q = ((ImageView)findViewById(2131558778));
    this.r = ((ImageView)findViewById(2131558889));
  }
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g(this.H + "");
    switch (this.H)
    {
    }
    for (;;)
    {
      this.W = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.W);
      a(this.W, paramBoolean);
      return;
      localh.a("1972", "").a("1214", "0").a("1206", this.U).a("1277", this.V);
      continue;
      localh.a("1972", "").a("1206", this.U).a("1277", this.V);
      continue;
      localh.a("1022", this.P).a("1023", this.T).a("1972", "").a("1206", this.U).a("1277", this.V);
      localh.a("1022", this.P).a("1023", this.T).a("1972", "").a("1206", this.U).a("1277", this.V);
    }
  }
  
  private void b()
  {
    this.U = 0;
    this.V = 20;
    this.f.a();
  }
  
  private void c()
  {
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null) {
      this.H = localBundle.getInt("category");
    }
    switch (this.H)
    {
    }
    for (;;)
    {
      this.a.a(this, this);
      if ((this.H == 12918) || (this.H == 12920))
      {
        this.P = o.x();
        this.M = Integer.parseInt(this.P.substring(0, 4));
        this.N = Integer.parseInt(this.P.substring(4, 6));
        this.O = Integer.parseInt(this.P.substring(6, 8));
        this.g.setText(this.M + "-" + this.N + "-" + this.O);
        this.T = o.y();
        this.Q = Integer.parseInt(this.T.substring(0, 4));
        this.R = Integer.parseInt(this.T.substring(4, 6));
        this.S = Integer.parseInt(this.T.substring(6, 8));
        this.h.setText(this.Q + "-" + this.R + "-" + this.S);
      }
      this.f.setVisibility(0);
      this.e.setVisibility(8);
      if ((this.K == null) || (this.L == null))
      {
        this.K = new String[] { "" };
        this.L = new String[] { "" };
      }
      this.f.setHeaderColumn(this.K);
      this.f.setPullDownLoading(false);
      this.f.setColumnClickable(null);
      this.f.setContinuousLoading(false);
      this.f.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.f.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.f.setDrawHeaderSeparateLine(false);
      this.f.setHeaderTextColor(getResources().getColor(2131493099));
      this.f.setHeaderFontSize(getResources().getDimension(2131230899));
      this.f.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.f.setLeftPadding(25);
      this.f.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.f.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.f.setStockNameColor(getResources().getColor(2131493235));
      this.f.setFirstColumnColorDifferent(true);
      this.f.setOnLoadingListener(new ae(this));
      this.f.setOnTableLayoutClickListener(new af(this));
      return;
      this.J = "当日委托";
      this.b.setVisibility(8);
      this.r.setVisibility(4);
      this.s = this.t;
      this.K = a.bM;
      this.L = a.bN;
      continue;
      this.J = "当日成交";
      this.b.setVisibility(8);
      this.r.setVisibility(4);
      this.s = this.u;
      this.K = this.B;
      this.K = a.i;
      this.L = a.j;
      continue;
      this.J = "历史委托";
      this.b.setVisibility(0);
      this.r.setVisibility(4);
      this.s = this.v;
      this.K = this.D;
      this.K = a.bQ;
      this.L = a.bR;
      continue;
      this.J = "历史成交";
      this.b.setVisibility(0);
      this.r.setVisibility(4);
      this.s = this.w;
      this.K = this.F;
      this.K = a.bO;
      this.L = a.bP;
    }
  }
  
  private void d()
  {
    ai localai = new ai(this);
    this.i.setOnClickListener(localai);
    this.c.setOnClickListener(localai);
    this.d.setOnClickListener(localai);
  }
  
  public boolean OnChildClick(View paramView)
  {
    switch (((Integer)paramView.getTag()).intValue())
    {
    }
    for (;;)
    {
      return true;
      finish();
    }
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.p = this;
    paramct.d = this.J;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.a = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    int i3;
    do
    {
      do
      {
        do
        {
          return;
        } while (paramh != this.W);
        paramh = ((v)paramj).b();
      } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, this));
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (!paramh.b())
      {
        paramh = Toast.makeText(this, paramh.d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      }
      this.I = paramh.b("1289");
      i3 = paramh.g();
      if ((i3 == 0) && (this.f.getDataModel().size() == 0))
      {
        this.f.setBackgroundResource(2130838490);
        return;
      }
      this.f.setBackgroundColor(getResources().getColor(2131493677));
    } while (i3 <= 0);
    paramj = new ArrayList();
    int k = 0;
    while (k < i3)
    {
      mh localmh = new mh();
      String[] arrayOfString = new String[this.K.length];
      int[] arrayOfInt = new int[this.K.length];
      int i1 = 0;
      for (;;)
      {
        if (i1 >= this.K.length) {
          break label334;
        }
        try
        {
          arrayOfString[i1] = paramh.a(k, this.L[i1]).trim();
          if (arrayOfString[i1] == null) {
            arrayOfString[i1] = "--";
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            String str;
            arrayOfString[i1] = "--";
            continue;
            int i2 = getResources().getColor(2131492932);
          }
        }
        str = paramh.a(k, "1026");
        if ((str == null) || (!str.equals("0"))) {
          break;
        }
        i2 = -65536;
        arrayOfString[i1] = o.c(this.L[i1], arrayOfString[i1]);
        arrayOfInt[i1] = i2;
        i1 += 1;
      }
      label334:
      localmh.a = arrayOfString;
      localmh.b = arrayOfInt;
      paramj.add(localmh);
      k += 1;
    }
    this.f.a(paramj, this.U);
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903523);
    a();
    c();
    d();
    a(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\StructuredFundQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */