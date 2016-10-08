package com.android.dazhihui.ui.widget.stockchart;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.d.b;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.screen.y;

public class KChartDDEView
  extends StockChartBaseView
  implements View.OnClickListener
{
  private int a;
  private int b = Integer.MIN_VALUE;
  private int c = Integer.MAX_VALUE;
  private n d = n.a;
  private KChartContainer e;
  private StockVo f;
  private int g;
  private int h;
  private int i;
  private Rect n = new Rect();
  private Path o = new Path();
  private int p;
  private int q;
  private int r;
  private int s;
  private int t;
  private int u;
  
  public KChartDDEView(Context paramContext)
  {
    super(paramContext);
    c();
  }
  
  public KChartDDEView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    c();
  }
  
  public KChartDDEView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    c();
  }
  
  private void a(int paramInt1, int paramInt2, Canvas paramCanvas)
  {
    paramCanvas.save();
    this.j.setTextAlign(Paint.Align.RIGHT);
    this.j.setColor(this.e.getKlineRightPartColor());
    this.j.setTextSize(this.g);
    this.j.setStyle(Paint.Style.FILL);
    float f1 = this.j.getFontMetrics().ascent;
    this.j.getTextBounds("1234567890", 0, 10, this.n);
    int j = this.n.height();
    j = (int)(getHeight() - 2 - paramInt1 - paramInt2 - j * 1.5D) / 2;
    paramInt2 = paramInt1 + 1;
    paramInt1 = 0;
    if (paramInt1 < 3)
    {
      String str2 = "";
      String str1;
      if (paramInt1 == 0) {
        str1 = az.g(this.b, 3);
      }
      for (;;)
      {
        paramCanvas.drawText(str1, getWidth() - 1, paramInt2 - f1, this.j);
        paramInt2 += j;
        paramInt1 += 1;
        break;
        str1 = str2;
        if (paramInt1 != 1)
        {
          str1 = str2;
          if (paramInt1 == 2) {
            str1 = b.g(this.c, 3);
          }
        }
      }
    }
    paramCanvas.restore();
  }
  
  private void a(int paramInt1, int paramInt2, Canvas paramCanvas, String paramString1, String paramString2, String paramString3)
  {
    paramCanvas.save();
    this.j.setTextAlign(Paint.Align.RIGHT);
    this.j.setColor(this.e.getKlineRightPartColor());
    this.j.setTextSize(this.g);
    this.j.setStyle(Paint.Style.FILL);
    float f1 = this.j.getFontMetrics().ascent;
    this.j.getTextBounds("1234567890", 0, 10, this.n);
    int j = this.n.height();
    paramInt2 = (int)(getHeight() - 2 - paramInt1 - paramInt2 - j * 1.5D) / 2;
    paramInt1 += 1;
    paramCanvas.drawText(paramString1, getWidth() - 1, paramInt1 - f1, this.j);
    paramInt1 += paramInt2;
    paramCanvas.drawText(paramString2, getWidth() - 1, paramInt1 - f1, this.j);
    paramCanvas.drawText(paramString3, getWidth() - 1, paramInt2 + paramInt1 - f1, this.j);
    paramCanvas.restore();
  }
  
  private void b(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.f = this.e.getDataModel();
    int[][] arrayOfInt1;
    if (this.f != null)
    {
      arrayOfInt1 = this.f.getKDDX();
      if (arrayOfInt1 == null) {
        paramCanvas.restore();
      }
    }
    else
    {
      return;
    }
    int[][] arrayOfInt2 = this.f.getKData();
    if (arrayOfInt1.length < arrayOfInt2.length) {
      arrayOfInt1 = com.android.dazhihui.d.n.a(arrayOfInt1, arrayOfInt2.length);
    }
    for (;;)
    {
      int i1 = this.f.getKLineOffset();
      int i4 = this.e.getKLineWidth();
      float f3 = i4 - this.h;
      if (f3 < this.h) {
        f3 = this.h;
      }
      for (;;)
      {
        int i5 = this.e.getScreenIndex();
        a(this.h, this.h, paramCanvas);
        int j = getWidth();
        int m = getHeight();
        int i2 = getPaddingLeft();
        int i3 = getPaddingTop() + this.h;
        int k = getPaddingRight() + this.a;
        int i6 = getPaddingBottom() + this.h;
        paramCanvas.clipRect(i2, i3, j - k, m - i6);
        k = this.b + Math.abs(this.c);
        j = k;
        if (k == 0) {
          j = 1;
        }
        k = (m - (i3 + i6)) * this.b / j;
        label279:
        label332:
        float f1;
        float f2;
        if (k < 12)
        {
          k = 12;
          this.j.setStrokeWidth(this.h);
          m = i1;
          if (m >= arrayOfInt1.length) {
            break label536;
          }
          i6 = (m - i1) * i4;
          j = 0;
          if (this.b != 0) {
            j = Math.abs(arrayOfInt1[m][1]) * k / this.b;
          }
          if (j <= 0) {
            break label439;
          }
          if (arrayOfInt1[m][1] < 0) {
            break label471;
          }
          this.j.setColor(this.e.getDDEUpColor());
          f1 = 0.0F;
          f2 = 0.0F;
          if (f3 > this.h) {
            break label445;
          }
          f1 = 0.0F;
          this.j.setStyle(Paint.Style.FILL);
          f2 = 0.0F;
          label385:
          paramCanvas.drawRect(i2 + i6 + f1, i3 + k - j, i2 + i6 + f3 - f2, i3 + k, this.j);
        }
        for (;;)
        {
          m += 1;
          break label279;
          break;
          label439:
          j = 1;
          break label332;
          label445:
          if (f3 - 1.0F > 0.0F)
          {
            f1 = 1.0F;
            f2 = 1.0F;
          }
          this.j.setStyle(Paint.Style.STROKE);
          break label385;
          label471:
          this.j.setColor(this.e.getDDEDownColor());
          this.j.setStyle(Paint.Style.FILL);
          paramCanvas.drawRect(i2 + i6, i3 + k, i2 + i6 + f3, j + (i3 + k), this.j);
        }
        label536:
        if (i5 < 0) {}
        for (j = arrayOfInt1.length - 1; j < arrayOfInt1.length; j = i5 + i1)
        {
          k = this.i + i3;
          m = this.i + i2;
          this.j.setTextAlign(Paint.Align.LEFT);
          this.j.setStyle(Paint.Style.FILL);
          this.j.setColor(this.e.getTextColor());
          paramCanvas.drawText("DDX:", m, k - this.j.getFontMetrics().ascent, this.j);
          this.j.getTextBounds("DDX:", 0, "DDX:".length(), this.n);
          i1 = this.n.width();
          i2 = this.i;
          paramCanvas.drawText(b.g(arrayOfInt1[j][1], 3), m + (i1 + i2), k - this.j.getFontMetrics().ascent, this.j);
          this.e.a((String[][])null, null);
          paramCanvas.restore();
          return;
        }
        break;
      }
    }
  }
  
  private void b(y paramy)
  {
    if (paramy == y.b)
    {
      this.p = -4194304;
      this.q = -683264;
      this.r = -16711681;
      this.s = -65536;
      this.t = -14540254;
      this.u = 34816;
      return;
    }
    this.p = -4194304;
    this.q = -683264;
    this.r = -16711681;
    this.s = -65536;
    this.t = -1;
    this.u = -409087;
  }
  
  private void b(n paramn)
  {
    if (this.f == null) {}
    do
    {
      return;
      if (paramn == n.a)
      {
        com.android.dazhihui.d.n.a(this.f.getCode(), 1055);
        return;
      }
      if (paramn == n.b)
      {
        com.android.dazhihui.d.n.a(this.f.getCode(), 1056);
        return;
      }
      if (paramn == n.c)
      {
        com.android.dazhihui.d.n.a(this.f.getCode(), 1057);
        return;
      }
      if (paramn == n.d)
      {
        com.android.dazhihui.d.n.a(this.f.getCode(), 1058);
        return;
      }
    } while (paramn != n.e);
    com.android.dazhihui.d.n.a(this.f.getCode(), 1059);
  }
  
  private void c()
  {
    d locald = d.a();
    int j = locald.b("kchartddevalue", 0);
    locald.g();
    switch (j)
    {
    default: 
      return;
    case 0: 
      this.d = n.a;
      return;
    case 1: 
      this.d = n.b;
      return;
    case 2: 
      this.d = n.c;
      return;
    case 3: 
      this.d = n.d;
      return;
    case 4: 
      this.d = n.e;
      return;
    }
    this.d = n.f;
  }
  
  private void c(Canvas paramCanvas)
  {
    paramCanvas.save();
    this.f = this.e.getDataModel();
    int[][] arrayOfInt1;
    if (this.f != null)
    {
      arrayOfInt1 = this.f.getKDDY();
      if (arrayOfInt1 == null) {
        paramCanvas.restore();
      }
    }
    else
    {
      return;
    }
    int[][] arrayOfInt2 = this.f.getKData();
    if (arrayOfInt1.length < arrayOfInt2.length) {
      arrayOfInt1 = com.android.dazhihui.d.n.a(arrayOfInt1, arrayOfInt2.length);
    }
    for (;;)
    {
      int i1 = this.f.getKLineOffset();
      int i4 = this.e.getKLineWidth();
      float f3 = i4 - this.h;
      if (f3 < this.h) {
        f3 = this.h;
      }
      for (;;)
      {
        int i5 = this.e.getScreenIndex();
        a(this.h, this.h, paramCanvas);
        int j = getWidth();
        int m = getHeight();
        int i2 = getPaddingLeft();
        int i3 = getPaddingTop() + this.h;
        int k = getPaddingRight() + this.a;
        int i6 = getPaddingBottom() + this.h;
        paramCanvas.clipRect(i2, i3, j - k, m - i6);
        k = this.b + Math.abs(this.c);
        j = k;
        if (k == 0) {
          j = 1;
        }
        k = (m - (i3 + i6)) * this.b / j;
        label279:
        label332:
        float f1;
        float f2;
        if (k < 12)
        {
          k = 12;
          this.j.setStrokeWidth(this.h);
          m = i1;
          if (m >= arrayOfInt1.length) {
            break label536;
          }
          i6 = (m - i1) * i4;
          j = 0;
          if (this.b != 0) {
            j = Math.abs(arrayOfInt1[m][1]) * k / this.b;
          }
          if (j <= 0) {
            break label439;
          }
          if (arrayOfInt1[m][1] < 0) {
            break label471;
          }
          this.j.setColor(this.e.getDDEUpColor());
          f1 = 0.0F;
          f2 = 0.0F;
          if (f3 > this.h) {
            break label445;
          }
          f1 = 0.0F;
          this.j.setStyle(Paint.Style.FILL);
          f2 = 0.0F;
          label385:
          paramCanvas.drawRect(i2 + i6 + f1, i3 + k - j, i2 + i6 + f3 - f2, i3 + k, this.j);
        }
        for (;;)
        {
          m += 1;
          break label279;
          break;
          label439:
          j = 1;
          break label332;
          label445:
          if (f3 - 1.0F > 0.0F)
          {
            f1 = 1.0F;
            f2 = 1.0F;
          }
          this.j.setStyle(Paint.Style.STROKE);
          break label385;
          label471:
          this.j.setColor(this.e.getDDEDownColor());
          this.j.setStyle(Paint.Style.FILL);
          paramCanvas.drawRect(i2 + i6, i3 + k, i2 + i6 + f3, j + (i3 + k), this.j);
        }
        label536:
        if (i5 < 0) {}
        for (j = arrayOfInt1.length - 1; j < arrayOfInt1.length; j = i5 + i1)
        {
          k = this.i + i3;
          m = this.i + i2;
          this.j.setTextAlign(Paint.Align.LEFT);
          this.j.setStyle(Paint.Style.FILL);
          this.j.setColor(this.e.getTextColor());
          paramCanvas.drawText("DDY:", m, k - this.j.getFontMetrics().ascent, this.j);
          this.j.getTextBounds("DDY:", 0, "DDY:".length(), this.n);
          i1 = this.n.width();
          i2 = this.i;
          paramCanvas.drawText(az.g(arrayOfInt1[j][1], 3), m + (i1 + i2), k - this.j.getFontMetrics().ascent, this.j);
          this.e.a((String[][])null, null);
          paramCanvas.restore();
          return;
        }
        break;
      }
    }
  }
  
  /* Error */
  private void d(Canvas paramCanvas)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 73	android/graphics/Canvas:save	()I
    //   4: pop
    //   5: aload_0
    //   6: aload_0
    //   7: getfield 91	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:e	Lcom/android/dazhihui/ui/widget/stockchart/KChartContainer;
    //   10: invokevirtual 166	com/android/dazhihui/ui/widget/stockchart/KChartContainer:getDataModel	()Lcom/android/dazhihui/ui/model/stock/StockVo;
    //   13: putfield 168	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:f	Lcom/android/dazhihui/ui/model/stock/StockVo;
    //   16: aload_0
    //   17: getfield 168	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:f	Lcom/android/dazhihui/ui/model/stock/StockVo;
    //   20: ifnull +1370 -> 1390
    //   23: aload_0
    //   24: getfield 168	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:f	Lcom/android/dazhihui/ui/model/stock/StockVo;
    //   27: invokevirtual 321	com/android/dazhihui/ui/model/stock/StockVo:getKDDZ	()[[I
    //   30: astore_2
    //   31: aload_2
    //   32: ifnonnull +8 -> 40
    //   35: aload_1
    //   36: invokevirtual 160	android/graphics/Canvas:restore	()V
    //   39: return
    //   40: aload_0
    //   41: getfield 168	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:f	Lcom/android/dazhihui/ui/model/stock/StockVo;
    //   44: invokevirtual 177	com/android/dazhihui/ui/model/stock/StockVo:getKData	()[[I
    //   47: astore_3
    //   48: aload_2
    //   49: arraylength
    //   50: aload_3
    //   51: arraylength
    //   52: if_icmpge +1427 -> 1479
    //   55: aload_2
    //   56: aload_3
    //   57: arraylength
    //   58: invokestatic 182	com/android/dazhihui/d/n:a	([[II)[[I
    //   61: astore_2
    //   62: aload_0
    //   63: aload_0
    //   64: getfield 190	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:h	I
    //   67: aload_0
    //   68: getfield 190	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:h	I
    //   71: aload_1
    //   72: invokespecial 195	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:a	(IILandroid/graphics/Canvas;)V
    //   75: aload_0
    //   76: getfield 168	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:f	Lcom/android/dazhihui/ui/model/stock/StockVo;
    //   79: invokevirtual 185	com/android/dazhihui/ui/model/stock/StockVo:getKLineOffset	()I
    //   82: istore 15
    //   84: aload_0
    //   85: getfield 91	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:e	Lcom/android/dazhihui/ui/widget/stockchart/KChartContainer;
    //   88: invokevirtual 188	com/android/dazhihui/ui/widget/stockchart/KChartContainer:getKLineWidth	()I
    //   91: istore 19
    //   93: aload_0
    //   94: getfield 91	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:e	Lcom/android/dazhihui/ui/widget/stockchart/KChartContainer;
    //   97: invokevirtual 193	com/android/dazhihui/ui/widget/stockchart/KChartContainer:getScreenIndex	()I
    //   100: istore 20
    //   102: aload_0
    //   103: invokevirtual 150	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:getWidth	()I
    //   106: istore 4
    //   108: aload_0
    //   109: invokevirtual 138	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:getHeight	()I
    //   112: istore 6
    //   114: aload_0
    //   115: invokevirtual 198	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:getPaddingLeft	()I
    //   118: istore 14
    //   120: aload_0
    //   121: invokevirtual 201	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:getPaddingTop	()I
    //   124: aload_0
    //   125: getfield 190	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:h	I
    //   128: iadd
    //   129: istore 18
    //   131: aload_0
    //   132: invokevirtual 204	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:getPaddingRight	()I
    //   135: aload_0
    //   136: getfield 206	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:a	I
    //   139: iadd
    //   140: istore 5
    //   142: aload_0
    //   143: invokevirtual 209	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:getPaddingBottom	()I
    //   146: aload_0
    //   147: getfield 190	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:h	I
    //   150: iadd
    //   151: istore 7
    //   153: aload_1
    //   154: iload 14
    //   156: iload 18
    //   158: iload 4
    //   160: iload 5
    //   162: isub
    //   163: iload 6
    //   165: iload 7
    //   167: isub
    //   168: invokevirtual 213	android/graphics/Canvas:clipRect	(IIII)Z
    //   171: pop
    //   172: iload 6
    //   174: iload 18
    //   176: iload 7
    //   178: iadd
    //   179: isub
    //   180: istore 6
    //   182: aload_0
    //   183: getfield 36	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:b	I
    //   186: ifne +15 -> 201
    //   189: aload_0
    //   190: getfield 39	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:c	I
    //   193: ifne +8 -> 201
    //   196: aload_0
    //   197: iconst_1
    //   198: putfield 36	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:b	I
    //   201: aload_0
    //   202: getfield 36	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:b	I
    //   205: iload 6
    //   207: imul
    //   208: aload_0
    //   209: getfield 36	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:b	I
    //   212: aload_0
    //   213: getfield 39	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:c	I
    //   216: invokestatic 219	java/lang/Math:abs	(I)I
    //   219: iadd
    //   220: idiv
    //   221: istore 21
    //   223: iload 6
    //   225: iload 21
    //   227: isub
    //   228: istore 22
    //   230: aload_0
    //   231: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   234: aload_0
    //   235: getfield 267	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:p	I
    //   238: invokevirtual 100	android/graphics/Paint:setColor	(I)V
    //   241: aload_0
    //   242: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   245: fconst_2
    //   246: invokevirtual 222	android/graphics/Paint:setStrokeWidth	(F)V
    //   249: aload_0
    //   250: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   253: getstatic 112	android/graphics/Paint$Style:FILL	Landroid/graphics/Paint$Style;
    //   256: invokevirtual 116	android/graphics/Paint:setStyle	(Landroid/graphics/Paint$Style;)V
    //   259: aload_1
    //   260: iload 14
    //   262: i2f
    //   263: iload 18
    //   265: iload 21
    //   267: iadd
    //   268: i2f
    //   269: iload 4
    //   271: iload 5
    //   273: iload 14
    //   275: iadd
    //   276: isub
    //   277: iload 14
    //   279: iadd
    //   280: i2f
    //   281: iload 18
    //   283: iload 21
    //   285: iadd
    //   286: i2f
    //   287: aload_0
    //   288: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   291: invokevirtual 324	android/graphics/Canvas:drawLine	(FFFFLandroid/graphics/Paint;)V
    //   294: iconst_0
    //   295: istore 9
    //   297: iconst_0
    //   298: istore 7
    //   300: iconst_0
    //   301: istore 6
    //   303: iconst_0
    //   304: istore 4
    //   306: iconst_0
    //   307: istore 5
    //   309: iconst_0
    //   310: istore 8
    //   312: aload_2
    //   313: arraylength
    //   314: istore 23
    //   316: iload 19
    //   318: iconst_1
    //   319: ishr
    //   320: istore 24
    //   322: iload 15
    //   324: istore 12
    //   326: iload 12
    //   328: iload 23
    //   330: if_icmpge +873 -> 1203
    //   333: iload 12
    //   335: iload 15
    //   337: isub
    //   338: iload 19
    //   340: imul
    //   341: iload 14
    //   343: iadd
    //   344: iload 24
    //   346: iadd
    //   347: istore 25
    //   349: iconst_0
    //   350: istore 13
    //   352: iconst_0
    //   353: istore 10
    //   355: aload_2
    //   356: iload 12
    //   358: aaload
    //   359: iconst_1
    //   360: iaload
    //   361: ifle +532 -> 893
    //   364: iload 21
    //   366: aload_2
    //   367: iload 12
    //   369: aaload
    //   370: iconst_1
    //   371: iaload
    //   372: iload 21
    //   374: imul
    //   375: aload_0
    //   376: getfield 36	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:b	I
    //   379: idiv
    //   380: isub
    //   381: istore 11
    //   383: aload_2
    //   384: iload 12
    //   386: aaload
    //   387: iconst_2
    //   388: iaload
    //   389: istore 10
    //   391: iload 10
    //   393: iconst_2
    //   394: imul
    //   395: istore 10
    //   397: iload 18
    //   399: iload 11
    //   401: iadd
    //   402: istore 26
    //   404: iload 26
    //   406: iload 10
    //   408: isub
    //   409: istore 27
    //   411: iload 12
    //   413: iconst_1
    //   414: iadd
    //   415: aload_2
    //   416: arraylength
    //   417: if_icmplt +1056 -> 1473
    //   420: iconst_0
    //   421: istore 10
    //   423: iload 10
    //   425: ifeq +1033 -> 1458
    //   428: iconst_0
    //   429: istore 9
    //   431: iconst_0
    //   432: istore 6
    //   434: aload_2
    //   435: iload 12
    //   437: iconst_1
    //   438: iadd
    //   439: aaload
    //   440: iconst_1
    //   441: iaload
    //   442: ifle +495 -> 937
    //   445: iload 21
    //   447: aload_2
    //   448: iload 12
    //   450: iconst_1
    //   451: iadd
    //   452: aaload
    //   453: iconst_1
    //   454: iaload
    //   455: iload 21
    //   457: imul
    //   458: aload_0
    //   459: getfield 36	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:b	I
    //   462: idiv
    //   463: isub
    //   464: istore 7
    //   466: aload_2
    //   467: iload 12
    //   469: iconst_1
    //   470: iadd
    //   471: aaload
    //   472: iconst_2
    //   473: iaload
    //   474: istore 6
    //   476: iload 6
    //   478: iconst_2
    //   479: imul
    //   480: istore 6
    //   482: iload 7
    //   484: iload 18
    //   486: iadd
    //   487: istore 7
    //   489: iload 7
    //   491: iload 6
    //   493: isub
    //   494: istore 9
    //   496: iload 12
    //   498: iconst_1
    //   499: iadd
    //   500: iload 15
    //   502: isub
    //   503: iload 19
    //   505: imul
    //   506: iload 14
    //   508: iadd
    //   509: iload 24
    //   511: iadd
    //   512: istore 6
    //   514: iload 12
    //   516: iconst_1
    //   517: isub
    //   518: ifge +934 -> 1452
    //   521: iconst_0
    //   522: istore 11
    //   524: iload 11
    //   526: ifeq +911 -> 1437
    //   529: iload 12
    //   531: iconst_1
    //   532: isub
    //   533: iload 15
    //   535: isub
    //   536: iload 19
    //   538: imul
    //   539: iload 14
    //   541: iadd
    //   542: iload 24
    //   544: iadd
    //   545: istore 13
    //   547: aload_2
    //   548: iload 12
    //   550: iconst_1
    //   551: isub
    //   552: aaload
    //   553: iconst_1
    //   554: iaload
    //   555: ifle +440 -> 995
    //   558: aload_2
    //   559: iload 12
    //   561: iconst_1
    //   562: isub
    //   563: aaload
    //   564: iconst_1
    //   565: iaload
    //   566: iload 21
    //   568: imul
    //   569: aload_0
    //   570: getfield 36	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:b	I
    //   573: idiv
    //   574: istore 5
    //   576: aload_2
    //   577: iload 12
    //   579: iconst_1
    //   580: isub
    //   581: aaload
    //   582: iconst_2
    //   583: iaload
    //   584: istore 4
    //   586: iload 21
    //   588: iload 5
    //   590: isub
    //   591: istore 5
    //   593: iload 4
    //   595: iconst_2
    //   596: imul
    //   597: istore 4
    //   599: iload 5
    //   601: iload 18
    //   603: iadd
    //   604: istore 16
    //   606: iload 16
    //   608: iload 4
    //   610: isub
    //   611: istore 17
    //   613: iload 13
    //   615: istore 4
    //   617: iload 17
    //   619: istore 5
    //   621: iload 16
    //   623: istore 8
    //   625: iload 13
    //   627: iload 14
    //   629: if_icmpge +15 -> 644
    //   632: iload 14
    //   634: istore 4
    //   636: iload 16
    //   638: istore 8
    //   640: iload 17
    //   642: istore 5
    //   644: iload 26
    //   646: iload 8
    //   648: iadd
    //   649: iconst_1
    //   650: ishr
    //   651: istore 13
    //   653: iload 25
    //   655: iload 4
    //   657: iadd
    //   658: iconst_1
    //   659: ishr
    //   660: istore 16
    //   662: iload 26
    //   664: iload 7
    //   666: iadd
    //   667: iconst_1
    //   668: ishr
    //   669: istore 17
    //   671: iload 6
    //   673: iload 25
    //   675: iadd
    //   676: iconst_1
    //   677: ishr
    //   678: istore 28
    //   680: iload 27
    //   682: iload 9
    //   684: iadd
    //   685: iconst_1
    //   686: ishr
    //   687: istore 29
    //   689: aload_0
    //   690: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   693: invokevirtual 327	android/graphics/Path:reset	()V
    //   696: iload 10
    //   698: ifeq +359 -> 1057
    //   701: iload 11
    //   703: ifeq +354 -> 1057
    //   706: aload_0
    //   707: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   710: iload 16
    //   712: i2f
    //   713: iload 13
    //   715: i2f
    //   716: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   719: aload_0
    //   720: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   723: iload 25
    //   725: i2f
    //   726: iload 26
    //   728: i2f
    //   729: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   732: aload_0
    //   733: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   736: iload 28
    //   738: i2f
    //   739: iload 17
    //   741: i2f
    //   742: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   745: aload_0
    //   746: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   749: iload 28
    //   751: i2f
    //   752: iload 29
    //   754: i2f
    //   755: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   758: aload_0
    //   759: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   762: iload 25
    //   764: i2f
    //   765: iload 27
    //   767: i2f
    //   768: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   771: aload_0
    //   772: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   775: iload 16
    //   777: i2f
    //   778: iload 27
    //   780: iload 5
    //   782: iadd
    //   783: iconst_1
    //   784: ishr
    //   785: i2f
    //   786: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   789: aload_0
    //   790: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   793: iload 16
    //   795: i2f
    //   796: iload 13
    //   798: i2f
    //   799: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   802: aload_0
    //   803: getfield 91	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:e	Lcom/android/dazhihui/ui/widget/stockchart/KChartContainer;
    //   806: invokevirtual 225	com/android/dazhihui/ui/widget/stockchart/KChartContainer:getDDEUpColor	()I
    //   809: istore 10
    //   811: aload_2
    //   812: iload 12
    //   814: aaload
    //   815: iconst_1
    //   816: iaload
    //   817: ifge +12 -> 829
    //   820: aload_0
    //   821: getfield 91	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:e	Lcom/android/dazhihui/ui/widget/stockchart/KChartContainer;
    //   824: invokevirtual 235	com/android/dazhihui/ui/widget/stockchart/KChartContainer:getDDEDownColor	()I
    //   827: istore 10
    //   829: aload_0
    //   830: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   833: iload 10
    //   835: invokevirtual 100	android/graphics/Paint:setColor	(I)V
    //   838: aload_0
    //   839: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   842: getstatic 112	android/graphics/Paint$Style:FILL	Landroid/graphics/Paint$Style;
    //   845: invokevirtual 116	android/graphics/Paint:setStyle	(Landroid/graphics/Paint$Style;)V
    //   848: aload_1
    //   849: aload_0
    //   850: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   853: aload_0
    //   854: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   857: invokevirtual 335	android/graphics/Canvas:drawPath	(Landroid/graphics/Path;Landroid/graphics/Paint;)V
    //   860: iload 12
    //   862: iconst_1
    //   863: iadd
    //   864: istore 12
    //   866: iload 8
    //   868: istore 10
    //   870: iload 6
    //   872: istore 11
    //   874: iload 4
    //   876: istore 8
    //   878: iload 10
    //   880: istore 4
    //   882: iload 9
    //   884: istore 6
    //   886: iload 11
    //   888: istore 9
    //   890: goto -564 -> 326
    //   893: aload_2
    //   894: iload 12
    //   896: aaload
    //   897: iconst_1
    //   898: iaload
    //   899: invokestatic 219	java/lang/Math:abs	(I)I
    //   902: iload 22
    //   904: imul
    //   905: aload_0
    //   906: getfield 39	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:c	I
    //   909: invokestatic 219	java/lang/Math:abs	(I)I
    //   912: idiv
    //   913: iload 21
    //   915: iadd
    //   916: istore 11
    //   918: aload_2
    //   919: iload 12
    //   921: aaload
    //   922: iconst_2
    //   923: iaload
    //   924: istore 10
    //   926: iconst_0
    //   927: iload 10
    //   929: iconst_2
    //   930: imul
    //   931: isub
    //   932: istore 10
    //   934: goto -537 -> 397
    //   937: aload_2
    //   938: iload 12
    //   940: iconst_1
    //   941: iadd
    //   942: aaload
    //   943: iconst_1
    //   944: iaload
    //   945: invokestatic 219	java/lang/Math:abs	(I)I
    //   948: iload 22
    //   950: imul
    //   951: aload_0
    //   952: getfield 39	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:c	I
    //   955: invokestatic 219	java/lang/Math:abs	(I)I
    //   958: idiv
    //   959: iload 21
    //   961: iadd
    //   962: istore 7
    //   964: aload_2
    //   965: iload 12
    //   967: iconst_1
    //   968: iadd
    //   969: aaload
    //   970: iconst_2
    //   971: iaload
    //   972: istore 6
    //   974: iconst_0
    //   975: iload 6
    //   977: iconst_2
    //   978: imul
    //   979: isub
    //   980: istore 6
    //   982: goto -500 -> 482
    //   985: astore_3
    //   986: iconst_0
    //   987: istore 5
    //   989: iconst_0
    //   990: istore 4
    //   992: goto -393 -> 599
    //   995: aload_2
    //   996: iload 12
    //   998: iconst_1
    //   999: isub
    //   1000: aaload
    //   1001: iconst_1
    //   1002: iaload
    //   1003: invokestatic 219	java/lang/Math:abs	(I)I
    //   1006: iload 22
    //   1008: imul
    //   1009: aload_0
    //   1010: getfield 39	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:c	I
    //   1013: invokestatic 219	java/lang/Math:abs	(I)I
    //   1016: idiv
    //   1017: istore 5
    //   1019: aload_2
    //   1020: iload 12
    //   1022: iconst_1
    //   1023: isub
    //   1024: aaload
    //   1025: iconst_2
    //   1026: iaload
    //   1027: istore 4
    //   1029: iload 5
    //   1031: iload 21
    //   1033: iadd
    //   1034: istore 5
    //   1036: iconst_0
    //   1037: iload 4
    //   1039: iconst_2
    //   1040: imul
    //   1041: isub
    //   1042: istore 4
    //   1044: goto -445 -> 599
    //   1047: astore_3
    //   1048: iconst_0
    //   1049: istore 5
    //   1051: iconst_0
    //   1052: istore 4
    //   1054: goto -455 -> 599
    //   1057: iload 10
    //   1059: ifeq +71 -> 1130
    //   1062: aload_0
    //   1063: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   1066: iload 25
    //   1068: i2f
    //   1069: iload 26
    //   1071: i2f
    //   1072: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   1075: aload_0
    //   1076: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   1079: iload 28
    //   1081: i2f
    //   1082: iload 17
    //   1084: i2f
    //   1085: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   1088: aload_0
    //   1089: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   1092: iload 28
    //   1094: i2f
    //   1095: iload 29
    //   1097: i2f
    //   1098: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   1101: aload_0
    //   1102: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   1105: iload 25
    //   1107: i2f
    //   1108: iload 27
    //   1110: i2f
    //   1111: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   1114: aload_0
    //   1115: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   1118: iload 25
    //   1120: i2f
    //   1121: iload 26
    //   1123: i2f
    //   1124: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   1127: goto -325 -> 802
    //   1130: iload 11
    //   1132: ifeq -330 -> 802
    //   1135: aload_0
    //   1136: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   1139: iload 28
    //   1141: i2f
    //   1142: iload 17
    //   1144: i2f
    //   1145: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   1148: aload_0
    //   1149: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   1152: iload 6
    //   1154: i2f
    //   1155: iload 7
    //   1157: i2f
    //   1158: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   1161: aload_0
    //   1162: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   1165: iload 6
    //   1167: i2f
    //   1168: iload 9
    //   1170: i2f
    //   1171: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   1174: aload_0
    //   1175: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   1178: iload 28
    //   1180: i2f
    //   1181: iload 29
    //   1183: i2f
    //   1184: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   1187: aload_0
    //   1188: getfield 57	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:o	Landroid/graphics/Path;
    //   1191: iload 28
    //   1193: i2f
    //   1194: iload 17
    //   1196: i2f
    //   1197: invokevirtual 331	android/graphics/Path:lineTo	(FF)V
    //   1200: goto -398 -> 802
    //   1203: iload 20
    //   1205: ifge +190 -> 1395
    //   1208: aload_2
    //   1209: arraylength
    //   1210: iconst_1
    //   1211: isub
    //   1212: istore 4
    //   1214: iload 4
    //   1216: aload_2
    //   1217: arraylength
    //   1218: if_icmpge -1179 -> 39
    //   1221: aload_0
    //   1222: getfield 237	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:i	I
    //   1225: iload 18
    //   1227: iadd
    //   1228: istore 5
    //   1230: aload_0
    //   1231: getfield 237	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:i	I
    //   1234: iload 14
    //   1236: iadd
    //   1237: istore 6
    //   1239: aload_0
    //   1240: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   1243: getstatic 240	android/graphics/Paint$Align:LEFT	Landroid/graphics/Paint$Align;
    //   1246: invokevirtual 89	android/graphics/Paint:setTextAlign	(Landroid/graphics/Paint$Align;)V
    //   1249: aload_0
    //   1250: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   1253: getstatic 112	android/graphics/Paint$Style:FILL	Landroid/graphics/Paint$Style;
    //   1256: invokevirtual 116	android/graphics/Paint:setStyle	(Landroid/graphics/Paint$Style;)V
    //   1259: aload_0
    //   1260: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   1263: aload_0
    //   1264: getfield 91	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:e	Lcom/android/dazhihui/ui/widget/stockchart/KChartContainer;
    //   1267: invokevirtual 243	com/android/dazhihui/ui/widget/stockchart/KChartContainer:getTextColor	()I
    //   1270: invokevirtual 100	android/graphics/Paint:setColor	(I)V
    //   1273: aload_1
    //   1274: ldc_w 337
    //   1277: iload 6
    //   1279: i2f
    //   1280: iload 5
    //   1282: i2f
    //   1283: aload_0
    //   1284: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   1287: invokevirtual 120	android/graphics/Paint:getFontMetrics	()Landroid/graphics/Paint$FontMetrics;
    //   1290: getfield 126	android/graphics/Paint$FontMetrics:ascent	F
    //   1293: fsub
    //   1294: aload_0
    //   1295: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   1298: invokevirtual 154	android/graphics/Canvas:drawText	(Ljava/lang/String;FFLandroid/graphics/Paint;)V
    //   1301: aload_0
    //   1302: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   1305: ldc_w 337
    //   1308: iconst_0
    //   1309: ldc_w 337
    //   1312: invokevirtual 250	java/lang/String:length	()I
    //   1315: aload_0
    //   1316: getfield 52	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:n	Landroid/graphics/Rect;
    //   1319: invokevirtual 132	android/graphics/Paint:getTextBounds	(Ljava/lang/String;IILandroid/graphics/Rect;)V
    //   1322: aload_0
    //   1323: getfield 52	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:n	Landroid/graphics/Rect;
    //   1326: invokevirtual 253	android/graphics/Rect:width	()I
    //   1329: istore 7
    //   1331: aload_0
    //   1332: getfield 237	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:i	I
    //   1335: istore 8
    //   1337: aload_1
    //   1338: aload_2
    //   1339: iload 4
    //   1341: aaload
    //   1342: iconst_1
    //   1343: iaload
    //   1344: iconst_3
    //   1345: invokestatic 147	com/android/dazhihui/ui/widget/stockchart/az:g	(II)Ljava/lang/String;
    //   1348: iload 6
    //   1350: iload 7
    //   1352: iload 8
    //   1354: iadd
    //   1355: iadd
    //   1356: i2f
    //   1357: iload 5
    //   1359: i2f
    //   1360: aload_0
    //   1361: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   1364: invokevirtual 120	android/graphics/Paint:getFontMetrics	()Landroid/graphics/Paint$FontMetrics;
    //   1367: getfield 126	android/graphics/Paint$FontMetrics:ascent	F
    //   1370: fsub
    //   1371: aload_0
    //   1372: getfield 77	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:j	Landroid/graphics/Paint;
    //   1375: invokevirtual 154	android/graphics/Canvas:drawText	(Ljava/lang/String;FFLandroid/graphics/Paint;)V
    //   1378: aload_0
    //   1379: getfield 91	com/android/dazhihui/ui/widget/stockchart/KChartDDEView:e	Lcom/android/dazhihui/ui/widget/stockchart/KChartContainer;
    //   1382: aconst_null
    //   1383: checkcast 255	[[Ljava/lang/String;
    //   1386: aconst_null
    //   1387: invokevirtual 258	com/android/dazhihui/ui/widget/stockchart/KChartContainer:a	([[Ljava/lang/String;[I)V
    //   1390: aload_1
    //   1391: invokevirtual 160	android/graphics/Canvas:restore	()V
    //   1394: return
    //   1395: iload 20
    //   1397: iload 15
    //   1399: iadd
    //   1400: istore 4
    //   1402: goto -188 -> 1214
    //   1405: astore_3
    //   1406: iload 9
    //   1408: istore 7
    //   1410: goto -928 -> 482
    //   1413: astore_3
    //   1414: iload 9
    //   1416: istore 7
    //   1418: goto -936 -> 482
    //   1421: astore_3
    //   1422: iload 13
    //   1424: istore 11
    //   1426: goto -1029 -> 397
    //   1429: astore_3
    //   1430: iload 13
    //   1432: istore 11
    //   1434: goto -1037 -> 397
    //   1437: iload 4
    //   1439: istore 13
    //   1441: iload 8
    //   1443: istore 4
    //   1445: iload 13
    //   1447: istore 8
    //   1449: goto -805 -> 644
    //   1452: iconst_1
    //   1453: istore 11
    //   1455: goto -931 -> 524
    //   1458: iload 9
    //   1460: istore 11
    //   1462: iload 6
    //   1464: istore 9
    //   1466: iload 11
    //   1468: istore 6
    //   1470: goto -956 -> 514
    //   1473: iconst_1
    //   1474: istore 10
    //   1476: goto -1053 -> 423
    //   1479: goto -1417 -> 62
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1482	0	this	KChartDDEView
    //   0	1482	1	paramCanvas	Canvas
    //   30	1309	2	arrayOfInt1	int[][]
    //   47	10	3	arrayOfInt2	int[][]
    //   985	1	3	localException1	Exception
    //   1047	1	3	localException2	Exception
    //   1405	1	3	localException3	Exception
    //   1413	1	3	localException4	Exception
    //   1421	1	3	localException5	Exception
    //   1429	1	3	localException6	Exception
    //   106	1338	4	j	int
    //   140	1218	5	k	int
    //   112	1357	6	m	int
    //   151	1266	7	i1	int
    //   310	1138	8	i2	int
    //   295	1170	9	i3	int
    //   353	1122	10	i4	int
    //   381	1086	11	i5	int
    //   324	700	12	i6	int
    //   350	1096	13	i7	int
    //   118	1119	14	i8	int
    //   82	1318	15	i9	int
    //   604	190	16	i10	int
    //   611	584	17	i11	int
    //   129	1099	18	i12	int
    //   91	448	19	i13	int
    //   100	1300	20	i14	int
    //   221	813	21	i15	int
    //   228	781	22	i16	int
    //   314	17	23	i17	int
    //   320	225	24	i18	int
    //   347	772	25	i19	int
    //   402	720	26	i20	int
    //   409	700	27	i21	int
    //   678	514	28	i22	int
    //   687	495	29	i23	int
    // Exception table:
    //   from	to	target	type
    //   558	576	985	java/lang/Exception
    //   995	1019	1047	java/lang/Exception
    //   937	964	1405	java/lang/Exception
    //   445	466	1413	java/lang/Exception
    //   893	918	1421	java/lang/Exception
    //   364	383	1429	java/lang/Exception
  }
  
  private void e(Canvas paramCanvas)
  {
    this.f = this.e.getDataModel();
    int[][] arrayOfInt;
    if (this.f != null)
    {
      arrayOfInt = this.f.getKSupl();
      if (arrayOfInt != null) {}
    }
    else
    {
      return;
    }
    Object localObject2 = this.f.getKData();
    Object localObject1 = this.f.getKSuplH();
    if (arrayOfInt.length < localObject2.length)
    {
      arrayOfInt = com.android.dazhihui.d.n.a(arrayOfInt, localObject2.length);
      localObject1 = new int[arrayOfInt.length - 1];
    }
    for (;;)
    {
      paramCanvas.save();
      int j = this.e.getKLineSize();
      int i6 = this.e.getKLineWidth();
      int i1 = this.f.getKLineOffset();
      int i2;
      label119:
      int m;
      int i3;
      int k;
      if (j + i1 > arrayOfInt.length)
      {
        i2 = arrayOfInt.length;
        m = 0;
        j = 0;
        i3 = 60536;
        k = i1;
        label134:
        if (k >= i2) {
          break label257;
        }
        i3 = Math.max(arrayOfInt[k][1], i3);
        m = Math.min(arrayOfInt[k][1], m);
        if (k <= 0) {
          break label246;
        }
        localObject1[(k - 1)] = Math.abs(arrayOfInt[k][1] - arrayOfInt[(k - 1)][1]);
        if ((k < i1) || (k >= i2 - 1)) {
          break label1235;
        }
        j = Math.max(localObject1[(k - 1)], j);
      }
      label246:
      label257:
      label450:
      label584:
      label1225:
      label1228:
      label1235:
      for (;;)
      {
        k += 1;
        break label134;
        i2 = j + i1;
        break label119;
        localObject1[0] = 0;
        j = 0;
        continue;
        k = m + 5000;
        int i4 = i3 + 5000;
        localObject1 = b.g(i4, 2);
        localObject2 = b.g((i4 + k) / 2, 2);
        String str = b.g(k, 2);
        a(this.h, this.h, paramCanvas, (String)localObject1, (String)localObject2, str);
        int i5 = getWidth();
        m = getHeight();
        int i7 = getPaddingLeft();
        int i8 = getPaddingTop() + this.h;
        int i9 = getPaddingRight() + this.a;
        i3 = getPaddingBottom() + this.h;
        paramCanvas.clipRect(i7, i8, i5 - i9, m - i3);
        i4 += j * 2;
        float f1;
        if (i4 - k == 0)
        {
          j = 1;
          f1 = (m - (i8 + i3)) * 1.0F / j;
          if ((i4 != 5000) || (k != 5000)) {
            break label1228;
          }
        }
        for (i3 = 0;; i3 = k)
        {
          i4 = i1;
          int i10;
          if (i4 < i2)
          {
            i9 = i7 + (i4 - i1) * i6;
            if (i4 < i2 - 1)
            {
              j = (int)(getHeight() - (arrayOfInt[i4][1] - i3 + 5000) * f1);
              k = (int)(getHeight() - (arrayOfInt[(i4 + 1)][1] - i3 + 5000) * f1);
              this.j.setColor(this.q);
              paramCanvas.drawLine(i9, j, (i4 - i1 + 1) * i6 + i7, k, this.j);
            }
            j = 0;
            if (i4 == 0)
            {
              j = 0;
              i10 = Math.abs(j);
              m = 0;
              i5 = i6 / 2;
              k = m;
              if (i10 >= 0)
              {
                k = m;
                if (i10 < 50) {
                  k = i5 / 2;
                }
              }
              m = k;
              if (i10 >= 50)
              {
                m = k;
                if (i10 < 100) {
                  m = i5;
                }
              }
              k = m;
              if (i10 >= 100)
              {
                k = m;
                if (i10 < 200) {
                  k = i5 * 3 / 2;
                }
              }
              if (i10 >= 200) {
                k = i5 * 2;
              }
              if (k >= 1) {
                break label1225;
              }
              k = 1;
            }
          }
          for (;;)
          {
            i5 = (int)(getHeight() - (arrayOfInt[i4][1] + j - i3 + 5000) * f1);
            i10 = (int)(getHeight() - (arrayOfInt[i4][1] - i3 + 5000) * f1);
            m = Math.abs(i10 - i5);
            if (m == 0) {
              m = 1;
            }
            for (;;)
            {
              if (j <= 0)
              {
                this.j.setColor(this.r);
                if (k > 1)
                {
                  this.j.setStyle(Paint.Style.FILL);
                  paramCanvas.drawRect(i9 - k / 2, i10, k / 2 + i9, i10 + m, this.j);
                }
              }
              for (;;)
              {
                i4 += 1;
                break label450;
                j = i4 - k;
                break;
                if (arrayOfInt.length <= 1) {
                  break label584;
                }
                j = arrayOfInt[i4][1] - arrayOfInt[(i4 - 1)][1];
                break label584;
                paramCanvas.drawLine(i9, i10, i9, i5, this.j);
                continue;
                this.j.setColor(this.s);
                if (k > 1)
                {
                  this.j.setColor(this.s);
                  this.j.setStyle(Paint.Style.FILL);
                  paramCanvas.drawRect(i9 - k / 2, i5, k / 2 + i9, i5 + m, this.j);
                }
                else
                {
                  paramCanvas.drawLine(i9, i5, i9, i10, this.j);
                }
              }
              j = this.e.getScreenIndex();
              if (j < 0) {
                j = arrayOfInt.length - 1;
              }
              while (j < arrayOfInt.length)
              {
                k = this.i + i8;
                m = this.i + i7;
                this.j.setTextAlign(Paint.Align.LEFT);
                this.j.setStyle(Paint.Style.FILL);
                this.j.setColor(this.e.getTextColor());
                paramCanvas.drawText("资金流向:", m, k - this.j.getFontMetrics().ascent, this.j);
                this.j.getTextBounds("资金流向:", 0, "资金流向:".length(), this.n);
                i1 = this.n.width();
                i2 = this.i;
                paramCanvas.drawText(az.g(arrayOfInt[j][1] + 5000, 2), m + (i1 + i2), k - this.j.getFontMetrics().ascent, this.j);
                this.e.a((String[][])null, null);
                paramCanvas.restore();
                return;
                j += i1;
              }
              break;
            }
          }
        }
      }
    }
  }
  
  private void f(Canvas paramCanvas)
  {
    int k = -1;
    this.f = this.e.getDataModel();
    int[][] arrayOfInt1;
    int[][] arrayOfInt2;
    Object localObject;
    int j;
    if (this.f != null)
    {
      arrayOfInt1 = this.f.getBs();
      arrayOfInt2 = this.f.getBsTag();
      localObject = this.f.getKData();
      j = this.f.getKLineOffset();
      if ((arrayOfInt2 != null) && (localObject != null)) {}
    }
    else
    {
      return;
    }
    int m = this.e.getScreenIndex();
    int i2;
    int i1;
    if (m < 0)
    {
      j = localObject.length - 1;
      paramCanvas.save();
      i2 = getWidth();
      int i3 = getHeight();
      m = getPaddingLeft();
      i1 = getPaddingTop() + this.h;
      paramCanvas.clipRect(m, i1, i2 - getPaddingRight(), i3 - (getPaddingBottom() + this.h));
      i2 = m + 2;
      i1 = this.i + i1;
      this.j.setColor(this.t);
      this.j.setTextSize(this.g);
      this.j.setTextAlign(Paint.Align.LEFT);
      this.j.setStrokeWidth(this.h);
      this.j.setStyle(Paint.Style.FILL);
      paramCanvas.drawText("BS点: ", i2, i1 - this.j.getFontMetrics().ascent, this.j);
      this.j.getTextBounds("BS点: ", 0, "BS点: ".length(), this.n);
      i2 += this.n.width();
      if (arrayOfInt2.length > j)
      {
        if (arrayOfInt2[j][0] != 1) {
          break label1024;
        }
        if (j > 0) {
          k = arrayOfInt2[(j - 1)][0];
        }
        if (k != 0) {
          break label1017;
        }
        localObject = "B点";
        label322:
        paramCanvas.drawText((String)localObject, i2, i1 - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.n);
        k = this.n.width() + i2;
        paramCanvas.drawText(",明日收盘价<", k, i1 - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds(",明日收盘价<", 0, ",明日收盘价<".length(), this.n);
        k += this.n.width();
        this.j.setColor(this.u);
        localObject = az.g(arrayOfInt1[j][0], this.f.getmDecimalLen());
        paramCanvas.drawText((String)localObject, k, i1 - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.n);
        i2 = this.n.width();
        this.j.setColor(this.t);
        paramCanvas.drawText("出现S点", k + i2, i1 - this.j.getFontMetrics().ascent, this.j);
        i2 = m + 2;
        k = (int)(i1 + (this.j.getTextSize() + this.i));
        paramCanvas.drawText("短线: ", i2, k - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds("短线: ", 0, "短线: ".length(), this.n);
        i1 = i2 + this.n.width();
        if (arrayOfInt2[j][1] != 1) {
          break label1298;
        }
        paramCanvas.drawText("向上", i1, k - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds("向上", 0, "向上".length(), this.n);
        i1 += this.n.width();
        paramCanvas.drawText(",明日收盘价<", i1, k - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds(",明日收盘价<", 0, ",明日收盘价<".length(), this.n);
        i1 += this.n.width();
        this.j.setColor(this.u);
        localObject = az.g(arrayOfInt1[j][2], this.f.getmDecimalLen());
        paramCanvas.drawText((String)localObject, i1, k - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.n);
        i2 = this.n.width();
        this.j.setColor(this.t);
        paramCanvas.drawText("出现卖出机会", i1 + i2, k - this.j.getFontMetrics().ascent, this.j);
      }
    }
    for (;;)
    {
      k = (int)(k + (this.j.getTextSize() + this.i));
      paramCanvas.drawText("能量级别: " + az.g(arrayOfInt1[j][4], this.f.getmDecimalLen()) + "级", m + 2, k - this.j.getFontMetrics().ascent, this.j);
      this.e.a((String[][])null, null);
      paramCanvas.restore();
      return;
      j = m + j;
      break;
      label1017:
      localObject = "持股";
      break label322;
      label1024:
      if (j > 0) {
        k = arrayOfInt2[(j - 1)][0];
      }
      if (k == 1) {}
      for (localObject = "S点";; localObject = "持币")
      {
        paramCanvas.drawText((String)localObject, i2, i1 - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.n);
        k = this.n.width() + i2;
        paramCanvas.drawText(",若明日收盘价>", k, i1 - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds(",若明日收盘价>", 0, ",若明日收盘价>".length(), this.n);
        k += this.n.width();
        this.j.setColor(this.u);
        localObject = az.g(arrayOfInt1[j][1], this.f.getmDecimalLen());
        paramCanvas.drawText((String)localObject, k, i1 - this.j.getFontMetrics().ascent, this.j);
        this.j.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.n);
        i2 = this.n.width();
        this.j.setColor(this.t);
        paramCanvas.drawText("出现B点", k + i2, i1 - this.j.getFontMetrics().ascent, this.j);
        break;
      }
      label1298:
      paramCanvas.drawText("向下", i1, k - this.j.getFontMetrics().ascent, this.j);
      this.j.getTextBounds("向下", 0, "向下".length(), this.n);
      i1 += this.n.width();
      paramCanvas.drawText(",若明日收盘价>", i1, k - this.j.getFontMetrics().ascent, this.j);
      this.j.getTextBounds(",若明日收盘价>", 0, ",若明日收盘价>".length(), this.n);
      i1 += this.n.width();
      this.j.setColor(this.u);
      localObject = az.g(arrayOfInt1[j][3], this.f.getmDecimalLen());
      paramCanvas.drawText((String)localObject, i1, k - this.j.getFontMetrics().ascent, this.j);
      this.j.getTextBounds((String)localObject, 0, ((String)localObject).length(), this.n);
      i2 = this.n.width();
      this.j.setColor(this.t);
      paramCanvas.drawText("出现买入机会", i1 + i2, k - this.j.getFontMetrics().ascent, this.j);
    }
  }
  
  private void g(Canvas paramCanvas)
  {
    paramCanvas.save();
    int j = getPaddingLeft();
    int k = getPaddingTop();
    int m = this.h;
    int i1 = this.i;
    int i2 = this.i;
    this.j.setTextAlign(Paint.Align.LEFT);
    this.j.setStyle(Paint.Style.FILL);
    this.j.setColor(this.e.getTextColor());
    paramCanvas.drawText("该周期无数据", j + i2, k + m + i1 - this.j.getFontMetrics().ascent, this.j);
    paramCanvas.restore();
  }
  
  protected void a()
  {
    super.a();
    b(g.a().b());
    this.a = getResources().getDimensionPixelSize(2131230845);
    this.g = getResources().getDimensionPixelSize(2131231088);
    this.h = getResources().getDimensionPixelSize(2131230773);
    this.i = getResources().getDimensionPixelSize(2131230829);
    setOnClickListener(this);
  }
  
  protected void a(Canvas paramCanvas)
  {
    int j = getWidth();
    int k = getHeight();
    int m = getPaddingTop();
    int i1 = getPaddingLeft();
    int i2 = getPaddingRight();
    int i3 = getPaddingBottom();
    paramCanvas.save();
    this.j.setColor(this.k);
    this.j.setStyle(Paint.Style.STROKE);
    float f1 = this.j.getStrokeWidth();
    this.j.setStrokeWidth(getResources().getDimensionPixelSize(2131230773));
    if (getResources().getConfiguration().orientation == 1)
    {
      paramCanvas.drawLine(i1, m, j - i2, m, this.j);
      paramCanvas.drawLine(i1, k - i3, j - i2, k - i3, this.j);
    }
    for (;;)
    {
      this.j.setStrokeWidth(f1);
      paramCanvas.restore();
      return;
      paramCanvas.drawRect(i1, m, j - i2, k - i3, this.j);
    }
  }
  
  public void a(y paramy)
  {
    b(paramy);
    a(getWidth(), getHeight());
    postInvalidate();
  }
  
  public void a(n paramn)
  {
    if (this.d == paramn)
    {
      b();
      invalidate();
    }
  }
  
  public void a(s params)
  {
    if (params == s.g)
    {
      c();
      return;
    }
    setDDEModel(n.f);
  }
  
  public void b()
  {
    this.b = Integer.MIN_VALUE;
    this.c = Integer.MAX_VALUE;
    if (this.e == null) {}
    do
    {
      return;
      this.f = this.e.getDataModel();
    } while (this.f == null);
    int j = this.f.getKLineOffset();
    int[][] arrayOfInt2;
    int[][] arrayOfInt1;
    if (this.d == n.a)
    {
      arrayOfInt2 = this.f.getKDDX();
      arrayOfInt1 = arrayOfInt2;
      if (arrayOfInt2 != null)
      {
        arrayOfInt1 = arrayOfInt2;
        if (this.f.getKData() != null)
        {
          arrayOfInt1 = arrayOfInt2;
          if (arrayOfInt2.length < this.f.getKData().length) {
            arrayOfInt1 = com.android.dazhihui.d.n.a(arrayOfInt2, this.f.getKData().length);
          }
        }
      }
      if ((arrayOfInt1 != null) && (arrayOfInt1.length > j)) {
        while (j < arrayOfInt1.length)
        {
          this.b = Math.max(arrayOfInt1[j][1], this.b);
          this.c = Math.min(arrayOfInt1[j][1], this.c);
          j += 1;
        }
      }
    }
    else if (this.d == n.b)
    {
      arrayOfInt2 = this.f.getKDDY();
      arrayOfInt1 = arrayOfInt2;
      if (arrayOfInt2 != null)
      {
        arrayOfInt1 = arrayOfInt2;
        if (this.f.getKData() != null)
        {
          arrayOfInt1 = arrayOfInt2;
          if (arrayOfInt2.length < this.f.getKData().length) {
            arrayOfInt1 = com.android.dazhihui.d.n.a(arrayOfInt2, this.f.getKData().length);
          }
        }
      }
      if ((arrayOfInt1 != null) && (arrayOfInt1.length > j)) {
        while (j < arrayOfInt1.length)
        {
          this.b = Math.max(arrayOfInt1[j][1], this.b);
          this.c = Math.min(arrayOfInt1[j][1], this.c);
          j += 1;
        }
      }
    }
    else if (this.d == n.c)
    {
      arrayOfInt2 = this.f.getKDDZ();
      arrayOfInt1 = arrayOfInt2;
      if (arrayOfInt2 != null)
      {
        arrayOfInt1 = arrayOfInt2;
        if (this.f.getKData() != null)
        {
          arrayOfInt1 = arrayOfInt2;
          if (arrayOfInt2.length < this.f.getKData().length) {
            arrayOfInt1 = com.android.dazhihui.d.n.a(arrayOfInt2, this.f.getKData().length);
          }
        }
      }
      if ((arrayOfInt1 != null) && (arrayOfInt1.length > j))
      {
        while (j < arrayOfInt1.length)
        {
          this.b = Math.max(arrayOfInt1[j][1], this.b);
          this.c = Math.min(arrayOfInt1[j][1], this.c);
          j += 1;
        }
        if (this.b >= 0) {
          break label422;
        }
      }
    }
    label422:
    for (j = 0;; j = this.b)
    {
      this.b = j;
      invalidate();
      return;
    }
  }
  
  public n getDDEModel()
  {
    return this.d;
  }
  
  public void onClick(View paramView)
  {
    n localn;
    if (this.d != n.f)
    {
      localn = n.a;
      if (this.d != n.a) {
        break label50;
      }
      localn = n.b;
    }
    for (;;)
    {
      setDDEModel(localn);
      paramView.setTag(this.d);
      this.e.onClick(paramView);
      return;
      label50:
      if (this.d == n.b) {
        localn = n.c;
      } else if (this.d == n.c) {
        localn = n.d;
      } else if (this.d == n.d) {
        localn = n.e;
      } else if (this.d == n.e) {
        localn = n.a;
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    paramCanvas.save();
    if (this.e != null)
    {
      if (this.d != n.a) {
        break label37;
      }
      b(paramCanvas);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      label37:
      if (this.d == n.b) {
        c(paramCanvas);
      } else if (this.d == n.c) {
        d(paramCanvas);
      } else if (this.d == n.d) {
        e(paramCanvas);
      } else if (this.d == n.e) {
        f(paramCanvas);
      } else if (this.d == n.f) {
        g(paramCanvas);
      }
    }
  }
  
  public void setDDEModel(n paramn)
  {
    if (this.d != paramn)
    {
      this.d = paramn;
      if (this.d != n.f)
      {
        d locald = d.a();
        locald.a("kchartddevalue", paramn.ordinal());
        locald.g();
      }
      b();
      b(paramn);
      invalidate();
    }
  }
  
  public void setHolder(KChartContainer paramKChartContainer)
  {
    this.e = paramKChartContainer;
  }
  
  public void setRightDistance(int paramInt)
  {
    this.a = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\KChartDDEView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */