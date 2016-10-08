package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.ui.delegate.c.c;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class CaptialAnalPeriodTrend
  extends LinearLayout
{
  private int a;
  private TextView b;
  private TextView c;
  private LinearLayout d;
  private ImageView e;
  private ImageView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private TextView j;
  private CaptialTrendChart k;
  private TextView l;
  private TextView m;
  private List<com.android.dazhihui.ui.delegate.newtrade.b.a> n = new ArrayList();
  
  public CaptialAnalPeriodTrend(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(2130903072, this);
    a();
    b();
  }
  
  private void a()
  {
    this.d = ((LinearLayout)findViewById(2131558668));
    this.b = ((TextView)findViewById(2131558669));
    this.c = ((TextView)findViewById(2131558670));
    this.e = ((ImageView)findViewById(2131558671));
    this.f = ((ImageView)findViewById(2131558675));
    this.g = ((TextView)findViewById(2131558672));
    this.h = ((TextView)findViewById(2131558673));
    this.i = ((TextView)findViewById(2131558674));
    this.j = ((TextView)findViewById(2131558677));
    this.k = ((CaptialTrendChart)findViewById(2131558678));
    this.l = ((TextView)findViewById(2131558679));
    this.m = ((TextView)findViewById(2131558680));
  }
  
  private void a(int paramInt, String paramString)
  {
    double d1 = n.y(paramString);
    paramString = NumberFormat.getPercentInstance();
    paramString.setMaximumFractionDigits(2);
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return;
              if (d1 == 0.0D)
              {
                this.l.setText("本月与大盘持平");
                this.m.setTextColor(-16777216);
                this.m.setText(paramString.format(d1));
                return;
              }
              if (d1 > 0.0D)
              {
                this.l.setText("本月跑赢大盘");
                this.m.setTextColor(-65536);
                this.m.setText(paramString.format(d1));
                return;
              }
            } while (d1 >= 0.0D);
            this.l.setText("本月跑输大盘");
            this.m.setTextColor(getResources().getColor(2131492932));
            this.m.setText(paramString.format(d1));
            return;
            if (d1 == 0.0D)
            {
              this.l.setText("近两月与大盘持平");
              this.m.setTextColor(-16777216);
              this.m.setText(paramString.format(d1));
              return;
            }
            if (d1 > 0.0D)
            {
              this.l.setText("近两月跑赢大盘");
              this.m.setTextColor(-65536);
              this.m.setText(paramString.format(d1));
              return;
            }
          } while (d1 >= 0.0D);
          this.l.setText("近两月跑输大盘");
          this.m.setTextColor(getResources().getColor(2131492932));
          this.m.setText(paramString.format(d1));
          return;
          if (d1 == 0.0D)
          {
            this.l.setText("近三月与大盘持平");
            this.m.setTextColor(-16777216);
            this.m.setText(paramString.format(d1));
            return;
          }
          if (d1 > 0.0D)
          {
            this.l.setText("近三月跑赢大盘");
            this.m.setTextColor(-65536);
            this.m.setText(paramString.format(d1));
            return;
          }
        } while (d1 >= 0.0D);
        this.l.setText("近三月跑输大盘");
        this.m.setTextColor(getResources().getColor(2131492932));
        this.m.setText(paramString.format(d1));
        return;
        if (d1 == 0.0D)
        {
          this.l.setText("近半年与大盘持平");
          this.m.setTextColor(-16777216);
          this.m.setText(paramString.format(d1));
          return;
        }
        if (d1 > 0.0D)
        {
          this.l.setText("近半年跑赢大盘");
          this.m.setTextColor(-65536);
          this.m.setText(paramString.format(d1));
          return;
        }
      } while (d1 >= 0.0D);
      this.l.setText("近半年跑输大盘");
      this.m.setTextColor(getResources().getColor(2131492932));
      this.m.setText(paramString.format(d1));
      return;
      if (d1 == 0.0D)
      {
        this.l.setText("近一年与大盘持平");
        this.m.setTextColor(-16777216);
        this.m.setText(paramString.format(d1));
        return;
      }
      if (d1 > 0.0D)
      {
        this.l.setText("近一年跑赢大盘");
        this.m.setTextColor(-65536);
        this.m.setText(paramString.format(d1));
        return;
      }
    } while (d1 >= 0.0D);
    this.l.setText("近一年跑输大盘");
    this.m.setTextColor(getResources().getColor(2131492932));
    this.m.setText(paramString.format(d1));
  }
  
  private void a(String paramString1, String paramString2)
  {
    NumberFormat localNumberFormat = NumberFormat.getPercentInstance();
    localNumberFormat.setMaximumFractionDigits(2);
    double d1 = n.y(paramString1);
    if (d1 >= 0.0D)
    {
      this.i.setTextColor(getResources().getColor(2131492970));
      this.i.setText(localNumberFormat.format(d1));
      this.e.setBackgroundResource(2130838548);
    }
    do
    {
      for (;;)
      {
        d1 = n.y(paramString2);
        if (d1 < 0.0D) {
          break;
        }
        this.j.setTextColor(getResources().getColor(2131492970));
        this.j.setText(localNumberFormat.format(d1));
        this.e.setBackgroundResource(2130837572);
        return;
        if (d1 < 0.0D)
        {
          this.i.setTextColor(getResources().getColor(2131492962));
          this.i.setText(localNumberFormat.format(d1));
          this.e.setBackgroundResource(2130838548);
        }
      }
    } while (d1 >= 0.0D);
    this.j.setTextColor(getResources().getColor(2131492962));
    this.j.setText(localNumberFormat.format(d1));
    this.e.setBackgroundResource(2130837572);
  }
  
  private void b()
  {
    this.b.setText("本月盈亏");
    this.c.setText("");
    this.l.setText("本月跟大盘持平");
    this.m.setText("0%");
    c localc = com.android.dazhihui.ui.delegate.a.a().c();
    this.g.setText(localc.c() + "-");
    this.h.setText("*" + localc.d().substring(localc.d().length() - 3) + ":  ");
    this.i.setText("0.00%");
    this.i.setTextColor(-16777216);
    this.j.setText("0.00%");
    this.j.setTextColor(-16777216);
  }
  
  private void setYk(String paramString)
  {
    this.c.setText(paramString);
    if (n.w(paramString) >= 0.0F)
    {
      this.d.setBackgroundResource(2130837625);
      return;
    }
    this.d.setBackgroundResource(2130837614);
  }
  
  public CaptialTrendChart getTrendView()
  {
    return this.k;
  }
  
  public void setDataType(int paramInt)
  {
    this.a = paramInt;
    switch (this.a)
    {
    }
    for (;;)
    {
      this.k.setPeriodDate(this.a);
      return;
      this.b.setText("本月盈亏(元)");
      continue;
      this.b.setText("近两月盈亏(元)");
      continue;
      this.b.setText("近三月盈亏(元)");
      continue;
      this.b.setText("近半年盈亏(元)");
      continue;
      this.b.setText("近一年盈亏(元)");
    }
  }
  
  public void setParentScroll(ScrollView paramScrollView)
  {
    this.k.setParentScroll(paramScrollView);
  }
  
  public void setReturnRate(List<com.android.dazhihui.ui.delegate.newtrade.b.a> paramList)
  {
    this.n = paramList;
    String str3;
    String str2;
    String str1;
    if (this.n.size() == 0)
    {
      str3 = "--";
      str2 = "--";
      str1 = "--";
    }
    for (paramList = "--";; paramList = ((com.android.dazhihui.ui.delegate.newtrade.b.a)this.n.get(this.n.size() - 1)).b)
    {
      setYk(paramList);
      a(str3, str2);
      a(this.a, str1);
      this.k.setReturnRateList(this.n);
      return;
      str3 = ((com.android.dazhihui.ui.delegate.newtrade.b.a)this.n.get(this.n.size() - 1)).c;
      str2 = ((com.android.dazhihui.ui.delegate.newtrade.b.a)this.n.get(this.n.size() - 1)).d;
      str1 = n.i(str3, str2).toString();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\CaptialAnalPeriodTrend.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */