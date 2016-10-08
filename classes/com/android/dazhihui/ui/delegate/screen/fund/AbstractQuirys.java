package com.android.dazhihui.ui.delegate.screen.fund;

import android.app.AlertDialog.Builder;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public abstract class AbstractQuirys
  extends DelegateBaseActivity
  implements cp, cs
{
  private EditText A;
  private Button B;
  private int C = 0;
  private int D;
  private int E;
  private int F;
  private int G;
  private int H;
  private int I;
  private boolean J;
  private String[] K;
  private mh L;
  private int M;
  private com.android.dazhihui.a.b.u N;
  private com.android.dazhihui.a.b.u O;
  private DatePickerDialog.OnDateSetListener P = new f(this);
  private DatePickerDialog.OnDateSetListener Q = new g(this);
  protected boolean a = true;
  protected int b = 0;
  protected int c = 0;
  protected int d = 0;
  public String[][] e = (String[][])null;
  public int[][] f = (int[][])null;
  protected int g;
  protected Button h;
  protected String i;
  protected String j;
  protected boolean m = false;
  protected boolean n = false;
  protected boolean o = false;
  protected boolean p = false;
  protected int q;
  private int r = 20;
  private int s = 0;
  private TableLayoutGroup t;
  private String[] u = com.android.dazhihui.ui.delegate.c.a.c;
  private String[] v = com.android.dazhihui.ui.delegate.c.a.d;
  private DzhHeader w;
  private String x;
  private TableLayout y;
  private EditText z;
  
  private void b(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.N = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(a(o.g(String.valueOf(this.g))).h()) });
    registRequestListener(this.N);
    a(this.N, paramBoolean);
  }
  
  private void c(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.i = this.z.getText().toString();
    this.j = this.A.getText().toString();
    this.O = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(b(o.g(String.valueOf(this.g)).a("1022", this.i).a("1023", this.j).a("1206", this.s).a("1277", this.r)).h()) });
    registRequestListener(this.O);
    a(this.O, paramBoolean);
  }
  
  private void d(boolean paramBoolean)
  {
    if (!this.J) {
      return;
    }
    this.s = 0;
    this.t.a();
    e();
    this.i = this.z.getText().toString();
    this.j = this.A.getText().toString();
    c(paramBoolean);
    this.J = false;
  }
  
  private static String g(int paramInt)
  {
    if (paramInt >= 10) {
      return String.valueOf(paramInt);
    }
    return "0" + String.valueOf(paramInt);
  }
  
  private void o()
  {
    this.z.setText(new StringBuilder().append(g(this.D)).append(g(this.E + 1)).append(g(this.F)));
  }
  
  private void p()
  {
    this.A.setText(new StringBuilder().append(g(this.G)).append(g(this.H + 1)).append(g(this.I)));
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  protected com.android.dazhihui.ui.delegate.b.h a(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    return paramh;
  }
  
  protected void a()
  {
    if (this.m) {
      f();
    }
  }
  
  protected abstract void a(Object paramObject);
  
  protected abstract void a(String paramString, com.android.dazhihui.ui.delegate.b.h paramh);
  
  protected void a(String paramString1, String paramString2, String paramString3, Object paramObject)
  {
    new AlertDialog.Builder(this).setTitle(paramString1).setMessage(paramString2).setPositiveButton(paramString3, new i(this, paramObject)).setNegativeButton(2131165331, new h(this)).show();
  }
  
  public void a(boolean paramBoolean)
  {
    if (this.m)
    {
      c(paramBoolean);
      return;
    }
    b(paramBoolean);
  }
  
  public abstract String[] a(int paramInt);
  
  protected com.android.dazhihui.ui.delegate.b.h b(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    return paramh;
  }
  
  protected void b()
  {
    if (this.o) {
      g();
    }
  }
  
  protected void c()
  {
    if (this.n) {
      h();
    }
  }
  
  protected void c(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    if (paramh.b())
    {
      e(paramh);
      return;
    }
    d(paramh);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = this.x;
    paramct.a = 40;
    paramct.d = paramContext;
    paramct.p = this;
  }
  
  protected void d()
  {
    this.i = o.w();
    this.j = o.y();
  }
  
  protected void d(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    c(paramh.d());
  }
  
  public abstract String[] d(int paramInt);
  
  protected void e(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    a(paramh.a(), paramh);
    this.t.a();
    e();
    a(true);
  }
  
  public String[] e(int paramInt)
  {
    String[] arrayOfString2 = a(paramInt);
    String[] arrayOfString1 = arrayOfString2;
    if (arrayOfString2 == null)
    {
      arrayOfString1 = new String[1];
      arrayOfString1[0] = "证券代码*";
    }
    return arrayOfString1;
  }
  
  protected void f()
  {
    this.y.setVisibility(0);
    if (this.C == 0)
    {
      d();
      this.z.setText(this.i);
      this.A.setText(this.j);
    }
    for (;;)
    {
      this.z.setOnClickListener(new c(this));
      this.A.setOnClickListener(new d(this));
      this.B.setOnClickListener(new e(this));
      this.D = Integer.valueOf(this.z.getText().toString().substring(0, 4)).intValue();
      this.E = (Integer.valueOf(this.z.getText().toString().substring(4, 6)).intValue() - 1);
      this.F = Integer.valueOf(this.z.getText().toString().substring(6, 8)).intValue();
      Calendar localCalendar = Calendar.getInstance();
      this.G = localCalendar.get(1);
      this.H = localCalendar.get(2);
      this.I = localCalendar.get(5);
      return;
      this.i = this.z.getText().toString();
      this.j = this.A.getText().toString();
    }
  }
  
  public String[] f(int paramInt)
  {
    String[] arrayOfString2 = d(paramInt);
    String[] arrayOfString1 = arrayOfString2;
    if (arrayOfString2 == null)
    {
      arrayOfString1 = new String[1];
      arrayOfString1[0] = "1036";
    }
    return arrayOfString1;
  }
  
  protected void g() {}
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.w = paramDzhHeader;
  }
  
  protected void h() {}
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (paramj == null) {
      c("　　连接失败，请重试!");
    }
    do
    {
      do
      {
        return;
      } while ((paramh != this.N) && (paramh != this.O));
      this.J = true;
      Log.e("AbstractQuirys", com.android.dazhihui.ui.delegate.b.g.c(paramj.e()));
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (!paramh.b())
      {
        c(paramh.d());
        return;
      }
      this.b = paramh.g();
      this.d = paramh.b("1289");
      if ((this.b == 0) && (this.t.getDataModel().size() == 0))
      {
        this.t.setBackgroundDrawable(getResources().getDrawable(2130838490));
        return;
      }
      this.t.setBackgroundColor(getResources().getColor(2131493677));
    } while (this.b <= 0);
    paramj = new ArrayList();
    this.K = new String[this.b];
    int k = 0;
    while (k < this.b)
    {
      mh localmh = new mh();
      String[] arrayOfString = new String[this.u.length];
      int[] arrayOfInt = new int[this.u.length];
      int i1 = 0;
      for (;;)
      {
        if (i1 < this.u.length) {
          try
          {
            arrayOfString[i1] = paramh.a(k, this.v[i1]).trim();
            arrayOfString[i1] = o.c(this.v[i1], arrayOfString[i1]);
          }
          catch (Exception localException1)
          {
            try
            {
              this.K[k] = paramh.a(k, "1800").trim();
              arrayOfInt[i1] = getResources().getColor(2131493235);
              i1 += 1;
              continue;
              localException1 = localException1;
              arrayOfString[i1] = "-";
            }
            catch (Exception localException2)
            {
              for (;;)
              {
                this.K[k] = "";
              }
            }
          }
        }
      }
      localmh.a = arrayOfString;
      localmh.b = arrayOfInt;
      paramj.add(localmh);
      k += 1;
    }
    a(paramh, this.s);
    this.t.a(paramj, this.s);
  }
  
  public void handleTimeout(com.android.dazhihui.a.b.h paramh)
  {
    super.handleTimeout(paramh);
    if (!this.J) {
      this.J = true;
    }
    if ((paramh == this.N) || (paramh == this.O)) {
      this.t.d();
    }
    if (this == com.android.dazhihui.b.b.a().f()) {
      b(1);
    }
  }
  
  protected Hashtable i()
  {
    return c(this.M);
  }
  
  public void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    paramBundle = getIntent().getExtras();
    if (paramBundle != null)
    {
      this.g = paramBundle.getInt("mark_id");
      this.x = paramBundle.getString("mark_name");
      this.m = paramBundle.getBoolean("mark_history", false);
      this.n = paramBundle.getBoolean("mark_has_bottom", false);
      this.o = paramBundle.getBoolean("mark_date_edit", false);
      this.p = paramBundle.getBoolean("mark_Cancel", false);
      this.q = paramBundle.getInt("mark_trade");
    }
    this.u = e(this.g);
    this.v = f(this.g);
    setContentView(2130903461);
    this.w = ((DzhHeader)findViewById(2131558513));
    this.w.a(this, this);
    this.y = ((TableLayout)findViewById(2131560631));
    this.z = ((EditText)findViewById(2131560633));
    this.A = ((EditText)findViewById(2131560635));
    this.B = ((Button)findViewById(2131560636));
    this.t = ((TableLayoutGroup)findViewById(2131558886));
    this.t.setHeaderColumn(this.u);
    this.t.setPullDownLoading(false);
    this.t.setColumnClickable(null);
    this.t.setContinuousLoading(false);
    this.t.setHeaderBackgroundColor(getResources().getColor(2131493234));
    this.t.setDrawHeaderSeparateLine(false);
    this.t.setHeaderTextColor(getResources().getColor(2131493235));
    this.t.setHeaderHeight(56);
    this.t.setContentRowHeight(96);
    this.t.setLeftPadding(25);
    this.t.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.t.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.t.setStockNameColor(getResources().getColor(2131493235));
    this.t.setOnLoadingListener(new a(this));
    this.t.setOnTableLayoutClickListener(new b(this));
    this.h = ((Button)findViewById(2131560639));
    a();
    b();
    c();
  }
  
  public void j()
  {
    k();
  }
  
  protected abstract void k();
  
  public void l()
  {
    Object localObject1 = this.L.a;
    if (localObject1 == null) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject2 = new HashMap();
    int i1 = this.v.length;
    int k = 0;
    while (k < i1)
    {
      localStringBuilder.append(this.u[k]).append(":\t").append(localObject1[k]).append("\n");
      ((HashMap)localObject2).put(this.v[k], localObject1[k]);
      k += 1;
    }
    localStringBuilder.append("你确认吗？");
    localObject1 = m();
    localObject2 = n();
    Hashtable localHashtable = i();
    a((String)localObject1, localStringBuilder.toString(), (String)localObject2, localHashtable);
  }
  
  protected String m()
  {
    return this.x;
  }
  
  protected String n()
  {
    return "确定";
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (!this.J) {
      this.J = true;
    }
    if ((paramh == this.N) || (paramh == this.O)) {
      this.t.d();
    }
    if (this == com.android.dazhihui.b.b.a().f()) {
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
      localDatePickerDialog = new DatePickerDialog(this, this.P, this.D, this.E, this.F);
      localDatePickerDialog.setTitle("请选择开始日期");
      return localDatePickerDialog;
    }
    DatePickerDialog localDatePickerDialog = new DatePickerDialog(this, this.Q, this.G, this.H, this.I);
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
  
  public void onResume()
  {
    super.onResume();
    this.t.a();
    e();
    a(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\AbstractQuirys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */