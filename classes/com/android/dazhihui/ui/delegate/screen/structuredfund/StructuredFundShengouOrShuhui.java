package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.Vector;

public class StructuredFundShengouOrShuhui
  extends DelegateBaseActivity
  implements cp, cs
{
  private com.android.dazhihui.a.b.u A;
  private com.android.dazhihui.a.b.u B;
  private com.android.dazhihui.a.b.u C;
  private com.android.dazhihui.a.b.u D;
  private com.android.dazhihui.a.b.u E;
  private int F;
  protected int a;
  TextWatcher b;
  private String[] c = { "1019", "1020", "1021", "1059", "1394" };
  private String[] d;
  private TextView e;
  private TextView f;
  private EditText g;
  private EditText h;
  private EditText i;
  private EditText j;
  private Spinner m;
  private int n;
  private Button o;
  private DzhHeader p;
  private String q;
  private String r;
  private String s;
  private com.android.dazhihui.ui.delegate.b.h t;
  private String u;
  private Vector<String[]> v;
  private String w;
  private String x;
  private String y;
  private com.android.dazhihui.a.b.u z;
  
  public StructuredFundShengouOrShuhui()
  {
    String[] arrayOfString;
    if (a.bT == null)
    {
      arrayOfString = new String[6];
      arrayOfString[0] = "1091";
      arrayOfString[1] = "1092";
      arrayOfString[2] = "1098";
      arrayOfString[3] = "1065";
      arrayOfString[4] = "1123";
      arrayOfString[5] = "1090";
    }
    for (;;)
    {
      this.d = arrayOfString;
      this.s = "1";
      this.v = new Vector();
      this.a = 0;
      this.b = new an(this);
      this.C = null;
      return;
      arrayOfString = a.bT;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.D = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("18010").a("1090", this.g.getText().toString()).a("1972", "").a("1206", "").a("1277", "0").h()) });
    registRequestListener(this.D);
    a(this.D, paramBoolean);
  }
  
  private void h()
  {
    if ((o.z == null) || (o.z.length == 0)) {}
    do
    {
      do
      {
        do
        {
          return;
        } while (!o.r());
        this.r = this.g.getText().toString();
      } while ((this.r == null) || (this.w == null));
      if (this.h.getText().toString() != null) {
        break;
      }
      if (this.q.equals("shengou"))
      {
        Toast.makeText(this, "请输入申购金额", 1).show();
        return;
      }
    } while (!this.q.equals("shuhui"));
    Toast.makeText(this, "请输入赎回份额", 1).show();
    return;
    if (this.q.equals("shengou")) {
      this.F = 2;
    }
    for (;;)
    {
      com.android.dazhihui.ui.delegate.b.h localh = o.g("12906").a("1026", String.valueOf(this.F)).a("1021", this.w).a("1019", o.z[this.n][1]).a("1090", this.r).a("1041", this.x).a("1040", this.h.getText().toString()).a("1396", this.s).a("2315", "0");
      this.t = localh;
      this.E = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.E);
      a(this.E, true);
      return;
      if (this.q.equals("shuhui")) {
        this.F = 3;
      }
    }
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void a()
  {
    Bundle localBundle = getIntent().getExtras();
    this.q = localBundle.getString("tag");
    this.u = localBundle.getString("scode");
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    this.z = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11102").a("1003", "0").a("1036", this.g.getText().toString()).h()) });
    registRequestListener(this.z);
    a(this.z, true);
  }
  
  public void c()
  {
    if (!o.r()) {
      return;
    }
    this.A = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11104").a("1028", "0").a("1234", "1").h()) });
    registRequestListener(this.A);
    a(this.A, false);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = null;
    if (this.q.equals("shengou")) {
      paramContext = "场内申购";
    }
    for (;;)
    {
      paramct.a = 40;
      paramct.d = paramContext;
      paramct.p = this;
      return;
      if (this.q.equals("shuhui")) {
        paramContext = "场内赎回";
      }
    }
  }
  
  public void d()
  {
    if (!o.r()) {
      return;
    }
    this.B = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11146").a("1019", o.z[this.m.getSelectedItemPosition()][1]).a("1036", this.g.getText().toString()).a("1206", "0").a("1277", "1").h()) });
    registRequestListener(this.B);
    a(this.B, true);
  }
  
  public void f()
  {
    this.g.setText("");
  }
  
  public void g()
  {
    this.h.setText("");
    this.i.setText("");
    this.j.setText("");
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.p = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    com.android.dazhihui.ui.delegate.b.u localu = ((v)paramj).b();
    if (localu == null) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh;
    label130:
    Object localObject;
    label145:
    String str1;
    label161:
    String str2;
    if (paramh == this.D)
    {
      boolean bool = com.android.dazhihui.ui.delegate.b.u.a(localu, this);
      b();
      if (bool)
      {
        localh = com.android.dazhihui.ui.delegate.b.h.b(localu.e());
        if (!localh.b())
        {
          paramh = Toast.makeText(this, localh.d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          return;
        }
        if (localh.g() > 0)
        {
          if (localh.a(0, "1021") != null) {
            break label447;
          }
          paramj = "";
          this.w = paramj;
          if (localh.a(0, "6111") != null) {
            break label459;
          }
          paramj = "";
          if (localh.a(0, "6112") != null) {
            break label472;
          }
          localObject = "";
          if (localh.a(0, "6113") != null) {
            break label485;
          }
          str1 = "";
          str2 = this.g.getText().toString();
          if (!paramj.equals(str2)) {
            break label524;
          }
          if (localh.a(0, "6119") != null) {
            break label499;
          }
          paramj = "";
          label197:
          this.x = paramj;
          if (localh.a(0, "1091") != null) {
            break label512;
          }
          paramj = "";
          label216:
          this.y = paramj;
          label221:
          this.j.setText(this.y);
        }
      }
    }
    int k;
    if (paramh == this.z)
    {
      paramj = com.android.dazhihui.ui.delegate.b.h.b(localu.e());
      if ((paramj.b()) && (paramj.g() > 0))
      {
        paramj = paramj.a(0, "1021");
        k = o.z.length - 1;
        label279:
        if (k >= 0)
        {
          if (!o.z[k][0].equals(paramj)) {
            break label690;
          }
          localObject = o.z[k][2];
          if ((localObject == null) || (!((String)localObject).equals("1"))) {
            break label681;
          }
          this.m.setSelection(k);
        }
      }
      if (this.q.equals("shengou")) {
        c();
      }
    }
    for (;;)
    {
      label346:
      if ((paramh == this.E) && (com.android.dazhihui.ui.delegate.b.u.a(localu, this)))
      {
        paramh = com.android.dazhihui.ui.delegate.b.h.b(localu.e());
        if (!paramh.b()) {
          break label926;
        }
        paramj = paramh.a(0, "1208");
        if (paramj == null) {
          break label858;
        }
        new AlertDialog.Builder(this).setTitle("提示信息").setMessage(paramj).setPositiveButton("确定", new ap(this)).setNegativeButton("取消", new ao(this)).setCancelable(false).show();
        return;
        label447:
        paramj = localh.a(0, "1021");
        break;
        label459:
        paramj = localh.a(0, "6111");
        break label130;
        label472:
        localObject = localh.a(0, "6112");
        break label145;
        label485:
        str1 = localh.a(0, "6113");
        break label161;
        label499:
        paramj = localh.a(0, "6119");
        break label197;
        label512:
        paramj = localh.a(0, "1091");
        break label216;
        label524:
        if (((String)localObject).equals(str2))
        {
          if (localh.a(0, "6120") == null)
          {
            paramj = "";
            label548:
            this.x = paramj;
            if (localh.a(0, "6122") != null) {
              break label589;
            }
          }
          label589:
          for (paramj = "";; paramj = localh.a(0, "6122"))
          {
            this.y = paramj;
            break;
            paramj = localh.a(0, "6120");
            break label548;
          }
        }
        if (!str1.equals(str2)) {
          break label221;
        }
        if (localh.a(0, "6121") == null)
        {
          paramj = "";
          label627:
          this.x = paramj;
          if (localh.a(0, "6123") != null) {
            break label668;
          }
        }
        label668:
        for (paramj = "";; paramj = localh.a(0, "6123"))
        {
          this.y = paramj;
          break;
          paramj = localh.a(0, "6121");
          break label627;
        }
        label681:
        this.m.setSelection(k);
        label690:
        k -= 1;
        break label279;
        if (this.q.equals("shuhui"))
        {
          d();
          continue;
          if (paramh == this.A)
          {
            paramj = com.android.dazhihui.ui.delegate.b.h.b(localu.e());
            if (!paramj.b())
            {
              c(paramj.d());
              return;
            }
            if ((paramj.b()) && (paramj.g() > 0)) {
              this.i.setText(paramj.a(0, "1078"));
            }
          }
          else if (paramh == this.B)
          {
            paramj = com.android.dazhihui.ui.delegate.b.h.b(localu.e());
            if (!paramj.b())
            {
              c(paramj.d());
              return;
            }
            if (paramj.b())
            {
              localObject = this.i;
              if (paramj.g() <= 0) {
                break label852;
              }
            }
          }
        }
      }
    }
    label852:
    for (paramj = paramj.a(0, "1061");; paramj = "0")
    {
      ((EditText)localObject).setText(paramj);
      break label346;
      break;
    }
    label858:
    paramh = paramh.a(0, "1042");
    new AlertDialog.Builder(this).setMessage("　　委托请求提交成功。合同号为：" + paramh).setPositiveButton("确定", new aq(this)).setCancelable(false).show();
    this.t = null;
    return;
    label926:
    a(paramh.d());
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    a();
    setContentView(2130903501);
    this.p = ((DzhHeader)findViewById(2131558513));
    this.p.a(this, this);
    this.e = ((TextView)findViewById(2131560852));
    this.f = ((TextView)findViewById(2131560854));
    this.m = ((Spinner)findViewById(2131560849));
    this.g = ((EditText)findViewById(2131560851));
    this.h = ((EditText)findViewById(2131560853));
    this.i = ((EditText)findViewById(2131560855));
    this.j = ((EditText)findViewById(2131560857));
    this.o = ((Button)findViewById(2131560858));
    this.i.setEnabled(false);
    this.j.setEnabled(false);
    if (this.q.equals("shengou"))
    {
      this.e.setText("申购金额");
      this.f.setText("可用金额");
    }
    for (;;)
    {
      paramBundle = new String[o.z.length];
      int k = 0;
      while (k < paramBundle.length)
      {
        paramBundle[k] = o.z[k][1];
        k += 1;
      }
      if (this.q.equals("shuhui"))
      {
        this.e.setText("赎回份额");
        this.f.setText("可赎份额");
      }
    }
    this.m = ((Spinner)findViewById(2131560849));
    this.m.setPrompt("请选择股东帐号");
    paramBundle = new ArrayAdapter(this, 17367048, paramBundle);
    paramBundle.setDropDownViewResource(17367049);
    this.m.setVisibility(1);
    this.m.setAdapter(paramBundle);
    this.m.setOnItemSelectedListener(new al(this));
    this.g.addTextChangedListener(this.b);
    if ((this.u != null) && (this.u.length() == 6)) {
      this.g.setText(this.u);
    }
    this.o.setOnClickListener(new am(this));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\StructuredFundShengouOrShuhui.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */