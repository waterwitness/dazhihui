package com.android.dazhihui.ui.widget;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

class j
  extends Animation
{
  private final float b;
  private final float c;
  private float d;
  private float e;
  private final boolean f;
  private final boolean g;
  private Camera h;
  
  public j(AutoTextView paramAutoTextView, float paramFloat1, float paramFloat2, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.b = paramFloat1;
    this.c = paramFloat2;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
  }
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    float f1 = this.b;
    float f2 = this.c;
    float f3 = this.d;
    float f4 = this.e;
    Camera localCamera = this.h;
    int i;
    if (this.g)
    {
      i = 1;
      paramTransformation = paramTransformation.getMatrix();
      localCamera.save();
      if (!this.f) {
        break label126;
      }
      localCamera.translate(0.0F, i * this.e * (paramFloat - 1.0F), 0.0F);
    }
    for (;;)
    {
      localCamera.rotateX((f2 - f1) * paramFloat + f1);
      localCamera.getMatrix(paramTransformation);
      localCamera.restore();
      paramTransformation.preTranslate(-f3, -f4);
      paramTransformation.postTranslate(f3, f4);
      return;
      i = -1;
      break;
      label126:
      localCamera.translate(0.0F, i * this.e * paramFloat, 0.0F);
    }
  }
  
  public void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
    this.h = new Camera();
    this.e = this.a.getHeight();
    this.d = this.a.getWidth();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */