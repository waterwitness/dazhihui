package com.tencent.av.opengl.ui;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.tencent.av.opengl.glrenderer.GLCanvas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GLViewGroup
  extends GLView
{
  private static final String TAG = "GLViewGroup";
  protected final Rect mBounds = new Rect();
  private ArrayList<GLView> mChildren;
  private GLView mMotionTarget;
  private GLView.OnZOrderChangedListener mOnZOrderChangedListener = new GLViewGroup.1(this);
  protected final Rect mPaddings = new Rect();
  private Comparator<GLView> mSortComparator = new GLViewGroup.SortComparator(this);
  
  public void addView(GLView paramGLView)
  {
    if (paramGLView.mParent != null) {
      throw new IllegalStateException();
    }
    if (this.mChildren == null) {
      this.mChildren = new ArrayList();
    }
    this.mChildren.add(paramGLView);
    paramGLView.mParent = this;
    paramGLView.setOnZOrderChangedListener(this.mOnZOrderChangedListener);
    Collections.sort(this.mChildren, this.mSortComparator);
    if (this.mRootView != null) {
      paramGLView.onAttachToRoot(this.mRootView);
    }
  }
  
  protected boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    int j = (int)paramMotionEvent.getX();
    int k = (int)paramMotionEvent.getY();
    int i = paramMotionEvent.getAction();
    Object localObject;
    if (this.mMotionTarget != null)
    {
      if (i == 0)
      {
        localObject = MotionEvent.obtain(paramMotionEvent);
        ((MotionEvent)localObject).setAction(3);
        dispatchTouchEvent((MotionEvent)localObject, j, k, this.mMotionTarget, false);
        this.mMotionTarget = null;
      }
    }
    else
    {
      if (i != 0) {
        break label148;
      }
      i = getChildCount() - 1;
      if (i < 0) {
        break label148;
      }
      localObject = getChild(i);
      if (((GLView)localObject).getVisibility() == 0) {
        break label127;
      }
    }
    label127:
    while (!dispatchTouchEvent(paramMotionEvent, j, k, (GLView)localObject, true))
    {
      i -= 1;
      break;
      dispatchTouchEvent(paramMotionEvent, j, k, this.mMotionTarget, false);
      if ((i == 3) || (i == 1)) {
        this.mMotionTarget = null;
      }
      return true;
    }
    this.mMotionTarget = ((GLView)localObject);
    return true;
    label148:
    return super.dispatchTouchEvent(paramMotionEvent);
  }
  
  protected boolean dispatchTouchEvent(MotionEvent paramMotionEvent, int paramInt1, int paramInt2, GLView paramGLView, boolean paramBoolean)
  {
    Rect localRect = paramGLView.mBounds;
    if ((!paramBoolean) || (localRect.contains(paramInt1, paramInt2)))
    {
      if (paramGLView.dispatchTouchEvent(paramMotionEvent)) {}
      while ((this.mOnTouchListener != null) && (this.mOnTouchListener.onTouch(paramGLView, paramMotionEvent))) {
        return true;
      }
    }
    return false;
  }
  
  public GLView getChild(int paramInt)
  {
    if ((this.mChildren == null) || (paramInt < 0) || (paramInt >= this.mChildren.size())) {
      throw new ArrayIndexOutOfBoundsException(paramInt);
    }
    return (GLView)this.mChildren.get(paramInt);
  }
  
  public int getChildCount()
  {
    if (this.mChildren == null) {
      return 0;
    }
    return this.mChildren.size();
  }
  
  protected void onAttachToRoot(GLRootView paramGLRootView)
  {
    this.mRootView = paramGLRootView;
    int i = 0;
    int j = getChildCount();
    while (i < j)
    {
      getChild(i).onAttachToRoot(paramGLRootView);
      i += 1;
    }
  }
  
  protected void onDetachFromRoot()
  {
    int i = 0;
    int j = getChildCount();
    while (i < j)
    {
      getChild(i).onDetachFromRoot();
      i += 1;
    }
    this.mRootView = null;
  }
  
  protected void onVisibilityChanged(int paramInt)
  {
    int i = 0;
    int j = getChildCount();
    while (i < j)
    {
      GLView localGLView = getChild(i);
      if (localGLView.getVisibility() == 0) {
        localGLView.onVisibilityChanged(paramInt);
      }
      i += 1;
    }
  }
  
  public void removeAllView()
  {
    int j = getChildCount();
    int i = 0;
    while (i < j)
    {
      GLView localGLView = (GLView)this.mChildren.get(i);
      if (this.mMotionTarget == localGLView)
      {
        long l = SystemClock.uptimeMillis();
        MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        dispatchTouchEvent(localMotionEvent);
        localMotionEvent.recycle();
      }
      localGLView.onDetachFromRoot();
      localGLView.mParent = null;
      localGLView.setOnZOrderChangedListener(null);
      i += 1;
    }
    this.mChildren.clear();
  }
  
  public boolean removeView(GLView paramGLView)
  {
    if (this.mChildren == null) {}
    while (!this.mChildren.remove(paramGLView)) {
      return false;
    }
    if (this.mMotionTarget == paramGLView)
    {
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      dispatchTouchEvent(localMotionEvent);
      localMotionEvent.recycle();
    }
    paramGLView.onDetachFromRoot();
    paramGLView.mParent = null;
    paramGLView.setOnZOrderChangedListener(null);
    Collections.sort(this.mChildren, this.mSortComparator);
    return true;
  }
  
  protected void render(GLCanvas paramGLCanvas)
  {
    renderBackground(paramGLCanvas);
    int i = 0;
    int j = getChildCount();
    while (i < j)
    {
      renderChild(paramGLCanvas, getChild(i));
      i += 1;
    }
  }
  
  protected void renderChild(GLCanvas paramGLCanvas, GLView paramGLView)
  {
    if ((paramGLView.getVisibility() != 0) && (paramGLView.mAnimation == null)) {
      return;
    }
    int i = paramGLView.mBounds.left - this.mScrollX;
    int j = paramGLView.mBounds.top - this.mScrollY;
    paramGLCanvas.translate(i, j);
    paramGLView.render(paramGLCanvas);
    paramGLCanvas.translate(-i, -j);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\opengl\ui\GLViewGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */