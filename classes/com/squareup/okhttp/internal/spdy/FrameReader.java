package com.squareup.okhttp.internal.spdy;

import java.io.Closeable;

public abstract interface FrameReader
  extends Closeable
{
  public abstract boolean nextFrame(FrameReader.Handler paramHandler);
  
  public abstract void readConnectionHeader();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\FrameReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */