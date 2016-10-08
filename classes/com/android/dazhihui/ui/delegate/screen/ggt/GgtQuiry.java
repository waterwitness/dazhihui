package com.android.dazhihui.ui.delegate.screen.ggt;

import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.TradeText;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
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

public class GgtQuiry
  extends DelegateBaseActivity
  implements cp, cs
{
  private int A;
  private int B;
  private int C;
  private int D;
  private int E;
  private int F;
  private DzhHeader G;
  private String H;
  private boolean I;
  private String J;
  private int K;
  private int L;
  private mh M;
  private com.android.dazhihui.a.b.u N;
  private com.android.dazhihui.a.b.u O;
  private DatePickerDialog.OnDateSetListener P = new y(this);
  private DatePickerDialog.OnDateSetListener Q = new z(this);
  protected boolean a = true;
  protected int b = 0;
  protected int c = 0;
  protected int d = 0;
  public String[][] e = (String[][])null;
  public int[][] f = (int[][])null;
  LinearLayout g;
  private int h = 20;
  private int i = 0;
  private int j = 0;
  private byte m = 1;
  private TableLayoutGroup n;
  private String[] o;
  private String[] p;
  private String q;
  private String r;
  private int s = 0;
  private TextView t;
  private TextView u;
  private EditText v;
  private EditText w;
  private Button x;
  private LinearLayout y;
  private int z = 1;
  
  private void a(boolean paramBoolean)
  {
    com.android.dazhihui.ui.delegate.b.h localh = null;
    if (!o.r()) {
      return;
    }
    switch (this.K)
    {
    }
    for (;;)
    {
      this.N = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.N);
      a(this.N, paramBoolean);
      return;
      localh = o.g(String.valueOf(this.K));
      localh.a("1026", "").a("1206", this.i).a("1277", this.h).a("2315", "3");
      continue;
      localh = o.g(String.valueOf(this.K));
      localh.a("1026", "").a("1214", 0).a("1206", this.i).a("1277", this.h).a("2315", "3");
      continue;
      localh = o.g(String.valueOf(this.K));
      localh.a("1026", "").a("1206", this.i).a("1277", this.h).a("2315", "3");
      continue;
      localh = o.g(String.valueOf(this.K));
      localh.a("1026", "").a("1022", this.q).a("1023", this.r).a("1206", this.i).a("1277", this.h).a("2315", "3");
      continue;
      localh = o.g(String.valueOf(this.K));
      localh.a("1026", "").a("1022", this.q).a("1023", this.r).a("1206", this.i).a("1277", this.h).a("2315", "3");
      continue;
      localh = o.g(String.valueOf(this.K));
      localh.a("1022", this.q).a("1023", this.r).a("1206", this.i).a("1277", this.h).a("2315", "3");
    }
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
    this.G = ((DzhHeader)findViewById(2131558513));
    this.G.a(this, this);
    this.g = ((LinearLayout)findViewById(2131558879));
    this.n = ((TableLayoutGroup)findViewById(2131558885));
    this.n.setHeaderColumn(this.o);
    this.n.setPullDownLoading(false);
    this.n.setColumnClickable(null);
    this.n.setContinuousLoading(true);
    this.n.setHeaderBackgroundColor(getResources().getColor(2131493677));
    this.n.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
    this.n.setDrawHeaderSeparateLine(false);
    this.n.setHeaderTextColor(getResources().getColor(2131493099));
    this.n.setHeaderFontSize(getResources().getDimension(2131230899));
    this.n.setHeaderHeight((int)getResources().getDimension(2131230814));
    this.n.setLeftPadding(25);
    this.n.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.n.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.n.setStockNameColor(getResources().getColor(2131493235));
    this.n.setFirstColumnColorDifferent(true);
    this.n.setOnLoadingListener(new q(this));
    this.n.setOnTableLayoutClickListener(new u(this));
  }
  
  private void f()
  {
    this.K = getIntent().getExtras().getInt("screenId");
    switch (this.K)
    {
    default: 
      return;
    case 12656: 
      this.o = GgtTradeMenu.x;
      this.p = GgtTradeMenu.y;
      this.H = GgtTradeMenu.f;
      return;
    case 12658: 
      this.o = GgtTradeMenu.B;
      this.p = GgtTradeMenu.C;
      this.H = GgtTradeMenu.i;
      return;
    case 12660: 
      this.o = GgtTradeMenu.z;
      this.p = GgtTradeMenu.A;
      this.H = GgtTradeMenu.h;
      return;
    case 12662: 
      this.o = GgtTradeMenu.F;
      this.p = GgtTradeMenu.G;
      this.H = GgtTradeMenu.m;
      return;
    case 12664: 
      this.o = GgtTradeMenu.D;
      this.p = GgtTradeMenu.E;
      this.H = GgtTradeMenu.j;
      return;
    }
    this.o = GgtTradeMenu.H;
    this.p = GgtTradeMenu.I;
    this.H = GgtTradeMenu.n;
  }
  
  private void g()
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12652");
    if (this.J == null) {}
    for (String str = "";; str = this.J)
    {
      localh.a("1800", str).a("2315", "3");
      this.O = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.O);
      a(this.O, true);
      return;
    }
  }
  
  private void h()
  {
    this.v.setText(new StringBuilder().append(d(this.A)).append(d(this.B + 1)).append(d(this.C)));
  }
  
  private void i()
  {
    this.w.setText(new StringBuilder().append(d(this.D)).append(d(this.E + 1)).append(d(this.F)));
  }
  
  private void j()
  {
    if ((this.L < 0) || (this.L >= this.n.getDataModel().size())) {
      return;
    }
    String[] arrayOfString = this.M.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    while (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      localStringBuffer.append("\n").append(this.o[k]).append(": ").append((String)localObject);
      k += 1;
    }
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("str", localStringBuffer.toString());
    startActivity(TradeText.class, (Bundle)localObject);
  }
  
  private void k()
  {
    if ((this.L < 0) || (this.L > this.d)) {
      return;
    }
    Hashtable localHashtable = c(this.L);
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
      if (localHashtable.get("1036") != null) {
        break label397;
      }
      str2 = "";
      if (localHashtable.get("1037") != null) {
        break label412;
      }
      str3 = "";
      if (localHashtable.get("1040") != null) {
        break label427;
      }
      str4 = "";
      if (localHashtable.get("1041") != null) {
        break label443;
      }
      str5 = "";
      if (localHashtable.get("1042") != null) {
        break label459;
      }
      str6 = "";
      label125:
      if (localHashtable.get("1027") != null) {
        break label475;
      }
    }
    label397:
    label412:
    label427:
    label443:
    label459:
    label475:
    for (String str7 = "";; str7 = (String)localHashtable.get("1027"))
    {
      this.J = ((String)localHashtable.get("1800"));
      localStringBuffer.append("合同号：" + str6).append("\n委托时间：" + str1).append("\n证券代码：" + str2).append("\n证券名称：" + str3).append("\n买卖说明：" + str7).append("\n委托价格：" + str5).append("\n委托数量：" + str4);
      new AlertDialog.Builder(this).setTitle("您确认撤单么？").setMessage(localStringBuffer.toString()).setCancelable(false).setPositiveButton(2131165363, new s(this)).setNegativeButton(2131165331, new r(this)).show();
      return;
      str1 = (String)localHashtable.get("1039");
      break;
      str2 = (String)localHashtable.get("1036");
      break label66;
      str3 = (String)localHashtable.get("1037");
      break label80;
      str4 = (String)localHashtable.get("1040");
      break label95;
      str5 = (String)localHashtable.get("1041");
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
    this.y = ((LinearLayout)findViewById(2131558879));
    this.t = ((TextView)findViewById(2131560632));
    this.u = ((TextView)findViewById(2131560634));
    this.v = ((EditText)findViewById(2131558880));
    this.w = ((EditText)findViewById(2131558882));
    this.x = ((Button)findViewById(2131558883));
    if ((this.K == 12662) || (this.K == 12664) || (this.K == 12676))
    {
      this.y.setVisibility(0);
      if (this.s != 0) {
        break label331;
      }
      this.q = o.w();
      this.r = o.y();
      this.v.setText(this.q);
      this.w.setText(this.r);
    }
    for (;;)
    {
      this.v.setOnClickListener(new v(this));
      this.w.setOnClickListener(new w(this));
      this.x.setOnClickListener(new x(this));
      this.A = Integer.valueOf(this.v.getText().toString().substring(0, 4)).intValue();
      this.B = (Integer.valueOf(this.v.getText().toString().substring(4, 6)).intValue() - 1);
      this.C = Integer.valueOf(this.v.getText().toString().substring(6, 8)).intValue();
      Calendar localCalendar = Calendar.getInstance();
      this.D = localCalendar.get(1);
      this.E = localCalendar.get(2);
      this.F = localCalendar.get(5);
      return;
      this.y.setVisibility(8);
      return;
      label331:
      this.q = this.v.getText().toString();
      this.r = this.w.getText().toString();
    }
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
    if (!this.I) {
      return;
    }
    this.i = 0;
    this.n.a();
    this.q = this.v.getText().toString();
    this.r = this.w.getText().toString();
    a(true);
    this.I = false;
  }
  
  public void c()
  {
    if (12656 == this.K)
    {
      k();
      return;
    }
    j();
  }
  
  protected void changeLookFace(com.android.dazhihui.ui.screen.y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (t.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.G == null);
      this.G.a(paramy);
      return;
    } while (this.G == null);
    this.G.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = this.H;
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.G = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((com.android.dazhihui.a.b.v)paramj).b();
    if (com.android.dazhihui.ui.delegate.b.u.a(paramj, this))
    {
      if (paramh != this.N) {
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
    while (paramh != this.O)
    {
      do
      {
        return;
        this.I = true;
        this.b = paramh.g();
        this.d = paramh.b("1289");
        if ((this.b == 0) && (this.n.getDataModel().size() <= 0))
        {
          this.n.setBackgroundResource(2130838490);
          return;
        }
        this.n.setBackgroundResource(2130839011);
        paramj = new ArrayList();
        new StringBuilder();
      } while (this.b <= 0);
      int k = 0;
      while (k < this.b)
      {
        mh localmh = new mh();
        String[] arrayOfString = new String[this.o.length];
        int[] arrayOfInt = new int[this.o.length];
        int i1 = 0;
        for (;;)
        {
          if (i1 < this.o.length) {
            try
            {
              arrayOfString[i1] = paramh.a(k, this.p[i1]).trim();
              arrayOfString[i1] = o.c(this.p[i1], arrayOfString[i1]);
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
      a(paramh, this.i);
      this.n.a(paramj, this.i);
      return;
    }
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (!paramh.b())
    {
      c(paramh.d());
      return;
    }
    this.b = paramh.g();
    new AlertDialog.Builder(this).setMessage(paramh.a(0, "1208")).setPositiveButton(2131165363, new ab(this)).setOnCancelListener(new aa(this)).show();
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (paramh == this.N) {
      this.n.d();
    }
    if (this == b.a().f()) {
      b(1);
    }
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903487);
    f();
    d();
    a();
    a(true);
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (paramh == this.N) {
      this.n.d();
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
      localDatePickerDialog = new DatePickerDialog(this, this.P, this.A, this.B, this.C);
      localDatePickerDialog.setTitle("请选择开始日期");
      return localDatePickerDialog;
    }
    DatePickerDialog localDatePickerDialog = new DatePickerDialog(this, this.Q, this.D, this.E, this.F);
    localDatePickerDialog.setTitle("请选择结束日期");
    return localDatePickerDialog;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\GgtQuiry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */