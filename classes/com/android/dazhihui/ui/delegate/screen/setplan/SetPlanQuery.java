package com.android.dazhihui.ui.delegate.screen.setplan;

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

public class SetPlanQuery
  extends DelegateBaseActivity
  implements cp, cs
{
  private int A;
  private int B;
  private boolean C;
  private String D = "";
  private String E;
  private int F;
  private int G;
  private mh H;
  private com.android.dazhihui.a.b.u I;
  private com.android.dazhihui.a.b.u J;
  private DatePickerDialog.OnDateSetListener K = new ah(this);
  private DatePickerDialog.OnDateSetListener L = new ai(this);
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
    if (this.F == 12848)
    {
      localh = o.g(String.valueOf(12848));
      localh.a("6002", "").a("6003", "").a("1552", "").a("1206", this.g).a("1277", this.f).a("2315", "2");
    }
    for (;;)
    {
      this.I = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.I);
      a(this.I, paramBoolean);
      return;
      if (this.F == 12860)
      {
        localh = o.g(String.valueOf(12860));
        localh.a("6002", "").a("6003", "").a("1026", "").a("1042", "").a("1206", this.g).a("1277", this.f).a("1552", "").a("2315", "2");
      }
      else if (this.F == 12862)
      {
        localh = o.g(String.valueOf(12862));
        localh.a("1022", this.t).a("1023", this.u).a("6002", "").a("6003", "").a("1026", "").a("1206", this.g).a("1277", this.f).a("1552", "").a("2315", "2");
      }
      else if (this.F == 12864)
      {
        localh = o.g(String.valueOf(12864));
        localh.a("1022", this.t).a("1023", this.u).a("6002", "").a("6003", "").a("1026", "").a("1206", this.g).a("1277", this.f).a("1552", "").a("2315", "2");
      }
    }
  }
  
  private void c()
  {
    this.F = getIntent().getExtras().getInt("screenId");
    if (this.F == 12848)
    {
      this.D = "产品查询";
      this.r = x.a;
      this.s = x.b;
    }
    do
    {
      return;
      if (this.F == 12862)
      {
        this.D = "历史委托查询";
        this.r = x.e;
        this.s = x.f;
        return;
      }
      if (this.F == 12864)
      {
        this.D = "成交查询";
        this.r = x.g;
        this.s = x.h;
        return;
      }
    } while (this.F != 12860);
    this.D = "当日委托/撤单";
    this.r = x.c;
    this.s = x.d;
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
    this.i.setOnLoadingListener(new aa(this));
    this.i.setOnTableLayoutClickListener(new ad(this));
  }
  
  private void f()
  {
    this.q = ((LinearLayout)findViewById(2131558879));
    this.n = ((EditText)findViewById(2131558880));
    this.o = ((EditText)findViewById(2131558882));
    this.p = ((Button)findViewById(2131558883));
    if ((this.F == 12862) || (this.F == 12864))
    {
      this.q.setVisibility(0);
      if (this.v != 0) {
        break label294;
      }
      this.t = o.x();
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
      label294:
      this.t = this.n.getText().toString();
      this.u = this.o.getText().toString();
    }
  }
  
  private void g()
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12852");
    if (this.E == null) {}
    for (String str = "";; str = this.E)
    {
      localh.a("1800", str).a("1552", "").a("2315", "2");
      this.J = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.J);
      a(this.J, true);
      return;
    }
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
    if ((this.G < 0) || (this.G > this.c)) {
      return;
    }
    String[] arrayOfString = this.H.a;
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
    if ((this.G < 0) || (this.G > this.c)) {
      return;
    }
    Hashtable localHashtable = c(this.G);
    StringBuffer localStringBuffer = new StringBuffer();
    String str1;
    String str2;
    label65:
    String str3;
    label79:
    String str4;
    label94:
    String str5;
    if (localHashtable.get("6002") == null)
    {
      str1 = "";
      if (localHashtable.get("2363") != null) {
        break label314;
      }
      str2 = "";
      if (localHashtable.get("1043") != null) {
        break label329;
      }
      str3 = "";
      if (localHashtable.get("1044") != null) {
        break label344;
      }
      str4 = "";
      if (localHashtable.get("1027") != null) {
        break label360;
      }
      str5 = "";
      label109:
      this.E = ((String)localHashtable.get("1800"));
      if ((!str1.equals("申购")) && (!str1.equals("认购"))) {
        break label376;
      }
      localStringBuffer.append("\n产品代码：" + str1).append("\n产品名称：" + str2).append("\n申赎方向：" + str5).append("\n金额：" + str4);
    }
    for (;;)
    {
      new AlertDialog.Builder(this).setTitle("您确认撤单么？").setMessage(localStringBuffer.toString()).setCancelable(false).setPositiveButton(2131165363, new ac(this)).setNegativeButton(2131165331, new ab(this)).show();
      return;
      str1 = (String)localHashtable.get("6002");
      break;
      label314:
      str2 = (String)localHashtable.get("2363");
      break label65;
      label329:
      str3 = (String)localHashtable.get("1043");
      break label79;
      label344:
      str4 = (String)localHashtable.get("1044");
      break label94;
      label360:
      str5 = (String)localHashtable.get("1027");
      break label109;
      label376:
      if (str1.equals("赎回")) {
        localStringBuffer.append("\n产品代码：" + str1).append("\n产品名称：" + str2).append("\n申赎方向：" + str5).append("\n份额：" + str3);
      } else {
        localStringBuffer.append("\n产品代码：" + str1).append("\n产品名称：" + str2).append("\n申赎方向：" + str5).append("\n金额：" + str4).append("\n份额：" + str3);
      }
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
    if (this.F == 12860)
    {
      k();
      return;
    }
    j();
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = this.D;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.j = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (com.android.dazhihui.ui.delegate.b.u.a(paramj, this))
    {
      if (paramh != this.I) {
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
    while (paramh != this.J)
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
    if (paramh == this.I) {
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
    c();
    d();
    f();
    a(true);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.I) {
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
      localDatePickerDialog = new DatePickerDialog(this, this.K, this.w, this.x, this.y);
      localDatePickerDialog.setTitle("请选择开始日期");
      return localDatePickerDialog;
    }
    DatePickerDialog localDatePickerDialog = new DatePickerDialog(this, this.L, this.z, this.A, this.B);
    localDatePickerDialog.setTitle("请选择结束日期");
    return localDatePickerDialog;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\SetPlanQuery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */