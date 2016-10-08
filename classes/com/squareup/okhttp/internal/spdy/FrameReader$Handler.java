package com.squareup.okhttp.internal.spdy;

import java.io.InputStream;
import java.util.List;

public abstract interface FrameReader$Handler
{
  public abstract void data(boolean paramBoolean, int paramInt1, InputStream paramInputStream, int paramInt2);
  
  public abstract void goAway(int paramInt, ErrorCode paramErrorCode);
  
  public abstract void headers(boolean paramBoolean1, boolean paramBoolean2, int paramInt1, int paramInt2, int paramInt3, List<String> paramList, HeadersMode paramHeadersMode);
  
  public abstract void noop();
  
  public abstract void ping(boolean paramBoolean, int paramInt1, int paramInt2);
  
  public abstract void priority(int paramInt1, int paramInt2);
  
  public abstract void rstStream(int paramInt, ErrorCode paramErrorCode);
  
  public abstract void settings(boolean paramBoolean, Settings paramSettings);
  
  public abstract void windowUpdate(int paramInt1, int paramInt2, boolean paramBoolean);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\FrameReader$Handler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */