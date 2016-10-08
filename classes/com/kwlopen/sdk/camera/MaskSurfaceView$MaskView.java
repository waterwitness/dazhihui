package com.kwlopen.sdk.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.view.View;

class MaskSurfaceView$MaskView
  extends View
{
  private Paint linePaint = new Paint(1);
  private Paint rectPaint;
  
  public MaskSurfaceView$MaskView(MaskSurfaceView paramMaskSurfaceView, Context paramContext)
  {
    super(paramContext);
    this.linePaint.setTypeface(Typeface.DEFAULT_BOLD);
    this.linePaint.setColor(-16711936);
    this.linePaint.setStyle(Paint.Style.STROKE);
    this.linePaint.setStrokeWidth(5.0F);
    this.linePaint.setAlpha(180);
    this.rectPaint = new Paint(1);
    this.rectPaint.setColor(-16777216);
    this.rectPaint.setStyle(Paint.Style.FILL);
    this.rectPaint.setAlpha(80);
    paramMaskSurfaceView.maskWidth = (paramMaskSurfaceView.width * 0.9F);
    paramMaskSurfaceView.maskHeight = (paramMaskSurfaceView.maskWidth * 0.63F);
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if ((this.this$0.maskHeight == 0.0F) && (this.this$0.maskWidth == 0.0F)) {}
    while ((this.this$0.maskHeight == this.this$0.height) || (this.this$0.maskWidth == this.this$0.width)) {
      return;
    }
    float f1 = Math.abs((this.this$0.height - this.this$0.maskHeight) / 2.0F);
    float f2 = Math.abs((this.this$0.width - this.this$0.maskWidth) / 2.0F);
    paramCanvas.drawRect(0.0F, 0.0F, this.this$0.width, f1, this.rectPaint);
    paramCanvas.drawRect(this.this$0.width - f2, f1, this.this$0.width, this.this$0.height - f1, this.rectPaint);
    paramCanvas.drawRect(0.0F, this.this$0.height - f1, this.this$0.width, this.this$0.height, this.rectPaint);
    paramCanvas.drawRect(0.0F, f1, f2, f1 + this.this$0.maskHeight, this.rectPaint);
    paramCanvas.drawRect(f2, f1, f2 + this.this$0.maskWidth, f1 + this.this$0.maskHeight, this.linePaint);
    super.onDraw(paramCanvas);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\camera\MaskSurfaceView$MaskView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */