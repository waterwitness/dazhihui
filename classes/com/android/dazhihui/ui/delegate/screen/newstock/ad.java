package com.android.dazhihui.ui.delegate.screen.newstock;

import android.app.DatePickerDialog.OnDateSetListener;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.v;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.screen.TradeText;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class ad
  extends com.android.dazhihui.ui.delegate.screen.ad
{
  public static final String[] c = { "人民币", "美元", "港币" };
  private int A;
  private int B;
  private com.android.dazhihui.a.b.u C = null;
  private DatePickerDialog.OnDateSetListener D = new ag(this);
  private DatePickerDialog.OnDateSetListener E = new ah(this);
  private Calendar F = Calendar.getInstance();
  private LinearLayout d;
  private LinearLayout e;
  private LinearLayout f;
  private LinearLayout g;
  private LinearLayout h;
  private Spinner i;
  private TableLayoutGroup j;
  private TextView k;
  private TextView l;
  private Button m;
  private View n;
  private int o;
  private int p;
  private String[] q;
  private String[] r;
  private int s;
  private int t;
  private int u;
  private String v;
  private int w;
  private int x;
  private int y;
  private String z;
  
  public ad() {}
  
  public ad(int paramInt)
  {
    this.o = paramInt;
  }
  
  private void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    int i1 = this.A;
    int i2 = this.B;
    com.android.dazhihui.ui.delegate.b.h localh = o.g(this.o + "");
    switch (this.o)
    {
    }
    for (;;)
    {
      this.C = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(localh.h()) });
      registRequestListener(this.C);
      a(this.C, paramBoolean);
      return;
      localh.a("1022", this.v).a("1023", this.z).a("1206", i1).a("1277", i2);
    }
  }
  
  private void c()
  {
    this.d = ((LinearLayout)this.n.findViewById(2131558774));
    this.e = ((LinearLayout)this.n.findViewById(2131558775));
    this.f = ((LinearLayout)this.n.findViewById(2131558776));
    this.g = ((LinearLayout)this.n.findViewById(2131558888));
    this.h = ((LinearLayout)this.n.findViewById(2131560928));
    this.i = ((Spinner)this.n.findViewById(2131559748));
    this.j = ((TableLayoutGroup)this.n.findViewById(2131558887));
    this.k = ((TextView)this.n.findViewById(2131558687));
    this.l = ((TextView)this.n.findViewById(2131558688));
    this.m = ((Button)this.n.findViewById(2131558777));
  }
  
  private void d()
  {
    this.A = 0;
    this.B = 20;
    this.j.a();
    this.j.e();
  }
  
  private void e()
  {
    switch (this.o)
    {
    }
    for (;;)
    {
      if ((this.o == 12024) || (this.o == 12522) || (this.o == 11148) || (this.o == 12510))
      {
        this.d.setVisibility(0);
        this.v = o.x();
        this.s = Integer.parseInt(this.v.substring(0, 4));
        this.t = Integer.parseInt(this.v.substring(4, 6));
        this.u = Integer.parseInt(this.v.substring(6, 8));
        this.k.setText(this.s + "-" + this.t + "-" + this.u);
        this.z = o.y();
        this.w = Integer.parseInt(this.z.substring(0, 4));
        this.x = Integer.parseInt(this.z.substring(4, 6));
        this.y = Integer.parseInt(this.z.substring(6, 8));
        this.l.setText(this.w + "-" + this.x + "-" + this.y);
      }
      this.j.setVisibility(0);
      if ((this.q == null) || (this.r == null))
      {
        this.q = new String[] { "" };
        this.r = new String[] { "" };
      }
      this.j.setHeaderColumn(this.q);
      this.j.setPullDownLoading(false);
      this.j.setColumnClickable(null);
      this.j.setContinuousLoading(true);
      this.j.setHeaderBackgroundColor(getResources().getColor(2131493677));
      this.j.setHeaderDivideDrawable(getResources().getDrawable(2130838328));
      this.j.setDrawHeaderSeparateLine(false);
      this.j.setHeaderTextColor(getResources().getColor(2131493099));
      this.j.setHeaderFontSize(getResources().getDimension(2131230899));
      this.j.setHeaderHeight((int)getResources().getDimension(2131230814));
      this.j.setLeftPadding(25);
      this.j.setListDivideDrawable(getResources().getDrawable(2130838328));
      this.j.setRowHighLightBackgroudDrawable(getResources().getDrawable(2130838067));
      this.j.setStockNameColor(getResources().getColor(2131493235));
      this.j.setFirstColumnColorDifferent(true);
      this.j.setOnLoadingListener(new ae(this));
      this.j.setOnTableLayoutClickListener(new af(this));
      return;
      this.q = a.c;
      this.r = a.d;
      continue;
      this.q = a.o;
      this.r = a.p;
      continue;
      this.q = a.a;
      this.r = a.b;
      continue;
      this.q = a.m;
      this.r = a.n;
    }
  }
  
  private void f()
  {
    ai localai = new ai(this);
    this.m.setOnClickListener(localai);
    this.e.setOnClickListener(localai);
    this.f.setOnClickListener(localai);
  }
  
  public void a(mh parammh, int paramInt, String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    String[] arrayOfString = parammh.a;
    StringBuffer localStringBuffer = new StringBuffer();
    paramInt = 0;
    while (paramInt < arrayOfString.length)
    {
      paramArrayOfString2 = arrayOfString[paramInt];
      parammh = paramArrayOfString2;
      if (paramArrayOfString2 == null) {
        parammh = "-";
      }
      localStringBuffer.append("\n").append(paramArrayOfString1[paramInt]).append(": ").append(parammh);
      paramInt += 1;
    }
    parammh = new Bundle();
    parammh.putString("str", localStringBuffer.toString());
    a(TradeText.class, parammh);
  }
  
  public void b()
  {
    this.A = 0;
    this.B = 20;
    this.j.a();
    a(true);
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    if (paramj == null) {}
    int i4;
    do
    {
      do
      {
        do
        {
          return;
        } while (paramh != this.C);
        paramh = ((v)paramj).b();
      } while (!com.android.dazhihui.ui.delegate.b.u.a(paramh, getActivity()));
      paramh = com.android.dazhihui.ui.delegate.b.h.b(paramh.e());
      if (!paramh.b())
      {
        paramh = Toast.makeText(getActivity(), paramh.d(), 0);
        paramh.setGravity(17, 0, 0);
        paramh.show();
        return;
      }
      paramh.g();
      this.p = paramh.b("1289");
      i4 = paramh.g();
      if ((i4 == 0) && (this.j.getDataModel().size() == 0))
      {
        this.j.setBackgroundResource(2130838490);
        return;
      }
      this.j.setBackgroundColor(getResources().getColor(2131493677));
    } while (i4 <= 0);
    paramj = new ArrayList();
    int i2 = 0;
    while (i2 < i4)
    {
      mh localmh = new mh();
      String[] arrayOfString = new String[this.q.length];
      int[] arrayOfInt = new int[this.q.length];
      int i3 = 0;
      for (;;)
      {
        if (i3 >= this.q.length) {
          break label369;
        }
        try
        {
          arrayOfString[i3] = paramh.a(i2, this.r[i3]).trim();
          if (arrayOfString[i3] == null) {
            arrayOfString[i3] = "--";
          }
        }
        catch (Exception localException)
        {
          for (;;)
          {
            String str;
            int i1;
            arrayOfString[i3] = "--";
            continue;
            if ((localException != null) && (localException.equals("1"))) {
              i1 = getResources().getColor(2131492932);
            } else {
              i1 = -16777216;
            }
          }
        }
        str = paramh.a(i2, "1026");
        if ((str == null) || (!str.equals("0"))) {
          break;
        }
        i1 = -65536;
        arrayOfString[i3] = o.c(this.r[i3], arrayOfString[i3]);
        arrayOfInt[i3] = i1;
        i3 += 1;
      }
      label369:
      localmh.a = arrayOfString;
      localmh.b = arrayOfInt;
      paramj.add(localmh);
      i2 += 1;
    }
    this.j.a(paramj, this.A);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.n = paramLayoutInflater.inflate(2130903514, paramViewGroup, false);
    c();
    e();
    f();
    a(true);
    return this.n;
  }
  
  public void show()
  {
    if (this.n != null)
    {
      d();
      a(true);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */