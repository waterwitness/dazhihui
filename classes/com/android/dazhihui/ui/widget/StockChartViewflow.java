package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.android.dazhihui.b.b;
import com.android.dazhihui.d.n;
import com.android.dazhihui.f;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.HotVideoPushStockVo;
import com.android.dazhihui.ui.model.stock.StockVo;
import com.android.dazhihui.ui.model.stock.adapter.StockChartVideoAdapter;
import com.android.dazhihui.ui.screen.stock.MoreNewsListScreen;
import com.android.dazhihui.ui.screen.stock.SelfStockMoreListScreen;
import com.android.dazhihui.ui.screen.stock.uv;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.stockchart.StockChartContainer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class StockChartViewflow
  extends LinearLayout
{
  public static int a = 600;
  public static int b = 123;
  private StockChartContainer A;
  private y B;
  private View C;
  private VelocityTracker D;
  private AlphaAnimation E;
  private AlphaAnimation F;
  private CircleImageView G;
  private CircleImageView H;
  private TextView I;
  private StockChartVideoAdapter J;
  private int K;
  private lf L;
  private boolean M = false;
  private boolean N = false;
  private SimpleDateFormat O = new SimpleDateFormat("yyyy-MM-dd");
  private boolean P = false;
  private Handler Q = new la(this);
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
  private GridView t;
  private int u;
  private int v = 0;
  private int w;
  private ArrayList<HotVideoPushStockVo> x;
  private Drawable y;
  private boolean z = true;
  
  public StockChartViewflow(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public StockChartViewflow(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.d = paramContext;
    paramContext.obtainStyledAttributes(paramAttributeSet, f.StockVieFlow).recycle();
    g();
  }
  
  public StockChartViewflow(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    this(paramContext, paramAttributeSet);
  }
  
  private void g()
  {
    AccelerateInterpolator localAccelerateInterpolator = new AccelerateInterpolator();
    this.e = new Scroller(this.d, localAccelerateInterpolator);
    this.f = getWidth();
    this.g = getHeight();
    this.q = (this.f / 3);
    this.w = this.d.getResources().getDimensionPixelOffset(2131230774);
    setBackgroundColor(Color.argb(0, 0, 0, 0));
    this.C = LayoutInflater.from(this.d).inflate(2130903447, null);
    addView(this.C);
    this.r = ((HorizontalTextView)this.C.findViewById(2131560554));
    this.r.setTextColor(this.d.getResources().getColor(2131493677));
    this.r.setText("视吧");
    this.r.setTopDrawable(this.d.getResources().getDrawable(2130838080));
    this.t = ((GridView)this.C.findViewById(2131560555));
    this.s = ((ImageView)this.C.findViewById(2131560552));
    this.y = getResources().getDrawable(2130838412);
    this.J = new StockChartVideoAdapter(this.d);
    this.t.setAdapter(this.J);
    this.u = (g.a().m() - ((g.a().m() - this.y.getMinimumWidth()) / 5 + this.y.getMinimumWidth()));
    this.K = (g.a().m() * 15 / 41);
    this.t.postDelayed(new lb(this), 50L);
    a(g.a().b());
  }
  
  public void a()
  {
    scrollTo(0, getScrollY());
    this.m = true;
    this.n = false;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.e.startScroll(paramInt1, getScrollY(), paramInt2, getScrollY(), paramInt3);
    invalidate();
  }
  
  public void a(int paramInt, CircleImageView paramCircleImageView)
  {
    if (this.x.size() <= paramInt) {
      return;
    }
    String str2 = ((HotVideoPushStockVo)this.x.get(paramInt)).getOwnerAccountImg();
    Object localObject = new Date(System.currentTimeMillis());
    String str3 = this.O.format((Date)localObject);
    localObject = str2;
    if (!TextUtils.isEmpty(str2))
    {
      localObject = str2;
      if (str2.length() > 1) {
        if (!str2.substring(str2.length() - 1, str2.length()).equals("?")) {
          break label242;
        }
      }
    }
    label242:
    String str1;
    for (localObject = str2 + "time=" + str3;; str1 = str2 + "?time=" + str3)
    {
      com.android.dazhihui.ui.widget.a.r.a(this.d).a((String)localObject, paramCircleImageView, 2130838081);
      str2 = ((HotVideoPushStockVo)this.x.get(paramInt)).getColor();
      paramCircleImageView.setIsHasCirlCle(true);
      if (TextUtils.isEmpty(str2)) {
        break;
      }
      localObject = str2;
      try
      {
        if (str2.contains("#")) {
          localObject = str2.replace("#", "");
        }
        paramCircleImageView.setCirlCleColor(Color.parseColor("#" + (String)localObject));
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        paramCircleImageView.setCirlCleColor(this.d.getResources().getColor(2131493412));
        return;
      }
    }
    paramCircleImageView.setCirlCleColor(this.d.getResources().getColor(2131493412));
  }
  
  public void a(y paramy)
  {
    this.B = paramy;
    if (this.B == y.a)
    {
      this.C.setBackgroundResource(2130838631);
      this.s.setBackgroundResource(2130838633);
      this.r.setTextColor(-6710868);
      this.r.postInvalidate();
      return;
    }
    this.C.setBackgroundResource(2130838630);
    this.s.setBackgroundResource(2130838632);
    this.r.setTextColor(-9079414);
    this.r.postInvalidate();
  }
  
  public void b()
  {
    if (this.L == lf.b) {
      scrollTo(-(this.u + 15), 0);
    }
    for (;;)
    {
      this.n = false;
      this.m = false;
      this.r.setTopDrawable(this.d.getResources().getDrawable(2130838080));
      return;
      scrollTo(-this.u, 0);
    }
  }
  
  public void c()
  {
    if (this.c) {
      e();
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
    this.Q.removeMessages(b);
    if (this.G != null)
    {
      this.E.cancel();
      this.F.cancel();
      this.G.clearAnimation();
      this.H.clearAnimation();
    }
    this.Q.removeMessages(b);
    this.N = false;
  }
  
  public void e()
  {
    if ((this.x.size() <= 1) || (getViewOpenStaus())) {
      return;
    }
    String str = ((HotVideoPushStockVo)this.x.get(0)).getOwnerPeriod();
    if (!TextUtils.isEmpty(str)) {}
    for (;;)
    {
      try
      {
        i1 = Integer.parseInt(str);
        this.c = false;
        if ((this.x.size() <= 1) || (getViewOpenStaus())) {
          break;
        }
        this.Q.removeMessages(b);
        this.Q.sendMessageDelayed(this.Q.obtainMessage(b), i1);
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
  
  public void f()
  {
    if ((this.x.size() <= 1) || (getViewOpenStaus())) {}
    View localView;
    do
    {
      return;
      this.E = new AlphaAnimation(1.0F, 0.0F);
      this.F = new AlphaAnimation(0.0F, 1.0F);
      this.E.setDuration(2000L);
      this.F.setDuration(2000L);
      this.E.setFillAfter(true);
      this.F.setFillAfter(true);
      localView = this.t.getChildAt(0);
    } while (localView == null);
    this.G = ((CircleImageView)localView.findViewById(2131559284));
    this.H = ((CircleImageView)localView.findViewById(2131559283));
    this.H.startAnimation(this.F);
    this.G.startAnimation(this.E);
    this.I = ((TextView)localView.findViewById(2131559285));
    this.F.setAnimationListener(new lc(this));
    this.E.setAnimationListener(new ld(this));
  }
  
  public StockChartVideoAdapter getAdapter()
  {
    return this.J;
  }
  
  public ArrayList<HotVideoPushStockVo> getHotVideoData()
  {
    return this.x;
  }
  
  public int getLeftWidth()
  {
    return this.u;
  }
  
  public boolean getViewOpenStaus()
  {
    return (this.m) || (this.n);
  }
  
  public GridView getmHotViewFlow()
  {
    return this.t;
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.c = false;
    this.M = false;
    this.N = false;
    this.n = false;
    this.Q.removeMessages(b);
    b();
  }
  
  protected void onFinishInflate()
  {
    super.onFinishInflate();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.f = getWidth();
    if (this.L == lf.b) {}
    for (this.q = ((this.f - getResources().getDimensionPixelOffset(2131230814)) / 6 + getResources().getDimensionPixelOffset(2131230814));; this.q = ((this.f - this.y.getMinimumWidth()) / this.t.getNumColumns() + this.y.getMinimumWidth()))
    {
      this.u = (this.f - this.q);
      if (paramMotionEvent.getAction() != 0) {
        break;
      }
      getParent().requestDisallowInterceptTouchEvent(true);
      return true;
    }
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.D == null) {
      this.D = VelocityTracker.obtain();
    }
    this.D.addMovement(paramMotionEvent);
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
      this.P = false;
      d();
      this.h = ((int)paramMotionEvent.getRawX());
      this.v = ((int)paramMotionEvent.getX());
      if ((this.e != null) && (!this.e.isFinished())) {
        this.e.abortAnimation();
      }
      return true;
      this.i = ((int)paramMotionEvent.getRawX());
      this.j = (this.i - this.h);
      if ((this.e != null) && (!this.e.isFinished())) {
        this.e.abortAnimation();
      }
      if (Math.abs(this.j) > 20)
      {
        int i2;
        if (this.j < 0)
        {
          if (Math.abs(this.j) <= this.f - this.q)
          {
            i1 = -(this.f - this.q);
            i2 = this.j;
            if (!this.m)
            {
              scrollTo(i1 - i2, 0);
              if (!this.P)
              {
                this.P = true;
                this.J.setHotData(this.x);
              }
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
            this.k = ((int)paramMotionEvent.getRawX());
            getScrollX();
            i2 = (this.f - i1) / this.t.getNumColumns();
            if (Math.abs(this.k - this.h) < 20)
            {
              if (!this.m)
              {
                if (!this.n) {
                  this.v -= this.f - this.q;
                }
              }
              else
              {
                label453:
                if ((this.v <= 0) || (this.v > i1 + 5)) {
                  break label650;
                }
                if (!this.m) {
                  break label572;
                }
                a(getScrollX(), -(this.f - i1) - getScrollX(), this.p * 2);
                this.m = false;
                this.n = true;
                label513:
                if (!this.m) {
                  break label632;
                }
                d();
              }
              for (;;)
              {
                if (this.n)
                {
                  this.r.setTopDrawable(this.d.getResources().getDrawable(2130838079));
                  break;
                  this.v -= this.f - i1;
                  break label453;
                  label572:
                  if (this.n)
                  {
                    scrollTo(-(this.f - this.q), 0);
                    this.m = false;
                    this.n = false;
                    break label513;
                  }
                  scrollTo(-(this.f - i1), 0);
                  this.m = false;
                  this.n = true;
                  break label513;
                  label632:
                  if (this.x.size() > 1)
                  {
                    e();
                    continue;
                    label650:
                    if (!this.m)
                    {
                      if ((i1 < this.v) && (this.v < i1 + i2))
                      {
                        if ((this.x != null) && (this.x.size() > 0))
                        {
                          d();
                          this.c = true;
                          if (this.L == lf.b) {
                            n.a(((HotVideoPushStockVo)this.x.get(0)).getOwnerName(), 20259);
                          }
                          for (;;)
                          {
                            com.android.dazhihui.d.r.a(((HotVideoPushStockVo)this.x.get(0)).getClickUrl(), b.a().f(), null, null);
                            break;
                            n.a(((HotVideoPushStockVo)this.x.get(0)).getOwnerName(), 20260);
                          }
                        }
                      }
                      else if (this.v < 0) {
                        if (this.L == lf.b)
                        {
                          Bundle localBundle;
                          if (!this.n)
                          {
                            if (this.v > -(this.K / 2))
                            {
                              n.a("", 1148);
                              paramMotionEvent = new Intent(this.d, MoreNewsListScreen.class);
                              localBundle = new Bundle();
                              localBundle.putString("url", "1");
                              localBundle.putInt("type", 2);
                              localBundle.putString("name", this.d.getResources().getString(2131166276));
                              paramMotionEvent.putExtras(localBundle);
                              this.d.startActivity(paramMotionEvent);
                            }
                            else if ((this.v < -this.K / 2) && (this.v > -(this.K * 3) / 2))
                            {
                              n.a("", 1245);
                              paramMotionEvent = new StockVo("创业", "SZ399006", 3, false);
                              localBundle = new Bundle();
                              localBundle.putParcelable("stock_vo", paramMotionEvent);
                              com.android.dazhihui.d.r.a(this.d, paramMotionEvent, localBundle);
                            }
                            else if ((this.v < -this.K * 3 / 2) && (this.v > -(this.K * 5) / 2))
                            {
                              n.a("", 1244);
                              paramMotionEvent = new StockVo("上证", "SH000001", 3, false);
                              localBundle = new Bundle();
                              localBundle.putParcelable("stock_vo", paramMotionEvent);
                              com.android.dazhihui.d.r.a(this.d, paramMotionEvent, localBundle);
                            }
                          }
                          else if (this.v > -(this.K / 2))
                          {
                            n.a("", 1186);
                            this.d.startActivity(new Intent(this.d, SelfStockMoreListScreen.class));
                          }
                          else if ((this.v < -(this.K / 2)) && (this.v > -this.K))
                          {
                            n.a("", 1148);
                            paramMotionEvent = new Intent(this.d, MoreNewsListScreen.class);
                            localBundle = new Bundle();
                            localBundle.putString("url", "1");
                            localBundle.putInt("type", 2);
                            localBundle.putString("name", this.d.getResources().getString(2131166276));
                            paramMotionEvent.putExtras(localBundle);
                            this.d.startActivity(paramMotionEvent);
                          }
                          else if ((this.v < -this.K) && (this.v > -(this.K * 2)))
                          {
                            n.a("", 1245);
                            paramMotionEvent = new StockVo("创业", "SZ399006", 3, false);
                            localBundle = new Bundle();
                            localBundle.putParcelable("stock_vo", paramMotionEvent);
                            com.android.dazhihui.d.r.a(this.d, paramMotionEvent, localBundle);
                          }
                          else if ((this.v < -this.K * 2) && (this.v > -(this.K * 3)))
                          {
                            n.a("", 1244);
                            paramMotionEvent = new StockVo("上证", "SH000001", 3, false);
                            localBundle = new Bundle();
                            localBundle.putParcelable("stock_vo", paramMotionEvent);
                            com.android.dazhihui.d.r.a(this.d, paramMotionEvent, localBundle);
                          }
                        }
                        else if (this.v > -this.K)
                        {
                          this.A.getHolder().n();
                        }
                      }
                    }
                    else
                    {
                      this.v -= i1;
                      d();
                      if ((this.v > 0) && (this.v <= i2))
                      {
                        if ((this.x != null) && (this.x.size() > 0))
                        {
                          this.c = true;
                          com.android.dazhihui.d.r.a(((HotVideoPushStockVo)this.x.get(0)).getClickUrl(), b.a().f(), null, null);
                          if (this.L == lf.b) {
                            n.a(((HotVideoPushStockVo)this.x.get(0)).getOwnerName(), 20259);
                          } else {
                            n.a(((HotVideoPushStockVo)this.x.get(0)).getOwnerName(), 20260);
                          }
                        }
                      }
                      else if ((i2 < this.v) && (this.v <= i2 * 2))
                      {
                        if ((this.x != null) && (this.x.size() > 1))
                        {
                          com.android.dazhihui.d.r.a(((HotVideoPushStockVo)this.x.get(1)).getClickUrl(), b.a().f(), null, null);
                          if (this.L == lf.b) {
                            n.a(((HotVideoPushStockVo)this.x.get(1)).getOwnerName(), 20259);
                          }
                          for (;;)
                          {
                            this.c = true;
                            break;
                            n.a(((HotVideoPushStockVo)this.x.get(1)).getOwnerName(), 20260);
                          }
                        }
                      }
                      else if ((i2 * 2 < this.v) && (this.v <= i2 * 3))
                      {
                        if ((this.x != null) && (this.x.size() > 2))
                        {
                          com.android.dazhihui.d.r.a(((HotVideoPushStockVo)this.x.get(2)).getClickUrl(), b.a().f(), null, null);
                          if (this.L == lf.b) {
                            n.a(((HotVideoPushStockVo)this.x.get(2)).getOwnerName(), 20259);
                          }
                          for (;;)
                          {
                            this.c = true;
                            break;
                            n.a(((HotVideoPushStockVo)this.x.get(2)).getOwnerName(), 20260);
                          }
                        }
                      }
                      else if ((i2 * 3 < this.v) && (this.v <= i2 * 4))
                      {
                        if ((this.x != null) && (this.x.size() > 3))
                        {
                          com.android.dazhihui.d.r.a(((HotVideoPushStockVo)this.x.get(3)).getClickUrl(), b.a().f(), null, null);
                          if (this.L == lf.b) {
                            n.a(((HotVideoPushStockVo)this.x.get(3)).getOwnerName(), 20259);
                          }
                          for (;;)
                          {
                            this.c = true;
                            break;
                            n.a(((HotVideoPushStockVo)this.x.get(3)).getOwnerName(), 20260);
                          }
                        }
                      }
                      else if ((i2 * 4 < this.v) && (this.v <= i2 * 5) && (this.x != null) && (this.x.size() > 4))
                      {
                        com.android.dazhihui.d.r.a(((HotVideoPushStockVo)this.x.get(4)).getClickUrl(), b.a().f(), null, null);
                        if (this.L == lf.b) {
                          n.a(((HotVideoPushStockVo)this.x.get(4)).getOwnerName(), 20259);
                        }
                        for (;;)
                        {
                          this.c = true;
                          break;
                          n.a(((HotVideoPushStockVo)this.x.get(4)).getOwnerName(), 20260);
                        }
                      }
                    }
                  }
                }
              }
              this.r.setTopDrawable(this.d.getResources().getDrawable(2130838080));
            }
            else
            {
              paramMotionEvent = this.D;
              paramMotionEvent.computeCurrentVelocity(1000);
              i2 = (int)paramMotionEvent.getXVelocity();
              if (this.h > this.k) {
                if (!this.m)
                {
                  if (i2 >= -a) {
                    break label2224;
                  }
                  scrollTo(0, getScrollY());
                  if (!this.M) {
                    this.J.notifyDataSetChanged();
                  }
                  this.M = true;
                  this.m = true;
                  this.n = false;
                  if (this.A != null) {
                    this.A.getHolder().g(2);
                  }
                }
              }
              for (;;)
              {
                if (!this.m) {
                  break label2638;
                }
                d();
                this.J.setHotData(this.x);
                this.r.setTopDrawable(this.d.getResources().getDrawable(2130838080));
                break;
                label2224:
                if (Math.abs(this.k - this.h) > (this.f - this.q) / 2)
                {
                  a(getScrollX(), 0 - getScrollX(), this.p);
                  if (!this.M) {
                    this.J.notifyDataSetChanged();
                  }
                  this.M = true;
                  this.m = true;
                  this.n = false;
                  if (this.A != null) {
                    this.A.getHolder().g(2);
                  }
                }
                else
                {
                  a(getScrollX(), this.q - this.f - getScrollX(), this.p);
                  this.m = false;
                  this.n = false;
                  continue;
                  if (!this.m)
                  {
                    if (!this.n)
                    {
                      if (Math.abs(this.k - this.h) > this.q / 2)
                      {
                        if (i2 > a) {
                          scrollTo(-(this.f - i1), getScrollY());
                        }
                        for (;;)
                        {
                          this.n = true;
                          break;
                          a(getScrollX(), -(this.f - i1) - getScrollX(), this.p);
                        }
                      }
                      if (i2 > a) {
                        scrollTo(this.q - this.f, getScrollY());
                      }
                      for (;;)
                      {
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
                      scrollTo(-this.f + this.q, getScrollY());
                      this.m = false;
                    }
                    else if (Math.abs(this.k - this.h) > (this.f - this.q) / 2)
                    {
                      a(getScrollX(), -this.f + this.q - getScrollX(), this.p);
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
              label2638:
              if (this.x.size() > 1) {
                e();
              }
              if (this.n) {
                this.r.setTopDrawable(this.d.getResources().getDrawable(2130838079));
              } else {
                this.r.setTopDrawable(this.d.getResources().getDrawable(2130838080));
              }
            }
          }
        }
      }
    }
  }
  
  public void setHolder(StockChartContainer paramStockChartContainer)
  {
    this.A = paramStockChartContainer;
  }
  
  public void setHotvideoData(ArrayList<HotVideoPushStockVo> paramArrayList)
  {
    this.M = false;
    this.x = paramArrayList;
    d();
    e();
  }
  
  public void setType(lf paramlf)
  {
    this.L = paramlf;
    this.f = getWidth();
    if (this.f == 0) {
      this.f = g.a().m();
    }
    if (this.L == lf.b)
    {
      this.r.setText("视吧");
      this.r.postInvalidate();
      this.K = ((this.f - getResources().getDimensionPixelOffset(2131230814)) / 3);
    }
    for (this.q = ((this.f - getResources().getDimensionPixelOffset(2131230814)) / 6 + getResources().getDimensionPixelOffset(2131230814));; this.q = ((this.f - this.y.getMinimumWidth()) / this.t.getNumColumns() + this.y.getMinimumWidth()))
    {
      this.u = (this.f - this.q);
      b();
      return;
    }
  }
  
  public void setmHotViewFlow(GridView paramGridView)
  {
    this.t = paramGridView;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\StockChartViewflow.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */