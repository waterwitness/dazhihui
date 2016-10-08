package com.android.thinkive.framework.displayingbitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class RecyclingImageView
  extends ImageView
{
  public RecyclingImageView(Context paramContext)
  {
    super(paramContext);
  }
  
  public RecyclingImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private static void notifyDrawable(Drawable paramDrawable, boolean paramBoolean)
  {
    if ((paramDrawable instanceof RecyclingBitmapDrawable)) {
      ((RecyclingBitmapDrawable)paramDrawable).setIsDisplayed(paramBoolean);
    }
    for (;;)
    {
      return;
      if ((paramDrawable instanceof LayerDrawable))
      {
        paramDrawable = (LayerDrawable)paramDrawable;
        int i = 0;
        int j = paramDrawable.getNumberOfLayers();
        while (i < j)
        {
          notifyDrawable(paramDrawable.getDrawable(i), paramBoolean);
          i += 1;
        }
      }
    }
  }
  
  protected void onDetachedFromWindow()
  {
    setImageDrawable(null);
    super.onDetachedFromWindow();
  }
  
  public void setImageDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = getDrawable();
    super.setImageDrawable(paramDrawable);
    notifyDrawable(paramDrawable, true);
    notifyDrawable(localDrawable, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\RecyclingImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */