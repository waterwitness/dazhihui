package com.android.dazhihui.ui.delegate.screen.newstock;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.List;

public class p
  extends ad
{
  private int A = 0;
  private String B;
  private String C = "3";
  private String D;
  private String E;
  private boolean F = false;
  protected int c = 0;
  protected int d = 0;
  protected int e = 0;
  public String[][] f = (String[][])null;
  public int[][] g = (int[][])null;
  com.android.dazhihui.a.b.u h;
  com.android.dazhihui.a.b.u i;
  com.android.dazhihui.a.b.u j;
  com.android.dazhihui.a.b.u k;
  private TextView l;
  private EditText m;
  private EditText n;
  private EditText o;
  private TextView p;
  private TextView q;
  private Button r;
  private TextView s;
  private TextView t;
  private TableLayoutGroup u;
  private View v;
  private PopupWindow w;
  private String[] x;
  private String[] y;
  private int z = 20;
  
  private void c()
  {
    if (this.v == null) {
      return;
    }
    this.l = ((TextView)this.v.findViewById(2131560922));
    this.m = ((EditText)this.v.findViewById(2131559140));
    this.p = ((TextView)this.v.findViewById(2131559141));
    this.n = ((EditText)this.v.findViewById(2131559145));
    this.o = ((EditText)this.v.findViewById(2131559151));
    this.q = ((TextView)this.v.findViewById(2131559148));
    this.r = ((Button)this.v.findViewById(2131558520));
    this.s = ((TextView)this.v.findViewById(2131560924));
    this.t = ((TextView)this.v.findViewById(2131558534));
    this.u = ((TableLayoutGroup)this.v.findViewById(2131560925));
  }
  
  private void d()
  {
    if (o.y == o.v)
    {
      this.x = a.i;
      this.y = a.j;
    }
    for (;;)
    {
      if ((this.x == null) || (this.y == null))
      {
        this.x = new String[] { "" };
        this.y = new String[] { "" };
      }
      o();
      this.u.setHeaderColumn(this.x);
      this.u.setPullDownLoading(false);
      this.u.setLoadingDown(false);
      this.u.setColumnClickable(null);
      this.u.setContinuousLoading(false);
      this.u.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.u.setDrawHeaderSeparateLine(false);
      this.u.setHeaderTextColor(getResources().getColor(2131493099));
      this.u.setHeaderFontSize(getResources().getDimension(2131230899));
      this.u.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.u.setContentRowHeight(this.u.getContentHeight() / 5 * 4);
      this.u.setLeftPadding(25);
      this.u.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.u.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.u.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.u.setStockNameColor(getResources().getColor(2131493235));
      this.u.setFirstColumnColorDifferent(true);
      return;
      if (o.y == o.w)
      {
        this.x = a.k;
        this.y = a.l;
      }
    }
  }
  
  private void e()
  {
    LinearLayout localLinearLayout = (LinearLayout)LayoutInflater.from(getActivity()).inflate(2130903349, null);
    ((ImageView)localLinearLayout.findViewById(2131560125)).setOnClickListener(new q(this));
    this.w = new PopupWindow();
    this.w.setBackgroundDrawable(getResources().getDrawable(2131493397));
    this.w.setFocusable(true);
    this.w.setOutsideTouchable(true);
    this.w.setWidth(this.v.getWidth() * 2 / 3);
    this.w.setHeight(this.v.getHeight() * 7 / 12);
    this.w.setContentView(localLinearLayout);
  }
  
  private void f()
  {
    this.s.setOnClickListener(new r(this));
    this.t.setOnClickListener(new s(this));
    this.u.setOnTableLayoutClickListener(new t(this));
    this.m.addTextChangedListener(new u(this));
    this.r.setOnClickListener(new v(this));
  }
  
  private void g()
  {
    this.p.setText("");
    this.n.setText("");
    this.o.setText("");
    this.q.setText(getResources().getString(2131165980, new Object[] { "-" }));
    this.C = "3";
    this.D = null;
    this.B = null;
    this.E = null;
    this.F = false;
  }
  
  private void h()
  {
    this.m.setText("");
    this.l.setText("");
    this.u.a();
    this.u.e();
  }
  
  private void i()
  {
    String str = "12556";
    if (o.y == o.w) {
      str = "12558";
    }
    this.h = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(str).h()) });
    registRequestListener(this.h);
    a(this.h, true);
  }
  
  private void k()
  {
    if (!o.r()) {
      return;
    }
    String str = "12924";
    if (o.y == o.w) {
      str = "12938";
    }
    this.i = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(str).a("1036", "").a("1022", "").a("1023", "").a("1206", "").a("1277", "").a("2315", "4").a("1972", "").h()) });
    registRequestListener(this.i);
    a(this.i, true);
  }
  
  private void l()
  {
    if ((!o.r()) || (this.B == null) || (this.B.length() < 6)) {
      return;
    }
    String str = "12924";
    if (o.y == o.w) {
      str = "12938";
    }
    this.j = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(str).a("1036", this.B).a("1022", "").a("1023", "").a("1206", "0").a("1277", "1").a("2315", "4").a("1972", "").h()) });
    registRequestListener(this.j);
    a(this.j, true);
  }
  
  private void n()
  {
    if ((!o.r()) || (this.B == null) || (this.B.length() < 6) || (this.D == null)) {
      return;
    }
    String str = "12508";
    if (o.y == o.w) {
      str = "12512";
    }
    this.k = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g(str).a("1021", this.C).a("1019", this.D).a("1036", this.B).a("1041", this.n.getText().toString()).a("1040", this.o.getText().toString()).h()) });
    registRequestListener(this.k);
    a(this.k, true);
  }
  
  private void o()
  {
    if ((this.x == null) || (this.y == null)) {}
    int i3;
    int i2;
    do
    {
      return;
      i1 = 0;
      i3 = -1;
      i2 = -1;
      while (i1 < this.y.length)
      {
        if (this.y[i1].equals("1036")) {
          i3 = i1;
        }
        if (this.y[i1].equals("1037")) {
          i2 = i1;
        }
        i1 += 1;
      }
    } while ((i2 == -1) || (i3 == -1));
    ArrayList localArrayList = new ArrayList();
    Object localObject = this.x;
    int i4 = localObject.length;
    int i1 = 0;
    while (i1 < i4)
    {
      localArrayList.add(localObject[i1]);
      i1 += 1;
    }
    localObject = new ArrayList();
    String[] arrayOfString = this.y;
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
      this.x = ((String[])localArrayList.toArray(new String[localArrayList.size()]));
      this.y = ((String[])((List)localObject).toArray(new String[((List)localObject).size()]));
      return;
      localArrayList.remove(i3);
      ((List)localObject).remove(i3);
      localArrayList.remove(i2);
      ((List)localObject).remove(i2);
    }
  }
  
  public String a(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (!paramString1.equals("")) && (paramString2 != null) && (!paramString2.equals(""))) {
      try
      {
        double d1 = Double.parseDouble(paramString1);
        double d2 = Double.parseDouble(paramString2);
        if (d1 > d2) {
          return paramString2;
        }
        return paramString1;
      }
      catch (Exception paramString1)
      {
        return null;
      }
    }
    return null;
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
      str = "  申购代码、申购价格、申购数量都必须填写。";
      continue;
      str = "  未匹配到对应的股东账号";
    }
  }
  
  public void b()
  {
    this.A = 0;
    this.z = 20;
    this.u.a();
    k();
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((com.android.dazhihui.a.b.v)paramj).b();
    Object localObject1;
    if (com.android.dazhihui.ui.delegate.b.u.a(paramj, getActivity()))
    {
      if (paramh != this.i) {
        break label406;
      }
      localObject1 = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if ((NewStockMainActivity.a != null) && (NewStockMainActivity.a.length() == 6))
      {
        this.m.setText(NewStockMainActivity.a);
        this.m.setSelection(NewStockMainActivity.a.length());
        NewStockMainActivity.a = null;
      }
      if (((com.android.dazhihui.ui.delegate.b.h)localObject1).b()) {
        break label118;
      }
      paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
    }
    label118:
    label406:
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            this.c = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
            this.e = ((com.android.dazhihui.ui.delegate.b.h)localObject1).b("1289");
            if ((this.c == 0) && (this.u.getDataModel().size() <= 0))
            {
              this.u.setBackgroundResource(2130838490);
              return;
            }
            this.u.setBackgroundResource(2130839011);
            localObject2 = new ArrayList();
            new StringBuilder();
          } while (this.c <= 0);
          int i1 = 0;
          int i2;
          while (i1 < this.c)
          {
            localObject3 = new mh();
            paramh = new String[this.x.length];
            paramj = new int[this.x.length];
            i2 = 0;
            for (;;)
            {
              if (i2 < this.x.length) {
                try
                {
                  paramh[i2] = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, this.y[i2]).trim();
                  paramh[i2] = o.c(this.y[i2], paramh[i2]);
                  paramj[i2] = getResources().getColor(2131493235);
                  i2 += 1;
                }
                catch (Exception localException)
                {
                  for (;;)
                  {
                    paramh[i2] = "-";
                  }
                }
              }
            }
            ((mh)localObject3).a = paramh;
            ((mh)localObject3).b = paramj;
            paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1036");
            paramh = paramj;
            if (paramj == null) {
              paramh = "";
            }
            ((mh)localObject3).d = paramh;
            ((List)localObject2).add(localObject3);
            i1 += 1;
          }
          a((com.android.dazhihui.ui.delegate.b.h)localObject1, this.A);
          this.u.a((List)localObject2, this.A);
          return;
          if (paramh == this.h)
          {
            k();
            localObject4 = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
            if (!((com.android.dazhihui.ui.delegate.b.h)localObject4).b())
            {
              paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject4).d(), 0);
              paramh.setGravity(17, 0, 0);
              paramh.show();
              return;
            }
            i2 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).g();
            paramh = "";
            paramj = "";
            localObject1 = paramj;
            localObject2 = paramh;
            if (i2 > 0)
            {
              i1 = 0;
              localObject1 = paramj;
              localObject2 = paramh;
              if (i1 < i2)
              {
                localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1021");
                localObject3 = localObject1;
                if (!TextUtils.isEmpty((CharSequence)localObject1)) {
                  localObject3 = ((String)localObject1).trim();
                }
                if (((String)localObject3).equals("3"))
                {
                  paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1060");
                  localObject1 = paramj;
                  localObject2 = paramh;
                  if (!TextUtils.isEmpty(paramh))
                  {
                    localObject2 = paramh.trim();
                    localObject1 = paramj;
                  }
                }
                for (;;)
                {
                  i1 += 1;
                  paramj = (j)localObject1;
                  paramh = (com.android.dazhihui.a.b.h)localObject2;
                  break;
                  localObject1 = paramj;
                  localObject2 = paramh;
                  if (((String)localObject3).equals("2"))
                  {
                    paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject4).a(i1, "1060");
                    localObject1 = paramj;
                    localObject2 = paramh;
                    if (!TextUtils.isEmpty(paramj))
                    {
                      localObject1 = paramj.trim();
                      localObject2 = paramh;
                    }
                  }
                }
              }
            }
            localObject3 = this.l;
            localObject4 = getResources();
            paramh = (com.android.dazhihui.a.b.h)localObject2;
            if (TextUtils.isEmpty((CharSequence)localObject2)) {
              paramh = "-";
            }
            paramj = (j)localObject1;
            if (TextUtils.isEmpty((CharSequence)localObject1)) {
              paramj = "-";
            }
            ((TextView)localObject3).setText(((Resources)localObject4).getString(2131165981, new Object[] { paramh, paramj }));
            return;
          }
          if (paramh != this.j) {
            break;
          }
          localObject3 = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
          if (!((com.android.dazhihui.ui.delegate.b.h)localObject3).b())
          {
            paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject3).d(), 0);
            paramh.setGravity(17, 0, 0);
            paramh.show();
            return;
          }
        } while (((com.android.dazhihui.ui.delegate.b.h)localObject3).g() <= 0);
        paramh = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "2284");
        if ((paramh != null) && (!paramh.equals("1")))
        {
          paramh = Toast.makeText(getActivity(), "        申购代码无效！", 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
          this.m.setText("");
          return;
        }
        localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "2323");
        Object localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "6138");
        this.C = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1021");
        paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1037");
        Object localObject4 = this.p;
        paramh = paramj;
        if (paramj == null) {
          paramh = "";
        }
        ((TextView)localObject4).setText(paramh);
        paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject3).a(0, "1116");
        Object localObject3 = this.n;
        paramh = paramj;
        if (paramj == null) {
          paramh = "";
        }
        ((EditText)localObject3).setText(paramh);
        this.E = a((String)localObject1, (String)localObject2);
        if (this.E == null)
        {
          this.E = "-";
          this.o.setText("0");
        }
        for (;;)
        {
          this.q.setText(getResources().getString(2131165980, new Object[] { this.E }));
          return;
          if (this.E.contains(".")) {
            this.E = this.E.split("\\.")[0];
          }
          this.o.setText(this.E);
        }
      } while (paramh != this.k);
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (!paramh.b())
      {
        b(paramh.d());
        return;
      }
    } while (paramh.g() <= 0);
    paramh = paramh.a(0, "1042");
    a("申购成功，委托编号：" + paramh);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.v = paramLayoutInflater.inflate(2130903512, paramViewGroup, false);
    c();
    d();
    f();
    i();
    return this.v;
  }
  
  public void show()
  {
    super.show();
    if (this.v != null)
    {
      h();
      i();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */