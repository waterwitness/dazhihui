package com.tencent.av.opengl.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.tencent.av.opengl.glrenderer.GLCanvas;
import com.tencent.av.opengl.texture.BasicTexture;
import com.tencent.av.opengl.texture.BitmapTexture;
import com.tencent.av.opengl.texture.ResourceTexture;

public class GLView
{
  protected static final int FLAG_INVISIBLE = 1;
  protected static final int FLAG_LAYOUT_REQUESTED = 4;
  protected static final int FLAG_SET_MEASURED_SIZE = 2;
  public static final int INVISIBLE = 1;
  private static final String TAG = "GLView";
  public static final int VISIBLE = 0;
  protected Animation mAnimation;
  protected BasicTexture mBackground;
  protected int mBackgroundColor = -16777216;
  protected int mBackgroundResource = 0;
  protected final Rect mBounds = new Rect(0, 0, 0, 0);
  protected int mLastHeightSpec = -1;
  protected int mLastWidthSpec = -1;
  protected int mMeasuredHeight = 0;
  protected int mMeasuredWidth = 0;
  protected GLView.OnTouchListener mOnTouchListener;
  protected GLView.OnZOrderChangedListener mOnZOrderChangedListener;
  protected final Rect mPaddings = new Rect(0, 0, 0, 0);
  protected GLView mParent;
  protected GLRootView mRootView;
  protected int mScrollHeight = 0;
  protected int mScrollWidth = 0;
  protected int mScrollX = 0;
  protected int mScrollY = 0;
  protected Transformation mTransformation;
  protected int mViewFlags = 0;
  protected int mZOrder = 0;
  
  public void attachToRoot(GLRootView paramGLRootView)
  {
    onAttachToRoot(paramGLRootView);
  }
  
  public void detachFromRoot()
  {
    onDetachFromRoot();
  }
  
  protected boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    if ((getVisibility() == 0) && (this.mOnTouchListener != null) && (this.mOnTouchListener.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return onTouchEvent(paramMotionEvent);
  }
  
  protected void finalize()
  {
    super.finalize();
    if (this.mBackground != null)
    {
      this.mBackground.recycle();
      this.mBackground = null;
      this.mBackgroundResource = 0;
    }
  }
  
  public int getBackgroundColor()
  {
    return this.mBackgroundColor;
  }
  
  public Rect getBounds()
  {
    return this.mBounds;
  }
  
  public boolean getBoundsOf(GLView paramGLView, Rect paramRect)
  {
    GLView localGLView = paramGLView;
    int i = 0;
    int j = 0;
    while (localGLView != this)
    {
      if (localGLView == null) {
        return false;
      }
      Rect localRect = localGLView.mBounds;
      j += localRect.left;
      i += localRect.top;
      localGLView = localGLView.mParent;
    }
    paramRect.set(j, i, paramGLView.getWidth() + j, paramGLView.getHeight() + i);
    return true;
  }
  
  public GLRootView getGLRootView()
  {
    return this.mRootView;
  }
  
  public int getHeight()
  {
    return this.mBounds.bottom - this.mBounds.top;
  }
  
  public int getMeasuredHeight()
  {
    return this.mMeasuredHeight;
  }
  
  public int getMeasuredWidth()
  {
    return this.mMeasuredWidth;
  }
  
  public Rect getPaddings()
  {
    return this.mPaddings;
  }
  
  public int getVisibility()
  {
    if ((this.mViewFlags & 0x1) == 0) {
      return 0;
    }
    return 1;
  }
  
  public int getWidth()
  {
    return this.mBounds.right - this.mBounds.left;
  }
  
  public int getZOrder()
  {
    return this.mZOrder;
  }
  
  public void invalidate()
  {
    GLRootView localGLRootView = getGLRootView();
    if (localGLRootView != null) {
      localGLRootView.requestRender();
    }
  }
  
  @SuppressLint({"WrongCall"})
  public void layout(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool = setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
    this.mViewFlags &= 0xFFFFFFFB;
    onLayout(bool, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void lockRendering()
  {
    if (this.mRootView != null) {
      this.mRootView.lockRenderThread();
    }
  }
  
  @SuppressLint({"WrongCall"})
  public void measure(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == this.mLastWidthSpec) && (paramInt2 == this.mLastHeightSpec) && ((this.mViewFlags & 0x4) == 0)) {}
    do
    {
      return;
      this.mLastWidthSpec = paramInt1;
      this.mLastHeightSpec = paramInt2;
      this.mViewFlags &= 0xFFFFFFFD;
      onMeasure(paramInt1, paramInt2);
    } while ((this.mViewFlags & 0x2) != 0);
    throw new IllegalStateException(getClass().getName() + " should call setMeasuredSize() in onMeasure()");
  }
  
  protected void onAttachToRoot(GLRootView paramGLRootView)
  {
    this.mRootView = paramGLRootView;
  }
  
  protected void onDetachFromRoot()
  {
    this.mRootView = null;
  }
  
  protected void onFirstDraw() {}
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  protected void onMeasure(int paramInt1, int paramInt2) {}
  
  protected boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  protected void onVisibilityChanged(int paramInt) {}
  
  protected void render(GLCanvas paramGLCanvas)
  {
    renderBackground(paramGLCanvas);
  }
  
  protected void renderBackground(GLCanvas paramGLCanvas)
  {
    if (this.mBackground != null)
    {
      i = getWidth();
      j = getHeight();
      this.mBackground.draw(paramGLCanvas, 0, 0, i, j);
      return;
    }
    int i = getWidth();
    int j = getHeight();
    paramGLCanvas.fillRect(0.0F, 0.0F, i, j, this.mBackgroundColor);
  }
  
  public void requestLayout()
  {
    this.mViewFlags |= 0x4;
    this.mLastHeightSpec = -1;
    this.mLastWidthSpec = -1;
    if (this.mParent != null) {
      this.mParent.requestLayout();
    }
    GLRootView localGLRootView;
    do
    {
      return;
      localGLRootView = getGLRootView();
    } while (localGLRootView == null);
    localGLRootView.requestLayoutContentPane();
  }
  
  public void setBackground(int paramInt)
  {
    ResourceTexture localResourceTexture = null;
    if ((paramInt != 0) && (paramInt == this.mBackgroundResource)) {
      return;
    }
    Object localObject = getGLRootView();
    if (localObject == null) {
      throw new RuntimeException("Cannot set resource background before attach to GLRootView!");
    }
    if (this.mBackground != null)
    {
      this.mBackground.recycle();
      this.mBackground = null;
    }
    localObject = ((GLRootView)localObject).getContext();
    if (paramInt == 0) {}
    for (;;)
    {
      this.mBackground = localResourceTexture;
      this.mBackgroundResource = paramInt;
      return;
      localResourceTexture = new ResourceTexture((Context)localObject, paramInt);
    }
  }
  
  public void setBackground(Bitmap paramBitmap)
  {
    if (paramBitmap == null) {
      return;
    }
    if (this.mBackground != null)
    {
      this.mBackground.recycle();
      this.mBackground = null;
    }
    this.mBackground = new BitmapTexture(paramBitmap);
    this.mBackgroundResource = 0;
  }
  
  public void setBackgroundColor(int paramInt)
  {
    this.mBackgroundColor = paramInt;
  }
  
  public boolean setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt3 - paramInt1 != this.mBounds.right - this.mBounds.left) || (paramInt4 - paramInt2 != this.mBounds.bottom - this.mBounds.top)) {}
    for (boolean bool = true;; bool = false)
    {
      this.mBounds.set(paramInt1, paramInt2, paramInt3, paramInt4);
      return bool;
    }
  }
  
  protected void setMeasuredSize(int paramInt1, int paramInt2)
  {
    this.mViewFlags |= 0x2;
    this.mMeasuredWidth = paramInt1;
    this.mMeasuredHeight = paramInt2;
  }
  
  public void setOnTouchListener(GLView.OnTouchListener paramOnTouchListener)
  {
    this.mOnTouchListener = paramOnTouchListener;
  }
  
  protected void setOnZOrderChangedListener(GLView.OnZOrderChangedListener paramOnZOrderChangedListener)
  {
    this.mOnZOrderChangedListener = paramOnZOrderChangedListener;
  }
  
  public void setPaddings(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mPaddings.set(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setRotation(int paramInt) {}
  
  public void setVisibility(int paramInt)
  {
    if (paramInt == getVisibility()) {
      return;
    }
    if (paramInt == 0) {}
    for (this.mViewFlags &= 0xFFFFFFFE;; this.mViewFlags |= 0x1)
    {
      onVisibilityChanged(paramInt);
      invalidate();
      return;
    }
  }
  
  public void setZOrder(int paramInt)
  {
    if (this.mZOrder != paramInt)
    {
      int i = this.mZOrder;
      this.mZOrder = paramInt;
      if (this.mOnZOrderChangedListener != null) {
        this.mOnZOrderChangedListener.OnZOrderChanged(this, paramInt, i);
      }
    }
  }
  
  public void startAnimation(Animation paramAnimation)
  {
    if (getGLRootView() == null) {
      throw new IllegalStateException();
    }
    this.mAnimation = paramAnimation;
    if (this.mAnimation != null) {
      this.mAnimation.start();
    }
    invalidate();
  }
  
  public void unlockRendering()
  {
    if (this.mRootView != null) {
      this.mRootView.unlockRenderThread();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\ui\GLView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */