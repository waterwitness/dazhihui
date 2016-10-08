package com.android.thinkive.framework.cache;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

class StrictLineReader$1
  extends ByteArrayOutputStream
{
  StrictLineReader$1(StrictLineReader paramStrictLineReader, int paramInt)
  {
    super(paramInt);
  }
  
  public String toString()
  {
    if ((this.count > 0) && (this.buf[(this.count - 1)] == 13)) {}
    for (int i = this.count - 1;; i = this.count) {
      try
      {
        String str = new String(this.buf, 0, i, StrictLineReader.access$0(this.this$0).name());
        return str;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        throw new AssertionError(localUnsupportedEncodingException);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\cache\StrictLineReader$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */