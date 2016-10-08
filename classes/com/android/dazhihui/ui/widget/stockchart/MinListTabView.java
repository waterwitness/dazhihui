package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.android.dazhihui.ui.model.stock.LargeTradeInfo;
import com.android.dazhihui.ui.screen.y;

public class MinListTabView
  extends LinearLayout
{
  public MinBigTradeView a;
  public MinOrganizationTradeView b;
  public GraphicView c;
  public boolean d = false;
  private LargeTradeInfo e = null;
  private int[] f;
  
  public MinListTabView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinListTabView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public MinListTabView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    LayoutInflater.from(paramContext).inflate(2130903312, this);
    this.a = ((MinBigTradeView)findViewById(2131560013));
    this.a.setHolder(this);
    this.b = ((MinOrganizationTradeView)findViewById(2131560015));
    this.b.setHolder(this);
    this.c = ((GraphicView)findViewById(2131560014));
    this.c.setHolder(this);
    setOrientation(1);
  }
  
  private void b()
  {
    if (this.a != null) {
      this.a.postInvalidate();
    }
    if (this.c != null) {
      this.c.postInvalidate();
    }
    if (this.b != null) {
      this.b.requestLayout();
    }
  }
  
  public void a()
  {
    if (this.a != null) {
      this.a.a();
    }
    this.e = null;
    this.d = false;
    this.f = null;
    b();
  }
  
  public void a(LargeTradeInfo paramLargeTradeInfo, boolean paramBoolean)
  {
    this.e = paramLargeTradeInfo;
    b();
  }
  
  public void a(y paramy)
  {
    this.a.a(paramy);
    this.c.a(paramy);
    this.b.a(paramy);
  }
  
  public int[] getBigTradeData()
  {
    return this.f;
  }
  
  public LargeTradeInfo getTradeInfo()
  {
    return this.e;
  }
  
  public void setBigTradeData(int[] paramArrayOfInt)
  {
    this.f = paramArrayOfInt;
    if (this.a != null) {
      this.a.postInvalidate();
    }
  }
  
  public void setOnMoreClickListener(al paramal)
  {
    this.b.setOnMoreClickListener(paramal);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinListTabView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */