package com.squareup.okhttp.internal.spdy;

import java.io.InputStream;
import java.io.OutputStream;

abstract interface Variant
{
  public static final Variant HTTP_20_DRAFT_06 = new Http20Draft06();
  public static final Variant SPDY3 = new Spdy3();
  
  public abstract FrameReader newReader(InputStream paramInputStream, boolean paramBoolean);
  
  public abstract FrameWriter newWriter(OutputStream paramOutputStream, boolean paramBoolean);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\Variant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */