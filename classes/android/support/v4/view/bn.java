package android.support.v4.view;

import android.graphics.Paint;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class bn
{
  static final ca a = new bo();
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 23)
    {
      a = new bz();
      return;
    }
    if (i >= 21)
    {
      a = new by();
      return;
    }
    if (i >= 19)
    {
      a = new bx();
      return;
    }
    if (i >= 17)
    {
      a = new bv();
      return;
    }
    if (i >= 16)
    {
      a = new bu();
      return;
    }
    if (i >= 15)
    {
      a = new bs();
      return;
    }
    if (i >= 14)
    {
      a = new bt();
      return;
    }
    if (i >= 11)
    {
      a = new br();
      return;
    }
    if (i >= 9)
    {
      a = new bq();
      return;
    }
    if (i >= 7)
    {
      a = new bp();
      return;
    }
  }
  
  public static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a.a(paramInt1, paramInt2, paramInt3);
  }
  
  public static int a(View paramView)
  {
    return a.a(paramView);
  }
  
  public static void a(View paramView, float paramFloat)
  {
    a.a(paramView, paramFloat);
  }
  
  public static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(View paramView, int paramInt, Paint paramPaint)
  {
    a.a(paramView, paramInt, paramPaint);
  }
  
  public static void a(View paramView, Paint paramPaint)
  {
    a.a(paramView, paramPaint);
  }
  
  public static void a(View paramView, a parama)
  {
    a.a(paramView, parama);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    a.a(paramView, paramRunnable);
  }
  
  public static void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    a.a(paramView, paramRunnable, paramLong);
  }
  
  public static void a(View paramView, boolean paramBoolean)
  {
    a.a(paramView, paramBoolean);
  }
  
  public static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, paramBoolean);
  }
  
  public static boolean a(View paramView, int paramInt)
  {
    return a.a(paramView, paramInt);
  }
  
  public static void b(View paramView, float paramFloat)
  {
    a.b(paramView, paramFloat);
  }
  
  public static boolean b(View paramView)
  {
    return a.b(paramView);
  }
  
  public static boolean b(View paramView, int paramInt)
  {
    return a.b(paramView, paramInt);
  }
  
  public static void c(View paramView, float paramFloat)
  {
    a.c(paramView, paramFloat);
  }
  
  public static void c(View paramView, int paramInt)
  {
    a.c(paramView, paramInt);
  }
  
  public static boolean c(View paramView)
  {
    return a.c(paramView);
  }
  
  public static void d(View paramView)
  {
    a.d(paramView);
  }
  
  public static void d(View paramView, float paramFloat)
  {
    a.d(paramView, paramFloat);
  }
  
  public static int e(View paramView)
  {
    return a.e(paramView);
  }
  
  public static void e(View paramView, float paramFloat)
  {
    a.e(paramView, paramFloat);
  }
  
  public static float f(View paramView)
  {
    return a.f(paramView);
  }
  
  public static void f(View paramView, float paramFloat)
  {
    a.f(paramView, paramFloat);
  }
  
  public static int g(View paramView)
  {
    return a.g(paramView);
  }
  
  public static int h(View paramView)
  {
    return a.h(paramView);
  }
  
  public static ViewParent i(View paramView)
  {
    return a.i(paramView);
  }
  
  public static boolean j(View paramView)
  {
    return a.j(paramView);
  }
  
  public static int k(View paramView)
  {
    return a.k(paramView);
  }
  
  public static float l(View paramView)
  {
    return a.m(paramView);
  }
  
  public static float m(View paramView)
  {
    return a.n(paramView);
  }
  
  public static int n(View paramView)
  {
    return a.p(paramView);
  }
  
  public static int o(View paramView)
  {
    return a.q(paramView);
  }
  
  public static dr p(View paramView)
  {
    return a.r(paramView);
  }
  
  public static float q(View paramView)
  {
    return a.o(paramView);
  }
  
  public static float r(View paramView)
  {
    return a.s(paramView);
  }
  
  public static boolean s(View paramView)
  {
    return a.t(paramView);
  }
  
  public static boolean t(View paramView)
  {
    return a.l(paramView);
  }
  
  public static boolean u(View paramView)
  {
    return a.u(paramView);
  }
  
  public static void v(View paramView)
  {
    a.v(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */