package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.model.stock.market.HHStkVo;

public class HHStkDataView
  extends RelativeLayout
{
  private TextView a;
  private TextView b;
  private TextView c;
  private TextView d;
  private TextView e;
  
  public HHStkDataView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public HHStkDataView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public HHStkDataView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = LayoutInflater.from(paramContext).inflate(2130903158, this);
    this.a = ((TextView)paramContext.findViewById(2131559224));
    this.b = ((TextView)paramContext.findViewById(2131559225));
    this.c = ((TextView)paramContext.findViewById(2131559226));
    this.d = ((TextView)paramContext.findViewById(2131559227));
    this.e = ((TextView)paramContext.findViewById(2131559228));
  }
  
  public void setData(HHStkVo paramHHStkVo)
  {
    this.a.setText(paramHHStkVo.time);
    this.b.setText(paramHHStkVo.buy);
    this.c.setText(paramHHStkVo.sell);
    this.d.setText(paramHHStkVo.initVol);
    this.e.setText(paramHHStkVo.curVol);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\HHStkDataView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */