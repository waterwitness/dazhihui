package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.BorderedTextView;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.NoScrollListView;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StructuredFundSplitOrMerge
  extends DelegateBaseActivity
  implements View.OnClickListener, cp, cs
{
  public static final Comparator<String[]> c = new au();
  private TextView A;
  private TextView B;
  private TextView C;
  private TextView D;
  private TextView E;
  private TextView F;
  private Button G;
  private Button H;
  private BorderedTextView I;
  private ImageView J;
  private NoScrollListView K;
  private az L;
  private DzhHeader M;
  private String N;
  private boolean O;
  private ArrayList<String[]> P;
  private ArrayList<String[]> Q;
  private ArrayList<String[]> R;
  private PopupWindow S;
  private PopupWindow T;
  private int U;
  private int V;
  private int W;
  private int X;
  private int Y;
  TextWatcher a;
  private int aa;
  private int ab;
  private String ac;
  private String ad;
  private String ae;
  private com.android.dazhihui.ui.delegate.b.h af;
  private String ag;
  private String ah;
  private String ai;
  private String aj;
  private String ak;
  private int al;
  private int am;
  private com.android.dazhihui.a.b.u an;
  private com.android.dazhihui.a.b.u ao;
  private com.android.dazhihui.a.b.u ap;
  private LayoutInflater aq;
  private int ar;
  private String as;
  private String at;
  TextWatcher b;
  private String[] d;
  private String[] e;
  private RelativeLayout f;
  private RelativeLayout g;
  private LinearLayout h;
  private LinearLayout i;
  private LinearLayout j;
  private LinearLayout m;
  private EditText n;
  private EditText o;
  private EditText p;
  private TextView q;
  private TextView r;
  private TextView s;
  private TextView t;
  private TextView u;
  private TextView v;
  private TextView w;
  private TextView x;
  private TextView y;
  private TextView z;
  
  public StructuredFundSplitOrMerge()
  {
    String[] arrayOfString;
    if (a.bI == null)
    {
      arrayOfString = new String[6];
      arrayOfString[0] = "基金名称";
      arrayOfString[1] = "实际份额";
      arrayOfString[2] = "可用份额";
      arrayOfString[3] = "基金市值";
      arrayOfString[4] = "基金状态";
      arrayOfString[5] = "基金代码";
      this.d = arrayOfString;
      if (a.bJ != null) {
        break label179;
      }
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
      this.e = arrayOfString;
      this.O = false;
      this.P = new ArrayList();
      this.Q = new ArrayList();
      this.R = new ArrayList();
      this.ae = "1";
      this.a = new ar(this);
      this.b = new as(this);
      this.ar = 0;
      return;
      arrayOfString = a.bI;
      break;
      label179:
      arrayOfString = a.bJ;
    }
  }
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.an = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("18010").a("1090", this.q.getText().toString()).a("1972", "").a("1206", "").a("1277", "0").h()) });
    registRequestListener(this.an);
    a(this.an, paramBoolean);
  }
  
  private void b(boolean paramBoolean)
  {
    if (!o.r()) {
      break label6;
    }
    label6:
    while (this.ac == null) {
      return;
    }
    Object localObject;
    if (this.N.equals("hebing")) {
      localObject = "2";
    }
    for (;;)
    {
      label31:
      int k = 0;
      for (;;)
      {
        if (k < this.P.size())
        {
          if (((String[])this.P.get(k))[this.X].equals(this.q.getText().toString())) {
            this.ad = ((String[])this.P.get(k))[this.ab];
          }
        }
        else
        {
          if ((this.ac == null) || (this.ad == null)) {
            break;
          }
          localObject = o.g("12908").a("1026", (String)localObject).a("1021", this.ac).a("1019", this.ad).a("1090", this.q.getText().toString()).a("1040", this.p.getText().toString()).a("1396", this.ae).a("2315", "0");
          this.af = ((com.android.dazhihui.ui.delegate.b.h)localObject);
          this.ao = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
          registRequestListener(this.ao);
          a(this.ao, paramBoolean);
          return;
          if (!this.N.equals("chaifen")) {
            break label275;
          }
          localObject = "1";
          break label31;
        }
        k += 1;
      }
      label275:
      localObject = "";
    }
  }
  
  private void c(boolean paramBoolean)
  {
    if ((!o.r()) || (this.ac == null) || (this.q.getText().toString() == null)) {
      return;
    }
    int k = 0;
    if (k < this.P.size()) {
      if (!this.q.getText().toString().equals(((String[])this.P.get(k))[this.U])) {}
    }
    for (String str2 = ((String[])this.P.get(k))[this.ab];; str2 = "")
    {
      String str1 = "";
      if (this.N.equals("hebing")) {
        str1 = "2";
      }
      for (;;)
      {
        this.ap = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12922").a("1026", str1).a("1021", this.ac).a("1019", str2).a("1090", this.q.getText().toString()).a("1041", this.ag).a("6125", this.o.getText().toString()).h()) });
        registRequestListener(this.ap);
        a(this.ap, paramBoolean);
        return;
        k += 1;
        break;
        if (this.N.equals("chaifen")) {
          str1 = "1";
        }
      }
    }
  }
  
  private void g()
  {
    Intent localIntent = getIntent();
    Bundle localBundle = localIntent.getExtras();
    this.N = localBundle.getString("tag");
    this.Q = ((ArrayList)localIntent.getSerializableExtra("fundson"));
    this.U = localBundle.getInt("codePos");
    this.V = localBundle.getInt("codeNamePos");
    this.W = localBundle.getInt("accountTypePos");
    this.X = localBundle.getInt("motherCodePos");
    this.Y = localBundle.getInt("motherNamePos");
    this.aa = localBundle.getInt("havePos");
    this.ab = localBundle.getInt("accountCodePos");
    this.ak = localBundle.getString("scodeMother");
    if (this.N.equals("hebing")) {
      this.P = this.Q;
    }
    for (;;)
    {
      int k = 0;
      while (k < this.P.size())
      {
        System.out.println(((String[])this.P.get(k))[this.U] + "   " + ((String[])this.P.get(k))[this.V] + "   " + ((String[])this.P.get(k))[this.W]);
        k += 1;
      }
      if (this.N.equals("chaifen")) {
        this.P = ((ArrayList)localIntent.getSerializableExtra("fundmother"));
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
  
  public int a(int paramInt1, int paramInt2)
  {
    int k;
    if (paramInt1 < paramInt2) {
      k = paramInt1;
    }
    while (k > 0) {
      if ((paramInt1 % k == 0) && (paramInt2 % k == 0))
      {
        return k;
        k = paramInt2;
      }
      else
      {
        k -= 1;
      }
    }
    return 1;
  }
  
  public void a()
  {
    this.g = ((RelativeLayout)findViewById(2131559003));
    this.j = ((LinearLayout)findViewById(2131559005));
    this.f = ((RelativeLayout)findViewById(2131559006));
    this.n = ((EditText)findViewById(2131559007));
    this.p = ((EditText)findViewById(2131559010));
    this.q = ((TextView)findViewById(2131558990));
    this.r = ((TextView)findViewById(2131558991));
    this.I = ((BorderedTextView)findViewById(2131558992));
    this.J = ((ImageView)findViewById(2131558581));
    this.i = ((LinearLayout)findViewById(2131559008));
    this.s = ((TextView)findViewById(2131559012));
    this.t = ((TextView)findViewById(2131559013));
    this.u = ((TextView)findViewById(2131559014));
    this.v = ((TextView)findViewById(2131559016));
    this.h = ((LinearLayout)findViewById(2131559017));
    this.w = ((TextView)findViewById(2131559019));
    this.o = ((EditText)findViewById(2131559020));
    this.x = ((TextView)findViewById(2131559022));
    this.G = ((Button)findViewById(2131559023));
    this.y = ((TextView)findViewById(2131559026));
    this.z = ((TextView)findViewById(2131559027));
    this.A = ((TextView)findViewById(2131559031));
    this.B = ((TextView)findViewById(2131559028));
    this.C = ((TextView)findViewById(2131559029));
    this.D = ((TextView)findViewById(2131559032));
    this.E = ((TextView)findViewById(2131559034));
    this.H = ((Button)findViewById(2131559035));
    this.m = ((LinearLayout)findViewById(2131559009));
    this.J.setBackgroundResource(2130837979);
    this.O = true;
    if (this.N.equals("hebing"))
    {
      this.s.setText("可合并数量：");
      this.u.setVisibility(8);
      this.h.setVisibility(8);
    }
    for (;;)
    {
      this.J.setOnClickListener(this);
      this.q.addTextChangedListener(this.b);
      this.n.addTextChangedListener(this.a);
      if ((this.ak != null) && (this.ak.length() == 6)) {
        this.q.setText(this.ak);
      }
      this.H.setOnClickListener(this);
      this.G.setOnClickListener(this);
      return;
      if (this.N.equals("chaifen"))
      {
        this.s.setText("可分拆数量：");
        this.u.setVisibility(0);
        this.h.setVisibility(0);
      }
    }
  }
  
  public void b()
  {
    View localView = getLayoutInflater().inflate(2130903130, null);
    TextView localTextView = (TextView)localView.findViewById(2131558988);
    if (this.N.equals("hebing"))
    {
      localTextView.setVisibility(8);
      if (this.S == null)
      {
        this.S = new PopupWindow(localView, -1, -1, true);
        this.F = ((TextView)localView.findViewById(2131558988));
        this.K = ((NoScrollListView)localView.findViewById(2131558989));
        if (!this.N.equals("hebing")) {
          break label226;
        }
        c();
        this.L = new az(this, this, this.R);
      }
    }
    for (;;)
    {
      this.K.setAdapter(this.L);
      this.S.setFocusable(true);
      this.S.setTouchable(true);
      this.S.setOutsideTouchable(true);
      this.S.setBackgroundDrawable(new ColorDrawable(-1308622848));
      this.K.setOnItemClickListener(new at(this));
      this.S.showAsDropDown(this.j);
      return;
      if (!this.N.equals("chaifen")) {
        break;
      }
      localTextView.setVisibility(0);
      break;
      label226:
      if (this.N.equals("chaifen")) {
        this.L = new az(this, this, this.P);
      }
    }
  }
  
  public void c()
  {
    if (this.Q == null) {
      return;
    }
    String[] arrayOfString = new String[3];
    arrayOfString[0] = ((String[])this.Q.get(0))[this.X];
    arrayOfString[1] = ((String[])this.Q.get(0))[this.Y];
    int k;
    if (((String[])this.Q.get(0))[this.W].equals("3"))
    {
      arrayOfString[2] = "沪";
      this.R.add(arrayOfString);
      k = 0;
      label93:
      if (k >= this.Q.size()) {
        break label323;
      }
      if ((k < this.Q.size() - 1) && (!((String[])this.Q.get(k))[this.X].equals(((String[])this.Q.get(k + 1))[this.X])))
      {
        arrayOfString = new String[3];
        arrayOfString[0] = ((String[])this.Q.get(k + 1))[this.X];
        arrayOfString[1] = ((String[])this.Q.get(k + 1))[this.Y];
        if (!((String[])this.Q.get(k + 1))[this.W].equals("3")) {
          break label287;
        }
        arrayOfString[2] = "沪";
      }
    }
    for (;;)
    {
      this.R.add(arrayOfString);
      k += 1;
      break label93;
      if (!((String[])this.Q.get(0))[this.W].equals("2")) {
        break;
      }
      arrayOfString[2] = "深";
      break;
      label287:
      if (((String[])this.Q.get(k + 1))[this.W].equals("2")) {
        arrayOfString[2] = "深";
      }
    }
    label323:
    Collections.sort(this.R, c);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramContext = null;
    if (this.N.equals("hebing")) {
      paramContext = "基金合并";
    }
    for (;;)
    {
      paramct.a = 40;
      paramct.d = paramContext;
      paramct.p = this;
      return;
      if (this.N.equals("chaifen")) {
        paramContext = "基金分拆";
      }
    }
  }
  
  public void d()
  {
    Object localObject = getLayoutInflater().inflate(2130903129, null);
    Button localButton = (Button)((View)localObject).findViewById(2131558987);
    if (this.T == null)
    {
      this.T = new PopupWindow((View)localObject, -1, -1, true);
      this.T.setFocusable(true);
      this.T.setTouchable(true);
      this.T.setOutsideTouchable(true);
      this.T.setBackgroundDrawable(new ColorDrawable(-1308622848));
      localButton.setOnClickListener(new av(this));
    }
    localObject = (TextView)this.T.getContentView().findViewById(2131558986);
    if (this.ac.equals("3")) {
      ((TextView)localObject).setText(" 2、为了保障分拆成功，建议分拆数量可少于预估可能分拆数量 ");
    }
    for (;;)
    {
      this.T.showAsDropDown(this.M);
      return;
      if (this.ac.equals("2")) {
        ((TextView)localObject).setText(" 2、为了保障分拆成功，建议分拆数量可少于（预估可能分拆数量+可分拆数量）");
      }
    }
  }
  
  public void f()
  {
    this.ae = "1";
    this.n.setText("");
    this.q.setText("");
    this.r.setText("");
    this.I.setText("");
    this.p.setText("");
    this.t.setText("");
    this.v.setText("");
    this.y.setText("");
    this.z.setText("");
    this.B.setText("");
    this.C.setText("");
    this.A.setText("");
    this.D.setText("");
    this.E.setText("");
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.M = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    com.android.dazhihui.ui.delegate.b.u localu = ((v)paramj).b();
    if (localu == null) {}
    Object localObject;
    label137:
    label204:
    label219:
    label234:
    label250:
    label272:
    label288:
    label304:
    label552:
    label565:
    label612:
    label625:
    label638:
    label652:
    label666:
    label680:
    label694:
    int i1;
    int i2;
    do
    {
      do
      {
        return;
        if ((paramh == this.an) && (com.android.dazhihui.ui.delegate.b.u.a(localu, this)))
        {
          com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.h.b(localu.e());
          if (!localh.b())
          {
            paramh = Toast.makeText(this, localh.d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
          k = localh.g();
          this.i.setVisibility(0);
          this.n.setVisibility(4);
          if (k > 0)
          {
            String str1;
            String str2;
            if (localh.a(0, "1091") == null)
            {
              paramj = "";
              if (localh.a(0, "1021") != null) {
                break label552;
              }
              localObject = "";
              this.ac = ((String)localObject);
              this.r.setText(paramj);
              if (!this.ac.equals("3")) {
                break label565;
              }
              this.I.setText("沪");
              if (this.N.equals("chaifen"))
              {
                this.h.setVisibility(8);
                this.u.setVisibility(8);
              }
              if (localh.a(0, "6112") != null) {
                break label612;
              }
              paramj = "";
              if (localh.a(0, "6122") != null) {
                break label625;
              }
              localObject = "";
              if (localh.a(0, "6114") != null) {
                break label638;
              }
              str1 = "";
              this.as = str1;
              if (localh.a(0, "6113") != null) {
                break label652;
              }
              str1 = "";
              if (localh.a(0, "6123") != null) {
                break label666;
              }
              str2 = "";
              if (localh.a(0, "6115") != null) {
                break label680;
              }
              str3 = "";
              this.at = str3;
              if (localh.a(0, "6119") != null) {
                break label694;
              }
            }
            for (String str3 = "";; str3 = localh.a(0, "6119"))
            {
              this.ag = str3;
              this.v.setText(this.ag);
              this.y.setText((CharSequence)localObject);
              this.z.setText(paramj);
              this.B.setText(str2);
              this.C.setText(str1);
              k = 0;
              while (k < this.Q.size())
              {
                if (((String[])this.Q.get(k))[this.U].equals(paramj))
                {
                  this.ai = ((String[])this.Q.get(k))[this.aa];
                  this.A.setText(((String[])this.Q.get(k))[this.aa]);
                }
                if (((String[])this.Q.get(k))[this.U].equals(str1))
                {
                  this.aj = ((String[])this.Q.get(k))[this.aa];
                  this.D.setText(((String[])this.Q.get(k))[this.aa]);
                }
                k += 1;
              }
              paramj = localh.a(0, "1091");
              break;
              localObject = localh.a(0, "1021");
              break label137;
              if (!this.ac.equals("2")) {
                break label204;
              }
              this.I.setText("深");
              if (!this.N.equals("chaifen")) {
                break label204;
              }
              this.h.setVisibility(0);
              break label204;
              paramj = localh.a(0, "6112");
              break label219;
              localObject = localh.a(0, "6122");
              break label234;
              str1 = localh.a(0, "6114");
              break label250;
              str1 = localh.a(0, "6113");
              break label272;
              str2 = localh.a(0, "6123");
              break label288;
              str3 = localh.a(0, "6115");
              break label304;
            }
          }
          c(true);
          k = (int)Double.parseDouble(this.as);
          i1 = (int)Double.parseDouble(this.at);
          i2 = a(k, i1);
          this.al = (k / i2);
          this.am = (i1 / i2);
          this.E.setText(String.valueOf(this.al) + ":" + String.valueOf(this.am));
        }
        if ((paramh == this.ao) && (com.android.dazhihui.ui.delegate.b.u.a(localu, this)))
        {
          paramj = com.android.dazhihui.ui.delegate.b.h.b(localu.e());
          if (!paramj.b())
          {
            paramh = Toast.makeText(this, paramj.d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
          if (paramj.b())
          {
            localObject = paramj.a(0, "1208");
            if (localObject != null)
            {
              new AlertDialog.Builder(this).setTitle("提示信息").setMessage((CharSequence)localObject).setPositiveButton("确定", new ax(this)).setNegativeButton("取消", new aw(this)).setCancelable(false).show();
              return;
            }
            paramj = paramj.a(0, "1042");
            new AlertDialog.Builder(this).setMessage("　　委托请求提交成功。合同号为：" + paramj).setPositiveButton("确定", new ay(this)).setCancelable(false).show();
            this.af = null;
          }
        }
      } while ((paramh != this.ap) || (!com.android.dazhihui.ui.delegate.b.u.a(localu, this)));
      localObject = com.android.dazhihui.ui.delegate.b.h.b(localu.e());
      if (!((com.android.dazhihui.ui.delegate.b.h)localObject).b())
      {
        paramh = Toast.makeText(this, ((com.android.dazhihui.ui.delegate.b.h)localObject).d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      }
    } while ((!((com.android.dazhihui.ui.delegate.b.h)localObject).b()) || (((com.android.dazhihui.ui.delegate.b.h)localObject).g() <= 0));
    if (((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1462") == null)
    {
      paramh = "";
      if (((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "6127") != null) {
        break label1151;
      }
      paramj = "";
      label1100:
      this.ah = paramj;
      if (((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "6126") != null) {
        break label1163;
      }
    }
    label1151:
    label1163:
    for (paramj = "";; paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "6126"))
    {
      if (!paramh.equals("")) {
        break label1175;
      }
      this.t.setText("--");
      return;
      paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "1462");
      break;
      paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject).a(0, "6127");
      break label1100;
    }
    label1175:
    if (this.N.equals("hebing"))
    {
      this.t.setText(String.valueOf(paramh));
      if (!paramj.equals("")) {
        break label1420;
      }
      this.x.setText("--");
    }
    for (;;)
    {
      if (!this.ah.equals("")) {
        break label1431;
      }
      this.w.setText("--");
      this.x.setText("--");
      return;
      if (!this.N.equals("chaifen")) {
        break;
      }
      k = Integer.parseInt(paramh);
      if (this.ac.equals("3"))
      {
        if (k >= 50000)
        {
          k /= 100;
          this.t.setText(String.valueOf(k * 100));
          break;
        }
        this.t.setText("0");
        break;
      }
      if (this.ac.equals("2"))
      {
        if (k >= 100)
        {
          k /= (this.al + this.am);
          i1 = this.al;
          i2 = this.am;
          this.t.setText(String.valueOf(k * (i1 + i2)));
          break;
        }
        this.t.setText("0");
        break;
      }
      this.t.setText("--");
      break;
      label1420:
      this.x.setText(paramj);
    }
    label1431:
    if ((this.ag.equals("")) || (this.ag.equals("--")))
    {
      this.x.setText("--");
      return;
    }
    this.w.setText(this.ah);
    paramh = this.o.getText().toString();
    int k = (int)(Double.valueOf(Double.parseDouble(this.ah) / Double.parseDouble(this.ag) / (Double.parseDouble(paramh) + 1.0D)).doubleValue() / 10.0D);
    if (k != 0) {
      this.u.setVisibility(0);
    }
    for (;;)
    {
      this.x.setText(String.valueOf(k * 10));
      return;
      this.u.setVisibility(8);
    }
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    g();
    setContentView(2130903133);
    this.M = ((DzhHeader)findViewById(2131559004));
    this.M.a(this, this);
    a();
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131558581: 
    case 2131559035: 
      do
      {
        return;
        if (this.O)
        {
          b();
          this.i.setVisibility(8);
          this.n.setVisibility(0);
          this.q.setText("");
          this.r.setText("");
          this.I.setText("");
          return;
        }
        this.n.setVisibility(0);
        f();
        return;
        paramView = this.p.getText().toString();
        String str = this.q.getText().toString();
        if ((str.equals("")) || (str == null))
        {
          Toast.makeText(this, "请输入母基金代码", 1).show();
          return;
        }
        if ((paramView.equals("")) || (paramView == null))
        {
          Toast.makeText(this, "请输入数量", 1).show();
          return;
        }
        if (this.N.equals("hebing"))
        {
          b(true);
          f();
          return;
        }
      } while (!this.N.equals("chaifen"));
      d();
      return;
    }
    c(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\StructuredFundSplitOrMerge.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */