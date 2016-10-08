package com.g.a.a.a.a.a;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class j
  extends ByteArrayOutputStream
{
  j(i parami, int paramInt)
  {
    super(paramInt);
  }
  
  public String toString()
  {
    if ((this.count > 0) && (this.buf[(this.count - 1)] == 13)) {}
    for (int i = this.count - 1;; i = this.count) {
      try
      {
        String str = new String(this.buf, 0, i, i.a(this.a).name());
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new AssertionError(localUnsupportedEncodingException);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\a\a\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */