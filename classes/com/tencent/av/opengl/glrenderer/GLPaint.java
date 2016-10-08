package com.tencent.av.opengl.glrenderer;

import junit.framework.Assert;

public class GLPaint
{
  private int mColor = 0;
  private float mLineWidth = 1.0F;
  
  public int getColor()
  {
    return this.mColor;
  }
  
  public float getLineWidth()
  {
    return this.mLineWidth;
  }
  
  public void setColor(int paramInt)
  {
    this.mColor = paramInt;
  }
  
  public void setLineWidth(float paramFloat)
  {
    if (paramFloat >= 0.0F) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      this.mLineWidth = paramFloat;
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\glrenderer\GLPaint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */