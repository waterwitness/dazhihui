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
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.android.dazhihui.d.n;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.a.m;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.y;

public class StockChartHeaderTitleView
  extends View
{
  private int A;
  private boolean B = false;
  private Bitmap C;
  private String a = "--";
  private String b = "--";
  private String c = "";
  private boolean d;
  private String e = "--";
  private String f = "--";
  private String g = "--";
  private Rect h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private Resources n;
  private Paint o;
  private int p;
  private Bitmap q;
  private int r;
  private Rect s;
  private int t;
  private int u;
  private StockChartHeader v;
  private int w = -1;
  private int x = -1;
  private int y = -2849024;
  private StockVo z;
  
  public StockChartHeaderTitleView(Context paramContext)
  {
    this(paramContext, null, 0);
  }
  
  public StockChartHeaderTitleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public StockChartHeaderTitleView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.n = paramContext.getResources();
    this.h = new Rect(0, 0, 0, 0);
    this.i = this.n.getDimensionPixelSize(2131231140);
    this.j = this.n.getDimensionPixelSize(2131231141);
    this.k = this.n.getDimensionPixelSize(2131230879);
    this.l = this.n.getDimensionPixelSize(2131230875);
    this.m = this.n.getDimensionPixelSize(2131230871);
    this.o = new Paint(1);
    this.C = Bitmap.createBitmap(BitmapFactory.decodeResource(this.n, 2130838069));
    this.q = Bitmap.createBitmap(BitmapFactory.decodeResource(this.n, 2130838422));
    this.p = this.n.getDimensionPixelSize(2131230774);
    this.s = new Rect();
    this.t = getResources().getDimensionPixelSize(2131230773);
    this.u = getResources().getDimensionPixelSize(2131230840);
    this.A = getResources().getDimensionPixelOffset(2131230829);
  }
  
  public void a()
  {
    if (m.a().b().exitSelfStock(this.c)) {
      if (g.a().b() == y.a) {
        this.q = Bitmap.createBitmap(BitmapFactory.decodeResource(this.n, 2130838423));
      }
    }
    for (;;)
    {
      invalidate();
      return;
      this.q = Bitmap.createBitmap(BitmapFactory.decodeResource(this.n, 2130839008));
      continue;
      if (g.a().b() == y.a) {
        this.q = Bitmap.createBitmap(BitmapFactory.decodeResource(this.n, 2130838422));
      } else {
        this.q = Bitmap.createBitmap(BitmapFactory.decodeResource(this.n, 2130839007));
      }
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    this.a = paramString1;
    this.c = paramString2;
    this.b = n.e(paramString2);
    invalidate();
  }
  
  public void b()
  {
    if (this.B) {
      postInvalidate();
    }
  }
  
  public int getAddImgWight()
  {
    return this.q.getWidth();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i6 = getHeight();
    int i5 = getWidth();
    int i2 = this.k;
    int i4 = this.l;
    int i3 = i4;
    int i1 = i2;
    if (this.z != null)
    {
      this.e = this.z.getCurrentValue();
      this.f = this.z.getZf();
      this.g = this.z.getZfValue();
      if (TextUtils.isEmpty(this.g)) {
        break label215;
      }
    }
    for (;;)
    {
      try
      {
        if (Double.valueOf(Double.parseDouble(this.g)).doubleValue() > 0.0D) {
          this.g = ("+" + this.g);
        }
        if (TextUtils.isEmpty(this.e)) {
          this.e = "--";
        }
        i3 = i4;
        i1 = i2;
        if (TextUtils.isEmpty(this.f))
        {
          this.f = "--";
          i1 = i2;
          i3 = i4;
        }
        if (i6 >= i3 + i1 + this.p * 2) {
          break;
        }
        i3 -= 1;
        i1 -= 1;
        continue;
      }
      catch (Exception localException)
      {
        this.g = "--";
        continue;
      }
      label215:
      this.g = "--";
    }
    this.o.setStyle(Paint.Style.FILL);
    i4 = 0;
    i2 = i1;
    if (!TextUtils.isEmpty(this.a)) {
      do
      {
        i2 = i1 - 1;
        this.o.setTextSize(i2);
        this.o.getTextBounds(this.a, 0, this.a.length(), this.s);
        i4 = this.s.width();
        i1 = i2;
      } while (i4 > i5);
    }
    this.o.setTextSize(i2 - 1);
    i1 = (i5 - this.s.width()) / 2;
    i6 = (i6 - i2 - i3) / 3;
    this.o.setTextAlign(Paint.Align.CENTER);
    if (TextUtils.isEmpty(this.a)) {
      this.a = "--";
    }
    this.o.setColor(this.w);
    paramCanvas.drawText(this.a, i5 / 2, i6 - this.o.getFontMetrics().ascent + this.t, this.o);
    if (this.B) {
      if ((this.g.equals("--")) || (Float.valueOf(this.g).floatValue() == 0.0F))
      {
        i1 = -6776680;
        this.o.setColor(i1);
        this.o.setTextSize(i3);
        this.o.setTextAlign(Paint.Align.CENTER);
        paramCanvas.drawText(this.g, i5 / 2, i6 * 2 + i2 - this.o.getFontMetrics().ascent, this.o);
        this.o.getTextBounds(this.g, 0, this.g.length(), this.s);
        this.o.setTextAlign(Paint.Align.RIGHT);
        paramCanvas.drawText(this.e, i5 / 2 - this.A - this.s.width() / 2, i6 * 2 + i2 - this.o.getFontMetrics().ascent, this.o);
        this.o.setTextAlign(Paint.Align.LEFT);
        paramCanvas.drawText(this.f, i5 / 2 + this.A + this.s.width() / 2, i2 + i6 * 2 - this.o.getFontMetrics().ascent, this.o);
      }
    }
    do
    {
      return;
      if (Float.valueOf(this.g).floatValue() > 0.0F)
      {
        i1 = -2293760;
        break;
      }
      i1 = -15878144;
      break;
      if (this.d)
      {
        this.r = (i4 + (i1 + 20));
        this.o.setTextSize(i3);
        this.o.getTextBounds(this.b, 0, this.b.length(), this.s);
        this.s.width();
        i1 = (int)(i6 * 2 + i2 + this.o.getFontMetrics().descent) - 1;
        i3 = (int)(i6 * 2 + i2 - this.o.getFontMetrics().ascent) + 1;
        i4 = (i5 - this.s.width() - (i3 - i1)) / 2;
        this.o.setTextAlign(Paint.Align.LEFT);
        paramCanvas.drawText(this.b, i4, i2 + i6 * 2 - this.o.getFontMetrics().ascent, this.o);
        i2 = this.s.width() + i4 + 5;
        i4 = i2 + i3 - i1;
        this.h = new Rect(i2, i1, i4, i3);
        this.o.setColor(this.y);
        this.o.setStyle(Paint.Style.FILL_AND_STROKE);
        paramCanvas.drawRect(this.h, this.o);
        this.o.setColor(-16777216);
        this.o.setTextSize(this.m);
        this.o.setTextAlign(Paint.Align.CENTER);
        paramCanvas.drawText("R", i2 / 2 + i4 / 2, i3 - this.o.descent() / 2.0F, this.o);
        return;
      }
      if ((this.z == null) || ((this.z.getStockExtendRank() != 1) && (this.z.getStockExtendRank() != 2))) {
        break label1482;
      }
      this.r = (i4 + (i1 + 20));
      this.o.setTextSize(i3);
      this.o.getTextBounds(this.b, 0, this.b.length(), this.s);
      this.s.width();
      i1 = (int)(i6 * 2 + i2 + this.o.getFontMetrics().descent) - 1;
      i3 = (int)(i6 * 2 + i2 - this.o.getFontMetrics().ascent) + 1;
      i4 = (i5 - this.s.width() - (i3 - i1)) / 2;
      this.o.setTextAlign(Paint.Align.LEFT);
      paramCanvas.drawText(this.b, i4, i2 + i6 * 2 - this.o.getFontMetrics().ascent, this.o);
      i2 = this.s.width() + i4 + 5;
      this.o.setTextSize(this.m);
      if (this.z.getStockExtendRank() == 2) {
        this.o.getTextBounds("创新", 0, "创新".length(), this.s);
      }
      for (;;)
      {
        i4 = this.s.width() + i2 + 10;
        this.h = new Rect(i2, i1 - 3, i4, i3 + 3);
        this.o.setColor(getResources().getColor(2131493412));
        this.o.setStyle(Paint.Style.FILL_AND_STROKE);
        paramCanvas.drawRect(this.h, this.o);
        this.o.setColor(-1);
        this.o.setTextSize(getResources().getColor(2131493677));
        this.o.setTextAlign(Paint.Align.CENTER);
        if (this.z.getStockExtendRank() != 2) {
          break;
        }
        paramCanvas.drawText("创新", i2 / 2 + i4 / 2, i3 - this.o.descent() / 2.0F, this.o);
        return;
        this.o.getTextBounds("基础", 0, "创新".length(), this.s);
      }
    } while (this.z.getStockExtendRank() != 1);
    paramCanvas.drawText("基础", i2 / 2 + i4 / 2, i3 - this.o.descent() / 2.0F, this.o);
    return;
    label1482:
    if (uv.b(this.z))
    {
      this.r = (i4 + (i1 + 20));
      this.o.setTextSize(i3);
      this.o.getTextBounds(this.b, 0, this.b.length(), this.s);
      this.s.width();
      i1 = (int)(i6 * 2 + i2 + this.o.getFontMetrics().descent) - 1;
      i3 = (int)(i6 * 2 + i2 - this.o.getFontMetrics().ascent);
      i3 = (i5 - this.s.width() - (i3 + 1 - i1)) / 2;
      this.o.setTextAlign(Paint.Align.LEFT);
      paramCanvas.drawText(this.b, i3, i2 + i6 * 2 - this.o.getFontMetrics().ascent, this.o);
      i2 = this.s.width();
      this.o.setTextSize(this.m);
      i4 = (this.C.getHeight() - this.s.height()) / 2;
      paramCanvas.drawBitmap(this.C, i3 + i2 + 5, i1 - i4, this.o);
      return;
    }
    this.o.setTextSize(i3);
    this.o.setTextAlign(Paint.Align.CENTER);
    if (TextUtils.isEmpty(this.b)) {
      this.b = "--";
    }
    this.o.setColor(this.x);
    paramCanvas.drawText(this.b, i5 / 2, i2 + i6 * 2 - this.o.getFontMetrics().ascent, this.o);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i1 = View.MeasureSpec.getSize(paramInt1);
    int i2 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = paramInt2;
    if (i2 != 1073741824) {
      paramInt1 = Math.min(this.i, paramInt2);
    }
    paramInt2 = i1;
    if (i2 != 1073741824) {
      paramInt2 = Math.min(this.j, i1);
    }
    setMeasuredDimension(paramInt2, paramInt1);
  }
  
  public void setHasRong(boolean paramBoolean)
  {
    this.d = paramBoolean;
    invalidate();
  }
  
  public void setHolder(StockChartHeader paramStockChartHeader)
  {
    this.v = paramStockChartHeader;
  }
  
  public void setShowPrice(boolean paramBoolean)
  {
    this.B = paramBoolean;
    postInvalidate();
  }
  
  public void setStockVo(StockVo paramStockVo)
  {
    this.z = paramStockVo;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\StockChartHeaderTitleView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */