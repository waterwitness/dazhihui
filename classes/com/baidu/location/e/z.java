package com.baidu.location.e;

import com.baidu.location.b.f;
import com.baidu.location.b.l;
import com.baidu.location.b.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;

class z
  extends n
{
  boolean a = false;
  int k = 0;
  int l = 0;
  private ArrayList n = null;
  
  public z(y paramy)
  {
    this.f = new ArrayList();
  }
  
  public void a()
  {
    this.c = l.b();
    this.d = 2;
    if (this.n != null)
    {
      int i = 0;
      if (i < this.n.size())
      {
        if (this.k == 1) {
          this.f.add(new BasicNameValuePair("cldc[" + i + "]", (String)this.n.get(i)));
        }
        for (;;)
        {
          i += 1;
          break;
          this.f.add(new BasicNameValuePair("cltr[" + i + "]", (String)this.n.get(i)));
        }
      }
      String str = String.format(Locale.CHINA, "%d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
      this.f.add(new BasicNameValuePair("trtm", str));
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if ((paramBoolean) && (this.e != null) && (this.n != null)) {
      this.n.clear();
    }
    if (this.f != null) {
      this.f.clear();
    }
    this.a = false;
  }
  
  public void b()
  {
    if (this.a) {
      return;
    }
    if ((j > 4) && (this.l < j))
    {
      this.l += 1;
      return;
    }
    this.l = 0;
    this.a = true;
    this.k = 0;
    int i;
    if ((this.n == null) || (this.n.size() < 1))
    {
      if (this.n == null) {
        this.n = new ArrayList();
      }
      this.k = 0;
      i = 0;
      if (this.k >= 2) {
        break label207;
      }
    }
    Object localObject;
    label174:
    label202:
    label207:
    for (String str = y.b();; localObject = null)
    {
      if ((str == null) && (this.k != 1)) {
        this.k = 2;
      }
      for (;;)
      {
        try
        {
          str = s.b();
          if (str != null) {
            break label174;
          }
          if ((this.n != null) && (this.n.size() >= 1)) {
            break label202;
          }
          this.n = null;
          this.a = false;
          return;
        }
        catch (Exception localException)
        {
          localObject = null;
          continue;
        }
        this.k = 1;
        continue;
        this.n.add(localObject);
        int j = i + ((String)localObject).length();
        i = j;
        if (j < f.i) {
          break;
        }
      }
      f();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */