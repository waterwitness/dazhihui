package com.joanzapata.pdfview;

import android.graphics.Paint;
import android.net.Uri;
import com.joanzapata.pdfview.b.a;
import com.joanzapata.pdfview.b.b;
import com.joanzapata.pdfview.b.c;

public class k
{
  private final Uri b;
  private int[] c = null;
  private boolean d = true;
  private boolean e = true;
  private a f;
  private b g;
  private c h;
  private int i = 1;
  private boolean j = false;
  private boolean k = false;
  private int l = -16777216;
  private int m = 20;
  
  private k(PDFView paramPDFView, Uri paramUri)
  {
    this.b = paramUri;
  }
  
  public k a(int paramInt)
  {
    this.i = paramInt;
    return this;
  }
  
  public k a(b paramb)
  {
    this.g = paramb;
    return this;
  }
  
  public k a(c paramc)
  {
    this.h = paramc;
    return this;
  }
  
  public k a(boolean paramBoolean)
  {
    this.d = paramBoolean;
    return this;
  }
  
  public void a()
  {
    this.a.a();
    PDFView.a(this.a, this.f);
    PDFView.a(this.a, this.h);
    this.a.a(this.d);
    this.a.b(this.e);
    PDFView.a(this.a, this.i);
    PDFView.a(this.a, this.j);
    this.a.setSwipeVertical(this.k);
    PDFView.c(this.a).c(this.k);
    PDFView.a(this.a, new Paint());
    PDFView.d(this.a).setColor(this.l);
    PDFView.d(this.a).setAlpha(this.m);
    if (this.c != null)
    {
      PDFView.a(this.a, this.b, this.g, this.c);
      return;
    }
    PDFView.a(this.a, this.b, this.g);
  }
  
  public k b(boolean paramBoolean)
  {
    this.j = paramBoolean;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */