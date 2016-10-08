package com.squareup.okhttp.internal.spdy;

import java.io.OutputStream;
import java.util.List;

class Hpack$Writer
{
  private final OutputStream out;
  
  Hpack$Writer(OutputStream paramOutputStream)
  {
    this.out = paramOutputStream;
  }
  
  public void writeHeaders(List<String> paramList)
  {
    int j = paramList.size();
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return;
      }
      this.out.write(96);
      writeString((String)paramList.get(i));
      writeString((String)paramList.get(i + 1));
      i += 2;
    }
  }
  
  public void writeInt(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 < paramInt2)
    {
      this.out.write(paramInt3 | paramInt1);
      return;
    }
    this.out.write(paramInt3 | paramInt2);
    paramInt1 -= paramInt2;
    for (;;)
    {
      if (paramInt1 < 128)
      {
        this.out.write(paramInt1);
        return;
      }
      this.out.write(paramInt1 & 0x7F | 0x80);
      paramInt1 >>>= 7;
    }
  }
  
  public void writeString(String paramString)
  {
    paramString = paramString.getBytes("UTF-8");
    writeInt(paramString.length, 255, 0);
    this.out.write(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\Hpack$Writer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */