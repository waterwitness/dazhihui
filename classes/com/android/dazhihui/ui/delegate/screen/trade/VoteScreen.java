package com.android.dazhihui.ui.delegate.screen.trade;

import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import java.util.Vector;

public class VoteScreen
  extends DelegateBaseActivity
  implements cp, cs
{
  private h A;
  private i B;
  private int C = 0;
  private int D = 0;
  private int E = 0;
  private com.android.dazhihui.a.b.u F;
  private com.android.dazhihui.a.b.u G;
  boolean a = false;
  private DzhHeader b;
  private ImageView c;
  private Button d;
  private ImageView e;
  private Button f;
  private LinearLayout g;
  private LinearLayout h;
  private ListView i;
  private LinearLayout j;
  private LinearLayout m;
  private Button n;
  private Button o;
  private Button p;
  private Button q;
  private Button r;
  private Button s;
  private ListView t;
  private Button u;
  private LayoutInflater v;
  private String w;
  private int x = 2;
  private Vector<j> y;
  private int z = -1;
  
  private void a()
  {
    this.b = ((DzhHeader)findViewById(2131558513));
    this.d = ((Button)findViewById(2131561324));
    this.c = ((ImageView)findViewById(2131561325));
    this.f = ((Button)findViewById(2131561327));
    this.e = ((ImageView)findViewById(2131561328));
    this.g = ((LinearLayout)findViewById(2131561329));
    this.h = ((LinearLayout)findViewById(2131561330));
    this.v = LayoutInflater.from(this);
    View localView = this.v.inflate(2130903582, null);
    this.g.addView(localView);
    this.i = ((ListView)this.g.findViewById(2131560485));
    this.j = ((LinearLayout)this.g.findViewById(2131561332));
    this.m = ((LinearLayout)this.g.findViewById(2131560932));
    this.n = ((Button)this.g.findViewById(2131561333));
    this.o = ((Button)this.g.findViewById(2131560935));
    this.p = ((Button)this.g.findViewById(2131561334));
    this.q = ((Button)this.g.findViewById(2131561335));
    this.r = ((Button)this.g.findViewById(2131561336));
    this.s = ((Button)this.g.findViewById(2131559608));
    localView = this.v.inflate(2130903584, null);
    this.h.addView(localView);
    this.t = ((ListView)this.h.findViewById(2131560485));
    this.u = ((Button)this.h.findViewById(2131560935));
  }
  
  private boolean a(String paramString1, String paramString2)
  {
    if ((!e(paramString1)) || (e(paramString2))) {}
    float f1;
    float f2;
    do
    {
      return false;
      f1 = Float.parseFloat(paramString1);
      f2 = Float.parseFloat(paramString2);
    } while ((int)(f1 * 1000.0F) / 1000 != (int)(f2 * 1000.0F) / 1000);
    return true;
  }
  
  private void b()
  {
    this.b.a(this, this);
    this.d.setTextColor(getResources().getColor(2131493480));
    this.f.setTextColor(getResources().getColor(2131493479));
    this.c.setBackgroundResource(2130838694);
    this.e.setBackgroundColor(-1);
    this.g.setVisibility(0);
    this.h.setVisibility(8);
    this.j.setVisibility(0);
    this.m.setVisibility(8);
    this.w = getIntent().getExtras().getString("num");
  }
  
  private void b(String paramString1, String paramString2)
  {
    if ((this.x != 2) || (!e(paramString1))) {}
    for (;;)
    {
      return;
      int i1 = this.y.size();
      int k = 0;
      while (k < i1)
      {
        if (a(paramString1, ((j)this.y.get(k)).d)) {
          ((j)this.y.get(k)).m = paramString2;
        }
        k += 1;
      }
    }
  }
  
  private void c()
  {
    this.z = -1;
    this.C = 0;
    this.D = 0;
    this.E = 0;
    this.a = false;
    this.n.setText("一键表决");
    this.j.setVisibility(0);
    this.m.setVisibility(8);
    if (this.y != null) {
      this.y.clear();
    }
    if (this.A != null) {
      this.A.notifyDataSetChanged();
    }
    if (this.B != null) {
      this.B.notifyDataSetChanged();
    }
  }
  
  private String d(String paramString)
  {
    if (paramString.equals("1")) {
      return "同意";
    }
    if (paramString.equals("2")) {
      return "反对";
    }
    if (paramString.equals("3")) {
      return "弃权";
    }
    return "未表决";
  }
  
  private void d()
  {
    Object localObject = new n(this);
    this.d.setOnClickListener((View.OnClickListener)localObject);
    this.f.setOnClickListener((View.OnClickListener)localObject);
    localObject = new o(this);
    this.n.setOnClickListener((View.OnClickListener)localObject);
    this.o.setOnClickListener((View.OnClickListener)localObject);
    this.p.setOnClickListener((View.OnClickListener)localObject);
    this.q.setOnClickListener((View.OnClickListener)localObject);
    this.r.setOnClickListener((View.OnClickListener)localObject);
    this.s.setOnClickListener((View.OnClickListener)localObject);
    this.u.setOnClickListener((View.OnClickListener)localObject);
  }
  
  private boolean e(String paramString)
  {
    return (int)(Float.parseFloat(paramString) * 1000.0F) % 1000 == 0;
  }
  
  private void f()
  {
    this.D = j();
    if (this.D == 0)
    {
      if (this.y == null) {
        return;
      }
      StringBuilder localStringBuilder = new StringBuilder();
      int i1 = this.y.size();
      int k = 0;
      while (k < i1)
      {
        if ((((j)this.y.get(k)).f.equals("0")) && (((e(((j)this.y.get(k)).d)) && (!g(((j)this.y.get(k)).d))) || ((e(((j)this.y.get(k)).d)) && (!f(((j)this.y.get(k)).d)) && (((j)this.y.get(k)).m.equals("0"))))) {
          localStringBuilder.append("\t议案" + ((j)this.y.get(k)).d + "\n");
        }
        k += 1;
      }
      localStringBuilder.append("尚未表决，请完成所有议案表决才能提交\n");
      new AlertDialog.Builder(this).setTitle("提示").setMessage(localStringBuilder.toString()).setPositiveButton("确定", null).show();
      return;
    }
    new AlertDialog.Builder(this).setTitle("投票确认").setMessage("是否确认投票？").setPositiveButton("确定", new d(this)).setNegativeButton("取消", null).show();
  }
  
  private boolean f(String paramString)
  {
    if (!e(paramString)) {
      return false;
    }
    int i1 = this.y.size();
    int k = 0;
    while (k < i1)
    {
      if (a(paramString, ((j)this.y.get(k)).d)) {
        return true;
      }
      k += 1;
    }
    return false;
  }
  
  private void g()
  {
    StringBuilder localStringBuilder1 = new StringBuilder();
    StringBuilder localStringBuilder2 = new StringBuilder();
    int i4 = this.y.size();
    int i2 = 0;
    int k = 0;
    int i1;
    while (i2 < i4) {
      if (e(((j)this.y.get(i2)).d))
      {
        if (!k(((j)this.y.get(i2)).d))
        {
          localStringBuilder1.append("议案" + ((j)this.y.get(i2)).d + "的应选人数为：" + ((j)this.y.get(i2)).e + ",投票人数必须为该人数。\n");
          k = 1;
        }
        localStringBuilder2.append(((j)this.y.get(i2)).a + "\n");
        i2 += 1;
      }
      else
      {
        int i5 = j(((j)this.y.get(i2)).d);
        if (((j)this.y.get(i2)).n.equals("")) {}
        for (int i3 = 0;; i3 = Integer.parseInt(((j)this.y.get(i2)).n))
        {
          i1 = k;
          if (i3 > i5)
          {
            localStringBuilder1.append("子议案" + ((j)this.y.get(i2)).d + "的可投票数为：" + i5 + ",投票数为：" + i3 + ",投票数不能超过可投票数。\n");
            i1 = 1;
          }
          k = i1;
          if (((j)this.y.get(i2)).f.equals("1")) {
            break;
          }
          k = i1;
          if (i3 <= 0) {
            break;
          }
          localStringBuilder2.append(((j)this.y.get(i2)).a + ":" + i3 + "\n");
          k = i1;
          break;
        }
      }
    }
    if (k == 0)
    {
      i1 = 0;
      k = 0;
      if (i1 < i4)
      {
        if ((e(((j)this.y.get(i1)).d)) || (((j)this.y.get(i1)).f.equals("1")) || (l(((j)this.y.get(i1)).n) == 0)) {
          break label632;
        }
        k += 1;
      }
    }
    label632:
    for (;;)
    {
      i1 += 1;
      break;
      this.D = k;
      localStringBuilder2.append("\t是否投票?");
      new AlertDialog.Builder(this).setTitle("投票确认").setMessage(localStringBuilder2.toString()).setPositiveButton("确定", new e(this)).setNegativeButton("取消", null).show();
      return;
      new AlertDialog.Builder(this).setTitle("提示").setMessage(localStringBuilder1.toString()).setPositiveButton("确定", null).show();
      return;
    }
  }
  
  private boolean g(String paramString)
  {
    if ((this.x != 2) || (!e(paramString))) {
      return false;
    }
    int i1 = this.y.size();
    int k = 0;
    while (k < i1)
    {
      if ((a(paramString, ((j)this.y.get(k)).d)) && (((j)this.y.get(k)).m.equals("0"))) {
        return false;
      }
      k += 1;
    }
    return true;
  }
  
  private void h()
  {
    if (this.w == null) {}
    while (!com.android.dazhihui.ui.delegate.b.o.r()) {
      return;
    }
    this.F = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(com.android.dazhihui.ui.delegate.b.o.g("12882").a("6075", this.w).a("6077", this.x).a("1026", "1").a("2315", "0").h()) });
    registRequestListener(this.F);
    a(this.F, true);
  }
  
  private boolean h(String paramString)
  {
    int i1 = 0;
    if (!g(paramString)) {
      return false;
    }
    int i2 = this.y.size();
    String str = null;
    int k = 0;
    if (k < i2)
    {
      if (!a(paramString, ((j)this.y.get(k)).d)) {
        break label163;
      }
      if (str == null) {
        str = ((j)this.y.get(k)).m;
      }
    }
    label163:
    for (;;)
    {
      k += 1;
      break;
      if (!str.equals(((j)this.y.get(k)).m))
      {
        return false;
        k = i1;
        if (str == null) {
          return true;
        }
        while (k < i2)
        {
          if (((j)this.y.get(k)).d.equals(paramString)) {
            ((j)this.y.get(k)).m = str;
          }
          k += 1;
        }
        return true;
      }
    }
  }
  
  private void i()
  {
    if ((this.w == null) || (this.y == null) || (this.y.size() == 0) || (this.C > this.y.size() - 1)) {}
    do
    {
      return;
      if (this.x == 2)
      {
        if ((((j)this.y.get(this.C)).f.equals("1")) || (f(((j)this.y.get(this.C)).d)) || ((!f(((j)this.y.get(this.C)).d)) && (((j)this.y.get(this.C)).m.equals("0"))))
        {
          this.C += 1;
          i();
        }
      }
      else if ((e(((j)this.y.get(this.C)).d)) || ((!e(((j)this.y.get(this.C)).d)) && (l(((j)this.y.get(this.C)).n) > 0)))
      {
        this.C += 1;
        i();
        return;
      }
    } while (!com.android.dazhihui.ui.delegate.b.o.r());
    com.android.dazhihui.ui.delegate.b.h localh = com.android.dazhihui.ui.delegate.b.o.g("12878").a("1021", ((j)this.y.get(this.C)).h).a("1019", ((j)this.y.get(this.C)).i).a("6075", ((j)this.y.get(this.C)).c).a("6076", ((j)this.y.get(this.C)).d).a("6077", ((j)this.y.get(this.C)).b);
    if (this.x == 2)
    {
      str = ((j)this.y.get(this.C)).m;
      localh = localh.a("1026", str);
      if (this.x != 1) {
        break label556;
      }
    }
    label556:
    for (String str = ((j)this.y.get(this.C)).n;; str = "")
    {
      this.G = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.a("1040", str).a("1036", ((j)this.y.get(this.C)).j).a("1800", ((j)this.y.get(this.C)).l).a("2315", "0").h()) });
      registRequestListener(this.G);
      a(this.G, true);
      return;
      str = "";
      break;
    }
  }
  
  private void i(String paramString)
  {
    if (this.x != 2) {
      return;
    }
    int i1 = this.y.size();
    int k = 0;
    label19:
    if (k < i1)
    {
      if (!f(((j)this.y.get(k)).d)) {
        break label71;
      }
      b(((j)this.y.get(k)).d, paramString);
    }
    for (;;)
    {
      k += 1;
      break label19;
      break;
      label71:
      ((j)this.y.get(k)).m = paramString;
    }
  }
  
  private int j()
  {
    int i2;
    if (this.y == null) {
      i2 = 0;
    }
    int i3;
    int i1;
    int k;
    do
    {
      return i2;
      i3 = this.y.size();
      i1 = 0;
      k = 0;
      i2 = k;
    } while (i1 >= i3);
    if ((!f(((j)this.y.get(i1)).d)) && (((j)this.y.get(i1)).f.equals("0"))) {
      if (!((j)this.y.get(i1)).m.equals("0")) {
        k += 1;
      }
    }
    for (;;)
    {
      i1 += 1;
      break;
      return 0;
    }
  }
  
  private int j(String paramString)
  {
    if (e(paramString)) {
      return 0;
    }
    int i1 = this.y.size();
    int k = 0;
    while (k < i1)
    {
      if (a(((j)this.y.get(k)).d, paramString))
      {
        if (((j)this.y.get(k)).k.equals("")) {
          return 0;
        }
        return Integer.parseInt(((j)this.y.get(k)).k);
      }
      k += 1;
    }
    return 0;
  }
  
  private boolean k(String paramString)
  {
    if (!e(paramString)) {
      return false;
    }
    int i3 = this.y.size();
    int i2 = 0;
    int k = 0;
    int i1 = 0;
    label26:
    if (i2 < i3) {
      if (((j)this.y.get(i2)).d.equals(paramString))
      {
        if (((j)this.y.get(i2)).e.equals("")) {
          i1 = 0;
        }
      }
      else
      {
        label81:
        if ((!a(paramString, ((j)this.y.get(i2)).d)) || ((!((j)this.y.get(i2)).f.equals("1")) && ((((j)this.y.get(i2)).n.equals("")) || (Integer.parseInt(((j)this.y.get(i2)).n) <= 0)))) {
          break label215;
        }
        k += 1;
      }
    }
    label215:
    for (;;)
    {
      i2 += 1;
      break label26;
      i1 = Integer.parseInt(((j)this.y.get(i2)).e);
      break label81;
      if (i1 != k) {
        break;
      }
      return true;
    }
  }
  
  private int l(String paramString)
  {
    if (paramString.equals("")) {
      return 0;
    }
    return Integer.parseInt(paramString);
  }
  
  public boolean OnChildClick(View paramView)
  {
    if (((Integer)paramView.getTag()).intValue() == 0) {
      finish();
    }
    return false;
  }
  
  public void b(int paramInt)
  {
    if (paramInt == 0)
    {
      localToast = Toast.makeText(this, "　　您并未做任何表决。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
    }
    do
    {
      return;
      if (paramInt == 1)
      {
        localToast = Toast.makeText(this, "　　投票结果正在发送中，请稍后。", 0);
        localToast.setGravity(17, 0, 0);
        localToast.show();
        return;
      }
    } while (paramInt != 2);
    Toast localToast = Toast.makeText(this, "　　投票结果仍在发送中，请稍后。", 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.d = "投票表决";
    paramct.p = this;
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.b = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramh == this.F)
    {
      paramh = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a(paramh, this))
      {
        paramj = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
        if (paramj.a() != null) {}
      }
    }
    label193:
    label214:
    label235:
    label256:
    label277:
    label298:
    label319:
    label340:
    label361:
    label382:
    label403:
    label474:
    label487:
    label500:
    label513:
    label526:
    label539:
    label552:
    label565:
    label578:
    label591:
    label604:
    while (paramh != this.G)
    {
      return;
      if (!paramj.b())
      {
        paramh = Toast.makeText(this, paramj.d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      }
      int i1 = paramj.g();
      if (i1 == 0)
      {
        if (this.x == 2)
        {
          this.i.setBackgroundResource(2130838490);
          return;
        }
        this.t.setBackgroundResource(2130838490);
        return;
      }
      this.i.setBackgroundColor(-1);
      this.t.setBackgroundColor(-1);
      if (this.y != null) {
        this.y.clear();
      }
      this.y = new Vector();
      int k = 0;
      if (k < i1)
      {
        j localj = new j(this);
        if (paramj.a(k, "2529") == null)
        {
          paramh = "";
          localj.a = paramh;
          if (paramj.a(k, "6077") != null) {
            break label474;
          }
          paramh = "";
          localj.b = paramh;
          if (paramj.a(k, "6075") != null) {
            break label487;
          }
          paramh = "";
          localj.c = paramh;
          if (paramj.a(k, "6076") != null) {
            break label500;
          }
          paramh = "";
          localj.d = paramh;
          if (paramj.a(k, "2531") != null) {
            break label513;
          }
          paramh = "";
          localj.e = paramh;
          if (paramj.a(k, "1946") != null) {
            break label526;
          }
          paramh = "";
          localj.f = paramh;
          if (paramj.a(k, "1739") != null) {
            break label539;
          }
          paramh = "";
          localj.g = paramh;
          if (paramj.a(k, "1021") != null) {
            break label552;
          }
          paramh = "";
          localj.h = paramh;
          if (paramj.a(k, "1019") != null) {
            break label565;
          }
          paramh = "";
          localj.i = paramh;
          if (paramj.a(k, "1036") != null) {
            break label578;
          }
          paramh = "";
          localj.j = paramh;
          if (paramj.a(k, "1462") != null) {
            break label591;
          }
          paramh = "";
          localj.k = paramh;
          if (paramj.a(k, "1800") != null) {
            break label604;
          }
        }
        for (paramh = "";; paramh = paramj.a(k, "1800"))
        {
          localj.l = paramh;
          localj.m = "0";
          localj.n = "";
          this.y.add(localj);
          k += 1;
          break;
          paramh = paramj.a(k, "2529");
          break label193;
          paramh = paramj.a(k, "6077");
          break label214;
          paramh = paramj.a(k, "6075");
          break label235;
          paramh = paramj.a(k, "6076");
          break label256;
          paramh = paramj.a(k, "2531");
          break label277;
          paramh = paramj.a(k, "1946");
          break label298;
          paramh = paramj.a(k, "1739");
          break label319;
          paramh = paramj.a(k, "1021");
          break label340;
          paramh = paramj.a(k, "1019");
          break label361;
          paramh = paramj.a(k, "1036");
          break label382;
          paramh = paramj.a(k, "1462");
          break label403;
        }
      }
      if (this.x == 2)
      {
        if (this.A == null)
        {
          this.A = new h(this);
          this.i.setAdapter(this.A);
          return;
        }
        this.A.notifyDataSetChanged();
        this.i.scrollTo(0, 0);
        return;
      }
      if (this.B == null)
      {
        this.B = new i(this);
        this.t.setAdapter(this.B);
        return;
      }
      this.B.notifyDataSetChanged();
      this.t.scrollTo(0, 0);
      return;
      paramh = Toast.makeText(this, "　　连接失败，请重试!", 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
      return;
    }
    this.E += 1;
    if ((this.C >= this.y.size()) || (this.D == this.E))
    {
      new AlertDialog.Builder(this).setTitle("提示").setMessage("您的投票已全部发送。").setPositiveButton("确定", new f(this)).setCancelable(false).show();
      return;
    }
    this.C += 1;
    i();
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
    setContentView(2130903581);
    a();
    b();
    d();
    h();
  }
  
  public void netException(com.android.dazhihui.a.b.h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    if (this == b.a().f()) {
      b(9);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\VoteScreen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */