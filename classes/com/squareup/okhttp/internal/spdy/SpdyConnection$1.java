package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.NamedRunnable;
import java.io.IOException;

class SpdyConnection$1
  extends NamedRunnable
{
  SpdyConnection$1(SpdyConnection paramSpdyConnection, String paramString, Object[] paramArrayOfObject, int paramInt, ErrorCode paramVarArgs)
  {
    super(paramString, paramArrayOfObject);
  }
  
  public void execute()
  {
    try
    {
      this.this$0.writeSynReset(this.val$streamId, this.val$errorCode);
      return;
    }
    catch (IOException localIOException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\SpdyConnection$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */