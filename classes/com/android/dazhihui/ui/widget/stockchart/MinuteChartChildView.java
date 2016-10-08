package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.MinuteTradeCtrl;

public class MinuteChartChildView
  extends LinearLayout
{
  public MinListTabView a;
  public MinuteTradeCtrl b;
  private int c;
  private boolean d = false;
  private Context e;
  private View f;
  private View g;
  private TextView h;
  private TextView i;
  private TextView j;
  private TextView k;
  private MinChartContainer l;
  private TextView m;
  private TextView n;
  private TextView o;
  private TextView p;
  private MinChartListView q;
  private MinDealDetailsView r;
  private int s;
  
  public MinuteChartChildView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinuteChartChildView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinuteChartChildView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.e = paramContext;
    this.s = this.e.getResources().getDimensionPixelOffset(2131230829);
    paramContext = LayoutInflater.from(paramContext).inflate(2130903123, null, false);
    a(paramContext);
    addView(paramContext, new LinearLayout.LayoutParams(-1, -2));
  }
  
  public void a()
  {
    this.r.postInvalidate();
  }
  
  public void a(View paramView)
  {
    this.c = getResources().getDimensionPixelSize(2131230845);
    this.a = ((MinListTabView)paramView.findViewById(2131558976));
    this.b = ((MinuteTradeCtrl)paramView.findViewById(2131558963));
    this.f = paramView.findViewById(2131558971);
    this.g = paramView.findViewById(2131558964);
    this.m = ((TextView)paramView.findViewById(2131558972));
    this.h = ((TextView)paramView.findViewById(2131558973));
    this.n = ((TextView)paramView.findViewById(2131558965));
    this.i = ((TextView)paramView.findViewById(2131558966));
    this.o = ((TextView)paramView.findViewById(2131558967));
    this.j = ((TextView)paramView.findViewById(2131558968));
    this.p = ((TextView)paramView.findViewById(2131558969));
    this.k = ((TextView)paramView.findViewById(2131558970));
    this.b.setOnClickListener(new ao(this));
    this.q = ((MinChartListView)paramView.findViewById(2131558975));
    this.r = ((MinDealDetailsView)paramView.findViewById(2131558974));
    a(g.a().b());
  }
  
  public void a(y paramy)
  {
    if (paramy == y.a)
    {
      this.n.setTextColor(getResources().getColor(2131493099));
      this.o.setTextColor(getResources().getColor(2131493099));
      this.p.setTextColor(getResources().getColor(2131493099));
      this.m.setTextColor(getResources().getColor(2131493099));
      this.a.setBackgroundColor(getResources().getColor(2131493314));
    }
    for (;;)
    {
      this.q.a(paramy);
      this.b.a(paramy);
      this.a.a(paramy);
      this.r.a(paramy);
      return;
      this.n.setTextColor(-14540254);
      this.o.setTextColor(-14540254);
      this.p.setTextColor(-14540254);
      this.m.setTextColor(-14540254);
      this.a.setBackgroundColor(getResources().getColor(2131493677));
    }
  }
  
  public TextView getmDownTv()
  {
    return this.k;
  }
  
  public TextView getmFairTv()
  {
    return this.j;
  }
  
  public TextView getmFlowTv()
  {
    return this.h;
  }
  
  public View getmFlowView()
  {
    return this.f;
  }
  
  public MinListTabView getmListTable()
  {
    return this.a;
  }
  
  public MinChartListView getmMinChartListView()
  {
    return this.q;
  }
  
  public MinDealDetailsView getmMinDealsView()
  {
    return this.r;
  }
  
  public MinuteTradeCtrl getmMintueTradeCtrl()
  {
    return this.b;
  }
  
  public TextView getmUpTv()
  {
    return this.i;
  }
  
  public View getmZdMountView()
  {
    return this.g;
  }
  
  public void setHolder(MinChartContainer paramMinChartContainer)
  {
    this.l = paramMinChartContainer;
  }
  
  public void setmDownTv(TextView paramTextView)
  {
    this.k = paramTextView;
  }
  
  public void setmFairTv(TextView paramTextView)
  {
    this.j = paramTextView;
  }
  
  public void setmFlowTv(TextView paramTextView)
  {
    this.h = paramTextView;
  }
  
  public void setmFlowView(View paramView)
  {
    this.f = paramView;
  }
  
  public void setmMinChartListView(MinChartListView paramMinChartListView)
  {
    this.q = paramMinChartListView;
  }
  
  public void setmMinDealsView(MinDealDetailsView paramMinDealDetailsView)
  {
    this.r = paramMinDealDetailsView;
  }
  
  public void setmMintueTradeCtrl(MinuteTradeCtrl paramMinuteTradeCtrl)
  {
    this.b = paramMinuteTradeCtrl;
  }
  
  public void setmUpTv(TextView paramTextView)
  {
    this.i = paramTextView;
  }
  
  public void setmZdMountView(View paramView)
  {
    this.g = paramView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinuteChartChildView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */