package com.android.dazhihui.ui.delegate.screen.offerrepurchase;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.delegate.screen.TradeText;
import com.android.dazhihui.ui.screen.stock.SearchStockScreen;
import com.android.dazhihui.ui.screen.y;
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

public class OfferRepurchaseQuirys
  extends DelegateBaseActivity
  implements cp, cs
{
  private int A;
  private int B;
  private int C;
  private int D;
  private int E;
  private boolean F;
  private boolean G = false;
  private boolean H = false;
  private boolean I = false;
  private int J;
  private mh K;
  private String L = "";
  private LinearLayout M;
  private ImageView N;
  private boolean O = true;
  private com.android.dazhihui.a.b.u P;
  private DatePickerDialog.OnDateSetListener Q = new u(this);
  private DatePickerDialog.OnDateSetListener R = new j(this);
  private DatePickerDialog.OnDateSetListener S = new k(this);
  private com.android.dazhihui.a.b.u T;
  protected boolean a = true;
  protected int b = 0;
  protected int c = 0;
  protected int d = 0;
  public String[][] e = (String[][])null;
  public int[][] f = (int[][])null;
  private int g = 20;
  private int h = 0;
  private TableLayoutGroup i;
  private String[] j = null;
  private String[] m = null;
  private DzhHeader n;
  private int o;
  private String p;
  private LinearLayout q;
  private EditText r;
  private EditText s;
  private LinearLayout t;
  private EditText u;
  private Button v;
  private int w = 0;
  private String x;
  private String y;
  private int z;
  
  public static String a(int paramInt)
  {
    return String.valueOf(paramInt + 1);
  }
  
  private void a(com.android.dazhihui.ui.delegate.b.h paramh)
  {
    if (!paramh.b())
    {
      c(paramh.d());
      return;
    }
    if (paramh.a().equals(a(12200))) {}
    for (paramh = paramh.a(0, "1042");; paramh = paramh.a(0, "1208"))
    {
      c(paramh);
      p();
      return;
    }
  }
  
  private void a(Object paramObject)
  {
    switch (this.o)
    {
    default: 
      return;
    case 12190: 
      b(paramObject);
      return;
    case 12194: 
      c(paramObject);
      return;
    case 12198: 
      d(paramObject);
      return;
    case 12202: 
      e(paramObject);
      return;
    case 12248: 
      f(paramObject);
      return;
    case 12286: 
      g(paramObject);
      return;
    case 12402: 
      h(paramObject);
      return;
    }
    i(paramObject);
  }
  
  private void a(String paramString1, String paramString2, String paramString3, Object paramObject)
  {
    com.android.dazhihui.ui.widget.k localk = new com.android.dazhihui.ui.widget.k();
    localk.a(paramString1);
    localk.b(paramString2);
    localk.b(paramString3, new l(this, paramObject));
    localk.a(getString(2131165331), new m(this));
    localk.a(this);
  }
  
  private void a(boolean paramBoolean)
  {
    this.P = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(this.o)).h()) });
    registRequestListener(this.P);
    a(this.P, true);
  }
  
  private void b(Object paramObject)
  {
    Bundle localBundle = new Bundle();
    localBundle.putString("codes", paramObject.toString());
    startActivity(OfferRepurchaseEntrust.class, localBundle);
  }
  
  private void b(boolean paramBoolean)
  {
    this.x = this.r.getText().toString();
    this.y = this.s.getText().toString();
    this.P = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(this.o)).a("1022", this.x).a("1023", this.y).a("1206", this.h).a("1277", this.g).h()) });
    registRequestListener(this.P);
    a(this.P, paramBoolean);
  }
  
  private void c(Object paramObject)
  {
    Object localObject = (Hashtable)paramObject;
    paramObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1038"));
    String str = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1221"));
    localObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1800"));
    this.T = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(12196)).a("1038", (String)paramObject).a("1221", str).a("1800", (String)localObject).h()) });
    registRequestListener(this.T);
    a(this.T, true);
  }
  
  private void d()
  {
    this.n = ((DzhHeader)findViewById(2131558513));
    this.n.a(this, this);
    this.q = ((LinearLayout)findViewById(2131558879));
    this.q.setVisibility(8);
    this.r = ((EditText)findViewById(2131558880));
    this.s = ((EditText)findViewById(2131558882));
    this.v = ((Button)findViewById(2131558883));
    this.t = ((LinearLayout)findViewById(2131560637));
    this.u = ((EditText)findViewById(2131560638));
    this.i = ((TableLayoutGroup)findViewById(2131558885));
    this.i.setHeaderColumn(this.j);
    this.i.setPullDownLoading(false);
    this.i.setColumnClickable(null);
    this.i.setContinuousLoading(true);
    this.i.setHeaderBackgroundColor(getResources().getColor(2131493677));
    this.i.setDrawHeaderSeparateLine(false);
    this.i.setHeaderTextColor(getResources().getColor(2131493099));
    this.i.setHeaderFontSize(getResources().getDimension(2131230899));
    this.i.setHeaderHeight((int)getResources().getDimension(2131230814));
    this.i.setLeftPadding(25);
    this.i.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
    this.i.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.i.setStockNameColor(getResources().getColor(2131493235));
    this.i.setOnLoadingListener(new i(this));
    this.i.setOnTableLayoutClickListener(new n(this));
    this.M = ((LinearLayout)findViewById(2131561002));
    this.N = ((ImageView)findViewById(2131558817));
    if (this.o == 12198)
    {
      this.N.setOnClickListener(new o(this));
      this.O = getSharedPreferences("data", 0).getBoolean("tip", this.O);
      if (this.O) {
        this.M.setVisibility(0);
      }
    }
    do
    {
      return;
      if (this.o != 12202) {
        break;
      }
      this.N.setOnClickListener(new p(this));
      this.O = getSharedPreferences("data1", 0).getBoolean("tip1", this.O);
    } while (!this.O);
    this.M.setVisibility(0);
    return;
    this.M.setVisibility(8);
  }
  
  private void d(Object paramObject)
  {
    Object localObject = (Hashtable)paramObject;
    paramObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1038"));
    String str1 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1221"));
    String str2 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1036"));
    String str3 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1019"));
    String str4 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1684"));
    String str5 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1042"));
    String str6 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1046"));
    String str7 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1050"));
    String str8 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1040"));
    localObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1800"));
    this.T = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(12200)).a("1038", (String)paramObject).a("1221", str1).a("1036", str2).a("1019", str3).a("1684", str4).a("1042", str5).a("1046", str6).a("1050", str7).a("1040", str8).a("1800", (String)localObject).h()) });
    registRequestListener(this.T);
    a(this.T, true);
  }
  
  private void e(Object paramObject)
  {
    Object localObject = (Hashtable)paramObject;
    paramObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1038"));
    String str1 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1221"));
    String str2 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1039"));
    String str3 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1059"));
    localObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1800"));
    String str4 = this.u.getText().toString();
    this.T = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(12204)).a("1038", (String)paramObject).a("1221", str1).a("1039", str2).a("1059", str3).a("1287", str4).a("1800", (String)localObject).h()) });
    registRequestListener(this.T);
    a(this.T, true);
  }
  
  private void f()
  {
    Bundle localBundle = getIntent().getExtras();
    if (localBundle != null)
    {
      this.o = localBundle.getInt("id_Mark");
      this.p = localBundle.getString("name_Mark");
      this.H = localBundle.getBoolean("History_Mark", false);
      this.I = localBundle.getBoolean("Trade_Mark", false);
    }
    this.j = f(this.o);
    this.m = g(this.o);
  }
  
  private void f(Object paramObject)
  {
    Object localObject = (Hashtable)paramObject;
    paramObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1039"));
    String str1 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1221"));
    localObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1800"));
    String str2 = this.u.getText().toString();
    this.T = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(12250)).a("1039", (String)paramObject).a("1221", str1).a("1287", str2).a("1800", (String)localObject).h()) });
    registRequestListener(this.T);
    a(this.T, true);
  }
  
  private void g()
  {
    switch (this.o)
    {
    }
    do
    {
      return;
      i();
      return;
    } while (!this.H);
    i();
  }
  
  private void g(Object paramObject)
  {
    Object localObject = (Hashtable)paramObject;
    paramObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1042"));
    localObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1800"));
    this.T = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(12288)).a("1042", (String)paramObject).a("1800", (String)localObject).h()) });
    registRequestListener(this.T);
    a(this.T, true);
  }
  
  private static String h(int paramInt)
  {
    if (paramInt >= 10) {
      return String.valueOf(paramInt);
    }
    return "0" + String.valueOf(paramInt);
  }
  
  private void h()
  {
    switch (this.o)
    {
    }
    do
    {
      return;
      j();
      return;
    } while ((this.H) || (this.p.equals(getString(2131165219))));
    j();
  }
  
  private void h(Object paramObject)
  {
    Object localObject = (Hashtable)paramObject;
    paramObject = this.u.getText().toString();
    String str1 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1019"));
    String str2 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1021"));
    String str3 = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1036"));
    localObject = com.android.dazhihui.d.n.t((String)((Hashtable)localObject).get("1800"));
    this.T = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(12404)).a("1019", str1).a("1021", str2).a("1036", str3).a("1287", (String)paramObject).a("1800", (String)localObject).h()) });
    registRequestListener(this.T);
    a(this.T, true);
  }
  
  private void i()
  {
    this.q.setVisibility(0);
    if (this.w == 0) {
      if (this.o == 12418)
      {
        this.x = com.android.dazhihui.ui.delegate.b.o.y();
        this.y = com.android.dazhihui.ui.delegate.b.o.d(7);
        this.r.setText(this.x);
        this.s.setText(this.y);
      }
    }
    for (;;)
    {
      this.r.setOnClickListener(new q(this));
      this.s.setOnClickListener(new r(this));
      this.v.setOnClickListener(new s(this));
      this.z = Integer.valueOf(this.r.getText().toString().substring(0, 4)).intValue();
      this.A = (Integer.valueOf(this.r.getText().toString().substring(4, 6)).intValue() - 1);
      this.B = Integer.valueOf(this.r.getText().toString().substring(6, 8)).intValue();
      Calendar localCalendar = Calendar.getInstance();
      this.C = localCalendar.get(1);
      this.D = localCalendar.get(2);
      this.E = localCalendar.get(5);
      return;
      this.x = com.android.dazhihui.ui.delegate.b.o.w();
      this.y = com.android.dazhihui.ui.delegate.b.o.y();
      break;
      this.x = this.r.getText().toString();
      this.y = this.s.getText().toString();
    }
  }
  
  private void i(Object paramObject)
  {
    paramObject = com.android.dazhihui.d.n.t((String)((Hashtable)paramObject).get("1800"));
    this.T = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g(String.valueOf(12408)).a("1800", (String)paramObject).h()) });
    registRequestListener(this.T);
    a(this.T, true);
  }
  
  private void j()
  {
    this.t.setVisibility(0);
    String str = com.android.dazhihui.ui.delegate.b.o.y();
    this.u.setText(str);
    this.u.setOnClickListener(new t(this));
    try
    {
      this.z = Integer.valueOf(str.substring(0, 4)).intValue();
      this.A = (Integer.valueOf(str.substring(4, 6)).intValue() - 1);
      this.B = Integer.valueOf(str.substring(6, 8)).intValue();
      return;
    }
    catch (Exception localException)
    {
      com.android.dazhihui.d.n.e("OfferRepurchaseQuirys", localException.toString());
      Calendar localCalendar = Calendar.getInstance();
      this.z = localCalendar.get(1);
      this.A = localCalendar.get(2);
      this.B = localCalendar.get(5);
    }
  }
  
  private void k()
  {
    if (!this.F) {
      return;
    }
    this.h = 0;
    this.i.a();
    this.x = this.r.getText().toString();
    this.y = this.s.getText().toString();
    b(true);
    this.F = false;
  }
  
  private void l()
  {
    this.r.setText(new StringBuilder().append(h(this.z)).append(h(this.A + 1)).append(h(this.B)));
  }
  
  private void m()
  {
    this.s.setText(new StringBuilder().append(h(this.C)).append(h(this.D + 1)).append(h(this.E)));
  }
  
  private void n()
  {
    this.u.setText(new StringBuilder().append(h(this.z)).append(h(this.A + 1)).append(h(this.B)));
  }
  
  private void o()
  {
    if ((this.J < 0) || (this.J > this.i.getDataModel().size() - 1)) {
      return;
    }
    String[] arrayOfString = this.K.a;
    StringBuffer localStringBuffer = new StringBuffer();
    int k = 0;
    while (k < arrayOfString.length)
    {
      String str = arrayOfString[k];
      localObject = str;
      if (str == null) {
        localObject = "-";
      }
      localStringBuffer.append("\n").append(this.j[k]).append(": ").append((String)localObject);
      k += 1;
    }
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("str", localStringBuffer.toString());
    startActivity(TradeText.class, (Bundle)localObject);
  }
  
  private void p()
  {
    this.i.a();
    this.i.e();
    this.i.postInvalidate();
    this.h = 0;
    this.g = 20;
    a(this.o, true);
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
    switch (this.o)
    {
    default: 
      o();
      return;
    case 12190: 
      b();
      return;
    case 12198: 
    case 12248: 
    case 12286: 
    case 12406: 
      c();
      return;
    case 12194: 
      if (this.I)
      {
        c();
        return;
      }
      o();
      return;
    }
    if ((this.H) || (this.p.equals(getString(2131165219))))
    {
      o();
      return;
    }
    c();
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    switch (paramInt)
    {
    default: 
      a(paramBoolean);
      return;
    case 12290: 
    case 12340: 
    case 12418: 
      b(paramBoolean);
      return;
    }
    if ((this.H) && (!this.p.equals(getString(2131165219))))
    {
      b(paramBoolean);
      return;
    }
    a(paramBoolean);
  }
  
  public void b()
  {
    if ((this.J < 0) || (this.J > this.i.getDataModel().size() - 1)) {}
    String[] arrayOfString1;
    do
    {
      return;
      arrayOfString1 = this.K.a;
    } while (arrayOfString1 == null);
    this.L = "";
    String[] arrayOfString2 = new String[5];
    arrayOfString2[0] = "1036";
    arrayOfString2[1] = "1037";
    arrayOfString2[2] = "1683";
    arrayOfString2[3] = "1684";
    arrayOfString2[4] = "1687";
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject1 = "";
    int i2 = arrayOfString2.length;
    int i3 = this.m.length;
    int k = 0;
    if (k < i2)
    {
      int i1 = 0;
      for (;;)
      {
        Object localObject2 = localObject1;
        if (i1 < i3)
        {
          if (!arrayOfString2[k].equals(this.m[i1])) {
            break label216;
          }
          localStringBuilder.append(this.j[k]).append(":\t").append(arrayOfString1[k]).append("\n");
          localObject2 = localObject1;
          if (arrayOfString2[k].equals("1036")) {
            localObject2 = arrayOfString1[i1];
          }
        }
        k += 1;
        localObject1 = localObject2;
        break;
        label216:
        i1 += 1;
      }
    }
    localStringBuilder.append("你确认吗？");
    a("产品信息", localStringBuilder.toString(), "回购申报", localObject1);
  }
  
  public void b(int paramInt)
  {
    Toast localToast;
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "正在查询请等待......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(this, "  网络连接超时请重试......", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    if (paramInt == 2)
    {
      localToast = Toast.makeText(this, "没有取到数据 ", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
  }
  
  public void c()
  {
    if ((this.J < 0) || (this.J > this.i.getDataModel().size() - 1)) {}
    String[] arrayOfString2;
    do
    {
      return;
      arrayOfString2 = this.K.a;
    } while (arrayOfString2 == null);
    StringBuilder localStringBuilder = new StringBuilder();
    new HashMap();
    String str2 = "委托确认";
    String str1 = "确定";
    String[] arrayOfString1 = this.j;
    int i3;
    int k;
    switch (this.o)
    {
    default: 
      arrayOfString1 = this.j;
      localObject = this.m;
      int i2 = localObject.length;
      i3 = this.m.length;
      k = 0;
      label161:
      if (k >= i2) {
        break label652;
      }
      if (localObject[k].equals("yyrq"))
      {
        String str3 = this.u.getText().toString();
        if (str3 != null) {
          localStringBuilder.append("预约日期").append(":\t").append(str3).append("\n");
        }
      }
      break;
    }
    label650:
    for (;;)
    {
      k += 1;
      break label161;
      localObject = new String[11];
      localObject[0] = "1039";
      localObject[1] = "1019";
      localObject[2] = "1037";
      localObject[3] = "1036";
      localObject[4] = "1027";
      localObject[5] = "1041";
      localObject[6] = "1040";
      localObject[7] = "1044";
      localObject[8] = "1054";
      localObject[9] = "1042";
      localObject[10] = "1043";
      str2 = "撤单确认";
      str1 = "撤单";
      break;
      localObject = new String[6];
      localObject[0] = "1036";
      localObject[1] = "1037";
      localObject[2] = "1047";
      localObject[3] = "1046";
      localObject[4] = "1050";
      localObject[5] = "1019";
      str2 = "正常提前购回确认";
      str1 = "提前购回";
      break;
      localObject = new String[6];
      localObject[0] = "1036";
      localObject[1] = "1037";
      localObject[2] = "1047";
      localObject[3] = "1045";
      localObject[4] = "1050";
      localObject[5] = "1019";
      str2 = "预约提前购回确认";
      str1 = "确定";
      break;
      localObject = new String[6];
      localObject[0] = "1861";
      localObject[1] = "1036";
      localObject[2] = "1037";
      localObject[3] = "1040";
      localObject[4] = "1287";
      localObject[5] = "1042";
      str2 = "预约提前购回撤单确认";
      str1 = "确定";
      break;
      localObject = new String[6];
      localObject[0] = "1861";
      localObject[1] = "1036";
      localObject[2] = "1037";
      localObject[3] = "1040";
      localObject[4] = "1287";
      localObject[5] = "1042";
      str2 = "隔日不再续做确认";
      str1 = "不再续作";
      break;
      localObject = new String[6];
      localObject[0] = "1861";
      localObject[1] = "1036";
      localObject[2] = "1037";
      localObject[3] = "1040";
      localObject[4] = "1598";
      localObject[5] = "1042";
      str2 = "续作变更确认";
      str1 = "确定";
      break;
      int i1 = 0;
      for (;;)
      {
        if (i1 >= i3) {
          break label650;
        }
        if (localObject[k].equals(this.m[i1]))
        {
          localStringBuilder.append(arrayOfString1[k]).append(":\t").append(arrayOfString2[k]).append("\n");
          break;
        }
        i1 += 1;
      }
    }
    label652:
    localStringBuilder.append("你确认吗？");
    Object localObject = c(this.J);
    a(str2, localStringBuilder.toString(), str1, localObject);
  }
  
  protected void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    this.n.a(paramy);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = this.p;
    paramct.p = this;
  }
  
  public String[] d(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 12190: 
      return a.K;
    case 12194: 
      return a.M;
    case 12198: 
      return a.O;
    case 12202: 
      return a.aq;
    case 12206: 
      return a.Q;
    case 12208: 
      return a.S;
    case 12210: 
      return a.U;
    case 12216: 
      return a.Y;
    case 12218: 
      return a.aa;
    case 12220: 
      return a.ac;
    case 12214: 
      return a.W;
    case 12284: 
      return a.ae;
    case 12286: 
      return a.ag;
    case 12288: 
      return a.ai;
    case 12290: 
      return a.ak;
    case 12328: 
      return a.am;
    case 12340: 
      return a.ao;
    case 12248: 
      return a.as;
    case 12402: 
      return a.au;
    case 12410: 
      return a.aw;
    case 12406: 
      return a.ay;
    case 12418: 
      return a.aC;
    }
    return a.aA;
  }
  
  public String[] e(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 12190: 
      return a.L;
    case 12194: 
      return a.N;
    case 12198: 
      return a.P;
    case 12202: 
      return a.ar;
    case 12206: 
      return a.R;
    case 12208: 
      return a.T;
    case 12210: 
      return a.V;
    case 12216: 
      return a.Z;
    case 12218: 
      return a.ab;
    case 12220: 
      return a.ad;
    case 12214: 
      return a.X;
    case 12284: 
      return a.af;
    case 12286: 
      return a.ah;
    case 12288: 
      return a.aj;
    case 12290: 
      return a.al;
    case 12328: 
      return a.an;
    case 12340: 
      return a.ap;
    case 12248: 
      return a.at;
    case 12402: 
      return a.av;
    case 12410: 
      return a.ax;
    case 12406: 
      return a.az;
    case 12418: 
      return a.aD;
    }
    return a.aB;
  }
  
  public String[] f(int paramInt)
  {
    String[] arrayOfString2 = d(paramInt);
    String[] arrayOfString1 = arrayOfString2;
    if (arrayOfString2 == null)
    {
      arrayOfString1 = new String[1];
      arrayOfString1[0] = "证券代码*";
    }
    return arrayOfString1;
  }
  
  public String[] g(int paramInt)
  {
    String[] arrayOfString2 = e(paramInt);
    String[] arrayOfString1 = arrayOfString2;
    if (arrayOfString2 == null)
    {
      arrayOfString1 = new String[1];
      arrayOfString1[0] = "1036";
    }
    return arrayOfString1;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.n = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((v)paramj).b();
    if (com.android.dazhihui.ui.delegate.b.u.a(paramj, this))
    {
      if (paramh != this.P) {
        break label325;
      }
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      this.F = true;
      if (paramh.b()) {
        break label59;
      }
      c(paramh.d());
    }
    label59:
    label325:
    while (paramh != this.T)
    {
      do
      {
        return;
        this.d = paramh.b("1289");
        this.b = paramh.g();
        if ((this.b == 0) && (this.i.getDataModel().size() <= 0))
        {
          this.i.setBackgroundResource(2130838490);
          return;
        }
        this.i.setBackgroundResource(2130839011);
        paramj = new ArrayList();
        new StringBuilder();
      } while (this.b <= 0);
      int k = 0;
      while (k < this.b)
      {
        mh localmh = new mh();
        String[] arrayOfString = new String[this.j.length];
        int[] arrayOfInt = new int[this.j.length];
        int i1 = 0;
        for (;;)
        {
          if (i1 < this.j.length) {
            try
            {
              arrayOfString[i1] = paramh.a(k, this.m[i1]).trim();
              arrayOfString[i1] = com.android.dazhihui.ui.delegate.b.o.c(this.m[i1], arrayOfString[i1]);
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
      a(paramh, this.h);
      this.i.a(paramj, this.h);
      return;
    }
    paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
    if (!paramh.b())
    {
      c(paramh.d());
      return;
    }
    a(paramh);
  }
  
  public void init(Bundle paramBundle)
  {
    setContentView(2130903535);
    f();
    d();
    g();
    h();
    a(this.o, true);
  }
  
  protected Dialog onCreateDialog(int paramInt)
  {
    switch (paramInt)
    {
    case 2: 
    default: 
      return null;
    case 0: 
      localDatePickerDialog = new DatePickerDialog(this, 3, this.Q, this.z, this.A, this.B);
      localDatePickerDialog.setTitle("请选择开始日期");
      return localDatePickerDialog;
    case 1: 
      localDatePickerDialog = new DatePickerDialog(this, 3, this.R, this.C, this.D, this.E);
      localDatePickerDialog.setTitle("请选择结束日期");
      return localDatePickerDialog;
    }
    DatePickerDialog localDatePickerDialog = new DatePickerDialog(this, 3, this.S, this.z, this.A, this.B);
    localDatePickerDialog.setTitle("请选择预约日期");
    return localDatePickerDialog;
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 84) {
      startActivity(SearchStockScreen.class);
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\offerrepurchase\OfferRepurchaseQuirys.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */