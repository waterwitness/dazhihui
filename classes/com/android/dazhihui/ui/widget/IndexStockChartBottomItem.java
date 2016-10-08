package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class IndexStockChartBottomItem
  extends RelativeLayout
{
  private TextView a;
  private ImageView b;
  
  public IndexStockChartBottomItem(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public IndexStockChartBottomItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public IndexStockChartBottomItem(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    LayoutInflater.from(paramContext).inflate(2130903450, this);
    this.a = ((TextView)findViewById(2131560576));
    this.b = ((ImageView)findViewById(2131560577));
  }
  
  public void setImage(int paramInt)
  {
    this.b.setImageResource(paramInt);
  }
  
  public void setText(int paramInt)
  {
    this.a.setText(getResources().getText(paramInt));
  }
  
  public void setText(String paramString)
  {
    this.a.setText(paramString);
  }
  
  public void setTextColor(int paramInt)
  {
    this.a.setTextColor(paramInt);
  }
  
  public void setTextColor(ColorStateList paramColorStateList)
  {
    this.a.setTextColor(paramColorStateList);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\IndexStockChartBottomItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */