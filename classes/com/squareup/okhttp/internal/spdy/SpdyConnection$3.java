package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

class SpdyConnection$3
  extends NamedRunnable
{
  SpdyConnection$3(SpdyConnection paramSpdyConnection, String paramString, Object[] paramArrayOfObject, boolean paramBoolean, int paramInt1, int paramInt2, Ping paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    try
    {
      SpdyConnection.access$15(this.this$0, this.val$reply, this.val$payload1, this.val$payload2, this.val$ping);
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\SpdyConnection$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */