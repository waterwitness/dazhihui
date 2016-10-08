package com.e.a.a;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.message.BasicHeader;

class af
  implements HttpEntity
{
  private static final byte[] a = "\r\n".getBytes();
  private static final byte[] b = "Content-Transfer-Encoding: binary\r\n".getBytes();
  private static final char[] c = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
  private final String d;
  private final byte[] e;
  private final byte[] f;
  private boolean g;
  private final List<ag> h = new ArrayList();
  private final ByteArrayOutputStream i = new ByteArrayOutputStream();
  private final ac j;
  private int k;
  private int l;
  
  public af(ac paramac)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Random localRandom = new Random();
    int m = 0;
    for (;;)
    {
      if (m >= 30)
      {
        this.d = localStringBuilder.toString();
        this.e = ("--" + this.d + "\r\n").getBytes();
        this.f = ("--" + this.d + "--" + "\r\n").getBytes();
        this.j = paramac;
        return;
      }
      localStringBuilder.append(c[localRandom.nextInt(c.length)]);
      m += 1;
    }
  }
  
  private String a(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "application/octet-stream";
    }
    return str;
  }
  
  private void a(int paramInt)
  {
    this.k += paramInt;
    this.j.sendProgressMessage(this.k, this.l);
  }
  
  private byte[] a(String paramString1, String paramString2)
  {
    return ("Content-Disposition: form-data; name=\"" + paramString1 + "\"" + "; filename=\"" + paramString2 + "\"" + "\r\n").getBytes();
  }
  
  private byte[] b(String paramString)
  {
    return ("Content-Type: " + a(paramString) + "\r\n").getBytes();
  }
  
  private byte[] c(String paramString)
  {
    return ("Content-Disposition: form-data; name=\"" + paramString + "\"" + "\r\n").getBytes();
  }
  
  public void a(String paramString1, File paramFile, String paramString2, String paramString3)
  {
    this.h.add(new ag(this, paramString1, paramFile, a(paramString2), paramString3));
  }
  
  public void a(String paramString1, String paramString2, InputStream paramInputStream, String paramString3)
  {
    this.i.write(this.e);
    this.i.write(a(paramString1, paramString2));
    this.i.write(b(paramString3));
    this.i.write(b);
    this.i.write(a);
    paramString1 = new byte['က'];
    for (;;)
    {
      int m = paramInputStream.read(paramString1);
      if (m == -1)
      {
        this.i.write(a);
        this.i.flush();
        b.a(this.i);
        return;
      }
      this.i.write(paramString1, 0, m);
    }
  }
  
  public void a(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      this.i.write(this.e);
      this.i.write(c(paramString1));
      this.i.write(b(paramString3));
      this.i.write(a);
      this.i.write(paramString2.getBytes());
      this.i.write(a);
      return;
    }
    catch (IOException paramString1)
    {
      Log.e("SimpleMultipartEntity", "addPart ByteArrayOutputStream exception", paramString1);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void b(String paramString1, String paramString2, String paramString3)
  {
    String str = paramString3;
    if (paramString3 == null) {
      str = "UTF-8";
    }
    a(paramString1, paramString2, "text/plain; charset=" + str);
  }
  
  public void consumeContent()
  {
    if (isStreaming()) {
      throw new UnsupportedOperationException("Streaming entity does not implement #consumeContent()");
    }
  }
  
  public InputStream getContent()
  {
    throw new UnsupportedOperationException("getContent() is not supported. Use writeTo() instead.");
  }
  
  public Header getContentEncoding()
  {
    return null;
  }
  
  public long getContentLength()
  {
    long l1 = this.i.size();
    Iterator localIterator = this.h.iterator();
    for (;;)
    {
      if (!localIterator.hasNext()) {
        return this.f.length + l1;
      }
      long l2 = ((ag)localIterator.next()).a();
      if (l2 < 0L) {
        return -1L;
      }
      l1 = l2 + l1;
    }
  }
  
  public Header getContentType()
  {
    return new BasicHeader("Content-Type", "multipart/form-data; boundary=" + this.d);
  }
  
  public boolean isChunked()
  {
    return false;
  }
  
  public boolean isRepeatable()
  {
    return this.g;
  }
  
  public boolean isStreaming()
  {
    return false;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    this.k = 0;
    this.l = ((int)getContentLength());
    this.i.writeTo(paramOutputStream);
    a(this.i.size());
    Iterator localIterator = this.h.iterator();
    for (;;)
    {
      if (!localIterator.hasNext())
      {
        paramOutputStream.write(this.f);
        a(this.f.length);
        return;
      }
      ((ag)localIterator.next()).a(paramOutputStream);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */