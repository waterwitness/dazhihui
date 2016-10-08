package com.android.dazhihui.ui.widget.a;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.lang.ref.WeakReference;

class u
  extends BitmapDrawable
{
  private final WeakReference<w> b;
  
  public u(r paramr, Resources paramResources, Bitmap paramBitmap, w paramw)
  {
    super(paramResources, paramBitmap);
    this.b = new WeakReference(paramw);
  }
  
  public w a()
  {
    return (w)this.b.get();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */