package com.android.volley.toolbox;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

public class NetworkImageView
  extends ImageView
{
  private int mDefaultImageId;
  private int mErrorImageId;
  private ImageLoader.ImageContainer mImageContainer;
  private ImageLoader mImageLoader;
  private String mUrl;
  
  public NetworkImageView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public NetworkImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public NetworkImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }
  
  private void setDefaultImageOrNull()
  {
    if (this.mDefaultImageId != 0)
    {
      setImageResource(this.mDefaultImageId);
      return;
    }
    setImageBitmap(null);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    invalidate();
  }
  
  void loadImageIfNecessary(boolean paramBoolean)
  {
    int i1 = 1;
    int n = getWidth();
    int m = getHeight();
    ImageView.ScaleType localScaleType = getScaleType();
    int i;
    int j;
    label56:
    int k;
    if (getLayoutParams() != null) {
      if (getLayoutParams().width == -2)
      {
        i = 1;
        if (getLayoutParams().height != -2) {
          break label100;
        }
        j = 1;
        k = j;
        j = i;
        i = k;
      }
    }
    for (;;)
    {
      if ((j != 0) && (i != 0))
      {
        k = i1;
        label79:
        if ((n != 0) || (m != 0) || (k != 0)) {
          break label112;
        }
      }
      label100:
      label112:
      do
      {
        return;
        i = 0;
        break;
        j = 0;
        break label56;
        k = 0;
        break label79;
        if (TextUtils.isEmpty(this.mUrl))
        {
          if (this.mImageContainer != null)
          {
            this.mImageContainer.cancelRequest();
            this.mImageContainer = null;
          }
          setDefaultImageOrNull();
          return;
        }
        if ((this.mImageContainer == null) || (this.mImageContainer.getRequestUrl() == null)) {
          break label191;
        }
      } while (this.mImageContainer.getRequestUrl().equals(this.mUrl));
      this.mImageContainer.cancelRequest();
      setDefaultImageOrNull();
      label191:
      if (j != 0) {}
      for (j = 0;; j = n)
      {
        k = m;
        if (i != 0) {
          k = 0;
        }
        this.mImageContainer = this.mImageLoader.get(this.mUrl, new NetworkImageView.1(this, paramBoolean), j, k, localScaleType);
        return;
      }
      i = 0;
      j = 0;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    if (this.mImageContainer != null)
    {
      this.mImageContainer.cancelRequest();
      setImageBitmap(null);
      this.mImageContainer = null;
    }
    super.onDetachedFromWindow();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    loadImageIfNecessary(true);
  }
  
  public void setDefaultImageResId(int paramInt)
  {
    this.mDefaultImageId = paramInt;
  }
  
  public void setErrorImageResId(int paramInt)
  {
    this.mErrorImageId = paramInt;
  }
  
  public void setImageUrl(String paramString, ImageLoader paramImageLoader)
  {
    this.mUrl = paramString;
    this.mImageLoader = paramImageLoader;
    loadImageIfNecessary(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\toolbox\NetworkImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */