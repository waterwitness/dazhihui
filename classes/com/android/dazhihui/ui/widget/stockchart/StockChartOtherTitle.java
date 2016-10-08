package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;

public class StockChartOtherTitle
  extends RelativeLayout
  implements View.OnClickListener
{
  private LinearLayout a;
  private ImageView b;
  private TextView c;
  private TextView d;
  private TextView e;
  private TextView f;
  private TextView g;
  private TextView h;
  private TextView i;
  private StockChartContainer j;
  private View k;
  private int l = -12961221;
  private int m = -8355712;
  private y n;
  
  public StockChartOtherTitle(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext);
  }
  
  public StockChartOtherTitle(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    a(paramContext);
  }
  
  private void a(Context paramContext)
  {
    Resources localResources = getResources();
    this.a = new LinearLayout(paramContext);
    this.a.setId(2130838091);
    this.a.setOrientation(1);
    this.a.setGravity(17);
    this.a.setOnClickListener(this);
    Object localObject1 = new RelativeLayout.LayoutParams(localResources.getDimensionPixelSize(2131230820), -2);
    ((RelativeLayout.LayoutParams)localObject1).addRule(11);
    ((RelativeLayout.LayoutParams)localObject1).rightMargin = localResources.getDimensionPixelSize(2131230774);
    addView(this.a, (ViewGroup.LayoutParams)localObject1);
    this.b = new ImageView(paramContext);
    this.b.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    this.b.setImageResource(2130838091);
    localObject1 = new LinearLayout.LayoutParams(localResources.getDimensionPixelSize(2131230799), localResources.getDimensionPixelSize(2131230799));
    ((LinearLayout.LayoutParams)localObject1).topMargin = localResources.getDimensionPixelSize(2131230829);
    this.a.addView(this.b, (ViewGroup.LayoutParams)localObject1);
    this.c = new TextView(paramContext);
    this.c.setGravity(17);
    this.c.setTextColor(getResources().getColor(2131493099));
    this.c.setTextSize(10.0F);
    this.c.setText(2131165252);
    localObject1 = new LinearLayout.LayoutParams(-2, -2);
    ((LinearLayout.LayoutParams)localObject1).topMargin = localResources.getDimensionPixelSize(2131230773);
    ((LinearLayout.LayoutParams)localObject1).bottomMargin = localResources.getDimensionPixelSize(2131230829);
    this.a.addView(this.c, (ViewGroup.LayoutParams)localObject1);
    localObject1 = new LinearLayout(paramContext);
    ((LinearLayout)localObject1).setId(2130838093);
    ((LinearLayout)localObject1).setGravity(17);
    ((LinearLayout)localObject1).setOrientation(1);
    Object localObject2 = new RelativeLayout.LayoutParams(-2, -1);
    ((RelativeLayout.LayoutParams)localObject2).rightMargin = localResources.getDimensionPixelSize(2131230799);
    ((RelativeLayout.LayoutParams)localObject2).addRule(0, 2130838091);
    addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    localObject2 = new LinearLayout(paramContext);
    ((LinearLayout)localObject2).setGravity(17);
    ((LinearLayout)localObject2).setOrientation(0);
    ((LinearLayout)localObject1).addView((View)localObject2, new LinearLayout.LayoutParams(-2, -2));
    this.i = new TextView(paramContext);
    this.i.setTextColor(getResources().getColor(2131493099));
    this.i.setGravity(19);
    this.i.setTextSize(14.0F);
    this.i.setText("最高");
    LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(-2, localResources.getDimensionPixelSize(2131230799));
    localLayoutParams.rightMargin = localResources.getDimensionPixelSize(2131230799);
    ((LinearLayout)localObject2).addView(this.i, localLayoutParams);
    this.d = new TextView(paramContext);
    this.d.setTextSize(14.0F);
    this.d.setTextColor(getResources().getColor(2131493099));
    this.d.setGravity(19);
    this.d.setText("--");
    localLayoutParams = new LinearLayout.LayoutParams(localResources.getDimensionPixelSize(2131230834), localResources.getDimensionPixelSize(2131230799));
    ((LinearLayout)localObject2).addView(this.d, localLayoutParams);
    localObject2 = new LinearLayout(paramContext);
    ((LinearLayout)localObject2).setGravity(17);
    ((LinearLayout)localObject2).setOrientation(0);
    ((LinearLayout)localObject1).addView((View)localObject2, new LinearLayout.LayoutParams(-2, -2));
    this.h = new TextView(paramContext);
    this.h.setTextColor(getResources().getColor(2131493099));
    this.h.setGravity(19);
    this.h.setTextSize(14.0F);
    this.h.setText("最低");
    localObject1 = new LinearLayout.LayoutParams(-2, localResources.getDimensionPixelSize(2131230799));
    ((LinearLayout.LayoutParams)localObject1).rightMargin = localResources.getDimensionPixelSize(2131230799);
    ((LinearLayout)localObject2).addView(this.h, (ViewGroup.LayoutParams)localObject1);
    this.e = new TextView(paramContext);
    this.e.setTextSize(14.0F);
    this.e.setTextColor(getResources().getColor(2131493099));
    this.e.setGravity(19);
    this.e.setText("--");
    localObject1 = new LinearLayout.LayoutParams(localResources.getDimensionPixelSize(2131230834), localResources.getDimensionPixelSize(2131230799));
    ((LinearLayout)localObject2).addView(this.e, (ViewGroup.LayoutParams)localObject1);
    localObject1 = new LinearLayout(paramContext);
    ((LinearLayout)localObject1).setOrientation(1);
    ((LinearLayout)localObject1).setGravity(17);
    localObject2 = new RelativeLayout.LayoutParams(-1, -1);
    ((RelativeLayout.LayoutParams)localObject2).rightMargin = localResources.getDimensionPixelSize(2131230799);
    ((RelativeLayout.LayoutParams)localObject2).addRule(0, 2130838093);
    addView((View)localObject1, (ViewGroup.LayoutParams)localObject2);
    this.f = new TextView(paramContext);
    this.f.setTextSize(18.0F);
    this.f.getPaint().setFakeBoldText(true);
    this.f.setTextColor(getResources().getColor(2131493099));
    this.f.setGravity(17);
    this.f.setText("--");
    localObject2 = new LinearLayout.LayoutParams(-2, -2);
    ((LinearLayout)localObject1).addView(this.f, (ViewGroup.LayoutParams)localObject2);
    this.g = new TextView(paramContext);
    this.g.setTextSize(14.0F);
    this.g.setTextColor(this.m);
    this.g.setGravity(17);
    this.g.setText("--    --");
    localObject2 = new LinearLayout.LayoutParams(-2, -2);
    ((LinearLayout)localObject1).addView(this.g, (ViewGroup.LayoutParams)localObject2);
    this.k = new View(paramContext);
    this.k.setBackgroundColor(-12961221);
    paramContext = new RelativeLayout.LayoutParams(-1, localResources.getDimensionPixelSize(2131230859));
    paramContext.addRule(12);
    addView(this.k, paramContext);
    a(g.a().b());
  }
  
  public void a()
  {
    String str2 = "--";
    String str1 = "--";
    StockVo localStockVo = this.j.getDataModel();
    int i2 = getResources().getColor(2131493099);
    int i1 = getResources().getColor(2131493099);
    if (localStockVo != null)
    {
      str2 = az.a(localStockVo.getmUp(), localStockVo.getmDecimalLen());
      i2 = az.e(localStockVo.getmUp(), localStockVo.getCp());
      str1 = az.a(localStockVo.getmDp(), localStockVo.getmDecimalLen());
      i1 = az.e(localStockVo.getmDp(), localStockVo.getCp());
    }
    this.d.setText(str2);
    if (str2.equals("--")) {
      this.d.setTextColor(getResources().getColor(2131493099));
    }
    for (;;)
    {
      this.e.setText(str1);
      if (!str1.equals("--")) {
        break;
      }
      this.e.setTextColor(getResources().getColor(2131493099));
      return;
      this.d.setTextColor(i2);
    }
    this.e.setTextColor(i1);
  }
  
  protected void a(y paramy)
  {
    this.n = paramy;
    if (paramy == y.b)
    {
      this.k.setBackgroundColor(-3618616);
      this.m = -12686651;
      this.g.setTextColor(this.m);
      this.h.setTextColor(-14540254);
      this.i.setTextColor(-14540254);
    }
    for (;;)
    {
      c();
      return;
      this.m = -8355712;
      this.k.setBackgroundColor(-12961221);
      this.g.setTextColor(this.m);
      this.h.setTextColor(-8355712);
      this.i.setTextColor(-8355712);
    }
  }
  
  public void b()
  {
    Object localObject3 = "--";
    Object localObject2 = "--";
    Object localObject1 = "--";
    Object localObject5 = this.j.getDataModel();
    if (localObject5 != null)
    {
      localObject4 = ((StockVo)localObject5).getCurrentValue();
      String str = ((StockVo)localObject5).getZf();
      localObject5 = ((StockVo)localObject5).getZfValue();
      localObject1 = localObject5;
      localObject2 = str;
      localObject3 = localObject4;
      if (localObject5 != null)
      {
        localObject1 = localObject5;
        localObject2 = str;
        localObject3 = localObject4;
        if (((String)localObject5).equals("-"))
        {
          localObject1 = "--";
          localObject3 = localObject4;
          localObject2 = str;
        }
      }
    }
    Object localObject4 = localObject3;
    if (TextUtils.isEmpty((CharSequence)localObject3)) {
      localObject4 = "--";
    }
    localObject3 = localObject1;
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      localObject3 = "--";
    }
    localObject1 = localObject2;
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      localObject1 = "--";
    }
    this.f.setText((CharSequence)localObject4);
    this.g.setText((String)localObject3 + "    " + (String)localObject1);
    if ((((String)localObject3).equals("--")) || (Float.valueOf((String)localObject3).floatValue() == 0.0F))
    {
      this.f.setTextColor(getResources().getColor(2131493099));
      this.g.setTextColor(getResources().getColor(2131493099));
      return;
    }
    if (Float.valueOf((String)localObject3).floatValue() > 0.0F)
    {
      this.f.setTextColor(StockChartHeader.b);
      this.g.setTextColor(StockChartHeader.b);
      return;
    }
    this.f.setTextColor(StockChartHeader.c);
    this.g.setTextColor(StockChartHeader.c);
  }
  
  public void c()
  {
    this.n = g.a().b();
    if (this.j == null) {
      return;
    }
    StockVo localStockVo = this.j.getDataModel();
    if (localStockVo != null)
    {
      if (!m.a().b().exitSelfStock(localStockVo.getCode())) {
        break label104;
      }
      if (this.n != y.a) {
        break label91;
      }
      this.b.setImageResource(2130838093);
    }
    for (;;)
    {
      this.c.setText(2131165409);
      this.c.setTextColor(this.m);
      d();
      return;
      label91:
      this.b.setImageResource(2130838134);
    }
    label104:
    if (this.n == y.a) {
      this.b.setImageResource(2130838091);
    }
    for (;;)
    {
      this.c.setText(2131165252);
      break;
      this.b.setImageResource(2130838133);
    }
  }
  
  public void d()
  {
    a();
    b();
  }
  
  public void onClick(View paramView)
  {
    if (paramView == this.a)
    {
      paramView = this.j.getDataModel();
      if (paramView != null)
      {
        if (!m.a().b().exitSelfStock(paramView.getCode())) {
          break label54;
        }
        m.a().b().removeSelfStock(paramView.getCode());
      }
    }
    for (;;)
    {
      c();
      return;
      label54:
      m.a().b().addSelfStock(paramView.getCode(), paramView.getName());
    }
  }
  
  public void setHolder(StockChartContainer paramStockChartContainer)
  {
    this.j = paramStockChartContainer;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockChartOtherTitle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */