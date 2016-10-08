package com.android.dazhihui.ui.delegate.screen.margin;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.e;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.ad;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.flip.CircleFlowIndicator;
import com.android.dazhihui.ui.widget.flip.ViewFlow;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class h
  extends ad
{
  private View A;
  private int B;
  private PopupWindow C;
  private com.android.dazhihui.a.b.u D;
  private com.android.dazhihui.a.b.u E;
  public int c;
  public Comparator<mh> d;
  private LinearLayout e;
  private TableLayoutGroup f;
  private ViewFlow g;
  private ListView h;
  private n i;
  private int j;
  private int k;
  private int l;
  private e m;
  private e n;
  private e o;
  private ImageView p;
  private TextView q;
  private CircleFlowIndicator r;
  private int s = -1;
  private RelativeLayout t;
  private boolean u = true;
  private boolean v = false;
  private int w = 0;
  private String[] x = { "名称", "市值", "盈亏", "收益率", "持仓", "可用", "成本", "现价" };
  private String[] y = { "1037", "1065", "1064", "1320", "1060", "1061", "1062", "1181", "1036", "1019", "1021" };
  private String[] z;
  
  public h()
  {
    String[] arrayOfString;
    if (a.d == null)
    {
      arrayOfString = new String[5];
      arrayOfString[0] = "1028";
      arrayOfString[1] = "1077";
      arrayOfString[2] = "1078";
      arrayOfString[3] = "1065";
      arrayOfString[4] = "1087";
    }
    for (;;)
    {
      this.z = arrayOfString;
      this.E = null;
      this.d = new m(this);
      return;
      arrayOfString = a.d;
    }
  }
  
  private void d()
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
  
  public void a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    LinearLayout localLinearLayout1;
    if (this.C == null)
    {
      this.C = new PopupWindow(getActivity());
      localLinearLayout1 = (LinearLayout)LayoutInflater.from(getActivity()).inflate(2130903528, null);
      this.C.setContentView(localLinearLayout1);
      this.C.setBackgroundDrawable(new BitmapDrawable());
      this.C.setWidth(this.f.getWidth());
      this.C.setHeight(this.f.getContentHeight() + 30);
      this.C.setOutsideTouchable(true);
      this.C.setFocusable(true);
      this.C.setOnDismissListener(new k(this));
    }
    for (;;)
    {
      LinearLayout localLinearLayout2 = (LinearLayout)localLinearLayout1.findViewById(2131560711);
      LinearLayout localLinearLayout3 = (LinearLayout)localLinearLayout1.findViewById(2131560712);
      localLinearLayout1 = (LinearLayout)localLinearLayout1.findViewById(2131560713);
      paramString1 = new l(this, paramString1, paramString3, paramString2);
      localLinearLayout2.setOnClickListener(paramString1);
      localLinearLayout3.setOnClickListener(paramString1);
      localLinearLayout1.setOnClickListener(paramString1);
      int i2 = this.f.getHeight() - this.f.getHeaderHeight() - (this.f.getContentHeight() * (paramInt + 1) + this.f.getScrllY());
      int i1 = i2;
      if (i2 < this.f.getContentHeight())
      {
        if (paramInt == this.f.getDataModel().size() - 1) {
          this.c = (i2 - this.f.getContentHeight());
        }
        this.f.a(0, i2 - this.f.getContentHeight());
        this.f.invalidate();
        i1 = this.f.getContentHeight();
      }
      this.C.showAsDropDown(this.f, 0, -i1 - 30);
      return;
      localLinearLayout1 = (LinearLayout)this.C.getContentView();
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.E = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12130").a("1019", "").a("1036", "").a("1206", "").a("1277", "").h()) });
    registRequestListener(this.E);
    a(this.E, paramBoolean);
  }
  
  public void b()
  {
    if (!o.r()) {
      return;
    }
    this.D = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("12132").a("1028", "").a("1234", "1").h()) });
    registRequestListener(this.D);
    a(this.D, true);
  }
  
  public void c()
  {
    this.s = -1;
    this.u = true;
    this.f.a();
    b();
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, com.android.dazhihui.a.b.j paramj)
  {
    super.handleResponse(paramh, paramj);
    Object localObject1;
    if (paramh == this.D)
    {
      localObject1 = ((v)paramj).b();
      if (com.android.dazhihui.ui.delegate.b.u.a((com.android.dazhihui.ui.delegate.b.u)localObject1, getActivity()))
      {
        if (this.u) {
          a(true);
        }
        this.u = false;
        localObject1 = com.android.dazhihui.ui.delegate.b.h.b(((com.android.dazhihui.ui.delegate.b.u)localObject1).e());
        if (!((com.android.dazhihui.ui.delegate.b.h)localObject1).b())
        {
          paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject1).d(), 0);
          paramh.setGravity(17, 0, 0);
          paramh.show();
        }
      }
    }
    int i1;
    String str1;
    Object localObject2;
    Object localObject4;
    Object localObject5;
    int i3;
    int i4;
    do
    {
      do
      {
        do
        {
          return;
          this.j = ((com.android.dazhihui.ui.delegate.b.h)localObject1).g();
          if (this.j > 0)
          {
            this.m = new e();
            this.n = new e();
            this.o = new e();
            i1 = this.j;
            i2 = 0;
            i1 -= 1;
            if (i1 >= 0)
            {
              String str2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1028");
              str1 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1087");
              localObject2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1065");
              localObject3 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1064");
              localObject4 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1078");
              localObject5 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1079");
              if ((str2.equals("0")) && (i2 == 0))
              {
                str2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1415");
                this.m.a(str1);
                this.m.b((String)localObject2);
                this.m.c((String)localObject3);
                this.m.d((String)localObject4);
                this.m.e((String)localObject5);
                i3 = i2;
                if (str2 != null)
                {
                  i3 = i2;
                  if (str2.equals("1")) {
                    i3 = 1;
                  }
                }
              }
              for (;;)
              {
                i1 -= 1;
                i2 = i3;
                break;
                if (str2.equals("1"))
                {
                  str2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1415");
                  this.n.a(str1);
                  this.n.b((String)localObject2);
                  this.n.c((String)localObject3);
                  this.n.d((String)localObject4);
                  this.n.e((String)localObject5);
                  i3 = i2;
                  if (str2 != null)
                  {
                    i3 = i2;
                    if (str2.equals("1")) {
                      i3 = i2;
                    }
                  }
                }
                else
                {
                  i3 = i2;
                  if (str2.equals("2"))
                  {
                    str2 = ((com.android.dazhihui.ui.delegate.b.h)localObject1).a(i1, "1415");
                    this.o.a(str1);
                    this.o.b((String)localObject2);
                    this.o.c((String)localObject3);
                    this.o.d((String)localObject4);
                    this.o.e((String)localObject5);
                    i3 = i2;
                    if (str2 != null)
                    {
                      i3 = i2;
                      if (str2.equals("1")) {
                        i3 = i2;
                      }
                    }
                  }
                }
              }
            }
          }
          this.i.notifyDataSetChanged();
        } while (paramh != this.E);
        paramh = ((v)paramj).b();
      } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity()));
      localObject2 = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (!((com.android.dazhihui.ui.delegate.b.h)localObject2).b())
      {
        paramh = Toast.makeText(getActivity(), ((com.android.dazhihui.ui.delegate.b.h)localObject2).d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      }
      this.k = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g();
      this.l = ((com.android.dazhihui.ui.delegate.b.h)localObject2).b("1289");
      i4 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).g();
      if ((i4 == 0) && (this.f.getDataModel().size() == 0))
      {
        this.f.setBackgroundResource(2130838490);
        return;
      }
      this.f.setBackgroundColor(getResources().getColor(2131493677));
    } while (i4 <= 0);
    this.B = -1;
    Object localObject3 = new ArrayList();
    int i2 = 0;
    if (i2 < i4)
    {
      localObject4 = new mh();
      paramh = new String[this.x.length];
      localObject5 = new int[this.x.length];
      i3 = 0;
      for (;;)
      {
        if (i3 >= this.x.length) {
          break label920;
        }
        try
        {
          paramh[i3] = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2, this.y[i3]).trim();
          if (paramh[i3] == null) {
            paramh[i3] = "--";
          }
        }
        catch (Exception paramj)
        {
          for (;;)
          {
            paramh[i3] = "--";
            continue;
            if ((paramj != null) && (Double.parseDouble(paramj) < 0.0D)) {
              i1 = getResources().getColor(2131492932);
            } else {
              i1 = -16777216;
            }
          }
        }
        if (this.y[i3].equals("1065")) {
          this.B = i3;
        }
        paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2, "1064");
        if ((paramj == null) || (Double.parseDouble(paramj) <= 0.0D)) {
          break;
        }
        i1 = -65536;
        paramh[i3] = o.c(this.y[i3], paramh[i3]);
        localObject5[i3] = i1;
        i3 += 1;
      }
      label920:
      str1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2, "1036");
      localObject1 = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2, "1021");
      paramj = ((com.android.dazhihui.ui.delegate.b.h)localObject2).a(i2, "1019");
      ((mh)localObject4).a = paramh;
      ((mh)localObject4).b = ((int[])localObject5);
      paramh = str1;
      if (str1 == null) {
        paramh = "";
      }
      ((mh)localObject4).d = paramh;
      if (localObject1 == null)
      {
        paramh = "";
        label990:
        ((mh)localObject4).e = paramh;
        if (paramj != null) {
          break label1034;
        }
      }
      label1034:
      for (paramh = "";; paramh = paramj)
      {
        ((mh)localObject4).f = paramh;
        ((List)localObject3).add(localObject4);
        i2 += 1;
        break;
        paramh = (com.android.dazhihui.a.b.h)localObject1;
        break label990;
      }
    }
    if (this.B != -1) {
      Collections.sort((List)localObject3, this.d);
    }
    this.f.a((List)localObject3, 0);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.A = paramLayoutInflater.inflate(2130903592, paramViewGroup, false);
    this.g = ((ViewFlow)this.A.findViewById(2131561352));
    this.r = ((CircleFlowIndicator)this.A.findViewById(2131561353));
    this.h = ((ListView)this.A.findViewById(2131560795));
    this.p = ((ImageView)this.A.findViewById(2131561349));
    this.q = ((TextView)this.A.findViewById(2131561350));
    this.t = ((RelativeLayout)this.A.findViewById(2131559060));
    this.p.setBackgroundDrawable(getResources().getDrawable(2130837606));
    this.q.setText("人民币账户");
    this.e = ((LinearLayout)this.A.findViewById(2131558888));
    this.f = ((TableLayoutGroup)this.A.findViewById(2131558887));
    this.e.setVisibility(8);
    this.f.setVisibility(0);
    this.x = a.aG;
    this.y = a.aH;
    if ((this.x == null) || (this.y == null))
    {
      this.x = new String[] { "" };
      this.y = new String[] { "" };
    }
    for (;;)
    {
      this.f.setHeaderColumn(this.x);
      this.f.setPullDownLoading(false);
      this.f.setLoadingDown(false);
      this.f.setColumnClickable(null);
      this.f.setContinuousLoading(false);
      this.f.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.f.setDrawHeaderSeparateLine(false);
      this.f.setHeaderTextColor(getResources().getColor(2131493099));
      this.f.setHeaderFontSize(getResources().getDimension(2131230899));
      this.f.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.f.setLeftPadding(25);
      this.f.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.f.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.f.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.f.setStockNameColor(getResources().getColor(2131493235));
      this.f.setFirstColumnColorDifferent(true);
      this.f.setOnTableLayoutClickListener(new i(this));
      this.i = new n(this, getActivity());
      this.g.setAdapter(this.i);
      this.g.setFlowIndicator(this.r);
      this.g.setOnViewSwitchListener(new j(this));
      b();
      return this.A;
      d();
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.v)
    {
      c();
      this.v = false;
    }
  }
  
  public void show()
  {
    super.show();
    if (this.f != null) {
      c();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */