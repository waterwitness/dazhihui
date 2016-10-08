package com.tencent.avsdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;

public class CircularImageButton
  extends MaskedImage
{
  private float mMask = 2.0F;
  
  public CircularImageButton(Context paramContext)
  {
    super(paramContext);
  }
  
  public CircularImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public CircularImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  public Bitmap createMask()
  {
    Bitmap localBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(1);
    localPaint.setColor(-16777216);
    float f1 = getWidth();
    float f2 = getHeight();
    localCanvas.drawOval(new RectF(this.mMask, this.mMask, f1 - this.mMask, f2 - this.mMask), localPaint);
    return localBitmap;
  }
  
  public void setMask(float paramFloat)
  {
    this.mMask = paramFloat;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\CircularImageButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */