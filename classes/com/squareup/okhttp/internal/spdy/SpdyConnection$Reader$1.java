package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

class SpdyConnection$Reader$1
  extends NamedRunnable
{
  SpdyConnection$Reader$1(SpdyConnection.Reader paramReader, String paramString, Object[] paramArrayOfObject, SpdyStream paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    try
    {
      SpdyConnection.access$11(SpdyConnection.Reader.access$1(this.this$1)).receive(this.val$newStream);
      return;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\SpdyConnection$Reader$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */