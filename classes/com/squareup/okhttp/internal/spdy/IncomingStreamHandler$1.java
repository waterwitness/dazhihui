package com.squareup.okhttp.internal.spdy;

class IncomingStreamHandler$1
  implements IncomingStreamHandler
{
  public void receive(SpdyStream paramSpdyStream)
  {
    paramSpdyStream.close(ErrorCode.REFUSED_STREAM);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\IncomingStreamHandler$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */