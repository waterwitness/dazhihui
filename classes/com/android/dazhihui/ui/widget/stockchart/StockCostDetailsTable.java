package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.StockVo.Api3010_Table;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.y;
import java.util.ArrayList;

public class StockCostDetailsTable
  extends LinearLayout
{
  private uv a;
  private StockVo b;
  private Context c;
  private StockChartContainer d;
  private av e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private CustomProgressBar k;
  private View[] l = new View[13];
  private TextView[] m = new TextView[6];
  private int n;
  private int o;
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private View u;
  private y v;
  private View w;
  
  public StockCostDetailsTable(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public StockCostDetailsTable(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public StockCostDetailsTable(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  public void a()
  {
    if ((this.d == null) || (this.d.getHolder() == null)) {}
    do
    {
      return;
      this.b = this.d.getHolder().u();
    } while (this.b == null);
    ArrayList localArrayList;
    if (this.e == av.a) {
      localArrayList = this.b.getApi3010_Table_MinChart();
    }
    for (;;)
    {
      if ((localArrayList == null) || (localArrayList.size() == 0))
      {
        this.f.setText("--");
        this.k.setProgress(0);
        this.g.setText("--");
        this.h.setText("--");
        this.i.setText("--");
        this.j.setText("--");
        return;
        if (this.e == av.b) {
          localArrayList = this.b.getApi3010_Table_KChart();
        }
      }
      else
      {
        String str = String.valueOf(((StockVo.Api3010_Table)localArrayList.get(0)).time);
        if (str.length() >= 3) {
          this.f.setText(str.substring(0, str.length() - 2) + ":" + str.substring(str.length() - 2));
        }
        this.k.setProgress(((StockVo.Api3010_Table)localArrayList.get(0)).profit_rate);
        this.g.setText(((StockVo.Api3010_Table)localArrayList.get(0)).averageCost + "元");
        this.h.setText(((StockVo.Api3010_Table)localArrayList.get(0)).bigAverageCost + "元");
        this.i.setText(((StockVo.Api3010_Table)localArrayList.get(0)).nineLowLimite + "元" + "  -  " + ((StockVo.Api3010_Table)localArrayList.get(0)).nineUpLimite + "元");
        this.j.setText(((StockVo.Api3010_Table)localArrayList.get(0)).senvenLowLimite + "元" + "  -  " + ((StockVo.Api3010_Table)localArrayList.get(0)).senvenUpLimite + "元");
        return;
      }
      localArrayList = null;
    }
  }
  
  public void a(Context paramContext)
  {
    this.c = paramContext;
    this.w = LayoutInflater.from(paramContext).inflate(2130903437, null);
    paramContext = new LinearLayout.LayoutParams(-1, -1);
    addView(this.w, paramContext);
    this.f = ((TextView)this.w.findViewById(2131560506));
    this.k = ((CustomProgressBar)this.w.findViewById(2131560511));
    this.g = ((TextView)this.w.findViewById(2131560515));
    this.h = ((TextView)this.w.findViewById(2131560519));
    this.i = ((TextView)this.w.findViewById(2131560523));
    this.j = ((TextView)this.w.findViewById(2131560527));
    this.u = this.w.findViewById(2131560510);
    this.l[0] = this.w.findViewById(2131560503);
    this.l[1] = this.w.findViewById(2131560505);
    this.l[2] = this.w.findViewById(2131560507);
    this.l[3] = this.w.findViewById(2131560509);
    this.l[4] = this.w.findViewById(2131560512);
    this.l[5] = this.w.findViewById(2131560514);
    this.l[6] = this.w.findViewById(2131560516);
    this.l[7] = this.w.findViewById(2131560518);
    this.l[8] = this.w.findViewById(2131560520);
    this.l[9] = this.w.findViewById(2131560522);
    this.l[10] = this.w.findViewById(2131560524);
    this.l[11] = this.w.findViewById(2131560526);
    this.l[12] = this.w.findViewById(2131560528);
    this.m[0] = ((TextView)this.w.findViewById(2131560504));
    this.m[1] = ((TextView)this.w.findViewById(2131560508));
    this.m[2] = ((TextView)this.w.findViewById(2131560513));
    this.m[3] = ((TextView)this.w.findViewById(2131560517));
    this.m[4] = ((TextView)this.w.findViewById(2131560521));
    this.m[5] = ((TextView)this.w.findViewById(2131560525));
    a(g.a().b());
  }
  
  public void a(y paramy)
  {
    int i3 = 0;
    this.v = paramy;
    this.k.a(paramy);
    if (paramy == y.a)
    {
      this.n = -14143937;
      this.o = -14276556;
      this.p = -15064529;
      this.q = -409087;
      this.t = -1182986;
      this.r = -16732935;
    }
    int i2;
    for (this.s = -64512;; this.s = -64512)
    {
      int i1 = 0;
      for (;;)
      {
        i2 = i3;
        if (i1 >= this.l.length) {
          break;
        }
        this.l[i1].setBackgroundColor(this.p);
        i1 += 1;
      }
      this.n = -592138;
      this.o = -1;
      this.p = -1710619;
      this.q = -608000;
      this.t = -13027015;
      this.r = -16732992;
    }
    while (i2 < this.m.length)
    {
      this.m[i2].setBackgroundColor(this.n);
      this.m[i2].setTextColor(this.t);
      i2 += 1;
    }
    this.w.setBackgroundColor(this.n);
    this.g.setBackgroundColor(this.o);
    this.h.setBackgroundColor(this.o);
    this.i.setBackgroundColor(this.o);
    this.j.setBackgroundColor(this.o);
    this.f.setBackgroundColor(this.o);
    this.u.setBackgroundColor(this.o);
    this.g.setTextColor(this.r);
    this.h.setTextColor(this.s);
    this.f.setTextColor(this.t);
    this.j.setTextColor(this.t);
    this.i.setTextColor(this.t);
  }
  
  public void a(StockChartContainer paramStockChartContainer, av paramav)
  {
    this.d = paramStockChartContainer;
    this.e = paramav;
  }
  
  public void setmParentFragment(uv paramuv)
  {
    this.a = paramuv;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockCostDetailsTable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */