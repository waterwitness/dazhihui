package com.joanzapata.pdfview;

import android.graphics.RectF;

class j
  implements p
{
  int a = 0;
  
  public boolean a(int paramInt1, int paramInt2)
  {
    float f4 = this.b * paramInt2;
    float f5 = this.c * paramInt1;
    float f2 = this.b;
    float f3 = this.c;
    float f7 = 256.0F / f2;
    float f6 = 256.0F / f3;
    float f1 = f2;
    if (f4 + f2 > 1.0F) {
      f1 = 1.0F - f4;
    }
    f2 = f3;
    if (f5 + f3 > 1.0F) {
      f2 = 1.0F - f5;
    }
    f3 = f7 * f1;
    f6 *= f2;
    RectF localRectF = new RectF(f4, f5, f1 + f4, f2 + f5);
    if ((f3 != 0.0F) && (f6 != 0.0F) && (!PDFView.a(this.g).a(this.d, this.e, f3, f6, localRectF, this.a))) {
      PDFView.b(this.g).a(this.d, this.e, f3, f6, localRectF, false, this.a);
    }
    this.a += 1;
    return this.a < this.f;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */