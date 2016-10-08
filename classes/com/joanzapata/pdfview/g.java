package com.joanzapata.pdfview;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import org.vudroid.a.b;

class g
  extends AsyncTask<Void, Void, Void>
{
  private org.vudroid.a.a a;
  private boolean b = false;
  private Uri c;
  private PDFView d;
  
  public g(Uri paramUri, PDFView paramPDFView)
  {
    this.d = paramPDFView;
    this.c = paramUri;
  }
  
  protected Void a(Void... paramVarArgs)
  {
    this.a = new b(new org.vudroid.pdfdroid.codec.a());
    this.a.a(this.d.getContext().getContentResolver());
    this.a.a(this.c);
    return null;
  }
  
  protected void a(Void paramVoid)
  {
    if (!this.b) {
      this.d.a(this.a);
    }
  }
  
  protected void onCancelled()
  {
    this.b = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\joanzapata\pdfview\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */