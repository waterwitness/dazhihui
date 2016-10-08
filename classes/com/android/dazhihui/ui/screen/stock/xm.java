package com.android.dazhihui.ui.screen.stock;

import android.graphics.BitmapFactory;
import com.android.dazhihui.ui.widget.TouchImageView;
import com.android.dazhihui.ui.widget.a.aa;

class xm
  implements aa
{
  xm(ZoomImageScreen paramZoomImageScreen, TouchImageView paramTouchImageView) {}
  
  public void loadOver(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      ZoomImageScreen.a(this.b, paramArrayOfByte);
      this.a.setVisibility(0);
      this.a.setImageBitmap(BitmapFactory.decodeByteArray(paramArrayOfByte, 0, paramArrayOfByte.length));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\xm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */