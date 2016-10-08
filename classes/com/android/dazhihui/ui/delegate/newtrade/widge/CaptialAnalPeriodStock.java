package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CaptialAnalPeriodStock
  extends LinearLayout
  implements View.OnClickListener
{
  public static final Comparator<com.android.dazhihui.ui.delegate.newtrade.b.b> a = new a();
  private Button b;
  private Button c;
  private LinearLayout d;
  private LinearLayout e;
  private LinearLayout f;
  private c g;
  private b h;
  private int i = 0;
  private List<com.android.dazhihui.ui.delegate.newtrade.b.b> j;
  private String k = "";
  private String l = "";
  
  public CaptialAnalPeriodStock(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(2130903071, this);
    a();
    b();
  }
  
  private void a()
  {
    this.b = ((Button)findViewById(2131558662));
    this.c = ((Button)findViewById(2131558663));
    this.d = ((LinearLayout)findViewById(2131558664));
    this.e = ((LinearLayout)findViewById(2131558665));
    this.f = ((LinearLayout)findViewById(2131558666));
  }
  
  private void b()
  {
    this.b.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.f.setOnClickListener(this);
  }
  
  private void c()
  {
    if (this.j == null) {
      return;
    }
    this.d.removeAllViews();
    this.e.removeAllViews();
    float f2 = 0.0F;
    float f1 = f2;
    if (this.j != null)
    {
      f1 = f2;
      if (this.j.size() > 0) {
        f1 = Math.max(Math.abs(n.w(((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(0)).c)), Math.abs(n.w(((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(this.j.size() - 1)).c)));
      }
    }
    int n = 0;
    int m = 0;
    LinearLayout.LayoutParams localLayoutParams;
    Object localObject;
    if (n < this.j.size()) {
      if (n.w(((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(n)).c) > 0.0F)
      {
        localLayoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelOffset(2131230830));
        localObject = new k(getContext(), getWidth(), getResources().getDimensionPixelOffset(2131230830), f1, new BigDecimal(((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(n)).c).floatValue(), n + 1, ((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(n)).b, ((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(n)).a);
        ((k)localObject).setPadding(0, 10, 0, 10);
        ((k)localObject).setTag(Integer.valueOf(n));
        ((k)localObject).setOnClickListener(this);
        this.d.addView((View)localObject, localLayoutParams);
        m += 1;
        label303:
        if (m != 3) {}
      }
    }
    for (;;)
    {
      if (m == 0)
      {
        localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
        localObject = new TextView(getContext());
        ((TextView)localObject).setText(this.k);
        ((TextView)localObject).setTextColor(getResources().getColor(2131492965));
        ((TextView)localObject).setGravity(17);
        this.d.addView((View)localObject, localLayoutParams);
      }
      m = 0;
      n = this.j.size() - 1;
      label394:
      if (n >= 0) {
        if (n.w(((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(n)).c) < 0.0F)
        {
          localLayoutParams = new LinearLayout.LayoutParams(-1, getResources().getDimensionPixelOffset(2131230830));
          localObject = new k(getContext(), getWidth(), getResources().getDimensionPixelOffset(2131230830), f1, new BigDecimal(((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(n)).c).floatValue(), this.j.size() - n, ((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(n)).b, ((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(n)).a);
          ((k)localObject).setTag(Integer.valueOf(n));
          ((k)localObject).setOnClickListener(this);
          this.e.addView((View)localObject, localLayoutParams);
          m += 1;
          label574:
          if (m != 3) {}
        }
      }
      for (;;)
      {
        if (m != 0) {
          break label672;
        }
        localLayoutParams = new LinearLayout.LayoutParams(-1, -2);
        localObject = new TextView(getContext());
        ((TextView)localObject).setText(this.l);
        ((TextView)localObject).setTextColor(getResources().getColor(2131492965));
        ((TextView)localObject).setGravity(17);
        this.e.addView((View)localObject, localLayoutParams);
        return;
        n += 1;
        break;
        n -= 1;
        break label394;
        break label574;
      }
      label672:
      break;
      break label303;
    }
  }
  
  private void setType(int paramInt)
  {
    this.i = paramInt;
    if (paramInt == 0)
    {
      this.b.setBackgroundResource(2130837618);
      this.c.setBackgroundResource(2130837617);
    }
    for (;;)
    {
      if (this.g != null) {
        this.g.b(this.i);
      }
      return;
      if (1 == paramInt)
      {
        this.b.setBackgroundResource(2130837615);
        this.c.setBackgroundResource(2130837622);
      }
    }
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    case 2131558664: 
    case 2131558665: 
    default: 
      if ((paramView.getTag() != null) && (this.h != null)) {
        this.h.a((com.android.dazhihui.ui.delegate.newtrade.b.b)this.j.get(((Integer)paramView.getTag()).intValue()), this.i);
      }
      break;
    }
    do
    {
      return;
      setType(0);
      return;
      setType(1);
      return;
    } while (this.h == null);
    this.h.h();
  }
  
  public void setDataType(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.k = "本月无盈利股票";
      this.l = "本月无亏损股票";
      return;
    case 1: 
      this.k = "近两月无盈利股票";
      this.l = "近两月无亏损股票";
      return;
    case 2: 
      this.k = "近三月无盈利股票";
      this.l = "近三月无亏损股票";
      return;
    case 3: 
      this.k = "近半年无盈利股票";
      this.l = "近半年无亏损股票";
      return;
    }
    this.k = "近一年无盈利股票";
    this.l = "近一年无亏损股票";
  }
  
  public void setGotoStockAnalysisFragmentListenr(b paramb)
  {
    this.h = paramb;
  }
  
  public void setStockRank(List<com.android.dazhihui.ui.delegate.newtrade.b.b> paramList)
  {
    if (paramList != null)
    {
      this.j = paramList;
      Collections.sort(this.j, a);
      c();
      return;
    }
    this.d.removeAllViews();
    this.e.removeAllViews();
  }
  
  public void setStockRankingTypeListener(c paramc)
  {
    this.g = paramc;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\CaptialAnalPeriodStock.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */