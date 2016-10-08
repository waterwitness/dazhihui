package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.widget.q;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ViewPager
  extends ViewGroup
{
  private static final int CLOSE_ENOUGH = 2;
  private static final Comparator<dc> COMPARATOR = new cy();
  private static final boolean DEBUG = false;
  private static final int DEFAULT_GUTTER_SIZE = 16;
  private static final int DEFAULT_OFFSCREEN_PAGES = 1;
  private static final int DRAW_ORDER_DEFAULT = 0;
  private static final int DRAW_ORDER_FORWARD = 1;
  private static final int DRAW_ORDER_REVERSE = 2;
  private static final int INVALID_POINTER = -1;
  private static final int[] LAYOUT_ATTRS = { 16842931 };
  private static final int MAX_SETTLE_DURATION = 600;
  private static final int MIN_DISTANCE_FOR_FLING = 25;
  private static final int MIN_FLING_VELOCITY = 400;
  public static final int SCROLL_STATE_DRAGGING = 1;
  public static final int SCROLL_STATE_IDLE = 0;
  public static final int SCROLL_STATE_SETTLING = 2;
  private static final String TAG = "ViewPager";
  private static final boolean USE_CACHE = false;
  private static final Interpolator sInterpolator = new cz();
  private static final dj sPositionComparator = new dj();
  private int mActivePointerId = -1;
  private ax mAdapter;
  private de mAdapterChangeListener;
  private int mBottomPageBounds;
  private boolean mCalledSuper;
  private int mChildHeightMeasureSpec;
  private int mChildWidthMeasureSpec;
  private int mCloseEnough;
  private int mCurItem;
  private int mDecorChildCount;
  private int mDefaultGutterSize;
  private int mDrawingOrder;
  private ArrayList<View> mDrawingOrderedChildren;
  private final Runnable mEndScrollRunnable = new da(this);
  private int mExpectedAdapterCount;
  private long mFakeDragBeginTime;
  private boolean mFakeDragging;
  private boolean mFirstLayout = true;
  private float mFirstOffset = -3.4028235E38F;
  private int mFlingDistance;
  private int mGutterSize;
  private boolean mInLayout;
  private float mInitialMotionX;
  private float mInitialMotionY;
  private df mInternalPageChangeListener;
  private boolean mIsBeingDragged;
  private boolean mIsUnableToDrag;
  private final ArrayList<dc> mItems = new ArrayList();
  private float mLastMotionX;
  private float mLastMotionY;
  private float mLastOffset = Float.MAX_VALUE;
  private q mLeftEdge;
  private Drawable mMarginDrawable;
  private int mMaximumVelocity;
  private int mMinimumVelocity;
  private boolean mNeedCalculatePageOffsets = false;
  private dh mObserver;
  private int mOffscreenPageLimit = 1;
  private df mOnPageChangeListener;
  private List<df> mOnPageChangeListeners;
  private int mPageMargin;
  private dg mPageTransformer;
  private boolean mPopulatePending;
  private Parcelable mRestoredAdapterState = null;
  private ClassLoader mRestoredClassLoader = null;
  private int mRestoredCurItem = -1;
  private q mRightEdge;
  private int mScrollState = 0;
  private Scroller mScroller;
  private boolean mScrollingCacheEnabled;
  private Method mSetChildrenDrawingOrderEnabled;
  private final dc mTempItem = new dc();
  private final Rect mTempRect = new Rect();
  private int mTopPageBounds;
  private int mTouchSlop;
  private VelocityTracker mVelocityTracker;
  
  public ViewPager(Context paramContext)
  {
    super(paramContext);
    initViewPager();
  }
  
  public ViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    initViewPager();
  }
  
  private void calculatePageOffsets(dc paramdc1, int paramInt, dc paramdc2)
  {
    int m = this.mAdapter.getCount();
    int i = getClientWidth();
    float f2;
    if (i > 0)
    {
      f2 = this.mPageMargin / i;
      if (paramdc2 == null) {
        break label409;
      }
      i = paramdc2.b;
      if (i < paramdc1.b)
      {
        f1 = paramdc2.e + paramdc2.d + f2;
        i += 1;
        j = 0;
      }
    }
    else
    {
      for (;;)
      {
        if ((i > paramdc1.b) || (j >= this.mItems.size())) {
          break label409;
        }
        for (paramdc2 = (dc)this.mItems.get(j);; paramdc2 = (dc)this.mItems.get(j))
        {
          k = i;
          f3 = f1;
          if (i <= paramdc2.b) {
            break;
          }
          k = i;
          f3 = f1;
          if (j >= this.mItems.size() - 1) {
            break;
          }
          j += 1;
        }
        f2 = 0.0F;
        break;
        while (k < paramdc2.b)
        {
          f3 += this.mAdapter.getPageWidth(k) + f2;
          k += 1;
        }
        paramdc2.e = f3;
        f1 = f3 + (paramdc2.d + f2);
        i = k + 1;
      }
    }
    if (i > paramdc1.b)
    {
      j = this.mItems.size() - 1;
      f1 = paramdc2.e;
      i -= 1;
      while ((i >= paramdc1.b) && (j >= 0))
      {
        for (paramdc2 = (dc)this.mItems.get(j);; paramdc2 = (dc)this.mItems.get(j))
        {
          k = i;
          f3 = f1;
          if (i >= paramdc2.b) {
            break;
          }
          k = i;
          f3 = f1;
          if (j <= 0) {
            break;
          }
          j -= 1;
        }
        while (k > paramdc2.b)
        {
          f3 -= this.mAdapter.getPageWidth(k) + f2;
          k -= 1;
        }
        f1 = f3 - (paramdc2.d + f2);
        paramdc2.e = f1;
        i = k - 1;
      }
    }
    label409:
    int k = this.mItems.size();
    float f3 = paramdc1.e;
    i = paramdc1.b - 1;
    if (paramdc1.b == 0)
    {
      f1 = paramdc1.e;
      this.mFirstOffset = f1;
      if (paramdc1.b != m - 1) {
        break label550;
      }
      f1 = paramdc1.e + paramdc1.d - 1.0F;
      label475:
      this.mLastOffset = f1;
      j = paramInt - 1;
      f1 = f3;
    }
    for (;;)
    {
      if (j < 0) {
        break label603;
      }
      paramdc2 = (dc)this.mItems.get(j);
      for (;;)
      {
        if (i > paramdc2.b)
        {
          f1 -= this.mAdapter.getPageWidth(i) + f2;
          i -= 1;
          continue;
          f1 = -3.4028235E38F;
          break;
          label550:
          f1 = Float.MAX_VALUE;
          break label475;
        }
      }
      f1 -= paramdc2.d + f2;
      paramdc2.e = f1;
      if (paramdc2.b == 0) {
        this.mFirstOffset = f1;
      }
      i -= 1;
      j -= 1;
    }
    label603:
    float f1 = paramdc1.e + paramdc1.d + f2;
    int j = paramdc1.b + 1;
    i = paramInt + 1;
    paramInt = j;
    while (i < k)
    {
      paramdc1 = (dc)this.mItems.get(i);
      while (paramInt < paramdc1.b)
      {
        f1 = this.mAdapter.getPageWidth(paramInt) + f2 + f1;
        paramInt += 1;
      }
      if (paramdc1.b == m - 1) {
        this.mLastOffset = (paramdc1.d + f1 - 1.0F);
      }
      paramdc1.e = f1;
      f1 += paramdc1.d + f2;
      paramInt += 1;
      i += 1;
    }
    this.mNeedCalculatePageOffsets = false;
  }
  
  private void completeScroll(boolean paramBoolean)
  {
    if (this.mScrollState == 2) {}
    int j;
    for (int i = 1;; i = 0)
    {
      if (i != 0)
      {
        setScrollingCacheEnabled(false);
        this.mScroller.abortAnimation();
        j = getScrollX();
        k = getScrollY();
        int m = this.mScroller.getCurrX();
        int n = this.mScroller.getCurrY();
        if ((j != m) || (k != n))
        {
          scrollTo(m, n);
          if (m != j) {
            pageScrolled(m);
          }
        }
      }
      this.mPopulatePending = false;
      int k = 0;
      j = i;
      i = k;
      while (i < this.mItems.size())
      {
        dc localdc = (dc)this.mItems.get(i);
        if (localdc.c)
        {
          localdc.c = false;
          j = 1;
        }
        i += 1;
      }
    }
    if (j != 0)
    {
      if (paramBoolean) {
        bn.a(this, this.mEndScrollRunnable);
      }
    }
    else {
      return;
    }
    this.mEndScrollRunnable.run();
  }
  
  private int determineTargetPage(int paramInt1, float paramFloat, int paramInt2, int paramInt3)
  {
    if ((Math.abs(paramInt3) > this.mFlingDistance) && (Math.abs(paramInt2) > this.mMinimumVelocity))
    {
      if (paramInt2 > 0) {}
      for (;;)
      {
        paramInt2 = paramInt1;
        if (this.mItems.size() > 0)
        {
          dc localdc1 = (dc)this.mItems.get(0);
          dc localdc2 = (dc)this.mItems.get(this.mItems.size() - 1);
          paramInt2 = Math.max(localdc1.b, Math.min(paramInt1, localdc2.b));
        }
        return paramInt2;
        paramInt1 += 1;
      }
    }
    if (paramInt1 >= this.mCurItem) {}
    for (float f = 0.4F;; f = 0.6F)
    {
      paramInt1 = (int)(f + (paramInt1 + paramFloat));
      break;
    }
  }
  
  private void dispatchOnPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    if (this.mOnPageChangeListener != null) {
      this.mOnPageChangeListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
    if (this.mOnPageChangeListeners != null)
    {
      int j = this.mOnPageChangeListeners.size();
      int i = 0;
      while (i < j)
      {
        df localdf = (df)this.mOnPageChangeListeners.get(i);
        if (localdf != null) {
          localdf.onPageScrolled(paramInt1, paramFloat, paramInt2);
        }
        i += 1;
      }
    }
    if (this.mInternalPageChangeListener != null) {
      this.mInternalPageChangeListener.onPageScrolled(paramInt1, paramFloat, paramInt2);
    }
  }
  
  private void dispatchOnPageSelected(int paramInt)
  {
    if (this.mOnPageChangeListener != null) {
      this.mOnPageChangeListener.onPageSelected(paramInt);
    }
    if (this.mOnPageChangeListeners != null)
    {
      int j = this.mOnPageChangeListeners.size();
      int i = 0;
      while (i < j)
      {
        df localdf = (df)this.mOnPageChangeListeners.get(i);
        if (localdf != null) {
          localdf.onPageSelected(paramInt);
        }
        i += 1;
      }
    }
    if (this.mInternalPageChangeListener != null) {
      this.mInternalPageChangeListener.onPageSelected(paramInt);
    }
  }
  
  private void dispatchOnScrollStateChanged(int paramInt)
  {
    if (this.mOnPageChangeListener != null) {
      this.mOnPageChangeListener.onPageScrollStateChanged(paramInt);
    }
    if (this.mOnPageChangeListeners != null)
    {
      int j = this.mOnPageChangeListeners.size();
      int i = 0;
      while (i < j)
      {
        df localdf = (df)this.mOnPageChangeListeners.get(i);
        if (localdf != null) {
          localdf.onPageScrollStateChanged(paramInt);
        }
        i += 1;
      }
    }
    if (this.mInternalPageChangeListener != null) {
      this.mInternalPageChangeListener.onPageScrollStateChanged(paramInt);
    }
  }
  
  private void enableLayers(boolean paramBoolean)
  {
    int k = getChildCount();
    int i = 0;
    if (i < k)
    {
      if (paramBoolean) {}
      for (int j = 2;; j = 0)
      {
        bn.a(getChildAt(i), j, null);
        i += 1;
        break;
      }
    }
  }
  
  private void endDrag()
  {
    this.mIsBeingDragged = false;
    this.mIsUnableToDrag = false;
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }
  
  private Rect getChildRectInPagerCoordinates(Rect paramRect, View paramView)
  {
    if (paramRect == null) {
      paramRect = new Rect();
    }
    for (;;)
    {
      if (paramView == null)
      {
        paramRect.set(0, 0, 0, 0);
        return paramRect;
      }
      paramRect.left = paramView.getLeft();
      paramRect.right = paramView.getRight();
      paramRect.top = paramView.getTop();
      paramRect.bottom = paramView.getBottom();
      for (paramView = paramView.getParent(); ((paramView instanceof ViewGroup)) && (paramView != this); paramView = paramView.getParent())
      {
        paramView = (ViewGroup)paramView;
        paramRect.left += paramView.getLeft();
        paramRect.right += paramView.getRight();
        paramRect.top += paramView.getTop();
        paramRect.bottom += paramView.getBottom();
      }
      return paramRect;
    }
  }
  
  private int getClientWidth()
  {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private dc infoForCurrentScrollPosition()
  {
    int i = getClientWidth();
    float f1;
    float f2;
    label36:
    float f4;
    float f3;
    int k;
    int j;
    Object localObject1;
    label53:
    Object localObject2;
    dc localdc;
    if (i > 0)
    {
      f1 = getScrollX() / i;
      if (i <= 0) {
        break label214;
      }
      f2 = this.mPageMargin / i;
      f4 = 0.0F;
      f3 = 0.0F;
      k = -1;
      i = 0;
      j = 1;
      localObject1 = null;
      localObject2 = localObject1;
      if (i < this.mItems.size())
      {
        localdc = (dc)this.mItems.get(i);
        if ((j != 0) || (localdc.b == k + 1)) {
          break label249;
        }
        localdc = this.mTempItem;
        localdc.e = (f4 + f3 + f2);
        localdc.b = (k + 1);
        localdc.d = this.mAdapter.getPageWidth(localdc.b);
        i -= 1;
      }
    }
    label214:
    label219:
    label249:
    for (;;)
    {
      f3 = localdc.e;
      f4 = localdc.d;
      if (j == 0)
      {
        localObject2 = localObject1;
        if (f1 < f3) {}
      }
      else
      {
        if ((f1 >= f4 + f3 + f2) && (i != this.mItems.size() - 1)) {
          break label219;
        }
        localObject2 = localdc;
      }
      return (dc)localObject2;
      f1 = 0.0F;
      break;
      f2 = 0.0F;
      break label36;
      k = localdc.b;
      f4 = localdc.d;
      j = 0;
      i += 1;
      localObject1 = localdc;
      break label53;
    }
  }
  
  private boolean isGutterDrag(float paramFloat1, float paramFloat2)
  {
    return ((paramFloat1 < this.mGutterSize) && (paramFloat2 > 0.0F)) || ((paramFloat1 > getWidth() - this.mGutterSize) && (paramFloat2 < 0.0F));
  }
  
  private void onSecondaryPointerUp(MotionEvent paramMotionEvent)
  {
    int i = ak.b(paramMotionEvent);
    if (ak.b(paramMotionEvent, i) == this.mActivePointerId) {
      if (i != 0) {
        break label56;
      }
    }
    label56:
    for (i = 1;; i = 0)
    {
      this.mLastMotionX = ak.c(paramMotionEvent, i);
      this.mActivePointerId = ak.b(paramMotionEvent, i);
      if (this.mVelocityTracker != null) {
        this.mVelocityTracker.clear();
      }
      return;
    }
  }
  
  private boolean pageScrolled(int paramInt)
  {
    boolean bool = false;
    if (this.mItems.size() == 0)
    {
      this.mCalledSuper = false;
      onPageScrolled(0, 0.0F, 0);
      if (!this.mCalledSuper) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
    }
    else
    {
      dc localdc = infoForCurrentScrollPosition();
      int j = getClientWidth();
      int k = this.mPageMargin;
      float f = this.mPageMargin / j;
      int i = localdc.b;
      f = (paramInt / j - localdc.e) / (localdc.d + f);
      paramInt = (int)((k + j) * f);
      this.mCalledSuper = false;
      onPageScrolled(i, f, paramInt);
      if (!this.mCalledSuper) {
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
      }
      bool = true;
    }
    return bool;
  }
  
  private boolean performDrag(float paramFloat)
  {
    int j = 1;
    boolean bool2 = false;
    boolean bool1 = false;
    float f1 = this.mLastMotionX;
    this.mLastMotionX = paramFloat;
    float f2 = getScrollX() + (f1 - paramFloat);
    int k = getClientWidth();
    paramFloat = k * this.mFirstOffset;
    f1 = k;
    float f3 = this.mLastOffset;
    dc localdc1 = (dc)this.mItems.get(0);
    dc localdc2 = (dc)this.mItems.get(this.mItems.size() - 1);
    if (localdc1.b != 0) {
      paramFloat = localdc1.e * k;
    }
    for (int i = 0;; i = 1)
    {
      if (localdc2.b != this.mAdapter.getCount() - 1)
      {
        f1 = localdc2.e * k;
        j = 0;
      }
      for (;;)
      {
        if (f2 < paramFloat)
        {
          f1 = paramFloat;
          if (i != 0)
          {
            bool1 = this.mLeftEdge.a(Math.abs(paramFloat - f2) / k);
            f1 = paramFloat;
          }
        }
        for (;;)
        {
          this.mLastMotionX += f1 - (int)f1;
          scrollTo((int)f1, getScrollY());
          pageScrolled((int)f1);
          return bool1;
          if (f2 > f1)
          {
            bool1 = bool2;
            if (j != 0) {
              bool1 = this.mRightEdge.a(Math.abs(f2 - f1) / k);
            }
          }
          else
          {
            f1 = f2;
          }
        }
        f1 *= f3;
      }
    }
  }
  
  private void recomputeScrollPosition(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if ((paramInt2 > 0) && (!this.mItems.isEmpty()))
    {
      int i = getPaddingLeft();
      int j = getPaddingRight();
      int k = getPaddingLeft();
      int m = getPaddingRight();
      f = getScrollX() / (paramInt2 - k - m + paramInt4);
      paramInt2 = (int)((paramInt1 - i - j + paramInt3) * f);
      scrollTo(paramInt2, getScrollY());
      if (!this.mScroller.isFinished())
      {
        paramInt3 = this.mScroller.getDuration();
        paramInt4 = this.mScroller.timePassed();
        localdc = infoForPosition(this.mCurItem);
        this.mScroller.startScroll(paramInt2, 0, (int)(localdc.e * paramInt1), 0, paramInt3 - paramInt4);
      }
      return;
    }
    dc localdc = infoForPosition(this.mCurItem);
    if (localdc != null) {}
    for (float f = Math.min(localdc.e, this.mLastOffset);; f = 0.0F)
    {
      paramInt1 = (int)(f * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 == getScrollX()) {
        break;
      }
      completeScroll(false);
      scrollTo(paramInt1, getScrollY());
      return;
    }
  }
  
  private void removeNonDecorViews()
  {
    int j;
    for (int i = 0; i < getChildCount(); i = j + 1)
    {
      j = i;
      if (!((ViewPager.LayoutParams)getChildAt(i).getLayoutParams()).a)
      {
        removeViewAt(i);
        j = i - 1;
      }
    }
  }
  
  private void requestParentDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    ViewParent localViewParent = getParent();
    if (localViewParent != null) {
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    }
  }
  
  private boolean resetTouch()
  {
    this.mActivePointerId = -1;
    endDrag();
    return this.mLeftEdge.c() | this.mRightEdge.c();
  }
  
  private void scrollToItem(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2)
  {
    dc localdc = infoForPosition(paramInt1);
    float f;
    if (localdc != null) {
      f = getClientWidth();
    }
    for (int i = (int)(Math.max(this.mFirstOffset, Math.min(localdc.e, this.mLastOffset)) * f);; i = 0)
    {
      if (paramBoolean1)
      {
        smoothScrollTo(i, 0, paramInt2);
        if (paramBoolean2) {
          dispatchOnPageSelected(paramInt1);
        }
        return;
      }
      if (paramBoolean2) {
        dispatchOnPageSelected(paramInt1);
      }
      completeScroll(false);
      scrollTo(i, 0);
      pageScrolled(i);
      return;
    }
  }
  
  private void setScrollState(int paramInt)
  {
    if (this.mScrollState == paramInt) {
      return;
    }
    this.mScrollState = paramInt;
    if (this.mPageTransformer != null) {
      if (paramInt == 0) {
        break label38;
      }
    }
    label38:
    for (boolean bool = true;; bool = false)
    {
      enableLayers(bool);
      dispatchOnScrollStateChanged(paramInt);
      return;
    }
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean)
  {
    if (this.mScrollingCacheEnabled != paramBoolean) {
      this.mScrollingCacheEnabled = paramBoolean;
    }
  }
  
  private void sortChildDrawingOrder()
  {
    if (this.mDrawingOrder != 0)
    {
      if (this.mDrawingOrderedChildren == null) {
        this.mDrawingOrderedChildren = new ArrayList();
      }
      for (;;)
      {
        int j = getChildCount();
        int i = 0;
        while (i < j)
        {
          View localView = getChildAt(i);
          this.mDrawingOrderedChildren.add(localView);
          i += 1;
        }
        this.mDrawingOrderedChildren.clear();
      }
      Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
    }
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int j = paramArrayList.size();
    int k = getDescendantFocusability();
    if (k != 393216)
    {
      int i = 0;
      while (i < getChildCount())
      {
        View localView = getChildAt(i);
        if (localView.getVisibility() == 0)
        {
          dc localdc = infoForChild(localView);
          if ((localdc != null) && (localdc.b == this.mCurItem)) {
            localView.addFocusables(paramArrayList, paramInt1, paramInt2);
          }
        }
        i += 1;
      }
    }
    if (((k == 262144) && (j != paramArrayList.size())) || (!isFocusable())) {}
    while ((((paramInt2 & 0x1) == 1) && (isInTouchMode()) && (!isFocusableInTouchMode())) || (paramArrayList == null)) {
      return;
    }
    paramArrayList.add(this);
  }
  
  dc addNewItem(int paramInt1, int paramInt2)
  {
    dc localdc = new dc();
    localdc.b = paramInt1;
    localdc.a = this.mAdapter.instantiateItem(this, paramInt1);
    localdc.d = this.mAdapter.getPageWidth(paramInt1);
    if ((paramInt2 < 0) || (paramInt2 >= this.mItems.size()))
    {
      this.mItems.add(localdc);
      return localdc;
    }
    this.mItems.add(paramInt2, localdc);
    return localdc;
  }
  
  public void addOnPageChangeListener(df paramdf)
  {
    if (this.mOnPageChangeListeners == null) {
      this.mOnPageChangeListeners = new ArrayList();
    }
    this.mOnPageChangeListeners.add(paramdf);
  }
  
  public void addTouchables(ArrayList<View> paramArrayList)
  {
    int i = 0;
    while (i < getChildCount())
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        dc localdc = infoForChild(localView);
        if ((localdc != null) && (localdc.b == this.mCurItem)) {
          localView.addTouchables(paramArrayList);
        }
      }
      i += 1;
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    if (!checkLayoutParams(paramLayoutParams)) {
      paramLayoutParams = generateLayoutParams(paramLayoutParams);
    }
    for (;;)
    {
      ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)paramLayoutParams;
      localLayoutParams.a |= paramView instanceof db;
      if (this.mInLayout)
      {
        if ((localLayoutParams != null) && (localLayoutParams.a)) {
          throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        localLayoutParams.d = true;
        addViewInLayout(paramView, paramInt, paramLayoutParams);
        return;
      }
      super.addView(paramView, paramInt, paramLayoutParams);
      return;
    }
  }
  
  public boolean arrowScroll(int paramInt)
  {
    View localView = findFocus();
    Object localObject;
    int j;
    boolean bool;
    if (localView == this)
    {
      localObject = null;
      localView = FocusFinder.getInstance().findNextFocus(this, (View)localObject, paramInt);
      if ((localView == null) || (localView == localObject)) {
        break label307;
      }
      if (paramInt != 17) {
        break label244;
      }
      i = getChildRectInPagerCoordinates(this.mTempRect, localView).left;
      j = getChildRectInPagerCoordinates(this.mTempRect, (View)localObject).left;
      if ((localObject != null) && (i >= j))
      {
        bool = pageLeft();
        label82:
        if (bool) {
          playSoundEffect(SoundEffectConstants.getContantForFocusDirection(paramInt));
        }
        return bool;
      }
    }
    else
    {
      if (localView == null) {
        break label353;
      }
      localObject = localView.getParent();
      if (!(localObject instanceof ViewGroup)) {
        break label358;
      }
      if (localObject != this) {}
    }
    label244:
    label307:
    label353:
    label358:
    for (int i = 1;; i = 0)
    {
      if (i == 0)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(localView.getClass().getSimpleName());
        localObject = localView.getParent();
        for (;;)
        {
          if ((localObject instanceof ViewGroup))
          {
            localStringBuilder.append(" => ").append(localObject.getClass().getSimpleName());
            localObject = ((ViewParent)localObject).getParent();
            continue;
            localObject = ((ViewParent)localObject).getParent();
            break;
          }
        }
        Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + localStringBuilder.toString());
        localObject = null;
        break;
        bool = localView.requestFocus();
        break label82;
        if (paramInt == 66)
        {
          i = getChildRectInPagerCoordinates(this.mTempRect, localView).left;
          j = getChildRectInPagerCoordinates(this.mTempRect, (View)localObject).left;
          if ((localObject != null) && (i <= j))
          {
            bool = pageRight();
            break label82;
          }
          bool = localView.requestFocus();
          break label82;
          if ((paramInt == 17) || (paramInt == 1))
          {
            bool = pageLeft();
            break label82;
          }
          if ((paramInt == 66) || (paramInt == 2))
          {
            bool = pageRight();
            break label82;
          }
        }
        bool = false;
        break label82;
      }
      localObject = localView;
      break;
    }
  }
  
  public boolean beginFakeDrag()
  {
    if (this.mIsBeingDragged) {
      return false;
    }
    this.mFakeDragging = true;
    setScrollState(1);
    this.mLastMotionX = 0.0F;
    this.mInitialMotionX = 0.0F;
    if (this.mVelocityTracker == null) {
      this.mVelocityTracker = VelocityTracker.obtain();
    }
    for (;;)
    {
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, 0.0F, 0.0F, 0);
      this.mVelocityTracker.addMovement(localMotionEvent);
      localMotionEvent.recycle();
      this.mFakeDragBeginTime = l;
      return true;
      this.mVelocityTracker.clear();
    }
  }
  
  protected boolean canScroll(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i;
    if ((paramView instanceof ViewGroup))
    {
      ViewGroup localViewGroup = (ViewGroup)paramView;
      int j = paramView.getScrollX();
      int k = paramView.getScrollY();
      i = localViewGroup.getChildCount() - 1;
      if (i >= 0)
      {
        localView = localViewGroup.getChildAt(i);
        if ((paramInt2 + j < localView.getLeft()) || (paramInt2 + j >= localView.getRight()) || (paramInt3 + k < localView.getTop()) || (paramInt3 + k >= localView.getBottom()) || (!canScroll(localView, true, paramInt1, paramInt2 + j - localView.getLeft(), paramInt3 + k - localView.getTop()))) {}
      }
    }
    while ((paramBoolean) && (bn.a(paramView, -paramInt1)))
    {
      View localView;
      return true;
      i -= 1;
      break;
    }
    return false;
  }
  
  public boolean canScrollHorizontally(int paramInt)
  {
    boolean bool2 = true;
    boolean bool1 = true;
    if (this.mAdapter == null) {}
    int i;
    int j;
    do
    {
      return false;
      i = getClientWidth();
      j = getScrollX();
      if (paramInt < 0)
      {
        if (j > (int)(i * this.mFirstOffset)) {}
        for (;;)
        {
          return bool1;
          bool1 = false;
        }
      }
    } while (paramInt <= 0);
    if (j < (int)(i * this.mLastOffset)) {}
    for (bool1 = bool2;; bool1 = false) {
      return bool1;
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof ViewPager.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void clearOnPageChangeListeners()
  {
    if (this.mOnPageChangeListeners != null) {
      this.mOnPageChangeListeners.clear();
    }
  }
  
  public void computeScroll()
  {
    if ((!this.mScroller.isFinished()) && (this.mScroller.computeScrollOffset()))
    {
      int i = getScrollX();
      int j = getScrollY();
      int k = this.mScroller.getCurrX();
      int m = this.mScroller.getCurrY();
      if ((i != k) || (j != m))
      {
        scrollTo(k, m);
        if (!pageScrolled(k))
        {
          this.mScroller.abortAnimation();
          scrollTo(0, m);
        }
      }
      bn.d(this);
      return;
    }
    completeScroll(true);
  }
  
  void dataSetChanged()
  {
    int i2 = this.mAdapter.getCount();
    this.mExpectedAdapterCount = i2;
    int i;
    int j;
    int k;
    int n;
    int m;
    label70:
    Object localObject;
    int i1;
    if ((this.mItems.size() < this.mOffscreenPageLimit * 2 + 1) && (this.mItems.size() < i2))
    {
      i = 1;
      j = this.mCurItem;
      k = 0;
      n = 0;
      m = i;
      i = j;
      j = k;
      k = n;
      if (k >= this.mItems.size()) {
        break label308;
      }
      localObject = (dc)this.mItems.get(k);
      n = this.mAdapter.getItemPosition(((dc)localObject).a);
      if (n != -1) {
        break label164;
      }
      n = k;
      i1 = j;
      k = m;
      j = i;
      i = i1;
      m = n;
    }
    for (;;)
    {
      n = k;
      i1 = j;
      k = m + 1;
      j = i;
      i = i1;
      m = n;
      break label70;
      i = 0;
      break;
      label164:
      if (n == -2)
      {
        this.mItems.remove(k);
        m = k - 1;
        k = j;
        if (j == 0)
        {
          this.mAdapter.startUpdate(this);
          k = 1;
        }
        this.mAdapter.destroyItem(this, ((dc)localObject).b, ((dc)localObject).a);
        if (this.mCurItem == ((dc)localObject).b)
        {
          j = Math.max(0, Math.min(this.mCurItem, i2 - 1));
          i = k;
          k = 1;
        }
      }
      else
      {
        if (((dc)localObject).b != n)
        {
          if (((dc)localObject).b == this.mCurItem) {
            i = n;
          }
          ((dc)localObject).b = n;
          n = i;
          i1 = 1;
          m = k;
          i = j;
          j = n;
          k = i1;
          continue;
          label308:
          if (j != 0) {
            this.mAdapter.finishUpdate(this);
          }
          Collections.sort(this.mItems, COMPARATOR);
          if (m != 0)
          {
            k = getChildCount();
            j = 0;
            while (j < k)
            {
              localObject = (ViewPager.LayoutParams)getChildAt(j).getLayoutParams();
              if (!((ViewPager.LayoutParams)localObject).a) {
                ((ViewPager.LayoutParams)localObject).c = 0.0F;
              }
              j += 1;
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
          }
          return;
        }
        n = i;
        i1 = m;
        m = k;
        i = j;
        j = n;
        k = i1;
        continue;
      }
      j = i;
      n = 1;
      i = k;
      k = n;
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    return (super.dispatchKeyEvent(paramKeyEvent)) || (executeKeyEvent(paramKeyEvent));
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramAccessibilityEvent.getEventType() == 4096)
    {
      bool1 = super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
      return bool1;
    }
    int j = getChildCount();
    int i = 0;
    for (;;)
    {
      bool1 = bool2;
      if (i >= j) {
        break;
      }
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        dc localdc = infoForChild(localView);
        if ((localdc != null) && (localdc.b == this.mCurItem) && (localView.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))) {
          return true;
        }
      }
      i += 1;
    }
  }
  
  float distanceInfluenceForSnapDuration(float paramFloat)
  {
    return (float)Math.sin((float)((paramFloat - 0.5F) * 0.4712389167638204D));
  }
  
  public void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    int k = 0;
    int i = 0;
    int m = bn.a(this);
    boolean bool;
    if ((m == 0) || ((m == 1) && (this.mAdapter != null) && (this.mAdapter.getCount() > 1)))
    {
      int j;
      if (!this.mLeftEdge.a())
      {
        k = paramCanvas.save();
        i = getHeight() - getPaddingTop() - getPaddingBottom();
        m = getWidth();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(-i + getPaddingTop(), this.mFirstOffset * m);
        this.mLeftEdge.a(i, m);
        j = false | this.mLeftEdge.a(paramCanvas);
        paramCanvas.restoreToCount(k);
      }
      k = j;
      if (!this.mRightEdge.a())
      {
        m = paramCanvas.save();
        k = getWidth();
        int n = getHeight();
        int i1 = getPaddingTop();
        int i2 = getPaddingBottom();
        paramCanvas.rotate(90.0F);
        paramCanvas.translate(-getPaddingTop(), -(this.mLastOffset + 1.0F) * k);
        this.mRightEdge.a(n - i1 - i2, k);
        bool = j | this.mRightEdge.a(paramCanvas);
        paramCanvas.restoreToCount(m);
      }
    }
    for (;;)
    {
      if (bool) {
        bn.d(this);
      }
      return;
      this.mLeftEdge.b();
      this.mRightEdge.b();
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.mMarginDrawable;
    if ((localDrawable != null) && (localDrawable.isStateful())) {
      localDrawable.setState(getDrawableState());
    }
  }
  
  public void endFakeDrag()
  {
    if (!this.mFakeDragging) {
      throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }
    Object localObject = this.mVelocityTracker;
    ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.mMaximumVelocity);
    int i = (int)bi.a((VelocityTracker)localObject, this.mActivePointerId);
    this.mPopulatePending = true;
    int j = getClientWidth();
    int k = getScrollX();
    localObject = infoForCurrentScrollPosition();
    setCurrentItemInternal(determineTargetPage(((dc)localObject).b, (k / j - ((dc)localObject).e) / ((dc)localObject).d, i, (int)(this.mLastMotionX - this.mInitialMotionX)), true, true, i);
    endDrag();
    this.mFakeDragging = false;
  }
  
  public boolean executeKeyEvent(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0) {
      switch (paramKeyEvent.getKeyCode())
      {
      }
    }
    do
    {
      do
      {
        return false;
        return arrowScroll(17);
        return arrowScroll(66);
      } while (Build.VERSION.SDK_INT < 11);
      if (s.a(paramKeyEvent)) {
        return arrowScroll(2);
      }
    } while (!s.a(paramKeyEvent, 1));
    return arrowScroll(1);
  }
  
  public void fakeDragBy(float paramFloat)
  {
    if (!this.mFakeDragging) {
      throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }
    this.mLastMotionX += paramFloat;
    float f2 = getScrollX() - paramFloat;
    int i = getClientWidth();
    paramFloat = i;
    float f4 = this.mFirstOffset;
    float f1 = i;
    float f3 = this.mLastOffset;
    Object localObject = (dc)this.mItems.get(0);
    dc localdc = (dc)this.mItems.get(this.mItems.size() - 1);
    if (((dc)localObject).b != 0) {}
    for (paramFloat = ((dc)localObject).e * i;; paramFloat *= f4)
    {
      if (localdc.b != this.mAdapter.getCount() - 1) {}
      for (f1 = localdc.e * i;; f1 *= f3)
      {
        if (f2 < paramFloat) {}
        for (;;)
        {
          this.mLastMotionX += paramFloat - (int)paramFloat;
          scrollTo((int)paramFloat, getScrollY());
          pageScrolled((int)paramFloat);
          long l = SystemClock.uptimeMillis();
          localObject = MotionEvent.obtain(this.mFakeDragBeginTime, l, 2, this.mLastMotionX, 0.0F, 0);
          this.mVelocityTracker.addMovement((MotionEvent)localObject);
          ((MotionEvent)localObject).recycle();
          return;
          if (f2 > f1) {
            paramFloat = f1;
          } else {
            paramFloat = f2;
          }
        }
      }
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new ViewPager.LayoutParams();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new ViewPager.LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return generateDefaultLayoutParams();
  }
  
  public ax getAdapter()
  {
    return this.mAdapter;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    int i = paramInt2;
    if (this.mDrawingOrder == 2) {
      i = paramInt1 - 1 - paramInt2;
    }
    return ((ViewPager.LayoutParams)((View)this.mDrawingOrderedChildren.get(i)).getLayoutParams()).f;
  }
  
  public int getCurrentItem()
  {
    return this.mCurItem;
  }
  
  public int getOffscreenPageLimit()
  {
    return this.mOffscreenPageLimit;
  }
  
  public int getPageMargin()
  {
    return this.mPageMargin;
  }
  
  dc infoForAnyChild(View paramView)
  {
    for (;;)
    {
      ViewParent localViewParent = paramView.getParent();
      if (localViewParent == this) {
        break;
      }
      if ((localViewParent == null) || (!(localViewParent instanceof View))) {
        return null;
      }
      paramView = (View)localViewParent;
    }
    return infoForChild(paramView);
  }
  
  dc infoForChild(View paramView)
  {
    int i = 0;
    while (i < this.mItems.size())
    {
      dc localdc = (dc)this.mItems.get(i);
      if (this.mAdapter.isViewFromObject(paramView, localdc.a)) {
        return localdc;
      }
      i += 1;
    }
    return null;
  }
  
  dc infoForPosition(int paramInt)
  {
    int i = 0;
    while (i < this.mItems.size())
    {
      dc localdc = (dc)this.mItems.get(i);
      if (localdc.b == paramInt) {
        return localdc;
      }
      i += 1;
    }
    return null;
  }
  
  void initViewPager()
  {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context localContext = getContext();
    this.mScroller = new Scroller(localContext, sInterpolator);
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(localContext);
    float f = localContext.getResources().getDisplayMetrics().density;
    this.mTouchSlop = cj.a(localViewConfiguration);
    this.mMinimumVelocity = ((int)(400.0F * f));
    this.mMaximumVelocity = localViewConfiguration.getScaledMaximumFlingVelocity();
    this.mLeftEdge = new q(localContext);
    this.mRightEdge = new q(localContext);
    this.mFlingDistance = ((int)(25.0F * f));
    this.mCloseEnough = ((int)(2.0F * f));
    this.mDefaultGutterSize = ((int)(16.0F * f));
    bn.a(this, new dd(this));
    if (bn.e(this) == 0) {
      bn.c(this, 1);
    }
  }
  
  public boolean isFakeDragging()
  {
    return this.mFakeDragging;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.mFirstLayout = true;
  }
  
  protected void onDetachedFromWindow()
  {
    removeCallbacks(this.mEndScrollRunnable);
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int k;
    int m;
    float f3;
    Object localObject;
    float f1;
    int n;
    int i;
    int i1;
    int j;
    if ((this.mPageMargin > 0) && (this.mMarginDrawable != null) && (this.mItems.size() > 0) && (this.mAdapter != null))
    {
      k = getScrollX();
      m = getWidth();
      f3 = this.mPageMargin / m;
      localObject = (dc)this.mItems.get(0);
      f1 = ((dc)localObject).e;
      n = this.mItems.size();
      i = ((dc)localObject).b;
      i1 = ((dc)this.mItems.get(n - 1)).b;
      j = 0;
    }
    for (;;)
    {
      float f2;
      if (i < i1)
      {
        while ((i > ((dc)localObject).b) && (j < n))
        {
          localObject = this.mItems;
          j += 1;
          localObject = (dc)((ArrayList)localObject).get(j);
        }
        if (i != ((dc)localObject).b) {
          break label271;
        }
        f2 = (((dc)localObject).e + ((dc)localObject).d) * m;
      }
      label271:
      float f4;
      for (f1 = ((dc)localObject).e + ((dc)localObject).d + f3;; f1 += f4 + f3)
      {
        if (this.mPageMargin + f2 > k)
        {
          this.mMarginDrawable.setBounds((int)f2, this.mTopPageBounds, (int)(this.mPageMargin + f2 + 0.5F), this.mBottomPageBounds);
          this.mMarginDrawable.draw(paramCanvas);
        }
        if (f2 <= k + m) {
          break;
        }
        return;
        f4 = this.mAdapter.getPageWidth(i);
        f2 = (f1 + f4) * m;
      }
      i += 1;
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction() & 0xFF;
    if ((i == 3) || (i == 1)) {
      resetTouch();
    }
    do
    {
      return false;
      if (i == 0) {
        break;
      }
      if (this.mIsBeingDragged) {
        return true;
      }
    } while (this.mIsUnableToDrag);
    switch (i)
    {
    }
    for (;;)
    {
      if (this.mVelocityTracker == null) {
        this.mVelocityTracker = VelocityTracker.obtain();
      }
      this.mVelocityTracker.addMovement(paramMotionEvent);
      return this.mIsBeingDragged;
      i = this.mActivePointerId;
      if (i != -1)
      {
        i = ak.a(paramMotionEvent, i);
        float f2 = ak.c(paramMotionEvent, i);
        float f1 = f2 - this.mLastMotionX;
        float f4 = Math.abs(f1);
        float f3 = ak.d(paramMotionEvent, i);
        float f5 = Math.abs(f3 - this.mInitialMotionY);
        if ((f1 != 0.0F) && (!isGutterDrag(this.mLastMotionX, f1)) && (canScroll(this, false, (int)f1, (int)f2, (int)f3)))
        {
          this.mLastMotionX = f2;
          this.mLastMotionY = f3;
          this.mIsUnableToDrag = true;
          return false;
        }
        if ((f4 > this.mTouchSlop) && (0.5F * f4 > f5))
        {
          this.mIsBeingDragged = true;
          requestParentDisallowInterceptTouchEvent(true);
          setScrollState(1);
          if (f1 > 0.0F)
          {
            f1 = this.mInitialMotionX + this.mTouchSlop;
            label282:
            this.mLastMotionX = f1;
            this.mLastMotionY = f3;
            setScrollingCacheEnabled(true);
          }
        }
        while ((this.mIsBeingDragged) && (performDrag(f2)))
        {
          bn.d(this);
          break;
          f1 = this.mInitialMotionX - this.mTouchSlop;
          break label282;
          if (f5 > this.mTouchSlop) {
            this.mIsUnableToDrag = true;
          }
        }
        f1 = paramMotionEvent.getX();
        this.mInitialMotionX = f1;
        this.mLastMotionX = f1;
        f1 = paramMotionEvent.getY();
        this.mInitialMotionY = f1;
        this.mLastMotionY = f1;
        this.mActivePointerId = ak.b(paramMotionEvent, 0);
        this.mIsUnableToDrag = false;
        this.mScroller.computeScrollOffset();
        if ((this.mScrollState == 2) && (Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough))
        {
          this.mScroller.abortAnimation();
          this.mPopulatePending = false;
          populate();
          this.mIsBeingDragged = true;
          requestParentDisallowInterceptTouchEvent(true);
          setScrollState(1);
        }
        else
        {
          completeScroll(false);
          this.mIsBeingDragged = false;
          continue;
          onSecondaryPointerUp(paramMotionEvent);
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = getChildCount();
    int i3 = paramInt3 - paramInt1;
    int i2 = paramInt4 - paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 = getPaddingTop();
    int i = getPaddingRight();
    paramInt3 = getPaddingBottom();
    int i4 = getScrollX();
    int j = 0;
    int m = 0;
    View localView;
    ViewPager.LayoutParams localLayoutParams;
    int i5;
    int k;
    label154:
    int n;
    if (m < i1)
    {
      localView = getChildAt(m);
      if (localView.getVisibility() == 8) {
        break label671;
      }
      localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
      if (!localLayoutParams.a) {
        break label671;
      }
      paramInt4 = localLayoutParams.b;
      i5 = localLayoutParams.b;
      switch (paramInt4 & 0x7)
      {
      case 2: 
      case 4: 
      default: 
        paramInt4 = paramInt2;
        k = paramInt2;
        switch (i5 & 0x70)
        {
        default: 
          n = paramInt1;
          paramInt2 = paramInt1;
          paramInt1 = paramInt3;
          paramInt3 = n;
          label204:
          paramInt4 += i4;
          localView.layout(paramInt4, paramInt3, localView.getMeasuredWidth() + paramInt4, localView.getMeasuredHeight() + paramInt3);
          j += 1;
          paramInt4 = i;
          paramInt3 = k;
          i = paramInt1;
          paramInt1 = j;
        }
        break;
      }
    }
    for (;;)
    {
      m += 1;
      k = paramInt3;
      j = paramInt1;
      paramInt1 = paramInt2;
      paramInt3 = i;
      i = paramInt4;
      paramInt2 = k;
      break;
      k = localView.getMeasuredWidth();
      paramInt4 = paramInt2;
      k += paramInt2;
      break label154;
      paramInt4 = Math.max((i3 - localView.getMeasuredWidth()) / 2, paramInt2);
      k = paramInt2;
      break label154;
      k = localView.getMeasuredWidth();
      paramInt4 = i + localView.getMeasuredWidth();
      n = i3 - i - k;
      i = paramInt4;
      k = paramInt2;
      paramInt4 = n;
      break label154;
      n = localView.getMeasuredHeight();
      paramInt2 = paramInt3;
      n += paramInt1;
      paramInt3 = paramInt1;
      paramInt1 = paramInt2;
      paramInt2 = n;
      break label204;
      n = Math.max((i2 - localView.getMeasuredHeight()) / 2, paramInt1);
      paramInt2 = paramInt1;
      paramInt1 = paramInt3;
      paramInt3 = n;
      break label204;
      n = i2 - paramInt3 - localView.getMeasuredHeight();
      i5 = localView.getMeasuredHeight();
      paramInt2 = paramInt1;
      paramInt1 = paramInt3 + i5;
      paramInt3 = n;
      break label204;
      i = i3 - paramInt2 - i;
      paramInt4 = 0;
      while (paramInt4 < i1)
      {
        localView = getChildAt(paramInt4);
        if (localView.getVisibility() != 8)
        {
          localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.a)
          {
            dc localdc = infoForChild(localView);
            if (localdc != null)
            {
              float f = i;
              k = (int)(localdc.e * f) + paramInt2;
              if (localLayoutParams.d)
              {
                localLayoutParams.d = false;
                f = i;
                localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.c * f), 1073741824), View.MeasureSpec.makeMeasureSpec(i2 - paramInt1 - paramInt3, 1073741824));
              }
              localView.layout(k, paramInt1, localView.getMeasuredWidth() + k, localView.getMeasuredHeight() + paramInt1);
            }
          }
        }
        paramInt4 += 1;
      }
      this.mTopPageBounds = paramInt1;
      this.mBottomPageBounds = (i2 - paramInt3);
      this.mDecorChildCount = j;
      if (this.mFirstLayout) {
        scrollToItem(this.mCurItem, false, 0, false);
      }
      this.mFirstLayout = false;
      return;
      label671:
      paramInt4 = j;
      j = paramInt1;
      k = paramInt2;
      paramInt1 = paramInt4;
      paramInt4 = i;
      i = paramInt3;
      paramInt2 = j;
      paramInt3 = k;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(getDefaultSize(0, paramInt1), getDefaultSize(0, paramInt2));
    paramInt1 = getMeasuredWidth();
    this.mGutterSize = Math.min(paramInt1 / 10, this.mDefaultGutterSize);
    paramInt1 = paramInt1 - getPaddingLeft() - getPaddingRight();
    paramInt2 = getMeasuredHeight() - getPaddingTop() - getPaddingBottom();
    int i4 = getChildCount();
    int k = 0;
    View localView;
    int i;
    int j;
    ViewPager.LayoutParams localLayoutParams;
    int m;
    int i1;
    label183:
    int n;
    if (k < i4)
    {
      localView = getChildAt(k);
      i = paramInt1;
      j = paramInt2;
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
        i = paramInt1;
        j = paramInt2;
        if (localLayoutParams != null)
        {
          i = paramInt1;
          j = paramInt2;
          if (localLayoutParams.a)
          {
            i = localLayoutParams.b & 0x7;
            m = localLayoutParams.b & 0x70;
            i1 = Integer.MIN_VALUE;
            j = Integer.MIN_VALUE;
            if ((m != 48) && (m != 80)) {
              break label333;
            }
            m = 1;
            if ((i != 3) && (i != 5)) {
              break label339;
            }
            n = 1;
            label198:
            if (m == 0) {
              break label345;
            }
            i = 1073741824;
            label208:
            if (localLayoutParams.width == -2) {
              break label528;
            }
            i1 = 1073741824;
            if (localLayoutParams.width == -1) {
              break label522;
            }
            i = localLayoutParams.width;
          }
        }
      }
    }
    for (;;)
    {
      int i3;
      if (localLayoutParams.height != -2)
      {
        i2 = 1073741824;
        j = i2;
        if (localLayoutParams.height != -1)
        {
          i3 = localLayoutParams.height;
          j = i2;
        }
      }
      for (int i2 = i3;; i2 = paramInt2)
      {
        localView.measure(View.MeasureSpec.makeMeasureSpec(i, i1), View.MeasureSpec.makeMeasureSpec(i2, j));
        if (m != 0)
        {
          j = paramInt2 - localView.getMeasuredHeight();
          i = paramInt1;
        }
        for (;;)
        {
          k += 1;
          paramInt1 = i;
          paramInt2 = j;
          break;
          label333:
          m = 0;
          break label183;
          label339:
          n = 0;
          break label198;
          label345:
          i = i1;
          if (n == 0) {
            break label208;
          }
          j = 1073741824;
          i = i1;
          break label208;
          i = paramInt1;
          j = paramInt2;
          if (n != 0)
          {
            i = paramInt1 - localView.getMeasuredWidth();
            j = paramInt2;
          }
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(paramInt2, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        i = getChildCount();
        paramInt2 = 0;
        while (paramInt2 < i)
        {
          localView = getChildAt(paramInt2);
          if (localView.getVisibility() != 8)
          {
            localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
            if ((localLayoutParams == null) || (!localLayoutParams.a))
            {
              float f = paramInt1;
              localView.measure(View.MeasureSpec.makeMeasureSpec((int)(localLayoutParams.c * f), 1073741824), this.mChildHeightMeasureSpec);
            }
          }
          paramInt2 += 1;
        }
        return;
      }
      label522:
      i = paramInt1;
      continue;
      label528:
      i1 = i;
      i = paramInt1;
    }
  }
  
  protected void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
    int i;
    View localView;
    if (this.mDecorChildCount > 0)
    {
      int i1 = getScrollX();
      i = getPaddingLeft();
      int j = getPaddingRight();
      int i2 = getWidth();
      int i3 = getChildCount();
      int n = 0;
      while (n < i3)
      {
        localView = getChildAt(n);
        ViewPager.LayoutParams localLayoutParams = (ViewPager.LayoutParams)localView.getLayoutParams();
        int m;
        int k;
        if (!localLayoutParams.a)
        {
          m = i;
          k = j;
          n += 1;
          i = m;
          j = k;
        }
        else
        {
          switch (localLayoutParams.b & 0x7)
          {
          case 2: 
          case 4: 
          default: 
            k = i;
            m = j;
            j = i;
            i = m;
          }
          for (;;)
          {
            int i4 = k + i1 - localView.getLeft();
            k = i;
            m = j;
            if (i4 == 0) {
              break;
            }
            localView.offsetLeftAndRight(i4);
            k = i;
            m = j;
            break;
            k = localView.getWidth();
            m = k + i;
            k = i;
            i = j;
            j = m;
            continue;
            k = Math.max((i2 - localView.getMeasuredWidth()) / 2, i);
            m = i;
            i = j;
            j = m;
            continue;
            k = i2 - j - localView.getMeasuredWidth();
            i4 = localView.getMeasuredWidth();
            m = i;
            i = j + i4;
            j = m;
          }
        }
      }
    }
    dispatchOnPageScrolled(paramInt1, paramFloat, paramInt2);
    if (this.mPageTransformer != null)
    {
      paramInt2 = getScrollX();
      i = getChildCount();
      paramInt1 = 0;
      if (paramInt1 < i)
      {
        localView = getChildAt(paramInt1);
        if (((ViewPager.LayoutParams)localView.getLayoutParams()).a) {}
        for (;;)
        {
          paramInt1 += 1;
          break;
          paramFloat = (localView.getLeft() - paramInt2) / getClientWidth();
          this.mPageTransformer.a(localView, paramFloat);
        }
      }
    }
    this.mCalledSuper = true;
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    int k = -1;
    int j = getChildCount();
    int i;
    if ((paramInt & 0x2) != 0)
    {
      k = 1;
      i = 0;
    }
    while (i != j)
    {
      View localView = getChildAt(i);
      if (localView.getVisibility() == 0)
      {
        dc localdc = infoForChild(localView);
        if ((localdc != null) && (localdc.b == this.mCurItem) && (localView.requestFocus(paramInt, paramRect)))
        {
          return true;
          i = j - 1;
          j = -1;
          continue;
        }
      }
      i += k;
    }
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof ViewPager.SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    paramParcelable = (ViewPager.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (this.mAdapter != null)
    {
      this.mAdapter.restoreState(paramParcelable.b, paramParcelable.c);
      setCurrentItemInternal(paramParcelable.a, false, true);
      return;
    }
    this.mRestoredCurItem = paramParcelable.a;
    this.mRestoredAdapterState = paramParcelable.b;
    this.mRestoredClassLoader = paramParcelable.c;
  }
  
  public Parcelable onSaveInstanceState()
  {
    ViewPager.SavedState localSavedState = new ViewPager.SavedState(super.onSaveInstanceState());
    localSavedState.a = this.mCurItem;
    if (this.mAdapter != null) {
      localSavedState.b = this.mAdapter.saveState();
    }
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      recomputeScrollPosition(paramInt1, paramInt3, this.mPageMargin, this.mPageMargin);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    if (this.mFakeDragging) {
      return true;
    }
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0)) {
      return false;
    }
    if ((this.mAdapter == null) || (this.mAdapter.getCount() == 0)) {
      return false;
    }
    if (this.mVelocityTracker == null) {
      this.mVelocityTracker = VelocityTracker.obtain();
    }
    this.mVelocityTracker.addMovement(paramMotionEvent);
    boolean bool1 = bool2;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      bool1 = bool2;
    }
    for (;;)
    {
      if (bool1) {
        bn.d(this);
      }
      return true;
      this.mScroller.abortAnimation();
      this.mPopulatePending = false;
      populate();
      float f1 = paramMotionEvent.getX();
      this.mInitialMotionX = f1;
      this.mLastMotionX = f1;
      f1 = paramMotionEvent.getY();
      this.mInitialMotionY = f1;
      this.mLastMotionY = f1;
      this.mActivePointerId = ak.b(paramMotionEvent, 0);
      bool1 = bool2;
      continue;
      int i;
      float f2;
      if (!this.mIsBeingDragged)
      {
        i = ak.a(paramMotionEvent, this.mActivePointerId);
        if (i == -1)
        {
          bool1 = resetTouch();
          continue;
        }
        f1 = ak.c(paramMotionEvent, i);
        float f3 = Math.abs(f1 - this.mLastMotionX);
        f2 = ak.d(paramMotionEvent, i);
        float f4 = Math.abs(f2 - this.mLastMotionY);
        if ((f3 > this.mTouchSlop) && (f3 > f4))
        {
          this.mIsBeingDragged = true;
          requestParentDisallowInterceptTouchEvent(true);
          if (f1 - this.mInitialMotionX <= 0.0F) {
            break label393;
          }
        }
      }
      Object localObject;
      label393:
      for (f1 = this.mInitialMotionX + this.mTouchSlop;; f1 = this.mInitialMotionX - this.mTouchSlop)
      {
        this.mLastMotionX = f1;
        this.mLastMotionY = f2;
        setScrollState(1);
        setScrollingCacheEnabled(true);
        localObject = getParent();
        if (localObject != null) {
          ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
        }
        bool1 = bool2;
        if (!this.mIsBeingDragged) {
          break;
        }
        bool1 = false | performDrag(ak.c(paramMotionEvent, ak.a(paramMotionEvent, this.mActivePointerId)));
        break;
      }
      bool1 = bool2;
      if (this.mIsBeingDragged)
      {
        localObject = this.mVelocityTracker;
        ((VelocityTracker)localObject).computeCurrentVelocity(1000, this.mMaximumVelocity);
        i = (int)bi.a((VelocityTracker)localObject, this.mActivePointerId);
        this.mPopulatePending = true;
        int j = getClientWidth();
        int k = getScrollX();
        localObject = infoForCurrentScrollPosition();
        setCurrentItemInternal(determineTargetPage(((dc)localObject).b, (k / j - ((dc)localObject).e) / ((dc)localObject).d, i, (int)(ak.c(paramMotionEvent, ak.a(paramMotionEvent, this.mActivePointerId)) - this.mInitialMotionX)), true, true, i);
        bool1 = resetTouch();
        continue;
        bool1 = bool2;
        if (this.mIsBeingDragged)
        {
          scrollToItem(this.mCurItem, true, 0, false);
          bool1 = resetTouch();
          continue;
          i = ak.b(paramMotionEvent);
          this.mLastMotionX = ak.c(paramMotionEvent, i);
          this.mActivePointerId = ak.b(paramMotionEvent, i);
          bool1 = bool2;
          continue;
          onSecondaryPointerUp(paramMotionEvent);
          this.mLastMotionX = ak.c(paramMotionEvent, ak.a(paramMotionEvent, this.mActivePointerId));
          bool1 = bool2;
        }
      }
    }
  }
  
  boolean pageLeft()
  {
    if (this.mCurItem > 0)
    {
      setCurrentItem(this.mCurItem - 1, true);
      return true;
    }
    return false;
  }
  
  boolean pageRight()
  {
    if ((this.mAdapter != null) && (this.mCurItem < this.mAdapter.getCount() - 1))
    {
      setCurrentItem(this.mCurItem + 1, true);
      return true;
    }
    return false;
  }
  
  void populate()
  {
    populate(this.mCurItem);
  }
  
  void populate(int paramInt)
  {
    int i;
    Object localObject2;
    if (this.mCurItem != paramInt) {
      if (this.mCurItem < paramInt)
      {
        i = 66;
        localObject2 = infoForPosition(this.mCurItem);
        this.mCurItem = paramInt;
      }
    }
    for (int j = i;; j = 2)
    {
      if (this.mAdapter == null) {
        sortChildDrawingOrder();
      }
      do
      {
        return;
        i = 17;
        break;
        if (this.mPopulatePending)
        {
          sortChildDrawingOrder();
          return;
        }
      } while (getWindowToken() == null);
      this.mAdapter.startUpdate(this);
      paramInt = this.mOffscreenPageLimit;
      int i3 = Math.max(0, this.mCurItem - paramInt);
      int i1 = this.mAdapter.getCount();
      int i2 = Math.min(i1 - 1, paramInt + this.mCurItem);
      Object localObject1;
      if (i1 != this.mExpectedAdapterCount) {
        try
        {
          String str = getResources().getResourceName(getId());
          throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.mExpectedAdapterCount + ", found: " + i1 + " Pager id: " + str + " Pager class: " + getClass() + " Problematic adapter: " + this.mAdapter.getClass());
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          for (;;)
          {
            localObject1 = Integer.toHexString(getId());
          }
        }
      }
      paramInt = 0;
      if (paramInt < this.mItems.size())
      {
        localObject1 = (dc)this.mItems.get(paramInt);
        if (((dc)localObject1).b >= this.mCurItem) {
          if (((dc)localObject1).b != this.mCurItem) {
            break label1273;
          }
        }
      }
      for (;;)
      {
        if ((localObject1 == null) && (i1 > 0)) {}
        for (Object localObject3 = addNewItem(this.mCurItem, paramInt);; localObject3 = localObject1)
        {
          int n;
          label344:
          int i4;
          label357:
          float f3;
          int m;
          int k;
          Object localObject4;
          float f1;
          if (localObject3 != null)
          {
            n = paramInt - 1;
            if (n < 0) {
              break label640;
            }
            localObject1 = (dc)this.mItems.get(n);
            i4 = getClientWidth();
            if (i4 > 0) {
              break label646;
            }
            f2 = 0.0F;
            i = this.mCurItem;
            f3 = 0.0F;
            m = i - 1;
            k = paramInt;
            localObject4 = localObject1;
            if (m >= 0)
            {
              if ((f3 < f2) || (m >= i3)) {
                break label801;
              }
              if (localObject4 != null) {
                break label667;
              }
            }
            f1 = ((dc)localObject3).d;
            paramInt = k + 1;
            if (f1 < 2.0F)
            {
              if (paramInt >= this.mItems.size()) {
                break label921;
              }
              localObject1 = (dc)this.mItems.get(paramInt);
              label444:
              if (i4 > 0) {
                break label927;
              }
            }
          }
          label463:
          label521:
          label640:
          label646:
          label667:
          label792:
          label801:
          label921:
          label927:
          for (float f2 = 0.0F;; f2 = getPaddingRight() / i4 + 2.0F)
          {
            i = this.mCurItem;
            i += 1;
            if (i < i1)
            {
              if ((f1 < f2) || (i <= i2)) {
                break label1023;
              }
              if (localObject1 != null) {
                break label942;
              }
            }
            calculatePageOffsets((dc)localObject3, k, (dc)localObject2);
            localObject2 = this.mAdapter;
            paramInt = this.mCurItem;
            if (localObject3 == null) {
              break label1145;
            }
            localObject1 = ((dc)localObject3).a;
            ((ax)localObject2).setPrimaryItem(this, paramInt, localObject1);
            this.mAdapter.finishUpdate(this);
            i = getChildCount();
            paramInt = 0;
            while (paramInt < i)
            {
              localObject2 = getChildAt(paramInt);
              localObject1 = (ViewPager.LayoutParams)((View)localObject2).getLayoutParams();
              ((ViewPager.LayoutParams)localObject1).f = paramInt;
              if ((!((ViewPager.LayoutParams)localObject1).a) && (((ViewPager.LayoutParams)localObject1).c == 0.0F))
              {
                localObject2 = infoForChild((View)localObject2);
                if (localObject2 != null)
                {
                  ((ViewPager.LayoutParams)localObject1).c = ((dc)localObject2).d;
                  ((ViewPager.LayoutParams)localObject1).e = ((dc)localObject2).b;
                }
              }
              paramInt += 1;
            }
            paramInt += 1;
            break;
            localObject1 = null;
            break label344;
            f2 = 2.0F - ((dc)localObject3).d + getPaddingLeft() / i4;
            break label357;
            localObject1 = localObject4;
            paramInt = n;
            f1 = f3;
            i = k;
            if (m == ((dc)localObject4).b)
            {
              localObject1 = localObject4;
              paramInt = n;
              f1 = f3;
              i = k;
              if (!((dc)localObject4).c)
              {
                this.mItems.remove(n);
                this.mAdapter.destroyItem(this, m, ((dc)localObject4).a);
                paramInt = n - 1;
                i = k - 1;
                if (paramInt < 0) {
                  break label792;
                }
                localObject1 = (dc)this.mItems.get(paramInt);
                f1 = f3;
              }
            }
            for (;;)
            {
              m -= 1;
              localObject4 = localObject1;
              n = paramInt;
              f3 = f1;
              k = i;
              break;
              localObject1 = null;
              f1 = f3;
              continue;
              if ((localObject4 != null) && (m == ((dc)localObject4).b))
              {
                f1 = f3 + ((dc)localObject4).d;
                paramInt = n - 1;
                if (paramInt >= 0)
                {
                  localObject1 = (dc)this.mItems.get(paramInt);
                  i = k;
                }
                else
                {
                  localObject1 = null;
                  i = k;
                }
              }
              else
              {
                f1 = f3 + addNewItem(m, n + 1).d;
                i = k + 1;
                if (n >= 0)
                {
                  localObject1 = (dc)this.mItems.get(n);
                  paramInt = n;
                }
                else
                {
                  localObject1 = null;
                  paramInt = n;
                }
              }
            }
            localObject1 = null;
            break label444;
          }
          label942:
          if ((i == ((dc)localObject1).b) && (!((dc)localObject1).c))
          {
            this.mItems.remove(paramInt);
            this.mAdapter.destroyItem(this, i, ((dc)localObject1).a);
            if (paramInt < this.mItems.size()) {
              localObject1 = (dc)this.mItems.get(paramInt);
            }
          }
          for (;;)
          {
            i += 1;
            break label463;
            localObject1 = null;
            continue;
            label1023:
            if ((localObject1 != null) && (i == ((dc)localObject1).b))
            {
              f3 = ((dc)localObject1).d;
              paramInt += 1;
              if (paramInt < this.mItems.size()) {}
              for (localObject1 = (dc)this.mItems.get(paramInt);; localObject1 = null)
              {
                f1 += f3;
                break;
              }
            }
            localObject1 = addNewItem(i, paramInt);
            paramInt += 1;
            f3 = ((dc)localObject1).d;
            if (paramInt < this.mItems.size()) {}
            for (localObject1 = (dc)this.mItems.get(paramInt);; localObject1 = null)
            {
              f1 += f3;
              break;
            }
            label1145:
            localObject1 = null;
            break label521;
            sortChildDrawingOrder();
            if (!hasFocus()) {
              break;
            }
            localObject1 = findFocus();
            if (localObject1 != null) {}
            for (localObject1 = infoForAnyChild((View)localObject1);; localObject1 = null)
            {
              if ((localObject1 != null) && (((dc)localObject1).b == this.mCurItem)) {
                break label1261;
              }
              paramInt = 0;
              for (;;)
              {
                if (paramInt >= getChildCount()) {
                  break label1255;
                }
                localObject1 = getChildAt(paramInt);
                localObject2 = infoForChild((View)localObject1);
                if ((localObject2 != null) && (((dc)localObject2).b == this.mCurItem) && (((View)localObject1).requestFocus(j))) {
                  break;
                }
                paramInt += 1;
              }
              label1255:
              break;
            }
            label1261:
            break;
          }
        }
        label1273:
        localObject1 = null;
      }
      localObject2 = null;
    }
  }
  
  public void removeOnPageChangeListener(df paramdf)
  {
    if (this.mOnPageChangeListeners != null) {
      this.mOnPageChangeListeners.remove(paramdf);
    }
  }
  
  public void removeView(View paramView)
  {
    if (this.mInLayout)
    {
      removeViewInLayout(paramView);
      return;
    }
    super.removeView(paramView);
  }
  
  public void setAdapter(ax paramax)
  {
    if (this.mAdapter != null)
    {
      this.mAdapter.unregisterDataSetObserver(this.mObserver);
      this.mAdapter.startUpdate(this);
      int i = 0;
      while (i < this.mItems.size())
      {
        localObject = (dc)this.mItems.get(i);
        this.mAdapter.destroyItem(this, ((dc)localObject).b, ((dc)localObject).a);
        i += 1;
      }
      this.mAdapter.finishUpdate(this);
      this.mItems.clear();
      removeNonDecorViews();
      this.mCurItem = 0;
      scrollTo(0, 0);
    }
    Object localObject = this.mAdapter;
    this.mAdapter = paramax;
    this.mExpectedAdapterCount = 0;
    boolean bool;
    if (this.mAdapter != null)
    {
      if (this.mObserver == null) {
        this.mObserver = new dh(this, null);
      }
      this.mAdapter.registerDataSetObserver(this.mObserver);
      this.mPopulatePending = false;
      bool = this.mFirstLayout;
      this.mFirstLayout = true;
      this.mExpectedAdapterCount = this.mAdapter.getCount();
      if (this.mRestoredCurItem < 0) {
        break label255;
      }
      this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
      setCurrentItemInternal(this.mRestoredCurItem, false, true);
      this.mRestoredCurItem = -1;
      this.mRestoredAdapterState = null;
      this.mRestoredClassLoader = null;
    }
    for (;;)
    {
      if ((this.mAdapterChangeListener != null) && (localObject != paramax)) {
        this.mAdapterChangeListener.a((ax)localObject, paramax);
      }
      return;
      label255:
      if (!bool) {
        populate();
      } else {
        requestLayout();
      }
    }
  }
  
  void setChildrenDrawingOrderEnabledCompat(boolean paramBoolean)
  {
    if ((Build.VERSION.SDK_INT < 7) || (this.mSetChildrenDrawingOrderEnabled == null)) {}
    try
    {
      this.mSetChildrenDrawingOrderEnabled = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[] { Boolean.TYPE });
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      for (;;)
      {
        try
        {
          this.mSetChildrenDrawingOrderEnabled.invoke(this, new Object[] { Boolean.valueOf(paramBoolean) });
          return;
        }
        catch (Exception localException)
        {
          Log.e("ViewPager", "Error changing children drawing order", localException);
        }
        localNoSuchMethodException = localNoSuchMethodException;
        Log.e("ViewPager", "Can't find setChildrenDrawingOrderEnabled", localNoSuchMethodException);
      }
    }
  }
  
  public void setCurrentItem(int paramInt)
  {
    this.mPopulatePending = false;
    if (!this.mFirstLayout) {}
    for (boolean bool = true;; bool = false)
    {
      setCurrentItemInternal(paramInt, bool, false);
      return;
    }
  }
  
  public void setCurrentItem(int paramInt, boolean paramBoolean)
  {
    this.mPopulatePending = false;
    setCurrentItemInternal(paramInt, paramBoolean, false);
  }
  
  void setCurrentItemInternal(int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    setCurrentItemInternal(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  void setCurrentItemInternal(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2)
  {
    boolean bool = false;
    if ((this.mAdapter == null) || (this.mAdapter.getCount() <= 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    if ((!paramBoolean2) && (this.mCurItem == paramInt1) && (this.mItems.size() != 0))
    {
      setScrollingCacheEnabled(false);
      return;
    }
    int i;
    if (paramInt1 < 0) {
      i = 0;
    }
    for (;;)
    {
      paramInt1 = this.mOffscreenPageLimit;
      if ((i <= this.mCurItem + paramInt1) && (i >= this.mCurItem - paramInt1)) {
        break;
      }
      paramInt1 = 0;
      while (paramInt1 < this.mItems.size())
      {
        ((dc)this.mItems.get(paramInt1)).c = true;
        paramInt1 += 1;
      }
      i = paramInt1;
      if (paramInt1 >= this.mAdapter.getCount()) {
        i = this.mAdapter.getCount() - 1;
      }
    }
    paramBoolean2 = bool;
    if (this.mCurItem != i) {
      paramBoolean2 = true;
    }
    if (this.mFirstLayout)
    {
      this.mCurItem = i;
      if (paramBoolean2) {
        dispatchOnPageSelected(i);
      }
      requestLayout();
      return;
    }
    populate(i);
    scrollToItem(i, paramBoolean1, paramInt2, paramBoolean2);
  }
  
  df setInternalPageChangeListener(df paramdf)
  {
    df localdf = this.mInternalPageChangeListener;
    this.mInternalPageChangeListener = paramdf;
    return localdf;
  }
  
  public void setOffscreenPageLimit(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 1)
    {
      Log.w("ViewPager", "Requested offscreen page limit " + paramInt + " too small; defaulting to " + 1);
      i = 1;
    }
    if (i != this.mOffscreenPageLimit)
    {
      this.mOffscreenPageLimit = i;
      populate();
    }
  }
  
  void setOnAdapterChangeListener(de paramde)
  {
    this.mAdapterChangeListener = paramde;
  }
  
  @Deprecated
  public void setOnPageChangeListener(df paramdf)
  {
    this.mOnPageChangeListener = paramdf;
  }
  
  public void setPageMargin(int paramInt)
  {
    int i = this.mPageMargin;
    this.mPageMargin = paramInt;
    int j = getWidth();
    recomputeScrollPosition(j, j, paramInt, i);
    requestLayout();
  }
  
  public void setPageMarginDrawable(int paramInt)
  {
    setPageMarginDrawable(getContext().getResources().getDrawable(paramInt));
  }
  
  public void setPageMarginDrawable(Drawable paramDrawable)
  {
    this.mMarginDrawable = paramDrawable;
    if (paramDrawable != null) {
      refreshDrawableState();
    }
    if (paramDrawable == null) {}
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      invalidate();
      return;
    }
  }
  
  public void setPageTransformer(boolean paramBoolean, dg paramdg)
  {
    int j = 1;
    boolean bool1;
    boolean bool2;
    label28:
    int i;
    if (Build.VERSION.SDK_INT >= 11)
    {
      if (paramdg == null) {
        break label75;
      }
      bool1 = true;
      if (this.mPageTransformer == null) {
        break label81;
      }
      bool2 = true;
      if (bool1 == bool2) {
        break label87;
      }
      i = 1;
      label37:
      this.mPageTransformer = paramdg;
      setChildrenDrawingOrderEnabledCompat(bool1);
      if (!bool1) {
        break label92;
      }
      if (paramBoolean) {
        j = 2;
      }
    }
    label75:
    label81:
    label87:
    label92:
    for (this.mDrawingOrder = j;; this.mDrawingOrder = 0)
    {
      if (i != 0) {
        populate();
      }
      return;
      bool1 = false;
      break;
      bool2 = false;
      break label28;
      i = 0;
      break label37;
    }
  }
  
  void smoothScrollTo(int paramInt1, int paramInt2)
  {
    smoothScrollTo(paramInt1, paramInt2, 0);
  }
  
  void smoothScrollTo(int paramInt1, int paramInt2, int paramInt3)
  {
    if (getChildCount() == 0)
    {
      setScrollingCacheEnabled(false);
      return;
    }
    int i = getScrollX();
    int j = getScrollY();
    int k = paramInt1 - i;
    paramInt2 -= j;
    if ((k == 0) && (paramInt2 == 0))
    {
      completeScroll(false);
      populate();
      setScrollState(0);
      return;
    }
    setScrollingCacheEnabled(true);
    setScrollState(2);
    paramInt1 = getClientWidth();
    int m = paramInt1 / 2;
    float f3 = Math.min(1.0F, Math.abs(k) * 1.0F / paramInt1);
    float f1 = m;
    float f2 = m;
    f3 = distanceInfluenceForSnapDuration(f3);
    paramInt3 = Math.abs(paramInt3);
    if (paramInt3 > 0) {}
    for (paramInt1 = Math.round(1000.0F * Math.abs((f2 * f3 + f1) / paramInt3)) * 4;; paramInt1 = (int)((Math.abs(k) / (f1 * f2 + this.mPageMargin) + 1.0F) * 100.0F))
    {
      paramInt1 = Math.min(paramInt1, 600);
      this.mScroller.startScroll(i, j, k, paramInt2, paramInt1);
      bn.d(this);
      return;
      f1 = paramInt1;
      f2 = this.mAdapter.getPageWidth(this.mCurItem);
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    return (super.verifyDrawable(paramDrawable)) || (paramDrawable == this.mMarginDrawable);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\ViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */