package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.InputStream;

class NameValueBlockReader$1
  extends InputStream
{
  NameValueBlockReader$1(NameValueBlockReader paramNameValueBlockReader, InputStream paramInputStream) {}
  
  public void close()
  {
    this.val$in.close();
  }
  
  public int read()
  {
    return Util.readSingleByte(this);
  }
  
  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt2 = Math.min(paramInt2, NameValueBlockReader.access$0(this.this$0));
    paramInt1 = this.val$in.read(paramArrayOfByte, paramInt1, paramInt2);
    paramArrayOfByte = this.this$0;
    NameValueBlockReader.access$1(paramArrayOfByte, NameValueBlockReader.access$0(paramArrayOfByte) - paramInt1);
    return paramInt1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\NameValueBlockReader$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */