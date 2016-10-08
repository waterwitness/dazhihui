package com.e.a.a;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

class g
  extends HttpEntityWrapper
{
  InputStream a;
  PushbackInputStream b;
  GZIPInputStream c;
  
  public g(HttpEntity paramHttpEntity)
  {
    super(paramHttpEntity);
  }
  
  public void consumeContent()
  {
    b.a(this.a);
    b.a(this.b);
    b.a(this.c);
    super.consumeContent();
  }
  
  public InputStream getContent()
  {
    this.a = this.wrappedEntity.getContent();
    this.b = new PushbackInputStream(this.a, 2);
    if (b.a(this.b))
    {
      this.c = new GZIPInputStream(this.b);
      return this.c;
    }
    return this.b;
  }
  
  public long getContentLength()
  {
    if (this.wrappedEntity == null) {
      return 0L;
    }
    return this.wrappedEntity.getContentLength();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */