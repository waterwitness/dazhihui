package com.android.dazhihui.richscan.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import com.android.dazhihui.richscan.b;
import com.android.dazhihui.richscan.g;
import com.c.b.n;
import java.util.Collection;
import java.util.HashSet;

public final class ViewfinderView
  extends View
{
  private static final int[] a = { 0, 64, 128, 192, 255, 192, 128, 64 };
  private static float f;
  private int b;
  private int c;
  private int d;
  private int e;
  private final Paint g;
  private Bitmap h;
  private final int i;
  private final int j;
  private final int k;
  private final int l;
  private final int m;
  private int n;
  private Collection<n> o;
  private Rect p;
  private int q;
  private int r;
  private boolean s;
  private Bitmap t;
  private Bitmap u;
  private int v;
  private int w;
  
  public ViewfinderView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    f = paramContext.getResources().getDisplayMetrics().density;
    this.b = ((int)(25.0F * f));
    this.g = new Paint();
    paramContext = getResources();
    this.i = paramContext.getColor(b.viewfinder_mask);
    this.j = paramContext.getColor(b.backgroud);
    this.k = paramContext.getColor(b.viewfinder_frame);
    this.l = paramContext.getColor(b.viewfinder_laser);
    this.m = paramContext.getColor(b.possible_result_points);
    this.n = 0;
    this.o = new HashSet(5);
    this.t = BitmapFactory.decodeResource(getResources(), com.android.dazhihui.richscan.c.qrcode_scan_line);
    this.c = ((int)(f * 3.0F));
    this.e = ((int)(2.0F * f));
    this.d = ((int)(f * 3.0F));
  }
  
  private void a(Canvas paramCanvas)
  {
    Paint localPaint = this.g;
    if (this.h != null) {}
    for (int i1 = this.j;; i1 = this.i)
    {
      localPaint.setColor(i1);
      paramCanvas.drawRect(0.0F, 0.0F, this.v, this.p.top, this.g);
      paramCanvas.drawRect(0.0F, this.p.top, this.p.left, this.p.bottom, this.g);
      paramCanvas.drawRect(this.p.right, this.p.top, this.v, this.p.bottom, this.g);
      paramCanvas.drawRect(0.0F, this.p.bottom, this.v, this.w, this.g);
      if (this.h == null)
      {
        this.g.setColor(this.k);
        paramCanvas.drawRect(this.p.left, this.p.top, this.p.left + this.b, this.p.top + this.c, this.g);
        paramCanvas.drawRect(this.p.left, this.p.top, this.p.left + this.c, this.p.top + this.b, this.g);
        paramCanvas.drawRect(this.p.left, this.p.bottom - this.b, this.p.left + this.c, this.p.bottom, this.g);
        paramCanvas.drawRect(this.p.left, this.p.bottom - this.c, this.p.left + this.b, this.p.bottom, this.g);
        paramCanvas.drawRect(this.p.right - this.b, this.p.top, this.p.right, this.p.top + this.c, this.g);
        paramCanvas.drawRect(this.p.right - this.c, this.p.top, this.p.right, this.p.top + this.b, this.g);
        paramCanvas.drawRect(this.p.right - this.c, this.p.bottom - this.b, this.p.right, this.p.bottom, this.g);
        paramCanvas.drawRect(this.p.right - this.b, this.p.bottom - this.c, this.p.right, this.p.bottom, this.g);
        this.g.setColor(-6184800);
        this.g.setTextSize(16.0F * f);
        this.g.setAlpha(255);
        this.g.setTextAlign(Paint.Align.CENTER);
        paramCanvas.drawText(getResources().getString(g.richscan_msg_default_status), (this.p.left + this.p.right) / 2, this.p.bottom + 40.0F * f, this.g);
      }
      return;
    }
  }
  
  public void a()
  {
    this.h = null;
    this.u = null;
    invalidate();
  }
  
  public void a(Bitmap paramBitmap)
  {
    this.h = paramBitmap;
    invalidate();
  }
  
  public void a(n paramn)
  {
    this.o.add(paramn);
  }
  
  protected void onDetachedFromWindow()
  {
    if ((this.t != null) && (!this.t.isRecycled()))
    {
      this.t.recycle();
      this.t = null;
    }
    if ((this.h != null) && (!this.h.isRecycled()))
    {
      this.h.recycle();
      this.h = null;
    }
    if ((this.u != null) && (!this.u.isRecycled()))
    {
      this.u.recycle();
      this.u = null;
    }
    super.onDetachedFromWindow();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    paramCanvas.save();
    if (this.p == null) {
      this.p = com.android.dazhihui.richscan.a.c.a().f();
    }
    if (this.p == null)
    {
      paramCanvas.restore();
      return;
    }
    if (!this.s)
    {
      this.s = true;
      this.q = (this.p.top + this.c);
      this.r = (this.p.bottom - this.c);
    }
    a(paramCanvas);
    if (this.h != null)
    {
      this.g.setAlpha(255);
      paramCanvas.drawBitmap(this.h, this.p.left, this.p.top, this.g);
    }
    for (;;)
    {
      paramCanvas.restore();
      return;
      this.q += this.e;
      if (this.q >= this.r) {
        this.q = (this.p.top + this.c);
      }
      if (this.t != null)
      {
        Rect localRect = new Rect();
        localRect.left = (this.p.left + 6);
        localRect.right = (this.p.right - 6);
        localRect.top = this.q;
        localRect.bottom = (this.q + this.d);
        paramCanvas.drawBitmap(this.t, null, localRect, this.g);
      }
      postInvalidateDelayed(30L, this.p.left, this.p.top, this.p.right, this.p.bottom);
    }
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.v = paramInt1;
    this.w = paramInt2;
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\view\ViewfinderView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */