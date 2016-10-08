package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.stock.vr;
import com.android.dazhihui.ui.screen.y;

public class StockChartHeader
  extends FrameLayout
{
  public static int a = -6776680;
  public static int b = -2293760;
  public static int c = -15878144;
  private vr d = vr.b;
  private RelativeLayout e;
  private ImageView f;
  private ImageView g;
  private ImageView h;
  private TextView i;
  private TextView j;
  private RelativeLayout k;
  private RelativeLayout l;
  private LinearLayout m;
  private TextView n;
  private TextView o;
  private StockChartHeaderTitleView p;
  private LinearLayout q;
  private TextView r;
  private TextView s;
  private String t = "--";
  private String u = "--";
  private String v = "--";
  private int w = -2849024;
  private int x = -1;
  private int y = -1;
  private int z = -13750218;
  
  public StockChartHeader(Context paramContext)
  {
    super(paramContext);
    a(paramContext);
  }
  
  public StockChartHeader(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public StockChartHeader(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a()
  {
    if (TextUtils.isEmpty(this.v)) {
      this.v = "--";
    }
    if (TextUtils.isEmpty(this.u)) {
      this.u = "--";
    }
    if (TextUtils.isEmpty(this.t)) {
      this.t = "--";
    }
    this.n.setText(this.v);
    this.o.setText(this.u + "   " + this.t);
    if ((this.u.equals("--")) || (Float.valueOf(this.u).floatValue() == 0.0F))
    {
      this.n.setTextColor(a);
      this.o.setTextColor(a);
    }
    for (;;)
    {
      this.r.setTextColor(this.x);
      this.s.setTextColor(this.y);
      this.p.postInvalidate();
      setBackgroundColor(this.z);
      return;
      if (Float.valueOf(this.u).floatValue() > 0.0F)
      {
        this.n.setTextColor(b);
        this.o.setTextColor(b);
      }
      else
      {
        this.n.setTextColor(c);
        this.o.setTextColor(c);
      }
    }
  }
  
  private void a(Context paramContext)
  {
    a(g.a().b());
    this.e = new RelativeLayout(paramContext);
    Object localObject = new FrameLayout.LayoutParams(-1, -1);
    addView(this.e, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230824), -1);
    ((RelativeLayout.LayoutParams)localObject).addRule(9);
    ((RelativeLayout.LayoutParams)localObject).addRule(15);
    this.f = new ImageView(paramContext);
    this.f.setScaleType(ImageView.ScaleType.CENTER);
    this.f.setPadding(0, getResources().getDimensionPixelSize(2131230823), getResources().getDimensionPixelSize(2131230773), getResources().getDimensionPixelSize(2131230823));
    this.f.setImageResource(2130837540);
    this.f.setId(uv.c);
    this.e.addView(this.f, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(-2, -2);
    this.k = new RelativeLayout(paramContext);
    this.k.setId(uv.b);
    ((RelativeLayout.LayoutParams)localObject).addRule(11);
    ((RelativeLayout.LayoutParams)localObject).addRule(15);
    ((RelativeLayout.LayoutParams)localObject).rightMargin = getResources().getDimensionPixelSize(2131230837);
    this.e.addView(this.k, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230828), -1);
    this.g = new ImageView(paramContext);
    this.g.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    ((RelativeLayout.LayoutParams)localObject).addRule(14);
    ((RelativeLayout.LayoutParams)localObject).height = getResources().getDimensionPixelSize(2131230805);
    ((RelativeLayout.LayoutParams)localObject).width = getResources().getDimensionPixelSize(2131230805);
    this.g.setImageResource(2130838727);
    this.g.setId(this.g.hashCode());
    this.k.addView(this.g, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(-2, -2);
    this.i = new TextView(paramContext);
    this.i.setText(2131166371);
    this.i.setTextSize(2, 11.0F);
    this.i.setTextColor(paramContext.getResources().getColorStateList(2130838718));
    this.i.setGravity(17);
    ((RelativeLayout.LayoutParams)localObject).addRule(14);
    ((RelativeLayout.LayoutParams)localObject).addRule(3, this.g.hashCode());
    this.k.addView(this.i, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(-2, -2);
    this.l = new RelativeLayout(paramContext);
    this.l.setId(uv.a);
    ((RelativeLayout.LayoutParams)localObject).addRule(0, uv.b);
    ((RelativeLayout.LayoutParams)localObject).addRule(15);
    ((RelativeLayout.LayoutParams)localObject).leftMargin = getResources().getDimensionPixelSize(2131230774);
    ((RelativeLayout.LayoutParams)localObject).rightMargin = getResources().getDimensionPixelSize(2131230795);
    this.e.addView(this.l, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230828), -1);
    this.h = new ImageView(paramContext);
    this.h.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    this.h.setId(this.h.hashCode());
    ((RelativeLayout.LayoutParams)localObject).addRule(14);
    ((RelativeLayout.LayoutParams)localObject).height = getResources().getDimensionPixelSize(2131230805);
    ((RelativeLayout.LayoutParams)localObject).width = getResources().getDimensionPixelSize(2131230805);
    this.h.setImageResource(2130838730);
    this.l.addView(this.h, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(-2, -2);
    this.j = new TextView(paramContext);
    this.j.setText(2131166372);
    this.j.setTextSize(2, 11.0F);
    this.j.setTextColor(paramContext.getResources().getColorStateList(2130838718));
    this.j.setGravity(17);
    ((RelativeLayout.LayoutParams)localObject).addRule(14);
    ((RelativeLayout.LayoutParams)localObject).addRule(3, this.h.hashCode());
    this.l.addView(this.j, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230789), -2);
    this.m = new LinearLayout(paramContext);
    this.m.setOrientation(1);
    this.m.setGravity(1);
    getResources().getDimensionPixelSize(2131230829);
    this.m.setPadding(0, 0, 0, 0);
    ((RelativeLayout.LayoutParams)localObject).addRule(13);
    this.e.addView(this.m, (ViewGroup.LayoutParams)localObject);
    localObject = new LinearLayout.LayoutParams(-1, -2);
    this.n = new TextView(paramContext);
    this.n.getPaint().setFakeBoldText(true);
    this.n.setGravity(17);
    this.n.setTextColor(a);
    this.n.setTextSize(20.0F);
    this.n.setText(this.v);
    this.m.addView(this.n, (ViewGroup.LayoutParams)localObject);
    localObject = new LinearLayout.LayoutParams(-1, -2);
    this.o = new TextView(paramContext);
    this.o.setGravity(17);
    this.o.setTextColor(a);
    this.o.setTextSize(14.0F);
    this.o.setText(this.u + "   " + this.t);
    this.m.addView(this.o, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230784), -1);
    this.p = new StockChartHeaderTitleView(paramContext);
    this.p.setHolder(this);
    ((RelativeLayout.LayoutParams)localObject).addRule(15);
    ((RelativeLayout.LayoutParams)localObject).addRule(1, uv.c);
    this.e.addView(this.p, (ViewGroup.LayoutParams)localObject);
    localObject = new RelativeLayout.LayoutParams(getResources().getDimensionPixelSize(2131230789), -1);
    this.q = new LinearLayout(paramContext);
    this.q.setOrientation(1);
    this.q.setGravity(17);
    ((RelativeLayout.LayoutParams)localObject).addRule(13);
    this.e.addView(this.q, (ViewGroup.LayoutParams)localObject);
    localObject = new LinearLayout.LayoutParams(-1, -2);
    this.r = new TextView(paramContext);
    this.r.setGravity(17);
    this.r.setTextColor(this.x);
    this.r.setTextSize(18.0F);
    this.q.addView(this.r, (ViewGroup.LayoutParams)localObject);
    localObject = new LinearLayout.LayoutParams(-1, -2);
    this.s = new TextView(paramContext);
    this.s.setGravity(17);
    this.s.setTextColor(this.y);
    this.s.setTextSize(14.0F);
    this.q.addView(this.s, (ViewGroup.LayoutParams)localObject);
  }
  
  private void a(y paramy)
  {
    if (paramy == y.b)
    {
      a = -6776680;
      b = -52480;
      c = -14828971;
      this.w = 41472;
      this.x = -1;
      this.y = -4342081;
      this.z = -14012877;
      if (this.d != vr.f)
      {
        if ((this.h != null) && (this.j != null) && (getResources().getString(2131166372).equals(this.j.getText()))) {
          this.h.setImageResource(2130838812);
        }
        if (this.g != null) {
          this.g.setImageResource(2130838809);
        }
        if (this.i != null) {
          this.i.setTextColor(getResources().getColorStateList(2130838800));
        }
        if (this.j != null) {
          this.j.setTextColor(getResources().getColorStateList(2130838800));
        }
      }
    }
    do
    {
      do
      {
        return;
        a = -6776680;
        b = -2293760;
        c = -15878144;
        this.w = -2849024;
        this.x = -1;
        this.y = -1;
        this.z = -13750218;
      } while (this.d == vr.f);
      if ((this.h != null) && (this.j != null) && (getResources().getString(2131166372).equals(this.j.getText()))) {
        this.h.setImageResource(2130838730);
      }
      if (this.g != null) {
        this.g.setImageResource(2130838727);
      }
      if (this.i != null) {
        this.i.setTextColor(getResources().getColorStateList(2130838718));
      }
    } while (this.j == null);
    this.j.setTextColor(getResources().getColorStateList(2130838718));
  }
  
  public int getCodeColor()
  {
    return this.y;
  }
  
  public int getNameColor()
  {
    return this.x;
  }
  
  public int getRongRectColor()
  {
    return this.w;
  }
  
  public void setArguments(StockVo paramStockVo)
  {
    if (paramStockVo != null)
    {
      setStockType(az.a(paramStockVo));
      if (this.d != vr.c) {
        break label117;
      }
      this.r.setText(paramStockVo.getName());
      this.s.setText(n.e(paramStockVo.getCode()));
      if ((n.e(paramStockVo.getType(), paramStockVo.getMarketType())) || (n.g(paramStockVo.getType(), paramStockVo.getMarketType())))
      {
        this.h.setImageResource(2130838123);
        this.j.setText(2131166370);
      }
    }
    else
    {
      return;
    }
    this.h.setImageResource(2130838114);
    this.j.setText(2131166369);
    return;
    label117:
    this.p.a(paramStockVo.getName(), paramStockVo.getCode());
    this.p.setHasRong(paramStockVo.getLoanable());
    this.v = paramStockVo.getCurrentValue();
    this.t = paramStockVo.getZf();
    this.u = paramStockVo.getZfValue();
    if (!TextUtils.isEmpty(this.u)) {}
    for (;;)
    {
      try
      {
        if (Double.valueOf(Double.parseDouble(this.u)).doubleValue() > 0.0D) {
          this.u = ("+" + this.u);
        }
        if (this.d != vr.f) {
          break label276;
        }
        this.h.setImageResource(2130838114);
        this.j.setText(2131166369);
        a();
        return;
      }
      catch (Exception paramStockVo)
      {
        this.u = "--";
        continue;
      }
      this.u = "--";
      continue;
      label276:
      if (g.a().b() == y.b)
      {
        this.h.setImageResource(2130838812);
        this.j.setText(2131166372);
      }
      else
      {
        this.h.setImageResource(2130838730);
        this.j.setText(2131166372);
      }
    }
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    this.f.setOnClickListener(paramOnClickListener);
    this.k.setOnClickListener(paramOnClickListener);
    this.l.setOnClickListener(paramOnClickListener);
    this.p.setOnClickListener(paramOnClickListener);
  }
  
  public void setStockType(vr paramvr)
  {
    if (this.d != paramvr)
    {
      this.d = paramvr;
      if (paramvr == vr.c)
      {
        this.p.setVisibility(8);
        this.q.setVisibility(0);
        this.m.setVisibility(8);
        this.h.setImageResource(2130838114);
        this.j.setText(2131166369);
      }
    }
    else
    {
      return;
    }
    this.p.setVisibility(0);
    this.q.setVisibility(8);
    this.m.setVisibility(0);
    if (paramvr == vr.f)
    {
      this.h.setImageResource(2130838114);
      this.j.setText(2131166369);
      return;
    }
    if (g.a().b() == y.b)
    {
      this.h.setImageResource(2130838812);
      this.j.setText(2131166372);
      return;
    }
    this.h.setImageResource(2130838730);
    this.j.setText(2131166372);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockChartHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */