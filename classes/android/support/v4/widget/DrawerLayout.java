package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.ak;
import android.support.v4.view.bn;
import android.support.v4.view.cq;
import android.support.v4.view.n;
import android.support.v4.view.s;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;

public class DrawerLayout
  extends ViewGroup
  implements p
{
  static final g a;
  private static final int[] b;
  private static final boolean c;
  private static final boolean d;
  private Drawable A;
  private CharSequence B;
  private CharSequence C;
  private Object D;
  private boolean E;
  private Drawable F = null;
  private Drawable G = null;
  private Drawable H = null;
  private Drawable I = null;
  private final ArrayList<View> J;
  private final f e = new f(this);
  private float f;
  private int g;
  private int h = -1728053248;
  private float i;
  private Paint j = new Paint();
  private final bf k;
  private final bf l;
  private final l m;
  private final l n;
  private int o;
  private boolean p;
  private boolean q = true;
  private int r;
  private int s;
  private boolean t;
  private boolean u;
  private j v;
  private float w;
  private float x;
  private Drawable y;
  private Drawable z;
  
  static
  {
    boolean bool2 = true;
    b = new int[] { 16842931 };
    if (Build.VERSION.SDK_INT >= 19)
    {
      bool1 = true;
      c = bool1;
      if (Build.VERSION.SDK_INT < 21) {
        break label65;
      }
    }
    label65:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      d = bool1;
      if (Build.VERSION.SDK_INT < 21) {
        break label70;
      }
      a = new h();
      return;
      bool1 = false;
      break;
    }
    label70:
    a = new i();
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public DrawerLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = getResources().getDisplayMetrics().density;
    this.g = ((int)(64.0F * f1 + 0.5F));
    float f2 = 400.0F * f1;
    this.m = new l(this, 3);
    this.n = new l(this, 5);
    this.k = bf.a(this, 1.0F, this.m);
    this.k.a(1);
    this.k.a(f2);
    this.m.a(this.k);
    this.l = bf.a(this, 1.0F, this.n);
    this.l.a(2);
    this.l.a(f2);
    this.n.a(this.l);
    setFocusableInTouchMode(true);
    bn.c(this, 1);
    bn.a(this, new e(this));
    cq.a(this, false);
    if (bn.s(this))
    {
      a.a(this);
      this.y = a.a(paramContext);
    }
    this.f = (f1 * 10.0F);
    this.J = new ArrayList();
  }
  
  private void a(View paramView, boolean paramBoolean)
  {
    int i2 = getChildCount();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = getChildAt(i1);
      if (((!paramBoolean) && (!g(localView))) || ((paramBoolean) && (localView == paramView))) {
        bn.c(localView, 1);
      }
      for (;;)
      {
        i1 += 1;
        break;
        bn.c(localView, 4);
      }
    }
  }
  
  private boolean a(Drawable paramDrawable, int paramInt)
  {
    if ((paramDrawable == null) || (!android.support.v4.b.a.a.a(paramDrawable))) {
      return false;
    }
    android.support.v4.b.a.a.a(paramDrawable, paramInt);
    return true;
  }
  
  static String c(int paramInt)
  {
    if ((paramInt & 0x3) == 3) {
      return "LEFT";
    }
    if ((paramInt & 0x5) == 5) {
      return "RIGHT";
    }
    return Integer.toHexString(paramInt);
  }
  
  private void f()
  {
    if (d) {
      return;
    }
    this.z = g();
    this.A = h();
  }
  
  private Drawable g()
  {
    int i1 = bn.h(this);
    if (i1 == 0)
    {
      if (this.F != null)
      {
        a(this.F, i1);
        return this.F;
      }
    }
    else if (this.G != null)
    {
      a(this.G, i1);
      return this.G;
    }
    return this.H;
  }
  
  private Drawable h()
  {
    int i1 = bn.h(this);
    if (i1 == 0)
    {
      if (this.G != null)
      {
        a(this.G, i1);
        return this.G;
      }
    }
    else if (this.F != null)
    {
      a(this.F, i1);
      return this.F;
    }
    return this.I;
  }
  
  private boolean i()
  {
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      if (((DrawerLayout.LayoutParams)getChildAt(i1).getLayoutParams()).c) {
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  private boolean j()
  {
    return k() != null;
  }
  
  private View k()
  {
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      if ((g(localView)) && (k(localView))) {
        return localView;
      }
      i1 += 1;
    }
    return null;
  }
  
  private static boolean m(View paramView)
  {
    boolean bool2 = false;
    paramView = paramView.getBackground();
    boolean bool1 = bool2;
    if (paramView != null)
    {
      bool1 = bool2;
      if (paramView.getOpacity() == -1) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  private static boolean n(View paramView)
  {
    return (bn.e(paramView) != 4) && (bn.e(paramView) != 2);
  }
  
  public int a(View paramView)
  {
    int i1 = e(paramView);
    if (i1 == 3) {
      return this.r;
    }
    if (i1 == 5) {
      return this.s;
    }
    return 0;
  }
  
  View a()
  {
    int i2 = getChildCount();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = getChildAt(i1);
      if (((DrawerLayout.LayoutParams)localView.getLayoutParams()).d) {
        return localView;
      }
      i1 += 1;
    }
    return null;
  }
  
  public CharSequence a(int paramInt)
  {
    paramInt = n.a(paramInt, bn.h(this));
    if (paramInt == 3) {
      return this.B;
    }
    if (paramInt == 5) {
      return this.C;
    }
    return null;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    paramInt2 = n.a(paramInt2, bn.h(this));
    Object localObject;
    if (paramInt2 == 3)
    {
      this.r = paramInt1;
      if (paramInt1 != 0)
      {
        if (paramInt2 != 3) {
          break label74;
        }
        localObject = this.k;
        label33:
        ((bf)localObject).cancel();
      }
      switch (paramInt1)
      {
      }
    }
    label74:
    do
    {
      do
      {
        return;
        if (paramInt2 != 5) {
          break;
        }
        this.s = paramInt1;
        break;
        localObject = this.l;
        break label33;
        localObject = b(paramInt2);
      } while (localObject == null);
      h((View)localObject);
      return;
      localObject = b(paramInt2);
    } while (localObject == null);
    i((View)localObject);
  }
  
  void a(int paramInt1, int paramInt2, View paramView)
  {
    int i1 = 1;
    int i2 = this.k.a();
    int i3 = this.l.a();
    paramInt1 = i1;
    DrawerLayout.LayoutParams localLayoutParams;
    if (i2 != 1)
    {
      if (i3 == 1) {
        paramInt1 = i1;
      }
    }
    else if ((paramView != null) && (paramInt2 == 0))
    {
      localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      if (localLayoutParams.b != 0.0F) {
        break label124;
      }
      b(paramView);
    }
    for (;;)
    {
      if (paramInt1 != this.o)
      {
        this.o = paramInt1;
        if (this.v != null) {
          this.v.a(paramInt1);
        }
      }
      return;
      if ((i2 == 2) || (i3 == 2))
      {
        paramInt1 = 2;
        break;
      }
      paramInt1 = 0;
      break;
      label124:
      if (localLayoutParams.b == 1.0F) {
        c(paramView);
      }
    }
  }
  
  void a(View paramView, float paramFloat)
  {
    if (this.v != null) {
      this.v.a(paramView, paramFloat);
    }
  }
  
  public void a(Object paramObject, boolean paramBoolean)
  {
    this.D = paramObject;
    this.E = paramBoolean;
    if ((!paramBoolean) && (getBackground() == null)) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      setWillNotDraw(paramBoolean);
      requestLayout();
      return;
    }
  }
  
  void a(boolean paramBoolean)
  {
    int i5 = getChildCount();
    int i2 = 0;
    int i1 = 0;
    while (i2 < i5)
    {
      View localView = getChildAt(i2);
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
      int i3 = i1;
      if (g(localView))
      {
        if ((paramBoolean) && (!localLayoutParams.c)) {
          i3 = i1;
        }
      }
      else
      {
        i2 += 1;
        i1 = i3;
        continue;
      }
      int i4 = localView.getWidth();
      if (a(localView, 3)) {
        i1 |= this.k.a(localView, -i4, localView.getTop());
      }
      for (;;)
      {
        localLayoutParams.c = false;
        i4 = i1;
        break;
        i1 |= this.l.a(localView, getWidth(), localView.getTop());
      }
    }
    this.m.a();
    this.n.a();
    if (i1 != 0) {
      invalidate();
    }
  }
  
  boolean a(View paramView, int paramInt)
  {
    return (e(paramView) & paramInt) == paramInt;
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    int i3 = 0;
    if (getDescendantFocusability() == 393216) {
      return;
    }
    int i4 = getChildCount();
    int i1 = 0;
    int i2 = 0;
    View localView;
    if (i1 < i4)
    {
      localView = getChildAt(i1);
      if (g(localView)) {
        if (j(localView))
        {
          i2 = 1;
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
      }
      for (;;)
      {
        i1 += 1;
        break;
        this.J.add(localView);
      }
    }
    if (i2 == 0)
    {
      i2 = this.J.size();
      i1 = i3;
      while (i1 < i2)
      {
        localView = (View)this.J.get(i1);
        if (localView.getVisibility() == 0) {
          localView.addFocusables(paramArrayList, paramInt1, paramInt2);
        }
        i1 += 1;
      }
    }
    this.J.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
    if ((a() != null) || (g(paramView))) {
      bn.c(paramView, 4);
    }
    for (;;)
    {
      if (!c) {
        bn.a(paramView, this.e);
      }
      return;
      bn.c(paramView, 1);
    }
  }
  
  View b(int paramInt)
  {
    int i1 = n.a(paramInt, bn.h(this));
    int i2 = getChildCount();
    paramInt = 0;
    while (paramInt < i2)
    {
      View localView = getChildAt(paramInt);
      if ((e(localView) & 0x7) == (i1 & 0x7)) {
        return localView;
      }
      paramInt += 1;
    }
    return null;
  }
  
  public void b()
  {
    a(false);
  }
  
  void b(View paramView)
  {
    DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    if (localLayoutParams.d)
    {
      localLayoutParams.d = false;
      if (this.v != null) {
        this.v.b(paramView);
      }
      a(paramView, false);
      if (hasWindowFocus())
      {
        paramView = getRootView();
        if (paramView != null) {
          paramView.sendAccessibilityEvent(32);
        }
      }
    }
  }
  
  void b(View paramView, float paramFloat)
  {
    DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    if (paramFloat == localLayoutParams.b) {
      return;
    }
    localLayoutParams.b = paramFloat;
    a(paramView, paramFloat);
  }
  
  void c()
  {
    int i1 = 0;
    if (!this.u)
    {
      long l1 = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
      int i2 = getChildCount();
      while (i1 < i2)
      {
        getChildAt(i1).dispatchTouchEvent(localMotionEvent);
        i1 += 1;
      }
      localMotionEvent.recycle();
      this.u = true;
    }
  }
  
  void c(View paramView)
  {
    DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
    if (!localLayoutParams.d)
    {
      localLayoutParams.d = true;
      if (this.v != null) {
        this.v.a(paramView);
      }
      a(paramView, true);
      if (hasWindowFocus()) {
        sendAccessibilityEvent(32);
      }
      paramView.requestFocus();
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof DrawerLayout.LayoutParams)) && (super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll()
  {
    int i2 = getChildCount();
    float f1 = 0.0F;
    int i1 = 0;
    while (i1 < i2)
    {
      f1 = Math.max(f1, ((DrawerLayout.LayoutParams)getChildAt(i1).getLayoutParams()).b);
      i1 += 1;
    }
    this.i = f1;
    if ((this.k.a(true) | this.l.a(true))) {
      bn.d(this);
    }
  }
  
  float d(View paramView)
  {
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).b;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    int i7 = getHeight();
    boolean bool1 = f(paramView);
    int i3 = 0;
    int i5 = 0;
    int i1 = getWidth();
    int i8 = paramCanvas.save();
    int i2 = i1;
    int i4;
    View localView;
    if (bool1)
    {
      int i9 = getChildCount();
      i4 = 0;
      i3 = i5;
      for (;;)
      {
        if (i4 < i9)
        {
          localView = getChildAt(i4);
          if ((localView != paramView) && (localView.getVisibility() == 0) && (m(localView)) && (g(localView)))
          {
            if (localView.getHeight() < i7)
            {
              i5 = i3;
              i2 = i1;
              i4 += 1;
              i1 = i2;
              i3 = i5;
              continue;
            }
            if (a(localView, 3))
            {
              i2 = localView.getRight();
              if (i2 <= i3) {
                break label534;
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      i5 = i2;
      i2 = i1;
      break;
      int i6 = localView.getLeft();
      i2 = i6;
      i5 = i3;
      if (i6 < i1) {
        break;
      }
      i2 = i1;
      i5 = i3;
      break;
      paramCanvas.clipRect(i3, 0, i1, getHeight());
      i2 = i1;
      boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restoreToCount(i8);
      if ((this.i > 0.0F) && (bool1))
      {
        i1 = (int)(((this.h & 0xFF000000) >>> 24) * this.i);
        i4 = this.h;
        this.j.setColor(i1 << 24 | i4 & 0xFFFFFF);
        paramCanvas.drawRect(i3, 0.0F, i2, getHeight(), this.j);
      }
      do
      {
        return bool2;
        if ((this.z != null) && (a(paramView, 3)))
        {
          i1 = this.z.getIntrinsicWidth();
          i2 = paramView.getRight();
          i3 = this.k.b();
          f1 = Math.max(0.0F, Math.min(i2 / i3, 1.0F));
          this.z.setBounds(i2, paramView.getTop(), i1 + i2, paramView.getBottom());
          this.z.setAlpha((int)(255.0F * f1));
          this.z.draw(paramCanvas);
          return bool2;
        }
      } while ((this.A == null) || (!a(paramView, 5)));
      i1 = this.A.getIntrinsicWidth();
      i2 = paramView.getLeft();
      i3 = getWidth();
      i4 = this.l.b();
      float f1 = Math.max(0.0F, Math.min((i3 - i2) / i4, 1.0F));
      this.A.setBounds(i2 - i1, paramView.getTop(), i2, paramView.getBottom());
      this.A.setAlpha((int)(255.0F * f1));
      this.A.draw(paramCanvas);
      return bool2;
      label534:
      i2 = i3;
    }
  }
  
  int e(View paramView)
  {
    return n.a(((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a, bn.h(this));
  }
  
  boolean f(View paramView)
  {
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a == 0;
  }
  
  boolean g(View paramView)
  {
    return (n.a(((DrawerLayout.LayoutParams)paramView.getLayoutParams()).a, bn.h(paramView)) & 0x7) != 0;
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    return new DrawerLayout.LayoutParams(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    return new DrawerLayout.LayoutParams(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof DrawerLayout.LayoutParams)) {
      return new DrawerLayout.LayoutParams((DrawerLayout.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new DrawerLayout.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new DrawerLayout.LayoutParams(paramLayoutParams);
  }
  
  public float getDrawerElevation()
  {
    if (d) {
      return this.f;
    }
    return 0.0F;
  }
  
  public Drawable getStatusBarBackgroundDrawable()
  {
    return this.y;
  }
  
  public void h(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    if (this.q)
    {
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      localLayoutParams.b = 1.0F;
      localLayoutParams.d = true;
      a(paramView, true);
    }
    for (;;)
    {
      invalidate();
      return;
      if (a(paramView, 3)) {
        this.k.a(paramView, 0, paramView.getTop());
      } else {
        this.l.a(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
      }
    }
  }
  
  public void i(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a sliding drawer");
    }
    if (this.q)
    {
      paramView = (DrawerLayout.LayoutParams)paramView.getLayoutParams();
      paramView.b = 0.0F;
      paramView.d = false;
    }
    for (;;)
    {
      invalidate();
      return;
      if (a(paramView, 3)) {
        this.k.a(paramView, -paramView.getWidth(), paramView.getTop());
      } else {
        this.l.a(paramView, getWidth(), paramView.getTop());
      }
    }
  }
  
  public boolean j(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).d;
  }
  
  public boolean k(View paramView)
  {
    if (!g(paramView)) {
      throw new IllegalArgumentException("View " + paramView + " is not a drawer");
    }
    return ((DrawerLayout.LayoutParams)paramView.getLayoutParams()).b > 0.0F;
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.q = true;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.q = true;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    if ((this.E) && (this.y != null))
    {
      int i1 = a.a(this.D);
      if (i1 > 0)
      {
        this.y.setBounds(0, 0, getWidth(), i1);
        this.y.draw(paramCanvas);
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    int i1 = ak.a(paramMotionEvent);
    boolean bool2 = this.k.a(paramMotionEvent);
    boolean bool3 = this.l.a(paramMotionEvent);
    switch (i1)
    {
    default: 
      i1 = 0;
      if (((bool2 | bool3)) || (i1 != 0) || (i()) || (this.u)) {
        bool1 = true;
      }
      return bool1;
    case 0: 
      label63:
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.w = f1;
      this.x = f2;
      if (this.i > 0.0F)
      {
        paramMotionEvent = this.k.d((int)f1, (int)f2);
        if ((paramMotionEvent == null) || (!f(paramMotionEvent))) {
          break;
        }
      }
      break;
    }
    for (i1 = 1;; i1 = 0)
    {
      this.t = false;
      this.u = false;
      break label63;
      if (!this.k.d(3)) {
        break;
      }
      this.m.a();
      this.n.a();
      i1 = 0;
      break label63;
      a(true);
      this.t = false;
      this.u = false;
      break;
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (j()))
    {
      s.b(paramKeyEvent);
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      paramKeyEvent = k();
      if ((paramKeyEvent != null) && (a(paramKeyEvent) == 0)) {
        b();
      }
      return paramKeyEvent != null;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.p = true;
    int i4 = paramInt3 - paramInt1;
    int i5 = getChildCount();
    paramInt3 = 0;
    if (paramInt3 < i5)
    {
      View localView = getChildAt(paramInt3);
      if (localView.getVisibility() == 8) {}
      DrawerLayout.LayoutParams localLayoutParams;
      for (;;)
      {
        paramInt3 += 1;
        break;
        localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
        if (!f(localView)) {
          break label113;
        }
        localView.layout(localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.leftMargin + localView.getMeasuredWidth(), localLayoutParams.topMargin + localView.getMeasuredHeight());
      }
      label113:
      int i6 = localView.getMeasuredWidth();
      int i7 = localView.getMeasuredHeight();
      int i1;
      float f1;
      label167:
      int i2;
      if (a(localView, 3))
      {
        paramInt1 = -i6;
        i1 = (int)(i6 * localLayoutParams.b) + paramInt1;
        f1 = (i6 + i1) / i6;
        if (f1 == localLayoutParams.b) {
          break label314;
        }
        i2 = 1;
        label181:
        switch (localLayoutParams.a & 0x70)
        {
        default: 
          localView.layout(i1, localLayoutParams.topMargin, i6 + i1, i7 + localLayoutParams.topMargin);
          label241:
          if (i2 != 0) {
            b(localView, f1);
          }
          if (localLayoutParams.b <= 0.0F) {
            break;
          }
        }
      }
      for (paramInt1 = 0; localView.getVisibility() != paramInt1; paramInt1 = 4)
      {
        localView.setVisibility(paramInt1);
        break;
        i1 = i4 - (int)(i6 * localLayoutParams.b);
        f1 = (i4 - i1) / i6;
        break label167;
        label314:
        i2 = 0;
        break label181;
        paramInt1 = paramInt4 - paramInt2;
        localView.layout(i1, paramInt1 - localLayoutParams.bottomMargin - localView.getMeasuredHeight(), i6 + i1, paramInt1 - localLayoutParams.bottomMargin);
        break label241;
        int i8 = paramInt4 - paramInt2;
        int i3 = (i8 - i7) / 2;
        if (i3 < localLayoutParams.topMargin) {
          paramInt1 = localLayoutParams.topMargin;
        }
        for (;;)
        {
          localView.layout(i1, paramInt1, i6 + i1, i7 + paramInt1);
          break;
          paramInt1 = i3;
          if (i3 + i7 > i8 - localLayoutParams.bottomMargin) {
            paramInt1 = i8 - localLayoutParams.bottomMargin - i7;
          }
        }
      }
    }
    this.p = false;
    this.q = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i3 = 300;
    int i6 = View.MeasureSpec.getMode(paramInt1);
    int i5 = View.MeasureSpec.getMode(paramInt2);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i4 = View.MeasureSpec.getSize(paramInt2);
    int i1;
    label84:
    label109:
    label124:
    View localView;
    if (i6 == 1073741824)
    {
      i1 = i2;
      if (i5 == 1073741824) {}
    }
    else
    {
      if (!isInEditMode()) {
        break label197;
      }
      if (i6 == Integer.MIN_VALUE)
      {
        i1 = i2;
        if (i5 != Integer.MIN_VALUE) {
          break label173;
        }
        i2 = i4;
        i3 = i1;
        setMeasuredDimension(i3, i2);
        if ((this.D == null) || (!bn.s(this))) {
          break label208;
        }
        i1 = 1;
        i5 = bn.h(this);
        i6 = getChildCount();
        i4 = 0;
        if (i4 >= i6) {
          return;
        }
        localView = getChildAt(i4);
        if (localView.getVisibility() != 8) {
          break label214;
        }
      }
    }
    for (;;)
    {
      i4 += 1;
      break label124;
      i1 = i2;
      if (i6 != 0) {
        break;
      }
      i1 = 300;
      break;
      label173:
      i2 = i3;
      i3 = i1;
      if (i5 == 0) {
        break label84;
      }
      i2 = i4;
      i3 = i1;
      break label84;
      label197:
      throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
      label208:
      i1 = 0;
      break label109;
      label214:
      DrawerLayout.LayoutParams localLayoutParams = (DrawerLayout.LayoutParams)localView.getLayoutParams();
      if (i1 != 0)
      {
        i7 = n.a(localLayoutParams.a, i5);
        if (!bn.s(localView)) {
          break label317;
        }
        a.a(localView, this.D, i7);
      }
      for (;;)
      {
        if (!f(localView)) {
          break label336;
        }
        localView.measure(View.MeasureSpec.makeMeasureSpec(i3 - localLayoutParams.leftMargin - localLayoutParams.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(i2 - localLayoutParams.topMargin - localLayoutParams.bottomMargin, 1073741824));
        break;
        label317:
        a.a(localLayoutParams, this.D, i7);
      }
      label336:
      if (!g(localView)) {
        break label495;
      }
      if ((d) && (bn.r(localView) != this.f)) {
        bn.f(localView, this.f);
      }
      int i7 = e(localView) & 0x7;
      if ((0x0 & i7) != 0) {
        throw new IllegalStateException("Child drawer has absolute gravity " + c(i7) + " but this " + "DrawerLayout" + " already has a " + "drawer view along that edge");
      }
      localView.measure(getChildMeasureSpec(paramInt1, this.g + localLayoutParams.leftMargin + localLayoutParams.rightMargin, localLayoutParams.width), getChildMeasureSpec(paramInt2, localLayoutParams.topMargin + localLayoutParams.bottomMargin, localLayoutParams.height));
    }
    label495:
    throw new IllegalStateException("Child " + localView + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, " + "Gravity.RIGHT or Gravity.NO_GRAVITY");
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (DrawerLayout.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (paramParcelable.a != 0)
    {
      View localView = b(paramParcelable.a);
      if (localView != null) {
        h(localView);
      }
    }
    a(paramParcelable.b, 3);
    a(paramParcelable.c, 5);
  }
  
  public void onRtlPropertiesChanged(int paramInt)
  {
    f();
  }
  
  protected Parcelable onSaveInstanceState()
  {
    DrawerLayout.SavedState localSavedState = new DrawerLayout.SavedState(super.onSaveInstanceState());
    View localView = a();
    if (localView != null) {
      localSavedState.a = ((DrawerLayout.LayoutParams)localView.getLayoutParams()).a;
    }
    localSavedState.b = this.r;
    localSavedState.c = this.s;
    return localSavedState;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    this.k.b(paramMotionEvent);
    this.l.b(paramMotionEvent);
    float f1;
    float f2;
    boolean bool;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 2: 
    default: 
      return true;
    case 0: 
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      this.w = f1;
      this.x = f2;
      this.t = false;
      this.u = false;
      return true;
    case 1: 
      f2 = paramMotionEvent.getX();
      f1 = paramMotionEvent.getY();
      paramMotionEvent = this.k.d((int)f2, (int)f1);
      if ((paramMotionEvent != null) && (f(paramMotionEvent)))
      {
        f2 -= this.w;
        f1 -= this.x;
        int i1 = this.k.d();
        if (f2 * f2 + f1 * f1 < i1 * i1)
        {
          paramMotionEvent = a();
          if (paramMotionEvent != null) {
            if (a(paramMotionEvent) == 2) {
              bool = true;
            }
          }
        }
      }
      break;
    }
    for (;;)
    {
      a(bool);
      this.t = false;
      return true;
      bool = false;
      continue;
      a(true);
      this.t = false;
      this.u = false;
      return true;
      bool = true;
    }
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    this.t = paramBoolean;
    if (paramBoolean) {
      a(true);
    }
  }
  
  public void requestLayout()
  {
    if (!this.p) {
      super.requestLayout();
    }
  }
  
  public void setDrawerElevation(float paramFloat)
  {
    this.f = paramFloat;
    int i1 = 0;
    while (i1 < getChildCount())
    {
      View localView = getChildAt(i1);
      if (g(localView)) {
        bn.f(localView, this.f);
      }
      i1 += 1;
    }
  }
  
  public void setDrawerListener(j paramj)
  {
    this.v = paramj;
  }
  
  public void setDrawerLockMode(int paramInt)
  {
    a(paramInt, 3);
    a(paramInt, 5);
  }
  
  public void setScrimColor(int paramInt)
  {
    this.h = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt)
  {
    if (paramInt != 0) {}
    for (Drawable localDrawable = android.support.v4.content.a.a(getContext(), paramInt);; localDrawable = null)
    {
      this.y = localDrawable;
      invalidate();
      return;
    }
  }
  
  public void setStatusBarBackground(Drawable paramDrawable)
  {
    this.y = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt)
  {
    this.y = new ColorDrawable(paramInt);
    invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\DrawerLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */