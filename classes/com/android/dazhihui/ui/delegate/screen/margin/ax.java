package com.android.dazhihui.ui.delegate.screen.margin;

import android.app.AlertDialog.Builder;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.widget.DropDownEditTextView;
import java.util.ArrayList;

public class ax
  extends ad
{
  public static String[] c = { "人民币" };
  private com.android.dazhihui.a.b.u A;
  private com.android.dazhihui.a.b.u B;
  private int d = -1;
  private View e;
  private LinearLayout f;
  private DropDownEditTextView g;
  private EditText h;
  private EditText i;
  private EditText j;
  private Button k;
  private Button l;
  private LinearLayout m;
  private DropDownEditTextView n;
  private EditText o;
  private TextView p;
  private EditText q;
  private EditText r;
  private EditText s;
  private Button t;
  private Button u;
  private int v = 0;
  private String w;
  private String x;
  private String y;
  private com.android.dazhihui.a.b.u z;
  
  public ax() {}
  
  public ax(int paramInt)
  {
    this.v = paramInt;
  }
  
  private void e()
  {
    if (1 == this.v)
    {
      this.m = ((LinearLayout)this.e.findViewById(2131559754));
      this.n = ((DropDownEditTextView)this.e.findViewById(2131559139));
      this.o = ((EditText)this.e.findViewById(2131559140));
      this.p = ((TextView)this.e.findViewById(2131559141));
      this.q = ((EditText)this.e.findViewById(2131559756));
      this.r = ((EditText)this.e.findViewById(2131559758));
      this.s = ((EditText)this.e.findViewById(2131559759));
      this.t = ((Button)this.e.findViewById(2131559757));
      this.u = ((Button)this.e.findViewById(2131559760));
      return;
    }
    this.f = ((LinearLayout)this.e.findViewById(2131559747));
    this.g = ((DropDownEditTextView)this.e.findViewById(2131559748));
    this.h = ((EditText)this.e.findViewById(2131559749));
    this.i = ((EditText)this.e.findViewById(2131559750));
    this.j = ((EditText)this.e.findViewById(2131559752));
    this.k = ((Button)this.e.findViewById(2131559751));
    this.l = ((Button)this.e.findViewById(2131559753));
  }
  
  private void f()
  {
    int i1;
    if (this.v == 0)
    {
      this.f.setVisibility(0);
      this.g.setEditable(false);
      localArrayList = new ArrayList();
      if (c != null)
      {
        i1 = 0;
        while (i1 < c.length)
        {
          localArrayList.add(c[i1]);
          i1 += 1;
        }
      }
      this.g.a(localArrayList, 0, true);
    }
    while (1 != this.v) {
      return;
    }
    this.m.setVisibility(0);
    this.n.setEditable(false);
    ArrayList localArrayList = new ArrayList();
    if (o.z != null)
    {
      i1 = 0;
      while (i1 < o.z.length)
      {
        localArrayList.add(o.q(o.z[i1][0]) + " " + o.z[i1][1]);
        i1 += 1;
      }
    }
    this.n.a(localArrayList, 0, true);
  }
  
  private void g()
  {
    if (this.v == 0)
    {
      this.k.setOnClickListener(new ay(this));
      this.l.setOnClickListener(new az(this));
    }
    while (1 != this.v) {
      return;
    }
    this.o.addTextChangedListener(new ba(this));
    this.n.setOnItemChangeListener(new bb(this));
    this.t.setOnClickListener(new bc(this));
    this.u.setOnClickListener(new bd(this));
  }
  
  private void h()
  {
    this.w = null;
    this.p.setText("股票名称");
    this.q.setText("");
    this.r.setText("");
    this.s.setText("");
  }
  
  private void i()
  {
    String str2 = "";
    String str1 = "";
    if (this.v == 0)
    {
      if (this.j.getText().equals(""))
      {
        a(1);
        return;
      }
      str2 = "币种：" + this.g.getCurrentItem() + "\n可用金额：" + this.h.getText().toString() + "\n需还款额：" + this.i.getText().toString() + "\n还款金额：" + this.j.getText().toString();
      str1 = "您确认直接还款么？";
    }
    for (;;)
    {
      new AlertDialog.Builder(getActivity()).setTitle(str1).setMessage(str2).setPositiveButton(2131165363, new bf(this)).setNegativeButton(2131165331, new be(this)).show();
      return;
      if (this.v == 1)
      {
        if ((this.w == null) || (this.s.getText().equals("")))
        {
          a(0);
          return;
        }
        str2 = "股东账号：" + this.x + "\n股票代码：" + this.w + "\n最大可还：" + this.q.getText().toString() + "\n需还券量：" + this.r.getText().toString() + "\n还券券量：" + this.s.getText().toString();
        str1 = "您确认直接还券么？";
      }
    }
  }
  
  private void k()
  {
    if (!o.r()) {
      return;
    }
    String str1;
    switch (this.v)
    {
    default: 
      return;
    case 0: 
      String str2 = "";
      String str3 = "";
      str1 = str3;
      localObject = str2;
      if (o.z != null)
      {
        str1 = str3;
        localObject = str2;
        if (o.z.length > 0)
        {
          localObject = o.z[0][0];
          str1 = o.z[0][1];
        }
      }
      break;
    }
    for (Object localObject = o.g("12026").a("1026", "5").a("1019", str1).a("1021", (String)localObject).a("1003", "").a("1036", "").a("1041", this.j.getText().toString()).a("1040", "").a("1028", this.g.getSelectedItemPosition()).a("1558", 0);; localObject = o.g("12026").a("1026", "6").a("1019", this.x).a("1021", this.y).a("1036", this.w).a("1041", "0").a("1040", this.s.getText().toString()).a("1558", 0))
    {
      this.B = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      registRequestListener(this.B);
      a(this.B, true);
      return;
      if ((this.x == null) || (this.y == null) || (this.w == null)) {
        break;
      }
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt == 0)
    {
      localToast = Toast.makeText(getActivity(), "　　股票代码跟还款金额必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    if (paramInt == 1)
    {
      localToast = Toast.makeText(getActivity(), "　　还款金额必须填写。", 0);
      localToast.setGravity(17, 0, 0);
      localToast.show();
      return;
    }
    Toast localToast = Toast.makeText(getActivity(), "　　委托请求提交中，请稍候……", 0);
    localToast.setGravity(17, 0, 0);
    localToast.show();
  }
  
  public void b()
  {
    if (this.e == null) {}
    do
    {
      return;
      if (this.v == 0)
      {
        this.h.setText("");
        this.i.setText("");
        this.j.setText("");
        return;
      }
    } while (this.v != 1);
    this.o.setText("");
  }
  
  public void c()
  {
    if ((!o.r()) || (this.w == null)) {
      return;
    }
    this.z = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11102").a("1003", "0").a("1036", this.w).h()) });
    registRequestListener(this.z);
    a(this.z, true);
  }
  
  public void d()
  {
    if (!o.r()) {
      return;
    }
    switch (this.v)
    {
    default: 
      return;
    }
    for (com.android.dazhihui.ui.delegate.b.h localh = o.g("12124").a("1019", "").a("1021", "").a("1036", "").a("1041", "0").a("1026", "5");; localh = o.g("12124").a("1019", this.x).a("1021", this.y).a("1036", this.w).a("1041", "0").a("1026", "6"))
    {
      this.A = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.A);
      a(this.A, true);
      return;
      if ((this.w == null) || (this.x == null) || (this.y == null)) {
        break;
      }
    }
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    label246:
    label258:
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            paramj = ((v)paramj).b();
          } while (!com.android.dazhihui.ui.delegate.b.u.a(paramj, getActivity()));
          if (paramh != this.z) {
            break;
          }
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
          if (!paramh.b())
          {
            paramh = Toast.makeText(getActivity(), paramh.d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
        } while (paramh.g() == 0);
        this.y = paramh.a(0, "1021");
        if (o.z != null)
        {
          i1 = o.z.length - 1;
          if (i1 >= 0)
          {
            if (!o.z[i1][0].equals(this.y)) {
              break label258;
            }
            paramj = o.z[i1][2];
            if ((paramj == null) || (!paramj.equals("1"))) {
              break label246;
            }
            this.x = o.z[i1][1];
          }
        }
        paramj = this.n.getDataList();
        int i1 = 0;
        for (;;)
        {
          if (i1 < paramj.size())
          {
            if (((String)paramj.get(i1)).contains(this.x)) {
              this.n.a(this.n.getDataList(), i1, true);
            }
          }
          else
          {
            this.p.setText(paramh.a(0, "1037"));
            d();
            return;
            this.x = o.z[i1][1];
            i1 -= 1;
            break;
          }
          i1 += 1;
        }
        if (paramh == this.A)
        {
          paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
          if (!paramh.b())
          {
            b(paramh.d());
            return;
          }
          paramj = paramh.a(0, "1462");
          paramh = paramh.a(0, "1568");
          switch (this.v)
          {
          default: 
            return;
          case 0: 
            localEditText = this.h;
            localObject = paramj;
            if (paramj == null) {
              localObject = "";
            }
            localEditText.setText((CharSequence)localObject);
            paramj = this.i;
            if (paramh == null) {
              paramh = "";
            }
            for (;;)
            {
              paramj.setText(paramh);
              return;
            }
          }
          EditText localEditText = this.q;
          Object localObject = paramj;
          if (paramj == null) {
            localObject = "";
          }
          localEditText.setText((CharSequence)localObject);
          localObject = this.r;
          paramj = paramh;
          if (paramh == null) {
            paramj = "";
          }
          ((EditText)localObject).setText(paramj);
          return;
        }
      } while (paramh != this.B);
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (!paramh.b()) {
        break;
      }
      paramh = paramh.a(0, "1042");
      b("　　委托请求提交成功。合同号为：" + paramh);
    } while (this.v != 0);
    d();
    return;
    b(paramh.d());
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.e = paramLayoutInflater.inflate(2130903258, paramViewGroup, false);
    e();
    f();
    g();
    if (this.v == 0) {
      d();
    }
    return this.e;
  }
  
  public void show()
  {
    super.show();
    if (this.e == null) {}
    while (this.v != 0) {
      return;
    }
    d();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */