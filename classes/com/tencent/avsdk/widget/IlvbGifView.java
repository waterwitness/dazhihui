package com.tencent.avsdk.widget;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import com.android.dazhihui.ui.widget.a.aa;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.adv.GifView;
import com.android.dazhihui.ui.widget.adv.z;

public class IlvbGifView
  extends GifView
{
  z gifCallBack = new IlvbGifView.3(this);
  aa imageLoadListener = new IlvbGifView.2(this);
  public boolean isShowAnmiation = false;
  Handler mHandler = new IlvbGifView.1(this);
  private Runnable runnable;
  
  public IlvbGifView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public IlvbGifView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }
  
  private void init()
  {
    this.isCarousel = false;
    setVisibility(8);
  }
  
  public void show(String paramString, Runnable paramRunnable)
  {
    this.isShowAnmiation = true;
    this.runnable = paramRunnable;
    r.a(getContext()).a(paramString, this.imageLoadListener);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\IlvbGifView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */