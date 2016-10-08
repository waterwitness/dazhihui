package com.joanzapata.pdfview;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;

class a
{
  private PDFView a;
  private ValueAnimator b;
  
  public a(PDFView paramPDFView)
  {
    this.a = paramPDFView;
  }
  
  public void a()
  {
    if (this.b != null)
    {
      this.b.cancel();
      this.b = null;
    }
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    if (this.b != null) {
      this.b.cancel();
    }
    this.b = ValueAnimator.ofFloat(new float[] { paramFloat1, paramFloat2 });
    this.b.setInterpolator(new DecelerateInterpolator());
    this.b.addUpdateListener(new b(this));
    this.b.setDuration(400L);
    this.b.start();
  }
  
  public void b(float paramFloat1, float paramFloat2)
  {
    if (this.b != null) {
      this.b.cancel();
    }
    this.b = ValueAnimator.ofFloat(new float[] { paramFloat1, paramFloat2 });
    this.b.setInterpolator(new DecelerateInterpolator());
    this.b.addUpdateListener(new c(this));
    this.b.setDuration(400L);
    this.b.start();
  }
  
  public void c(float paramFloat1, float paramFloat2)
  {
    if (this.b != null) {
      this.b.cancel();
    }
    this.b = ValueAnimator.ofFloat(new float[] { paramFloat1, paramFloat2 });
    this.b.setInterpolator(new DecelerateInterpolator());
    d locald = new d(this);
    this.b.addUpdateListener(locald);
    this.b.addListener(locald);
    this.b.setDuration(400L);
    this.b.start();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */