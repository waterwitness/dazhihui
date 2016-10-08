package org.apache.cordova;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;

public class LinearLayoutSoftKeyboardDetect
  extends LinearLayout
{
  private static final String TAG = "SoftKeyboardDetect";
  private CordovaActivity app = null;
  private int oldHeight = 0;
  private int oldWidth = 0;
  private int screenHeight = 0;
  private int screenWidth = 0;
  
  public LinearLayoutSoftKeyboardDetect(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext);
    this.screenWidth = paramInt1;
    this.screenHeight = paramInt2;
    this.app = ((CordovaActivity)paramContext);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    LOG.v("SoftKeyboardDetect", "We are in our onMeasure method");
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    LOG.v("SoftKeyboardDetect", "Old Height = %d", new Object[] { Integer.valueOf(this.oldHeight) });
    LOG.v("SoftKeyboardDetect", "Height = %d", new Object[] { Integer.valueOf(paramInt2) });
    LOG.v("SoftKeyboardDetect", "Old Width = %d", new Object[] { Integer.valueOf(this.oldWidth) });
    LOG.v("SoftKeyboardDetect", "Width = %d", new Object[] { Integer.valueOf(paramInt1) });
    if ((this.oldHeight == 0) || (this.oldHeight == paramInt2)) {
      LOG.d("SoftKeyboardDetect", "Ignore this event");
    }
    for (;;)
    {
      this.oldHeight = paramInt2;
      this.oldWidth = paramInt1;
      return;
      if (this.screenHeight == paramInt1)
      {
        int i = this.screenHeight;
        this.screenHeight = this.screenWidth;
        this.screenWidth = i;
        LOG.v("SoftKeyboardDetect", "Orientation Change");
      }
      else if (paramInt2 > this.oldHeight)
      {
        if (this.app != null) {
          this.app.appView.sendJavascript("cordova.fireDocumentEvent('hidekeyboard');");
        }
      }
      else if ((paramInt2 < this.oldHeight) && (this.app != null))
      {
        this.app.appView.sendJavascript("cordova.fireDocumentEvent('showkeyboard');");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\LinearLayoutSoftKeyboardDetect.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */