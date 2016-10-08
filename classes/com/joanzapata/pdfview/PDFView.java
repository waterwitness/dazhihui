package com.joanzapata.pdfview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.joanzapata.pdfview.b.b;
import java.io.File;
import java.util.Iterator;
import java.util.Vector;

public class PDFView
  extends SurfaceView
{
  private static final String a = PDFView.class.getSimpleName();
  private com.joanzapata.pdfview.b.a A;
  private Paint B = new Paint();
  private Paint C;
  private Paint D = new Paint();
  private Paint E;
  private Paint F;
  private boolean G = false;
  private RectF H;
  private RectF I;
  private int J = 0;
  private boolean K = false;
  private boolean L = false;
  private e b = new e();
  private a c = new a(this);
  private h d = new h(this);
  private int[] e;
  private int[] f;
  private int[] g;
  private int h;
  private int i;
  private int j;
  private int k;
  private int l;
  private float m;
  private float n;
  private float o = 0.0F;
  private float p = 0.0F;
  private float q = 1.0F;
  private RectF r;
  private RectF s;
  private boolean t = true;
  private l u = l.a;
  private org.vudroid.a.a v;
  private g w;
  private m x;
  private b y;
  private com.joanzapata.pdfview.b.c z;
  
  public PDFView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.D.setStyle(Paint.Style.STROKE);
    this.E = new Paint();
    this.E.setStyle(Paint.Style.FILL);
    this.E.setColor(-16777216);
    this.E.setAlpha(50);
    this.F = new Paint();
    this.F.setStyle(Paint.Style.FILL);
    this.F.setColor(-16777216);
    this.F.setAlpha(50);
    setWillNotDraw(false);
  }
  
  private int a(int paramInt1, int paramInt2)
  {
    if (this.f != null) {
      if ((paramInt1 >= 0) && (paramInt1 < this.f.length)) {}
    }
    for (;;)
    {
      return 0;
      for (int i1 = this.f[paramInt1]; (i1 >= 0) && (paramInt1 < this.h); i1 = paramInt1)
      {
        if (!this.b.a(paramInt1, i1, (int)(this.m * 0.2F), (int)(this.n * 0.2F), new RectF(0.0F, 0.0F, 1.0F, 1.0F))) {
          this.x.a(paramInt1, i1, (int)(this.m * 0.2F), (int)(this.n * 0.2F), new RectF(0.0F, 0.0F, 1.0F, 1.0F), true, 0);
        }
        float f2 = 1.0F / this.m;
        float f1 = 1.0F / this.n * 256.0F / this.q;
        f2 = f2 * 256.0F / this.q;
        int i2 = (int)Math.ceil(1.0F / f1);
        int i3 = (int)Math.ceil(1.0F / f2);
        float f3 = 1.0F / i3;
        float f4 = 1.0F / i2;
        f1 = -this.o;
        f2 = getWidth() / 2 + f1;
        f1 = -this.p + getHeight() / 2;
        if (!this.L) {
          f2 -= paramInt1 * b(this.m);
        }
        for (;;)
        {
          f2 /= b(this.m);
          int i5 = (int)(f1 / b(this.n) * i2);
          int i4 = (int)(f2 * i3);
          i5 = com.joanzapata.pdfview.d.k.a(i5, 0, i2);
          i4 = com.joanzapata.pdfview.d.k.a(i4, 0, i3);
          j localj = new j(this, f3, f4, paramInt1, i1, paramInt2);
          new o(localj).a(i2, i3, i5, i4);
          return localj.a;
          f1 -= paramInt1 * b(this.n);
        }
      }
    }
  }
  
  private void a(Canvas paramCanvas)
  {
    paramCanvas.drawRect(this.H, this.E);
    paramCanvas.drawRect(this.I, this.F);
  }
  
  private void a(Canvas paramCanvas, com.joanzapata.pdfview.c.a parama)
  {
    RectF localRectF = parama.e();
    Bitmap localBitmap = parama.d();
    if (localBitmap == null) {
      return;
    }
    float f1;
    float f2;
    if (this.L)
    {
      f1 = b(parama.c() * this.n);
      f2 = 0.0F;
    }
    for (;;)
    {
      paramCanvas.translate(f2, f1);
      parama = new Rect(0, 0, localBitmap.getWidth(), localBitmap.getHeight());
      float f3 = b(localRectF.left * this.m);
      float f4 = b(localRectF.top * this.n);
      float f5 = b(localRectF.width() * this.m);
      float f6 = b(localRectF.height() * this.n);
      localRectF = new RectF((int)f3, (int)f4, (int)(f3 + f5), (int)(f6 + f4));
      f3 = this.o + f2;
      f4 = this.p + f1;
      if ((localRectF.left + f3 < getWidth()) && (f3 + localRectF.right > 0.0F) && (localRectF.top + f4 < getHeight()) && (localRectF.bottom + f4 > 0.0F)) {
        break;
      }
      paramCanvas.translate(-f2, -f1);
      return;
      f2 = b(parama.c() * this.m);
      f1 = 0.0F;
    }
    paramCanvas.drawBitmap(localBitmap, parama, localRectF, this.B);
    paramCanvas.translate(-f2, -f1);
  }
  
  private void a(Uri paramUri, b paramb)
  {
    a(paramUri, paramb, null);
  }
  
  private void a(Uri paramUri, b paramb, int[] paramArrayOfInt)
  {
    if (!this.t) {
      throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
    }
    if (paramArrayOfInt != null)
    {
      this.e = paramArrayOfInt;
      this.f = com.joanzapata.pdfview.d.a.a(this.e);
      this.g = com.joanzapata.pdfview.d.a.b(this.e);
    }
    this.y = paramb;
    this.w = new g(paramUri, this);
    this.w.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    this.x = new m(this);
    this.x.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
  }
  
  private int c(int paramInt)
  {
    int i1;
    if (paramInt <= 0) {
      i1 = 0;
    }
    do
    {
      do
      {
        return i1;
        if (this.e == null) {
          break;
        }
        i1 = paramInt;
      } while (paramInt < this.e.length);
      return this.e.length - 1;
      i1 = paramInt;
    } while (paramInt < this.h);
    return this.h - 1;
  }
  
  private float d(int paramInt)
  {
    if (this.L) {
      return -(paramInt * this.n) + (getHeight() / 2 - this.n / 2.0F);
    }
    return -(paramInt * this.m) + (getWidth() / 2 - this.m / 2.0F);
  }
  
  private void g()
  {
    if ((this.u == l.a) || (getWidth() == 0)) {
      return;
    }
    float f2 = getWidth();
    float f1 = getHeight();
    float f4 = this.k / this.l;
    float f3 = (float)Math.floor(f2 / f4);
    if (f3 > f1) {
      f2 = (float)Math.floor(f1 * f4);
    }
    for (;;)
    {
      this.m = f2;
      this.n = f1;
      j();
      h();
      return;
      f1 = f3;
    }
  }
  
  private void h()
  {
    float f1 = Math.min(200.0F / this.m, 200.0F / this.n);
    float f2 = this.m;
    float f3 = this.n;
    this.H = new RectF(getWidth() - 5 - f2 * f1, 5.0F, getWidth() - 5, f1 * f3 + 5.0F);
    i();
  }
  
  private void i()
  {
    if (this.H == null) {
      return;
    }
    if (this.q == 1.0F)
    {
      this.G = false;
      return;
    }
    float f1 = (-this.o - b(this.j * this.m)) / b(this.m) * this.H.width();
    float f2 = getWidth() / b(this.m);
    float f3 = this.H.width();
    float f4 = -this.p / b(this.n) * this.H.height();
    float f5 = getHeight() / b(this.n);
    float f6 = this.H.height();
    this.I = new RectF(this.H.left + f1, this.H.top + f4, f1 + this.H.left + f2 * f3, this.H.top + f4 + f5 * f6);
    this.I.intersect(this.H);
    this.G = true;
  }
  
  private void j()
  {
    this.r = new RectF(0.0F, 0.0F, getWidth() / 2 - b(this.m) / 2.0F, getHeight());
    this.s = new RectF(getWidth() / 2 + b(this.m) / 2.0F, 0.0F, getWidth(), getHeight());
  }
  
  private void setDefaultPage(int paramInt)
  {
    this.J = paramInt;
  }
  
  private void setOnDrawListener(com.joanzapata.pdfview.b.a parama)
  {
    this.A = parama;
  }
  
  private void setOnPageChangeListener(com.joanzapata.pdfview.b.c paramc)
  {
    this.z = paramc;
  }
  
  private void setUserWantsMinimap(boolean paramBoolean)
  {
    this.K = paramBoolean;
  }
  
  public k a(File paramFile)
  {
    if (!paramFile.exists()) {
      throw new com.joanzapata.pdfview.a.a(paramFile.getAbsolutePath() + "does not exist.");
    }
    return new k(this, Uri.fromFile(paramFile), null);
  }
  
  public void a()
  {
    if (this.x != null) {
      this.x.cancel(true);
    }
    if (this.w != null) {
      this.w.cancel(true);
    }
    this.b.d();
    this.t = true;
    this.u = l.a;
  }
  
  public void a(float paramFloat)
  {
    this.q = paramFloat;
    j();
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    float f3;
    float f2;
    float f1;
    if (this.L) {
      if (b(this.m) < getWidth())
      {
        f3 = getWidth() / 2 - b(this.m) / 2.0F;
        if (!c()) {
          break label289;
        }
        if (b(this.n) >= getHeight()) {
          break label177;
        }
        this.G = false;
        f2 = getHeight() / 2 - b((this.j + 0.5F) * this.n);
        f1 = f3;
      }
    }
    for (;;)
    {
      this.o = f1;
      this.p = f2;
      i();
      invalidate();
      return;
      if (paramFloat1 > 0.0F)
      {
        f3 = 0.0F;
        break;
      }
      f3 = paramFloat1;
      if (b(this.m) + paramFloat1 >= getWidth()) {
        break;
      }
      f3 = getWidth() - b(this.m);
      break;
      label177:
      this.G = true;
      if (b(this.j * this.n) + paramFloat2 > 0.0F)
      {
        f2 = -b(this.j * this.n);
        f1 = f3;
      }
      else
      {
        f1 = f3;
        f2 = paramFloat2;
        if (b((this.j + 1) * this.n) + paramFloat2 < getHeight())
        {
          f2 = getHeight() - b((this.j + 1) * this.n);
          f1 = f3;
          continue;
          label289:
          f2 = d(this.j + 1);
          paramFloat1 = d(this.j - 1);
          if (paramFloat2 < f2)
          {
            f1 = f3;
          }
          else
          {
            f1 = f3;
            f2 = paramFloat2;
            if (paramFloat2 > paramFloat1)
            {
              f2 = paramFloat1;
              f1 = f3;
              continue;
              if (b(this.n) < getHeight()) {
                f3 = getHeight() / 2 - b(this.n) / 2.0F;
              }
              for (;;)
              {
                if (c())
                {
                  if (b(this.m) < getWidth())
                  {
                    this.G = false;
                    f1 = getWidth() / 2 - b((this.j + 0.5F) * this.m);
                    f2 = f3;
                    break;
                    if (paramFloat2 > 0.0F)
                    {
                      f3 = 0.0F;
                      continue;
                    }
                    f3 = paramFloat2;
                    if (b(this.n) + paramFloat2 >= getHeight()) {
                      continue;
                    }
                    f3 = getHeight() - b(this.n);
                    continue;
                  }
                  this.G = true;
                  if (b(this.j * this.m) + paramFloat1 > 0.0F)
                  {
                    f1 = -b(this.j * this.m);
                    f2 = f3;
                    break;
                  }
                  f1 = paramFloat1;
                  f2 = f3;
                  if (b((this.j + 1) * this.m) + paramFloat1 >= getWidth()) {
                    break;
                  }
                  f1 = getWidth() - b((this.j + 1) * this.m);
                  f2 = f3;
                  break;
                }
              }
              f1 = d(this.j + 1);
              paramFloat2 = d(this.j - 1);
              if (paramFloat1 < f1)
              {
                f2 = f3;
              }
              else
              {
                f1 = paramFloat1;
                f2 = f3;
                if (paramFloat1 > paramFloat2)
                {
                  f1 = paramFloat2;
                  f2 = f3;
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void a(float paramFloat, PointF paramPointF)
  {
    float f1 = paramFloat / this.q;
    a(paramFloat);
    paramFloat = this.o;
    float f2 = this.p;
    a(paramFloat * f1 + (paramPointF.x - paramPointF.x * f1), paramPointF.y - f1 * paramPointF.y + f2 * f1);
  }
  
  public void a(int paramInt)
  {
    b(paramInt - 1);
  }
  
  public void a(com.joanzapata.pdfview.c.a parama)
  {
    if (parama.h()) {
      this.b.b(parama);
    }
    for (;;)
    {
      invalidate();
      return;
      this.b.a(parama);
    }
  }
  
  public void a(org.vudroid.a.a parama)
  {
    try
    {
      this.v = parama;
      this.h = parama.a();
      this.k = parama.a(0);
      this.l = parama.b(0);
      this.u = l.b;
      g();
      a(this.J);
      if (this.y != null) {
        this.y.a(this.h);
      }
      return;
    }
    catch (Exception parama)
    {
      for (;;) {}
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.d.b(paramBoolean);
  }
  
  public float b(float paramFloat)
  {
    return this.q * paramFloat;
  }
  
  public void b()
  {
    int i1 = 0;
    if ((this.m == 0.0F) || (this.n == 0.0F)) {
      return;
    }
    this.x.a();
    this.b.a();
    int i2 = this.i;
    if (this.g != null) {
      i2 = this.g[this.i];
    }
    int i3 = 0;
    while ((i3 <= 1) && (i1 < com.joanzapata.pdfview.d.c.a))
    {
      int i4 = i1 + a(i2 + i3, com.joanzapata.pdfview.d.c.a - i1);
      i1 = i4;
      if (i3 != 0)
      {
        i1 = i4;
        if (i4 < com.joanzapata.pdfview.d.c.a) {
          i1 = i4 + a(i2 - i3, com.joanzapata.pdfview.d.c.a - i4);
        }
      }
      i3 += 1;
    }
    invalidate();
  }
  
  public void b(float paramFloat1, float paramFloat2)
  {
    a(this.o + paramFloat1, this.p + paramFloat2);
  }
  
  public void b(float paramFloat, PointF paramPointF)
  {
    a(this.q * paramFloat, paramPointF);
  }
  
  void b(int paramInt)
  {
    this.u = l.c;
    int i1 = c(paramInt);
    this.i = i1;
    this.j = i1;
    paramInt = i1;
    if (this.g != null)
    {
      paramInt = i1;
      if (i1 >= 0)
      {
        paramInt = i1;
        if (i1 < this.g.length)
        {
          paramInt = this.g[i1];
          this.j = paramInt;
        }
      }
    }
    d();
    if (this.L) {
      this.c.b(this.p, d(paramInt));
    }
    for (;;)
    {
      b();
      if (this.z != null) {
        this.z.a(this.i + 1, getPageCount());
      }
      return;
      this.c.a(this.o, d(paramInt));
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.d.a(paramBoolean);
  }
  
  public boolean c()
  {
    return this.q != 1.0F;
  }
  
  public void d()
  {
    a(1.0F);
  }
  
  public void e()
  {
    this.c.c(this.q, 1.0F);
  }
  
  public boolean f()
  {
    return this.L;
  }
  
  public int getCurrentPage()
  {
    return this.i;
  }
  
  public float getCurrentXOffset()
  {
    return this.o;
  }
  
  public float getCurrentYOffset()
  {
    return this.p;
  }
  
  org.vudroid.a.a getDecodeService()
  {
    return this.v;
  }
  
  public float getOptimalPageWidth()
  {
    return this.m;
  }
  
  public int getPageCount()
  {
    if (this.e != null) {
      return this.e.length;
    }
    return this.h;
  }
  
  public float getZoom()
  {
    return this.q;
  }
  
  protected void onDetachedFromWindow()
  {
    a();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    paramCanvas.drawColor(-1);
    if (this.u != l.c) {}
    do
    {
      return;
      float f1 = this.o;
      float f2 = this.p;
      paramCanvas.translate(f1, f2);
      Iterator localIterator = this.b.c().iterator();
      while (localIterator.hasNext()) {
        a(paramCanvas, (com.joanzapata.pdfview.c.a)localIterator.next());
      }
      localIterator = this.b.b().iterator();
      while (localIterator.hasNext()) {
        a(paramCanvas, (com.joanzapata.pdfview.c.a)localIterator.next());
      }
      if (this.A != null)
      {
        paramCanvas.translate(b(this.j * this.m), 0.0F);
        this.A.a(paramCanvas, b(this.m), b(this.n), this.i);
        paramCanvas.translate(-b(this.j * this.m), 0.0F);
      }
      paramCanvas.translate(-f1, -f2);
      paramCanvas.drawRect(this.r, this.C);
      paramCanvas.drawRect(this.s, this.C);
    } while ((!this.K) || (!this.G));
    a(paramCanvas);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.c.a();
    g();
    b();
    if (this.L)
    {
      a(this.o, d(this.j));
      return;
    }
    a(d(this.j), this.p);
  }
  
  public void setSwipeVertical(boolean paramBoolean)
  {
    this.L = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\PDFView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */