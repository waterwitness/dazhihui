package com.handmark.pulltorefresh.library;

import android.annotation.TargetApi;
import android.util.Log;
import android.view.View;

@TargetApi(9)
public final class c
{
  public static void a(PullToRefreshBase<?> paramPullToRefreshBase, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat, boolean paramBoolean)
  {
    int i;
    int k;
    int j;
    j localj;
    switch (d.a[paramPullToRefreshBase.getPullToRefreshScrollDirection().ordinal()])
    {
    default: 
      i = paramPullToRefreshBase.getScrollY();
      k = paramInt3;
      j = paramInt4;
      if ((paramPullToRefreshBase.i()) && (!paramPullToRefreshBase.j()))
      {
        localj = paramPullToRefreshBase.getMode();
        if ((!localj.b()) || (paramBoolean) || (k == 0)) {
          break label316;
        }
        j += k;
        Log.d("OverscrollHelper", "OverScroll. DeltaX: " + paramInt1 + ", ScrollX: " + paramInt2 + ", DeltaY: " + paramInt3 + ", ScrollY: " + paramInt4 + ", NewY: " + j + ", ScrollRange: " + paramInt5 + ", CurrentScroll: " + i);
        if (j >= 0 - paramInt6) {
          break label231;
        }
        if (localj.c())
        {
          if (i == 0) {
            paramPullToRefreshBase.a(r.f, new boolean[0]);
          }
          paramPullToRefreshBase.setHeaderScroll((int)((j + i) * paramFloat));
        }
      }
      break;
    }
    label231:
    label282:
    label316:
    while ((!paramBoolean) || (r.f != paramPullToRefreshBase.getState()))
    {
      do
      {
        do
        {
          return;
          i = paramPullToRefreshBase.getScrollX();
          k = paramInt1;
          j = paramInt2;
          break;
          if (j <= paramInt5 + paramInt6) {
            break label282;
          }
        } while (!localj.d());
        if (i == 0) {
          paramPullToRefreshBase.a(r.f, new boolean[0]);
        }
        paramPullToRefreshBase.setHeaderScroll((int)((j + i - paramInt5) * paramFloat));
        return;
      } while ((Math.abs(j) > paramInt6) && (Math.abs(j - paramInt5) > paramInt6));
      paramPullToRefreshBase.a(r.a, new boolean[0]);
      return;
    }
    paramPullToRefreshBase.a(r.a, new boolean[0]);
  }
  
  public static void a(PullToRefreshBase<?> paramPullToRefreshBase, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    a(paramPullToRefreshBase, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, 1.0F, paramBoolean);
  }
  
  public static void a(PullToRefreshBase<?> paramPullToRefreshBase, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    a(paramPullToRefreshBase, paramInt1, paramInt2, paramInt3, paramInt4, 0, paramBoolean);
  }
  
  static boolean a(View paramView)
  {
    return paramView.getOverScrollMode() != 2;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */