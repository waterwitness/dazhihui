package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
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

public class MinChartContainerTop
  extends View
{
  private MinChartContainer a;
  private StockVo b;
  private int c;
  private int d;
  private Paint e = new Paint(1);
  private int f;
  private Bitmap g;
  private Drawable h;
  private int i;
  private Rect j = new Rect();
  private String[] k;
  private int l;
  private String[] m;
  private String[] n;
  private String[] o;
  private String[] p;
  private int q;
  private int r = 0;
  private int s;
  private int t;
  private int u;
  
  public MinChartContainerTop(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public MinChartContainerTop(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public MinChartContainerTop(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.getResources();
    this.c = paramContext.getDimensionPixelSize(2131231138);
    this.d = paramContext.getDimensionPixelSize(2131231139);
    this.f = paramContext.getDimensionPixelOffset(2131230844);
    this.h = getResources().getDrawable(2130838412);
    this.g = Bitmap.createBitmap(BitmapFactory.decodeResource(paramContext, 2130838412));
    this.i = paramContext.getDimensionPixelSize(2131231088);
    this.k = paramContext.getStringArray(2131361876);
    this.l = paramContext.getDimensionPixelSize(2131230773);
    this.m = paramContext.getStringArray(2131361858);
    this.n = paramContext.getStringArray(2131361857);
    this.o = paramContext.getStringArray(2131361855);
    this.p = paramContext.getStringArray(2131361856);
    this.q = paramContext.getDimensionPixelSize(2131230795);
    a(g.a().b());
  }
  
  private String a(String paramString)
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
  
  private String b(String paramString)
  {
    int i1 = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer(paramString);
    localStringBuffer.delete(i1 - 8, i1);
    i1 = localStringBuffer.length();
    localStringBuffer.append(".");
    localStringBuffer.append(paramString.substring(i1, i1 + 2));
    return localStringBuffer.toString();
  }
  
  public void a(y paramy)
  {
    if (paramy == y.a)
    {
      this.g = Bitmap.createBitmap(BitmapFactory.decodeResource(getResources(), 2130838412));
      this.s = getResources().getColor(2131493313);
      this.t = getResources().getColor(2131493311);
      this.u = getResources().getColor(2131493312);
      this.h = getResources().getDrawable(2130838412);
    }
    for (;;)
    {
      postInvalidate();
      return;
      this.h = getResources().getDrawable(2130838413);
      this.g = Bitmap.createBitmap(BitmapFactory.decodeResource(getResources(), 2130838413));
      this.s = getResources().getColor(2131493342);
      this.t = getResources().getColor(2131493340);
      this.u = getResources().getColor(2131493341);
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    this.b = this.a.getDataModel();
    if (this.b == null) {}
    int i3;
    int i2;
    int i1;
    int i5;
    int i6;
    label181:
    label233:
    int i7;
    int i8;
    label379:
    label394:
    do
    {
      do
      {
        do
        {
          return;
          i3 = getWidth();
          i2 = getHeight();
          i1 = 2;
          if (this.b != null) {
            i1 = this.b.getmDecimalLen();
          }
          localObject1 = this.a.getDisplayModel();
          if (localObject1 != ae.b) {
            break;
          }
        } while (this.a.getScreenIndex() < 0);
        localObject2 = this.a.getTreadPriceView().a(this.a.getScreenIndex());
      } while (localObject2 == null);
      i5 = (i3 - this.l * 2) / (localObject2.length / 2 + 1);
      i1 = this.l;
      i4 = (i2 - this.i * 2) / 3;
      this.e.setTextSize(this.i);
      this.e.setTextAlign(Paint.Align.LEFT);
      i6 = (int)this.e.getFontMetrics().ascent;
      i1 = 0;
      i2 = i4;
      if (i1 < localObject2.length)
      {
        if (i1 < localObject2.length / 2 + 1) {
          break label379;
        }
        i2 = this.l;
        i3 = (i1 - (localObject2.length / 2 + 1)) * i5 + i2;
        i2 = i4 * 2 + this.i;
        this.e.setColor(this.s);
        localObject1 = "";
        if (i1 != 0) {
          break label394;
        }
        localObject1 = az.d(localObject2[0][0]);
      }
      for (;;)
      {
        paramCanvas.drawText(this.k[i1], i3, i2 - i6, this.e);
        this.e.getTextBounds(this.k[i1], 0, this.k[i1].length(), this.j);
        i7 = this.j.width();
        i8 = this.l;
        this.e.setColor(localObject2[i1][1]);
        paramCanvas.drawText((String)localObject1, i3 + (i7 + i8 * 10), i2 - i6, this.e);
        i1 += 1;
        break label181;
        break;
        i3 = this.l + i1 * i5;
        break label233;
        if (i1 == 1) {
          localObject1 = az.a(localObject2[1][0], this.b.getmDecimalLen());
        } else if (i1 == 2) {
          localObject1 = az.a(localObject2[2][0], this.b.getCp());
        } else if (i1 == 3) {
          localObject1 = az.a(localObject2[3][0], this.b.getmDecimalLen());
        } else if (i1 == 4) {
          localObject1 = String.valueOf(localObject2[4][0]);
        }
      }
    } while (localObject1 != ae.a);
    String[] arrayOfString = new String[4];
    Arrays.fill(arrayOfString, "--");
    Object localObject2 = this.b.getTotalMarketValue();
    String str2 = this.b.getCirculationValue();
    int i4 = this.b.getApi2206Data().sumValue;
    String str1 = b.j(this.b.getApi2206Data().sumCirculationValue);
    Object localObject1 = b.j(i4);
    if (n.k(this.b.getType(), this.b.getMarketType()))
    {
      localObject3 = this.p;
      if (localObject1 == null)
      {
        localObject1 = "--";
        if (str1 != null) {
          break label1490;
        }
        localObject2 = "--";
        label603:
        if (!n.j(this.b.getCode())) {
          break label1643;
        }
        localObject2 = this.n;
        arrayOfString[0] = b.a(this.b.getmOp(), this.b.getmDecimalLen());
        arrayOfString[1] = b.a(this.b.getCp(), i1);
        arrayOfString[2] = a(b.e(b.b(this.b.getmTotalAmount()) * 10000L));
        arrayOfString[3] = a(b.e(b.b(this.b.getmVol())));
        i1 = 0;
      }
    }
    int i10;
    int i9;
    for (;;)
    {
      localObject3 = localObject1;
      if (localObject1 == null) {
        localObject3 = "--";
      }
      i4 = (i2 - this.g.getHeight()) / 2;
      i7 = i3 - this.f / 2 - this.q;
      if ((!n.j(this.b.getCode())) && (!"SZ399006".equals(this.b.getCode())))
      {
        this.h.setBounds(i7, (i2 - this.q) / 2, this.q + i7, (i2 - this.q) / 2 + this.q);
        this.h.draw(paramCanvas);
      }
      i10 = i7 / 2;
      i8 = (i2 - this.d * 2) / 3;
      this.e.setAlpha(100);
      this.e.setStyle(Paint.Style.FILL);
      this.e.setColor(this.s);
      this.e.setTextSize(this.d - 3);
      this.e.getTextBounds(localObject2[0], 0, localObject2[0].length(), this.j);
      i2 = this.j.width();
      this.e.getTextBounds(arrayOfString[0], 0, arrayOfString[0].length(), this.j);
      i4 = this.j.width();
      this.e.getTextBounds(arrayOfString[1], 0, arrayOfString[1].length(), this.j);
      i3 = this.j.width();
      this.e.getTextBounds(localObject2[2], 0, "总手:".length(), this.j);
      int i11 = this.j.width();
      this.e.getTextBounds(arrayOfString[2], 0, arrayOfString[2].length(), this.j);
      i6 = this.j.width();
      this.e.getTextBounds(arrayOfString[3], 0, arrayOfString[3].length(), this.j);
      i5 = this.j.width();
      this.e.setTextSize(this.d - 3);
      int i12 = this.f;
      i9 = i7 / 2;
      this.e.setTextAlign(Paint.Align.LEFT);
      this.e.setColor(this.s);
      i9 = (int)this.e.getFontMetrics().ascent;
      paramCanvas.drawText(localObject2[0], i12, i8 - i9, this.e);
      paramCanvas.drawText(localObject2[1], i12, this.d + i8 - 2 + i8 - i9, this.e);
      i12 = this.f / 2;
      this.e.setColor(this.t);
      this.e.setTextAlign(Paint.Align.RIGHT);
      i11 = i10 - this.f * 2 - Math.max(i2, i11);
      i2 = (int)this.e.getTextSize();
      while ((i11 > 0) && (i11 < Math.max(i4, i3)))
      {
        i2 -= 1;
        this.e.setTextSize(i2);
        this.e.getTextBounds(arrayOfString[0], 0, arrayOfString[0].length(), this.j);
        i4 = this.j.width();
        this.e.getTextBounds(arrayOfString[1], 0, arrayOfString[1].length(), this.j);
        i3 = this.j.width();
      }
      if (((String)localObject1).length() >= 9)
      {
        localObject1 = b((String)localObject1) + "万亿";
        break;
      }
      if (((String)localObject1).length() >= 5)
      {
        if (this.b.getType() != 0)
        {
          localObject1 = n.u((String)localObject1) + "亿";
          break;
        }
        localObject1 = n.u((String)localObject1) + "万亿";
        break;
      }
      if (((String)localObject1).equals("0"))
      {
        localObject1 = "--";
        break;
      }
      localObject1 = (String)localObject1 + "万";
      break;
      label1490:
      if (str1.length() >= 9)
      {
        localObject2 = b(str1) + "万亿";
        break label603;
      }
      if (str1.length() >= 5)
      {
        if (this.b.getType() != 0)
        {
          localObject2 = n.u(str1) + "亿";
          break label603;
        }
        localObject2 = n.u(str1) + "万亿";
        break label603;
      }
      if (str1.equals("0"))
      {
        localObject2 = "--";
        break label603;
      }
      localObject2 = str1 + "万";
      break label603;
      label1643:
      arrayOfString[0] = a(b.e(b.b(this.b.getmTotalAmount()) * 10000L));
      arrayOfString[1] = a(b.e(b.b(this.b.getmVol())));
      arrayOfString[2] = localObject1;
      arrayOfString[3] = localObject2;
      localObject2 = localObject3;
      i1 = 0;
      continue;
      if (!n.g(this.b.getType())) {
        break label1831;
      }
      localObject3 = this.o;
      arrayOfString[0] = (b.j(this.b.getmTotalAmount()) + "万");
      arrayOfString[1] = this.b.getApi2994Data().hideProfit;
      arrayOfString[2] = (this.b.getApi2994Data().premiumPrice + "%");
      arrayOfString[3] = this.b.getApi2994Data().priceLeverage;
      i1 = 0;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
    label1831:
    long l1 = this.b.getmVol();
    Object localObject3 = this.m;
    arrayOfString[0] = localObject2;
    str1 = b.e(l1);
    localObject1 = str1;
    if (str1.length() >= 5) {
      localObject1 = n.u(str1) + "万";
    }
    arrayOfString[1] = localObject1;
    arrayOfString[2] = str2;
    if (this.b.getmData2939() != null)
    {
      l1 = az.a(this.b.getmData2939()[6]);
      str1 = az.a(this.b.getmVol() + l1, l1);
      localObject1 = str1;
      if (!str1.startsWith("+")) {}
    }
    for (localObject1 = str1.substring(1);; localObject1 = "--")
    {
      arrayOfString[3] = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
      i1 = 1;
      break;
      paramCanvas.drawText(arrayOfString[0], i10 - this.f / 2, i8 - i9, this.e);
      if (i1 != 0) {
        this.e.setColor(this.u);
      }
      paramCanvas.drawText(arrayOfString[1], i10 - this.f / 2, this.d + i8 + i8 - i9, this.e);
      this.e.setTextAlign(Paint.Align.LEFT);
      if ((((String)localObject3).equals("--")) && (arrayOfString[1].equals("--"))) {}
      for (;;)
      {
        this.e.setColor(this.s);
        this.e.setTextAlign(Paint.Align.LEFT);
        this.e.setTextSize(this.d - 3);
        this.e.getTextBounds(localObject2[2], 0, localObject2[2].length(), this.j);
        i3 = this.j.width();
        this.e.getTextBounds(localObject2[3], 0, localObject2[3].length(), this.j);
        i4 = this.j.width();
        paramCanvas.drawText(localObject2[2], this.f + i10, i8 - i9, this.e);
        paramCanvas.drawText(localObject2[3], this.f + i10, this.d + i8 - 2 + i8 - i9, this.e);
        this.e.setColor(this.t);
        this.e.setTextAlign(Paint.Align.RIGHT);
        i2 = (int)this.e.getTextSize();
        i10 = i7 - this.f * 2 - i10 - Math.max(i3, i4);
        i4 = i6;
        for (i3 = i5; (i10 > 0) && (i10 < Math.max(i4, i3)); i3 = this.j.width())
        {
          i2 -= 1;
          this.e.setTextSize(i2);
          this.e.getTextBounds(arrayOfString[2], 0, arrayOfString[2].length(), this.j);
          i4 = this.j.width();
          this.e.getTextBounds(arrayOfString[3], 0, arrayOfString[3].length(), this.j);
        }
        Math.max(i4, i3);
        i2 = this.f;
        i2 = this.f / 2;
      }
      paramCanvas.drawText(arrayOfString[2], i7 - this.f / 2, i8 - i9, this.e);
      if (i1 != 0) {
        this.e.setColor(this.u);
      }
      paramCanvas.drawText(arrayOfString[3], i7 - this.f / 2, this.d + i8 - 2 + i8 - i9, this.e);
      return;
    }
  }
  
  public void setHolder(MinChartContainer paramMinChartContainer)
  {
    this.a = paramMinChartContainer;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\MinChartContainerTop.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */