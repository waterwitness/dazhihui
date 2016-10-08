package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.os.l;
import android.support.v4.view.bn;
import android.support.v4.view.cj;
import android.support.v4.widget.q;
import android.support.v7.a.b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class RecyclerView
  extends ViewGroup
  implements android.support.v4.view.at, android.support.v4.view.bh
{
  private static final Interpolator ao;
  private static final boolean i;
  private static final Class<?>[] j;
  private boolean A;
  private boolean B;
  private int C;
  private boolean D;
  private final boolean E;
  private final AccessibilityManager F;
  private List<ax> G;
  private boolean H = false;
  private int I = 0;
  private q J;
  private q K;
  private q L;
  private q M;
  private int N = 0;
  private int O = -1;
  private VelocityTracker P;
  private int Q;
  private int R;
  private int S;
  private int T;
  private int U;
  private final int V;
  private final int W;
  final bb a = new bb(this);
  private float aa = Float.MIN_VALUE;
  private final bj ab = new bj(this);
  private az ac;
  private List<az> ad;
  private as ae = new au(this, null);
  private boolean af = false;
  private bl ag;
  private ap ah;
  private final int[] ai = new int[2];
  private final android.support.v4.view.au aj;
  private final int[] ak = new int[2];
  private final int[] al = new int[2];
  private final int[] am = new int[2];
  private Runnable an = new ah(this);
  private final bw ap = new aj(this);
  a b;
  d c;
  final bu d = new bu();
  aq e = new g();
  final bh f = new bh();
  boolean g = false;
  boolean h = false;
  private final bd k = new bd(this, null);
  private RecyclerView.SavedState l;
  private boolean m;
  private final Runnable n = new ag(this);
  private final Rect o = new Rect();
  private am p;
  private aw q;
  private bc r;
  private final ArrayList<av> s = new ArrayList();
  private final ArrayList<ay> t = new ArrayList();
  private ay u;
  private boolean v;
  private boolean w;
  private boolean x;
  private boolean y;
  private boolean z;
  
  static
  {
    if ((Build.VERSION.SDK_INT == 18) || (Build.VERSION.SDK_INT == 19) || (Build.VERSION.SDK_INT == 20)) {}
    for (boolean bool = true;; bool = false)
    {
      i = bool;
      j = new Class[] { Context.class, AttributeSet.class, Integer.TYPE, Integer.TYPE };
      ao = new ai();
      return;
    }
  }
  
  public RecyclerView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public RecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setScrollContainer(true);
    setFocusableInTouchMode(true);
    Object localObject;
    if (Build.VERSION.SDK_INT >= 16)
    {
      bool = true;
      this.E = bool;
      localObject = ViewConfiguration.get(paramContext);
      this.U = ((ViewConfiguration)localObject).getScaledTouchSlop();
      this.V = ((ViewConfiguration)localObject).getScaledMinimumFlingVelocity();
      this.W = ((ViewConfiguration)localObject).getScaledMaximumFlingVelocity();
      if (bn.a(this) != 2) {
        break label430;
      }
    }
    label430:
    for (boolean bool = true;; bool = false)
    {
      setWillNotDraw(bool);
      this.e.a(this.ae);
      a();
      s();
      if (bn.e(this) == 0) {
        bn.c(this, 1);
      }
      this.F = ((AccessibilityManager)getContext().getSystemService("accessibility"));
      setAccessibilityDelegateCompat(new bl(this));
      if (paramAttributeSet != null)
      {
        localObject = paramContext.obtainStyledAttributes(paramAttributeSet, b.RecyclerView, paramInt, 0);
        String str = ((TypedArray)localObject).getString(b.RecyclerView_layoutManager);
        ((TypedArray)localObject).recycle();
        a(paramContext, str, paramAttributeSet, paramInt, 0);
      }
      this.aj = new android.support.v4.view.au(this);
      setNestedScrollingEnabled(true);
      return;
      bool = false;
      break;
    }
  }
  
  private void A()
  {
    this.I -= 1;
    if (this.I < 1)
    {
      this.I = 0;
      B();
    }
  }
  
  private void B()
  {
    int i1 = this.C;
    this.C = 0;
    if ((i1 != 0) && (i()))
    {
      AccessibilityEvent localAccessibilityEvent = AccessibilityEvent.obtain();
      localAccessibilityEvent.setEventType(2048);
      android.support.v4.view.a.a.a(localAccessibilityEvent, i1);
      sendAccessibilityEventUnchecked(localAccessibilityEvent);
    }
  }
  
  private void C()
  {
    if ((!this.af) && (this.v))
    {
      bn.a(this, this.an);
      this.af = true;
    }
  }
  
  private boolean D()
  {
    return (this.e != null) && (this.q.b());
  }
  
  private void E()
  {
    boolean bool2 = true;
    if (this.H)
    {
      this.b.a();
      o();
      this.q.a(this);
    }
    int i1;
    label69:
    bh localbh;
    if ((this.e != null) && (this.q.b()))
    {
      this.b.b();
      if ((!this.g) && (!this.h)) {
        break label187;
      }
      i1 = 1;
      localbh = this.f;
      if ((!this.x) || (this.e == null) || ((!this.H) && (i1 == 0) && (!aw.a(this.q))) || ((this.H) && (!this.p.hasStableIds()))) {
        break label192;
      }
      bool1 = true;
      label128:
      bh.c(localbh, bool1);
      localbh = this.f;
      if ((!bh.b(this.f)) || (i1 == 0) || (this.H) || (!D())) {
        break label197;
      }
    }
    label187:
    label192:
    label197:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      bh.d(localbh, bool1);
      return;
      this.b.e();
      break;
      i1 = 0;
      break label69;
      bool1 = false;
      break label128;
    }
  }
  
  private void F()
  {
    if (this.H) {
      return;
    }
    this.H = true;
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      bk localbk = b(this.c.c(i1));
      if ((localbk != null) && (!localbk.shouldIgnore())) {
        localbk.addFlags(512);
      }
      i1 += 1;
    }
    this.a.g();
  }
  
  private void G()
  {
    int i2 = this.c.b();
    int i1 = 0;
    while (i1 < i2)
    {
      View localView = this.c.b(i1);
      Object localObject = a(localView);
      if ((localObject != null) && (((bk)localObject).mShadowingHolder != null))
      {
        localObject = ((bk)localObject).mShadowingHolder.itemView;
        int i3 = localView.getLeft();
        int i4 = localView.getTop();
        if ((i3 != ((View)localObject).getLeft()) || (i4 != ((View)localObject).getTop())) {
          ((View)localObject).layout(i3, i4, ((View)localObject).getWidth() + i3, ((View)localObject).getHeight() + i4);
        }
      }
      i1 += 1;
    }
  }
  
  private String a(Context paramContext, String paramString)
  {
    if (paramString.charAt(0) == '.') {
      paramContext = paramContext.getPackageName() + paramString;
    }
    do
    {
      return paramContext;
      paramContext = paramString;
    } while (paramString.contains("."));
    return RecyclerView.class.getPackage().getName() + '.' + paramString;
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    int i2 = 1;
    int i3 = 0;
    int i1;
    if (paramFloat2 < 0.0F)
    {
      d();
      i1 = i3;
      if (this.J.a(-paramFloat2 / getWidth(), 1.0F - paramFloat3 / getHeight())) {
        i1 = 1;
      }
      if (paramFloat4 >= 0.0F) {
        break label158;
      }
      f();
      if (!this.K.a(-paramFloat4 / getHeight(), paramFloat1 / getWidth())) {
        break label196;
      }
    }
    for (;;)
    {
      if ((i2 != 0) || (paramFloat2 != 0.0F) || (paramFloat4 != 0.0F)) {
        bn.d(this);
      }
      return;
      i1 = i3;
      if (paramFloat2 <= 0.0F) {
        break;
      }
      e();
      i1 = i3;
      if (!this.L.a(paramFloat2 / getWidth(), paramFloat3 / getHeight())) {
        break;
      }
      i1 = 1;
      break;
      label158:
      if (paramFloat4 > 0.0F)
      {
        g();
        if (this.M.a(paramFloat4 / getHeight(), 1.0F - paramFloat1 / getWidth())) {}
      }
      else
      {
        label196:
        i2 = i1;
      }
    }
  }
  
  private void a(Context paramContext, String paramString, AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    if (paramString != null)
    {
      paramString = paramString.trim();
      if (paramString.length() != 0)
      {
        String str = a(paramContext, paramString);
        try
        {
          if (isInEditMode()) {}
          Class localClass;
          for (paramString = getClass().getClassLoader();; paramString = paramContext.getClassLoader())
          {
            localClass = paramString.loadClass(str).asSubclass(aw.class);
            try
            {
              paramString = localClass.getConstructor(j);
              Object[] arrayOfObject = new Object[4];
              arrayOfObject[0] = paramContext;
              arrayOfObject[1] = paramAttributeSet;
              arrayOfObject[2] = Integer.valueOf(paramInt1);
              arrayOfObject[3] = Integer.valueOf(paramInt2);
              paramContext = arrayOfObject;
            }
            catch (NoSuchMethodException paramContext)
            {
              try
              {
                paramString = localClass.getConstructor(new Class[0]);
                paramContext = null;
              }
              catch (NoSuchMethodException paramString)
              {
                paramString.initCause(paramContext);
                throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, paramString);
              }
            }
            paramString.setAccessible(true);
            setLayoutManager((aw)paramString.newInstance(paramContext));
            return;
          }
          return;
        }
        catch (ClassNotFoundException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, paramContext);
        }
        catch (InvocationTargetException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, paramContext);
        }
        catch (InstantiationException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, paramContext);
        }
        catch (IllegalAccessException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, paramContext);
        }
        catch (ClassCastException paramContext)
        {
          throw new IllegalStateException(paramAttributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, paramContext);
        }
      }
    }
  }
  
  private void a(am paramam, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.p != null)
    {
      this.p.unregisterAdapterDataObserver(this.k);
      this.p.onDetachedFromRecyclerView(this);
    }
    if ((!paramBoolean1) || (paramBoolean2))
    {
      if (this.e != null) {
        this.e.c();
      }
      if (this.q != null)
      {
        this.q.c(this.a);
        this.q.b(this.a);
      }
      this.a.a();
    }
    this.b.a();
    am localam = this.p;
    this.p = paramam;
    if (paramam != null)
    {
      paramam.registerAdapterDataObserver(this.k);
      paramam.onAttachedToRecyclerView(this);
    }
    if (this.q != null) {
      this.q.a(localam, this.p);
    }
    this.a.a(localam, this.p, paramBoolean1);
    bh.a(this.f, true);
    o();
  }
  
  private void a(bk parambk, at paramat)
  {
    parambk.setFlags(0, 8192);
    if ((bh.c(this.f)) && (parambk.isUpdated()) && (!parambk.isRemoved()) && (!parambk.shouldIgnore()))
    {
      long l1 = a(parambk);
      this.d.a(l1, parambk);
    }
    this.d.a(parambk, paramat);
  }
  
  private void a(bk parambk, at paramat1, at paramat2)
  {
    parambk.setIsRecyclable(false);
    if (this.e.b(parambk, paramat1, paramat2)) {
      C();
    }
  }
  
  private void a(bk parambk1, bk parambk2, at paramat1, at paramat2)
  {
    parambk1.setIsRecyclable(false);
    if (parambk1 != parambk2)
    {
      parambk1.mShadowedHolder = parambk2;
      b(parambk1);
      this.a.d(parambk1);
      parambk2.setIsRecyclable(false);
      parambk2.mShadowingHolder = parambk1;
    }
    if (this.e.a(parambk1, parambk2, paramat1, paramat2)) {
      C();
    }
  }
  
  private void a(int[] paramArrayOfInt)
  {
    int i6 = this.c.b();
    if (i6 == 0)
    {
      paramArrayOfInt[0] = 0;
      paramArrayOfInt[1] = 0;
      return;
    }
    int i1 = Integer.MAX_VALUE;
    int i4 = Integer.MIN_VALUE;
    int i3 = 0;
    bk localbk;
    if (i3 < i6)
    {
      localbk = b(this.c.b(i3));
      if (!localbk.shouldIgnore()) {}
    }
    for (;;)
    {
      i3 += 1;
      break;
      int i5 = localbk.getLayoutPosition();
      int i2 = i1;
      if (i5 < i1) {
        i2 = i5;
      }
      if (i5 > i4)
      {
        i4 = i5;
        i1 = i2;
        continue;
        paramArrayOfInt[0] = i1;
        paramArrayOfInt[1] = i4;
      }
      else
      {
        i1 = i2;
      }
    }
  }
  
  private boolean a(MotionEvent paramMotionEvent)
  {
    int i2 = paramMotionEvent.getAction();
    if ((i2 == 3) || (i2 == 0)) {
      this.u = null;
    }
    int i3 = this.t.size();
    int i1 = 0;
    while (i1 < i3)
    {
      ay localay = (ay)this.t.get(i1);
      if ((localay.a(this, paramMotionEvent)) && (i2 != 3))
      {
        this.u = localay;
        return true;
      }
      i1 += 1;
    }
    return false;
  }
  
  static bk b(View paramView)
  {
    if (paramView == null) {
      return null;
    }
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).a;
  }
  
  private void b(bk parambk)
  {
    View localView = parambk.itemView;
    if (localView.getParent() == this) {}
    for (int i1 = 1;; i1 = 0)
    {
      this.a.d(a(localView));
      if (!parambk.isTmpDetached()) {
        break;
      }
      this.c.a(localView, -1, localView.getLayoutParams(), true);
      return;
    }
    if (i1 == 0)
    {
      this.c.a(localView, true);
      return;
    }
    this.c.d(localView);
  }
  
  private void b(bk parambk, at paramat1, at paramat2)
  {
    b(parambk);
    parambk.setIsRecyclable(false);
    if (this.e.a(parambk, paramat1, paramat2)) {
      C();
    }
  }
  
  private boolean b(MotionEvent paramMotionEvent)
  {
    int i1 = paramMotionEvent.getAction();
    int i2;
    if (this.u != null)
    {
      if (i1 == 0) {
        this.u = null;
      }
    }
    else
    {
      if (i1 == 0) {
        break label107;
      }
      i2 = this.t.size();
      i1 = 0;
    }
    while (i1 < i2)
    {
      ay localay = (ay)this.t.get(i1);
      if (localay.a(this, paramMotionEvent))
      {
        this.u = localay;
        return true;
        this.u.b(this, paramMotionEvent);
        if ((i1 == 3) || (i1 == 1)) {
          this.u = null;
        }
        return true;
      }
      i1 += 1;
    }
    label107:
    return false;
  }
  
  private void c(MotionEvent paramMotionEvent)
  {
    int i1 = android.support.v4.view.ak.b(paramMotionEvent);
    if (android.support.v4.view.ak.b(paramMotionEvent, i1) == this.O) {
      if (i1 != 0) {
        break label75;
      }
    }
    label75:
    for (i1 = 1;; i1 = 0)
    {
      this.O = android.support.v4.view.ak.b(paramMotionEvent, i1);
      int i2 = (int)(android.support.v4.view.ak.c(paramMotionEvent, i1) + 0.5F);
      this.S = i2;
      this.Q = i2;
      i1 = (int)(android.support.v4.view.ak.d(paramMotionEvent, i1) + 0.5F);
      this.T = i1;
      this.R = i1;
      return;
    }
  }
  
  private boolean c(bk parambk)
  {
    return (this.e == null) || (this.e.g(parambk));
  }
  
  private int d(bk parambk)
  {
    if ((parambk.hasAnyOfTheFlags(524)) || (!parambk.isBound())) {
      return -1;
    }
    return this.b.c(parambk.mPosition);
  }
  
  private void f(int paramInt)
  {
    if (this.q == null) {
      return;
    }
    this.q.e(paramInt);
    awakenScrollBars();
  }
  
  private boolean g(View paramView)
  {
    b();
    boolean bool = this.c.f(paramView);
    if (bool)
    {
      paramView = b(paramView);
      this.a.d(paramView);
      this.a.b(paramView);
    }
    a(false);
    return bool;
  }
  
  private float getScrollFactor()
  {
    if (this.aa == Float.MIN_VALUE)
    {
      TypedValue localTypedValue = new TypedValue();
      if (getContext().getTheme().resolveAttribute(16842829, localTypedValue, true)) {
        this.aa = localTypedValue.getDimension(getContext().getResources().getDisplayMetrics());
      }
    }
    else
    {
      return this.aa;
    }
    return 0.0F;
  }
  
  private void h(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (this.J != null)
    {
      bool1 = bool2;
      if (!this.J.a())
      {
        bool1 = bool2;
        if (paramInt1 > 0) {
          bool1 = this.J.c();
        }
      }
    }
    bool2 = bool1;
    if (this.L != null)
    {
      bool2 = bool1;
      if (!this.L.a())
      {
        bool2 = bool1;
        if (paramInt1 < 0) {
          bool2 = bool1 | this.L.c();
        }
      }
    }
    bool1 = bool2;
    if (this.K != null)
    {
      bool1 = bool2;
      if (!this.K.a())
      {
        bool1 = bool2;
        if (paramInt2 > 0) {
          bool1 = bool2 | this.K.c();
        }
      }
    }
    bool2 = bool1;
    if (this.M != null)
    {
      bool2 = bool1;
      if (!this.M.a())
      {
        bool2 = bool1;
        if (paramInt2 < 0) {
          bool2 = bool1 | this.M.c();
        }
      }
    }
    if (bool2) {
      bn.d(this);
    }
  }
  
  private void h(View paramView)
  {
    bk localbk = b(paramView);
    e(paramView);
    if ((this.p != null) && (localbk != null)) {
      this.p.onViewDetachedFromWindow(localbk);
    }
    if (this.G != null)
    {
      int i1 = this.G.size() - 1;
      while (i1 >= 0)
      {
        ((ax)this.G.get(i1)).b(paramView);
        i1 -= 1;
      }
    }
  }
  
  private void i(int paramInt1, int paramInt2)
  {
    int i2 = View.MeasureSpec.getMode(paramInt1);
    int i1 = View.MeasureSpec.getMode(paramInt2);
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    switch (i2)
    {
    default: 
      paramInt1 = bn.n(this);
    }
    switch (i1)
    {
    default: 
      paramInt2 = bn.o(this);
    }
    setMeasuredDimension(paramInt1, paramInt2);
  }
  
  private void i(View paramView)
  {
    bk localbk = b(paramView);
    d(paramView);
    if ((this.p != null) && (localbk != null)) {
      this.p.onViewAttachedToWindow(localbk);
    }
    if (this.G != null)
    {
      int i1 = this.G.size() - 1;
      while (i1 >= 0)
      {
        ((ax)this.G.get(i1)).a(paramView);
        i1 -= 1;
      }
    }
  }
  
  private boolean j(int paramInt1, int paramInt2)
  {
    boolean bool2 = false;
    int i2 = this.c.b();
    boolean bool1;
    if (i2 == 0) {
      if (paramInt1 == 0)
      {
        bool1 = bool2;
        if (paramInt2 == 0) {}
      }
      else
      {
        bool1 = true;
      }
    }
    int i1;
    do
    {
      return bool1;
      i1 = 0;
      bool1 = bool2;
    } while (i1 >= i2);
    bk localbk = b(this.c.b(i1));
    if (localbk.shouldIgnore()) {}
    int i3;
    do
    {
      i1 += 1;
      break;
      i3 = localbk.getLayoutPosition();
    } while ((i3 >= paramInt1) && (i3 <= paramInt2));
    return true;
  }
  
  private void s()
  {
    this.c = new d(new ak(this));
  }
  
  private void setScrollState(int paramInt)
  {
    if (paramInt == this.N) {
      return;
    }
    this.N = paramInt;
    if (paramInt != 2) {
      v();
    }
    e(paramInt);
  }
  
  private void t()
  {
    if (!this.x) {}
    label106:
    do
    {
      do
      {
        return;
        if (this.H)
        {
          l.a("RV FullInvalidate");
          k();
          l.a();
          return;
        }
      } while (!this.b.d());
      if ((this.b.a(4)) && (!this.b.a(11)))
      {
        l.a("RV PartialInvalidate");
        b();
        this.b.b();
        if (!this.z)
        {
          if (!u()) {
            break label106;
          }
          k();
        }
        for (;;)
        {
          a(true);
          l.a();
          return;
          this.b.c();
        }
      }
    } while (!this.b.d());
    l.a("RV FullInvalidate");
    k();
    l.a();
  }
  
  private boolean u()
  {
    boolean bool2 = false;
    int i2 = this.c.b();
    int i1 = 0;
    boolean bool1 = bool2;
    if (i1 < i2)
    {
      bk localbk = b(this.c.b(i1));
      if ((localbk == null) || (localbk.shouldIgnore())) {}
      while (!localbk.isUpdated())
      {
        i1 += 1;
        break;
      }
      bool1 = true;
    }
    return bool1;
  }
  
  private void v()
  {
    this.ab.b();
    if (this.q != null) {
      this.q.z();
    }
  }
  
  private void w()
  {
    boolean bool2 = false;
    if (this.J != null) {
      bool2 = this.J.c();
    }
    boolean bool1 = bool2;
    if (this.K != null) {
      bool1 = bool2 | this.K.c();
    }
    bool2 = bool1;
    if (this.L != null) {
      bool2 = bool1 | this.L.c();
    }
    bool1 = bool2;
    if (this.M != null) {
      bool1 = bool2 | this.M.c();
    }
    if (bool1) {
      bn.d(this);
    }
  }
  
  private void x()
  {
    if (this.P != null) {
      this.P.clear();
    }
    stopNestedScroll();
    w();
  }
  
  private void y()
  {
    x();
    setScrollState(0);
  }
  
  private void z()
  {
    this.I += 1;
  }
  
  long a(bk parambk)
  {
    if (this.p.hasStableIds()) {
      return parambk.getItemId();
    }
    return parambk.mPosition;
  }
  
  bk a(int paramInt, boolean paramBoolean)
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      bk localbk = b(this.c.c(i1));
      if ((localbk != null) && (!localbk.isRemoved())) {
        if (paramBoolean)
        {
          if (localbk.mPosition != paramInt) {}
        }
        else {
          while (localbk.getLayoutPosition() == paramInt) {
            return localbk;
          }
        }
      }
      i1 += 1;
    }
    return null;
  }
  
  public bk a(View paramView)
  {
    ViewParent localViewParent = paramView.getParent();
    if ((localViewParent != null) && (localViewParent != this)) {
      throw new IllegalArgumentException("View " + paramView + " is not a direct child of " + this);
    }
    return b(paramView);
  }
  
  void a()
  {
    this.b = new a(new al(this));
  }
  
  public void a(int paramInt)
  {
    if (this.A) {
      return;
    }
    if (this.q == null)
    {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      return;
    }
    this.q.a(this, this.f, paramInt);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (this.q == null) {
      Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    }
    for (;;)
    {
      return;
      if (!this.A)
      {
        if (!this.q.d()) {
          paramInt1 = 0;
        }
        if (!this.q.e()) {
          paramInt2 = i1;
        }
        while ((paramInt1 != 0) || (paramInt2 != 0))
        {
          this.ab.b(paramInt1, paramInt2);
          return;
        }
      }
    }
  }
  
  void a(int paramInt1, int paramInt2, Object paramObject)
  {
    int i2 = this.c.c();
    int i1 = 0;
    if (i1 < i2)
    {
      View localView = this.c.c(i1);
      bk localbk = b(localView);
      if ((localbk == null) || (localbk.shouldIgnore())) {}
      for (;;)
      {
        i1 += 1;
        break;
        if ((localbk.mPosition >= paramInt1) && (localbk.mPosition < paramInt1 + paramInt2))
        {
          localbk.addFlags(2);
          localbk.addChangePayload(paramObject);
          ((RecyclerView.LayoutParams)localView.getLayoutParams()).c = true;
        }
      }
    }
    this.a.c(paramInt1, paramInt2);
  }
  
  void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int i2 = this.c.c();
    int i1 = 0;
    if (i1 < i2)
    {
      bk localbk = b(this.c.c(i1));
      if ((localbk != null) && (!localbk.shouldIgnore()))
      {
        if (localbk.mPosition < paramInt1 + paramInt2) {
          break label83;
        }
        localbk.offsetPosition(-paramInt2, paramBoolean);
        bh.a(this.f, true);
      }
      for (;;)
      {
        i1 += 1;
        break;
        label83:
        if (localbk.mPosition >= paramInt1)
        {
          localbk.flagRemovedAndOffsetPosition(paramInt1 - 1, -paramInt2, paramBoolean);
          bh.a(this.f, true);
        }
      }
    }
    this.a.b(paramInt1, paramInt2, paramBoolean);
    requestLayout();
  }
  
  void a(String paramString)
  {
    if (j())
    {
      if (paramString == null) {
        throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
      }
      throw new IllegalStateException(paramString);
    }
  }
  
  void a(boolean paramBoolean)
  {
    if (this.y)
    {
      if ((paramBoolean) && (this.z) && (!this.A) && (this.q != null) && (this.p != null)) {
        k();
      }
      this.y = false;
      if (!this.A) {
        this.z = false;
      }
    }
  }
  
  boolean a(int paramInt1, int paramInt2, MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    t();
    int i2;
    int i1;
    int i3;
    int i4;
    if (this.p != null)
    {
      b();
      z();
      l.a("RV Scroll");
      if (paramInt1 != 0)
      {
        i2 = this.q.a(paramInt1, this.a, this.f);
        i1 = paramInt1 - i2;
        if (paramInt2 != 0)
        {
          i3 = this.q.b(paramInt2, this.a, this.f);
          i4 = paramInt2 - i3;
          label84:
          l.a();
          G();
          A();
          a(false);
          int i5 = i3;
          i3 = i1;
          i1 = i5;
        }
      }
    }
    for (;;)
    {
      if (!this.s.isEmpty()) {
        invalidate();
      }
      if (dispatchNestedScroll(i2, i1, i3, i4, this.ak))
      {
        this.S -= this.ak[0];
        this.T -= this.ak[1];
        if (paramMotionEvent != null) {
          paramMotionEvent.offsetLocation(this.ak[0], this.ak[1]);
        }
        paramMotionEvent = this.am;
        paramMotionEvent[0] += this.ak[0];
        paramMotionEvent = this.am;
        paramMotionEvent[1] += this.ak[1];
      }
      for (;;)
      {
        if ((i2 != 0) || (i1 != 0)) {
          g(i2, i1);
        }
        if (!awakenScrollBars()) {
          invalidate();
        }
        if ((i2 != 0) || (i1 != 0)) {
          bool = true;
        }
        return bool;
        if (bn.a(this) != 2)
        {
          if (paramMotionEvent != null) {
            a(paramMotionEvent.getX(), i3, paramMotionEvent.getY(), i4);
          }
          h(paramInt1, paramInt2);
        }
      }
      i3 = 0;
      i4 = 0;
      break label84;
      i2 = 0;
      i1 = 0;
      break;
      i1 = 0;
      i2 = 0;
      i4 = 0;
      i3 = 0;
    }
  }
  
  boolean a(AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool = false;
    int i2 = 0;
    if (j()) {
      if (paramAccessibilityEvent == null) {
        break label46;
      }
    }
    label46:
    for (int i1 = android.support.v4.view.a.a.b(paramAccessibilityEvent);; i1 = 0)
    {
      if (i1 == 0) {
        i1 = i2;
      }
      for (;;)
      {
        this.C = (i1 | this.C);
        bool = true;
        return bool;
      }
    }
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    if ((this.q == null) || (!this.q.a(this, paramArrayList, paramInt1, paramInt2))) {
      super.addFocusables(paramArrayList, paramInt1, paramInt2);
    }
  }
  
  void b()
  {
    if (!this.y)
    {
      this.y = true;
      if (!this.A) {
        this.z = false;
      }
    }
  }
  
  public void b(int paramInt)
  {
    int i2 = this.c.b();
    int i1 = 0;
    while (i1 < i2)
    {
      this.c.b(i1).offsetTopAndBottom(paramInt);
      i1 += 1;
    }
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    if (this.q == null) {
      Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
    }
    boolean bool2;
    int i1;
    do
    {
      do
      {
        return false;
      } while (this.A);
      bool1 = this.q.d();
      bool2 = this.q.e();
      if (bool1)
      {
        i1 = paramInt1;
        if (Math.abs(paramInt1) >= this.V) {}
      }
      else
      {
        i1 = 0;
      }
      if (bool2)
      {
        paramInt1 = paramInt2;
        if (Math.abs(paramInt2) >= this.V) {}
      }
      else
      {
        paramInt1 = 0;
      }
    } while (((i1 == 0) && (paramInt1 == 0)) || (dispatchNestedPreFling(i1, paramInt1)));
    if ((bool1) || (bool2)) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      dispatchNestedFling(i1, paramInt1, bool1);
      if (!bool1) {
        break;
      }
      paramInt2 = Math.max(-this.W, Math.min(i1, this.W));
      paramInt1 = Math.max(-this.W, Math.min(paramInt1, this.W));
      this.ab.a(paramInt2, paramInt1);
      return true;
    }
  }
  
  public int c(View paramView)
  {
    paramView = b(paramView);
    if (paramView != null) {
      return paramView.getLayoutPosition();
    }
    return -1;
  }
  
  public void c()
  {
    setScrollState(0);
    v();
  }
  
  public void c(int paramInt)
  {
    int i2 = this.c.b();
    int i1 = 0;
    while (i1 < i2)
    {
      this.c.b(i1).offsetLeftAndRight(paramInt);
      i1 += 1;
    }
  }
  
  void c(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      d();
      this.J.a(-paramInt1);
      if (paramInt2 >= 0) {
        break label69;
      }
      f();
      this.K.a(-paramInt2);
    }
    for (;;)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        bn.d(this);
      }
      return;
      if (paramInt1 <= 0) {
        break;
      }
      e();
      this.L.a(paramInt1);
      break;
      label69:
      if (paramInt2 > 0)
      {
        g();
        this.M.a(paramInt2);
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return ((paramLayoutParams instanceof RecyclerView.LayoutParams)) && (this.q.a((RecyclerView.LayoutParams)paramLayoutParams));
  }
  
  public int computeHorizontalScrollExtent()
  {
    if (this.q.d()) {
      return this.q.d(this.f);
    }
    return 0;
  }
  
  public int computeHorizontalScrollOffset()
  {
    if (this.q.d()) {
      return this.q.b(this.f);
    }
    return 0;
  }
  
  public int computeHorizontalScrollRange()
  {
    if (this.q.d()) {
      return this.q.f(this.f);
    }
    return 0;
  }
  
  public int computeVerticalScrollExtent()
  {
    if (this.q.e()) {
      return this.q.e(this.f);
    }
    return 0;
  }
  
  public int computeVerticalScrollOffset()
  {
    if (this.q.e()) {
      return this.q.c(this.f);
    }
    return 0;
  }
  
  public int computeVerticalScrollRange()
  {
    if (this.q.e()) {
      return this.q.g(this.f);
    }
    return 0;
  }
  
  void d()
  {
    if (this.J != null) {
      return;
    }
    this.J = new q(getContext());
    if (this.m)
    {
      this.J.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.J.a(getMeasuredHeight(), getMeasuredWidth());
  }
  
  public void d(int paramInt) {}
  
  void d(int paramInt1, int paramInt2)
  {
    int i5 = this.c.c();
    int i1;
    int i2;
    if (paramInt1 < paramInt2)
    {
      i1 = -1;
      i2 = paramInt2;
    }
    bk localbk;
    for (int i3 = paramInt1;; i3 = paramInt2)
    {
      int i4 = 0;
      for (;;)
      {
        if (i4 >= i5) {
          break label127;
        }
        localbk = b(this.c.c(i4));
        if ((localbk != null) && (localbk.mPosition >= i3) && (localbk.mPosition <= i2)) {
          break;
        }
        i4 += 1;
      }
      i1 = 1;
      i2 = paramInt1;
    }
    if (localbk.mPosition == paramInt1) {
      localbk.offsetPosition(paramInt2 - paramInt1, false);
    }
    for (;;)
    {
      bh.a(this.f, true);
      break;
      localbk.offsetPosition(i1, false);
    }
    label127:
    this.a.a(paramInt1, paramInt2);
    requestLayout();
  }
  
  public void d(View paramView) {}
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    return this.aj.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    return this.aj.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return this.aj.a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return this.aj.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt);
  }
  
  protected void dispatchRestoreInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchThawSelfOnly(paramSparseArray);
  }
  
  protected void dispatchSaveInstanceState(SparseArray<Parcelable> paramSparseArray)
  {
    dispatchFreezeSelfOnly(paramSparseArray);
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i3 = 1;
    int i4 = 0;
    super.draw(paramCanvas);
    int i2 = this.s.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((av)this.s.get(i1)).b(paramCanvas, this, this.f);
      i1 += 1;
    }
    int i5;
    if ((this.J != null) && (!this.J.a()))
    {
      i5 = paramCanvas.save();
      if (this.m)
      {
        i1 = getPaddingBottom();
        paramCanvas.rotate(270.0F);
        paramCanvas.translate(i1 + -getHeight(), 0.0F);
        if ((this.J == null) || (!this.J.a(paramCanvas))) {
          break label456;
        }
        i2 = 1;
        label128:
        paramCanvas.restoreToCount(i5);
      }
    }
    for (;;)
    {
      i1 = i2;
      if (this.K != null)
      {
        i1 = i2;
        if (!this.K.a())
        {
          i5 = paramCanvas.save();
          if (this.m) {
            paramCanvas.translate(getPaddingLeft(), getPaddingTop());
          }
          if ((this.K == null) || (!this.K.a(paramCanvas))) {
            break label461;
          }
          i1 = 1;
          label202:
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      i2 = i1;
      if (this.L != null)
      {
        i2 = i1;
        if (!this.L.a())
        {
          i5 = paramCanvas.save();
          int i6 = getWidth();
          if (!this.m) {
            break label466;
          }
          i2 = getPaddingTop();
          label257:
          paramCanvas.rotate(90.0F);
          paramCanvas.translate(-i2, -i6);
          if ((this.L == null) || (!this.L.a(paramCanvas))) {
            break label471;
          }
          i2 = 1;
          label295:
          i2 = i1 | i2;
          paramCanvas.restoreToCount(i5);
        }
      }
      i1 = i2;
      if (this.M != null)
      {
        i1 = i2;
        if (!this.M.a())
        {
          i5 = paramCanvas.save();
          paramCanvas.rotate(180.0F);
          if (!this.m) {
            break label476;
          }
          paramCanvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
          label372:
          i1 = i4;
          if (this.M != null)
          {
            i1 = i4;
            if (this.M.a(paramCanvas)) {
              i1 = 1;
            }
          }
          i1 = i2 | i1;
          paramCanvas.restoreToCount(i5);
        }
      }
      if ((i1 == 0) && (this.e != null) && (this.s.size() > 0) && (this.e.b())) {
        i1 = i3;
      }
      for (;;)
      {
        if (i1 != 0) {
          bn.d(this);
        }
        return;
        i1 = 0;
        break;
        label456:
        i2 = 0;
        break label128;
        label461:
        i1 = 0;
        break label202;
        label466:
        i2 = 0;
        break label257;
        label471:
        i2 = 0;
        break label295;
        label476:
        paramCanvas.translate(-getWidth(), -getHeight());
        break label372;
      }
      i2 = 0;
    }
  }
  
  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  void e()
  {
    if (this.L != null) {
      return;
    }
    this.L = new q(getContext());
    if (this.m)
    {
      this.L.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
      return;
    }
    this.L.a(getMeasuredHeight(), getMeasuredWidth());
  }
  
  void e(int paramInt)
  {
    if (this.q != null) {
      this.q.k(paramInt);
    }
    d(paramInt);
    if (this.ac != null) {
      this.ac.a(this, paramInt);
    }
    if (this.ad != null)
    {
      int i1 = this.ad.size() - 1;
      while (i1 >= 0)
      {
        ((az)this.ad.get(i1)).a(this, paramInt);
        i1 -= 1;
      }
    }
  }
  
  void e(int paramInt1, int paramInt2)
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      bk localbk = b(this.c.c(i1));
      if ((localbk != null) && (!localbk.shouldIgnore()) && (localbk.mPosition >= paramInt1))
      {
        localbk.offsetPosition(paramInt2, false);
        bh.a(this.f, true);
      }
      i1 += 1;
    }
    this.a.b(paramInt1, paramInt2);
    requestLayout();
  }
  
  public void e(View paramView) {}
  
  Rect f(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    if (!localLayoutParams.c) {
      return localLayoutParams.b;
    }
    Rect localRect = localLayoutParams.b;
    localRect.set(0, 0, 0, 0);
    int i2 = this.s.size();
    int i1 = 0;
    while (i1 < i2)
    {
      this.o.set(0, 0, 0, 0);
      ((av)this.s.get(i1)).a(this.o, paramView, this, this.f);
      localRect.left += this.o.left;
      localRect.top += this.o.top;
      localRect.right += this.o.right;
      localRect.bottom += this.o.bottom;
      i1 += 1;
    }
    localLayoutParams.c = false;
    return localRect;
  }
  
  void f()
  {
    if (this.K != null) {
      return;
    }
    this.K = new q(getContext());
    if (this.m)
    {
      this.K.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.K.a(getMeasuredWidth(), getMeasuredHeight());
  }
  
  public void f(int paramInt1, int paramInt2) {}
  
  public View focusSearch(View paramView, int paramInt)
  {
    Object localObject2 = this.q.d(paramView, paramInt);
    if (localObject2 != null) {}
    Object localObject1;
    do
    {
      return (View)localObject2;
      localObject2 = FocusFinder.getInstance().findNextFocus(this, paramView, paramInt);
      localObject1 = localObject2;
      if (localObject2 == null)
      {
        localObject1 = localObject2;
        if (this.p != null)
        {
          localObject1 = localObject2;
          if (this.q != null)
          {
            localObject1 = localObject2;
            if (!j())
            {
              localObject1 = localObject2;
              if (!this.A)
              {
                b();
                localObject1 = this.q.a(paramView, paramInt, this.a, this.f);
                a(false);
              }
            }
          }
        }
      }
      localObject2 = localObject1;
    } while (localObject1 != null);
    return super.focusSearch(paramView, paramInt);
  }
  
  void g()
  {
    if (this.M != null) {
      return;
    }
    this.M = new q(getContext());
    if (this.m)
    {
      this.M.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
      return;
    }
    this.M.a(getMeasuredWidth(), getMeasuredHeight());
  }
  
  void g(int paramInt1, int paramInt2)
  {
    int i1 = getScrollX();
    int i2 = getScrollY();
    onScrollChanged(i1, i2, i1, i2);
    f(paramInt1, paramInt2);
    if (this.ac != null) {
      this.ac.a(this, paramInt1, paramInt2);
    }
    if (this.ad != null)
    {
      i1 = this.ad.size() - 1;
      while (i1 >= 0)
      {
        ((az)this.ad.get(i1)).a(this, paramInt1, paramInt2);
        i1 -= 1;
      }
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    if (this.q == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.q.a();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    if (this.q == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.q.a(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (this.q == null) {
      throw new IllegalStateException("RecyclerView has no LayoutManager");
    }
    return this.q.a(paramLayoutParams);
  }
  
  public am getAdapter()
  {
    return this.p;
  }
  
  public int getBaseline()
  {
    if (this.q != null) {
      return this.q.q();
    }
    return super.getBaseline();
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    if (this.ah == null) {
      return super.getChildDrawingOrder(paramInt1, paramInt2);
    }
    return this.ah.a(paramInt1, paramInt2);
  }
  
  public bl getCompatAccessibilityDelegate()
  {
    return this.ag;
  }
  
  public aq getItemAnimator()
  {
    return this.e;
  }
  
  public aw getLayoutManager()
  {
    return this.q;
  }
  
  public int getMaxFlingVelocity()
  {
    return this.W;
  }
  
  public int getMinFlingVelocity()
  {
    return this.V;
  }
  
  public ba getRecycledViewPool()
  {
    return this.a.f();
  }
  
  public int getScrollState()
  {
    return this.N;
  }
  
  void h()
  {
    this.M = null;
    this.K = null;
    this.L = null;
    this.J = null;
  }
  
  public boolean hasNestedScrollingParent()
  {
    return this.aj.b();
  }
  
  boolean i()
  {
    return (this.F != null) && (this.F.isEnabled());
  }
  
  public boolean isAttachedToWindow()
  {
    return this.v;
  }
  
  public boolean isNestedScrollingEnabled()
  {
    return this.aj.a();
  }
  
  public boolean j()
  {
    return this.I > 0;
  }
  
  void k()
  {
    if (this.p == null) {
      Log.e("RecyclerView", "No adapter attached; skipping layout");
    }
    label156:
    label215:
    label303:
    label589:
    label618:
    label661:
    label667:
    label738:
    label749:
    do
    {
      return;
      if (this.q == null)
      {
        Log.e("RecyclerView", "No layout manager attached; skipping layout");
        return;
      }
      this.d.a();
      b();
      z();
      E();
      Object localObject = this.f;
      boolean bool;
      int i2;
      int i1;
      if ((bh.b(this.f)) && (this.h))
      {
        bool = true;
        bh.e((bh)localObject, bool);
        this.h = false;
        this.g = false;
        bh.b(this.f, bh.a(this.f));
        this.f.a = this.p.getItemCount();
        a(this.ai);
        if (!bh.b(this.f)) {
          break label303;
        }
        i2 = this.c.b();
        i1 = 0;
        if (i1 >= i2) {
          break label303;
        }
        localObject = b(this.c.b(i1));
        if ((!((bk)localObject).shouldIgnore()) && ((!((bk)localObject).isInvalid()) || (this.p.hasStableIds()))) {
          break label215;
        }
      }
      at localat;
      long l1;
      for (;;)
      {
        i1 += 1;
        break label156;
        bool = false;
        break;
        localat = this.e.a(this.f, (bk)localObject, aq.d((bk)localObject), ((bk)localObject).getUnmodifiedPayloads());
        this.d.a((bk)localObject, localat);
        if ((bh.c(this.f)) && (((bk)localObject).isUpdated()) && (!((bk)localObject).isRemoved()) && (!((bk)localObject).shouldIgnore()) && (!((bk)localObject).isInvalid()))
        {
          l1 = a((bk)localObject);
          this.d.a(l1, (bk)localObject);
        }
      }
      if (bh.a(this.f))
      {
        m();
        bool = bh.d(this.f);
        bh.a(this.f, false);
        this.q.c(this.a, this.f);
        bh.a(this.f, bool);
        i1 = 0;
        if (i1 < this.c.b())
        {
          localObject = b(this.c.b(i1));
          if (((bk)localObject).shouldIgnore()) {}
          for (;;)
          {
            i1 += 1;
            break;
            if (!this.d.b((bk)localObject))
            {
              int i3 = aq.d((bk)localObject);
              bool = ((bk)localObject).hasAnyOfTheFlags(8192);
              i2 = i3;
              if (!bool) {
                i2 = i3 | 0x1000;
              }
              localat = this.e.a(this.f, (bk)localObject, i2, ((bk)localObject).getUnmodifiedPayloads());
              if (bool) {
                a((bk)localObject, localat);
              } else {
                this.d.b((bk)localObject, localat);
              }
            }
          }
        }
        n();
        this.b.c();
        this.f.a = this.p.getItemCount();
        bh.b(this.f, 0);
        bh.b(this.f, false);
        this.q.c(this.a, this.f);
        bh.a(this.f, false);
        this.l = null;
        localObject = this.f;
        if ((!bh.b(this.f)) || (this.e == null)) {
          break label661;
        }
        bool = true;
        bh.c((bh)localObject, bool);
        if (!bh.b(this.f)) {
          break label749;
        }
        i2 = this.c.b();
        i1 = 0;
        if (i1 >= i2) {
          break label738;
        }
        localObject = b(this.c.b(i1));
        if (!((bk)localObject).shouldIgnore()) {
          break label667;
        }
      }
      for (;;)
      {
        i1 += 1;
        break label618;
        n();
        break;
        bool = false;
        break label589;
        l1 = a((bk)localObject);
        localat = this.e.a(this.f, (bk)localObject);
        bk localbk = this.d.a(l1);
        if ((localbk != null) && (!localbk.shouldIgnore())) {
          a(localbk, (bk)localObject, this.d.a(localbk), localat);
        } else {
          this.d.c((bk)localObject, localat);
        }
      }
      this.d.a(this.ap);
      a(false);
      this.q.b(this.a);
      bh.c(this.f, this.f.a);
      this.H = false;
      bh.c(this.f, false);
      bh.d(this.f, false);
      A();
      aw.a(this.q, false);
      if (bb.a(this.a) != null) {
        bb.a(this.a).clear();
      }
      this.d.a();
    } while (!j(this.ai[0], this.ai[1]));
    g(0, 0);
  }
  
  void l()
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      ((RecyclerView.LayoutParams)this.c.c(i1).getLayoutParams()).c = true;
      i1 += 1;
    }
    this.a.j();
  }
  
  void m()
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      bk localbk = b(this.c.c(i1));
      if (!localbk.shouldIgnore()) {
        localbk.saveOldPosition();
      }
      i1 += 1;
    }
  }
  
  void n()
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      bk localbk = b(this.c.c(i1));
      if (!localbk.shouldIgnore()) {
        localbk.clearOldPosition();
      }
      i1 += 1;
    }
    this.a.i();
  }
  
  void o()
  {
    int i2 = this.c.c();
    int i1 = 0;
    while (i1 < i2)
    {
      bk localbk = b(this.c.c(i1));
      if ((localbk != null) && (!localbk.shouldIgnore())) {
        localbk.addFlags(6);
      }
      i1 += 1;
    }
    l();
    this.a.h();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    this.I = 0;
    this.v = true;
    this.x = false;
    if (this.q != null) {
      this.q.c(this);
    }
    this.af = false;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    if (this.e != null) {
      this.e.c();
    }
    this.x = false;
    c();
    this.v = false;
    if (this.q != null) {
      this.q.b(this, this.a);
    }
    removeCallbacks(this.an);
    this.d.b();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i2 = this.s.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((av)this.s.get(i1)).a(paramCanvas, this, this.f);
      i1 += 1;
    }
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    if (this.q == null) {}
    label110:
    label113:
    for (;;)
    {
      return false;
      if ((!this.A) && ((android.support.v4.view.ak.d(paramMotionEvent) & 0x2) != 0) && (paramMotionEvent.getAction() == 8))
      {
        float f1;
        if (this.q.e())
        {
          f1 = -android.support.v4.view.ak.e(paramMotionEvent, 9);
          if (!this.q.d()) {
            break label110;
          }
        }
        for (float f2 = android.support.v4.view.ak.e(paramMotionEvent, 10);; f2 = 0.0F)
        {
          if ((f1 == 0.0F) && (f2 == 0.0F)) {
            break label113;
          }
          float f3 = getScrollFactor();
          a((int)(f2 * f3), (int)(f1 * f3), paramMotionEvent);
          return false;
          f1 = 0.0F;
          break;
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    int i3 = -1;
    boolean bool1 = true;
    if (this.A) {}
    do
    {
      return false;
      if (a(paramMotionEvent))
      {
        y();
        return true;
      }
    } while (this.q == null);
    boolean bool2 = this.q.d();
    boolean bool3 = this.q.e();
    if (this.P == null) {
      this.P = VelocityTracker.obtain();
    }
    this.P.addMovement(paramMotionEvent);
    int i2 = android.support.v4.view.ak.a(paramMotionEvent);
    int i1 = android.support.v4.view.ak.b(paramMotionEvent);
    switch (i2)
    {
    case 4: 
    default: 
      if (this.N == 1) {
        return bool1;
      }
      break;
    case 0: 
      label136:
      if (this.B) {
        this.B = false;
      }
      this.O = android.support.v4.view.ak.b(paramMotionEvent, 0);
      i1 = (int)(paramMotionEvent.getX() + 0.5F);
      this.S = i1;
      this.Q = i1;
      i1 = (int)(paramMotionEvent.getY() + 0.5F);
      this.T = i1;
      this.R = i1;
      if (this.N == 2)
      {
        getParent().requestDisallowInterceptTouchEvent(true);
        setScrollState(1);
      }
      paramMotionEvent = this.am;
      this.am[1] = 0;
      paramMotionEvent[0] = 0;
      if (!bool2) {}
      break;
    }
    for (i1 = 1;; i1 = 0)
    {
      i2 = i1;
      if (bool3) {
        i2 = i1 | 0x2;
      }
      startNestedScroll(i2);
      break;
      this.O = android.support.v4.view.ak.b(paramMotionEvent, i1);
      i2 = (int)(android.support.v4.view.ak.c(paramMotionEvent, i1) + 0.5F);
      this.S = i2;
      this.Q = i2;
      i1 = (int)(android.support.v4.view.ak.d(paramMotionEvent, i1) + 0.5F);
      this.T = i1;
      this.R = i1;
      break;
      i2 = android.support.v4.view.ak.a(paramMotionEvent, this.O);
      if (i2 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      i1 = (int)(android.support.v4.view.ak.c(paramMotionEvent, i2) + 0.5F);
      i2 = (int)(android.support.v4.view.ak.d(paramMotionEvent, i2) + 0.5F);
      if (this.N == 1) {
        break;
      }
      i1 -= this.Q;
      int i4 = i2 - this.R;
      int i5;
      if ((bool2) && (Math.abs(i1) > this.U))
      {
        i2 = this.Q;
        i5 = this.U;
        if (i1 < 0)
        {
          i1 = -1;
          label449:
          this.S = (i1 * i5 + i2);
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        i2 = i1;
        if (bool3)
        {
          i2 = i1;
          if (Math.abs(i4) > this.U)
          {
            i2 = this.R;
            i5 = this.U;
            if (i4 >= 0) {
              break label530;
            }
          }
        }
        label530:
        for (i1 = i3;; i1 = 1)
        {
          this.T = (i2 + i1 * i5);
          i2 = 1;
          if (i2 == 0) {
            break;
          }
          setScrollState(1);
          break;
          i1 = 1;
          break label449;
        }
        c(paramMotionEvent);
        break;
        this.P.clear();
        stopNestedScroll();
        break;
        y();
        break;
        bool1 = false;
        break label136;
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    b();
    l.a("RV OnLayout");
    k();
    l.a();
    a(false);
    this.x = true;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    if (this.D)
    {
      b();
      E();
      if (bh.a(this.f))
      {
        bh.b(this.f, true);
        this.D = false;
        a(false);
      }
    }
    else
    {
      if (this.p == null) {
        break label107;
      }
      this.f.a = this.p.getItemCount();
      label65:
      if (this.q != null) {
        break label118;
      }
      i(paramInt1, paramInt2);
    }
    for (;;)
    {
      bh.b(this.f, false);
      return;
      this.b.e();
      bh.b(this.f, false);
      break;
      label107:
      this.f.a = 0;
      break label65;
      label118:
      this.q.a(this.a, this.f, paramInt1, paramInt2);
    }
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    this.l = ((RecyclerView.SavedState)paramParcelable);
    super.onRestoreInstanceState(this.l.getSuperState());
    if ((this.q != null) && (this.l.a != null)) {
      this.q.a(this.l.a);
    }
  }
  
  protected Parcelable onSaveInstanceState()
  {
    RecyclerView.SavedState localSavedState = new RecyclerView.SavedState(super.onSaveInstanceState());
    if (this.l != null)
    {
      RecyclerView.SavedState.a(localSavedState, this.l);
      return localSavedState;
    }
    if (this.q != null)
    {
      localSavedState.a = this.q.c();
      return localSavedState;
    }
    localSavedState.a = null;
    return localSavedState;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((paramInt1 != paramInt3) || (paramInt2 != paramInt4)) {
      h();
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i7 = 0;
    if ((this.A) || (this.B)) {}
    do
    {
      return false;
      if (b(paramMotionEvent))
      {
        y();
        return true;
      }
    } while (this.q == null);
    boolean bool1 = this.q.d();
    boolean bool2 = this.q.e();
    if (this.P == null) {
      this.P = VelocityTracker.obtain();
    }
    MotionEvent localMotionEvent = MotionEvent.obtain(paramMotionEvent);
    int i3 = android.support.v4.view.ak.a(paramMotionEvent);
    int i2 = android.support.v4.view.ak.b(paramMotionEvent);
    if (i3 == 0)
    {
      int[] arrayOfInt = this.am;
      this.am[1] = 0;
      arrayOfInt[0] = 0;
    }
    localMotionEvent.offsetLocation(this.am[0], this.am[1]);
    int i1 = i7;
    switch (i3)
    {
    default: 
      i1 = i7;
    case 4: 
      if (i1 == 0) {
        this.P.addMovement(localMotionEvent);
      }
      localMotionEvent.recycle();
      return true;
    case 0: 
      this.O = android.support.v4.view.ak.b(paramMotionEvent, 0);
      i1 = (int)(paramMotionEvent.getX() + 0.5F);
      this.S = i1;
      this.Q = i1;
      i1 = (int)(paramMotionEvent.getY() + 0.5F);
      this.T = i1;
      this.R = i1;
      if (!bool1) {
        break;
      }
    }
    for (i1 = 1;; i1 = 0)
    {
      i2 = i1;
      if (bool2) {
        i2 = i1 | 0x2;
      }
      startNestedScroll(i2);
      i1 = i7;
      break;
      this.O = android.support.v4.view.ak.b(paramMotionEvent, i2);
      i1 = (int)(android.support.v4.view.ak.c(paramMotionEvent, i2) + 0.5F);
      this.S = i1;
      this.Q = i1;
      i1 = (int)(android.support.v4.view.ak.d(paramMotionEvent, i2) + 0.5F);
      this.T = i1;
      this.R = i1;
      i1 = i7;
      break;
      i1 = android.support.v4.view.ak.a(paramMotionEvent, this.O);
      if (i1 < 0)
      {
        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.O + " not found. Did any MotionEvents get skipped?");
        return false;
      }
      int i8 = (int)(android.support.v4.view.ak.c(paramMotionEvent, i1) + 0.5F);
      int i9 = (int)(android.support.v4.view.ak.d(paramMotionEvent, i1) + 0.5F);
      int i4 = this.S - i8;
      i3 = this.T - i9;
      i1 = i3;
      i2 = i4;
      if (dispatchNestedPreScroll(i4, i3, this.al, this.ak))
      {
        i2 = i4 - this.al[0];
        i1 = i3 - this.al[1];
        localMotionEvent.offsetLocation(this.ak[0], this.ak[1]);
        paramMotionEvent = this.am;
        paramMotionEvent[0] += this.ak[0];
        paramMotionEvent = this.am;
        paramMotionEvent[1] += this.ak[1];
      }
      i3 = i1;
      i4 = i2;
      if (this.N != 1)
      {
        if ((!bool1) || (Math.abs(i2) <= this.U)) {
          break label940;
        }
        if (i2 <= 0) {
          break label773;
        }
        i2 -= this.U;
      }
      label612:
      label662:
      label734:
      label773:
      label785:
      label803:
      label863:
      label924:
      label940:
      for (i3 = 1;; i3 = 0)
      {
        int i5 = i1;
        int i6 = i3;
        if (bool2)
        {
          i5 = i1;
          i6 = i3;
          if (Math.abs(i1) > this.U)
          {
            if (i1 <= 0) {
              break label785;
            }
            i5 = i1 - this.U;
            i6 = 1;
          }
        }
        i3 = i5;
        i4 = i2;
        if (i6 != 0)
        {
          setScrollState(1);
          i4 = i2;
          i3 = i5;
        }
        i1 = i7;
        if (this.N != 1) {
          break;
        }
        this.S = (i8 - this.ak[0]);
        this.T = (i9 - this.ak[1]);
        if (bool1) {
          if (!bool2) {
            break label803;
          }
        }
        for (;;)
        {
          i1 = i7;
          if (!a(i4, i3, localMotionEvent)) {
            break;
          }
          getParent().requestDisallowInterceptTouchEvent(true);
          i1 = i7;
          break;
          i2 += this.U;
          break label612;
          i5 = i1 + this.U;
          break label662;
          i4 = 0;
          break label734;
          i3 = 0;
        }
        c(paramMotionEvent);
        i1 = i7;
        break;
        this.P.addMovement(localMotionEvent);
        this.P.computeCurrentVelocity(1000, this.W);
        float f1;
        if (bool1)
        {
          f1 = -android.support.v4.view.bi.a(this.P, this.O);
          if (!bool2) {
            break label924;
          }
        }
        for (float f2 = -android.support.v4.view.bi.b(this.P, this.O);; f2 = 0.0F)
        {
          if (((f1 == 0.0F) && (f2 == 0.0F)) || (!b((int)f1, (int)f2))) {
            setScrollState(0);
          }
          x();
          i1 = 1;
          break;
          f1 = 0.0F;
          break label863;
        }
        y();
        i1 = i7;
        break;
      }
    }
  }
  
  public boolean p()
  {
    return (!this.x) || (this.H) || (this.b.d());
  }
  
  protected void removeDetachedView(View paramView, boolean paramBoolean)
  {
    bk localbk = b(paramView);
    if (localbk != null)
    {
      if (!localbk.isTmpDetached()) {
        break label32;
      }
      localbk.clearTmpDetachFlag();
    }
    label32:
    while (localbk.shouldIgnore())
    {
      h(paramView);
      super.removeDetachedView(paramView, paramBoolean);
      return;
    }
    throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + localbk);
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    Object localObject;
    if ((!this.q.a(this, this.f, paramView1, paramView2)) && (paramView2 != null))
    {
      this.o.set(0, 0, paramView2.getWidth(), paramView2.getHeight());
      localObject = paramView2.getLayoutParams();
      if ((localObject instanceof RecyclerView.LayoutParams))
      {
        localObject = (RecyclerView.LayoutParams)localObject;
        if (!((RecyclerView.LayoutParams)localObject).c)
        {
          localObject = ((RecyclerView.LayoutParams)localObject).b;
          Rect localRect = this.o;
          localRect.left -= ((Rect)localObject).left;
          localRect = this.o;
          localRect.right += ((Rect)localObject).right;
          localRect = this.o;
          localRect.top -= ((Rect)localObject).top;
          localRect = this.o;
          int i1 = localRect.bottom;
          localRect.bottom = (((Rect)localObject).bottom + i1);
        }
      }
      offsetDescendantRectToMyCoords(paramView2, this.o);
      offsetRectIntoDescendantCoords(paramView1, this.o);
      localObject = this.o;
      if (this.x) {
        break label204;
      }
    }
    label204:
    for (boolean bool = true;; bool = false)
    {
      requestChildRectangleOnScreen(paramView1, (Rect)localObject, bool);
      super.requestChildFocus(paramView1, paramView2);
      return;
    }
  }
  
  public boolean requestChildRectangleOnScreen(View paramView, Rect paramRect, boolean paramBoolean)
  {
    return this.q.a(this, paramView, paramRect, paramBoolean);
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean)
  {
    int i2 = this.t.size();
    int i1 = 0;
    while (i1 < i2)
    {
      ((ay)this.t.get(i1)).a(paramBoolean);
      i1 += 1;
    }
    super.requestDisallowInterceptTouchEvent(paramBoolean);
  }
  
  public void requestLayout()
  {
    if ((!this.y) && (!this.A))
    {
      super.requestLayout();
      return;
    }
    this.z = true;
  }
  
  public void scrollBy(int paramInt1, int paramInt2)
  {
    if (this.q == null) {}
    boolean bool1;
    boolean bool2;
    do
    {
      Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
      do
      {
        return;
      } while (this.A);
      bool1 = this.q.d();
      bool2 = this.q.e();
    } while ((!bool1) && (!bool2));
    if (bool1) {
      if (!bool2) {
        break label74;
      }
    }
    for (;;)
    {
      a(paramInt1, paramInt2, null);
      return;
      paramInt1 = 0;
      break;
      label74:
      paramInt2 = 0;
    }
  }
  
  public void scrollTo(int paramInt1, int paramInt2)
  {
    Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
  }
  
  public void sendAccessibilityEventUnchecked(AccessibilityEvent paramAccessibilityEvent)
  {
    if (a(paramAccessibilityEvent)) {
      return;
    }
    super.sendAccessibilityEventUnchecked(paramAccessibilityEvent);
  }
  
  public void setAccessibilityDelegateCompat(bl parambl)
  {
    this.ag = parambl;
    bn.a(this, this.ag);
  }
  
  public void setAdapter(am paramam)
  {
    setLayoutFrozen(false);
    a(paramam, false, true);
    requestLayout();
  }
  
  public void setChildDrawingOrderCallback(ap paramap)
  {
    if (paramap == this.ah) {
      return;
    }
    this.ah = paramap;
    if (this.ah != null) {}
    for (boolean bool = true;; bool = false)
    {
      setChildrenDrawingOrderEnabled(bool);
      return;
    }
  }
  
  public void setClipToPadding(boolean paramBoolean)
  {
    if (paramBoolean != this.m) {
      h();
    }
    this.m = paramBoolean;
    super.setClipToPadding(paramBoolean);
    if (this.x) {
      requestLayout();
    }
  }
  
  public void setHasFixedSize(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }
  
  public void setItemAnimator(aq paramaq)
  {
    if (this.e != null)
    {
      this.e.c();
      this.e.a(null);
    }
    this.e = paramaq;
    if (this.e != null) {
      this.e.a(this.ae);
    }
  }
  
  public void setItemViewCacheSize(int paramInt)
  {
    this.a.a(paramInt);
  }
  
  public void setLayoutFrozen(boolean paramBoolean)
  {
    if (paramBoolean != this.A)
    {
      a("Do not setLayoutFrozen in layout or scroll");
      if (!paramBoolean)
      {
        this.A = paramBoolean;
        if ((this.z) && (this.q != null) && (this.p != null)) {
          requestLayout();
        }
        this.z = false;
      }
    }
    else
    {
      return;
    }
    long l1 = SystemClock.uptimeMillis();
    onTouchEvent(MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0));
    this.A = paramBoolean;
    this.B = true;
    c();
  }
  
  public void setLayoutManager(aw paramaw)
  {
    if (paramaw == this.q) {
      return;
    }
    if (this.q != null)
    {
      if (this.v) {
        this.q.b(this, this.a);
      }
      this.q.b(null);
    }
    this.a.a();
    this.c.a();
    this.q = paramaw;
    if (paramaw != null)
    {
      if (paramaw.r != null) {
        throw new IllegalArgumentException("LayoutManager " + paramaw + " is already attached to a RecyclerView: " + paramaw.r);
      }
      this.q.b(this);
      if (this.v) {
        this.q.c(this);
      }
    }
    requestLayout();
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean)
  {
    this.aj.a(paramBoolean);
  }
  
  @Deprecated
  public void setOnScrollListener(az paramaz)
  {
    this.ac = paramaz;
  }
  
  public void setRecycledViewPool(ba paramba)
  {
    this.a.a(paramba);
  }
  
  public void setRecyclerListener(bc parambc)
  {
    this.r = parambc;
  }
  
  public void setScrollingTouchSlop(int paramInt)
  {
    ViewConfiguration localViewConfiguration = ViewConfiguration.get(getContext());
    switch (paramInt)
    {
    default: 
      Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + paramInt + "; using default value");
    case 0: 
      this.U = localViewConfiguration.getScaledTouchSlop();
      return;
    }
    this.U = cj.a(localViewConfiguration);
  }
  
  public void setViewCacheExtension(bi parambi)
  {
    this.a.a(parambi);
  }
  
  public boolean startNestedScroll(int paramInt)
  {
    return this.aj.a(paramInt);
  }
  
  public void stopNestedScroll()
  {
    this.aj.c();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\RecyclerView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */