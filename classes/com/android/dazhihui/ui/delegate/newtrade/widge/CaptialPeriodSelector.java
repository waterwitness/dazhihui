package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.android.dazhihui.f;

public class CaptialPeriodSelector
  extends LinearLayout
  implements View.OnClickListener
{
  private Button a;
  private Button b;
  private Button c;
  private Button d;
  private int e;
  private d f;
  
  public CaptialPeriodSelector(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    LayoutInflater.from(paramContext).inflate(2130903070, this);
    this.e = paramContext.obtainStyledAttributes(paramAttributeSet, f.CaptialPeriodSelector).getInteger(0, 0);
    a();
    b();
    c();
  }
  
  private void setSelected(int paramInt)
  {
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
              if (this.e == 0)
              {
                this.a.setBackgroundResource(2130837618);
                this.b.setBackgroundResource(2130837616);
                this.c.setBackgroundResource(2130837616);
                this.d.setBackgroundResource(2130837617);
                return;
              }
            } while (this.e != 1);
            this.a.setTextColor(getResources().getColor(2131492962));
            this.a.setBackgroundResource(2130837571);
            this.b.setTextColor(getResources().getColor(2131492964));
            this.b.setBackgroundResource(2131492954);
            this.c.setTextColor(getResources().getColor(2131492964));
            this.c.setBackgroundResource(2131492954);
            this.d.setBackgroundResource(2131492954);
            this.d.setTextColor(getResources().getColor(2131492964));
            return;
            if (this.e == 0)
            {
              this.a.setBackgroundResource(2130837615);
              this.b.setBackgroundResource(2130837620);
              this.c.setBackgroundResource(2130837616);
              this.d.setBackgroundResource(2130837617);
              return;
            }
          } while (this.e != 1);
          this.b.setTextColor(getResources().getColor(2131492962));
          this.b.setBackgroundResource(2130837571);
          this.a.setTextColor(getResources().getColor(2131492964));
          this.a.setBackgroundResource(2131492954);
          this.c.setTextColor(getResources().getColor(2131492964));
          this.c.setBackgroundResource(2131492954);
          this.d.setBackgroundResource(2131492954);
          this.d.setTextColor(getResources().getColor(2131492964));
          return;
          if (this.e == 0)
          {
            this.a.setBackgroundResource(2130837615);
            this.b.setBackgroundResource(2130837616);
            this.c.setBackgroundResource(2130837620);
            this.d.setBackgroundResource(2130837617);
            return;
          }
        } while (this.e != 1);
        this.c.setTextColor(getResources().getColor(2131492962));
        this.c.setBackgroundResource(2130837571);
        this.a.setTextColor(getResources().getColor(2131492964));
        this.a.setBackgroundResource(2131492954);
        this.b.setTextColor(getResources().getColor(2131492964));
        this.b.setBackgroundResource(2131492954);
        this.d.setBackgroundResource(2131492954);
        this.d.setTextColor(getResources().getColor(2131492964));
        return;
        if (this.e == 0)
        {
          this.a.setBackgroundResource(2130837615);
          this.b.setBackgroundResource(2130837616);
          this.c.setBackgroundResource(2130837616);
          this.d.setBackgroundResource(2130837622);
          return;
        }
      } while (this.e != 1);
      this.d.setTextColor(getResources().getColor(2131492962));
      this.d.setBackgroundResource(2130837571);
      this.a.setTextColor(getResources().getColor(2131492964));
      this.a.setBackgroundResource(2131492954);
      this.b.setTextColor(getResources().getColor(2131492964));
      this.b.setBackgroundResource(2131492954);
      this.c.setBackgroundResource(2131492954);
      this.c.setTextColor(getResources().getColor(2131492964));
      return;
      if (this.e == 0)
      {
        this.a.setBackgroundResource(2130837615);
        this.b.setBackgroundResource(2130837616);
        this.c.setBackgroundResource(2130837616);
        this.d.setBackgroundResource(2130837616);
        return;
      }
    } while (this.e != 1);
    this.a.setTextColor(getResources().getColor(2131492964));
    this.a.setBackgroundResource(2131492954);
    this.b.setTextColor(getResources().getColor(2131492964));
    this.b.setBackgroundResource(2131492954);
    this.b.setTextColor(getResources().getColor(2131492964));
    this.c.setBackgroundResource(2131492954);
    this.c.setTextColor(getResources().getColor(2131492964));
    this.d.setBackgroundResource(2131492954);
    this.d.setTextColor(getResources().getColor(2131492964));
  }
  
  public void a()
  {
    this.a = ((Button)findViewById(2131558658));
    this.b = ((Button)findViewById(2131558659));
    this.c = ((Button)findViewById(2131558660));
    this.d = ((Button)findViewById(2131558661));
  }
  
  public void b()
  {
    setSelected(0);
  }
  
  public void c()
  {
    this.a.setOnClickListener(this);
    this.b.setOnClickListener(this);
    this.c.setOnClickListener(this);
    this.d.setOnClickListener(this);
  }
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558658: 
      if (this.f != null) {
        this.f.a(0);
      }
      setSelected(0);
      return;
    case 2131558659: 
      if (this.f != null) {
        this.f.a(1);
      }
      setSelected(1);
      return;
    case 2131558660: 
      if (this.f != null) {
        this.f.a(2);
      }
      setSelected(2);
      return;
    }
    if (this.f != null) {
      this.f.a(3);
    }
    setSelected(3);
  }
  
  public void setCaptialPeriodSelectorListener(d paramd)
  {
    this.f = paramd;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\CaptialPeriodSelector.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */