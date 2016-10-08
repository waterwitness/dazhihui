package com.squareup.okhttp.internal.spdy;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

final class Http20Draft06
  implements Variant
{
  private static final byte[] CONNECTION_HEADER;
  static final int FLAG_END_FLOW_CONTROL = 1;
  static final int FLAG_END_HEADERS = 4;
  static final int FLAG_END_STREAM = 1;
  static final int FLAG_PONG = 1;
  static final int FLAG_PRIORITY = 8;
  static final int TYPE_CONTINUATION = 10;
  static final int TYPE_DATA = 0;
  static final int TYPE_GOAWAY = 7;
  static final int TYPE_HEADERS = 1;
  static final int TYPE_PING = 6;
  static final int TYPE_PRIORITY = 2;
  static final int TYPE_PUSH_PROMISE = 5;
  static final int TYPE_RST_STREAM = 3;
  static final int TYPE_SETTINGS = 4;
  static final int TYPE_WINDOW_UPDATE = 9;
  
  static
  {
    try
    {
      CONNECTION_HEADER = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n".getBytes("UTF-8");
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError();
    }
  }
  
  public FrameReader newReader(InputStream paramInputStream, boolean paramBoolean)
  {
    return new Http20Draft06.Reader(paramInputStream, paramBoolean);
  }
  
  public FrameWriter newWriter(OutputStream paramOutputStream, boolean paramBoolean)
  {
    return new Http20Draft06.Writer(paramOutputStream, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\Http20Draft06.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */