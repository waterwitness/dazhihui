package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.android.dazhihui.ui.screen.y;

public class MarketIndexView
  extends LinearLayout
{
  private View a;
  private ImageView b;
  private TextView c;
  private View d;
  private CustomGridView e;
  private int f;
  
  public MarketIndexView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MarketIndexView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MarketIndexView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a();
  }
  
  public void a()
  {
    setOrientation(1);
    this.a = this;
    LayoutInflater.from(getContext()).inflate(2130903269, this);
    this.e = ((CustomGridView)this.a.findViewById(2131559816));
    this.c = ((TextView)this.a.findViewById(2131559814));
    this.d = this.a.findViewById(2131559812);
    this.b = ((ImageView)this.a.findViewById(2131559813));
    setBackgroundColor(getResources().getColor(2131493540));
  }
  
  public void a(y paramy)
  {
    switch (hb.a[paramy.ordinal()])
    {
    }
    do
    {
      do
      {
        return;
        this.a.setBackgroundColor(getResources().getColor(2131493540));
        this.d.setBackgroundResource(2130838731);
        this.c.setTextColor(getResources().getColor(2131493549));
        this.b.setImageResource(2130838713);
      } while (this.e == null);
      this.e.a(paramy);
      return;
      this.a.setBackgroundColor(getContext().getResources().getColor(2131493603));
      this.d.setBackgroundResource(2130838813);
      this.c.setTextColor(getResources().getColor(2131493612));
      this.b.setImageResource(2130838796);
    } while (this.e == null);
    this.e.a(paramy);
  }
  
  public int getType()
  {
    return this.f;
  }
  
  public void setAdapter(ListAdapter paramListAdapter)
  {
    this.e.setAdapter(paramListAdapter);
  }
  
  public void setChangeMoreListener(View.OnClickListener paramOnClickListener)
  {
    this.b.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnChildListener(hc paramhc) {}
  
  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.e.setOnItemClickListener(paramOnItemClickListener);
  }
  
  public void setTitleText(String paramString)
  {
    this.c.setText(paramString);
  }
  
  public void setType(int paramInt)
  {
    this.f = paramInt;
    this.e.setTag(Integer.valueOf(paramInt));
    if (paramInt == 1) {
      this.b.setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\MarketIndexView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */