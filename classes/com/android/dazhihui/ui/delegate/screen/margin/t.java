package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.res.Resources;
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
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.widget.DropDownEditTextView;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;

public class t
  extends ad
{
  public static int c = 0;
  public static int d = 1;
  private String A;
  private String B;
  private String C;
  private int D = c;
  protected int e = 0;
  protected int f = 0;
  public String[][] g = (String[][])null;
  public int[][] h = (int[][])null;
  com.android.dazhihui.a.b.u i;
  com.android.dazhihui.a.b.u j;
  com.android.dazhihui.a.b.u k;
  com.android.dazhihui.a.b.u l;
  private DropDownEditTextView m;
  private DropDownEditTextView n;
  private TextView o;
  private EditText p;
  private EditText q;
  private TextView r;
  private Button s;
  private TableLayoutGroup t;
  private LinearLayout u;
  private View v;
  private String[] w;
  private String[] x;
  private int y = 0;
  private String z;
  
  public t() {}
  
  public t(int paramInt)
  {
    this.D = paramInt;
  }
  
  private void d()
  {
    if (this.v == null) {
      return;
    }
    this.n = ((DropDownEditTextView)this.v.findViewById(2131559732));
    this.m = ((DropDownEditTextView)this.v.findViewById(2131559730));
    this.p = ((EditText)this.v.findViewById(2131559140));
    this.o = ((TextView)this.v.findViewById(2131559141));
    this.q = ((EditText)this.v.findViewById(2131559151));
    this.r = ((TextView)this.v.findViewById(2131559148));
    this.s = ((Button)this.v.findViewById(2131558520));
    this.t = ((TableLayoutGroup)this.v.findViewById(2131559734));
    this.u = ((LinearLayout)this.v.findViewById(2131559731));
  }
  
  private void e()
  {
    this.m.setEditable(false);
    Object localObject1 = new ArrayList();
    int i1;
    if (o.z != null)
    {
      i1 = 0;
      while (i1 < o.z.length)
      {
        ((ArrayList)localObject1).add(o.q(o.z[i1][0]) + " " + o.z[i1][1]);
        i1 += 1;
      }
    }
    this.m.a((ArrayList)localObject1, 0, true);
    if (bg.g != null)
    {
      ArrayList localArrayList = new ArrayList();
      int i2 = bg.g.size();
      i1 = 0;
      if (i1 < i2)
      {
        Object localObject2 = (bh)bg.g.get(i1);
        if (((bh)localObject2).d != null)
        {
          localObject1 = ((bh)localObject2).d;
          label154:
          if (((bh)localObject2).c == null) {
            break label212;
          }
        }
        label212:
        for (localObject2 = ((bh)localObject2).c;; localObject2 = "")
        {
          localArrayList.add(o.q((String)localObject2) + " " + (String)localObject1);
          i1 += 1;
          break;
          localObject1 = "";
          break label154;
        }
      }
      this.n.a(localArrayList, 0, true);
    }
    if (!bg.a()) {
      this.u.setVisibility(8);
    }
    this.w = a.bG;
    this.x = a.bH;
    if ((this.w == null) || (this.x == null))
    {
      this.w = new String[] { "" };
      this.x = new String[] { "" };
    }
    n();
    this.t.setHeaderColumn(this.w);
    this.t.setPullDownLoading(false);
    this.t.setLoadingDown(false);
    this.t.setColumnClickable(null);
    this.t.setContinuousLoading(false);
    this.t.setHeaderBackgroundColor(getResources().getColor(2131493677));
    this.t.setDrawHeaderSeparateLine(false);
    this.t.setHeaderTextColor(getResources().getColor(2131493099));
    this.t.setHeaderFontSize(getResources().getDimension(2131230899));
    this.t.setHeaderHeight((int)getResources().getDimension(2131230814));
    this.t.setContentRowHeight(this.t.getContentHeight() / 5 * 4);
    this.t.setLeftPadding(25);
    this.t.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
    this.t.setListDivideDrawable(getResources().getDrawable(2130838328));
    this.t.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
    this.t.setStockNameColor(getResources().getColor(2131493235));
    this.t.setFirstColumnColorDifferent(true);
  }
  
  private void f()
  {
    this.t.setOnTableLayoutClickListener(new u(this));
    this.p.addTextChangedListener(new v(this));
    this.s.setOnClickListener(new w(this));
  }
  
  private void g()
  {
    this.o.setText("");
    this.q.setText("");
    this.r.setText("可划转-股");
    this.A = "3";
    this.z = null;
    this.B = null;
    this.C = null;
  }
  
  private void h()
  {
    if (!o.r()) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12350").a("1036", "");
    if (this.D == d) {
      localh.a("1552", "1");
    }
    for (;;)
    {
      if ((bg.g != null) && (this.D == c))
      {
        bh localbh = (bh)bg.g.get(0);
        localh.a("1016", localbh.b);
        localh.a("1030", localbh.h);
      }
      this.i = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.i);
      a(this.i, true);
      return;
      localh.a("1552", "0");
    }
  }
  
  private void i()
  {
    if ((!o.r()) || (this.z == null) || (this.z.length() < 6)) {
      return;
    }
    this.j = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11102").a("1003", "0").a("1036", this.z).h()) });
    registRequestListener(this.j);
    a(this.j, true);
  }
  
  private void k()
  {
    if ((!o.r()) || (this.z == null) || (this.z.length() < 6) || (o.z == null) || (o.z.length == 0)) {
      return;
    }
    com.android.dazhihui.ui.delegate.b.h localh = o.g("12124").a("1021", o.z[this.m.getSelectedItemPosition()][0]).a("1019", o.z[this.m.getSelectedItemPosition()][1]).a("1036", this.z);
    Object localObject;
    if (this.C == null)
    {
      localObject = "";
      localObject = localh.a("1041", (String)localObject);
      if (this.D != c) {
        break label189;
      }
      ((com.android.dazhihui.ui.delegate.b.h)localObject).a("1026", "7");
    }
    for (;;)
    {
      this.k = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(((com.android.dazhihui.ui.delegate.b.h)localObject).h()) });
      registRequestListener(this.k);
      a(this.k, true);
      return;
      localObject = this.C;
      break;
      label189:
      if (this.D == d) {
        ((com.android.dazhihui.ui.delegate.b.h)localObject).a("1026", "8");
      }
    }
  }
  
  private void l()
  {
    if ((!o.r()) || (this.z == null) || (this.z.length() < 6) || (o.z == null) || (o.z.length == 0)) {
      return;
    }
    String str;
    if (this.D == c) {
      str = "1";
    }
    for (;;)
    {
      if (bg.g != null) {}
      for (bh localbh = (bh)bg.g.get(this.n.getSelectedItemPosition());; localbh = new bh())
      {
        this.l = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12150").a("1026", str).a("1019", o.z[this.m.getSelectedItemPosition()][1]).a("1021", o.z[this.m.getSelectedItemPosition()][0]).a("1003", "").a("1036", this.z).a("1040", this.q.getText().toString()).a("1661", localbh.d).a("1715", localbh.g).h()) });
        registRequestListener(this.l);
        a(this.l, true);
        return;
        if (this.D != d) {
          break label255;
        }
        str = "2";
        break;
      }
      label255:
      str = "";
    }
  }
  
  private void n()
  {
    if ((this.w == null) || (this.x == null)) {}
    int i3;
    int i2;
    do
    {
      return;
      i1 = 0;
      i3 = -1;
      i2 = -1;
      while (i1 < this.x.length)
      {
        if (this.x[i1].equals("1036")) {
          i3 = i1;
        }
        if (this.x[i1].equals("1037")) {
          i2 = i1;
        }
        i1 += 1;
      }
    } while ((i2 == -1) || (i3 == -1));
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.w;
    int i4 = localObject.length;
    int i1 = 0;
    while (i1 < i4)
    {
      localArrayList.add(localObject[i1]);
      i1 += 1;
    }
    localObject = new ArrayList();
    String[] arrayOfString = this.x;
    i4 = arrayOfString.length;
    i1 = 0;
    while (i1 < i4)
    {
      ((List)localObject).add(arrayOfString[i1]);
      i1 += 1;
    }
    if (i2 > i3)
    {
      localArrayList.remove(i2);
      ((List)localObject).remove(i2);
      localArrayList.remove(i3);
      ((List)localObject).remove(i3);
    }
    for (;;)
    {
      localArrayList.add(0, "名称");
      ((List)localObject).add(0, "1037");
      this.w = ((String[])localArrayList.toArray(new String[localArrayList.size()]));
      this.x = ((String[])((List)localObject).toArray(new String[((List)localObject).size()]));
      return;
      localArrayList.remove(i3);
      ((List)localObject).remove(i3);
      localArrayList.remove(i2);
      ((List)localObject).remove(i2);
    }
  }
  
  public void a(int paramInt)
  {
    String str = "";
    switch (paramInt)
    {
    }
    for (;;)
    {
      Toast.makeText(getActivity(), str, 0).show();
      return;
      str = "  证券代码、划转数量都必须填写。";
    }
  }
  
  public void b()
  {
    if (this.v == null) {
      return;
    }
    this.t.a();
    this.t.scrollTo(0, 0);
    this.p.setText("");
  }
  
  public void c()
  {
    b();
    h();
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((com.android.dazhihui.a.b.v)paramj).b();
    Object localObject1;
    if (com.android.dazhihui.ui.delegate.b.u.a(paramj, getActivity()))
    {
      if (paramh != this.i) {
        break label445;
      }
      localObject1 = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
        break label74;
      }
      paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
    }
    label74:
    label445:
    label728:
    label745:
    label771:
    do
    {
      do
      {
        do
        {
          int i1;
          do
          {
            do
            {
              return;
              this.e = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
              this.f = ((com.android.dazhihui.ui.delegate.b.h)localObject1).b("1289");
              if ((this.e == 0) && (this.t.getDataModel().size() <= 0))
              {
                this.t.setBackgroundResource(2130838490);
                return;
              }
              this.t.setBackgroundResource(2130839011);
              localObject2 = new ArrayList();
              new StringBuilder();
            } while (this.e <= 0);
            int i2 = 0;
            while (i2 < this.e)
            {
              mh localmh = new mh();
              paramh = new String[this.w.length];
              int[] arrayOfInt = new int[this.w.length];
              int i3 = 0;
              for (;;)
              {
                if (i3 < this.w.length) {
                  try
                  {
                    paramh[i3] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i2, this.x[i3]).trim();
                    paramh[i3] = o.c(this.x[i3], paramh[i3]);
                    arrayOfInt[i3] = getResources().getColor(2131493235);
                    paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i2, "1064");
                    if ((paramj != null) && (Double.parseDouble(paramj) > 0.0D))
                    {
                      i1 = -65536;
                      paramh[i3] = o.c(this.x[i3], paramh[i3]);
                      arrayOfInt[i3] = i1;
                      i3 += 1;
                    }
                  }
                  catch (Exception paramj)
                  {
                    for (;;)
                    {
                      paramh[i3] = "-";
                      continue;
                      if ((paramj != null) && (Double.parseDouble(paramj) < 0.0D)) {
                        i1 = getResources().getColor(2131492932);
                      } else {
                        i1 = -16777216;
                      }
                    }
                  }
                }
              }
              paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i2, "1036");
              localmh.a = paramh;
              localmh.b = arrayOfInt;
              paramh = paramj;
              if (paramj == null) {
                paramh = "";
              }
              localmh.d = paramh;
              ((List)localObject2).add(localmh);
              i2 += 1;
            }
            this.t.a((List)localObject2, this.y);
            return;
            if (paramh != this.j) {
              break;
            }
            localObject1 = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
            {
              paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
            }
          } while (((com.android.dazhihui.ui.delegate.b.h)localObject1).g() <= 0);
          this.A = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1021");
          paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1037");
          Object localObject2 = this.o;
          paramh = paramj;
          if (paramj == null) {
            paramh = "";
          }
          ((TextView)localObject2).setText(paramh);
          this.C = o.i(o.b(((com.android.dazhihui.ui.delegate.b.h)localObject1).a(0, "1181"), 2));
          if (o.z != null)
          {
            i1 = o.z.length - 1;
            if (i1 >= 0)
            {
              if (!o.z[i1][0].equals(this.A)) {
                break label745;
              }
              paramh = o.z[i1][2];
              if ((paramh == null) || (!paramh.equals("1"))) {
                break label728;
              }
              this.m.a(this.m.getDataList(), i1, true);
            }
          }
          if (bg.g != null) {
            i1 = bg.g.size() - 1;
          }
          for (;;)
          {
            if (i1 >= 0)
            {
              paramh = (bh)bg.g.get(i1);
              if (!paramh.c.equals(this.A)) {
                break label771;
              }
              if ((paramh.e != null) && (paramh.e.equals("1"))) {
                this.n.a(this.n.getDataList(), i1, true);
              }
            }
            else
            {
              k();
              return;
              this.m.a(this.m.getDataList(), i1, true);
              i1 -= 1;
              break;
            }
            this.n.a(this.n.getDataList(), i1, true);
            i1 -= 1;
          }
          if (paramh != this.k) {
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
        } while (paramh.g() <= 0);
        this.B = paramh.a(0, "1462");
        paramj = this.r;
        localObject1 = new StringBuilder().append("可划转");
        if (this.B == null) {}
        for (paramh = "";; paramh = this.B)
        {
          paramj.setText(paramh + "股");
          return;
        }
      } while (paramh != this.l);
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (!paramh.b())
      {
        b(paramh.d());
        return;
      }
    } while (paramh.g() <= 0);
    paramh = paramh.a(0, "1042");
    a("划转成功，委托编号：" + paramh);
    b();
    h();
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.v = paramLayoutInflater.inflate(2130903254, paramViewGroup, false);
    d();
    e();
    f();
    h();
    return this.v;
  }
  
  public void show()
  {
    super.show();
    if (this.v != null)
    {
      this.p.setText("");
      b();
      h();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */