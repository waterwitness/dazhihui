package com.android.dazhihui.ui.delegate.screen.otc;

import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.TradeText;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;

public class OtcQuery
  extends DelegateBaseActivity
  implements cp, cs
{
  private int A;
  private int B;
  private boolean C;
  private boolean D = false;
  private boolean E = false;
  private String F = "";
  private String G;
  private int H;
  private int I;
  private mh J;
  private com.android.dazhihui.a.b.u K;
  private com.android.dazhihui.a.b.u L;
  private DatePickerDialog.OnDateSetListener M = new ah(this);
  private DatePickerDialog.OnDateSetListener N = new ai(this);
  protected int a = 0;
  protected int b = 0;
  protected int c = 0;
  public String[][] d = (String[][])null;
  public int[][] e = (int[][])null;
  private int f = 20;
  private int g = 0;
  private int h = 0;
  private TableLayoutGroup i;
  private DzhHeader j;
  private LinearLayout m;
  private EditText n;
  private EditText o;
  private Button p;
  private LinearLayout q;
  private String[] r = { "", "", "" };
  private String[] s = { "", "", "" };
  private String t;
  private String u;
  private int v = 0;
  private int w;
  private int x;
  private int y;
  private int z;
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = null;
    switch (this.H)
    {
    }
    for (;;)
    {
      this.K = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.K);
      a(this.K, paramBoolean);
      return;
      localh = o.g(String.valueOf(this.H));
      localh.a("1206", this.g).a("1277", this.f).a("2315", "2");
      continue;
      localh = o.g(String.valueOf(this.H));
      localh.a("1206", this.g).a("1277", this.f).a("2315", "2");
      continue;
      localh = o.g(String.valueOf(this.H));
      localh.a("1206", this.g).a("1277", this.f).a("1214", "0").a("2315", "2");
      continue;
      localh = o.g(String.valueOf(this.H));
      localh.a("1206", this.g).a("1277", this.f).a("2315", "2");
      continue;
      localh = o.g(String.valueOf(this.H));
      localh.a("1022", this.t).a("1023", this.u).a("1206", this.g).a("1277", this.f).a("2315", "2");
      continue;
      localh = o.g(String.valueOf(this.H));
      localh.a("1022", this.t).a("1023", this.u).a("1206", this.g).a("1277", this.f).a("2315", "2");
    }
  }
  
  private void c()
  {
    this.j = ((DzhHeader)findViewById(2131558513));
    this.j.setOnHeaderButtonClickListener(this);
    this.j.a(this, this);
    this.m = ((LinearLayout)findViewById(2131558879));
    this.i = ((TableLayoutGroup)findViewById(2131558885));
    this.i.setHeaderColumn(this.r);
    this.i.setPullDownLoading(false);
    this.i.setColumnClickable(null);
    this.i.setContinuousLoading(true);
    this.i.setHeaderBackgroundColor(getResources().getColor(2131493677));
    this.i.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
    this.i.setDrawHeaderSeparateLine(false);
    this.i.setHeaderTextColor(getResources().getColor(2131493099));
    this.i.setHeaderFontSize(getResources().getDimension(2131230899));
    this.i.setHeaderHeight((int)getResources().getDimension(2131230814));
    this.i.setLeftPadding(25);
    this.i.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.i.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.i.setStockNameColor(getResources().getColor(2131493235));
    this.i.setFirstColumnColorDifferent(true);
    this.i.setOnLoadingListener(new z(this));
    this.i.setOnTableLayoutClickListener(new ad(this));
  }
  
  private static String d(int paramInt)
  {
    if (paramInt >= 10) {
      return String.valueOf(paramInt);
    }
    return "0" + String.valueOf(paramInt);
  }
  
  private void d()
  {
    this.q = ((LinearLayout)findViewById(2131558879));
    this.n = ((EditText)findViewById(2131558880));
    this.o = ((EditText)findViewById(2131558882));
    this.p = ((Button)findViewById(2131558883));
    if ((this.H == 12708) || (this.H == 12706))
    {
      this.q.setVisibility(0);
      if (this.v != 0) {
        break label293;
      }
      this.t = o.w();
      this.u = o.y();
      this.n.setText(this.t);
      this.o.setText(this.u);
    }
    for (;;)
    {
      this.n.setOnClickListener(new ae(this));
      this.o.setOnClickListener(new af(this));
      this.p.setOnClickListener(new ag(this));
      this.w = Integer.valueOf(this.n.getText().toString().substring(0, 4)).intValue();
      this.x = (Integer.valueOf(this.n.getText().toString().substring(4, 6)).intValue() - 1);
      this.y = Integer.valueOf(this.n.getText().toString().substring(6, 8)).intValue();
      Calendar localCalendar = Calendar.getInstance();
      this.z = localCalendar.get(1);
      this.A = localCalendar.get(2);
      this.B = localCalendar.get(5);
      return;
      this.q.setVisibility(8);
      return;
      label293:
      this.t = this.n.getText().toString();
      this.u = this.o.getText().toString();
    }
  }
  
  private void f()
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12700");
    if (this.G == null) {}
    for (String str = "";; str = this.G)
    {
      localh.a("1800", str).a("2315", "2");
      this.L = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.L);
      a(this.L, true);
      return;
    }
  }
  
  private void g()
  {
    this.H = getIntent().getExtras().getInt("screenId");
    switch (this.H)
    {
    default: 
      return;
    case 12692: 
      this.F = "产品查询";
      this.r = w.a;
      this.s = w.b;
      return;
    case 12698: 
      this.F = "产品撤单";
      this.r = w.c;
      this.s = w.d;
      return;
    case 12702: 
      this.F = "当日委托查询";
      this.r = w.e;
      this.s = w.f;
      return;
    case 12704: 
      this.F = "当日成交查询";
      this.r = w.g;
      this.s = w.h;
      return;
    case 12708: 
      this.F = "历史成交查询";
      this.r = w.i;
      this.s = w.j;
      return;
    }
    this.F = "历史委托查询";
    this.r = w.k;
    this.s = w.l;
  }
  
  private void h()
  {
    this.n.setText(new StringBuilder().append(d(this.w)).append(d(this.x + 1)).append(d(this.y)));
  }
  
  private void i()
  {
    this.o.setText(new StringBuilder().append(d(this.z)).append(d(this.A + 1)).append(d(this.B)));
  }
  
  private void j()
  {
    if ((this.I < 0) || (this.I > this.c)) {
      return;
    }
    String[] arrayOfString = this.J.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    while (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      localStringBuffer.append("\n").append(this.r[k]).append(": ").append((String)localObject);
      k += 1;
    }
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("str", localStringBuffer.toString());
    startActivity(TradeText.class, (Bundle)localObject);
  }
  
  private void k()
  {
    if ((this.I < 0) || (this.I > this.c)) {
      return;
    }
    Hashtable localHashtable = c(this.I);
    StringBuffer localStringBuffer = new StringBuffer();
    String str1;
    String str2;
    label66:
    String str3;
    label80:
    String str4;
    label95:
    String str5;
    label110:
    String str6;
    if (localHashtable.get("1039") == null)
    {
      str1 = "";
      if (localHashtable.get("1017") != null) {
        break label397;
      }
      str2 = "";
      if (localHashtable.get("2363") != null) {
        break label412;
      }
      str3 = "";
      if (localHashtable.get("1040") != null) {
        break label427;
      }
      str4 = "";
      if (localHashtable.get("1044") != null) {
        break label443;
      }
      str5 = "";
      if (localHashtable.get("1042") != null) {
        break label459;
      }
      str6 = "";
      label125:
      if (localHashtable.get("1043") != null) {
        break label475;
      }
    }
    label397:
    label412:
    label427:
    label443:
    label459:
    label475:
    for (String str7 = "";; str7 = (String)localHashtable.get("1043"))
    {
      this.G = ((String)localHashtable.get("1800"));
      localStringBuffer.append("合同号：" + str6).append("\n委托时间：" + str1).append("\n产品代码：" + str2).append("\n产品名称：" + str3).append("\n买卖说明：" + str7).append("\n委托价格：" + str5).append("\n委托数量：" + str4);
      new AlertDialog.Builder(this).setTitle("您确认撤单么？").setMessage(localStringBuffer.toString()).setCancelable(false).setPositiveButton(2131165363, new ab(this)).setNegativeButton(2131165331, new aa(this)).show();
      return;
      str1 = (String)localHashtable.get("1039");
      break;
      str2 = (String)localHashtable.get("1017");
      break label66;
      str3 = (String)localHashtable.get("2363");
      break label80;
      str4 = (String)localHashtable.get("1040");
      break label95;
      str5 = (String)localHashtable.get("1044");
      break label110;
      str6 = (String)localHashtable.get("1042");
      break label125;
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
  
  public void a()
  {
    if (!this.C) {
      return;
    }
    this.g = 0;
    this.i.a();
    this.t = this.n.getText().toString();
    this.u = this.o.getText().toString();
    a(true);
    this.C = false;
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0)
    {
      c("　　起始日期和结束日期都必须填写。");
      return;
    }
    if (paramInt == 1)
    {
      c("　　起始日期、结束日期未填写完整。");
      return;
    }
    c("　　起始日期,不能比结束日期晚。");
  }
  
  public void b()
  {
    if (12698 == this.H)
    {
      k();
      return;
    }
    j();
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (ac.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.j == null);
      this.j.a(paramy);
      return;
    } while (this.j == null);
    this.j.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = this.F;
  }
  
  public void getTitle(DzhHeader paramDzhHeader) {}
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (com.android.dazhihui.ui.delegate.b.u.a(paramj, this))
    {
      if (paramh != this.K) {
        break label325;
      }
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (paramh.b()) {
        break label54;
      }
      c(paramh.d());
    }
    label54:
    label325:
    while (paramh != this.L)
    {
      do
      {
        return;
        this.C = true;
        this.a = paramh.g();
        this.c = paramh.b("1289");
        if ((this.a == 0) && (this.i.getDataModel().size() <= 0))
        {
          this.i.setBackgroundResource(2130838490);
          return;
        }
        this.i.setBackgroundResource(2130839011);
        paramj = new ArrayList();
        new StringBuilder();
      } while (this.a <= 0);
      int k = 0;
      while (k < this.a)
      {
        mh localmh = new mh();
        String[] arrayOfString = new String[this.r.length];
        int[] arrayOfInt = new int[this.r.length];
        int i1 = 0;
        for (;;)
        {
          if (i1 < this.r.length) {
            try
            {
              arrayOfString[i1] = paramh.a(k, this.s[i1]).trim();
              arrayOfString[i1] = o.c(this.s[i1], arrayOfString[i1]);
              arrayOfInt[i1] = getResources().getColor(2131493235);
              i1 += 1;
            }
            catch (Exception localException)
            {
              for (;;)
              {
                arrayOfString[i1] = "-";
              }
            }
          }
        }
        localmh.a = arrayOfString;
        localmh.b = arrayOfInt;
        paramj.add(localmh);
        k += 1;
      }
      a(paramh, this.g);
      this.i.a(paramj, this.g);
      return;
    }
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (!paramh.b())
    {
      c(paramh.d());
      return;
    }
    this.a = paramh.g();
    if ((this.a == 0) && (this.i.getDataModel().size() <= 0))
    {
      this.i.setBackgroundResource(2130838490);
      return;
    }
    new AlertDialog.Builder(this).setTitle(2131166406).setMessage(paramh.a(0, "1208")).setPositiveButton(2131165363, new ak(this)).setOnCancelListener(new aj(this)).show();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.K) {
      this.i.d();
    }
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903520);
    g();
    c();
    d();
    a(true);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.K) {
      this.i.d();
    }
    if (this == b.a().f()) {
      b(9);
    }
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      localDatePickerDialog = new DatePickerDialog(this, this.M, this.w, this.x, this.y);
      localDatePickerDialog.setTitle("请选择开始日期");
      return localDatePickerDialog;
    }
    DatePickerDialog localDatePickerDialog = new DatePickerDialog(this, this.N, this.z, this.A, this.B);
    localDatePickerDialog.setTitle("请选择结束日期");
    return localDatePickerDialog;
  }
  
  public void onOptionMenuSelect(int paramInt) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\OtcQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */