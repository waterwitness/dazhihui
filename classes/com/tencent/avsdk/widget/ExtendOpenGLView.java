package com.tencent.avsdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import com.tencent.av.opengl.ui.GLRootView;

public class ExtendOpenGLView
  extends GLRootView
{
  private String TAG = "ilvb";
  
  public ExtendOpenGLView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ExtendOpenGLView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Log.d(this.TAG, getClass().getName() + " onSizeChanged w=" + paramInt1 + " h=" + paramInt2 + " oldw=" + paramInt3 + " oldh=" + paramInt4);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\ExtendOpenGLView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */