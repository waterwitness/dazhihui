package com.android.dazhihui.ui.delegate.screen.margin;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.TradeText;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MarginQuery
  extends DelegateBaseActivity
  implements cp, cs
{
  public static String a;
  public static final String[] b = { "人民币", "美元", "港币" };
  private int A;
  private String B;
  private int C;
  private int D;
  private int E;
  private String F;
  private int G;
  private int H = 20;
  private com.android.dazhihui.a.b.u I = null;
  private DatePickerDialog.OnDateSetListener J = new bq(this);
  private DatePickerDialog.OnDateSetListener K = new br(this);
  private Calendar L = Calendar.getInstance();
  private DzhHeader c;
  private LinearLayout d;
  private LinearLayout e;
  private LinearLayout f;
  private LinearLayout g;
  private LinearLayout h;
  private Spinner i;
  private TableLayoutGroup j;
  private TextView m;
  private TextView n;
  private Button o;
  private ImageView p;
  private RelativeLayout q;
  private EditText r;
  private Button s;
  private int t;
  private int u;
  private String v;
  private String[] w;
  private String[] x;
  private int y;
  private int z;
  
  private void a()
  {
    this.c = ((DzhHeader)findViewById(2131558643));
    this.d = ((LinearLayout)findViewById(2131558774));
    this.e = ((LinearLayout)findViewById(2131558775));
    this.f = ((LinearLayout)findViewById(2131558776));
    this.g = ((LinearLayout)findViewById(2131558888));
    this.h = ((LinearLayout)findViewById(2131560928));
    this.i = ((Spinner)findViewById(2131559748));
    this.j = ((TableLayoutGroup)findViewById(2131558887));
    this.m = ((TextView)findViewById(2131558687));
    this.n = ((TextView)findViewById(2131558688));
    this.o = ((Button)findViewById(2131558777));
    this.p = ((ImageView)findViewById(2131558889));
    this.q = ((RelativeLayout)findViewById(2131559791));
    this.r = ((EditText)findViewById(2131559140));
    this.s = ((Button)findViewById(2131559792));
  }
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    int i1 = this.G;
    int i2 = this.H;
    com.android.dazhihui.ui.delegate.b.h localh = o.g(this.t + "");
    switch (this.t)
    {
    }
    for (;;)
    {
      this.I = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.I);
      a(this.I, paramBoolean);
      return;
      localh.a("1206", i1).a("1277", i2).a("1036", "").a("1026", "2");
      continue;
      localh.a("1206", i1).a("1277", i2).a("1036", "").a("1026", "2").a("1217", 1);
      continue;
      localh.a("1022", this.B).a("1023", this.F).a("1206", i1).a("1277", i2);
      continue;
      localh.a("1022", this.B).a("1023", this.F).a("1206", i1).a("1277", i2).a("1028", 0);
      continue;
      int k = 9;
      if (a == "1")
      {
        k = this.i.getSelectedItemPosition();
        k = o.k(b[k]);
      }
      localh.a("1022", this.B).a("1023", this.F).a("1206", i1).a("1277", i2).a("1028", "" + k);
      continue;
      localh.a("1206", i1).a("1277", i2).a("1028", "0");
      continue;
      localh.a("1206", i1).a("1277", i2).a("1019", "").a("1036", "");
      continue;
      localh.a("1022", this.B).a("1023", this.F).a("1036", "").a("1206", i1).a("1277", i2);
      continue;
      localh.a("1022", this.B).a("1023", this.F).a("1036", "").a("1206", i1).a("1277", i2);
      continue;
      localh.a("1206", i1).a("1277", i2);
      continue;
      localh.a("1206", i1).a("1277", i2);
      continue;
      localh.a("1206", i1).a("1277", i2);
    }
  }
  
  private void b()
  {
    this.G = 0;
    this.H = 20;
    this.j.a();
  }
  
  private void c()
  {
    Object localObject = getIntent().getExtras();
    if (localObject != null) {
      this.t = ((Bundle)localObject).getInt("category");
    }
    switch (this.t)
    {
    default: 
      this.c.a(this, this);
      if ((this.t == 12146) || (this.t == 12144) || (this.t == 12510) || (this.t == 12522) || (this.t == 12148) || (this.t == 12412) || (this.t == 12322) || (this.t == 12324))
      {
        this.d.setVisibility(0);
        this.B = o.x();
        this.y = Integer.parseInt(this.B.substring(0, 4));
        this.z = Integer.parseInt(this.B.substring(4, 6));
        this.A = Integer.parseInt(this.B.substring(6, 8));
        this.m.setText(this.y + "-" + this.z + "-" + this.A);
        this.F = o.y();
        this.C = Integer.parseInt(this.F.substring(0, 4));
        this.D = Integer.parseInt(this.F.substring(4, 6));
        this.E = Integer.parseInt(this.F.substring(6, 8));
        this.n.setText(this.C + "-" + this.D + "-" + this.E);
        label469:
        if (this.t == 12412)
        {
          if (!a.equals("0")) {
            break label1326;
          }
          this.h.setVisibility(8);
        }
      }
      break;
    }
    for (;;)
    {
      if ((this.t == 12154) || (this.t == 12254) || (this.t == 12152)) {
        this.q.setVisibility(0);
      }
      this.j.setVisibility(0);
      this.g.setVisibility(8);
      if ((this.w == null) || (this.x == null))
      {
        this.w = new String[] { "" };
        this.x = new String[] { "" };
      }
      this.j.setHeaderColumn(this.w);
      this.j.setPullDownLoading(false);
      this.j.setColumnClickable(null);
      this.j.setContinuousLoading(true);
      this.j.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.j.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.j.setDrawHeaderSeparateLine(false);
      this.j.setHeaderTextColor(getResources().getColor(2131493099));
      this.j.setHeaderFontSize(getResources().getDimension(2131230899));
      this.j.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.j.setLeftPadding(25);
      this.j.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.j.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.j.setStockNameColor(getResources().getColor(2131493235));
      this.j.setFirstColumnColorDifferent(true);
      this.j.setOnLoadingListener(new bo(this));
      this.j.setOnTableLayoutClickListener(new bp(this));
      return;
      this.v = "当日委托";
      this.p.setVisibility(4);
      this.w = a.aI;
      this.x = a.aJ;
      break;
      this.v = "当日成交";
      this.p.setVisibility(4);
      this.w = a.aK;
      this.x = a.aL;
      break;
      this.v = "历史委托";
      this.p.setVisibility(4);
      this.w = a.aY;
      this.x = a.aZ;
      break;
      this.v = "历史成交";
      this.p.setVisibility(4);
      this.w = a.bc;
      this.x = a.bd;
      break;
      this.v = "新股配号";
      this.p.setVisibility(8);
      this.w = a.bC;
      this.x = a.bD;
      break;
      this.v = "新股中签";
      this.p.setVisibility(8);
      this.w = a.bE;
      this.x = a.bF;
      break;
      this.v = "资金流水";
      this.p.setVisibility(8);
      this.w = a.be;
      this.x = a.bf;
      break;
      this.v = "交割单";
      this.p.setVisibility(8);
      this.w = a.by;
      this.x = a.bz;
      break;
      this.v = "未偿还融资负债";
      this.p.setVisibility(8);
      this.w = a.aO;
      this.x = a.aP;
      break;
      this.v = "未偿还融券负债";
      this.p.setVisibility(8);
      this.w = a.aQ;
      this.x = a.aR;
      break;
      this.v = "已偿还融资负债";
      this.p.setVisibility(8);
      this.w = a.bo;
      this.x = a.bp;
      break;
      this.v = "已偿还融券负债";
      this.p.setVisibility(8);
      this.w = a.bq;
      this.x = a.br;
      break;
      this.v = "担保品证券查询";
      this.p.setVisibility(8);
      this.w = a.aW;
      this.x = a.aX;
      break;
      this.v = "融券券源查询";
      this.p.setVisibility(8);
      this.w = a.aU;
      this.x = a.aV;
      break;
      this.p.setVisibility(8);
      this.v = "融券标的查询";
      this.w = a.bk;
      this.x = a.bl;
      break;
      this.d.setVisibility(8);
      break label469;
      label1326:
      if (a.equals("1"))
      {
        this.h.setVisibility(0);
        localObject = new ArrayAdapter(this, 17367048, b);
        ((ArrayAdapter)localObject).setDropDownViewResource(17367049);
        this.i.setAdapter((SpinnerAdapter)localObject);
      }
    }
  }
  
  private void d()
  {
    bs localbs = new bs(this);
    this.o.setOnClickListener(localbs);
    this.e.setOnClickListener(localbs);
    this.f.setOnClickListener(localbs);
    this.s.setOnClickListener(localbs);
  }
  
  private void d(String paramString)
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g(this.t + "");
    switch (this.t)
    {
    }
    for (;;)
    {
      this.I = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.I);
      a(this.I, true);
      return;
      localh.a("1036", paramString).a("1206", 0).a("1277", 1);
      continue;
      localh.a("1036", paramString).a("1206", 0).a("1277", 1);
      continue;
      localh.a("1036", paramString).a("1206", 0).a("1277", 1);
    }
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
  
  public void a(mh parammh, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    String[] arrayOfString = parammh.a;
    StringBuffer localStringBuffer = new StringBuffer();
    paramInt = 0;
    while (paramInt < arrayOfString.length)
    {
      paramArrayOfString2 = arrayOfString[paramInt];
      parammh = paramArrayOfString2;
      if (paramArrayOfString2 == null) {
        parammh = "-";
      }
      localStringBuffer.append("\n").append(paramArrayOfString1[paramInt]).append(": ").append(parammh);
      paramInt += 1;
    }
    parammh = new Bundle();
    parammh.putString("str", localStringBuffer.toString());
    startActivity(TradeText.class, parammh);
  }
  
  public void b(int paramInt)
  {
    Toast localToast = Toast.makeText(this, "", 0);
    localToast.setGravity(17, 0, 0);
    switch (paramInt)
    {
    default: 
      return;
    }
    localToast.setText("请输入完整的6位代码！");
    localToast.show();
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.p = this;
    paramct.d = this.v;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.c = paramDzhHeader;
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
        } while (paramh != this.I);
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
      paramh.g();
      this.u = paramh.b("1289");
      i3 = paramh.g();
      if ((i3 == 0) && (this.j.getDataModel().size() == 0))
      {
        this.j.setBackgroundResource(2130838490);
        return;
      }
      this.j.setBackgroundColor(getResources().getColor(2131493677));
    } while (i3 <= 0);
    paramj = new ArrayList();
    int i1 = 0;
    while (i1 < i3)
    {
      mh localmh = new mh();
      String[] arrayOfString = new String[this.w.length];
      int[] arrayOfInt = new int[this.w.length];
      int i2 = 0;
      for (;;)
      {
        if (i2 >= this.w.length) {
          break label362;
        }
        try
        {
          arrayOfString[i2] = paramh.a(i1, this.x[i2]).trim();
          if (arrayOfString[i2] == null) {
            arrayOfString[i2] = "--";
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            String str;
            int k;
            arrayOfString[i2] = "--";
            continue;
            if ((localException != null) && (localException.equals("1"))) {
              k = getResources().getColor(2131492932);
            } else {
              k = -16777216;
            }
          }
        }
        str = paramh.a(i1, "1026");
        if ((str == null) || (!str.equals("0"))) {
          break;
        }
        k = -65536;
        arrayOfString[i2] = o.c(this.x[i2], arrayOfString[i2]);
        arrayOfInt[i2] = k;
        i2 += 1;
      }
      label362:
      localmh.a = arrayOfString;
      localmh.b = arrayOfInt;
      paramj.add(localmh);
      i1 += 1;
    }
    this.j.a(paramj, this.G);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\MarginQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */