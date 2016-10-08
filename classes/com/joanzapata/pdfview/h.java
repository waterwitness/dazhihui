package com.joanzapata.pdfview;

import android.graphics.PointF;
import com.joanzapata.pdfview.d.d;
import com.joanzapata.pdfview.d.g;
import com.joanzapata.pdfview.d.i;

class h
  implements g, com.joanzapata.pdfview.d.h, i
{
  private PDFView a;
  private d b;
  private long c;
  private float d;
  private float e;
  private boolean f;
  private boolean g;
  
  public h(PDFView paramPDFView)
  {
    this.a = paramPDFView;
    this.f = false;
    this.g = paramPDFView.f();
    this.b = new d();
    this.b.a(this);
    this.b.a(this);
    this.b.a(this);
    paramPDFView.setOnTouchListener(this.b);
  }
  
  private boolean a(float paramFloat)
  {
    return Math.abs(paramFloat) > Math.abs(this.a.b(this.a.getOptimalPageWidth()) / 2.0F);
  }
  
  private boolean a(float paramFloat, long paramLong)
  {
    return (Math.abs(paramFloat) >= 50.0F) && (paramLong <= 250L);
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.c = System.currentTimeMillis();
    this.d = paramFloat1;
    this.e = paramFloat2;
  }
  
  public void a(float paramFloat, PointF paramPointF)
  {
    float f1 = this.a.getZoom() * paramFloat;
    if (f1 < 1.0F) {
      paramFloat = 1.0F / this.a.getZoom();
    }
    for (;;)
    {
      this.a.b(paramFloat, paramPointF);
      return;
      if (f1 > 10.0F) {
        paramFloat = 10.0F / this.a.getZoom();
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.b.a(this);
      return;
    }
    this.b.a(null);
  }
  
  public boolean a()
  {
    return this.a.c();
  }
  
  public void b(float paramFloat1, float paramFloat2)
  {
    if ((a()) || (this.f)) {
      this.a.b(paramFloat1, paramFloat2);
    }
  }
  
  public void b(boolean paramBoolean)
  {
    this.f = paramBoolean;
  }
  
  public void c(float paramFloat1, float paramFloat2)
  {
    long l1;
    long l2;
    if ((!a()) && (this.f))
    {
      if (!this.g) {
        break label85;
      }
      paramFloat1 = paramFloat2 - this.e;
      l1 = System.currentTimeMillis();
      l2 = this.c;
      if (paramFloat1 <= 0.0F) {
        break label95;
      }
    }
    label85:
    label95:
    for (int i = -1;; i = 1)
    {
      if ((!a(paramFloat1, l1 - l2)) && (!a(paramFloat1))) {
        break label100;
      }
      this.a.b(i + this.a.getCurrentPage());
      return;
      paramFloat1 -= this.d;
      break;
    }
    label100:
    this.a.b(this.a.getCurrentPage());
  }
  
  public void c(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void d(float paramFloat1, float paramFloat2)
  {
    if (a()) {
      this.a.e();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */