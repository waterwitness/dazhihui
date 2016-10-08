package com.g.a.b.e;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.g.a.b.a.i;
import com.g.a.c.e;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public abstract class d
  implements a
{
  protected Reference<View> a;
  protected boolean b;
  
  public d(View paramView)
  {
    this(paramView, true);
  }
  
  public d(View paramView, boolean paramBoolean)
  {
    if (paramView == null) {
      throw new IllegalArgumentException("view must not be null");
    }
    this.a = new WeakReference(paramView);
    this.b = paramBoolean;
  }
  
  public int a()
  {
    View localView = (View)this.a.get();
    ViewGroup.LayoutParams localLayoutParams;
    if (localView != null)
    {
      localLayoutParams = localView.getLayoutParams();
      if ((!this.b) || (localLayoutParams == null) || (localLayoutParams.width == -2)) {
        break label70;
      }
    }
    label70:
    for (int i = localView.getWidth();; i = 0)
    {
      int j = i;
      if (i <= 0)
      {
        j = i;
        if (localLayoutParams != null) {
          j = localLayoutParams.width;
        }
      }
      return j;
      return 0;
    }
  }
  
  protected abstract void a(Bitmap paramBitmap, View paramView);
  
  protected abstract void a(Drawable paramDrawable, View paramView);
  
  public boolean a(Bitmap paramBitmap)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      View localView = (View)this.a.get();
      if (localView != null)
      {
        a(paramBitmap, localView);
        return true;
      }
    }
    else
    {
      e.c("Can't set a bitmap into view. You should call ImageLoader on UI thread for it.", new Object[0]);
    }
    return false;
  }
  
  public boolean a(Drawable paramDrawable)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      View localView = (View)this.a.get();
      if (localView != null)
      {
        a(paramDrawable, localView);
        return true;
      }
    }
    else
    {
      e.c("Can't set a drawable into view. You should call ImageLoader on UI thread for it.", new Object[0]);
    }
    return false;
  }
  
  public int b()
  {
    View localView = (View)this.a.get();
    ViewGroup.LayoutParams localLayoutParams;
    if (localView != null)
    {
      localLayoutParams = localView.getLayoutParams();
      if ((!this.b) || (localLayoutParams == null) || (localLayoutParams.height == -2)) {
        break label70;
      }
    }
    label70:
    for (int i = localView.getHeight();; i = 0)
    {
      int j = i;
      if (i <= 0)
      {
        j = i;
        if (localLayoutParams != null) {
          j = localLayoutParams.height;
        }
      }
      return j;
      return 0;
    }
  }
  
  public i c()
  {
    return i.b;
  }
  
  public View d()
  {
    return (View)this.a.get();
  }
  
  public boolean e()
  {
    return this.a.get() == null;
  }
  
  public int f()
  {
    View localView = (View)this.a.get();
    if (localView == null) {
      return super.hashCode();
    }
    return localView.hashCode();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\e\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */