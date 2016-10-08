package com.android.dazhihui.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;

public class q
{
  public static Drawable a(Context paramContext, int paramInt)
  {
    paramContext = paramContext.getResources().getDrawable(paramInt);
    paramContext.clearColorFilter();
    return paramContext;
  }
  
  public static Drawable a(Context paramContext, int paramInt1, int paramInt2)
  {
    paramContext = paramContext.getResources().getDrawable(paramInt1);
    paramContext.setColorFilter(paramInt2, PorterDuff.Mode.SRC_IN);
    return paramContext;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */