package com.e.a.a;

import java.io.File;
import org.apache.http.client.methods.HttpUriRequest;

public abstract class w
  extends q
{
  private long c;
  private boolean d;
  
  public void a(HttpUriRequest paramHttpUriRequest)
  {
    if ((this.a.exists()) && (this.a.canWrite())) {
      this.c = this.a.length();
    }
    if (this.c > 0L)
    {
      this.d = true;
      paramHttpUriRequest.setHeader("Range", "bytes=" + this.c + "-");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\e\a\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */