import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.lang.ref.WeakReference;

public final class bx
  implements View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, bw, cj
{
  static final Interpolator a = new AccelerateDecelerateInterpolator();
  static int c = 1;
  private static final boolean d = Log.isLoggable("PhotoViewAttacher", 3);
  private int A;
  private ca B;
  private int C = 2;
  private float D;
  private boolean E;
  private ImageView.ScaleType F = ImageView.ScaleType.FIT_CENTER;
  int b = 200;
  private float e = 1.0F;
  private float f = 1.75F;
  private float g = 3.0F;
  private boolean h = true;
  private boolean i = false;
  private WeakReference<ImageView> j;
  private GestureDetector k;
  private ci l;
  private final Matrix m = new Matrix();
  private final Matrix n = new Matrix();
  private final Matrix o = new Matrix();
  private final RectF p = new RectF();
  private final float[] q = new float[9];
  private cb r;
  private cc s;
  private cd t;
  private View.OnLongClickListener u;
  private cd v;
  private ce w;
  private int x;
  private int y;
  private int z;
  
  public bx(ImageView paramImageView)
  {
    this(paramImageView, true);
  }
  
  private bx(ImageView paramImageView, boolean paramBoolean)
  {
    this.j = new WeakReference(paramImageView);
    paramImageView.setDrawingCacheEnabled(true);
    paramImageView.setOnTouchListener(this);
    Object localObject = paramImageView.getViewTreeObserver();
    if (localObject != null) {
      ((ViewTreeObserver)localObject).addOnGlobalLayoutListener(this);
    }
    a(paramImageView);
    if (paramImageView.isInEditMode()) {
      return;
    }
    localObject = paramImageView.getContext();
    int i1 = Build.VERSION.SDK_INT;
    if (i1 < 5) {
      localObject = new ci((Context)localObject);
    }
    for (;;)
    {
      ((ci)localObject).a(this);
      this.l = ((ci)localObject);
      this.k = new GestureDetector(paramImageView.getContext(), new by(this));
      this.k.setOnDoubleTapListener(new bv(this));
      this.D = 0.0F;
      b(true);
      return;
      if (i1 < 8) {
        localObject = new cf((Context)localObject);
      } else {
        localObject = new cg((Context)localObject);
      }
    }
  }
  
  private float a(Matrix paramMatrix, int paramInt)
  {
    paramMatrix.getValues(this.q);
    return this.q[paramInt];
  }
  
  private RectF a(Matrix paramMatrix)
  {
    Object localObject = c();
    if (localObject != null)
    {
      localObject = ((ImageView)localObject).getDrawable();
      if (localObject != null)
      {
        this.p.set(0.0F, 0.0F, ((Drawable)localObject).getIntrinsicWidth(), ((Drawable)localObject).getIntrinsicHeight());
        paramMatrix.mapRect(this.p);
        return this.p;
      }
    }
    return null;
  }
  
  private void a(Drawable paramDrawable)
  {
    Object localObject = c();
    if ((localObject == null) || (paramDrawable == null)) {
      return;
    }
    float f1 = b((ImageView)localObject);
    float f2 = c((ImageView)localObject);
    int i1 = paramDrawable.getIntrinsicWidth();
    int i2 = paramDrawable.getIntrinsicHeight();
    this.m.reset();
    float f3 = f1 / i1;
    float f4 = f2 / i2;
    if (this.F == ImageView.ScaleType.CENTER) {
      this.m.postTranslate((f1 - i1) / 2.0F, (f2 - i2) / 2.0F);
    }
    for (;;)
    {
      q();
      return;
      if (this.F == ImageView.ScaleType.CENTER_CROP)
      {
        f3 = Math.max(f3, f4);
        this.m.postScale(f3, f3);
        this.m.postTranslate((f1 - i1 * f3) / 2.0F, (f2 - i2 * f3) / 2.0F);
      }
      else if (this.F == ImageView.ScaleType.CENTER_INSIDE)
      {
        f3 = Math.min(1.0F, Math.min(f3, f4));
        this.m.postScale(f3, f3);
        this.m.postTranslate((f1 - i1 * f3) / 2.0F, (f2 - i2 * f3) / 2.0F);
      }
      else
      {
        paramDrawable = new RectF(0.0F, 0.0F, i1, i2);
        localObject = new RectF(0.0F, 0.0F, f1, f2);
        switch (r()[this.F.ordinal()])
        {
        default: 
          break;
        case 4: 
          this.m.setRectToRect(paramDrawable, (RectF)localObject, Matrix.ScaleToFit.CENTER);
          break;
        case 6: 
          this.m.setRectToRect(paramDrawable, (RectF)localObject, Matrix.ScaleToFit.START);
          break;
        case 5: 
          this.m.setRectToRect(paramDrawable, (RectF)localObject, Matrix.ScaleToFit.END);
          break;
        case 7: 
          this.m.setRectToRect(paramDrawable, (RectF)localObject, Matrix.ScaleToFit.FILL);
        }
      }
    }
  }
  
  private static void a(ImageView paramImageView)
  {
    if ((paramImageView != null) && (!(paramImageView instanceof bw)) && (!ImageView.ScaleType.MATRIX.equals(paramImageView.getScaleType()))) {
      paramImageView.setScaleType(ImageView.ScaleType.MATRIX);
    }
  }
  
  private static int b(ImageView paramImageView)
  {
    if (paramImageView == null) {
      return 0;
    }
    return paramImageView.getWidth() - paramImageView.getPaddingLeft() - paramImageView.getPaddingRight();
  }
  
  private void b(Matrix paramMatrix)
  {
    ImageView localImageView1 = c();
    if (localImageView1 != null)
    {
      ImageView localImageView2 = c();
      if ((localImageView2 != null) && (!(localImageView2 instanceof bw)) && (!ImageView.ScaleType.MATRIX.equals(localImageView2.getScaleType()))) {
        throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
      }
      localImageView1.setImageMatrix(paramMatrix);
      if ((this.r != null) && (a(paramMatrix) != null)) {
        paramMatrix = this.r;
      }
    }
  }
  
  private static int c(ImageView paramImageView)
  {
    if (paramImageView == null) {
      return 0;
    }
    return paramImageView.getHeight() - paramImageView.getPaddingTop() - paramImageView.getPaddingBottom();
  }
  
  private static void c(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 >= paramFloat2) {
      throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
    }
    if (paramFloat2 >= paramFloat3) {
      throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
    }
  }
  
  private void n()
  {
    if (this.B != null)
    {
      this.B.a();
      this.B = null;
    }
  }
  
  private void o()
  {
    if (p()) {
      b(l());
    }
  }
  
  private boolean p()
  {
    float f2 = 0.0F;
    ImageView localImageView = c();
    if (localImageView == null) {
      return false;
    }
    RectF localRectF = a(l());
    if (localRectF == null) {
      return false;
    }
    float f1 = localRectF.height();
    float f3 = localRectF.width();
    int i1 = c(localImageView);
    if (f1 <= i1) {
      switch (r()[this.F.ordinal()])
      {
      default: 
        f1 = (i1 - f1) / 2.0F - localRectF.top;
      }
    }
    for (;;)
    {
      i1 = b(localImageView);
      if (f3 <= i1) {
        switch (r()[this.F.ordinal()])
        {
        default: 
          f2 = (i1 - f3) / 2.0F - localRectF.left;
          label170:
          this.C = 2;
        }
      }
      for (;;)
      {
        this.o.postTranslate(f2, f1);
        return true;
        f1 = -localRectF.top;
        break;
        f1 = i1 - f1 - localRectF.top;
        break;
        if (localRectF.top > 0.0F)
        {
          f1 = -localRectF.top;
          break;
        }
        if (localRectF.bottom >= i1) {
          break label345;
        }
        f1 = i1 - localRectF.bottom;
        break;
        f2 = -localRectF.left;
        break label170;
        f2 = i1 - f3 - localRectF.left;
        break label170;
        if (localRectF.left > 0.0F)
        {
          this.C = 0;
          f2 = -localRectF.left;
        }
        else if (localRectF.right < i1)
        {
          f2 = i1 - localRectF.right;
          this.C = 1;
        }
        else
        {
          this.C = -1;
        }
      }
      label345:
      f1 = 0.0F;
    }
  }
  
  private void q()
  {
    this.o.reset();
    b(0.0F);
    b(l());
    p();
  }
  
  public final void a()
  {
    if (this.j == null) {
      return;
    }
    ImageView localImageView = (ImageView)this.j.get();
    if (localImageView != null)
    {
      ViewTreeObserver localViewTreeObserver = localImageView.getViewTreeObserver();
      if ((localViewTreeObserver != null) && (localViewTreeObserver.isAlive())) {
        localViewTreeObserver.removeGlobalOnLayoutListener(this);
      }
      localImageView.setOnTouchListener(null);
      n();
    }
    if (this.k != null) {
      this.k.setOnDoubleTapListener(null);
    }
    this.r = null;
    this.s = null;
    this.t = null;
    this.j = null;
  }
  
  public final void a(float paramFloat)
  {
    this.o.setRotate(paramFloat % 360.0F);
    o();
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    if (this.l.a()) {}
    Object localObject;
    do
    {
      do
      {
        return;
        if (d) {
          ck.a().a("PhotoViewAttacher", String.format("onDrag: dx: %.2f. dy: %.2f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2) }));
        }
        localObject = c();
        this.o.postTranslate(paramFloat1, paramFloat2);
        o();
        localObject = ((ImageView)localObject).getParent();
        if ((!this.h) || (this.l.a()) || (this.i)) {
          break;
        }
      } while (((this.C != 2) && ((this.C != 0) || (paramFloat1 < 1.0F)) && ((this.C != 1) || (paramFloat1 > -1.0F))) || (localObject == null));
      ((ViewParent)localObject).requestDisallowInterceptTouchEvent(false);
      return;
    } while (localObject == null);
    ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (d) {
      ck.a().a("PhotoViewAttacher", String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", new Object[] { Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Float.valueOf(paramFloat3) }));
    }
    if (((g() < this.g) || (paramFloat1 < 1.0F)) && ((g() > this.e) || (paramFloat1 > 1.0F)))
    {
      if (this.v != null) {
        cd localcd = this.v;
      }
      this.o.postScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
      o();
    }
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if (d) {
      ck.a().a("PhotoViewAttacher", "onFling. sX: " + paramFloat1 + " sY: " + paramFloat2 + " Vx: " + paramFloat3 + " Vy: " + paramFloat4);
    }
    ImageView localImageView = c();
    this.B = new ca(this, localImageView.getContext());
    this.B.a(b(localImageView), c(localImageView), (int)paramFloat3, (int)paramFloat4);
    localImageView.post(this.B);
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3, boolean paramBoolean)
  {
    ImageView localImageView = c();
    if (localImageView != null)
    {
      if ((paramFloat1 < this.e) || (paramFloat1 > this.g)) {
        ck.a().b("PhotoViewAttacher", "Scale must be within the range of minScale and maxScale");
      }
    }
    else {
      return;
    }
    if (paramBoolean)
    {
      localImageView.post(new bz(this, g(), paramFloat1, paramFloat2, paramFloat3));
      return;
    }
    this.o.setScale(paramFloat1, paramFloat1, paramFloat2, paramFloat3);
    o();
  }
  
  public final void a(float paramFloat, boolean paramBoolean)
  {
    ImageView localImageView = c();
    if (localImageView != null) {
      a(paramFloat, localImageView.getRight() / 2, localImageView.getBottom() / 2, paramBoolean);
    }
  }
  
  public final void a(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt < 0) {
      i1 = 200;
    }
    this.b = i1;
  }
  
  public final void a(GestureDetector.OnDoubleTapListener paramOnDoubleTapListener)
  {
    if (paramOnDoubleTapListener != null)
    {
      this.k.setOnDoubleTapListener(paramOnDoubleTapListener);
      return;
    }
    this.k.setOnDoubleTapListener(new bv(this));
  }
  
  public final void a(View.OnLongClickListener paramOnLongClickListener)
  {
    this.u = paramOnLongClickListener;
  }
  
  public final void a(ImageView.ScaleType paramScaleType)
  {
    if (paramScaleType == null) {}
    for (int i1 = 0;; i1 = 1)
    {
      if ((i1 != 0) && (paramScaleType != this.F))
      {
        this.F = paramScaleType;
        k();
      }
      return;
      switch (r()[paramScaleType.ordinal()])
      {
      }
    }
    throw new IllegalArgumentException(paramScaleType.name() + " is not supported in PhotoView");
  }
  
  public final void a(cb paramcb)
  {
    this.r = paramcb;
  }
  
  public final void a(cc paramcc)
  {
    this.s = paramcc;
  }
  
  public final void a(cd paramcd)
  {
    this.v = paramcd;
  }
  
  public final void a(ce paramce)
  {
    this.w = paramce;
  }
  
  public final void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public final RectF b()
  {
    p();
    return a(l());
  }
  
  public final void b(float paramFloat)
  {
    this.o.postRotate(paramFloat % 360.0F);
    o();
  }
  
  public final void b(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    c(paramFloat1, paramFloat2, paramFloat3);
    this.e = paramFloat1;
    this.f = paramFloat2;
    this.g = paramFloat3;
  }
  
  public final void b(cd paramcd)
  {
    this.t = paramcd;
  }
  
  public final void b(boolean paramBoolean)
  {
    this.E = paramBoolean;
    k();
  }
  
  public final ImageView c()
  {
    ImageView localImageView = null;
    if (this.j != null) {
      localImageView = (ImageView)this.j.get();
    }
    if (localImageView == null)
    {
      a();
      ck.a().b("PhotoViewAttacher", "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
    }
    return localImageView;
  }
  
  public final void c(float paramFloat)
  {
    c(paramFloat, this.f, this.g);
    this.e = paramFloat;
  }
  
  public final float d()
  {
    return this.e;
  }
  
  public final void d(float paramFloat)
  {
    c(this.e, paramFloat, this.g);
    this.f = paramFloat;
  }
  
  public final float e()
  {
    return this.f;
  }
  
  public final void e(float paramFloat)
  {
    c(this.e, this.f, paramFloat);
    this.g = paramFloat;
  }
  
  public final float f()
  {
    return this.g;
  }
  
  public final void f(float paramFloat)
  {
    a(paramFloat, false);
  }
  
  public final float g()
  {
    return (float)Math.sqrt((float)Math.pow(a(this.o, 0), 2.0D) + (float)Math.pow(a(this.o, 3), 2.0D));
  }
  
  public final ImageView.ScaleType h()
  {
    return this.F;
  }
  
  public final cc i()
  {
    return this.s;
  }
  
  public final cd j()
  {
    return this.t;
  }
  
  public final void k()
  {
    ImageView localImageView = c();
    if (localImageView != null)
    {
      if (this.E)
      {
        a(localImageView);
        a(localImageView.getDrawable());
      }
    }
    else {
      return;
    }
    q();
  }
  
  public final Matrix l()
  {
    this.n.set(this.m);
    this.n.postConcat(this.o);
    return this.n;
  }
  
  public final void onGlobalLayout()
  {
    ImageView localImageView = c();
    if (localImageView != null)
    {
      if (!this.E) {
        break label103;
      }
      int i1 = localImageView.getTop();
      int i2 = localImageView.getRight();
      int i3 = localImageView.getBottom();
      int i4 = localImageView.getLeft();
      if ((i1 != this.x) || (i3 != this.z) || (i4 != this.A) || (i2 != this.y))
      {
        a(localImageView.getDrawable());
        this.x = i1;
        this.y = i2;
        this.z = i3;
        this.A = i4;
      }
    }
    return;
    label103:
    a(localImageView.getDrawable());
  }
  
  @SuppressLint({"ClickableViewAccessibility"})
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    boolean bool2 = false;
    if (this.E)
    {
      Object localObject = (ImageView)paramView;
      int i1;
      label72:
      boolean bool1;
      label75:
      boolean bool3;
      if ((localObject != null) && (((ImageView)localObject).getDrawable() != null))
      {
        i1 = 1;
        if (i1 == 0) {
          break label319;
        }
        localObject = paramView.getParent();
        switch (paramMotionEvent.getAction())
        {
        case 2: 
        default: 
          bool1 = false;
          if (this.l != null)
          {
            bool1 = this.l.a();
            boolean bool4 = this.l.b();
            bool3 = this.l.c(paramMotionEvent);
            if ((bool1) || (this.l.a())) {
              break label307;
            }
            i1 = 1;
            label128:
            if ((bool4) || (this.l.b())) {
              break label313;
            }
          }
          break;
        }
      }
      label307:
      label313:
      for (int i2 = 1;; i2 = 0)
      {
        bool1 = bool2;
        if (i1 != 0)
        {
          bool1 = bool2;
          if (i2 != 0) {
            bool1 = true;
          }
        }
        this.i = bool1;
        bool1 = bool3;
        bool2 = bool1;
        if (this.k != null)
        {
          bool2 = bool1;
          if (this.k.onTouchEvent(paramMotionEvent)) {
            bool2 = true;
          }
        }
        return bool2;
        i1 = 0;
        break;
        if (localObject != null) {
          ((ViewParent)localObject).requestDisallowInterceptTouchEvent(true);
        }
        for (;;)
        {
          n();
          bool1 = false;
          break;
          ck.a().b("PhotoViewAttacher", "onTouch getParent() returned null");
        }
        if (g() >= this.e) {
          break label72;
        }
        localObject = b();
        if (localObject == null) {
          break label72;
        }
        paramView.post(new bz(this, g(), this.e, ((RectF)localObject).centerX(), ((RectF)localObject).centerY()));
        bool1 = true;
        break label75;
        i1 = 0;
        break label128;
      }
    }
    label319:
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */