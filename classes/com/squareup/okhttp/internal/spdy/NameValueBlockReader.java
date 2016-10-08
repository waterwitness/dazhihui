package com.squareup.okhttp.internal.spdy;

import com.squareup.okhttp.internal.Util;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

class NameValueBlockReader
  implements Closeable
{
  private int compressedLimit;
  private final NameValueBlockReader.FillableInflaterInputStream fillableInflaterInputStream = new NameValueBlockReader.FillableInflaterInputStream(new NameValueBlockReader.1(this, paramInputStream), new NameValueBlockReader.2(this));
  private final DataInputStream nameValueBlockIn = new DataInputStream(this.fillableInflaterInputStream);
  
  NameValueBlockReader(InputStream paramInputStream) {}
  
  private void doneReading()
  {
    if (this.compressedLimit == 0) {}
    do
    {
      return;
      this.fillableInflaterInputStream.fill();
    } while (this.compressedLimit == 0);
    throw new IOException("compressedLimit > 0: " + this.compressedLimit);
  }
  
  private String readString()
  {
    int i = this.nameValueBlockIn.readInt();
    byte[] arrayOfByte = new byte[i];
    Util.readFully(this.nameValueBlockIn, arrayOfByte);
    return new String(arrayOfByte, 0, i, "UTF-8");
  }
  
  public void close()
  {
    this.nameValueBlockIn.close();
  }
  
  public List<String> readNameValueBlock(int paramInt)
  {
    this.compressedLimit += paramInt;
    int i;
    try
    {
      i = this.nameValueBlockIn.readInt();
      if (i < 0) {
        throw new IOException("numberOfPairs < 0: " + i);
      }
    }
    catch (DataFormatException localDataFormatException)
    {
      throw new IOException(localDataFormatException.getMessage());
    }
    if (i > 1024) {
      throw new IOException("numberOfPairs > 1024: " + i);
    }
    ArrayList localArrayList = new ArrayList(i * 2);
    paramInt = 0;
    for (;;)
    {
      if (paramInt >= i)
      {
        doneReading();
        return localArrayList;
      }
      String str1 = readString();
      String str2 = readString();
      if (str1.length() == 0) {
        throw new IOException("name.length == 0");
      }
      localArrayList.add(str1);
      localArrayList.add(str2);
      paramInt += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\internal\spdy\NameValueBlockReader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */