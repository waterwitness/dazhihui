package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.android.dazhihui.d.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.StockVo.Api2206;
import com.android.dazhihui.ui.model.stock.StockVo.Api2994;
import com.android.dazhihui.ui.screen.y;
import java.util.Arrays;

public class StockChartDetaisView
  extends View
{
  public static int a = 0;
  public static int b = 1;
  public static int c = 2;
  private Rect A = new Rect();
  private int B = 0;
  private int C;
  private String[] D = new String[6];
  private int[] E;
  private int F;
  private int G;
  private int H;
  private StockChartContainer d;
  private StockVo e;
  private int f;
  private int g;
  private Paint h = new Paint(1);
  private int i;
  private Bitmap j;
  private Drawable k;
  private int l;
  private Rect m = new Rect();
  private String[] n;
  private int o;
  private String[] p;
  private String[] q;
  private String[] r;
  private String[] s;
  private String[] t;
  private String[] u;
  private String[] v;
  private int w;
  private int x;
  private int y = 0;
  private int z = -7829368;
  
  public StockChartDetaisView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public StockChartDetaisView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public StockChartDetaisView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.getResources();
    this.f = paramContext.getDimensionPixelSize(2131231138);
    this.g = paramContext.getDimensionPixelSize(2131231139);
    this.i = paramContext.getDimensionPixelOffset(2131230844);
    this.H = paramContext.getDimensionPixelOffset(2131230829);
    this.k = getResources().getDrawable(2130838412);
    this.j = Bitmap.createBitmap(BitmapFactory.decodeResource(paramContext, 2130838412));
    this.F = paramContext.getDimensionPixelSize(2131231088);
    this.C = paramContext.getDimensionPixelSize(2131231142);
    this.n = paramContext.getStringArray(2131361876);
    this.o = paramContext.getDimensionPixelSize(2131230773);
    this.p = paramContext.getStringArray(2131361905);
    this.q = paramContext.getStringArray(2131361857);
    this.r = paramContext.getStringArray(2131361855);
    this.s = paramContext.getStringArray(2131361856);
    this.t = paramContext.getStringArray(2131361904);
    this.u = paramContext.getStringArray(2131361906);
    this.v = paramContext.getStringArray(2131361907);
    this.w = paramContext.getDimensionPixelSize(2131230795);
    this.x = paramContext.getDimensionPixelSize(2131230806);
    a(g.a().b());
  }
  
  private String a(String paramString)
  {
    int i1 = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    if (i1 - 4 < 0) {
      return "--";
    }
    localStringBuffer.delete(i1 - 4, i1);
    i1 = localStringBuffer.length();
    localStringBuffer.append(".");
    localStringBuffer.append(paramString.substring(i1, i1 + 2));
    return localStringBuffer.toString();
  }
  
  private String b(String paramString)
  {
    int i1 = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    String str;
    if ((i1 >= 5) && (i1 < 7))
    {
      localStringBuffer.delete(i1 - 4, i1);
      i1 = localStringBuffer.length();
      localStringBuffer.append(".");
      localStringBuffer.append(paramString.substring(i1, i1 + 2));
      str = localStringBuffer.toString() + "万";
    }
    do
    {
      do
      {
        return str;
        if ((i1 >= 7) && (i1 < 8))
        {
          localStringBuffer.delete(i1 - 4, i1);
          i1 = localStringBuffer.length();
          localStringBuffer.append(".");
          localStringBuffer.append(paramString.substring(i1, i1 + 1));
          return localStringBuffer.toString() + "万";
        }
        if ((i1 >= 8) && (i1 < 9))
        {
          localStringBuffer.delete(i1 - 4, i1);
          localStringBuffer.length();
          return localStringBuffer.toString() + "万";
        }
        if ((i1 >= 9) && (i1 < 11))
        {
          localStringBuffer.delete(i1 - 8, i1);
          i1 = localStringBuffer.length();
          localStringBuffer.append(".");
          localStringBuffer.append(paramString.substring(i1, i1 + 2));
          return localStringBuffer.toString() + "亿";
        }
        if ((i1 >= 11) && (i1 < 12))
        {
          localStringBuffer.delete(i1 - 8, i1);
          i1 = localStringBuffer.length();
          localStringBuffer.append(".");
          localStringBuffer.append(paramString.substring(i1, i1 + 1));
          return localStringBuffer.toString() + "亿";
        }
        if ((i1 >= 12) && (i1 < 13))
        {
          localStringBuffer.delete(i1 - 8, i1);
          return localStringBuffer.toString() + "亿";
        }
        str = paramString;
      } while (i1 < 13);
      str = paramString;
    } while (i1 >= 15);
    localStringBuffer.delete(i1 - 12, i1);
    i1 = localStringBuffer.length();
    localStringBuffer.append(".");
    localStringBuffer.append(paramString.substring(i1, i1 + 2));
    return localStringBuffer.toString() + "万亿";
  }
  
  private String c(String paramString)
  {
    int i1 = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    localStringBuffer.delete(i1 - 8, i1);
    i1 = localStringBuffer.length();
    localStringBuffer.append(".");
    localStringBuffer.append(paramString.substring(i1, i1 + 2));
    return localStringBuffer.toString();
  }
  
  public void a()
  {
    this.e = null;
    postInvalidate();
  }
  
  public void a(Canvas paramCanvas)
  {
    paramCanvas.save();
    float f1 = this.h.getStrokeWidth();
    this.h.setColor(-12961221);
    this.h.setStyle(Paint.Style.STROKE);
    this.h.setStrokeWidth(2.0F);
    paramCanvas.drawRect(2.0F, 1.0F, getWidth(), getHeight(), this.h);
    this.h.setStrokeWidth(f1);
    paramCanvas.restore();
  }
  
  public void a(y paramy)
  {
    if (paramy == y.a)
    {
      this.G = -4144960;
      this.z = -8222833;
    }
    for (this.k = getResources().getDrawable(2130838412);; this.k = getResources().getDrawable(2130838413))
    {
      postInvalidate();
      return;
      this.G = -14540254;
      this.z = -10066330;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if (this.d == null) {}
    do
    {
      return;
      this.e = this.d.getDataModel();
    } while (this.e == null);
    int i5 = getWidth();
    int i6 = getHeight();
    int i1 = this.i;
    int i4 = this.w;
    int i2;
    int i3;
    if (this.B == a)
    {
      this.l = this.F;
      i2 = i4;
      i3 = i1;
      if (!n.j(this.e.getCode()))
      {
        i2 = i4;
        i3 = i1;
        if (!this.e.getCode().equals("SZ399006"))
        {
          this.k.setBounds(i5 - this.H - this.k.getMinimumWidth(), (i6 - this.k.getMinimumHeight()) / 2, i5 - this.H, (this.k.getMinimumHeight() + i6) / 2);
          this.k.draw(paramCanvas);
          i3 = i1;
          i2 = i4;
        }
      }
    }
    for (;;)
    {
      this.h.setTextSize(this.l);
      this.h.getTextBounds("最高", 0, "最高".length(), this.A);
      for (i1 = this.A.height(); i6 - i1 * 4 - i3 * 5 / 2 < 0; i1 = this.A.height())
      {
        this.l -= 1;
        this.h.setTextSize(this.l);
        this.h.getTextBounds("最高", 0, "最高".length(), this.A);
      }
      if (this.B == c)
      {
        this.l = this.F;
        i3 = this.i * 3 / 2;
        i2 = this.x;
        a(paramCanvas);
      }
      else
      {
        a(paramCanvas);
        this.t = this.v;
        i3 = this.i * 3 / 2;
        this.l = this.C;
        i2 = this.x;
      }
    }
    this.h.setTextSize(this.l);
    Arrays.fill(this.D, "--");
    i1 = this.e.getApi2206Data().sumValue;
    String str2 = b.j(this.e.getApi2206Data().sumCirculationValue);
    String str3 = b.j(i1);
    Object localObject = this.e.getTotalMarketValue();
    String str1 = this.e.getCirculationValue();
    if (n.k(this.e.getType(), this.e.getMarketType()))
    {
      if (str3 == null)
      {
        localObject = "--";
        label482:
        if (str2 != null) {
          break label1428;
        }
        str1 = "--";
      }
    }
    else
    {
      label490:
      if (!n.j(this.e.getCode())) {
        break label1580;
      }
      this.t = this.q;
      this.D[0] = b.a(this.e.getmOp(), this.e.getmDecimalLen());
      this.D[1] = b.a(this.e.getCp(), this.e.getmDecimalLen());
      this.D[2] = b(b.e(b.b(this.e.getmTotalAmount()) * 10000L));
      this.D[3] = b(b.e(b.b(this.e.getmVol())));
      i1 = 4;
      label610:
      if (this.B != a) {
        break label2449;
      }
    }
    label1428:
    label1580:
    label2449:
    for (i4 = (i5 - this.k.getMinimumWidth() - this.w) / (i1 / 2);; i4 = (i5 - this.x * 2 - this.A.width() * 3 / 2) / 2)
    {
      this.i = i3;
      this.h.setColor(this.z);
      i3 = (int)this.h.getFontMetrics().ascent;
      i5 = this.i / 2 + 0 - i3;
      paramCanvas.drawText(this.t[0], i2, i5, this.h);
      i5 = i5 + this.i / 2 + this.A.height();
      this.h.setColor(this.G);
      paramCanvas.drawText(this.D[0], i2, i5, this.h);
      i5 = i5 + this.i / 2 + this.A.height();
      this.h.setColor(this.z);
      paramCanvas.drawText(this.t[1], i2, i5, this.h);
      i6 = this.i / 2;
      int i7 = this.A.height();
      this.h.setColor(this.G);
      paramCanvas.drawText(this.D[1], i2, i5 + i6 + i7, this.h);
      i2 += i4;
      i5 = this.i / 2 + 0 - i3;
      this.h.setColor(this.z);
      paramCanvas.drawText(this.t[2], i2, i5, this.h);
      i5 = i5 + this.i / 2 + this.A.height();
      this.h.setColor(this.G);
      paramCanvas.drawText(this.D[2], i2, i5, this.h);
      i5 = i5 + this.i / 2 + this.A.height();
      this.h.setColor(this.z);
      paramCanvas.drawText(this.t[3], i2, i5, this.h);
      i6 = this.i / 2;
      i7 = this.A.height();
      this.h.setColor(this.G);
      paramCanvas.drawText(this.D[3], i2, i5 + i6 + i7, this.h);
      if (i1 == 4) {
        break;
      }
      i1 = i2 + i4;
      i2 = this.i / 2 + 0 - i3;
      this.h.setColor(this.z);
      paramCanvas.drawText(this.t[4], i1, i2, this.h);
      i2 = i2 + this.i / 2 + this.A.height();
      this.h.setColor(this.G);
      paramCanvas.drawText(this.D[4], i1, i2, this.h);
      i2 = i2 + this.i / 2 + this.A.height();
      this.h.setColor(this.z);
      paramCanvas.drawText(this.t[5], i1, i2, this.h);
      i3 = this.i / 2;
      i4 = this.A.height();
      this.h.setColor(this.G);
      paramCanvas.drawText(this.D[5], i1, i2 + i3 + i4, this.h);
      return;
      if (str3.length() >= 9)
      {
        localObject = c(str3) + "万亿";
        break label482;
      }
      if (str3.length() >= 5)
      {
        if (this.e.getType() != 0)
        {
          localObject = n.u(str3) + "亿";
          break label482;
        }
        localObject = n.u(str3) + "万亿";
        break label482;
      }
      if (str3.equals("0"))
      {
        localObject = "--";
        break label482;
      }
      localObject = str3 + "万";
      break label482;
      if (str2.length() >= 9)
      {
        str1 = c(str2) + "万亿";
        break label490;
      }
      if (str2.length() >= 5)
      {
        if (this.e.getType() != 0)
        {
          str1 = n.u(str2) + "亿";
          break label490;
        }
        str1 = n.u(str2) + "万亿";
        break label490;
      }
      if (str2.equals("0"))
      {
        str1 = "--";
        break label490;
      }
      str1 = str2 + "万";
      break label490;
      if (n.k(this.e.getType(), this.e.getMarketType()))
      {
        this.t = this.s;
        this.D[0] = b(b.e(b.b(this.e.getmTotalAmount()) * 10000L));
        this.D[1] = b(b.e(b.b(this.e.getmVol())));
        this.D[2] = localObject;
        this.D[3] = str1;
        i1 = 4;
        break label610;
      }
      if (n.g(this.e.getType()))
      {
        this.t = this.r;
        this.D[0] = (b.j(this.e.getmTotalAmount()) + "万");
        this.D[1] = this.e.getApi2994Data().hideProfit;
        this.D[2] = (this.e.getApi2994Data().premiumPrice + "%");
        this.D[3] = this.e.getApi2994Data().priceLeverage;
        i1 = 4;
        break label610;
      }
      long l1;
      if (n.i(this.e.getType(), this.e.getMarketType()))
      {
        this.t = this.p;
        this.D[4] = az.a(this.e.getmUp(), this.e.getmDecimalLen());
        this.D[5] = az.a(this.e.getmDp(), this.e.getmDecimalLen());
        this.D[2] = this.e.getTotalMarketValue();
        this.D[3] = az.a(this.e.getmLb(), 2);
        str1 = b.j(this.e.getmVol());
        localObject = str1;
        if (str1.length() >= 5) {
          localObject = n.u(str1) + "万";
        }
        this.D[0] = localObject;
        this.D[1] = "--";
        if (this.e.getmData2939() != null)
        {
          l1 = az.a(this.e.getmData2939()[6]);
          this.D[1] = az.a(l1 + this.e.getmVol(), az.a(this.e.getmData2939()[6]));
        }
        i1 = 6;
        break label610;
      }
      this.E = this.e.getmData2939();
      if (this.E != null) {
        l1 = this.E[6];
      }
      if (this.B == a)
      {
        this.t = this.u;
        this.D[0] = az.a(this.e.getmUp(), this.e.getmDecimalLen());
        this.D[1] = az.a(this.e.getmDp(), this.e.getmDecimalLen());
        this.D[2] = az.a(this.e.getmOp(), this.e.getmDecimalLen());
        this.D[3] = az.a(this.e.getCp(), this.e.getmDecimalLen());
        this.D[4] = az.a(this.e.getmJj(), this.e.getmDecimalLen());
        this.D[5] = az.f(this.e.getmUp() - this.e.getmDp(), this.e.getCp());
        i1 = 6;
        break label610;
      }
      this.t = this.v;
      this.D[0] = b.j(this.e.getmXsVol());
      str1 = az.c(this.e.getmVol());
      localObject = str1;
      if (str1.length() >= 5) {
        localObject = a(str1) + "万";
      }
      this.D[1] = localObject;
      localObject = az.a(az.a(this.e.getmTotalAmount()));
      if (((String)localObject).length() >= 5) {}
      for (localObject = a((String)localObject) + "亿";; localObject = (String)localObject + "万")
      {
        this.D[2] = localObject;
        this.D[3] = az.a(this.e.getmLb(), 2);
        this.D[4] = az.c(this.e.getmNpVol());
        this.D[5] = az.c(this.e.getmVol() - this.e.getmNpVol());
        i1 = 6;
        break;
      }
    }
  }
  
  public void setDataModel(StockVo paramStockVo)
  {
    this.e = paramStockVo;
    postInvalidate();
  }
  
  public void setHolder(StockChartContainer paramStockChartContainer)
  {
    this.d = paramStockChartContainer;
  }
  
  public void setShowMode(int paramInt)
  {
    this.B = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockChartDetaisView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */