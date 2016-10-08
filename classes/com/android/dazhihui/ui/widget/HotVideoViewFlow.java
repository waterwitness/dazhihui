package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.Scroller;
import com.android.dazhihui.f;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import com.android.dazhihui.ui.model.stock.adapter.StockChartVideoAdapter;
import com.android.dazhihui.ui.screen.stock.eu;
import com.android.dazhihui.ui.screen.y;
import java.util.ArrayList;

public class HotVideoViewFlow
  extends LinearLayout
  implements View.OnClickListener
{
  public static int a = 600;
  public static int b = 123;
  private Drawable A;
  private boolean B = true;
  private eu C;
  private y D;
  private View E;
  private VelocityTracker F;
  private AlphaAnimation G;
  private AlphaAnimation H;
  private ImageView I;
  private ImageView J;
  private StockChartVideoAdapter K;
  private int L;
  private ef M = ef.c;
  private boolean N = false;
  private boolean O = true;
  private boolean P = false;
  private int Q;
  private int R;
  private int S;
  private int T;
  private boolean U;
  private int V;
  private View W;
  private View aa;
  private ImageView ab;
  private Handler ac = new dz(this);
  public boolean c = false;
  private Context d;
  private Scroller e;
  private int f = 0;
  private int g = 0;
  private int h = 0;
  private int i = 0;
  private int j = 0;
  private int k = 0;
  private int l = 0;
  private boolean m = false;
  private boolean n = false;
  private boolean o = false;
  private int p = 200;
  private int q;
  private HorizontalTextView r;
  private ImageView s;
  private ListView t;
  private int u;
  private int v = 0;
  private int w = 0;
  private int x;
  private ArrayList<HotVideoPushStockVo> y;
  private ArrayList<HotVideoPushStockVo> z = new ArrayList();
  
  public HotVideoViewFlow(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public HotVideoViewFlow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.d = paramContext;
    paramContext.obtainStyledAttributes(paramAttributeSet, f.StockVieFlow).recycle();
    e();
  }
  
  public HotVideoViewFlow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
  }
  
  private void e()
  {
    LinearInterpolator localLinearInterpolator = new LinearInterpolator();
    this.e = new Scroller(this.d, localLinearInterpolator);
    this.f = getWidth();
    this.g = getHeight();
    this.q = (this.f / 3);
    this.x = this.d.getResources().getDimensionPixelOffset(2131230774);
    setBackgroundColor(Color.argb(0, 0, 0, 0));
    this.E = LayoutInflater.from(this.d).inflate(2130903442, null);
    addView(this.E);
    this.W = this.E.findViewById(2131560550);
    this.aa = this.E.findViewById(2131560553);
    this.ab = ((ImageView)this.E.findViewById(2131560552));
    this.r = ((HorizontalTextView)this.E.findViewById(2131560551));
    this.r.setTopDrawable(this.d.getResources().getDrawable(2130838080));
    this.r.setType(1);
    this.r.setTextColor(this.d.getResources().getColor(2131493677));
    this.r.setText("视吧");
    this.s = ((ImageView)this.E.findViewById(2131560554));
    this.s.setVisibility(0);
    this.t = ((ListView)this.E.findViewById(2131560555));
    this.A = getResources().getDrawable(2130838412);
    this.K = new StockChartVideoAdapter(this.d);
    this.K.setType(2);
    this.t.setAdapter(this.K);
    this.T = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.u = (g.a().m() - ((g.a().m() - this.A.getMinimumWidth()) / 1 + this.A.getMinimumWidth()));
    this.L = (g.a().m() * 15 / 41);
    this.t.postDelayed(new ea(this), 50L);
    a(g.a().b());
    this.t.setOnItemClickListener(new eb(this));
    this.W.setOnClickListener(this);
    this.aa.setOnClickListener(this);
    setOnClickListener(this);
  }
  
  public void a()
  {
    if (this.M == ef.b) {
      scrollTo(-(this.u + 15), 0);
    }
    for (;;)
    {
      this.m = false;
      if (this.n)
      {
        this.n = false;
        this.r.setTopDrawable(this.d.getResources().getDrawable(2130838080));
      }
      return;
      scrollTo(-this.u, 0);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.e.startScroll(paramInt1, getScrollY(), paramInt2, getScrollY(), paramInt3);
    invalidate();
  }
  
  public void a(y paramy)
  {
    this.D = paramy;
    int i1;
    if (this.D == y.a)
    {
      i1 = -14732977;
      this.r.setTextColor(-6710868);
      this.r.postInvalidate();
      this.E.setBackgroundResource(2130838631);
      this.ab.setBackgroundResource(2130838633);
      if (this.P) {
        this.s.setImageDrawable(this.d.getResources().getDrawable(2130838082));
      }
    }
    for (;;)
    {
      this.t.setDivider(new ColorDrawable(i1));
      this.t.setDividerHeight(getResources().getDimensionPixelOffset(2131230859));
      this.K.notifyDataSetChanged();
      return;
      this.s.setImageDrawable(this.d.getResources().getDrawable(2130838085));
      continue;
      i1 = -2564894;
      this.r.setTextColor(-9079414);
      this.r.postInvalidate();
      this.E.setBackgroundResource(2130838630);
      this.ab.setBackgroundResource(2130838632);
      if (this.P) {
        this.s.setImageDrawable(this.d.getResources().getDrawable(2130838083));
      } else {
        this.s.setImageDrawable(this.d.getResources().getDrawable(2130838086));
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      b();
      this.K.setAllHotData(this.y);
      this.K.setCloseStatus(1);
      this.K.setHotData(this.y);
      this.P = true;
    }
    while (this.D == y.a) {
      if (this.P)
      {
        this.ab.setVisibility(4);
        this.r.setVisibility(4);
        this.s.setImageDrawable(this.d.getResources().getDrawable(2130838082));
        return;
        this.z.clear();
        this.z.add(this.y.get(0));
        this.K.setCloseStatus(0);
        this.K.setAllHotData(this.y);
        this.K.setHotData(this.z);
        this.P = false;
        c();
      }
      else
      {
        this.r.setVisibility(0);
        this.ab.setVisibility(0);
        this.s.setImageDrawable(this.d.getResources().getDrawable(2130838085));
        return;
      }
    }
    if (this.P)
    {
      this.ab.setVisibility(4);
      this.r.setVisibility(4);
      this.s.setImageDrawable(this.d.getResources().getDrawable(2130838083));
      return;
    }
    this.r.setVisibility(0);
    this.r.setVisibility(0);
    this.s.setImageDrawable(this.d.getResources().getDrawable(2130838086));
  }
  
  public void b()
  {
    this.ac.removeMessages(b);
    if (this.I != null)
    {
      this.G.cancel();
      this.H.cancel();
      this.I.clearAnimation();
      this.J.clearAnimation();
    }
    this.ac.removeMessages(b);
  }
  
  public void c()
  {
    if (this.y.size() <= 1) {
      return;
    }
    String str = ((HotVideoPushStockVo)this.y.get(0)).getOwnerPeriod();
    if (!TextUtils.isEmpty(str)) {}
    for (;;)
    {
      try
      {
        i1 = Integer.parseInt(str);
        this.c = false;
        if (this.y.size() <= 1) {
          break;
        }
        this.ac.sendMessageDelayed(this.ac.obtainMessage(b), i1);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        i1 = 5000;
        continue;
      }
      int i1 = 5000;
    }
  }
  
  public void computeScroll()
  {
    if (this.e.computeScrollOffset())
    {
      scrollTo(this.e.getCurrX(), this.e.getCurrY());
      postInvalidate();
    }
    super.computeScroll();
  }
  
  public void d()
  {
    if (this.y.size() <= 1) {}
    View localView;
    do
    {
      return;
      this.G = new AlphaAnimation(1.0F, 0.0F);
      this.H = new AlphaAnimation(0.0F, 1.0F);
      this.G.setDuration(2000L);
      this.H.setDuration(2000L);
      this.G.setFillAfter(true);
      this.H.setFillAfter(true);
      localView = this.t.getChildAt(0);
    } while (localView == null);
    this.I = ((ImageView)localView.findViewById(2131559284));
    this.J = ((ImageView)localView.findViewById(2131559283));
    this.J.startAnimation(this.H);
    this.I.startAnimation(this.G);
    this.H.setAnimationListener(new ed(this));
    this.G.setAnimationListener(new ee(this));
  }
  
  public StockChartVideoAdapter getAdapter()
  {
    return this.K;
  }
  
  public ArrayList<HotVideoPushStockVo> getHotVideoData()
  {
    return this.y;
  }
  
  public int getItemHeight()
  {
    if (this.Q != 0) {
      return this.Q;
    }
    if (this.y.size() == 0) {}
    View localView;
    for (this.Q = 0;; this.Q = localView.getMeasuredHeight())
    {
      ((RelativeLayout.LayoutParams)this.W.getLayoutParams()).height = this.Q;
      ((RelativeLayout.LayoutParams)this.aa.getLayoutParams()).height = this.Q;
      ((LinearLayout.LayoutParams)this.r.getLayoutParams()).height = this.Q;
      requestLayout();
      return this.Q;
      localView = this.K.getView(0, null, this.t);
      if (localView == null)
      {
        this.Q = 0;
        return this.Q;
      }
      localView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
    }
  }
  
  public int getLeftWidth()
  {
    return this.u;
  }
  
  public boolean getViewOpenStaus()
  {
    return this.m;
  }
  
  public HorizontalTextView getmHotViewArrow()
  {
    return this.r;
  }
  
  public ListView getmHotViewFlow()
  {
    return this.t;
  }
  
  public void onClick(View paramView)
  {
    if (paramView.getId() == 2131560550) {
      if (!this.P) {}
    }
    while ((paramView.getId() != 2131560553) || (this.y == null) || (this.y.size() <= 1))
    {
      return;
      if (this.m)
      {
        this.m = false;
        a(getScrollX(), -(this.f - this.r.getWidth()) - getScrollX(), this.p);
      }
      while (!this.m)
      {
        this.r.setTopDrawable(this.d.getResources().getDrawable(2130838079));
        return;
        this.m = true;
        a(getScrollX(), 0 - getScrollX(), this.p);
      }
      this.r.setTopDrawable(this.d.getResources().getDrawable(2130838080));
      return;
    }
    if (this.P)
    {
      a(false);
      return;
    }
    a(true);
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.c = false;
    this.N = false;
    this.O = true;
    this.ac.removeMessages(b);
    a();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.f = getWidth();
    int i1;
    int i3;
    if (this.M == ef.b)
    {
      this.q = ((this.f - getResources().getDimensionPixelOffset(2131230814)) / 6 + getResources().getDimensionPixelOffset(2131230814));
      getItemHeight();
      this.u = (this.f - this.q);
      i1 = (int)paramMotionEvent.getRawY();
      i3 = (int)paramMotionEvent.getRawX();
      switch (paramMotionEvent.getAction())
      {
      }
    }
    int i2;
    do
    {
      for (;;)
      {
        return false;
        this.q = this.A.getMinimumWidth();
        break;
        this.R = i1;
        this.S = i3;
      }
      i2 = this.R;
      i3 -= this.S;
    } while (((Math.abs(i3) <= this.T) || (Math.abs(i3) <= Math.abs(i1 - i2))) && (!this.U));
    getParent().requestDisallowInterceptTouchEvent(true);
    return true;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.F == null) {
      this.F = VelocityTracker.obtain();
    }
    this.F.addMovement(paramMotionEvent);
    int i1;
    if (!this.o)
    {
      i1 = this.r.getWidth();
      switch (paramMotionEvent.getAction())
      {
      }
    }
    for (;;)
    {
      return false;
      b();
      this.h = ((int)paramMotionEvent.getRawX());
      this.v = ((int)paramMotionEvent.getX());
      this.w = ((int)paramMotionEvent.getY());
      if ((this.e != null) && (!this.e.isFinished())) {
        this.e.abortAnimation();
      }
      if (!this.m)
      {
        this.V = (this.v - (this.f - this.r.getWidth()));
        if ((this.V > 0) && (this.V <= this.r.getWidth() + this.x * 5 / 2))
        {
          getParent().requestDisallowInterceptTouchEvent(true);
          return true;
        }
        return false;
      }
      return false;
      this.i = ((int)paramMotionEvent.getX());
      this.j = (this.i - this.S);
      if ((this.e != null) && (!this.e.isFinished())) {
        this.e.abortAnimation();
      }
      if ((!this.P) && (Math.abs(this.j) > 20))
      {
        int i2;
        if (this.j < 0)
        {
          if (Math.abs(this.j) <= this.f - this.q)
          {
            i1 = -(this.f - this.q);
            i2 = this.j;
            if (!this.m) {
              scrollTo(i1 - i2, 0);
            }
          }
        }
        else if (!this.n) {
          if (this.m)
          {
            if (Math.abs(this.j) < this.f - this.q) {
              scrollTo(-this.j, 0);
            }
          }
          else if (Math.abs(this.j) <= this.q - i1)
          {
            scrollTo(this.q - this.f - this.j, 0);
            continue;
            if ((this.e != null) && (!this.e.isFinished())) {
              this.e.abortAnimation();
            }
            this.k = ((int)paramMotionEvent.getX());
            getScrollX();
            i2 = (this.f - i1) / 1;
            if (!this.P)
            {
              paramMotionEvent = this.F;
              paramMotionEvent.computeCurrentVelocity(1000);
              i2 = (int)paramMotionEvent.getXVelocity();
              if (this.S > this.k) {
                if (!this.m)
                {
                  if (i2 >= -a) {
                    break label589;
                  }
                  a(getScrollX(), 0 - getScrollX(), this.p / 3);
                  if (!this.N) {
                    this.K.notifyDataSetChanged();
                  }
                  this.N = true;
                  this.m = true;
                  this.n = false;
                }
              }
              for (;;)
              {
                if (!this.m) {
                  break label1049;
                }
                this.r.setTopDrawable(this.d.getResources().getDrawable(2130838080));
                break;
                label589:
                if (Math.abs(this.k - this.S) > (this.f - this.q) / 2)
                {
                  a(getScrollX(), 0 - getScrollX(), this.p);
                  if (!this.N) {
                    this.K.notifyDataSetChanged();
                  }
                  this.N = true;
                  this.m = true;
                  this.n = false;
                }
                else
                {
                  a(getScrollX(), -(this.f - i1) - getScrollX(), this.p * 2);
                  this.m = false;
                  this.n = false;
                  continue;
                  if (!this.m)
                  {
                    if (!this.n)
                    {
                      if (Math.abs(this.k - this.S) > this.q / 2)
                      {
                        if (i2 > a) {
                          a(getScrollX(), -(this.f - i1) - getScrollX(), this.p / 3);
                        }
                        for (;;)
                        {
                          this.n = true;
                          this.r.setTopDrawable(this.d.getResources().getDrawable(2130838079));
                          break;
                          a(getScrollX(), -(this.f - i1) - getScrollX(), this.p);
                        }
                      }
                      if (i2 > a) {
                        a(getScrollX(), this.q - this.f - getScrollX(), this.p);
                      }
                      for (;;)
                      {
                        this.r.setTopDrawable(this.d.getResources().getDrawable(2130838080));
                        this.n = false;
                        break;
                        a(getScrollX(), this.q - this.f - getScrollX(), this.p);
                      }
                    }
                  }
                  else
                  {
                    this.n = false;
                    if (i2 > a)
                    {
                      a(getScrollX(), -(this.f - i1) - getScrollX(), this.p / 3);
                      this.m = false;
                    }
                    else if (Math.abs(this.k - this.S) > (this.f - this.q) / 2)
                    {
                      a(getScrollX(), -(this.f - i1) - getScrollX(), this.p * 2);
                      this.m = false;
                    }
                    else
                    {
                      a(getScrollX(), 0 - getScrollX(), this.p);
                      this.m = true;
                    }
                  }
                }
              }
              label1049:
              this.r.setTopDrawable(this.d.getResources().getDrawable(2130838079));
            }
          }
        }
      }
    }
  }
  
  public void setHolder(eu parameu)
  {
    this.C = parameu;
  }
  
  public void setHotvideoData(ArrayList<HotVideoPushStockVo> paramArrayList)
  {
    this.N = false;
    this.y = paramArrayList;
    this.K.setAllHotData(this.y);
    if (this.P)
    {
      b();
      this.K.setCloseStatus(1);
      this.K.setHotData(this.y);
    }
    for (;;)
    {
      if ((this.O) || (getVisibility() == 8)) {
        postDelayed(new ec(this), 1000L);
      }
      return;
      this.z.clear();
      this.z.add(this.y.get(0));
      this.K.setCloseStatus(0);
      this.K.setHotData(this.z);
    }
  }
  
  public void setType(ef paramef)
  {
    this.M = paramef;
    this.f = getWidth();
    if (this.f == 0) {
      this.f = g.a().m();
    }
    if (this.M == ef.b) {
      this.L = ((this.f - getResources().getDimensionPixelOffset(2131230814)) / 3);
    }
    for (this.q = ((this.f - getResources().getDimensionPixelOffset(2131230814)) / 6 + getResources().getDimensionPixelOffset(2131230814));; this.q = this.A.getMinimumWidth())
    {
      this.u = (this.f - this.q);
      a();
      return;
    }
  }
  
  public void setmHotViewFlow(ListView paramListView)
  {
    this.t = paramListView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\HotVideoViewFlow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */