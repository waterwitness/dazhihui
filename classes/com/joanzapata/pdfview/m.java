package com.joanzapata.pdfview;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;
import org.vudroid.a.a.c;

class m
  extends AsyncTask<Void, com.joanzapata.pdfview.c.a, Void>
{
  private org.vudroid.a.a a;
  private List<n> b;
  private PDFView c;
  
  public m(PDFView paramPDFView)
  {
    this.c = paramPDFView;
    this.b = new ArrayList();
  }
  
  private com.joanzapata.pdfview.c.a a(n paramn)
  {
    this.a = this.c.getDecodeService();
    c localc = this.a.c(paramn.d);
    Bitmap localBitmap = null;
    Class localClass = this.a.getClass();
    if (localc != null) {}
    try
    {
      localBitmap = localc.a(Math.round(paramn.a), Math.round(paramn.b), paramn.c);
      return new com.joanzapata.pdfview.c.a(paramn.e, paramn.d, localBitmap, paramn.a, paramn.b, paramn.c, paramn.f, paramn.g);
    }
    finally {}
  }
  
  private boolean c()
  {
    try
    {
      synchronized (this.b)
      {
        this.b.wait();
        return true;
      }
      return false;
    }
    catch (InterruptedException localInterruptedException) {}
  }
  
  protected Void a(Void... paramVarArgs)
  {
    do
    {
      if (isCancelled()) {
        break;
      }
      while (!this.b.isEmpty())
      {
        paramVarArgs = (n)this.b.get(0);
        com.joanzapata.pdfview.c.a locala = a(paramVarArgs);
        if (this.b.remove(paramVarArgs)) {
          publishProgress(new com.joanzapata.pdfview.c.a[] { locala });
        } else {
          locala.d().recycle();
        }
      }
    } while ((c()) && (!isCancelled()));
    return null;
  }
  
  public void a()
  {
    this.b.clear();
  }
  
  public void a(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, RectF paramRectF, boolean paramBoolean, int paramInt3)
  {
    paramRectF = new n(this, paramFloat1, paramFloat2, paramRectF, paramInt1, paramInt2, paramBoolean, paramInt3);
    this.b.add(paramRectF);
    b();
  }
  
  protected void a(com.joanzapata.pdfview.c.a... paramVarArgs)
  {
    this.c.a(paramVarArgs[0]);
  }
  
  public void b()
  {
    synchronized (this.b)
    {
      this.b.notify();
      return;
    }
  }
  
  protected void onPreExecute() {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */