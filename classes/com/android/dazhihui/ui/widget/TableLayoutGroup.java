package com.android.dazhihui.ui.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.FontMetrics;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import com.android.dazhihui.f;
import com.android.dazhihui.ui.screen.y;
import java.util.ArrayList;
import java.util.List;

public class TableLayoutGroup
  extends ViewGroup
{
  private int A;
  private int B;
  private int C;
  private int D;
  private int E;
  private int F;
  private float G;
  private float H;
  private md I = md.e;
  private int J = 0;
  private int K = -1;
  private int L = -1;
  private boolean M;
  private int N = -5392698;
  private int O;
  private Paint.Align P = Paint.Align.LEFT;
  private Paint.Align Q = Paint.Align.LEFT;
  private Paint.Align R = Paint.Align.RIGHT;
  private boolean S = true;
  private boolean T = false;
  private int U;
  private int V;
  private final float W;
  protected int a;
  private long aa;
  private long ab;
  private float ac = 0.0F;
  private float ad = 1.0F;
  private float ae;
  private VelocityTracker af;
  private int ag = 0;
  private int ah = 0;
  private lz ai;
  private mc aj;
  private lt ak = new lt(this, null);
  private boolean al = true;
  private boolean am = true;
  private boolean an = true;
  private y ao = y.a;
  private lw ap;
  private lx aq;
  private Runnable ar = new lp(this);
  private Rect as = new Rect();
  private ly at;
  private float au;
  protected int b;
  private Context c;
  private mi d;
  private mj e;
  private mf f;
  private me g;
  private mg h;
  private int i;
  private int j;
  private int k;
  private int l;
  private int m;
  private int n;
  private int o;
  private int p;
  private Drawable q;
  private int[] r = null;
  private String[] s = null;
  private List<mh> t = new ArrayList();
  private mh u = null;
  private boolean[] v = null;
  private boolean[] w = null;
  private boolean x;
  private int y = 0;
  private int z = 0;
  
  public TableLayoutGroup(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TableLayoutGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public TableLayoutGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.c = paramContext;
    this.i = ViewConfiguration.get(this.c).getScaledTouchSlop();
    DisplayMetrics localDisplayMetrics = getResources().getDisplayMetrics();
    this.U = ((int)(localDisplayMetrics.density * 50.0F + 0.5F));
    this.V = ((int)(localDisplayMetrics.density * 4000.0F + 0.5F));
    this.W = (paramContext.getResources().getDisplayMetrics().density * 160.0F * 386.0878F * ViewConfiguration.getScrollFriction());
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, f.tablelayoutview);
    this.m = paramContext.getResourceId(0, 0);
    this.n = paramContext.getResourceId(1, 0);
    this.o = paramContext.getResourceId(3, 2130838687);
    this.x = paramContext.getBoolean(4, true);
    this.p = paramContext.getResourceId(2, 2130838717);
    paramContext.recycle();
    setBackgroundResource(this.m);
    g();
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    float f2 = 1.0F;
    this.S = false;
    float f3 = (float)Math.hypot(paramInt3, paramInt4);
    this.ae = f3;
    this.ab = ((int)(1000.0F * f3 / this.W));
    float f1;
    if (Math.abs(paramInt3) > Math.abs(paramInt4)) {
      if (paramInt3 < 0)
      {
        this.I = md.c;
        this.aa = AnimationUtils.currentAnimationTimeMillis();
        this.A = paramInt1;
        this.B = paramInt2;
        if (f3 != 0.0F) {
          break label274;
        }
        f1 = 1.0F;
        label92:
        this.ac = f1;
        if (f3 != 0.0F) {
          break label284;
        }
        f1 = f2;
        label109:
        this.ad = f1;
        paramInt3 = (int)(f3 * f3 / (2.0F * this.W));
        this.E = (Math.round(paramInt3 * this.ac) + paramInt1);
        if (this.ah <= getWidth()) {
          break label295;
        }
      }
    }
    label274:
    label284:
    label295:
    for (paramInt1 = getWidth() - this.ah;; paramInt1 = 0)
    {
      this.E = Math.min(this.E, 0);
      this.E = Math.max(this.E, paramInt1);
      this.F = (Math.round(paramInt3 * this.ad) + paramInt2);
      return;
      this.I = md.d;
      break;
      if (paramInt4 < 0) {}
      for (this.I = md.a;; this.I = md.b)
      {
        this.f.removeCallbacks(this.ar);
        this.f.postDelayed(this.ar, this.ab + 100L);
        break;
      }
      f1 = paramInt3 / f3;
      break label92;
      f1 = paramInt4 / f3;
      break label109;
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    int i1 = paramMotionEvent.getAction();
    if ((i1 == 2) && (this.T)) {}
    int i2;
    do
    {
      return;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      switch (i1 & 0xFF)
      {
      default: 
        return;
      case 0: 
        this.G = f1;
        this.H = f2;
        if (!this.S) {
          bool = true;
        }
        this.T = bool;
        if (this.T) {
          h();
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return;
      case 2: 
        i1 = (int)Math.abs(f1 - this.G);
        i2 = (int)Math.abs(f2 - this.H);
        if ((i1 > i2) && (i1 > this.i))
        {
          h();
          this.T = true;
          return;
        }
        break;
      }
    } while ((i1 >= i2) || (i2 <= this.i));
    h();
    this.T = true;
    return;
    h();
    getParent().requestDisallowInterceptTouchEvent(false);
  }
  
  private void a(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams2 = paramView.getLayoutParams();
    ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
    if (localLayoutParams2 == null) {
      localLayoutParams1 = new ViewGroup.LayoutParams(-1, -2);
    }
    int i2 = ViewGroup.getChildMeasureSpec(0, 0, localLayoutParams1.width);
    int i1 = localLayoutParams1.height;
    if (i1 > 0) {}
    for (i1 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824);; i1 = View.MeasureSpec.makeMeasureSpec(0, 0))
    {
      paramView.measure(i2, i1);
      return;
    }
  }
  
  private boolean a(View paramView, MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0))
    {
      h();
      return false;
    }
    if (this.af == null) {
      this.af = VelocityTracker.obtain();
    }
    this.af.addMovement(paramMotionEvent);
    int i1 = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    int i2;
    int i3;
    switch (i1 & 0xFF)
    {
    default: 
    case 0: 
    case 2: 
      do
      {
        for (;;)
        {
          return true;
          if ((paramView instanceof mb)) {
            ((mb)paramView).b((int)f1, (int)f2);
          }
          a(paramMotionEvent);
          if (!this.S) {
            c();
          }
          this.G = f1;
          this.H = f2;
        }
        a(paramMotionEvent);
      } while (!this.T);
      i2 = (int)(-this.G + f1);
      i3 = (int)(-this.H + f2);
      this.G = f1;
      this.H = f2;
      if (Math.abs(i2) >= Math.abs(i3)) {
        if (this.ah <= getWidth()) {
          break label702;
        }
      }
      break;
    }
    label575:
    label696:
    label702:
    for (i1 = getWidth() - this.ah;; i1 = 0)
    {
      if ((this.a + i2 >= 0) && (i2 >= 0))
      {
        this.a = 0;
        this.y = getFirstScrollColumnIndex();
        this.z = getLastScrollColumnIndex();
        this.I = md.e;
        getParent().requestDisallowInterceptTouchEvent(false);
        break;
      }
      if ((this.a + i2 <= i1) && (i2 < 0))
      {
        this.a = i1;
        this.y = getFirstScrollColumnIndex();
        this.z = getLastScrollColumnIndex();
        this.I = md.e;
        getParent().requestDisallowInterceptTouchEvent(false);
        break;
      }
      getParent().requestDisallowInterceptTouchEvent(true);
      paramView.scrollBy(i2, 0);
      break;
      if ((paramView instanceof mf)) {
        if (this.ag <= paramView.getHeight()) {
          break label696;
        }
      }
      for (i1 = paramView.getHeight() - this.ag;; i1 = 0)
      {
        if ((this.b + i3 >= 0) && (i3 >= 0))
        {
          this.b = 0;
          this.I = md.e;
          ((mf)paramView).b();
          break;
        }
        if ((this.b + i3 <= i1) && (i3 < 0))
        {
          this.b = i1;
          this.I = md.e;
          ((mf)paramView).b();
          break;
        }
        paramView.scrollBy(0, i3);
        break;
        if (!(paramView instanceof mj)) {
          break;
        }
        paramView.scrollBy(0, i3);
        break;
        a(paramMotionEvent);
        if (this.T)
        {
          paramMotionEvent = this.af;
          paramMotionEvent.computeCurrentVelocity(1000, this.V);
          i1 = (int)paramMotionEvent.getXVelocity();
          i2 = (int)paramMotionEvent.getYVelocity();
          if (Math.abs(i1) > Math.abs(i2))
          {
            if (Math.abs(i1) > this.U) {
              a(this.a, this.b, i1, 0);
            }
            this.T = false;
            if (this.af != null)
            {
              this.af.recycle();
              this.af = null;
            }
          }
        }
        for (;;)
        {
          this.T = false;
          break;
          if ((paramView instanceof mf)) {
            paramView.post(this.ar);
          }
          if (Math.abs(i2) <= this.U) {
            break label575;
          }
          a(this.a, this.b, 0, i2);
          break label575;
          if ((paramView instanceof mb)) {
            ((mb)paramView).a((int)f1, (int)f2);
          } else if ((paramView instanceof ma)) {
            ((ma)paramView).a();
          }
        }
      }
    }
  }
  
  private int b(int paramInt)
  {
    if ((this.r == null) || (paramInt >= this.r.length)) {
      return 0;
    }
    return this.r[paramInt];
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    if (paramInt1 > 0) {}
    for (this.I = md.d;; this.I = md.c)
    {
      if (this.a != paramInt1)
      {
        this.a += paramInt1;
        this.y = getFirstScrollColumnIndex();
        this.z = getLastScrollColumnIndex();
        invalidate();
      }
      return;
    }
  }
  
  private int c(int paramInt)
  {
    int i3 = 0;
    int i2 = 0;
    int i1 = 0;
    if (paramInt < 0) {}
    while (this.r == null) {
      return i1;
    }
    if (paramInt >= this.r.length)
    {
      int[] arrayOfInt = this.r;
      int i4 = arrayOfInt.length;
      i2 = 0;
      for (paramInt = i3;; paramInt = i1 + paramInt)
      {
        i1 = paramInt;
        if (i2 >= i4) {
          break;
        }
        i1 = arrayOfInt[i2];
        i2 += 1;
      }
    }
    i3 = 0;
    for (;;)
    {
      i1 = i2;
      if (i3 > paramInt) {
        break;
      }
      i1 = this.r[i3];
      i3 += 1;
      i2 = i1 + i2;
    }
  }
  
  private int d(int paramInt)
  {
    int i1 = 0;
    if (this.r != null) {
      for (int i2 = 0;; i2 = i3)
      {
        i3 = i2;
        if (i1 >= this.r.length) {
          break;
        }
        i3 = i2;
        if (paramInt - this.a >= c(i1 - 1))
        {
          i3 = i2;
          if (paramInt - this.a < c(i1)) {
            i3 = i1;
          }
        }
        i1 += 1;
      }
    }
    int i3 = 0;
    return i3;
  }
  
  private void g()
  {
    this.O = ((int)getResources().getDimension(2131230829));
    this.l = ((int)getResources().getDimension(2131230841));
    this.j = ((int)getResources().getDimension(2131230845));
    this.k = ((int)getResources().getDimension(2131230820));
    this.q = getResources().getDrawable(this.p);
    this.d = new mi(this, this.c);
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, this.k);
    addView(this.d, localLayoutParams);
    this.f = new mf(this, this.c);
    this.g = new me(this, this.c);
    localLayoutParams = new ViewGroup.LayoutParams(-1, -1);
    addView(this.g, localLayoutParams);
    a(this.d);
    a(this.g);
  }
  
  private int getFirstScrollColumnIndex()
  {
    if (this.r != null)
    {
      int i1 = 0;
      while (i1 < this.r.length)
      {
        if ((Math.abs(this.a) + this.r[0] >= c(i1)) && (Math.abs(this.a) + this.r[0] < c(i1 + 1))) {
          return i1;
        }
        i1 += 1;
      }
    }
    return 0;
  }
  
  private int getLastScrollColumnIndex()
  {
    int i3 = getWidth();
    if (this.r != null)
    {
      int i1 = 0;
      while (i1 < this.r.length)
      {
        int i2;
        if (i3 - this.a >= c(this.r.length - 1)) {
          i2 = this.r.length - 1;
        }
        do
        {
          return i2;
          if (i3 - this.a < c(i1 - 1)) {
            break;
          }
          i2 = i1;
        } while (i3 - this.a < c(i1));
        i1 += 1;
      }
    }
    return 0;
  }
  
  private void h()
  {
    this.L = -1;
    this.K = -1;
    this.d.invalidate();
  }
  
  public void a()
  {
    this.t.clear();
    this.ag = 0;
    this.b = 0;
    this.f.b();
    invalidate();
  }
  
  public void a(int paramInt)
  {
    if (this.f != null)
    {
      paramInt = getWidth() - c(paramInt);
      if (paramInt < 0) {
        this.f.scrollBy(paramInt, 0);
      }
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (this.f != null) {
      this.f.scrollBy(paramInt1, paramInt2);
    }
  }
  
  public void a(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    ((Activity)this.c).runOnUiThread(new lr(this, paramInt1, paramInt2, paramBoolean));
  }
  
  public void a(int paramInt, boolean paramBoolean)
  {
    this.J = paramInt;
    this.M = paramBoolean;
    this.d.invalidate();
  }
  
  public void a(y paramy)
  {
    this.ao = paramy;
    switch (ls.a[paramy.ordinal()])
    {
    }
    for (;;)
    {
      if (this.f != null) {
        this.f.a(paramy);
      }
      if (this.d != null) {
        this.d.a(paramy);
      }
      if (this.e != null) {
        this.e.a(paramy);
      }
      postInvalidate();
      return;
      this.p = 2130838717;
      this.q = getResources().getDrawable(this.p);
      continue;
      this.p = 2130838799;
      this.q = getResources().getDrawable(this.p);
    }
  }
  
  public void a(String paramString, int paramInt1, int paramInt2, Paint.Align paramAlign, Canvas paramCanvas, Paint paramPaint)
  {
    paramPaint.setTextAlign(paramAlign);
    paramAlign = paramString;
    if (paramString == null) {
      paramAlign = "--";
    }
    paramString = paramAlign;
    if (paramAlign.equals("null")) {
      paramString = "";
    }
    paramCanvas.drawText(paramString, paramInt1, paramInt2 - paramPaint.getFontMetrics().ascent, paramPaint);
  }
  
  public void a(List<mh> paramList, int paramInt)
  {
    int i1 = 0;
    a(2100, 3001, true);
    if ((paramList == null) || (this.t.size() < paramInt)) {
      return;
    }
    mf.a(this.f, paramList);
    int i3 = this.t.size();
    int i2 = 0;
    if (i1 < paramList.size())
    {
      if (paramInt + i1 < this.t.size()) {
        this.t.set(paramInt + i1, paramList.get(i1));
      }
      for (;;)
      {
        i1 += 1;
        break;
        this.t.add(paramList.get(i1));
        i2 += 1;
      }
    }
    mf.c(this.f);
    if ((!this.al) && (i2 != 0))
    {
      paramInt = this.f.c();
      if ((i2 + i3) * paramInt > this.f.getHeight()) {
        if (i2 * paramInt <= this.f.getHeight()) {
          break label216;
        }
      }
    }
    label216:
    for (this.b = (-i3 * this.f.c());; this.b = (this.f.getHeight() - paramInt * this.t.size()))
    {
      this.f.b();
      invalidate();
      return;
    }
  }
  
  public void b()
  {
    a();
    this.r = null;
    this.s = null;
    this.v = null;
    this.w = null;
    this.y = 0;
    this.z = 0;
    this.a = 0;
    this.b = 0;
  }
  
  public void c()
  {
    this.C = this.E;
    this.D = this.F;
    this.S = true;
    this.I = md.e;
  }
  
  public void computeScroll()
  {
    int i3;
    if (!this.S)
    {
      i3 = (int)(AnimationUtils.currentAnimationTimeMillis() - this.aa);
      if (i3 >= this.ab) {
        break label335;
      }
      if (this.ah <= getWidth()) {
        break label390;
      }
    }
    label335:
    label390:
    for (int i1 = getWidth() - this.ah;; i1 = 0)
    {
      if (this.ag > this.f.getHeight()) {}
      for (int i2 = this.f.getHeight() - this.ag;; i2 = 0)
      {
        if ((this.a >= 0) && (this.I == md.d))
        {
          this.a = 0;
          this.f.b();
          c();
          getParent().requestDisallowInterceptTouchEvent(false);
          return;
        }
        if ((this.a <= i1) && (this.I == md.c))
        {
          this.a = i1;
          this.f.b();
          c();
          return;
        }
        if ((this.b <= i2) && (this.I == md.a))
        {
          this.b = i2;
          this.f.b();
          c();
          return;
        }
        if ((this.b >= 0) && (this.I == md.b))
        {
          this.b = 0;
          this.f.b();
          c();
          return;
        }
        float f1 = i3 / 1000.0F;
        f1 = this.ae * f1 - f1 * (this.W * f1) / 2.0F;
        this.C = (this.A + Math.round(this.ac * f1));
        this.C = Math.min(this.C, 0);
        this.C = Math.max(this.C, i1);
        this.D = (this.B + Math.round(f1 * this.ad));
        this.D = Math.min(this.D, 0);
        this.D = Math.max(this.D, i2);
        if ((this.C != this.a) || (this.D != this.b))
        {
          this.a = this.C;
          this.b = this.D;
          this.f.b();
        }
        postInvalidate();
        return;
      }
    }
  }
  
  public void d()
  {
    a(2100, 3001, true);
  }
  
  public boolean e()
  {
    return (this.am) && (this.b >= 0);
  }
  
  public boolean f()
  {
    return (this.ag + this.f.c() / 2 > this.f.getHeight()) && (this.b <= this.f.getHeight() - this.ag);
  }
  
  public int getContentHeight()
  {
    if (this.f != null) {
      return this.f.a();
    }
    return 0;
  }
  
  public int getContentVisibleBeginPosition()
  {
    if (this.f != null) {
      return mf.b(this.f);
    }
    return 0;
  }
  
  public List<mh> getDataModel()
  {
    return this.t;
  }
  
  public int getHeaderHeight()
  {
    return this.k;
  }
  
  public int getScrllY()
  {
    return this.b;
  }
  
  public void invalidate()
  {
    super.invalidate();
    if (this.d != null) {
      this.d.invalidate();
    }
    if (this.e != null) {
      this.e.invalidate();
    }
    if (this.f != null) {
      this.f.invalidate();
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramBoolean)
    {
      this.d.layout(0, 0, paramInt3, this.k);
      this.g.layout(0, this.k, paramInt3, paramInt4 - paramInt2);
    }
  }
  
  public void setColumnAlign(Paint.Align paramAlign)
  {
    this.R = paramAlign;
    invalidate();
  }
  
  public void setColumnClickable(boolean[] paramArrayOfBoolean)
  {
    this.v = paramArrayOfBoolean;
  }
  
  public void setColumnDrawable(boolean[] paramArrayOfBoolean)
  {
    this.w = paramArrayOfBoolean;
  }
  
  public void setColumnSort(boolean paramBoolean)
  {
    this.M = paramBoolean;
  }
  
  public void setContentRowHeight(int paramInt)
  {
    if (this.f != null) {
      this.f.a(paramInt);
    }
  }
  
  public void setContinuousLoading(boolean paramBoolean)
  {
    this.al = paramBoolean;
  }
  
  public void setDrawHeaderSeparateLine(boolean paramBoolean)
  {
    this.x = paramBoolean;
    this.d.invalidate();
  }
  
  public void setFirstColumnAlign(Paint.Align paramAlign)
  {
    this.P = paramAlign;
    this.Q = paramAlign;
    invalidate();
  }
  
  public void setFirstColumnColorDifferent(boolean paramBoolean)
  {
    if (this.f != null) {
      this.f.b(paramBoolean);
    }
  }
  
  public void setFirstColumnHeadAlign(Paint.Align paramAlign) {}
  
  public void setFirstHeaderWidth(int paramInt)
  {
    this.j = paramInt;
    this.d.invalidate();
    if (this.e != null) {
      this.e.invalidate();
    }
    this.f.invalidate();
  }
  
  public void setHeaderBackgroundColor(int paramInt)
  {
    this.d.setBackgroundColor(paramInt);
    this.d.invalidate();
  }
  
  public void setHeaderColumn(String[] paramArrayOfString)
  {
    this.d.a(paramArrayOfString);
  }
  
  public void setHeaderDivideDrawable(Drawable paramDrawable)
  {
    if (this.d != null) {
      this.d.a(paramDrawable);
    }
  }
  
  public void setHeaderFontSize(float paramFloat)
  {
    this.d.a(paramFloat);
  }
  
  public void setHeaderHeight(int paramInt)
  {
    this.k = paramInt;
    ViewGroup.LayoutParams localLayoutParams = new ViewGroup.LayoutParams(-1, this.k);
    this.d.setLayoutParams(localLayoutParams);
    a(this.d);
    invalidate();
  }
  
  public void setHeaderTextColor(int paramInt)
  {
    this.N = paramInt;
    this.d.invalidate();
  }
  
  public void setLeftPadding(int paramInt)
  {
    this.O = paramInt;
    invalidate();
  }
  
  public void setListDivideDrawable(Drawable paramDrawable)
  {
    if (this.f != null) {
      this.f.a(paramDrawable);
    }
  }
  
  public void setLoadingDown(boolean paramBoolean)
  {
    this.an = paramBoolean;
  }
  
  public void setMutiLine(boolean paramBoolean)
  {
    if (this.f != null) {
      this.f.a(paramBoolean);
    }
  }
  
  public void setOnContentScrollBottomListener(lw paramlw)
  {
    if (paramlw != null) {
      this.ap = paramlw;
    }
  }
  
  public void setOnContentScrollChangeListener(lx paramlx)
  {
    if (paramlx != null) {
      this.aq = paramlx;
    }
  }
  
  public void setOnDrawContentCellCallBack(ly paramly)
  {
    if (paramly != null) {
      this.at = paramly;
    }
  }
  
  public void setOnLoadingListener(lz paramlz)
  {
    if (paramlz != null) {
      this.ai = paramlz;
    }
  }
  
  public void setOnTableLayoutClickListener(mc parammc)
  {
    if (parammc != null) {
      this.aj = parammc;
    }
  }
  
  public void setPlateData(mh parammh)
  {
    if (parammh != null)
    {
      this.u = parammh;
      if (this.e == null)
      {
        this.e = new mj(this, this.c);
        this.h.addView(this.e);
        this.h.post(new lq(this));
      }
      mj.a(this.e, parammh);
    }
  }
  
  public void setPullDownLoading(boolean paramBoolean)
  {
    this.am = paramBoolean;
  }
  
  public void setRowHighLightBackgroudDrawable(Drawable paramDrawable)
  {
    this.q = paramDrawable;
  }
  
  public void setStockCodeColor(int paramInt)
  {
    if (this.f != null) {
      this.f.c(paramInt);
    }
  }
  
  public void setStockNameColor(int paramInt)
  {
    if (this.f != null) {
      this.f.b(paramInt);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\TableLayoutGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */