package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.stock.uv;

public class FastDealMenu
  extends LinearLayout
  implements View.OnClickListener
{
  private View a;
  private TextView b;
  private TextView c;
  private View d;
  private View e;
  private View f;
  private uv g;
  
  public FastDealMenu(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public FastDealMenu(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = LayoutInflater.from(paramContext).inflate(2130903114, null);
    paramContext = new LinearLayout.LayoutParams(-1, -2);
    addView(this.a, paramContext);
    a(this.a);
  }
  
  public FastDealMenu(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public void a(View paramView)
  {
    this.b = ((TextView)paramView.findViewById(2131558919));
    this.c = ((TextView)paramView.findViewById(2131558920));
    this.d = paramView.findViewById(2131558910);
    this.e = paramView.findViewById(2131558913);
    this.f = paramView.findViewById(2131558916);
    this.b.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
    this.e.setOnClickListener(this);
    this.f.setOnClickListener(this);
    setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    this.g.a(paramView);
  }
  
  public void setHolder(uv paramuv)
  {
    this.g = paramuv;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\FastDealMenu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */