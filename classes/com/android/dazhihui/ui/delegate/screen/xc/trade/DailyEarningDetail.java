package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.a;
import com.android.dazhihui.ui.delegate.screen.DelegateBaseActivity;
import com.android.dazhihui.ui.widget.DzhHeader;
import com.android.dazhihui.ui.widget.NoScrollListView;
import com.android.dazhihui.ui.widget.cp;
import com.android.dazhihui.ui.widget.cs;
import com.android.dazhihui.ui.widget.ct;
import com.android.dazhihui.ui.widget.dzhrefresh.LoadAndRefreshView;
import java.util.ArrayList;

public class DailyEarningDetail
  extends DelegateBaseActivity
  implements View.OnClickListener, cp, cs
{
  private ArrayList<v> A;
  private LoadAndRefreshView B;
  private com.android.dazhihui.a.b.u C;
  private DatePickerDialog.OnDateSetListener D = new t(this);
  private DatePickerDialog.OnDateSetListener E = new u(this);
  protected int a = 0;
  protected int b = 0;
  private int c = m.a().H();
  private int d = 0;
  private boolean e = false;
  private String[] f = a.w;
  private String[] g = a.x;
  private DzhHeader h;
  private TextView i;
  private TextView j;
  private LinearLayout m;
  private LinearLayout n;
  private int o;
  private int p;
  private int q;
  private String r;
  private int s;
  private int t;
  private int u;
  private String v;
  private Button w;
  private ImageView x;
  private NoScrollListView y;
  private BaseAdapter z;
  
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
  
  public void a(boolean paramBoolean)
  {
    if (!o.r()) {
      return;
    }
    this.C = new com.android.dazhihui.a.b.u(new com.android.dazhihui.ui.delegate.b.u[] { new com.android.dazhihui.ui.delegate.b.u(o.g("11908").a("1022", this.r).a("1023", this.v).a("1214", "1").a("1206", this.d).a("1277", this.c).a("1090", "DA0002").h()) });
    registRequestListener(this.C);
    a(this.C, paramBoolean);
  }
  
  public void createTitleObj(Context paramContext, ct paramct)
  {
    paramct.a = 40;
    paramct.p = this;
    paramct.d = "交易明细";
  }
  
  public void getTitle(DzhHeader paramDzhHeader)
  {
    this.h = paramDzhHeader;
  }
  
  public void handleResponse(com.android.dazhihui.a.b.h paramh, j paramj)
  {
    super.handleResponse(paramh, paramj);
    paramj = ((com.android.dazhihui.a.b.v)paramj).b();
    if (paramj == null)
    {
      paramh = Toast.makeText(this, "　　连接失败，请重试!", 0);
      paramh.setGravity(17, 0, 0);
      paramh.show();
    }
    com.android.dazhihui.ui.delegate.b.h localh;
    do
    {
      do
      {
        return;
      } while (paramh != this.C);
      localh = com.android.dazhihui.ui.delegate.b.h.b(paramj.e());
      if (!localh.b())
      {
        c(localh.d());
        return;
      }
      this.a = localh.g();
      if (this.a > 0) {
        break;
      }
    } while (this.e);
    this.x.setVisibility(0);
    return;
    this.x.setVisibility(8);
    if (this.a > 0)
    {
      this.b = localh.b("1289");
      if (!this.e) {
        this.A.clear();
      }
      int k = 0;
      if (k < this.a)
      {
        label180:
        label200:
        String str1;
        if (localh.a(k, "1038").trim() == null)
        {
          paramh = "";
          if (localh.a(k, "1039").trim() != null) {
            break label301;
          }
          paramj = "";
          if (localh.a(k, "1027").trim() != null) {
            break label318;
          }
          str1 = "";
          label220:
          if (localh.a(k, "1093").trim() != null) {
            break label335;
          }
        }
        label301:
        label318:
        label335:
        for (String str2 = "";; str2 = localh.a(k, "1093").trim())
        {
          paramh = new v(this, str1, paramh, paramj, str2);
          this.A.add(paramh);
          this.y.setAdapter(this.z);
          k += 1;
          break;
          paramh = localh.a(k, "1038").trim();
          break label180;
          paramj = localh.a(k, "1039").trim();
          break label200;
          str1 = localh.a(k, "1027").trim();
          break label220;
        }
      }
      a(localh, this.d);
    }
    this.z.notifyDataSetChanged();
  }
  
  protected void init(Bundle paramBundle)
  {
    super.init(paramBundle);
    setContentView(2130903087);
    this.h = ((DzhHeader)findViewById(2131558643));
    this.h.a(this, this);
    this.m = ((LinearLayout)findViewById(2131558775));
    this.n = ((LinearLayout)findViewById(2131558776));
    this.i = ((TextView)findViewById(2131558687));
    this.j = ((TextView)findViewById(2131558688));
    this.w = ((Button)findViewById(2131558777));
    this.x = ((ImageView)findViewById(2131558778));
    this.B = ((LoadAndRefreshView)findViewById(2131558779));
    this.B.a(true, true);
    this.B.setOnHeaderRefreshListener(new r(this));
    this.B.setOnFooterLoadListener(new s(this));
    this.y = ((NoScrollListView)findViewById(2131558780));
    this.r = o.x();
    this.v = o.y();
    this.i.setText(this.r);
    this.j.setText(this.v);
    this.m.setOnClickListener(this);
    this.n.setOnClickListener(this);
    this.w.setOnClickListener(this);
    this.A = new ArrayList();
    this.z = new w(this, this);
    a(true);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558775: 
      new DatePickerDialog(this, this.D, 2014, this.p, this.q).show();
      return;
    case 2131558776: 
      new DatePickerDialog(this, this.E, 2016, this.t, this.u).show();
      return;
    }
    this.e = false;
    this.d = 0;
    a(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\DailyEarningDetail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */